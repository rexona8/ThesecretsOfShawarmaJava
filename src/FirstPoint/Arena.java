package FirstPoint;

import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Input number of month 2025: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("31 days in a month");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("30 days in a month");
            break;
            case 2:
            System.out.println("28 days in a month");
            break;
            default:
            System.out.println("There is no such month");
        }
    }
}