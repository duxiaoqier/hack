package com.bimface.hack.bean.camera;

/**
 * @author dup, 2017-11-23
 */
public class CameraStatus {
    private Position position;
    private Target target;
    private Up up;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Up getUp() {
        return up;
    }

    public void setUp(Up up) {
        this.up = up;
    }

    @Override
    public String toString() {
        return "CameraStatus{" +
                "position=" + position +
                ", target=" + target +
                ", up=" + up +
                '}';
    }
}
