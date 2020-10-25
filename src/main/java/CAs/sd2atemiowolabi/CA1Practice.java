package CAs.sd2atemiowolabi;
import java.util.*;
import java.io.*;

public class CA1Practice
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        readStudentsFromFile(students);
        System.out.println(Arrays.toString(students.toArray()));
        //writeStudentsToFile(students);
        //printElementsAtEvenIndex(students);
        //System.out.println(getAverageGrade(students));

        //System.out.println("Grades: " + Arrays.toString(selectFiveGrades()));
    }

    private static void readStudentsFromFile(ArrayList<Student> students)
    {
        try(Scanner studentsFile = new Scanner(new BufferedReader(new FileReader("JC_Results.txt"))))
        {
            while(studentsFile.hasNextLine())
            {
                String input = studentsFile.nextLine();
                String[] data = input.split(",");
                int studentId = Integer.parseInt(data[0]);
                ArrayList<Integer> tempList = new ArrayList<>();
                for(int i = 1; i < data.length; i++)
                {
//                    if (i % 2 == 0)
//                    {
//                        //System.out.println(arr[i]);
//                        tempList.add(Integer.parseInt(data[i]));
//                    }
                    tempList.add(Integer.parseInt(data[i]));
                }
                //Collections.sort(tempList);
                students.add(new Student(studentId, tempList));
                //System.out.println(input);
            }
        }
        catch (FileNotFoundException fne)
        {
            System.out.println("Could not open JC_Results.txt");
        }
    }


//    private static void writeStudentsToFile(ArrayList<Student> students)
//    {
//        try(BufferedWriter theStudentsFile = new BufferedWriter(new FileWriter("students.txt")))
//        {
//            for(Student student: students)
//            {
//                theStudentsFile.write(student.getStudentId() + "," + student.getResults());
//                for(int i = 0; i < student.getResults().size(); i++)
//                {
//                    //Collections.sort(student.getResults());
//                    theStudentsFile.write(student.getResults().get(i));
//                }
//            }
//        }
//        catch(IOException ioe)
//        {
//            System.out.println(ioe.getMessage());
//        }
//    }

//    public int[] selectFiveGrades(int[] codes, int[] grades)
//    {
//        ArrayList<Student> students = new ArrayList<>();
//
//        for(Student student: students)
//        {
//            grades = student.getResults();
//        }
//
//    }



























//    public static void printElementsAtEvenIndex(ArrayList<Student> students) {
//
//        System.out.println(" ");
//        System.out.println("Even Index");
//
//        try(Scanner studentsFile = new Scanner(new BufferedReader(new FileReader("JC_Results.txt"))))
//        {
//            for (Student student : students)
//            {
//                while(studentsFile.hasNextLine())
//                {
//                    studentsFile.write(student.getStudentId() + "," + student.getResults());
//                    for (int i = 0; i < student.getResults().size(); i++) {
//                        //Collections.sort(student.getResults());
//                        studentsFile.write(student.getResults().get(i));
//                    }
//
//
//                    for (int i = 0; i < student.getResults(); i++) {
//                        // If to validate that the index is divisible by 2
//                        if (i % 2 == 0) {
//                            System.out.println(students[i]);
//                        }
//                    }
//                }
//            }
//        }
//        catch (FileNotFoundException fne)
//        {
//            System.out.println("Could not open JC_Results.txt");
//        }
//
//        System.out.println("");
//    }
//
//    private static boolean getAverageGrade(ArrayList<Student> students)
//    {
//        int gradeS
//    }
//
//    public static void printInNumericOrder(ArrayList<Student> students)
//    {
//        //Version 5
//
//        Collections.sort(students.getResults);
//
//        for(Student display: results){
//            System.out.println(display);
//        }
//    }



}
