package FirstPoint;

// public class Employee {

//     static int Multiply(int a, int b, int c) {
//         int res = a * b * c;
//         return res;
//     }

//     static void SplitPrint(int a, int b) {
//         int res = a / b;
//         System.out.println(res);
//     }

//     class EmployeeTest {

//         public static void main(String[] args) {
//             int a = 10;
//             int b = 5;
//             int c = 45;

//             System.out.println(Multiply(a, b, c));
//             SplitPrint(a, b);
//         }

//     }
// }

public class Employee {

    public static final double PI = 3.14;

    double AreaCircle(double r) {
        double area = PI * (r * r);
        return area;
    }    

    static double CircumferenceLength(double r) {
        double lehgth = 2 * PI * r;
        return lehgth;
    }

    public void PrintInfo(double r) {
        System.out.println(AreaCircle(r));
        System.out.println(CircumferenceLength(r));
        System.out.println(r);
    }  
        
    public static class EmployeeTest {

        public static int Z = 12;

        public static void main(String[] args) {

            Employee employee = new Employee();

            double area = employee.AreaCircle(2);
            double lehgth = CircumferenceLength(2);
            employee.PrintInfo(2);
        }

    }
}