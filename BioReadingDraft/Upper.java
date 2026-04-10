// Upper.jav
//Creates a method that splits the entered String and 
//      converts the first half into uppercase word

import java.util.Scanner;
import java.util.*;

public class Upper {
   
        /**------- main ---------------------------- */
    public static void main(String[] args) {
        // System.out.println("Gomu Gomu . . . Pistol!!!");

        System.out.println("\nEnter the text you would like to put" + 
        "in bionic formatting:\n"); 
            
            //  # 1. Create a Scanner obj
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
    
            // # 6. Calling the case() method
        String line = "";
        line = upperCase(str);
        // int num = upLimit(str);
        // System.out.println("upLimit: " + num);
    }
            /** ----- end main ----------------- */

    public static String upperCase(String str) {
            // str = str.toUpperCase();
        
            // # 2. Create a String
            // Put split() String into an array of Char []

        str = str.toLowerCase();
        String[] sentence = str.split(" ");

            // # 4. Iterate through the String[] array 
            // Run through an if caulse: if <= Upper, 
                // word.toUpperCase();
                // for(String word: sentence) {  //Enhanced for loop to display entered word
                //     // System.out.println("word: " + word);
                // }
        String iterated = "";
        String reconstructed = "";

        for(int i = 0; i < sentence.length; i++) {
            int upper = upLimit(sentence[i]);
            // System.out.println("upper: " + upper);
            for (int j = 0; j < sentence[i].length(); j++){
                // System.out.println("word " + i + ": " +
                //   sentence[i]);

                String word = sentence[i];
                String[] words = word.split("");
                
                // System.out.println("letter: " + words[j]);
                if( j < upper) {
                    iterated = words[j].toUpperCase();
                    // System.out.println("iterated: " + words[j].toUpperCase() + ", index: " + j);
                }
                else if (j >= upper) {
                    iterated = words[j];
                    // System.out.println("iterated: " + words[j] + ", index: " + j);

                }
                if( j == sentence[i].length() - 1) {
                    iterated += " ";
                }           
            reconstructed = reconstructed + iterated;
            }
        }
        System.out.println("\n");
        System.out.println("reconstructed:\n" + reconstructed);

            // # 5. Create a method that intergrates all 
            //     of these things
        return str;
    }

        // # 3. Find the length of the String
        // Divide the length by two and subtract the lesser number from the length
        // Upper ==  str.length - (str.length / 2)
        public static int upLimit(String str) {
                int len = str.length() - 1;
                int upper = len - (len / 2);
                return upper;
        
    }
}

/**===================================== */
// if(i < upper) {
            //     String sub = sentence[i].toUpperCase();
            //     System.out.println("sub: " + sub);
            //     // sentence[i] = sentence[i].toUpperCase();
            // }
            // else if (i >= upper) {
            //     // System.out.println("sentence[" + i + "]: " + sentence[i]);
            //     System.out.println("word: " + sentence[i]);
            // }
