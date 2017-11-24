package com.bimface.hack.bean;

/**
 * 文件详情
 *
 * Created by zhangh-ak on 2017/11/24.
 */
public class File {
    private String fileName;
    private String viewToken;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getViewToken() {
        return viewToken;
    }

    public void setViewToken(String viewToken) {
        this.viewToken = viewToken;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", viewToken='" + viewToken + '\'' +
                '}';
    }
}
