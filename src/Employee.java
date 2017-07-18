import java.time.LocalDate;

/**
 * Created by jaiye on 18/07/17.
 */
class Employee {
    private String name;
    private double Salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        name = name;
        salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }
}
