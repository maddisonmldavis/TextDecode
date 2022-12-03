/**
 * The purpose of this program is to demonstrate the use of several 
 * methods of the String class.
 */
public class TextmessageV1 
{
	public static void main(String[ ] args)
	{
	    //determine the length of the String object called odString
	    String oldString = "I love you, forever";
	    System.out.println("Old string: " + oldString);
	    int stringLength = oldString.length();
	    System.out.println("Number of characters: " + stringLength);
	    System.out.println();
	   	
	    //replace characters within the String object
	    String replaceCharacters = oldString.replace("forever", "4eva");
	    replaceCharacters = replaceCharacters.replace("I love you", "I<3U");
	    System.out.println("Replacement characters: " + replaceCharacters);
	    System.out.println();
	    int stringLength2 = replaceCharacters.length();
	    System.out.println("Replacment Charcters: " + stringLength2);
	    System.out.println();
	   	
	  
	    
	    //remove all the vowels from the string object.
	    String newString1 = oldString.replaceAll("[aeiou]", "");
	    System.out.println("New string: " + newString1);
	    System.out.println();
	    
	    //move first word to the end of the string object
	    int positionOfSpace = oldString.indexOf(' ');
	    String substring1 = oldString.substring(0, positionOfSpace);
	    String substring2 = oldString.substring(positionOfSpace, stringLength);	    
	    String newString2 = substring2 + " " + substring1;
	    System.out.println("New substring: " + newString2);
	    System.out.println();
	    
	}//end of main method
}//end of class

