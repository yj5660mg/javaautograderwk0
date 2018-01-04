package week_0;

import static input.InputUtils.stringInput;

/**
 
 Finish the shout() method. It should convert a String to uppercase, and add "!!!" to the end.
 
 So if the user enters "hello", the method will be called with "hello". The method will turn "hello" into "HELLO!!!"

*/


public class Question_2_Shout {

    public static void main(String[] args) {
    
        // You don't need to modify any of the code in the main method
        
        String string = stringInput("Enter a string to be shouted ");

        String toShout = shout(string);
    
        System.out.println(toShout);

    }


    public static String shout(String shoutThis) {

        // TODO convert the shoutThis String to uppercase, and add "!!!" to the end.
        // For example, change "cat" to "CAT!!!"
        
        // TODO replace this line with your code.
        return null;
        
    }

}
