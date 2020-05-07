package com.company.animals;

import com.company.food.Food;

public class GrassHopper implements Insect {
    @Override
    public void makeNoise() {
        System.out.println("GrassHopper Chirps");
    }
    @Override
    public void eat(Food food) throws Exception {
        System.out.println(this.getClass().getSimpleName() + " eats " + food.getClass().getSimpleName() );
    }
}
