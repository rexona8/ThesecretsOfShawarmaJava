package FirstPoint;

import java.util.Scanner;

public class SyntaxMemorizer{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.println(number % 7 == 0 && number % 23 == 0 ? "кратно" : "не кратно");

        scanner.close();
    }
}

