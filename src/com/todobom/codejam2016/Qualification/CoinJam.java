package com.todobom.codejam2016.Qualification;

import java.math.BigInteger;
import java.util.Scanner;

public class CoinJam {
	public static void main(String ... allgood) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		for (int t = 1; t <= numCases; t++)
		{
			System.out.println("Case #"+t+": ");
			int n = input.nextInt();
			int j = input.nextInt();
			int c = 0;
			BigInteger v = new BigInteger("1",2).add((new BigInteger("2")).pow(n-1) );
			BigInteger l = (new BigInteger("2")).pow(n);
			for ( ; c<j && v.compareTo(l)<0 ; v=v.add(BigInteger.valueOf(2))) {
				
				String answer = v.toString(2);
				int i;
				for ( i = 2 ; i<=10 ; i++) {
					BigInteger fcd = firstCompositeDivisor(new BigInteger(v.toString(2),i));
					if (fcd.compareTo(BigInteger.ZERO)>0) {
						answer = answer + " " + fcd.toString();
					} else {
						i = 12;
					}
				// BigInteger b = new BigInteger(v.toString(2),i);
				// System.out.println(" "+i+": "+b.toString()+" "+sqrt(b));
				}
				if (i<12) {
					c++;
					System.out.println(answer);
				}
			}
		}
	}
	
	
	private static BigInteger firstCompositeDivisor(BigInteger v) {
		
		// BigInteger s = sqrt(v);

		// work only with small divisors, better go to the next if 
		// it takes too long.
		BigInteger s = BigInteger.valueOf(30000);
		
		for ( BigInteger d = new BigInteger("2"); d.compareTo(s) <= 0 ; d=d.add(BigInteger.ONE)) {
			
			if ( v.mod(d).compareTo(BigInteger.ZERO) == 0) {
				return d;
			}
		}
		
		return BigInteger.ZERO;
	}
	
	// dead code - not worth to test every divisor
	static BigInteger sqrt(BigInteger n) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
		while(b.compareTo(a) >= 0) {
			BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
			if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
			else a = mid.add(BigInteger.ONE);
		}
		return a.subtract(BigInteger.ONE);
	}
	
}
