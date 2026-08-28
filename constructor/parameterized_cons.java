class demo {
   int id;
   String name;

   demo(int id, String name) // here it was the parameterized constructor because we give the parameter in
                             // the constructor
   {
      this.id = id;
      this.name = name; // here we use this word because the variable we pass on top is instance
                        // variable and the same variable we use in
      // parameter so we use thsi and thos is impt so we use thisword
   }

   public void show() {
      System.out.println(id + " the id and name is" + name);

   }
}

public class parameterized_cons {
   public static void main(String[] args) {

      demo d = new demo(23, "dipesh");
      demo d1 = new demo(22, "barsha");
      d.show();
      d1.show();
   }
}
