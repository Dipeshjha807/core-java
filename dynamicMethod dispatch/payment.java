class Payment {
    void pay() {
        System.out.println("Making payment");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Payment through Card");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();
    }
}