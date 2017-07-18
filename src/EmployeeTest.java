import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;


/**
 * Created by jaiye on 18/07/17.
 */

public class EmployeeTest  {

    Employee mary;

    @Before
    public void setUp() {
        mary = new Employee("Mary Magnificent", 45000, 2005, 4, 5);
    }

    @Test
    public void testGetName() {
        assertEquals("Mary Magnificent", mary.getName());
    }

    @Test
    public void testGetSalary() {
        assertEquals(45000, mary.getSalary(), 0.001);
    }

    @Test
    public void testRaiseSalary() {
        double newSalary = 45000 * 1.05;
        mary.raiseSalary(5);
        assertTrue(newSalary == mary.getSalary());
    }

    @Test
    public void testGetHireDay() {
        assertEquals(LocalDate.of(2005, 04, 05), mary.getHireDay());
    }


    @Test
    public void testID() {
        assertEquals(1, Employee.getNextID());
        assertEquals(1, mary.getNextID());
        mary.setID();
        assertEquals(1, mary.getID());
        assertEquals(2, Employee.getNextID());
    }

}