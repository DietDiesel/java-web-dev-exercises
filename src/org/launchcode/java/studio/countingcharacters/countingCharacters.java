package org.launchcode.java.studio.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input;
        String userInput;
        String corpusString = "";
        String[] corpusArray;
        File dir = new File("./src/org/launchcode/java/studio/countingcharacters");

        input = new Scanner(System.in);
        do {
            System.out.println("Do you want to 1) type the text to analyze, or 2) specify a file?");
            userInput = input.nextLine();
            if (userInput.equals("1")) {
                System.out.println("Please enter a line of text to analyze. Empty text will instead use stock text.");
                corpusString = input.nextLine();
                if (corpusString.length() == 0) {
                    corpusString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
                }
            } else if (userInput.equals("2")) {
                System.out.println("Please select a filename to use:");
                for (Integer i = 0; i < dir.list().length; i++) {
                    System.out.println(i + 1 + ") " + dir.list()[i]);
                }
                do {
                    userInput = input.nextLine();
                } while (userInput.length() == 0);
                String pathname = "./src/org/launchcode/java/studio/countingcharacters/" + dir.list()[Integer.parseInt(userInput) - 1];
                File file = new File(pathname);
                corpusString = new Scanner(file).nextLine();
            }
        } while (userInput.length() == 0);

        System.out.println("Make the character counts case-insensitive? y/n");
        if (input.nextLine().equals("y")) corpusString = corpusString.toLowerCase(Locale.ROOT);
//        System.out.println("Make the character counts include non-alphabetic characters? y/n");
//        if (input.nextLine() = "y") corpusString = corpusString.toLowerCase(Locale.ROOT);


        //converting the String to an array of chars
        corpusArray = corpusString.split("");

        //stage is set, time for the main event
        //found the .putIfAbsent method in official Java docs, makes this a breeze
        HashMap<String, Integer> outputMap = new HashMap<>();
        for (String currentLetter : corpusArray) {
            //only add a new key if it doesn't already exist
            //setting to zero so the line after is cleaner
            outputMap.putIfAbsent(currentLetter,0);
            //increment the count of the current letter
            outputMap.put(currentLetter,outputMap.get(currentLetter) + 1);
        }

        //output the contents of the hashmap in column format, as specified in studio directions
        System.out.println("Selected text is: \n" + corpusString);
        System.out.println("Character counts for selected text is: ");
        for (String currentKey : outputMap.keySet()) {
            System.out.println(currentKey + ": " + outputMap.get(currentKey));
        }
    }
}
