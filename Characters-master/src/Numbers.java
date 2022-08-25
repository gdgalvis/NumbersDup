// Aiker Ary Acosta Cantillo
// 200156358
// Workshop 2
// Date: 4/08/2022
//Algoritmos y complejidad
//IST4310
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner; 
import java.lang.Math;

public class Numbers {
/*
 * Algorithms and Complexity                                August 22, 2022
 * IST 4310
 * Prof. M. Diaz-Maldonado
 *
 *
 * Synopsis:
 * Performs rutinary Input/Output IO operations in Java.
 *
 *
 * Copyright (c) 2022 Misael Diaz-Maldonado
 * This file is released under the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *
 * References:
 * [0] Files: www.w3schools.com/java/java_files_create.asp
 * [1] PrintWriter: (docs.oracle.com/en/java/javase/11/docs/api/java.base/
 *                   java/io/PrintWriter.html)
 * [2] IOException: (docs.oracle.com/javase/7/docs/api/java/io/
 *                   IOException.html)
 * [3] FileNotFoundException: (docs.oracle.com/javase/7/docs/api/java/io/
 *                             FileNotFoundException.html)
 * [4] Scanner: docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
 * [5] www.javatpoint.com/throw-keyword
 *
 */
	public static int contador = 0;
	public static int contadorGlobal= 0;
	public static long[] times = new long[5];
	public static long[] listOfTimes = new long[17];
	public static int contComp=0;
	public static int[] comps = new int[5];
	public static int[] listOfComp = new int[17];
	public static Reader read = new Reader();
	public static long[] sizes = new long[17];

	public static void main (String[] args)
	{
		fillTheArray();
		// Create an empty for
		for (int i = 16; i < variable; i=i*2)
        {
            starter(i);
			listOfTimes[contadorGlobal]=(long)average(times);
			listOfComp[contadorGlobal]=(int)average(comps);
			contador=0;
			contadorGlobal++;
			contComp=0;
        }
		changeNegativeToPositive(listOfComp);
		changeNegativeToPositive(listOfTimes);
		// Print the two arrays
		for (int i = 0; i < listOfTimes.length; i++) {
			System.out.println(listOfTimes[i]);
		}
		for (int i = 0; i < listOfComp.length; i++) {
			System.out.println(listOfComp[i]);
		}
		createPar();
		writePar();
		
		
	}
	
	
	// Create a public method to create the parameters files
	private static void createPar()
	// creates a file
	{
		try
		{
			// defines the filename
			String fname = ("parameter.txt");
			// creates a new File object
			File f = new File (fname);
			f.createNewFile();
			

		}
		catch (IOException err)
		{
			// complains if there is an Input/Output Error
			err.printStackTrace();
		}

		return;
	}


	//Create public methods to write in each file
	private static void writePar ()

	{
		try
		{

			String filename = ("parameter.txt");

			PrintWriter out = new PrintWriter (filename);
			int count = 0;
			for (int i = 16; i < variable; i=i*2)
			{
				out.println(sizes[count]+ " "+listOfComp[count]+" "+listOfTimes[count]);;
				out.println();
				count++;
			}
			out.close();	
			}

		
		catch (FileNotFoundException err)
		{
			// complains if file does not exist
			err.printStackTrace();
		}

		return;
	}







	
	public static double average(long[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double sumix = (double) sum;
		return sumix / array.length;
	}

	public static void fillTheArray(){
		int contador = 0;
		for (int i = 16; i < variable; i=i*2)
        {
			sizes[contador] = i;
			contador++;
		}
	}
	
	public static void writeInFile() {
		
	}

	// Create a public static method to extract average of an array of ints
	public static double average(int[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double sumix = (double) sum;
		return sumix / array.length;
	}

	// Create a method that takes an array of ints, if a number is negative then changes it to a positive
	public static void changeNegativeToPositive(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = array[i] * -1;
			}
		}
	}
	public static void changeNegativeToPositive(long[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = array[i] * -1;
			}
		}
	}
	public static int variable= (int) Math.pow(2, 21);

	

	public static void starter(int N){
		for (int j = 0; j < 5; j++){
			create();	// creates a file
			write(N);	// writes data to the file
			read();		// reads data in the file
			store(N);	// stores data in an array
			// System.out.println(N);
		}
	}

    // Fill the array with the numbers from 1 to N
    public static void createArray(int[] res, int[] list)
    {
		int cont1 = 0;             
		//Se llena Res con los elementos de List sin repetirlos
		for (int i = 0; i < list.length; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (list[i] == list[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				res[cont1++] = list[i];
			}
		}
    }

    // Create a public method that prints an array while it hasn't zero as value
    public static void printArray(int[] array, int[] counter)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (counter[i] != 0)
            {
                System.out.println(array[i]+" appears "+counter[i]+" times");
            }
        }
    }
    // Method for print the repeated numbers between two arrays

    public static void storeArray(int[] array1, int[] array2, int[] counter)
    {
		
		long start = System.nanoTime();
		int contador_de_ceros = 0;
		contComp=0;
        for (int i = 0; i < array1.length; i++){
			if (array1[i]==0){
				contador_de_ceros++;
			}
			if (contador_de_ceros == 2){
				break;
			}
            for (int j = 0; j < array2.length; j++){	
				contComp++;
                if (array1[i] == array2[j]){
                    counter[i]++;
                }
            }
        }
		long end = System.nanoTime();
		long time = end - start;
		times[contador] = time;
		comps[contador] = contComp;
		contador++;
	}
    

// 
// 
// 
// 

	// implementations:
	private static void create ()
	// creates a file
	{
		try
		{
			// defines the filename
			String fname = ("data.txt");
			// creates a new File object
			File f = new File (fname);
			f.createNewFile();
			

		}
		catch (IOException err)
		{
			// complains if there is an Input/Output Error
			err.printStackTrace();
		}

		return;
	}


	private static void write (int N)
	// writes data to a file
	{
		try
		{
			// defines the filename
			String filename = ("data.txt");
			// creates new PrintWriter object for writing file
			PrintWriter out = new PrintWriter (filename);

			int numel = N;
            for (int i = 0; i != numel; ++i) {
                out.printf("%d\n", (int) (Math.random() * N));
            }
			out.close();	// closes the output stream

		}
		catch (FileNotFoundException err)
		{
			// complains if file does not exist
			err.printStackTrace();
		}

		return;
	}


	private static void read ()
	// reads the file contents and prints them to the console
	{
		// defines the filename
		String filename = ("data.txt");
		// creates a File object
		File f = new File (filename);
		try
		{
			// attempts to create a Scanner object
			Scanner in = new Scanner (f);
			in.close();	// closes the input stream

		}
		catch (FileNotFoundException err)
		{
			// complains if file does not exist
			err.printStackTrace();
		}


		return;
	}


	private static void store (int N)
	// stores the file contents into an array and prints the array
	{
		String filename = "data.txt";
		File f = new File (filename);

		try
		{
			Scanner in = new Scanner (f);

			// allocates list for storing the numbers in file
			int size = lines (filename);
			int [] list = new int [size];

			int count = 0;
			// reads numbers into array
			while ( in.hasNextInt() )
			{
				list[count] = in.nextInt();
				++count;
			}
			int[] counter = new int[N];
			int[] array = new int[N];
            createArray(array, list);
            storeArray(array, list, counter);
			clearFile();
            // printArray(array, counter);
			in.close();	// closes the input stream

		}
		catch (FileNotFoundException err)
		{
			// complains if file does not exist
			err.printStackTrace();
		}


		return;
	}


	private static int lines (String filename)
	// counts number of lines (or records) in a file
	{

		int count = 0;
		// creates a File object
		File f = new File (filename);
		try
		{
			// attempts to create a Scanner object
			Scanner in = new Scanner (f);

			// reads integers in file until EOF for counting
			while ( in.hasNextInt() )
			{
				in.nextInt();
				++count;
			}

			in.close();	// closes the input stream
		}
		catch (FileNotFoundException err)
		{
			// complains if file does not exist
			err.printStackTrace();
		}

		return count;
	}

	public static void clearFile()

{ 

    try{

    FileWriter fw = new FileWriter("data.txt", false);

    PrintWriter pw = new PrintWriter(fw, false);

    pw.flush();

    pw.close();

    fw.close();

    }catch(Exception exception){

        System.out.println("Exception have been caught");

    }

}
        
}

/*
 * COMMENTS:
 *
 * Reading Data:
 * Reads integers until the scanner object finds something that it is not
 * an integer, such as a String or an End-Of-File EOF for instance.
 *
 * Static methods:
 * Static methods are not bound to any object of the class and these can
 * be conveniently invoked directly from the main program (as done here).
 *
 * Variables:
 * Note that local variables are destroyed (freed from memory) after the
 * method executes. Do not use global variables unless you really have to.
 *
 */
