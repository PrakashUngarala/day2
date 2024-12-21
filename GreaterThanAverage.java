package day2;

import java.util.Scanner;

/*
 * Question 12:
 Count Elements Greater than Average.
 Write a program to count how many elements in the array
 {10, 20, 30, 40, 50}
 are greater than the average of all the elements.
 

 */
public class GreaterThanAverage {

	public static int greaterThanAvg(int []arr) {
		int sum=0,count=0;
		for(int val :arr) {
			sum = sum+val;
		}
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>sum/arr.length) {
				count++;
			}
		}
		return count;
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
		System.out.println("the number of elements are greater than avg :"+greaterThanAvg(arr));
	}

}
