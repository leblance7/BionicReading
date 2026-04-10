/**
 * BioReading.java
 * Use of outputting bionic test format in single file hardcoded.
 */

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class BioReading {

    public static void main(String[] args) throws IOException {
/*  String for File obj */
        File file = new File("/home/leblance7/BionicReading/DonFlamingo.txt");
// Creating Empty ArrayList for for readFile() 
        ArrayList<String> DonMingo = readText(file);
// System.out.println(DonMingo);
        //DonMingo = readText(file);
        eLoop(DonMingo);
    }   /*<======================*/
// Creating method that uses list comprehensio. To read
// and store lines of text into a list

    public static ArrayList<String> readText(File file) 
        throws IOException {
// creating a Scanner obj for the file
        Scanner readFile = new Scanner(file);

//Creating an ArrayList to store the String lines from file 
        ArrayList<String> DonMingo = new ArrayList<>();
        String line = "";

        while(readFile.hasNext()) {
            line = readFile.nextLine();
            DonMingo.add(line);
        }
        return DonMingo;    
    }


/* eloop (ArrayList<String> arrayList)
 * 1) Print the text string up to fifty characters.
 * 2) Any extra text add to a new string.
 * 3) Remove end of the whole word and add to newlineplus
 *      if exceds fifty characters.
 */
/*                System.out.println(text); */
    public static void eLoop(ArrayList<String> arrayList) {
        System.out.println("\n");
        for(String text: arrayList) {
                System.out.println(text.length());
//Printing string indices using the substring
//      method.
                
//System.out.println(text[0,50];
//System.out.println(text[51, text.length()]; 
                int maxWdth = 43;
                if (text.length() > maxWdth) {
                        System.out.println(text.substring(0,
                                maxWdth));
        System.out.println(text.substring(maxWdth,text.length()));
                }
                else {
                        System.out.println(text);
                }
        }
        System.out.println("\n");
    }
}

/**<==========================================> */

        // int upperLength = token.length() / 2;
        // String upper = token(0, upperLength);
        // System.out.println("upper: " + upperLength);
                
        // Scanner token = new Scanner(System.in);
        // String str = readFile.nextLine();
        // String[] line = str.split(" ");
        // for(String token: line) {
        //     System.out.println("token: " + token);
        // }
  
        // System.out.println("Absolute file path: " + file.getAbsolutePath());
  
// use the file writer class and input a textfile

// convert the textfile into an ArrayList

//Use the split method to sperate all the words into single item arraylist

//Splie again each word into individual chars

// divided modulus by % 2 convert the starting letters to uppercase
        //    System.out.println("You believe that I cannot pray with a single arm!");
        // Creating the file obj
            // String var filepath
    
//        String fileName = "C://Users//lebla//OneDrive - College of the" +
//            " Mainland//Desktop//code//lucky_java//BionicReading//" +
//            "DonFlamingo.txt";
/* OneDrive - College of the Mainland, Required pinq from onedrive, however this is stored remotely,
 *      and the email is no longer active.
 */
//String fileName = "\\wsl.localhost\\Ubuntu\\home\\leblance7\\BionicReading\\DonFlamingo.txt";
