package day2;

import java.util.Scanner;

/*
 * Question 13: Find the Majority element.
 Print the Element which appeared More than n/2 Times.
 [n is length of the array]
 
 Write a program to find an element in an array
 {3, 3, 4, 2, 4, 4, 2, 4, 4}
 that appears more than n/2 times. If no such element exists,
 display "No majority element."

 */
public class AppersMajorityElement {

	public static int majorityElement(int [] arr) {
		int halfOfArr = arr.length/2;
		int count=1;
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count > halfOfArr) {
				return arr[i];
			}
			count = 1;
		}
		return Integer.MIN_VALUE;
		
		
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
		int res = majorityElement(arr);
		if(res==Integer.MIN_VALUE) {
			System.out.println("No majority element."
);
		}else {
			System.out.println("The majority element is : "+res);
		}
	}
}
