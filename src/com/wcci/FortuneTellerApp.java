package com.wcci;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        // Ask for first name
        System.out.println("What is your first name?");
        Scanner input = new Scanner(System.in);

        String firstName = input.nextLine();


        // Ask for last name
        System.out.println("What is your last name?");

        String lastName = input.nextLine();


        // Ask for age
        System.out.println("How old be you?");

        int age = input.nextInt();


        // Ask for birth month
        System.out.println("What month you born in? (1-12)");

        int birthMonth = input.nextInt();
        input.nextLine();

        // Ask for favorite ROYGBIV
        System.out.println("What is your favorite ROYGBIV color?");
        System.out.println("(Type 'Help' for a list)");

        String color = input.nextLine();

        if (color.equalsIgnoreCase("HELP")) {
            System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
            System.out.println(" ");
            System.out.println("What is your favorite ROYGBIV color?");
            color = input.nextLine();
        }

        // Ask for number of siblings
        System.out.println("How many brothers and sisters you got?");

        int siblings = input.nextInt();


        // PART TWO
        // Determine years until retirement

        int yearsToRetire = 0;

        if(age % 2 == 0){
            yearsToRetire = 42;
        } else {
            yearsToRetire = 69;
        }

        System.out.println(yearsToRetire);

        // Vacation home
        String vacationHome = "";
        if (siblings == 0){
            vacationHome = "Hell, MI";
        }else if (siblings == 1){
            vacationHome = "Vostok Station, Antarctica";
        }else if (siblings == 2){
            vacationHome = "221B Baker St, London, UK";
        }else if (siblings == 3){
            vacationHome = "Portland, OR";
        }else if(siblings > 3){
            vacationHome = "Baton Rouge, LA";
        }else {
            vacationHome = "Chernobyl, Ukraine";
        };

        // Mode of transportation
        String transportation = "";
        switch (color){
            case "RED": transportation = "Maserati";
            break;
            case "ORANGE": transportation = "stallion";
            break;
            case "YELLOW": transportation = "chariot";
            break;
            case "GREEN": transportation = "taxi";
            break;
            case "BLUE": transportation = "rickshaw";
            break;
            case "INDIGO": transportation = "motor scooter";
            break;
            case "VIOLET": transportation = "flying saucer";
            break;
            default: transportation = "rainbow bridge";
        }

        //Bank Balance
        double bankBalance = 0.0;

        if(birthMonth >= 1 && birthMonth <= 4){
            bankBalance = 4206942.69;
        }else if (birthMonth >= 5 && birthMonth <= 8){
            bankBalance = 750000.17;
        } else if (birthMonth >= 9 && birthMonth <= 12){
            bankBalance = 212211.88;
        }else {
            bankBalance = 0.12;
        }

        System.out.println(firstName + " " + lastName + "will retire in " + yearsToRetire +" years, \n" +
                "with " + bankBalance + " in the bank, a vacation home in \n" + vacationHome +
                " and travel by " + transportation);
    };
}
