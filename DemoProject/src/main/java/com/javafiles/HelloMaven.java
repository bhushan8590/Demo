package com.javafiles;

public class HelloMaven {

	public static void main(String[] args) {
		System.out.println("Hello Maven...!!");
		System.out.println("Hello STS...!!");
		System.out.println("Hello All Welcome...!!");
		System.out.println("Another Hello...!!");
		System.out.println("Hello FTR-308...!!");
		welcome();
	}

	private static void welcome() {
		greet();
		getHelloFromFun();
		
	}

	private static void greet() {
		System.out.println("Welcome to Maven..!!");
		
	}

	private static void getHelloFromFun() {
		System.out.println("Hello from Function..!!");
		
	}

}
