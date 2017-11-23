package com.bimface.hack.controller;

import com.bimface.hack.bean.CameraStatus;
import com.bimface.hack.bean.Content;
import com.bimface.hack.bean.Message;
import com.bimface.hack.bean.Position;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Value("${appKey}")
    private String appKey;
    @Value("${appSecret}")
    private String appSecret;

    @MessageMapping("/cameraStatus")
    @SendTo("/topic/cameraStatus")
    public CameraStatus cameraStatus(CameraStatus cameraStatus) throws Exception {
        return cameraStatus;
    }
}
