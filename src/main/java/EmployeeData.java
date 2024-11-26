import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeData{
    private static final List <Employee> EMPLOYEE_LIST = Arrays.asList(
            new Employee("Richard",23, Department.DIGITAL, new BigDecimal(90000.00) ),
            new Employee("Steve",33, Department.FINANCE, new BigDecimal(120000.00) ),
            new Employee("Andrew",45, Department.SALES, new BigDecimal(19000000.00) ),
            new Employee("Bobby",34, Department.DIGITAL, new BigDecimal(1906000.00) ),
            new Employee("John",56, Department.SALES, new BigDecimal(29000000.00) ),
            new Employee("Joe",29, Department.DIGITAL, new BigDecimal(29000000.00) ),
            new Employee("John",47, Department.MARKETING, new BigDecimal(700000.00) ),
            new Employee("Sazz",49, Department.MARKETING, new BigDecimal(150000.00) ),
            new Employee("Harry",37, Department.DIGITAL, new BigDecimal(1200000.00) ),
            new Employee("Alice",39, Department.SALES, new BigDecimal(1100000.00) ),
            new Employee("Micheal",45, Department.SALES, new BigDecimal(3000000.00) ),
            new Employee("Sofia",37, Department.SALES, new BigDecimal(2300000.00) ),
            new Employee("Jemila",35, Department.FINANCE, new BigDecimal(2300000.00) )
    );

    public static List<Employee> getEmployees() {
        return new ArrayList<>(EMPLOYEE_LIST);
    }
}
