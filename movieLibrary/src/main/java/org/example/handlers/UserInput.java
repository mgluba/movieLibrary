package org.example.handlers;

import org.example.models.Actor;

import java.util.Scanner;

public class UserInput {
    static Scanner scan = new Scanner(System.in);

    private static int getIntegerFormUser() {
        //jeśli to nie jest int !scan.hasNextInt()
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("It is not integer, try again!");
        }
        return scan.nextInt();
    }

    private static int getSelectedOptionFromUser() {
        int result = getIntegerFormUser();
        scan.nextLine();
        if (result > 0 && result < MenuOptions.values().length + 1) {
            return result;
        } else {
            System.out.println(" You selected no existing option, try again");
            return getSelectedOptionFromUser();
        }
    }
    public static MenuOptions getMenuOptionFromUser(){
        //wyciąganie wszystkich wartości
        return MenuOptions.values()[getSelectedOptionFromUser()-1];
    }

    public static Actor getActorFromUser() {
        System.out.println("Type an actor: ");
        String[] actors = scan.nextLine().split(" ");
        return new Actor(actors[0], actors[1]);
    }
}
