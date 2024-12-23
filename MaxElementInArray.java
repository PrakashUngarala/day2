package day2;

import java.util.Scanner;

public class MaxElementInArray {

	public static int maxInArray(int []arr) {
		int largestEle = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>largestEle) {
				largestEle = arr[i];
			}
		}
		return largestEle;
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
		
		
		System.out.println("largest Element in array is :");
		System.out.println(maxInArray(arr));
	}

}
