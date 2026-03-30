/*Use .subSequence Menthod for rest of program.*/
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class StrPlus{

        public static void main (String[] args) throws IOException
        {
                File file = new File("/home/leblance7/BionicReading/DonFlamingo.txt");
//Make ArrayList<String> DonMingo 
                ArrayList<String> DonMingo = rText(file); 
                System.out.println("fileName\n: " + DonMingo);
                System.out.println("Okie Dokie");
        }

        public static ArrayList<String> rText (File file)
                throws IOException {
/*Create a Scanner Obj for file*/
                Scanner input = new Scanner(file);
/* Create an Arraylist to creant an element for each string line*/
                ArrayList<String> DonMingo = new ArrayList<>();
                String line = "";

/*Use while() to iterate through each line adding to ArrayList
 *      Don Mingo*/
                while (input.hasNext()) {
                        line = input.nextLine();
                        DonMingo.add(line);
                }
                return DonMingo;
        }
}
/*Put the string into an ArrayList<String> arylst
 *      - Add by tokening each line of the string and add each one as an element.
 * Use the delimiter in reverse,
 *      Start by finding the last work break.
 *      If last word break exceds MxChrLmit.
 *      Create new line and paste chr words into the next
 *              NewStrPlus.
 */
