 interface a 
 {

    //int age=45;//// we cant decleaer variabe becayuse every variable in interfce in vinal bydefault
void show();
void bark();
    
}
class b implements a
{
    public void show()
    {
        System.out.println("in show");
    }
    public void bark()
    {
        System.out.println("in bark ");
    }
}





public class demo {
    public static void main(String[] args) {
        b obj=new b();
        obj.show();
        obj.bark();
    }
}
