package com.javafiles;

public class Multiplication {
	int a=10,b=10;	
	private void multiply() {
		int prod=multiplyTwoNumber(a, b);
		System.out.println("Result:"+prod);

	}
	
	private void multiplyTwoNumber(int a, int b) {
		int prod=a*b;
		System.out.println(prod);
	}
	private void multiplyThreeNumber(int a, int b, int c) {
		int prod=a*b*c;
		System.out.println(prod);
	}
	private void multiplyFourNumber(int a, int b, int c, int d) {
		int prod=a*b*c*d;
		System.out.println(prod);
	}
}
