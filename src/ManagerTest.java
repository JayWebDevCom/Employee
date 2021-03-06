import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager peter;

    @Before
    public void setUp() throws Exception {
        peter = new Manager("Peter Griffin", 34000.00, 2005, 12, 11);
    }

    @Test
    public void testManagerName() {
        assertEquals("Peter Griffin", peter.getName());
    }

    @Test
    public void testManagerID() {
        peter.setID();
        assertEquals(1, peter.getID());
        assertEquals(2, Manager.getNextID());
    }

    @Test
    public void testManagerDefaultBonus(){
        assertEquals(0, peter.getBonus(), 0.01);
    }

    @Test
    public void testManagerBonus(){
        peter.setBonus(5000.00);
        assertEquals(5000.00, peter.getBonus(), 0.001);
    }

    @Test
    public void testManagerSalary(){
        peter.setBonus(4000.00);
        assertEquals(38000.00, peter.getSalary(), 0.01);
    }

    @Test public void testManagerNameToConsole(){
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        peter.print();
        assertEquals(peter.getName(), os.toString());
    }

}