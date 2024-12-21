package day2;

import java.util.Scanner;

public class PrimeNumArr {

	public static void checkPrime(int [] arr) {
		
		for(int val : arr) {
			int flag =0;
			for(int i=2;i<val;i++) {
				if(val%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0 && val!=2) {
				System.out.println(val);
			}
			
		}
		
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
		
		
		System.out.println("prime numbers  :");
		checkPrime(arr);
	}
}
