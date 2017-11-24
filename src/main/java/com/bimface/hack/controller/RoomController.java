package com.bimface.hack.controller;

import com.bimface.hack.bean.Room;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by zhangh-ak on 2017/11/24.
 */
@Controller
public class RoomController {
    public static final List<Room> roomList = new ArrayList<>();
    static {
        roomList.add(new Room(1, "港珠澳大桥BIM模型", 1, ""));
        roomList.add(new Room(2, "广联达上海研发中心", 1, ""));
    }

    @GetMapping("room/list")
    public List<Room> roomList(){
        return roomList;
    }
}
