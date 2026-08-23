class Payment {

    void pay() {
        System.out.println("Processing payment...");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

class CreditCard extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class NetBanking extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using Net Banking");
    }
}

public class polymorphism {

    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new NetBanking();

        p1.pay();
        p2.pay();
        p3.pay();
    }
}