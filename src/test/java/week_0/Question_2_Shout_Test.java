package week_0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static week_0.Question_2_Shout.shout;

public class Question_2_Shout_Test {
    
    @Test(timeout=3000)
    public void testShout() throws Exception {

        String[] in = { "hello", "CAT", "Here's a string"};
        String[] out = { "HELLO!!!", "CAT!!!", "HERE'S A STRING!!!"};
        
        for (int s = 0; s < in.length ; s++) {
            
            String inSt = in[s];
            String outSt = out[s];
            
            assertEquals( String.format("When calling shout() method with '%s', it should return '%s'", inSt, outSt), outSt, shout(inSt));
            
        }
        
    }
}