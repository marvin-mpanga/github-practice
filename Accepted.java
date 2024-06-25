public class Accepted {
    public static void printAcceptedStudents(StudentRegistration.Student[] rejectedStudents) {
        for (int i = 0; i < acceptedStudents.length; i++) {
            System.out.println("Accepted Student " + (i + 1));
            System.out.println("First Name: " + acceptedStudents[i].firstName);
            System.out.println("Last Name: " + acceptedStudents[i].lastName);
            System.out.println("Email: " + acceptedStudents[i].email);
            System.out.println("Registration Number: " + acceptedStudents[i].regNo);
            System.out.println("-----------------------------------------------------------------------------------------");
        }
    }
}
