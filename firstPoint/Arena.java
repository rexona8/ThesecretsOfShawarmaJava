package FirstPoint;

import java.util.Random;
// import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input number: ");
        // int number = scanner.nextInt();
        // scanner.close();
        Random random = new Random();
        int randNum = random.nextInt(100);

        System.out.println(randNum);
        System.out.printf("Случайное число: %d. Первая цифра (десятки): %d. Вторая цифра (единицы): %d. Наибольшая цифра: %d.", 
                          randNum, randNum / 10, randNum % 10, Math.max(randNum / 10, randNum % 10));

    }
}
