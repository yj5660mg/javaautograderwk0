package week_0;

import org.junit.Test;

import static org.junit.Assert.*;
import static week_0.Question_3_Quiz_Question.checkAnswer;

/**
 * Created by clara on 11/2/17.
 */
public class Question_3_Quiz_QuestionTest {
    
    @Test(timeout=3000)
    public void testQuizChecker() {
        
        String msg = "Return true if the answer is \"Bill Gates\" in any letter case.  " +
                "\nIf the answer is anything else, return false.";
        
        assertTrue(msg, checkAnswer("Bill Gates"));
        assertTrue(msg, checkAnswer("BILL Gates"));
        assertTrue(msg, checkAnswer("bill gates"));
        assertTrue(msg, checkAnswer("bIlL gAtEs"));
        
        assertFalse(msg, checkAnswer("Bill  Gates"));
        assertFalse(msg, checkAnswer("Linus Torvalds"));
        assertFalse(msg, checkAnswer("Steve Wozniak"));
    
    }
    
}