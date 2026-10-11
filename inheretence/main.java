class demo {
   public int add(int n1, int n2) {
      return n1 + n2;
   }

   public int sub(int n1, int n2) {
      return n1 - n2;
   }
}

class cals extends demo {
   public int multi(int n1, int n2) {
      return n1 * n2;
   }

   public int divide(int n1, int n2) {
      return n1 / n2;
   }
}

public class main {
   public static void main(String[] args) {
      cals c = new cals();

      System.out.println(c.add(4, 6));// we can use both type ditecr s.o.p ke ander dal do ya phle usko r1=value do
                                      // phir jo r1 he usko s.o.p ke ande print kr do
      int r1 = c.sub(10, 9);
      System.out.println(r1);
      System.out.println(c.multi(2, 2));
       System.out.println(c.divide(10, 5));
   }
}
