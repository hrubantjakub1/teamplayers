package com.hello;

import menus.Menu;

import java.util.Map;

import static com.hello.TeamPlayerRepIf.repository;

public class Application
{
    public static void main(String[] args) {

        TeamPlayer sportsman = new Sportsman("Viktorie", "Bozkova", 26, "female");
        TeamPlayer coach = new Coach("Davil", "Bruzicka", 31, "male");
        TeamPlayer serviceman = new Serviceman("Michal", "Pavlicek", 21, "male");
        repository.put("Bozkova", sportsman);
        repository.put("Bruzicka", coach);
        repository.put("Pavlicek", serviceman);
        for (Map.Entry<String, TeamPlayer> entry : repository.entrySet()) {
            System.out.println(entry.getValue());
        }
        String firstName = null; String surname = null; int age = 0;  String gender = null;
        Menu menu = new Menu();
        menu.menuBar();
        menu.choose(firstName, surname, age, gender);
    }
}
