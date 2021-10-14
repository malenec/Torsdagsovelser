package com.company;

public class Owner {

    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return name;
    }

    public void setOwnerName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
