package CAs.sd2atemiowolabi;

import java.util.ArrayList;
import java.util.Arrays;

public class Student1
{
    private int studentId;
    private ArrayList<Integer> grades;
    private ArrayList<Integer> codes;


    //Constructors
    public Student1(int studentId, ArrayList<Integer> codes, ArrayList<Integer> grades)
    {
        this.studentId = studentId;
        this.codes = codes;
        this.grades = grades;
    }


    //Getters
    public int getStudentId()
    {
        return studentId;
    }

    public ArrayList<Integer> getGrades()
    {
        return grades;
    }

    public ArrayList<Integer> getCodes()
    {
        return codes;
    }

    @Override
    public String toString()
    {
        return "Student Record{" + "studentId=" + studentId + ", codes=" + codes + ", grades=" + grades + '}' + " " + "\n";
    }
}
