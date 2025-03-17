package FirstPoint;

// import java.util.Random;
import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number1 = scanner.nextInt();

        if (number1 == 0) {
            System.out.println("Ошибка: деление на ноль!");
        } else if (number1 % 7 == 0 && number1 % 23 == 0) {
            System.out.println("Кратно 7 и 23");
        } else {
            System.out.println("Не кратно 7 и 23");
        }
      
        scanner.close();
    }
}