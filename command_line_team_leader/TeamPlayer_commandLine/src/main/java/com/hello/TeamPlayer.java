package com.hello;

public abstract class TeamPlayer implements TeamPlayerRepIf{

    private String firstName;
    private String surname;
    private int age;
    private String gender;

    public TeamPlayer(String firstName, String surname, int age, String gender) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public TeamPlayer() {
    }

    @Override
    public String toString() {
        return "TeamPlayer{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public abstract void work();
}
