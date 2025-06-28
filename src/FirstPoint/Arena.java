package FirstPoint;

public class Arena {

    public static void dayOfmonth(int month) {
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

    public static void main(String[] args) {
        dayOfmonth(5);
        dayOfmonth(2);
        dayOfmonth(12);
        dayOfmonth(4);
        dayOfmonth(22);
    }
}
