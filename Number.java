// Write a program to identify of the a number is positive or negative.
import java.util.*;

class Number{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if(n>0){
			System.out.println(n+" is positive number");
		}
		else{
			System.out.println(n+" is negative number");
		}
	}
}
