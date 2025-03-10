import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите значение для числа А: ");
            double numberFirst = new Scanner(System.in).nextDouble();
            System.out.print("Введите значение для числа B: ");
            double numberSecond = new Scanner(System.in).nextDouble();
            if (numberFirst > 0 && numberSecond > 0) {
                if (numberFirst > numberSecond) {
                    System.out.println("Результат сравнения чисел: А > В");
                } else if (numberFirst < numberSecond) {
                    System.out.println("Результат сравнения чисел: А < В");
                } else {
                    System.out.println("Результат сравнения чисел: А = В");
                }
                double resultOfAddition = numberFirst + numberSecond;
                System.out.println("A + B = " + resultOfAddition);
                double resultOfSubtraction = numberFirst - numberSecond;
                System.out.println("A - B = " + resultOfSubtraction);
                double resultOfMultiplication = numberFirst * numberSecond;
                System.out.println("A * B = " + resultOfMultiplication);
                double resultOfDivision = numberFirst / numberSecond;
                System.out.println("A / B = " + resultOfDivision);
            } else System.out.println("Значения должны быть больше 0");
        }
    }
}
