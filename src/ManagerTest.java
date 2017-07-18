import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager peter;

    @Before
    public void setUp() throws Exception {
        peter = new Manager("Peter Griffin", 34000, 2005, 12, 11);
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

}