package FirstPoint;

public class BankAccount {
    public static void main(String[] args) {
        int all = 100;
        int plus = 100;
        int minus = 50;

        BankAccount account = new BankAccount();
        all = account.popolnenieScheta(all, plus);
        all = account.snyatieScheta(all, minus);
        System.out.print(all);
    }

    public int popolnenieScheta (int sum, int profit) {
        return sum += profit;
    }

    public int snyatieScheta (int sum, int loss) {
        return sum -= loss;
    }
}
