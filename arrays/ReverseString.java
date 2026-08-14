import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string baby");
        String str = sc.nextLine();

        boolean isPalindrome = true;

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();
    }
}
    
