import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the no");
         int n=sc.nextInt();
         if(n%3==0)
         {
            System.out.println("no is divide by 3");
         }
         else if(n%7==0)
         {
            System.out.println("the no is divisible by 7");
         }
         else
         {
            System.out.println("acha se no daal na gandu");
         }sc.close();


    }
}
