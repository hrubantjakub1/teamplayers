package com.hello;

public class Sportsman extends TeamPlayer {

    public Sportsman(String firstName, String surname, int age, String gender) {
        super(firstName, surname, age, gender);
    }

    @Override
    public void work() {
        System.out.println("i am sportsman");
    }
}
