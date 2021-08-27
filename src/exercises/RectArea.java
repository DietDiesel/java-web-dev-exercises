package exercises;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter rectangle length");
        int rectLen = input.nextInt();
        System.out.println("Please enter rectangle width");
        int rectWid = input.nextInt();
        System.out.println("The area of the rectangle is " + rectWid * rectLen);
    }
}
