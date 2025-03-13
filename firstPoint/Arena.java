package FirstPoint;

import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 100 || number > 999){
            System.out.print("Incorrect number!");
        }
        else{
            System.out.print(number % 10);
        }
    }
}
