package day2;

import java.util.Scanner;

/*
 * Question 11:
 Count Odd and Even Numbers
 Given an array {1, 2, 3, 4, 5, 6}, write a program to count how many
 elements are odd and how many are even.


 */


public class CountEvenOddArrQ1 {

	public static void evenAndOddCount(int [] arr) {
		int evenCount=0;
		int oddCount=0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
				
			}else {
				oddCount++;
			}
		}
		System.out.println("Even numbers in the array is "+evenCount);
		System.out.println("Odd numbers in the array is "+oddCount);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the "+size+" elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	
		System.out.println("output :");
		evenAndOddCount(arr);
	}

}
