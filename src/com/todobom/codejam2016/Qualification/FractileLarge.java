package com.todobom.codejam2016.Qualification;

import java.math.BigInteger;
import java.util.Scanner;

public class FractileLarge {
	public static void main(String ... allgood) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		for (int t = 1; t <= numCases; t++)
		{
			String answer="";
		
			/*
			 * Fixed using the official problem analysis in
			 * https://code.google.com/codejam/contest/6254486/dashboard#s=a&a=3
			 */
			
			int k = input.nextInt();
			int c = input.nextInt();
			int s = input.nextInt();

			// step in C interval, since there is one tile
			// in the final art that can tell if any C tiles of
			// the original is gold.
			if (c*s < k) {
				answer = " IMPOSSIBLE";
			} else {
				BigInteger p;
				for (int i=1; i<k+1; i+=c) {

					// loop to find the most significant tile
					p = BigInteger.ONE;
					for (int j=0; j<c; j++) {
						p = (p.subtract(BigInteger.ONE)).multiply(BigInteger.valueOf(k)).add(BigInteger.valueOf(Math.min(i+j, k)));
					}
					answer += " "+p.toString();
				}
			}
			
			System.out.println("Case #"+t+":"+answer);
		}
	}
}
