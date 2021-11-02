package com.lesson6.model;

public abstract class Animal {

    private String name;

    protected Animal(String name) {
        this.name = name;
        AnimalSingleton.getInstance().incrementAnimalCounter();
    }

    protected abstract void run(int distance);

    protected void swim(int distance) {}

    protected String getName() {
        return name;
    }

}
