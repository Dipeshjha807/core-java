import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        if((n/2) *2==n)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }sc.close();

    }
    
}
