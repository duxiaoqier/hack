package com.bimface.hack.bean;

/**
 * @author dup, 2017-11-23
 */
public class Up {
    private Integer x;
    private Integer y;
    private Integer z;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Up{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
