package com.bimface.hack.bean;

/**
 * @author dup, 2017-11-24
 */
public class User {
    private Long id;
    private String name;
    private Integer role;   //用户角色，1表示主持人，0表示观众
    private Integer roomId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", roomId=" + roomId +
                '}';
    }
}
