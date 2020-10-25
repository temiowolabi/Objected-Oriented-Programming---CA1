package CAs.sd2atemiowolabi;

import java.util.Arrays;

public class Student2
{
    private int studentId;
    private int [] codes;
    private int [] grades;

    public Student2(int studentId, int[] codes, int[] grades)
    {
        this.studentId = studentId;
        this.codes = codes;
        this.grades = grades;
    }

    public int getStudentId() {
        return studentId;
    }

    public int[] getCodes() {
        return codes;
    }

    public int[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student Record{" + "studentId=" + studentId + ", codes=" + Arrays.toString(codes) + ", grades=" + Arrays.toString(grades) + '}';
    }
}
