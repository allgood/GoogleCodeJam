package com.todobom.codejam2016.Round1B;

import java.util.Scanner;

public class GettingTheDigits {
	public static void main(String ... allgood) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		String[] namesFirst = {"ZERO","WTO","UFOR","XSI","GEIHT"};
		int[] numbersFirst = {0,2,4,6,8};
		String[] namesSecond = {"ONE","THREE","FIVE","SEVEN"};
		int[] numbersSecond = {1,3,5,7};
		for (int t = 1; t <= numCases; t++)
		{
			int[] letterCount = new int[26];
			int[] digitCount = new int[10];

			String puzzle = input.next();
			
			int l = puzzle.length();
			
			for (int i=0; i<l; i++) {
				int c = puzzle.charAt(i)-65;
				letterCount[c]++;
			}
			
			for (int i=0; i<namesFirst.length; i++) {
			    int keyCount=letterCount[namesFirst[i].charAt(0)-65];
				if (keyCount>0) {
					for (int j=0; j<namesFirst[i].length();j++) {
						letterCount[namesFirst[i].charAt(j)-65] -= keyCount;
					}
					digitCount[numbersFirst[i]] += keyCount;
					l -= (keyCount*namesFirst[i].length());
				}
			}
			
			for (int i=0; i<namesSecond.length; i++) {
			    int keyCount=letterCount[namesSecond[i].charAt(0)-65];
				if (keyCount>0) {
					for (int j=0; j<namesSecond[i].length();j++) {
						letterCount[namesSecond[i].charAt(j)-65] -= keyCount;
					}
					digitCount[numbersSecond[i]] += keyCount;
					l -= (keyCount*namesSecond[i].length());
				}
			}
			
			digitCount[9] += l/4;
			
			String answer="";
			for (int i=0; i<10; i++) {
				for (int j=digitCount[i];j>0;j--) {
					answer += i;
				}
			}
			
			
			System.out.println("Case #"+t+": "+answer);
		}
		input.close();
	}

}
