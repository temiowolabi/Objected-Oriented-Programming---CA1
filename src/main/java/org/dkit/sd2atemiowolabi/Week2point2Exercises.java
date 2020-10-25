package org.dkit.sd2atemiowolabi;

import java.util.*;

public class Week2point2Exercises
{
    public static void main(String[] args)
    {
        // Must use wrapper class for declaration
        // Byte, Boolean, Character, Double, Float, Integer, Long, Short
        //  Auto-boxing / unboxing
        ArrayList<Double> values = new ArrayList<>();  //Declare & Create

        // Read inputs from keyboard. ADD to arrayList.
        // Much easier than using an array - WHY?
        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble())
        {
            double num = in.nextDouble();
            values.add(num);
        }

        System.out.println("\nDisplay all using toString() " + values.toString());
        System.out.println();

        // Find the largest value - similar to ARRAY processing except .....
        System.out.println("Find & MARK largest value :");

        // TODO    1. Convert to method findLargest() - return largest value.  Change to use enhanced FOR

        double largest = values.get(0);
        //for (int i : value)
        for (int i = 1; i < values.size(); i++)
        {
            if (values.get(i) > largest)
            {
                largest = values.get(i);
            }
        }
        System.out.println("Largest: " + largest);
        // Print all values, marking the largest.  Using enhanced for loop - "foreach"

        for (double element : values)
        {
            System.out.print(element);
            if (element == largest)
            {
                System.out.print(" <== largest value");
            }
            System.out.println();
        }

        // TODO    2. Convert to method markLargest() -

//
//
//
        // Remove all numbers < 0 from ArrayList - Attempt!

        System.out.println("Remove all negative numbers from ArrayList");
        for (int i = 0; i < values.size(); i++)
        {
            double num = values.get(i);
            if (num < 0)
            {
                values.remove(i);
            }
        }

        System.out.println("\nDisplay all using toString() " + values.toString());
        System.out.println();


        //TEST TEST TEST.....How would you modify so the removal works?
        // TODO    3. Modify so it works correctly!
        // TODO    4. Convert to method removeAllNegative()
    }

//    public static double findLargest(ArrayList<double> values)
//    {
//        return 0;
//    }
}
