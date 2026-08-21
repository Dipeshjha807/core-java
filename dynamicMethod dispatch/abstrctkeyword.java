 abstract class car {
    abstract void drive();   //abstract method ka mtlb ki wo method complete nhi he aur uska complete code hamesha koi child class me hi likha jata he 
                          // agar abstract method ka use krna he to wo hamesha abstract class me hi hoga normal class me nhi kr skte he 
                          //abstrsact ka mtlb hota he adha to uska code hum dushre child class me likhte he aur wo method ko';'aise close kr dete he 
                        // abstract class ka kbhi bhi object nhi banaya ja sta he 
                        // agar humne abstract method banaya to usko define krna jaruri he child class me nhi to error ayga 
                        // abstract class me bs abstract method bhi ho skt ehe aur normal method bhi ho skte he 
    public void music() 
    {
        System.out.println("play music");
    }
}
class wagon extends car{
    public void drive()
    {
        System.out.println("car is driving");
    }
}

public class abstrctkeyword {
    public static void main(String[] args) {
        wagon d = new wagon();
        d.drive();
        d.music();
    }
}
