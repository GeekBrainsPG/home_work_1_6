package com.lesson6.model;

public class Dog extends Animal {

    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;

    public Dog(String name) {
        super(name);

        AnimalSingleton.getInstance().incrementDogCounter();
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.printf("%s пробежал %dм \n", this.getName(), distance);
        } else {
            System.out.printf("%s не может пробежать дистанцию в %dм \n", this.getName(), distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIM_LIMIT) {
            System.out.printf("%s проплыл %dм \n", this.getName(), distance);
        } else {
            System.out.printf("%s не может проплыть дистанцию в %dм \n", this.getName(), distance);
        }
    }
}
