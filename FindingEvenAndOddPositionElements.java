package day2;
/*
 * Question 21:
 Write java method named findEvenandOddPositionElement that print
 all the elements which is present at even index and also in odd index.
 */
import java.util.Scanner;

public class FindingEvenAndOddPositionElements {

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the "+size+" elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Even elements are :");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd elements are :");
		for(int i=0;i<arr.length;i++) {
			if(i%2==1) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
