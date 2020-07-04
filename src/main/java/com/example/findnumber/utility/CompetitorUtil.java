package com.example.findnumber.utility;

import com.example.findnumber.beans.Accout;
import com.example.findnumber.beans.Competitor;
import com.example.findnumber.config.Initialization;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CompetitorUtil {

    private static Scanner sc = new Scanner(System.in);

    public static Competitor registerCompetitor() {
        System.out.print("Please type your name: ");
        String name = sc.nextLine();
        System.out.print("Please type your surname: ");
        String surname = sc.nextLine();
        System.out.print("Please type your username: ");
        String username = sc.nextLine();
        System.out.print("Please type your password: ");
        String password = sc.nextLine();

        Accout accout = new Accout(username, password);
        Competitor competitor = new Competitor(accout, name, surname);

        return competitor;
    }

    public static void printInformationOfCompetitor() {
        Competitor competitor = Initialization.config.getCompetitor();

        System.out.print("Name: " + competitor.getName());
        System.out.print("Surname: " + competitor.getSurname());
        System.out.print("Username: " + competitor.getAccout().getUsername());
        System.out.print("Password: " + "[PROTECTED]");
    }

    public static void start() throws IOException {
        int max = 5;
        int min = 1;

        int randomNumber = getRandomNumber(max, min);

        System.out.print("Enter number please (between " + min + "," + max + ") : ");
        int numberFromCompetitor = sc.nextInt();

        if (randomNumber == numberFromCompetitor) {
            increasePoint();
            System.out.println("You won, your pint increased 10 point.");
        } else {
            System.out.println("You failed, try again!");
        }
    }

    public static void increasePoint() throws IOException {
        Competitor competitor = Initialization.config.getCompetitor();
        int point = competitor.getPoint();
        //update
        competitor.setPoint(point + 10);
        
        Initialization.refreshConfig();
    }

    public static void showPoint() {
        System.out.println(Initialization.config.getCompetitor().getPoint());
    }

    public static int getRandomNumber(int max, int min) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
