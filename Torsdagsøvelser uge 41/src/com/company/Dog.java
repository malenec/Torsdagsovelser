package com.company;

import java.util.ArrayList;

public class Dog {

    private String name;
    private boolean isHungry;
    private Owner owner;
    private ArrayList<Dog> offSpring;

    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
        offSpring = new ArrayList<>();
    }

    public String feedDog(){
        String s = "Here comes the food";
        if(isHungry == true) {
            setHungry(false);
        }
        return s;
    }

    public String getSpecificOffSpring(int index) {
        return offSpring.get(index).name;
    }

    public String getDogName() {
        return name;
    }

    public void setDogName(String name) {
        this.name = name;
    }

    public boolean getIsHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(String newDogName) {
        offSpring.add(new Dog(newDogName, true));
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return name;
    }
}
