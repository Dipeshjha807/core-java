class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Teacher extends Employee {
    void work() {
        System.out.println("Teacher is teaching");
    }
}

class Engineer extends Employee {
    void work() {
        System.out.println("Engineer is developing software");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e;

        e = new Teacher();
        e.work();

        e = new Engineer();
        e.work();
    }
}