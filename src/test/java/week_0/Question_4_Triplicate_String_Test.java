package week_0;

import org.junit.Test;

import static org.junit.Assert.*;
import static week_0.Question_4_Triplicate_String.triplicate;


public class Question_4_Triplicate_String_Test {
    
    @Test(timeout=3000)
    public void tripleString() {
        
        String[] in = { "cat", "CAT", "Java", "Hello World!"};
        String[] out = {"catcatcat", "CATCATCAT", "JavaJavaJava", "Hello World!Hello World!Hello World!"};
    
        for (int s = 0; s < in.length ; s++) {
        
            String inSt = in[s];
            String outSt = out[s];
        
            assertEquals( String.format("When calling triplicate() method with '%s', it should return '%s'", inSt, outSt), outSt, triplicate(inSt));
        
        }
    
    }
    
    
    
}