/*
* NAME: TEMI OWOLABI
* STUDENT NUMBER: D00227197
* CLASS: SD2A
*/
package CAs.sd2atemiowolabi;
import java.io.*;
import java.util.*;

public class CA1
{

    //TODO
    /**
     * Pass arrays through methods. (Almost There)
     * Exclude CSPE (CODE 218)
     * Test.
     * Git.
     *
     */


    public static void main(String[] args)
    {
             CA1 app = new CA1();
             app.start();
    }

    public void start()
    {
        int[] studentCodes = new int[5];
        int [] studentGrades = new int[5];

        selectFiveGrades(studentCodes, studentGrades);
        calculateAverage(studentGrades);
    }


      public void selectFiveGrades(int[] codes, int[] grades)
       {
           System.out.println("Student Records\n");
           String file = "JC_Results.csv";
           codes = new int[8];
           grades = new int[8];
           int[] top5;
           int[] codes2 = new int[5];

           try {
               Scanner sc = new Scanner(new File(file));
               sc.useDelimiter("[,\r\n]+");

               while(sc.hasNextLine())
               {
                   String student_Number = sc.next();
                   for(int i = 0; i < 8;i++)
                   {

                       codes[i] = sc.nextInt();
                       grades[i] = sc.nextInt();
                   }
                   Arrays.sort(grades);
                   top5 = Arrays.copyOfRange(grades, grades.length-5,grades.length);
                   //codes2 = Arrays.copyOfRange(codes, codes.length-5,codes.length);
                   Arrays.copyOfRange(codes, 0, 5);

                   System.out.println("Student ID: " + student_Number);
                   System.out.println("CODES" + Arrays.toString(Arrays.copyOfRange(codes, 0, 5)) + "\nGrades" + Arrays.toString(top5) + "\n");

               }

            sc.close();


           } catch (IOException e) {
               System.out.println("Exception thrown. " + e);
           }


       }



    private void calculateAverage(int[] selectedGrades)
    {
        System.out.println("Student Records - The Averages\n");
        String file = "JC_Results.csv";
        int [] codes = new int[8];
        selectedGrades = new int[8];
        int[] top5;
        double total = 0;

        try {
            Scanner sc = new Scanner(new File(file));
            sc.useDelimiter("[,\r\n]+");

            while(sc.hasNextLine())
            {
                String student_Number = sc.next();
                for(int i = 0; i < 8;i++)
                {
                    codes[i] = sc.nextInt();
                    selectedGrades[i] = sc.nextInt();
                }

                Arrays.sort(selectedGrades);
                top5 = Arrays.copyOfRange(selectedGrades, selectedGrades.length-5,selectedGrades.length);

                for(int a = 0; a < top5.length; a++)
                {
                    total += top5[a];
                }

                double average = total / top5.length;

                System.out.println("Student ID: " + student_Number);
                System.out.println("Average Grade:" + average + "\n");

            }

            sc.close();

        } catch (IOException e) {
            System.out.println("Exception thrown. " + e);
        }


    }


    }
