public class Task_3 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if ((arrayOfNumbers[i]) % 2 == 0) {
                System.out.println(arrayOfNumbers[i]);
            }
        }
    }
}
