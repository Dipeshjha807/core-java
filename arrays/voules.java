import java.util.Scanner;

public class voules {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string to check the voules ");
        char ch=sc.next().charAt(0);
        switch(ch)
{
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        System.out.println(ch+"this is the vowles");
        break;
        default:
    System.out.println("not voucd");
}

    }
}
