package CAs.sd2atemiowolabi;
import java.io.*;
import java.util.*;

public class CA1
{
    /*
     * Reading Data from a text file
     * Array processing
     * two arrays 1 for codes, 1 for grades
     * */


    //TODO
    /**
     * Pass arrays through methods.
     * Get Top 5.
     * Get Average.
     * Test.
     * Git.
     *
     * Note To Self:
     * It's hard but keep at it :( Don't stress yourself too much :(
     */


    public static void main(String[] args) {
             CA1 app = new CA1();
             app.start();
//              readCSV("JC_Results.csv");
//        int [] studentCodes;
//        int [] studentGrades;
//        selectFiveGrades(studentCodes, studentGrades);
//
    }

    public void start()
    {
        int[] studentCodes = null;
        int [] studentGrades = null;


          //readCSV("JC_Results.csv");
          selectFiveGrades(studentCodes, studentGrades);
//        System.out.println(studentCodes);
//        System.out.println(studentGrades);
    }


      public void selectFiveGrades(int[] codes, int[] grades)
       {
           System.out.println("Student Records\n");
           String file = "JC_Results.csv";
           codes = new int[8];
           grades = new int[8];
           int[] top5 = new int[5];
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
                       Arrays.sort(grades);
                       top5 = Arrays.copyOfRange(grades, grades.length-5,grades.length);
                   }

                   System.out.println("Student ID: " + student_Number);
                   System.out.println("CODES" + Arrays.toString(codes) + "\nGrades" + Arrays.toString(top5) + "\n");
               }

            sc.close();

           } catch (IOException e) {
               System.out.println("Exception thrown. " + e);
           }


       }



    }
