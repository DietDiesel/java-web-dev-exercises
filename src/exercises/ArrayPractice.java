package exercises;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] practiceArray = {1, 1, 2, 3, 5, 8};
        for (int i : practiceArray) {
            if (i%2 == 1) {
                System.out.println(i);
            }
        }
    }
}
