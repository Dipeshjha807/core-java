public class Main {
    public static void main(String[] args) {

        // Student details
        String name = "Rahul";
        int rollNo = 25;
        String course = "Computer Science";

        // Marks
        int maths = 85;
        int physics = 78;
        int chemistry = 82;
        int english = 88;
        int computer = 92;

        // Calculate total
        int total = maths + physics + chemistry + english + computer;

        // Calculate percentage
        double percentage = total / 5.0;

        // Find grade
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display result
        System.out.println("===== STUDENT REPORT =====");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("--------------------------");

        System.out.println("Maths      : " + maths);
        System.out.println("Physics    : " + physics);
        System.out.println("Chemistry  : " + chemistry);
        System.out.println("English    : " + english);
        System.out.println("Computer   : " + computer);

        System.out.println("--------------------------");
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
        System.out.println("==========================");
    }
}