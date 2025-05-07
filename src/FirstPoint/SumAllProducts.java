package FirstPoint;

public class SumAllProducts {
    int sumBreadAndSweet () {
        int result = 0;
        System.out.println("Кол-во изделий равно: " + result);
        return result;
    }

    int sumBreadAndSweet (int muffin) {
        int result = muffin;
        System.out.println("Кол-во изделий равно: " + result);
        return result;
    }

    int sumBreadAndSweet (int bagel, int cheesecake) {
        int result = bagel + cheesecake;
        System.out.println("Кол-во изделий равно: " + result);
        return result;
    }

    int sumBreadAndSweet (int pone, int cookies, int chocolate) {
        int result = pone + cookies + chocolate;
        System.out.println("Кол-во изделий равно: " + result);
        return result;
    }

    public static void main (String []args) {
        SumAllProducts prod = new SumAllProducts();
        prod.sumBreadAndSweet();
        prod.sumBreadAndSweet(11);
        prod.sumBreadAndSweet(2, 7);
        prod.sumBreadAndSweet(5, 1, 9);
    }
}
