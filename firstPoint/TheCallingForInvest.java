package firstPoint;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TheCallingForInvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Input your name: "); Просто печатаю имя в 2 вариациях
        // String name = scanner.nextLine();
        // System.out.print("Hi, " + name + "!");
        // System.out.println();
        // String name2 = new String("Hi, %s!");
        // System.out.printf(name2, name);

        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.now();
        int Hour = dateTime.getHour();
        String TimeDay = "";
        if (Hour >= 5 && Hour < 12){
            TimeDay = "Good morning, ";
        }
        else if (Hour >= 12 && Hour < 18){
            TimeDay = "Good afternoon, ";
        }
        else if (Hour >= 18 && Hour < 23){
            TimeDay = "Good evening, ";
        }
        if (Hour < 5 || Hour == 23){
            TimeDay = "Good night, ";
        }
    System.out.printf("%s%s!", TimeDay,name);
    scanner.close(); // Закрываем scanner, чтобы избежать утечек памяти
    }
}