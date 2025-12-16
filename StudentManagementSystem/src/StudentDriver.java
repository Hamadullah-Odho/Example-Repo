import java.util.Scanner;

public class StudentDriver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // to access methods
        StudentService studentService = new StudentService();

        boolean flag = true; // will use this for while loop

        // pre conditional loop > while
        // post conditional loop > do - while


        while (flag) {

            System.out.println("--- Student Management System --- \n");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.println("--------------------------------------\n");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());

            // if else > conditional statement > condition 1 > 2
            // switch > conditional statement > constants

            switch (choice) {
                case 1:
                    studentService.addStudent(input);
                    break;
                case 2:
                    studentService.removeStudent(input);
                    break;
                case 3:
                    studentService.displayAllStudents();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
        input.close();
    }

}
