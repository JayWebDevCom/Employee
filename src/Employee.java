import java.time.LocalDate;

/**
 * Created by jaiye on 18/07/17.
 */
class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    private int ID;
    private static int nextID = 1;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public int getID() {
        return ID;
    }

    public void setID(){
        ID = nextID;
        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(int byPercent) {
        salary += salary * byPercent/100;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public double getSalary() {
        return salary;
    }

}
