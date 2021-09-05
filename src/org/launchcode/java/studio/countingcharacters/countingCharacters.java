package org.launchcode.java.studio.countingcharacters;

import java.util.HashMap;

public class countingCharacters {
    public static void main(String[] args) {
        //initial text operand - replace with user input or file input later
        String corpusString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        //converting the String to an array of chars
        String[] corpusArray;
        corpusArray = corpusString.split("");

        //stage is set, time for the main event
        HashMap<String, Integer> outputMap = new HashMap<>();
        for (String currentLetter : corpusArray) {
            /*if (outputMap.containsKey(currentLetter)) {
                Integer scratch = outputMap.get(currentLetter);
                outputMap.put(currentLetter,scratch++);
            }*/
            outputMap.putIfAbsent(currentLetter,0);
            outputMap.put(currentLetter,outputMap.get(currentLetter) + 1);
        }
        for (String currentKey : outputMap.keySet()) {
            System.out.println(currentKey + ": " + outputMap.get(currentKey));
        }
    }
}
