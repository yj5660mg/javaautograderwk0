package week_0;

import static input.InputUtils.stringInput;

/**
 
 Finish the triplicate method. This method should create a String from three exact copies of itself.
 
 So if the method is given the String "cat", it will return "catcatcat".
 
 */

public class Question_4_Triplicate_String {
    
    public static void main(String[] args) {
    
        // You don't need to modify any of the code in the main method
        
        String input = stringInput("Enter your String to print in triplicate: ");
        String output = triplicate(input);
    
        System.out.println("Your String three times is: ");
        System.out.println(output);

        
    }
    
    public static String triplicate(String oneString) {


        String myString = oneString + oneString + oneString;
        // TODO return a String that is three copies of the original String.
        // Example: if oneString = "Java" this method should return "JavaJavaJava".
        return myString;
    }
    
}
