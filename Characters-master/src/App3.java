// Aiker Ary Acosta Cantillo
// 200156358
// Workshop 1, Problem 1
// Date: 28/07/2022
//Algoritmos y complejidad
//IST4310

// Import java.io.file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class App3 {
    // Create contadores for every letter from A to Z
    public static int[] contadores = new int[26];

    public static void main(String[] args) throws Exception {
        read();
    }

    // implementation:
    private static void read()
    // opens GPL file for reading one character at a time
    {
        char[] letras = new char[26];
        letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String filename = ("src/GPL.txt");
        File f = new File(filename);
        try
        // the compiler complains if not in a try - catch structure
        {
            // we need a buffer reader to read char-by-char
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            // reads the buffer one character at a time
            read(br);
        } catch (FileNotFoundException e) {
            // prints the stack trace for troubleshooting
            e.printStackTrace();
        }
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i] + " : " + contadores[i]);
        }

    }

    private static void read(BufferedReader br)
    /*
     * 
     * Synopsis:
     * Reads buffer one character at a time and reports on the console the
     * number of capital letters found.
     * 
     */
    {
        // reads the first character in the file
        int c = readBuffer(br);
        while (c != 0xFFFFFFFF) /* (Note: 0xFFFFFFFF = -1) */
        // reads one character at a time until end-of-file EOF
        {
            if (c >= 65 && c <= 90) {
                contadores[c - 65]++;
            }
            c = readBuffer(br);
        }
    }

    private static int readBuffer(BufferedReader br)
    // tries to read a single character from buffer stream
    {
        int c = 0;
        // the compiler complains if not in a try - catch structure
        try {
            c = br.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return c;
    }
}
