package week_0;

import junit.framework.TestCase;
import static week_0.Question_1_Add_Numbers.*;

public class Question_1_Add_Numbers_Test extends TestCase {

    public void testAddNumbers() {

        assertEquals("Adding the numbers 1 and 100 should be 101", 101, addNumbers(1, 100));
        assertEquals("Adding the numbers 6 and 10 should be 16", 16, addNumbers(6, 10));
        
    }
    
}