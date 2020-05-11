package com.company.animals;

import com.company.food.Food;

public class Goat implements NotInsect <Food> {
    @Override
    public void makeNoise() {
        System.out.println("Goat Bleats");
    }
    @Override
    public void eat(Food food) throws Exception{
        System.out.println(this.getClass().getSimpleName() + " eats " + food.getClass().getSimpleName());
    }
}
