import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    List<Student> studentList;
    // service > business logic
    public StudentService() {
        studentList = new ArrayList<>();

    }


    public void addStudent(Scanner input){
        Student student = new Student();

        System.out.println("--- Adding Student ---\n");
        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Father's Name: ");
        String fatherName = input.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(input.nextLine());

        student.setName(name);
        student.setFatherName(fatherName);
        student.setAge(age);

        boolean added = studentList.add(student);

        if(added){
            System.out.println("Student Added Successfully");
        }
        else {
            System.out.println("Failed to Add Student");
        }

    }

    public void removeStudent(Scanner input){

        System.out.println("--- Removing Student ---\n");

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        Iterator<Student> iterator = studentList.iterator();

        // hasNext() > it will next value
        while(iterator.hasNext()){
            Student currentStudent = iterator.next();

            if(currentStudent.getName().equalsIgnoreCase(name)){
                iterator.remove();
                System.out.println("Removed Student Successfully");
                return;
            }

        }
        System.out.println("Student not found");
    }


    public void  displayAllStudents(){

        for(Student student : studentList){
            System.out.println(student.toString());
        }
    }
}
