import java.util.Scanner;

interface attm {
    void withdrawing();

    void account();

    void checkbalance();

    int balance = 20000;

}

class withdraw implements attm {
    Scanner sc = new Scanner(System.in);

    public void withdrawing() {

        System.out.println("enter the amount");
        int n = sc.nextInt();
        if (balance > n) {

            System.out.println("paisa lao bhai kya garibo]");
        } else {
            System.out.println("amir log");
        }
    }

    public void account() {
        System.out.println("enter the account no");
        int account = sc.nextInt();
        if (account == 0) {
            System.out.println("invalid account no");
        } else {
            System.out.println("the amount can be differ");
        }
    }

    public void checkbalance() {
        System.out.println("enter the account c");
        int c = sc.nextInt();
        if (balance > c) {
            System.out.printf("the balance is",balance);
        } else {
            System.out.println("gandu");
        }

    }
}

public class atm {
    public static void main(String[] args) {
        withdraw w = new withdraw();
        w.withdrawing();
        w.account();
        w.checkbalance();
    }

}
