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


    public static void main(String[] args) {
//        int[] codes = new int[7];
//        int[] grades = new int[7];
       // int[] array = new int[16];
//        ArrayList<Student1> students = new ArrayList<>();
        //selectFiveGrades(codes,grades);
        readCSV("JC_Results.txt");
//       readStudentsFromFile(students);
//        System.out.println(Arrays.toString(students.toArray()));
       //printElementsAtEvenIndex(students);
//


       // readCSV("JC_Results.csv");


    }
    


    public static void readCSV(String file) {
        System.out.println("Reading words, and numbers from CSV text file");

        try {
            Scanner sc = new Scanner(new File(file));
            sc.useDelimiter("[,\r\n]+");
            int[] codes = new int[8];
            int[] grades = new int[8];


            while(sc.hasNextLine())
            {
                String student_Number = sc.next();
                for(int i = 0; i < 8;i++)
                {
                    codes[i] = sc.nextInt();
                    grades[i] = sc.nextInt();
                }
                System.out.println("Student ID: " + student_Number);
                System.out.println("CODES" + Arrays.toString(codes) + "\nGrades" + Arrays.toString(grades) );
            }



//            sc.close();

        } catch (IOException e) {
            System.out.println("Exception thrown. " + e);
        }
    }


//    public static void selectFiveGrades(int[] codes, int[] grades)
//    {
//        try(Scanner studentsFile = new Scanner(new BufferedReader(new FileReader("JC_Results.txt"))))
//        {
//            while(studentsFile.hasNextLine())
//            {
//                studentsFile.useDelimiter("[,\r\n]+");
//                String input = studentsFile.nextLine();
//                String[] data = input.split(",");
//                int studentId = Integer.parseInt(data[0]);
////                codes = new int[20];
////                grades = new int[20];
//
//
//
//                //String student_Number = sc.next();
//                for(int i = 0; i < 8;i++)
//                {
//                    codes[i] = studentsFile.nextInt();
//                    grades[i] = studentsFile.nextInt();
//                }
//                System.out.println("CODES" + Arrays.toString(codes) + "\nGrades" + Arrays.toString(grades) );
////
////                for(int i = 1; i < data.length; i++)
////                {
////
////                    if (i % 2 == 0)
////                    {
////                        //System.out.println(arr[i]);
////
////                        grades[i] = Integer.parseInt(data[i]);
////                    }
////                    if (i % 2 != 0)
////                    {
////                        //System.out.println(arr[i]);
////                        //tempList1.add(Integer.parseInt(data[i]));
////                        //System.out.println(codes[i]);
////                        codes[i] = Integer.parseInt(data[i]);
////                    }
////                }
//
//
//                //Student2 helpMe = new Student2(studentId, codes, grades);
//
//                //System.out.println(helpMe.toString());
//                //System.out.println(input);
//
//            }
//
//            //Student2 helpMe = new Student2()
//        }
//
//
//
//
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//
//
//
//
//    }







//    private static String readFromFile(String fileName) throws IOException
//    {
//        FileReader file = new FileReader(new File("JC_Results.txt"));
//        List<String> temp = new ArrayList<String>();
//        BufferedReader reader = new BufferedReader(file);
//        String content = "";
//        String line;
//
//
//        try {
//            while ((line = reader.readLine()) != null) {
//                if (line.length() > 0)
//                {
//                    content += line + "\n";
//                } else
//                    {
//                    temp.add(content);
//
//                    content = "";
//                }
//            }
//        }
//        catch(FileNotFoundException fne)
//        {
//            System.out.println("Exception: Could not find file to read.");
//        }
//        temp.add(content);
//        //file.close();
//
//
//
//        return content;
//    }

}
