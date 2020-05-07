package com.company.animals;

public class ZombieAnimal implements Animal <Object> {
    @Override
    public void makeNoise() {
        System.out.println("Zombie lets out a horrible scream!");
    }
    @Override
    public void eat(Object object) throws Exception{
        System.out.println(this.getClass().getSimpleName() + " eats " + object.getClass().getSimpleName() );
    }
}
