package week_0;

import static input.InputUtils.intInput;

/**
 *
 * Write a method that adds two numbers, and returns the total.
 *
 */

public class Question_1_Add_Numbers {

    public static void main(String[] args) {
    
        System.out.println("This program will add two numbers.");
        int number1 = intInput("Please enter the first number");
        int number2 = intInput("Please enter the second number");
        int total = addNumbers(number1, number2);
        System.out.println(String.format("The adding %s to %s makes %s", number1, number2, total));

    }

    public static int addNumbers(int num1, int num2) {

        // TODO write your loop here, and replace this return statement with your result.
        // It should add num1 and num2 and return the result.
        // For example, if num1 = 5 and num2 = 3, your code should calculate 5 + 3 = 8
        return 0;

    }

}
