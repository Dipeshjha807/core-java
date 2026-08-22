import java.io.*;
import java.util.*;

class abc {

    static class Student {
        private int id;
        private String name;
        private double marks;
        private List<String> skills;

        public Student(int id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
            this.skills = new ArrayList<>();
        }

        public void addSkill(String skill) {
            skills.add(skill);
        }

        public double getMarks() {
            return marks;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getGrade() {
            if (marks >= 90) return "A+";
            if (marks >= 80) return "A";
            if (marks >= 70) return "B";
            if (marks >= 60) return "C";
            if (marks >= 50) return "D";
            return "F";
        }

        @Override
        public String toString() {
            return "ID: " + id +
                    ", Name: " + name +
                    ", Marks: " + marks +
                    ", Grade: " + getGrade() +
                    ", Skills: " + skills;
        }
    }

    static class StudentManager {
        private Map<Integer, Student> students = new HashMap<>();

        public void addStudent(Student student) {
            students.put(student.getId(), student);
        }

        public void removeStudent(int id) {
            students.remove(id);
        }

        public Student searchStudent(int id) {
            return students.get(id);
        }

        public void displayStudents() {
            students.values()
                    .stream()
                    .sorted(Comparator.comparingDouble(Student::getMarks).reversed())
                    .forEach(System.out::println);
        }

        public void displayTopStudent() {
            students.values()
                    .stream()
                    .max(Comparator.comparingDouble(Student::getMarks))
                    .ifPresent(s -> System.out.println("\nTop Student:\n" + s));
        }

        public void saveToFile(String fileName) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

                for (Student student : students.values()) {
                    writer.write(student.toString());
                    writer.newLine();
                }

                System.out.println("\nData saved successfully!");

            } catch (IOException e) {
                System.out.println("File Error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Rahul", 91.5);
        s1.addSkill("Java");
        s1.addSkill("DSA");
        s1.addSkill("Spring Boot");

        Student s2 = new Student(102, "Aman", 84.2);
        s2.addSkill("Java");
        s2.addSkill("SQL");

        Student s3 = new Student(103, "Rohit", 76.8);
        s3.addSkill("Python");
        s3.addSkill("DSA");

        Student s4 = new Student(104, "Vikas", 67.4);
        s4.addSkill("JavaScript");
        s4.addSkill("React");

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.addStudent(s4);

        System.out.println("===== ALL STUDENTS =====");
        manager.displayStudents();

        manager.displayTopStudent();

        System.out.println("\n===== SEARCH STUDENT =====");
        Student result = manager.searchStudent(102);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Student not found!");
        }

        System.out.println("\n===== REMOVING STUDENT =====");
        manager.removeStudent(104);
        manager.displayStudents();

        manager.saveToFile("students.txt");
    }
}