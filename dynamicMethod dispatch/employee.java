class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager manages the team");
    }
}

public class Company {
    public static void main(String[] args) {

        Employee emp;

        emp = new Developer();
        emp.work();

        emp = new Manager();
        emp.work();
    }
}