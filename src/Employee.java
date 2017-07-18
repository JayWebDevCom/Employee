import java.time.LocalDate;

/**
 * Created by jaiye on 18/07/17.
 */
class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        name = name;
        salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(int byPercent) {
        salary = salary * (1 + (byPercent/100));
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public double getSalary() {
        return salary;
    }
}
