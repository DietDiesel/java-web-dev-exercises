package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String userRadius = input.nextLine();
        Double r = Double.parseDouble(userRadius);
        input.close();

        System.out.println("The area of a circle of radius " + r + " is: " + Circle.getArea(r));
    }
}
