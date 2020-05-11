package com.company.animals;

import com.company.food.Banana;
import com.company.food.Food;
import com.company.food.Grass;

public class Monkey implements NotInsect <Food> {
    @Override
    public void makeNoise() {
        System.out.println("Monkey Whoops!");
    }
    @Override
    public void eat(Food food) throws Exception {
        if(food instanceof Grass){
            System.out.println(this.getClass().getSimpleName() + " goes hungry! " );
        }
        else if(food instanceof Banana){
            System.out.println(this.getClass().getSimpleName() + " climbs up a tree and eats " + food.getClass().getSimpleName() );
        }
    }
}
