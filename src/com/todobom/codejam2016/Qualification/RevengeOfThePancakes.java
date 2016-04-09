package com.todobom.codejam2016.Qualification;

import java.util.Scanner;

public class RevengeOfThePancakes {
	public static void main(String ... allgood) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		for (int t = 1; t <= numCases; t++)
		{
			String a;
			a = input.next();
			
			int c = 0;
			char l = a.charAt(0);
			
			for (int j = 1 ; j<a.length(); j++) {
				char p = a.charAt(j);
				
				if ( p != l) {
					c++;
					l=p;
				}
			}
			
			if ( l == '-') {
				c++;
				l='+';
			}
			
			
			System.out.println("Case #"+t+": "+c);
		}
	}

}
