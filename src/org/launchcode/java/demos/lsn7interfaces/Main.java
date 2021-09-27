package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nIce cream flavors\nSorted by number of allergens, least first\n~~~~~~~~~~~~");
        String s = "";
        for (Flavor flavor : flavors) {
            if (flavor.getAllergens().size() != 1) s = "s";
            System.out.println(flavor.getName() + ", " + flavor.getAllergens().size() + " allergen" + s);
        }

        System.out.println("\nIce cream cone styles\nSorted by cost, least first\n~~~~~~~~~~~~");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + " $" + cone.getCost());
        }

        // Bonus mission: toppings and topping sorting

        toppings.sort(new ToppingComparator());

        System.out.println("\nIce cream toppings\nSorted alphabetically\n~~~~~~~~~~~~");
        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }

    }
}
