package FirstPoint;
import SecondPoint.*;

public class Student {

    String nameDriver;
    double timeWork;

    Student (String nameDriver, double timeWork) {
        this.nameDriver = nameDriver;
        this.timeWork = timeWork;
    }
    
    void whoWorkHard (Delivery c, Delivery b) {
        if (c.timeWork > b.timeWork && c.timeWork > this.timeWork) {
            System.out.println(c.timeWork + " часов в день " + c.nameDriver + " работает");
        } else if (b.timeWork > c.timeWork && b.timeWork > this.timeWork) {
            System.out.println(b.timeWork + " часов в день " + b.nameDriver + " работает");
        } else {
            System.out.println(this.timeWork + " часов в день " + this.nameDriver + " работает");
        }
    }
}

class StudentTest {
    public static void main (String[] args) {
        Student s = new Student("Marko", 3);
        Delivery car1 = new Delivery("red", "lada", 12.0, "Sasha", 8.5);
        Delivery car2 = new Delivery("black", "Kia", 10.0, "Musa", 8.0);

        s.whoWorkHard(car1, car2);
        System.out.println("Лучший работник получает премию в 20 тысяч");
    }
}
