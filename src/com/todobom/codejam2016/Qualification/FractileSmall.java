package com.todobom.codejam2016.Qualification;

import java.math.BigInteger;
import java.util.Scanner;

public class FractileSmall {
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
			
			if (s<k) {
				throw new Exception("This code shouldn't be used with the large input");
			}
			
			BigInteger step = BigInteger.valueOf(k).pow(c-1);
			for (int b=0; b<s; b++) {
				BigInteger bi = BigInteger.valueOf(b).multiply(step);
				BigInteger tile = bi.add(BigInteger.ONE) ;
				answer += " "+tile.toString();
			}
			
			System.out.println("Case #"+t+":"+answer);
		}
	}

}
