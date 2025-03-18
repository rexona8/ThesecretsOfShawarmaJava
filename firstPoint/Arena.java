package FirstPoint;

// import java.util.Random;
import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number1 = scanner.nextInt();
        int onetwonum = number1 % 100;
        int middle = onetwonum / 10;

        if (number1 == 0) {
            System.out.println("Ошибка: деление на ноль!");
        } else if (number1 > 999 || number1 < 100) {
            System.out.println("Некорректное число, введите трехзначное число");
        } else {
            System.out.printf("Вторая цифра трехзначного числа: %d", middle);
        }
        
        scanner.close();
    }
}