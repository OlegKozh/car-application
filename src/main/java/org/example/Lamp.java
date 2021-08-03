package org.example;

public class Lamp {

    public final static String CLEAN = "clean";
    public final static String DIRTY = "dirty";

    public final static String FRONT_LEFT = "front_left";
    public final static String FRONT_RIGHT = "front_right";

    private String condition;
    private final String position;

    public Lamp(String condition, String position) {
        this.condition = condition;
        this.position = position;
    }

    public void cleanLamp() {
        condition = CLEAN;
    }

    public String getCondition() {
        return condition;
    }

    public String getPosition() {
        return position;
    }

    public boolean isDirty() {
        return condition.equals(DIRTY);
    }
}
