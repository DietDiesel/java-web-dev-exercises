package exercises;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> practiceList = new ArrayList<>();
        practiceList.add(2);
        practiceList.add(7);
        practiceList.add(1);
        practiceList.add(8);
        practiceList.add(2);
        practiceList.add(3);
        practiceList.add(1);
        practiceList.add(4);
        practiceList.add(1);
        practiceList.add(9);
        System.out.println(arraySumEvens(practiceList));

/*        ArrayList<String> practiceList2 = new ArrayList<>();
        practiceList2.add("Drum");
        practiceList2.add("And");
        practiceList2.add("Bass");
        practiceList2.add("Arena");*/

        String words = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordArray = words.split(" ");

        ArrayList<String> practiceList2 = new ArrayList<>(Arrays.asList(wordArray));

        Scanner input = new Scanner(System.in);
        System.out.println("How long of a word to print?");
        int userInput = input.nextInt();
        arrayPrint5letterWords(practiceList2, userInput);
    }

    public static int arraySumEvens(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (i%2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void arrayPrint5letterWords(ArrayList<String> arr, int numLetters) {
        for (String i : arr) {
            if (i.length() == numLetters) {
                System.out.println(i);
            }
        }
    }
}

