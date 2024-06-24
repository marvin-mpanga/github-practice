public class Rejected {
    public static void printRejectedStudents(StudentRegistration.Student[] rejectedStudents) {
        for (int i = 0; i < rejectedStudents.length; i++) {
            System.out.println("Rejected Student " + (i + 1));
            System.out.println("First Name: " + rejectedStudents[i].firstName);
            System.out.println("Last Name: " + rejectedStudents[i].lastName);
            System.out.println("Email: " + rejectedStudents[i].email);
            System.out.println("Registration Number: " + rejectedStudents[i].regNo);
            System.out.println("-----------------------------------------------------------------------------------------");
        }
    }
}
