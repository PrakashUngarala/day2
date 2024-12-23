package day2;


import java.util.Scanner;

public class MinumElementInArray {

	public static int minInArray(int []arr) {
		int smallestEle = Integer.MAX_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<smallestEle) {
				smallestEle = arr[i];
			}
		}
		return smallestEle;
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
		
		
		System.out.println("smallest Element in array is :");
		System.out.println(minInArray(arr));
	}

}
