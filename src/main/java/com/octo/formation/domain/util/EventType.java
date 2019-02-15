package com.octo.formation.domain.util;

public enum EventType {

    VIREMENT("virement");

    private String type;

    EventType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
