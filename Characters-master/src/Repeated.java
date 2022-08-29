// Import java.io.file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;



public class Repeated {
    public static Vector <Integer> myVector = new Vector<Integer>();
    public static void main(String[] args) throws Exception {
        int[] array = new int[100];
        repeatedask(array);

    }
    // Main method for verifying the repeated in an array
    private static void repeatedask(int[] array) throws Exception {
        boolean notRepeated = true;
        int counter=0;
        while(notRepeated){
            int number = array[counter];
            if (myVector.contains(array[counter])){
                notRepeated = false;
            }
            else{
                myVector.add(number);
                counter++;
            }
        }
    }
}
