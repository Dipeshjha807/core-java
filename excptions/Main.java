public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;   // risky code
            System.out.println("Result: " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero ❌");
            System.out.println(e);
        }

        finally{
            System.out.println("the finally block always excutes");
        }

        System.out.println("Program continues smoothly 😊");
    }
}

