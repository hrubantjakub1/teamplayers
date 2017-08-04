package com.hello;

public class Serviceman extends TeamPlayer {
    public Serviceman(String firstName, String surname, int age, String gender) {
        super(firstName, surname, age, gender);
    }

    @Override
    public void work() {
        System.out.println("i am serviceman");
    }
}
