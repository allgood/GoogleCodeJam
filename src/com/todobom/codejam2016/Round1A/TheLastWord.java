package com.todobom.codejam2016.Round1A;

import java.util.Scanner;

public class TheLastWord {
	public static void main(String ... allgood) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		for (int t = 1; t <= numCases; t++)
		{
			String answer="";
			String word = input.next();
			char firstChar = 0;
			
			for ( int i=0 ; i<word.length() ; i++) {
				char thisChar = word.charAt(i);
				if (thisChar>=firstChar) {
					answer = thisChar + answer;
					firstChar = thisChar;
				} else { 
					answer += thisChar;
				}
			}
			
			System.out.println("Case #"+t+": "+answer);
		}
		input.close();
	}
}
