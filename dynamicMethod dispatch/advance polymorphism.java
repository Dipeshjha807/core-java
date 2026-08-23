class Employee {

    void calculateSalary() {
        System.out.println("Calculating employee salary");
    }
}

class Developer extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Developer salary = ₹60,000");
    }
}

class Manager extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Manager salary = ₹80,000");
    }
}

class Intern extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Intern salary = ₹15,000");
    }
}

public class advance polymorphism {

    public static void main(String[] args) {

        Employee e1 = new Developer();
        Employee e2 = new Manager();
        Employee e3 = new Intern();

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}