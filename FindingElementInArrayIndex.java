package day2;

import java.util.Scanner;

public class FindingElementInArrayIndex {

	public static int retivingIndex(int []arr,int element) {
		
		int ele = -1;
		for(int i=0;i<arr.length;i++) {
			if(element == arr[i]) {
				ele = i; // here i want least position of value
			}
			
			
		}
		return ele;
		
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
		System.out.println("Enter the element you are searching : ");
		int ele = sc.nextInt();
		int res = retivingIndex(arr, ele);
		System.out.println(res == -1 ? "Element not found" : "Elemet found at Index : "+res);
		
		
		
	}

}
