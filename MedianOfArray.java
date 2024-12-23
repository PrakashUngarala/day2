package day2;

import java.util.Scanner;
/*
 * Question 20:
Find the median of a sorted array.
    Test Case: 1
  ----------------
   Array size: 6
   Elements are: 1, 2, 3, 4, 5, 6
   Median is: 3.5
  Test Case: 2
  ----------------
   Array size: 5
   Elements are: 1, 2, 3, 4, 5
   Median is: 3

 */
public class MedianOfArray {

	public static double medianOfArray(int [] arr) {
		
		int [] ascArr =arr;
		for(int i=0;i<ascArr.length;i++) {
			for(int j = i+1;j<ascArr.length;j++) {
				if(ascArr[i]>ascArr[j]) {
					int ele = ascArr[i];
					ascArr[i]=ascArr[j];
					ascArr[j]=ele;
				}
			}
		}
		
		if(ascArr.length%2 == 1) {
			int position = (ascArr.length+1)/2;
			return ascArr[position-1];
		}
		else {
			int position = ascArr.length/2;
			
			return (double)(ascArr[position-1]+ascArr[position])/2; //here it returns the positions but we need index so -1
			
		}
		
		
		
		//return median;
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
		
		System.out.println("The median is : "+medianOfArray(arr));
		
		
	}

}
