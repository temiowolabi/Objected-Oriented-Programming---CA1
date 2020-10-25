package Week3Exercises;
import java.util.*;
import java.io.*;

public class ThursdayClass
{
    /**
     * Write a program that checks the spelling of all words
     * in a file. It should read each word of the file and
     * check whether it is contained in a word list.
     * You can get the word list /usr/share/dict/words
     * The program should print out all the words that it
     * cannot find in the word list.
     * It should ask the user for which file they want to check
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("1.e odd index numbers in array : " +  Arrays.toString(oddIndex(arr)));

    }



    public static int[] oddIndex(int[] array){

        int[] newArr = new int[array.length];
        int j=0;
        for (int i = 0; i < array.length; i++){
            if ((i % 2) != 0) {
                newArr[j++] = array[i];

            }
        }
        return Arrays.copyOf(newArr, j);
    }


//
//    public static void main(String[] args)
//    {
//        ThursdayClass myApp = new ThursdayClass();
//        myApp.start();
//    }
//
//
//    private void start()
//    {
//        String filename = getFileFromUser();
//
//        ArrayList<String> allDictionaryWords = wordsInFile("words");
//        ArrayList<String> allWords = wordsInFile(filename);
//
//        notFoundWords(allDictionaryWords, allWords);
//    }
//
//    private String getFileFromUser()
//    {
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Please enter the file you would like to check: ");
//        String filename = keyboard.next();
//        return filename;
//    }
//
//    private ArrayList<String> wordsInFile(String filename)
//    {
//        ArrayList<String> words = new ArrayList<>();
//        try
//        {
//            Scanner fileReader = new Scanner(new BufferedReader(new FileReader("checking")));
//        }
//        catch(FileNotFoundException fne)
//        {
//            System.out.println(fne.getMessage());
//        }
//
//        return words;
//    }
//
//    private void notFoundWords(ArrayList<String> allDictionaryWords, ArrayList<String> allWords)
//    {
//        for(String word)
//    }

}
