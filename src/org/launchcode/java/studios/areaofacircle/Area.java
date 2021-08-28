package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validInput = false;
        double r = 0.0;
        System.out.println("Enter a radius: ");
        String userInput = input.nextLine();
        while (!validInput) {
            try {
                r = Double.parseDouble(userInput);
                validInput = true;
            } catch (NullPointerException|NumberFormatException e) {
                System.out.println("No valid input received. parseDouble returned '" + e + "'");
                System.out.println("Please enter a radius: ");
                userInput = input.nextLine();
                validInput = false;
            }
        }
        input.close();
        System.out.println("The area of a circle of radius " + r + " is: " + Circle.getArea(r));
    }
}
