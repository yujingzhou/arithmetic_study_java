package com.robert.first;

public class Simple {
	
	public static int gcd(int p, int q) {
		if(q == 0) {
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}
	
	public static void main(String[] args) {
		System.out.println(43 % 100);
		System.out.println(100 % 43);
		System.out.println(gcd(100, 43));
	}

}
