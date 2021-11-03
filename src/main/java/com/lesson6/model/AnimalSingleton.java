package com.lesson6.model;

public class AnimalSingleton {

    private int animalCounter = 0;
    private int dogCounter = 0;
    private int catCounter = 0;

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

    public int getDogCounter() {
        return dogCounter;
    }

    public int getCatCounter() {
        return catCounter;
    }

    public void incrementAnimalCounter() {
        ++this.animalCounter;
    }

    public void incrementCatCounter() {
        ++this.catCounter;
    }

    public void incrementDogCounter() {
        ++this.dogCounter;
    }

}
