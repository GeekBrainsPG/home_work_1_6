package com.lesson6.model;

public class AnimalSingleton {

    private int animalCounter = 0;

    private static AnimalSingleton INSTANCE = null;

    private AnimalSingleton() {}

    public static AnimalSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AnimalSingleton();
        }

        return INSTANCE;
    }

    public int getAnimalCounter() {
        return animalCounter;
    }

    public void incrementAnimalCounter() {
        ++this.animalCounter;
    }
}
