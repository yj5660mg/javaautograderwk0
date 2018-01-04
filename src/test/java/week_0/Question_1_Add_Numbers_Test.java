package week_0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static week_0.Question_1_Add_Numbers.*;

public class Question_1_Add_Numbers_Test  {
    
    @Test(timeout=3000)
    public void testAddNumbers() {

        assertEquals("Adding the numbers 1 and 100 should return 101", 101, addNumbers(1, 100));
        assertEquals("Adding the numbers 6 and 10 should return 16", 16, addNumbers(6, 10));
        assertEquals("Adding the numbers -6 and -100 should return -106", -106, addNumbers(-6, -100));
        assertEquals("Adding the numbers 3 and 3 should return 6", 6, addNumbers(3, 3));
    
    }
    
}