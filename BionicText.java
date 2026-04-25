/**
 * Creating the user input for bionic code text formatting.
 *  - Current user inputs are limited to paragraphs seperated by newline commands
 */

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/** + completed adding Upper.java to the file 
 *  + Next add BioReading.java to BionicText.java
 */

public class BionicText {
    
    public static void main(String[] args) {
        System.out.println("Enter the text you would to formatted" + 
        " to bionic");

// creation of variable necessary for methods.
// ===> Making Scanner obj and user input
        Scanner input = new Scanner(System.in);
//Creatiing str object for user input
        String str = input.nextLine();
// Creating string variable w/empty space.
        String line = "";
//Overwriting line variable with the returned output from
//      upperCase(str)
//      + Converting text userinput into Bionic Text Format.
        line = upperCase(str);
    }
// main()  === End === 

//Return an formatted string
    public static String upperCase(String str) {
            // str = str.toUpperCase();
// # 2. Create a String
// Put split() String into an array of Char []
        // Makes the entire str entered lowercase
        str = str.toLowerCase();

// Creates an String ArrayList sentence.
        //      - And populates each element using the str
        //              split method.
        //      - Each group of charcters divided by a
        //              space will become a string
        //              element in the ArrayList.
        String[] sentence = str.split(" ");

// ===> Iterate through the String[] array ** Previous code that
//              threw errors.
// Run through an if caulse: if <= Upper, 
// word.toUpperCase();
// for(String word: sentence) {  //Enhanced for loop to display entered word
//     // System.out.println("word: " + word);
// }
        String iterated = "";
        String reconstructed = "";
        int counter = 0;

        for(int i = 0; i < sentence.length; i++) {
           int upper = upLimit(sentence[i]);
// System.out.println("upper: " + upper);
            for (int j = 0; j < sentence[i].length(); j++){
                String word = sentence[i];
                String[] words = word.split("");
// System.out.println("letter: " + words[j]);
                if( j < upper) {
                    iterated = words[j].toUpperCase();
                    counter += 1;
// System.out.println("iterated: " + words[j].toUpperCase() + ", index: " + j);
                }
                else if (j >= upper) {
                    iterated = words[j];
                    counter += 1;
// System.out.println("iterated: " + words[j] + ", index: " + j);
                }
                if( j == sentence[i].length() - 1) {
                    iterated += " ";
                }    
            reconstructed = reconstructed + iterated;
            }
// For loop lvl 1 end
        }
// For loop lvl 2 end
        System.out.println("\n");
        System.out.println("reconstructed:\n" + reconstructed);
        System.out.println("counter : " + counter);
        return str;
    }
// lamda expression? Since method are bein
//     in a nested formatt?
     public static int upLimit(String str) {
// ===> Find the length of the String
// Divide the length by two and subtract the lesser 
// number from the length
// Upper ==  str.length - (str.length / 2)
        int len = str.length() - 1;
        int upper = len - (len / 2);
        return upper;   
    }   
}
