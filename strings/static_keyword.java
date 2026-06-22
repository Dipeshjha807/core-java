public class static_keyword {
    String barnd;
    int price;
    static String name=" phone";  //only in static keyword we can set the value without a object

    public void show() {
        System.out.println(barnd + ": " + price + name);
    }

    public static void main(String[] args) {
        static_keyword S = new static_keyword();
        S.barnd = "iphone";
        S.price = 1233;
       
        S.show();
        static_keyword S2 = new static_keyword();
        S2.barnd = "iphone";
        S2.price = 1233;
       
        S.show();
       
    }
    }


