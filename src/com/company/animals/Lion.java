package com.company.animals;

import com.company.CannibalException;

public class Lion implements Animal <Animal> {
    @Override
    public void makeNoise() {
        System.out.println("Lion Roars");
    }
    @Override
    public void eat(Animal animal) throws CannibalException{
        if(animal instanceof Lion){
            throw new CannibalException("Cannibal Exception");
        }else{
            System.out.println(this.getClass().getSimpleName() + " eats " + animal.getClass().getSimpleName());
        }
    }
}
