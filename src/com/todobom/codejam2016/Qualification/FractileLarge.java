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
			
			int k = input.nextInt();
			int c = input.nextInt();
			int s = input.nextInt();
			
			BigInteger step = BigInteger.valueOf(k).pow(c-1);
			BigInteger length = BigInteger.valueOf(k).pow(c);
			for (int b=0; b<k; b++) {
				BigInteger bi = BigInteger.valueOf(b).multiply(step);
				if (b<k-1 && c>1) {
					b++;
				}
				BigInteger tile = bi.add(BigInteger.valueOf(b+1));
				if (tile.compareTo(length)>0) {
					tile = tile.subtract(BigInteger.ONE);
				}
				answer += " "+tile.toString();
				s--;
				if (s<0 || tile.compareTo(length)>0) {
					answer = " IMPOSSIBLE";
					break;
				}
			}
			
			System.out.println("Case #"+t+":"+answer);
		}
	}
}
