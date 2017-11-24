package com.bimface.hack.controller;

import com.bimface.hack.bean.User;
import com.bimface.hack.holder.UserHolder;
import com.bimface.hack.service.UserService;
import com.bimface.hack.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author dup, 2017-11-22
 */
@Controller
public class UserController {
    private final static String SUCCESS = "success";
    private final static String FAILED = "failed";

//    @Autowired
//    private UserService userService;

    @PostMapping("login")
    @ResponseBody
    public String login(@RequestParam String name, HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        User newUser = new User();
        newUser.setId(IdGenerator.generateId());

        if (StringUtils.hasText(name)) {
            newUser.setName(name);
            UserHolder.userMap.put(sessionId, newUser);

            return SUCCESS;
        }
        return FAILED;
    }

    @GetMapping("user")
    @ResponseBody
    public User getUser(HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        return UserHolder.userMap.get(sessionId);
    }

    @PutMapping("user/room")
    @ResponseBody
    public String enterRoom(@RequestParam Integer roomId, HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        User user = UserHolder.userMap.get(sessionId);
        if (user == null){
            return FAILED;
        }
        boolean hasUser = UserHolder.userMap.entrySet().stream().anyMatch(p -> roomId.equals(p.getValue().getRoomId()));
        if (hasUser){
            user.setRole(0);
        } else {
            user.setRole(1);
        }
        user.setRoomId(roomId);
        return SUCCESS;
    }

    @GetMapping("user/list")
    @ResponseBody
    public List<User> getList(){
        return UserHolder.userMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }

    @PostMapping("logout")
    @ResponseBody
    public String logout(HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        UserHolder.userMap.remove(sessionId);
        return SUCCESS;
    }

    @PutMapping("user/role")
    @ResponseBody
    public String role(@RequestParam Long id, HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        User oldUser = UserHolder.userMap.get(sessionId);
        if (oldUser == null || oldUser.getRole() == null || !oldUser.getRole().equals(1)){
            return FAILED;
        }

        User newUser = getList().stream().filter(p->id.equals(p.getId())).findFirst().orElse(null);
        if (newUser == null || !oldUser.getRoomId().equals(newUser.getRoomId())){
            return FAILED;
        }

        newUser.setRole(1);
        return SUCCESS;
    }
}
