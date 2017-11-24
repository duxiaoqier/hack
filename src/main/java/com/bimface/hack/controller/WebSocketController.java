package com.bimface.hack.controller;

import com.bimface.hack.bean.camera.CameraStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

    @MessageMapping("/cameraStatus")
    public void cameraStatus(CameraStatus cameraStatus, SimpMessageHeaderAccessor headerAccessor) throws Exception {
        String sessionId = headerAccessor.getSessionAttributes().get("sessionId").toString();
        System.out.println("web socket:" + sessionId);
        messagingTemplate.convertAndSend("/topic/cameraStatus", cameraStatus);
    }
}
