package day2;

import java.util.Scanner;
/*
 * Question 16:
Count and Print Distinct Elements.
 Write a program to count the number of distinct/unique/non repeated
 elements in an array {1, 2, 2, 3, 4, 4, 5} and print those unique
 elements.
 */
public class PrintUniqueElements {

	public static void uniqueElements(int [] arr) {
		int uniqueEle=0;
		for(int i =0;i<arr.length;i++) {
			int count = 0;
			for(int j =0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					//break;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
				uniqueEle++;
			}
		}
		System.out.println("count of unique elements are : "+uniqueEle);
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
		
		
		System.out.println("output  :");
		uniqueElements(arr);
	}
}
