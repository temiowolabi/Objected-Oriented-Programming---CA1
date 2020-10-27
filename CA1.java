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
    public static void main(String[] args)
    {
             CA1 app = new CA1();
             app.start();
    }

    public void start()
    {
        int[] studentCodes = new int[5];
        int[] studentGrades = new int[5];

        selectFiveGrades(studentCodes, studentGrades);
        calculateAverage(studentGrades);
    }


      public void selectFiveGrades(int[] codes, int[] grades)
       {
           System.out.println("Student Records\n");
           String studentFile = "JC_Results.csv";
           codes = new int[8];
           grades = new int[8];
           String studentID;
           int[] top5Grades = new int [5];
           int[] newCodesArray = new int[5];

           List<int[]> list = Arrays.asList(codes);

           try {
               Scanner sc = new Scanner(new File(studentFile));
               sc.useDelimiter("[,\r\n]+");

               while(sc.hasNextLine())
               {
                   studentID = sc.next();
                   for(int i = 0; i < 8;i++)
                   {
                       codes[i] = sc.nextInt();
                       grades[i] = sc.nextInt();

                   }

                   Arrays.sort(grades);
                   top5Grades = Arrays.copyOfRange(grades, grades.length-5,grades.length);

                   System.out.println("Student ID: " + studentID);
                   System.out.println("Subject Codes" + Arrays.toString(Arrays.copyOfRange(codes, 0, 5)) + "\nStudent Grades" + Arrays.toString(top5Grades) + "\n");

               }
            sc.close();
           }

           catch (FileNotFoundException fne)
           {
               System.out.println("Could not open JC_Results.txt");
           }

       }



    public double calculateAverage(int[] selectedGrades)
    {
        System.out.println("Student Records - The Averages\n");
        String studentFile = "JC_Results.csv";
        int[] codes = new int[8];
        selectedGrades = new int[8];
        String studentID;
        int[] top5Grades;
        double total = 0;
        double average = 0;

        try {
            Scanner sc = new Scanner(new File(studentFile));
            sc.useDelimiter("[,\r\n]+");

            while(sc.hasNextLine())

            {
                studentID = sc.next();
                for(int i = 0; i < 8;i++)
                {
                    codes[i] = sc.nextInt();
                    selectedGrades[i] = sc.nextInt();
                }

                Arrays.sort(selectedGrades);
                top5Grades = Arrays.copyOfRange(selectedGrades, selectedGrades.length-5,selectedGrades.length);

                for (int top5Grade : top5Grades) {
                    total += top5Grade;
                }

                average = total / top5Grades.length;
                total = 0;
                System.out.println("Student ID: " + studentID);
                System.out.println("Average Grade:" + average + "\n");

            }

            sc.close();

        }
        catch (FileNotFoundException fne)
        {
            System.out.println("Could not open JC_Results.txt");
        }

        return average;

    }


    }
