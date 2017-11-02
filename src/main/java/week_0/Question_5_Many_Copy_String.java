package week_0;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.stringInput;

/**
 * Write a method that creates a String from many copies of itself.
 * The user will decide how many copies to make
 *
 * So if the method is given the string "cat" and 3 copies, it will return "catcatcat".
 * So if the method is given the string "Hello" and 5 copies, it will return "hellohellohellohellohello".
 */

public class Question_5_Many_Copy_String {
    
    public static void main(String[] args) {
        
        String input = stringInput("Enter your string to multiply: ");
        int copies = positiveIntInput("How many copies to make?");
        
        String output = multiplyString(input, copies);
    
        System.out.println(String.format("Your String %d times is: %s", copies, output));
        
        
    }
    
    public static String multiplyString(String userString, int n) {
        
        // TODO return a String that is n copies of the original String.
        // So if userString = "Java" and n is 2 this method should return "JavaJava".
        // If userString = "Java" and n is 0, this method should return ""  (an empty String)
        return null;
        
    }
    
}
