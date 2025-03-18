package FirstPoint;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Random;
import java.util.Scanner;

// Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает 
// вторую цифру этого числа. Не использовать строки для расчета.


// интересно попробовать через массив или коллекцию

public class Arena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: "); // просим число из консоли через scanner
        int number = scanner.nextInt();

        if (!checkNum(number)){
            System.out.println("Введите корректное число");
            return;
        }

        int[] array = numArray(number);
        System.out.println(array[1]);
        scanner.close();
    }

    public static int[] numArray(int number){ // метод перевода числа через массив с помощью коллекции
        ArrayList<Integer> list = new ArrayList<>();
        int val = number;

        while (val > 0){
            list.add(val % 10);
            val /=10 ;
        }

        int size = list.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = list.get(size - 1 - i);
        }

        return result;
    }

    public static boolean checkNum (int number){ // проверка числа на ноль и на трехзначное
        int value = number;

        if (value == 0){
            System.out.println("Ошибка деления на ноль");
            return false;
        }
        if (value > 999 || value < 100){
            System.out.println("Некорректное число, введите трехзначное число");
            return false;
        }

        return true;
    }
}