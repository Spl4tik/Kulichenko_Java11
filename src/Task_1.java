import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение для числа А: ");
        int numberFirst = in.nextInt();
        System.out.print("Введите значение для числа B: ");
        int numberSecond = in.nextInt();
        if (numberFirst > numberSecond) {
            System.out.println("Результат сравнения чисел: А > В");
        } else if (numberFirst < numberSecond) {
            System.out.println("Результат сравнения чисел: А < В");
        } else {
            System.out.println("Результат сравнения чисел: А = В");
        }
        int resultOfAddition = numberFirst + numberSecond;
        System.out.println("A + B = " + resultOfAddition);
        int resultOfSubtraction = numberFirst - numberSecond;
        System.out.println("A - B = " + resultOfSubtraction);
        int resultOfMultiplication = numberFirst * numberSecond;
        System.out.println("A + B = " + resultOfMultiplication);
        int resultOfDivision = numberFirst / numberSecond;
        System.out.println("A + B = " + resultOfDivision);
    }
}
