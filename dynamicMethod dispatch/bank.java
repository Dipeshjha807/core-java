class Bank {
    void interest() {
        System.out.println("Bank gives interest");
    }
}

class SBI extends Bank {
    @Override
    void interest() {
        System.out.println("SBI gives 7% interest");
    }
}

class HDFC extends Bank {
    @Override
    void interest() {
        System.out.println("HDFC gives 8% interest");
    }
}

public class Main {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.interest();

        b = new HDFC();
        b.interest();
    }
}