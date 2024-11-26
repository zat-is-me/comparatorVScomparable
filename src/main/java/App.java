import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();
        System.out.println("\t\tEmployee List");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        //Sorting
        Collections.sort(employees);

        System.out.println("\n\tSorted Employee List");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        List<Student> students = StudentData.getStudents();
        System.out.println("\n\tStudent List");
        for (Student student: students) {
            System.out.println(student);
        }

        students.sort(new MyComparator());

        System.out.println("\n\tSorted Student List");
        for (Student student: students) {
            System.out.println(student);
        }

    }
}
