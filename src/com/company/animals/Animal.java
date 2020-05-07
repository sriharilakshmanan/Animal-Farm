package com.company.animals;

public interface Animal <T> {
    public void makeNoise();
    public void eat(T object) throws Exception;
}
