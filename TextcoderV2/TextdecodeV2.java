/**
 * The purpose of this program is to demonstrate the use of several 
 * methods of the String class. And then turn to a scanner class 
 *
 */
import java.util.Scanner;
public class TextdecodeV2 {  
	public static void main(String[ ] args)
	{
	    
	    //determine the length of the String object called odString
	    
	    Scanner in;
        in = new Scanner(System.in); 
        System.out.print("/n");
        
        //user friendly orginal input 
	    System.out.println("Enter sentence to be decoded:    ");
        String first = in.next();
        String rest = in.nextLine();
        String whole = first + rest; 
	    System.out.println("You entered :   " + whole);
	    int stringLength = first.length();
	    int stringLengthRest = rest.length();
	    int stringLengthWhole = whole.length();
	    System.out.println("Number of characters: " + stringLengthWhole);
	    System.out.println();
	    
	     //replace characters within the String object
	    String replaceCharacters = whole.replace("e", "3");
	    replaceCharacters = replaceCharacters.replace("s" + "S", "5");
	    replaceCharacters = replaceCharacters.replace("i", "7");
	    replaceCharacters = replaceCharacters.replace("e", "3");
        System.out.println("Replacement characters: " + replaceCharacters);
	    System.out.println();
	    int stringLength2 = replaceCharacters.length();
	    System.out.println("Replacment Charcters: " + stringLength2);
	    System.out.println();
	    
	    	    //remove all the vowels from the string object.
	    String newString1 = whole.replaceAll("[aeiou]", "");
	    System.out.println("New string: " + newString1);
	    int stringLengthNewString = newString1.length();
	    System.out.println( "Length after being shortened  :  " + stringLengthNewString );
	    System.out.println();
	    
	    	    //move first word to the end of the string object
	    int positionOfSpace = whole.indexOf(' ');
	    String substring1 = whole.substring(0, positionOfSpace);
	    String substring2 = whole.substring(positionOfSpace, stringLengthWhole);	    
	    String newString2 = substring2 + " " + substring1;
	    System.out.println("New substring: " + newString2);
	    System.out.println();
	   	
	    
	    
	    
	}//end of main method
}//end of class

