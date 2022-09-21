
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;  

/**
 * In this assignment, you will implement a simple class called CustomString.  This class represents a more customizable version 
 * of a String, with additional attributes and methods.  
 * For example, the CustomString class has a “reverse” method which returns a new string version of the current string where the 
 * capitalization is reversed (i.e., lowercase to uppercase and uppercase to lowercase) for the alphabetical characters specified 
 * in the given arg.  For CustomString “abc, XYZ; 123.”, calling reverse("bcdxyz@3210.") will return "aBC, xyz; 123.".  
 * 
 * The CustomString class also has a “remove” method which returns a new string version of the current string where the alphabetical 
 * characters specified in the given arg, are removed.  For CustomString "my lucky numbers are 6, 8, and 19.", calling remove("ra6") 
 * will return "my lucky numbes e 6, 8, nd 19.".
 * 
 */
public class CustomString 
{
	
	//instance variables
	
	/**
	 * Current string.
	 */
	String myString;
	
	/**
	 * Indicates if the current string myString has been set (not null).
	 */
	boolean isSet;
	
	//constructor
	
	/**
	 * Initializes current string myString to null.
	 * Initializes isSet to false.
	 */
	public CustomString() 
	{
		// TODO Implement constructor
		this.myString = null;
		this.isSet = false;
	}

	// methods 
	
    /**
     * Returns the current string.
     * If the current string is null, or has not been set to a value with setString, it should return null.
     * @return current string
     */
	public String getString() 
	{
		// TODO Implement method
		if(this.myString == null || this.isSet == false)
			return null;
		else
			return this.myString;
		
	}

	/**
     * Sets the value of the current string and sets this.isSet to true.
     * If the given string is null, sets this.isSet to false.
     * @param string value to be set
     */
	public void setString(String string) 
	{
		// TODO Implement method
		if(string == null)
			this.isSet = false;
		else
		{
			this.myString = string;
			this.isSet = true;
		}
	}

    /**
     * Returns a new string version of the current string where the alphabetical characters specified in the given arg, are removed.
     *   
     * The alphabetical characters to be removed are case insensitive.  
     * All non-alphabetical characters are unaffected.
     * If the current string is null, empty, or has not been set to a value, this method should return an empty string.
     *
     * Example(s):
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("ra6") would return "my lucky numbes e 6, 8, nd 19."
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("6,.") would return "my lucky numbers are 6, 8, and 19."
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("") would return "my lucky numbers are 6, 8, and 19."
     * 
     * Remember: This method builds and returns a new string, and does not directly modify the myString field.
     * 
     * @param arg the string containing the alphabetical characters to be removed from the current string
     * @return new string in which the alphabetical characters specified in the arg are removed
     */
	public String remove(String arg) 
	{
		// TODO Implement method
		String newString = "";
		
		if(this.myString == null || this.myString.isEmpty() || this.isSet == false)
			return newString;
		else
		{
			newString = this.myString;
			
			String temp;
			
			for(int i=0; i<arg.length(); ++i)
			 {
				temp = "";
						
				if(Character.isLetter(arg.charAt(i)))
				{
					for(int j=0; j<newString.length(); ++j)
					{
						if(newString.charAt(j) != arg.charAt(i))
							temp = temp + newString.charAt(j);
					}	
					
					newString = temp;
				}
				
			 }
				 
			 return newString;
		}
	
	}
	
	/**
	 * Returns a new string version of the current string where the capitalization is reversed (i.e., lowercase to uppercase, 
	 * and uppercase to lowercase) for the alphabetical characters specified in the given arg.
	 *   
	 * All non-alphabetical characters are unaffected.
	 * If the current string is null, empty, or has not been set to a value, this method should return an empty string.
	 *
	 * Example(s):
	 * - For a current string "abc, XYZ; 123.", calling reverse("bcdxyz@3210.") would return "aBC, xyz; 123."
	 * - For a current string "abc, XYZ; 123.", calling reverse("6,.") would return "abc, XYZ; 123."
	 * - For a current string "abc, XYZ; 123.", calling reverse("") would return "abc, XYZ; 123."
	 * - For a current string "", calling reverse("") would return ""
	 * 
	 * Remember: This method builds and returns a new string, and does not directly modify the myString field.
	 * 
	 * @param arg the string containing the alphabetical characters to have their capitalization reversed in the current string
	 * @return new string in which the alphabetical characters specified in the arg are reversed
	 */
	public String reverse(String arg) 
	{
		// TODO Implement method 
		String newString = "";
		
		if(this.myString == null || this.myString.isEmpty() || this.isSet == false)
			return newString;
		else
		{
			newString = this.myString;
			
			String temp;
			
			for(int i=0; i<arg.length(); ++i)
			 {
				temp = "";
						
				if(Character.isLetter(arg.charAt(i)))
				{
					for(int j=0; j<newString.length(); ++j)
					{
						char c1 = newString.charAt(j);
						char c2 = arg.charAt(i);
						
						if(Character.toLowerCase(c1) == Character.toLowerCase(c2))
						{
							if(Character.isLowerCase(c1))
								temp = temp + Character.toUpperCase(c1);
							else
								temp = temp + Character.toLowerCase(c1);
						}
						else
							temp = temp + c1;
					}	
					
					newString = temp;
				}
				
			 }
				 
			 return newString;
		}
	}

    /**
     * Returns a new string version of the current string where all the letters either >= or <= the given char n, are removed.  
     * 
     * The given letter may be a-z or A-Z, inclusive.
     * The letters to be removed are case insensitive.
     *
     * If 'more' is false, all letters less than or equal to n will be removed in the returned string.
     * If 'more' is true, all letters greater than or equal to n will be removed in the returned string.
     *
     * If the current string is null, the method should return an empty string.
     * If n is not a letter (and the current string is not null), the method should return an empty string.
     *
     * Example(s):
     * - For a current string "Hello 90, bye 2", calling filterLetters('h', false) would return "llo 90, y 2"
     * - For a current string "Abcdefg", calling filterLetters('c', false) would return "defg"
     * - For a current string "Hello 90, bye 2", calling filterLetters('h', true) would return "e 90, be 2"
     * - For a current string "Abcdefg", calling filterLetters('c', true) would return "Ab"
     * 
     * Remember: This method builds and returns a new string, and does not directly modify the myString field.
     *
     * @param n char to compare to
     * @param more indicates whether letters <= or >= n will be removed
     * @return new string with letters removed 
     */
	public String filterLetters(char n, boolean more) {
		// TODO Implement method
		String newString = "";
		
		if(this.myString == null || this.myString.isEmpty() || this.isSet == false || !Character.isLetter(n))
			return newString;
		else
		{			
			if(more)
			{
				for(int i=0; i<this.myString.length(); ++i)
				{
					char c = myString.charAt(i);
					
					if(Character.isLetter(c))
					{
						if((c >= 'a' && c < Character.toLowerCase(n)) || (c >= 'A' && c < Character.toUpperCase(n)))
							newString = newString + c;						
					}
					else
						newString = newString + c;
				}
			}
			else
			{
				for(int i=0; i<this.myString.length(); ++i)
				{
					char c = myString.charAt(i);
					
					if(Character.isLetter(c))
					{
						if((c > Character.toLowerCase(n) && c <= 'z') || (c > Character.toUpperCase(n) && c <= 'Z'))
							newString = newString + c;
					}
					else
						newString = newString + c;
				}
			}
			
			return newString;
		}
		
	}
}
