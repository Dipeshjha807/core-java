public class ifelself_laadder {
     public static void main(String[] args) {
        
        int x=14;
        int y=18;
        int z=45;

        if (x>y & x>z)
        System.out.println("hello"); 

        else if ( y>z)   //here we dont write y>x coz we already check if x is greater then y or not and x is smaller the y we already check so
                           //no need to check y is greater the x or no because we already check 
        System.out.println(y +"what you want ");

        else
        System.out.println(z);

}
}
// if all the if and elseif aree false the it will excutee else ata last
