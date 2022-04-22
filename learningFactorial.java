package week1.day1;

import java.util.Scanner;

public class learningFactorial {

	public static void main(String[] args) {
		int i;
		long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println(fact);

	}

	}
}
