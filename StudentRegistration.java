import java.util.Scanner;

public class StudentRegistration {

    // Define a class to hold student data
    static class Student {
        String firstName;
        String lastName;
        String email;
        String regNo;
        String status;

        public Student(String firstName, String lastName, String email, String regNo, String status) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.regNo = regNo;
            this.status = status;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] acceptedStudents = new Student[5];
        Student[] rejectedStudents = new Student[5];
        int acceptedCount = 0;
        int rejectedCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Registration Number: ");
            String regNo = scanner.nextLine();

            System.out.print("Status (accepted/rejected): ");
            String status = scanner.nextLine();

            Student student = new Student(firstName, lastName, email, regNo, status);

            if (status.equalsIgnoreCase("accepted")) {
                acceptedStudents[acceptedCount] = student;
                acceptedCount++;
            } else if (status.equalsIgnoreCase("rejected")) {
                rejectedStudents[rejectedCount] = student;
                rejectedCount++;
            } else {
                System.out.println("Invalid status entered. Please enter either 'accepted' or 'rejected'.");
                i--; // Retry current iteration
            }
        }

        

        scanner.close();
    }
}
