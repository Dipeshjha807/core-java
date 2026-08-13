import java.util.Scanner;

public class student
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        boolean  isprime=true;

        System.out.println("enter a no");
        int n=sc.nextInt();
        if(n<=1)
        {
            isprime=false;
        
        }
        for(int i=1; i<n/2;i++)
        {
            if (n%i==0)
            {
              isprime=false;
              break;
            }
              if (isprime)
              {
                System.out.println("the no is prinme ");
              }
              else{
                System.out.println("not prime ");
              }
        }



    }

}
