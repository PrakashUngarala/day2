package day2;


import java.util.Scanner;
/*
 * Question 17:
Count and Print Duplicate Elements.
 Write a program to count the number of duplicate elements
 in an array {1, 2, 2, 3, 4, 4, 5} and print those duplicate elements.
 */
public class DuplicateElements {

	public static void uniqueElements(int [] arr) {
		int duplicateEle=0;
		
		int duplicatesarr[]= new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			int count = 0;
			for(int j =0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					//break;
				}
			}
			if(count>1) {
				int flag =0;
				for(int val : duplicatesarr) {
					if(val == arr[i])flag =1;
				}
				if(flag == 1) continue;
				duplicatesarr[duplicateEle++]=arr[i];

			}
		}
		for(int i=0;i<duplicateEle;i++) {
			System.out.println(duplicatesarr[i]);
		}
		System.out.println("count of duplicate elements are : "+duplicateEle);
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

