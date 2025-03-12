package FirstPoint;

import java.util.Scanner;

public class StandartTask {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input number: ");
    int number = scanner.nextInt();

    System.out.print("Input degree of number: ");
    int degree = scanner.nextInt();

    // int numberDegree = 1; // механическйи, сложный вариант
    // int count = 0;

    // while (count < degree) {
    //     numberDegree *= number;
    //     count++;
    // }

    int numberDegree = (int) Math.pow(number, degree); // вариант намного проще, функция

    System.out.printf("%d в %d степени будет равно %d", number, degree, numberDegree);
    }
}
