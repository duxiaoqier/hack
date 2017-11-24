package com.bimface.hack.bean;

/**
 * 会议间
 *
 * Created by zhangh-ak on 2017/11/24.
 */
public class Room {
    private Integer roomId;
    private String roomName;
    private Integer status;
    private String thumbnail;

    public Room() {
    }

    public Room(Integer roomId, String roomName, Integer status, String thumbnail) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.status = status;
        this.thumbnail = thumbnail;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                ", status=" + status +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
