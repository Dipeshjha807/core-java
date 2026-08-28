public class default_constructor
 {
 default_constructor()  //it was the default constructor which is the name same as class name 
 {
System.out.println("bike started");
 }
 public void show()  // it was gthe method which is normal
 {
    System.out.println("to use the d variable");
 }
 public static void main(String[] args) {
    default_constructor d=new default_constructor();
          d.show();
 }
}
