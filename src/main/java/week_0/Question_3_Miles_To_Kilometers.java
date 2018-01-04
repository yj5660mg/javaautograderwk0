package week_0;


import static input.InputUtils.doubleInput;

public class Question_3_Miles_To_Kilometers {
    
    public static void main(String[] args) {
    
        // You don't need to modify any of the code in the main method
        
        // Ask for a number of miles
        double miles = doubleInput("Please enter a number of miles:");
        // Use the milesToKilometers method to convert this value to kilometers
        double km = milesToKilometers(miles);
        // And print the value in kilometers
        System.out.println(miles + " miles is equivalent to " + km + " kilometers");
    }

    public static double milesToKilometers(double miles) {
        
        // TODO convert the value of the variable miles to kilometers
        // For this lab, assume 1 mile = 1.6 kilometers
        
        // TODO replace this line with a line that returns the number of kilometers you calculated
        return 0;
        
    }
}
