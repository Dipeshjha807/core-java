class a {
    public a()
    {
      super();
      System.out.println("in A");
    }
     public a( int n)
    {
      super();
      System.out.println("in A int");
    }
}
 class b extends a
 {
     public b()
    {
      super();
      System.out.println("in b");
    }
    public b( int n)
    {
      this();
      System.out.println("in b int");
    }
 }
 public class super_thismethod
 {
  public static void main(String[] args) {
    b obje=new b(3);
  }
 }
