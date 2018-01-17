package week_0;


import static input.InputUtils.doubleInput;


/**
 
 Finish the milesToKilometers method.
 This method should use the miles variable, and convert it to the equivalent number of kilometers.
 
 */

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

            double distanceInMiles;
            distanceInMiles = miles * 1.6;
            return distanceInMiles;
        }

        private static double kmTomiles ( double distanceInKm){
            return distanceInKm * 0.6;
        }
    }




