import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для строки А: ");
        String stringFirst = in.nextLine();
        System.out.print("Введите текст для строки В: ");
        String stringSecond = in.nextLine();
        if (stringFirst.equals(stringSecond)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
