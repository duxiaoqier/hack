package com.bimface.hack.controller;

import com.bimface.sdk.BimfaceClient;
import com.bimface.sdk.exception.BimfaceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

/**
 * @author dup, 2017-11-22
 */
@Controller
public class ViewTokenController {

    private final BimfaceClient bimfaceClient;

    @Autowired
    public ViewTokenController(BimfaceClient bimfaceClient) {
        this.bimfaceClient = bimfaceClient;
    }

    @GetMapping("token")
    @ResponseBody
    public String token(HttpServletRequest request) throws BimfaceException {
        System.out.println("get Token:"+request.getSession().getId());
        return bimfaceClient.getViewTokenByFileId(1225353415909568L);
    }
}
