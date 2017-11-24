package com.bimface.hack.controller;

import com.bimface.hack.bean.camera.CameraStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Value("${appKey}")
    private String appKey;
    @Value("${appSecret}")
    private String appSecret;

    @MessageMapping("/cameraStatus")
    @SendTo("/topic/cameraStatus")
    public CameraStatus cameraStatus(CameraStatus cameraStatus, SimpMessageHeaderAccessor headerAccessor) throws Exception {
        String sessionId = headerAccessor.getSessionAttributes().get("sessionId").toString();
        System.out.println(sessionId);
        return cameraStatus;
    }
}
