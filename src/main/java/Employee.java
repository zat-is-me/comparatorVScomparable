import java.math.BigDecimal;

public class Employee implements Comparable<Employee>{
    private final String name;
    private final int age;
    private final Department department;
    private final BigDecimal salary;


    public Employee(String name, int age, Department department, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Department getDepartment() {
        return department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-3s %-10s $%-6.2f",name, age, department, salary);
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null|| getClass() != object.getClass()) return false;

        Employee employee = (Employee) object;
        return name.equals(employee.name) &&
                age == employee.age &&
                department == employee.department &&
                salary.equals(employee.salary);
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        int compareSalary = new BigDecimal(String.valueOf(this.salary)).compareTo(otherEmployee.getSalary());
        int compareName = this.name.compareTo(otherEmployee.getName());

        int compare = (compareSalary == 0) ? compareName : compareSalary;

        return compare;
    }
}