package com.bimface.hack.controller;

import com.bimface.hack.bean.File;
import com.bimface.sdk.BimfaceClient;
import com.bimface.sdk.exception.BimfaceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author dup, 2017-11-22
 */
@Controller
public class FileController {
    private BimfaceClient bimfaceClient;

    @Autowired
    public FileController(BimfaceClient bimfaceClient) {
        this.bimfaceClient = bimfaceClient;
    }

    @GetMapping("file/detail")
    @ResponseBody
    public File fileDetail(@RequestParam(value = "fileId") Long fileId) throws BimfaceException {
        File file = new File();
        file.setFileName(bimfaceClient.translate(fileId).getName());
        file.setViewToken(bimfaceClient.getViewTokenByFileId(fileId));
        return file;
    }
}
