class ac {
    int age;

    public void show() {
        System.out.println("in a show ");
    }

    class bc {
        void config() {
            System.out.println("in config");
        }
    }
}

public class innerclass {
public static void main(String[] args) {
    ac obj =new ac ();
    obj.show();
    ac.bc obj1=obj.new bc();// yaha hum b class ka object banai he to ye mtlb b class a class se belong krna he to a.b obj1 hua aur phir inner clas ka object ke lie outer class ka object then new inner class banega 
    obj1.config();
}
}// note =static bs inner class ke lie use hota he na outer class class ke lie nhi 
