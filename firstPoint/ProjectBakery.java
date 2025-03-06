package firstPoint;

import java.util.Scanner;

public class ProjectBakery {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String order;
        while (true){
            System.out.printf("Input your order: ");
            order = iScanner.nextLine();
            if (order.matches("[a-zA-Z ]+")){
                break;
            }
            else {
                System.out.println("If you want to place an order, enter the order name");
            }
        }
    
        System.out.printf("Input how many orders: ");
        int howMany = 0;
        while (!iScanner.hasNextInt()){
            System.out.printf("Input how many orders: ");
            iScanner.next();
        }
        howMany = iScanner.nextInt();
        System.out.printf("Enter how many people: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int howManyPeolple = iScanner.nextInt();
        System.out.println(howManyPeolple);

        System.out.printf("Hi that's your order: %d %s for %d persons please",
        howMany, order, howManyPeolple);
        System.out.println();
        System.out.printf("Hi that's your order: " + howMany + " " + order + " for " + howManyPeolple
        + " persons please");
        iScanner.close();
    }
}