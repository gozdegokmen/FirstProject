package net.infoowl.exercises;
import java.util.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

class Sort{
    /** Sort the array a[] in ascending order
     ** using an insertion sort.
     */
    static void sort(int a[], int size) {
        for (int i = 1; i < size; i++) {
            // a[0..i-1] is sorted
            // insert a[i] in the proper place
            int x = a[i];
            int j;
            for (j = i-1; j >=0; --j) {
                if (a[j] <= x)
                    break;
                a[j+1] = a[j];
            }
            // now a[0..j] are all <= x
            // and a[j+2..i] are > x
            a[j+1] = x;
        }
    }
    
    private static void usage() {
    	System.out.println("usage: sort array-size");
        System.exit(1);
    }

    /** Test program to test sort */
    public static void main(String argv[]) {
        if (argv.length < 2) {
           usage();
        }
        int size = Integer.parseInt(argv[0]);
        if (size != argv.length-1){
        	usage();
        }
        int test[] = new int[size];
        
        Properties p = new Properties();
        
        File here = new File(".");
    	System.out.println(here.getAbsolutePath());
        try{
        	File file=new File("C:\\Users\\gozde\\workspace\\deneme\\parameters.txt");
            //System.out.println(file.exists());
            Scanner scan=new Scanner(file);
        	
        }
        catch(FileNotFoundException ex){
        	System.out.println("file not found");
       }
        catch(IOException ex){
        	
        }

        for (int i = 0; i < size; i++)
            test[i] = Integer.parseInt(argv[i+1]);
        System.out.println("before");
        for (int i = 0; i < size; i++)
            System.out.print(" " + test[i]);
        System.out.println();

        sort(test, size);

        System.out.println("after");
        for (int i = 0; i < size; i++)
            System.out.print(" " + test[i]);
        System.out.println();

        System.exit(0);
    }
}
