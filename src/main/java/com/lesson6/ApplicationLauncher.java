package com.lesson6;

import com.lesson6.model.AnimalSingleton;
import com.lesson6.model.Cat;
import com.lesson6.model.Dog;

public class ApplicationLauncher {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog 1");
        Dog dog2 = new Dog("Dog 2");
        Cat cat1 = new Cat("Cat 1");
        Cat cat2 = new Cat("Cat 2");

        cat1.run(10);
        cat2.run(500);
        dog1.run(100);
        dog2.run(1000);
        dog1.swim(10);
        dog2.swim(20);

        System.out.printf("Animal counter: %d, Cat counter %d, Dog counter %d",
                AnimalSingleton.getInstance().getAnimalCounter(),
                AnimalSingleton.getInstance().getCatCounter(),
                AnimalSingleton.getInstance().getDogCounter());
    }

}
