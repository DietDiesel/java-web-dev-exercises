package exercises;

import java.util.ArrayList;

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
}

