package testcases;

import java.util.Scanner;

public class JavaReader {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your number:");
		int n = reader.nextInt();
		
		System.out.println("The number entered is:"+n);
		
	}

}
