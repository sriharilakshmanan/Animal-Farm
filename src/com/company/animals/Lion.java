package com.company.animals;

import com.company.CannibalException;

public class Lion implements NotInsect <NotInsect> {
    @Override
    public void makeNoise() {
        System.out.println("Lion Roars");
    }
    @Override
    public void eat(NotInsect animal) throws CannibalException{
        if(animal instanceof Lion){
            throw new CannibalException("Cannibal Exception");
        }else{
            System.out.println(this.getClass().getSimpleName() + " eats " + animal.getClass().getSimpleName());
        }
    }
}
