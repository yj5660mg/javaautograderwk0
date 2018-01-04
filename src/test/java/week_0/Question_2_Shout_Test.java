package week_0;

import input.InputUtils;
import junit.framework.TestCase;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.powermock.api.easymock.PowerMock.*;
import static week_0.Question_2_Shout.shout;
//import static week_0.Question_2_add_5_numbers.getNumbers;

public class Question_2_Shout_Test extends TestCase {
    
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