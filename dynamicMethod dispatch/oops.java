import java.io.*;
import java.util.*;
import java.util.concurrent.*;

class oops {

    static class Employee {
        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        public void increaseSalary(double percentage) {
            salary += salary * percentage / 100;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    static class EmployeeManager {

        private final Map<Integer, Employee> employees =
                new ConcurrentHashMap<>();

        public void addEmployee(Employee employee) {
            if (employee == null) {
                throw new IllegalArgumentException("Employee cannot be null");
            }

            employees.put(employee.getId(), employee);
        }

        public void removeEmployee(int id) {
            if (employees.remove(id) == null) {
                System.out.println("Employee not found: " + id);
            }
        }

        public Employee findEmployee(int id) {
            return employees.get(id);
        }

        public void showAllEmployees() {
            employees.values()
                    .stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary)
                            .reversed())
                    .forEach(System.out::println);
        }

        public void showHighestPaidEmployee() {

            employees.values()
                    .stream()
                    .max(Comparator.comparingDouble(Employee::getSalary))
                    .ifPresent(employee ->
                            System.out.println(
                                    "\nHighest Paid Employee:\n" + employee
                            ));
        }

        public void showDepartmentStats() {

            Map<String, DoubleSummaryStatistics> stats =
                    employees.values()
                            .stream()
                            .collect(Collectors.groupingBy(
                                    Employee::getDepartment,
                                    Collectors.summarizingDouble(
                                            Employee::getSalary
                                    )
                            ));

            stats.forEach((department, data) -> {

                System.out.println("\nDepartment: " + department);
                System.out.println("Employees: " + data.getCount());
                System.out.println("Average Salary: "
                        + data.getAverage());
                System.out.println("Highest Salary: "
                        + data.getMax());
            });
        }

        public void increaseAllSalaries(double percentage) {

            ExecutorService executor =
                    Executors.newFixedThreadPool(3);

            for (Employee employee : employees.values()) {

                executor.submit(() -> {

                    employee.increaseSalary(percentage);

                    System.out.println(
                            Thread.currentThread().getName()
                                    + " updated "
                                    + employee.getName()
                    );
                });
            }

            executor.shutdown();

            try {
                executor.awaitTermination(
                        5,
                        TimeUnit.SECONDS
                );
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void saveToFile(String fileName) {

            try (BufferedWriter writer =
                         new BufferedWriter(
                                 new FileWriter(fileName))) {

                for (Employee employee : employees.values()) {
                    writer.write(employee.toString());
                    writer.newLine();
                }

                System.out.println(
                        "\nEmployee data saved successfully!"
                );

            } catch (IOException e) {

                System.out.println(
                        "File error: " + e.getMessage()
                );
            }
        }
    }

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(
                new Employee(
                        101,
                        "Rahul",
                        "Development",
                        85000
                )
        );

        manager.addEmployee(
                new Employee(
                        102,
                        "Aman",
                        "Testing",
                        65000
                )
        );

        manager.addEmployee(
                new Employee(
                        103,
                        "Rohit",
                        "Development",
                        95000
                )
        );

        manager.addEmployee(
                new Employee(
                        104,
                        "Vikas",
                        "HR",
                        55000
                )
        );

        manager.addEmployee(
                new Employee(
                        105,
                        "Karan",
                        "Development",
                        78000
                )
        );

        System.out.println("===== ALL EMPLOYEES =====");
        manager.showAllEmployees();

        manager.showHighestPaidEmployee();

        System.out.println("\n===== DEPARTMENT STATISTICS =====");
        manager.showDepartmentStats();

        System.out.println("\n===== SEARCH EMPLOYEE =====");

        Employee employee = manager.findEmployee(103);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found!");
        }

        System.out.println("\n===== SALARY UPDATE =====");

        manager.increaseAllSalaries(10);

        System.out.println("\n===== UPDATED EMPLOYEES =====");
        manager.showAllEmployees();

        manager.saveToFile("employees.txt");

        System.out.println("\nProgram completed successfully!");
    }
}