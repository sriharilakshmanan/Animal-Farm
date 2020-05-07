package com.company;

import com.company.animals.*;
import com.company.food.Banana;
import com.company.food.Grass;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CannibalException {
        Lion lion = new Lion();
        Monkey monkey = new Monkey();
        Goat goat = new Goat();
        GrassHopper grassHopper = new GrassHopper();
        ZombieAnimal zombieAnimal = new ZombieAnimal();

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(lion);
        animals.add(monkey);
        animals.add(goat);
        animals.add(grassHopper);
        animals.add(zombieAnimal);

        for(Animal animal:animals){
            animal.makeNoise();
        }

        //Making Food
        Grass grass = new Grass();
        Banana banana = new Banana();

        try{
            goat.eat(grass);
            goat.eat(banana);

            monkey.eat(grass);
            monkey.eat(banana);

            grassHopper.eat(grass);
            grassHopper.eat(banana);

            lion.eat(goat);
            //lion.eat(lion);

            zombieAnimal.eat(grass);
            zombieAnimal.eat(goat);
            zombieAnimal.eat(lion);
            zombieAnimal.eat(zombieAnimal);

            lion.eat(grassHopper);
//            lion.eat(grass);
//            monkey.eat(lion);
//            grassHopper.eat(lion);


        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
