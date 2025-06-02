package SecondPoint;

public class Delivery {
    String colorCar;
    String model;
    double numOfOrders;
    public String nameDriver;
    public double timeWork;

    public Delivery (String colorCar, String model, double numOfOrders, String nameDriver, double timeWork) {
        this.colorCar = colorCar;
        this.model = model;
        this.numOfOrders = numOfOrders;
        this.nameDriver = nameDriver;
        this.timeWork = timeWork;
    }

    static class CarTest {
        public static double AverageNumOfOrders (Delivery d) {
            return d.numOfOrders / d.timeWork;
        }

        public static double timeWorkPlus (Delivery d) {
            d.timeWork *= 2;
            return d.timeWork;
        }

        public static double orderkPlus (Delivery d) {
            d.numOfOrders *= 2;
            return d.numOfOrders;
        }
    
        public static void Substitution (Delivery c, Delivery b) {
            String tempModel = c.model;
            String tempName = c.nameDriver;

            c.model = b.model;
            c.nameDriver = b.nameDriver;

            b.model = tempModel;
            b.nameDriver = tempName;
        }
        
        public static void main (String[] args) {
            Delivery car1 = new Delivery("red", "lada", 12.0, "Sasha", 4);
            Delivery car2 = new Delivery("black", "Kia", 10.0, "Musa", 5.0);

            timeWorkPlus(car1);
            orderkPlus(car1);
            timeWorkPlus(car2);
            orderkPlus(car2);
            Substitution(car1, car2);

            System.out.println(AverageNumOfOrders(car1));
            System.out.println(AverageNumOfOrders(car2));
            System.out.println(car1.nameDriver);
            System.out.println(car2.nameDriver);
        }
    }
}
