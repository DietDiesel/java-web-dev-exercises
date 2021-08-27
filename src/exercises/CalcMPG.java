package exercises;

import java.util.Scanner;

public class CalcMPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter distance of trip, in miles");
        int distance = input.nextInt();
        System.out.println("Please enter gallons of gas used");
        int gallons = input.nextInt();
        System.out.println("Your MPG for that trip was " + distance / gallons);
    }
}
