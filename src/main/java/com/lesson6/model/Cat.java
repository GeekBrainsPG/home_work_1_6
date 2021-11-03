package com.lesson6.model;

public class Cat extends Animal {

    private static final int RUN_LIMIT = 200;

    public Cat(String name) {
        super(name);

        AnimalSingleton.getInstance().incrementCatCounter();
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.printf("%s пробежал %dм \n", this.getName(), distance);
        } else {
            System.out.printf("%s не может пробежать дистанцию в %dм \n", this.getName(), distance);
        }
    }

}
