package FirstPoint;

// import java.util.Random;
import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1 and 2: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 % number2;

        if (number2 == 0){
            System.out.print("Ошибка: деление на ноль!");
        }
        else{
            System.out.print(result == 0 ? "Число 2 кратно 1 числу" : 
            "Не кратно, остаток от деления равен " + result);
        }

        
        scanner.close();
    }
}