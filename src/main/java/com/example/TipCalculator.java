package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        String result = "-------------------------------\n" +
                       "Total bill before tip: " + "$" +  (double)Math.round(cost * 100) / 100 + "" + "\n" +
                       "Total percentage: " +  Math.round(percent * 100) / 100 + "%\n" +
                       "Total tip: " + "$" +  (double)Math.round((cost * ((double)percent/100)) * 100) / 100 +  "" + "\n" +
                       "Total Bill with tip: " + "$" +  (double)Math.round((((double)(cost)) + (cost * ((double)percent/100))) * 100) / 100   + "\n" +
                       "Per person cost before tip: " + "$" +  (double)Math.round(((double)(cost))/((double)(people)) * 100) / 100  + "" + "\n" +
                       "Tip per person: " + "$" +  (double)Math.round((cost * ((double)percent/100))/people * 100) / 100  + "" + "\n" +
                       "Total cost per person: " + "$" + (double)Math.round((((double)(cost)) + (cost * ((double)percent/100)))/people * 100) /100 + "" + "\n" +
                       "-------------------------------\n";

        return result;
    }


    public static String extraCredit(int people, int percent, double cost) {
       String result = "-------------------------------\n" +
              "Total bill before tip: " + "$" +  (double)Math.round(cost * 100) / 100 + "" + "\n" +
              "Total percentage: " +  Math.round(percent * 100) / 100 + "%\n" +
              "Total tip: " + "$" +  (double)Math.round((cost * ((double)percent/100)) * 100) / 100 +  "" + "\n" +
              "Total Bill with tip: " + "$" +  (double)Math.round((((double)(cost)) + (cost * ((double)percent/100))) * 100) / 100   + "\n" +
              "Per person cost before tip: " + "$" +  (double)Math.round(((double)(cost))/((double)(people)) * 100) / 100  + "" + "\n" +
              "Tip per person: " + "$" +  (double)Math.round((cost * ((double)percent/100))/people * 100) / 100  + "" + "\n" +
               "Total cost per person: " + "$" + (double)Math.round((((double)(cost)) + (cost * ((double)percent/100)))/people * 100) /100 + "" + "\n" +
             "-------------------------------\n";
        boolean condition = true;
        Scanner scan = new Scanner(System.in);

         String done = "-1";
         String food = "A";
        while (!food.equals(done)) {

           System.out.print("Enter an item name or '-1' to finish ");
             food = scan.nextLine();
            condition = false;
    
        }
        System.out.println("");

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=6; 
        int percent=25;
        double cost=52.27;       
        // System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}

       //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        
