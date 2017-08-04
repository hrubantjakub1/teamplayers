package com.hello;

public class Coach extends TeamPlayer{

    public Coach(String firstName, String surname, int age, String gender) {
        super(firstName, surname, age, gender);
    }

    @Override
    public void work() {
        System.out.println("i am trainer");
    }
}
