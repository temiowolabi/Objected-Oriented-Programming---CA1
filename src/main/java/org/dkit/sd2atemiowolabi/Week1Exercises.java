package org.dkit.sd2atemiowolabi;

import java.util.*;


public class Week1Exercises
{
    public static void main(String[] args )
    {
        Week1Exercises app = new Week1Exercises();
        app.start();

//        Scanner input = new Scanner(System.in);
//
//        int[] myArray = new int[10];
//        getArrayValuesFromUser(input, myArray);
//        System.out.println(Arrays.toString(myArray));
//        System.out.println(sumWithoutSmallest2(myArray));
//
//        alternatingValue(input, myArray);
//        System.out.println(Arrays.toString(myArray));

    }

    public void start() {
        int[] arr = new int[10];

        //Exercise P 6.1
        fillArrayWithRandomInRange(arr, 1, 100);
        print(arr);
        printElementsAtEvenIndex(arr);
        printEveryEvenElement(arr);
        printElementInReverseOrder(arr);
        printFirstAndLast(arr);
        printFirstAndLastSwapped(arr);
        //printEveryEvenElementZero(arr);
        System.out.println(sumWithoutSmallest(arr));
        printArrayShiftedToRight(arr);
        printSecondLargestElement(arr);
        System.out.println(printIncreasingOrder(arr));
        System.out.println(printDuplicates(arr));

    }
    //QUESTION P6.1
    public void fillArrayWithRandomInRange(int[] array, int low, int hi)
    {
        Random rand = new Random();
        for(int i = 0; i < array.length; i++)
        {
            array[i] = rand.nextInt(hi - low) + low;
        }
    }

    public void print(int[] arr) {

        System.out.println(" ");
        System.out.println("All Elements In Array");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }

    public void printElementsAtEvenIndex(int[] arr) {

        System.out.println(" ");
        System.out.println("Even Index");
        for (int i = 0; i < arr.length; i++)
        {
            // If to validate that the index is divisible by 2
            if (i % 2 == 0)
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println("");
    }

    public void printEveryEvenElement(int[] arr) {

        System.out.println("Even Numbers");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }

    public void printElementInReverseOrder(int[] arr) {

        System.out.println(" ");
        System.out.println("Reverse Order");
          for (int i = arr.length; i > 0; i = i - 1)
           {
          System.out.println(arr [i-1] + " ");
           }
          System.out.println("");
    }



    public void printFirstAndLast(int[] arr) {

        System.out.println("First and Last Elements");
        System.out.println("First:" + arr[0]);
        System.out.println("Last:" + arr[arr.length - 1]);
        System.out.println(" ");

    }

    //QUESTION P6.2 (a)
    public void printFirstAndLastSwapped(int[] arr) {

        System.out.println("Original Array: "+ Arrays.toString(arr));
        int x = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = x;
        System.out.println("New array (after swapping the first and last elements): "+Arrays.toString(arr));
        System.out.println(" ");

    }

    //QUESTION P6.2 (b)
    public void printArrayShiftedToRight(int[] arr)
    {
        /*We store the last element in the temp variable and then put it in the starting position i.e. a[0] and the remaining elements
         we shift it towards the right by one position by storing the element in the current position to the next position.*/
        int temp;

        int[] newArr = arr;

        for(int i = 0; i < arr.length; i++)
        {
            newArr[i] = arr[i];
        }

        System.out.println("Original array");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(newArr[i]+" ");
        }

        /* shifting array elements */
        temp = newArr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--)
        {
            newArr[i] = newArr[i-1];
        }
        newArr[0] = temp;

        System.out.println("\nNew array (after shifting elements to the right): ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(newArr[i]+" ");
        }
        System.out.println(" ");
    }

    //QUESTION P6.2 (c)

    /*
        public void printEveryEvenElementZero(int[] arr) {

            System.out.println("Every Even element as Zero");
            for(int i = 0;i < arr.length; i++)
            {
                if(arr[i] % 2 == 0)
                {
                    arr[i] = 0;
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(" ");
        }

    */

    //QUESTION P6.2 (g)
    public static void printSecondLargestElement(int[] arr)
    {
    int largestNumber = 0;
    int secondLargestNumber = 0;

        System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i = 0; i < arr.length; i++)
        {
            /*
            * If current array value is greater than the largest value
            * then move the largest value to the Second Largest and make
            * current value as largest.
            */
            if (arr[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = arr[i];

            /*
            *If the current value is smaller than largest and greater than Second
            *Largest then the current value becomes secondLargest.
            */
            } else if (arr[i] > secondLargestNumber) {
                secondLargestNumber = arr[i];

            }
        }

        System.out.println("\nSecond largest number is:" + secondLargestNumber);

    }

    //QUESTION P6.2 (h)

    boolean printIncreasingOrder(int[] arr)
    {
        System.out.println("IS SORTED");

        //Arrays.sort(arr);

        for(int i=1; i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
                return false;
        }
        return true;
    }

    //QUESTION P6.2 (i)

    boolean printDuplicates(int[] arr)
    {
        /*
        * The outer loop will iterate through the array from 0 to length of the array. The outer loop will select an element.
        * The inner loop will be used to compare the selected element with the rest of the elements of the array.
        */
        System.out.println("Duplicate elements in given array: ");
        //Search for duplicate element
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])

                    System.out.println(arr[j]);
            }
        }
        return false;
    }



    /*JOHN LOANE'S CLASS*/

    /*
    * Write a method "sumWithoutSmallest" that computes the sum of an
    * array of values except for the smallest one, in a single loop. In the loop
    * update the sum and the smallest value. After the loop return the difference.
    */

    //QUESTION P6.4
    /*Random Generator Version*/
    public static int sumWithoutSmallest(int[] arr)
    {
        int smallestValue = arr[0];
        int sum = smallestValue;

        System.out.println("Sum Without Smallest");

        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] < smallestValue)
            {
                smallestValue = arr[i];
            }
            sum += arr[i];
        }
        return sum - smallestValue;
    }

    /*User Input Version*/

    private static void getArrayValuesFromUser(Scanner input, int[] myArray)
    {
        for(int i = 0; i < myArray.length; i++)
        {
            System.out.printf("%d element of the array: ", i);
            myArray[i] = input.nextInt();
        }
    }

    private static int sumWithoutSmallest2(int[] myArray)
    {
        //Two things in loop - find the smallest element and the sum of the array
        int smallestValue = myArray[0];
        int sum = smallestValue;

        System.out.println("Sum Without Smallest");

        for (int i = 1; i < myArray.length; i++)
        {
            if(myArray[i] < smallestValue)
            {
                smallestValue = myArray[i];
            }
            sum += myArray[i];
        }
        return sum - smallestValue;
    }

    /*Compute the alternating sum of all elements in an array*/
    //QUESTION P6.6
    public static void alternatingValue(Scanner input, int[] myArray)
        {

            int result = 0;

            System.out.println("Alternating Elements");

            for (int i = 0; i < myArray.length; i++)
            {
                System.out.printf("%d element of the array: ", i);
                if (myArray[i] > 2 && myArray[i] % 2 != 0){
                    result-=myArray[i] = input.nextInt();
                } else {
                    result+=myArray[i] = input.nextInt();
                }
            }
            System.out.println("The total sum is: "+ result);
        }


}
