package CAs.sd2atemiowolabi;
import java.util.*;

public class Student
{
    private int studentId;
    private ArrayList<Integer> results;

    //Constructors

    public Student(int studentId, ArrayList<Integer> results)
    {
        this.studentId = studentId;
        this.results = results;
    }

    //Getters -read only. Can't change.

    public int getStudentId()
    {
        return studentId;
    }

    public ArrayList<Integer> getResults()
    {
        return results;
    }


    @Override
    public String toString()
    {
        return "Student Record{" +
                "studentId=" + studentId +
                ", results=" + results +
                '}';
    }
}
