package week_0;

import org.junit.Test;

import static org.junit.Assert.*;
import static week_0.Question_5_Many_Copy_String.multiplyString;

/**
 * Created by clara on 11/2/17.
 */
public class Question_5_Many_Copy_StringTest {
    @Test
    public void multiplyStringTest() throws Exception {
    
        String testIn = "cat";
        int[] inM = { 1, 5, 8, 0 };
        String[] out = {"cat", "catcatcatcatcat", "catcatcatcatcatcatcatcat", ""};
    
        for (int s = 0; s < inM.length ; s++) {
        
            int inMult = inM[s];
            String outSt = out[s];
        
            assertEquals( String.format("When calling () method with '%s', and %d copies, it should return '%s'",
                    testIn, inMult, outSt), outSt, multiplyString(testIn, inMult) );
        
        }
    }
    
}