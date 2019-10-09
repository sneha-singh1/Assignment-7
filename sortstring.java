// Java program to sort a string alphabetically 

import java.util.Arrays;

import java.util.Scanner;


public class sortstring 
{ 
	public static String sortString(String inputString) 
	{ 
		char tempArray[] = inputString.toCharArray(); 
		
		Arrays.sort(tempArray); 
	
		return new String(tempArray); 
	} 
	
	public static void main(String[] args) 
	{ 
        Scanner s=new Scanner(System.in);
        String inputString = ""; 
        inputString=s.next();
		String outputString = sortString(inputString); 
		
		System.out.println("Input String : " + inputString); 
		System.out.println("Output String : " + outputString); 
	} 
} 
