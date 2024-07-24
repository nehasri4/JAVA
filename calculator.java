//java program to implement a simple calculator
import java.util.Scanner;
import java.lang.*;
import java.lang.Math;
import java.io.*;
class calculator{
	public static void main(String[] args){
		char operator;
		Double n1,n2,result;
		//create an object of Scanner class
		Scanner input = new Scanner(System.in);
		//ask users to enter operator
		System.out.println("Choose an operator: +,-,*,/");
		operator = input.next().charAt(0);
		//ask users to enter numbers
		System.out.println("enter first number:");
		n1 = input.nextDouble();
		System.out.println("enter second number:");
		n2 = input.nextDouble();
		switch(operator){
			case'+':
				result = n1 + n2;
				System.out.println(n1+ "+" +n2+ "=" +result);
				break;
			case'-':
				result = n1 - n2;
				System.out.println(n1+ "-" +n2+ "=" +result);
				break;
			case'*':
				result =  n1*n2;
				System.out.println(n1+ "*" +n2+ "=" +result);
				break;
			case'/':
				result = n1/n2;
				System.out.println(n1+ "/" +n2+ "=" +result);
				break;
			default:
				System.out.println("invalid operator");
				break;
		 }
		 input.close();
	}
}
		
