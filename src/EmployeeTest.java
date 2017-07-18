/**
 * Created by jaiye on 18/07/17.
 */
public class EmployeeTest {
    public static void Main(String[] args){
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Jane Changer", 75000, 1987, 12, 15);
        staff[0] = new Employee("Hex Hacker", 65000, 1986, 11, 14);
        staff[0] = new Employee("Tammy Tester", 55000, 1985, 10, 13);

        for (Employee emp : staff)
            emp.raiseSalary(5);

        for (Employee emp : staff)
            System.out.println("name =" + emp.getName() + ", salary = " + emp.getSalary() +
            " hired on " + emp.getHireDay());
    }
}
