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

    private static Student[] rejectedStudents = new Student[5];
    private static int rejectedCount = 0;

    private static Student[] acceptedStudents = new Student[5];
    private static int acceptedCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        for (int i = 0; i < 5; i++) {
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

        // Call the function to get rejected students and print them using the Rejected class
        Student[] rejected = getRejectedStudents();
        Rejected.printRejectedStudents(rejected);

        Student[] accepted = getAcceptedStudents();
        Accepted.printAcceptedStudents(accepted); 
    }

    public static Student[] getRejectedStudents() {
        // Return only the filled portion of the array
        Student[] filledRejectedStudents = new Student[rejectedCount];
        System.arraycopy(rejectedStudents, 0, filledRejectedStudents, 0, rejectedCount);
        return filledRejectedStudents;
    }

    public static Student[] getacceptedStudents() {
        // Return only the filled portion of the array
        Student[] filledAcceptedStudents = new Student[acceptedCount];
        System.arraycopy(acceptedStudents, 0, filledAcceptedStudents, 0, rejectedCount);
        System.out.println(".....................................................");
        System.out.println(".....................................................");
        System.out.println(".....................................................");
        return filledAcceptedStudents;
    }
}
