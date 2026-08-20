//final -variable,method,class
final class calc // ones we make our class final we stop the inheritance means no sub class
                 // extends the final class
{
    public final void show() {  //when we make the method final no one can override it 
        System.out.println("in calc show");
    }

    public void add(int a, int b) {

        System.out.println(a + b);
    }
}

public class final1 {
    public static void main(String[] args) {
        // final int num=8;//final variable means we cant change the value of it

        // System.out.println(num);
        calc c = new calc();
        c.show();
        c.add(2, 5);
    }

}
