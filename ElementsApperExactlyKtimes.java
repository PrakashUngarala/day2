package day2;

import java.util.Scanner;

/*
 * write a program to check how many elements appers exactly k times
 */
public class ElementsApperExactlyKtimes {
	
	public static void retivingElements(int [] arr,int k) {
		int [] greaterThenK= new int[arr.length];
		int count=1; //1 1 2 2 3
		int greaterCount =0;
		int flag =0;
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count == k) {
				flag =0;
				for(int y=0;y<greaterCount;y++) {
					if(greaterThenK[y] == arr[i]) {
						flag =1;
					}
				}
				if(flag==0) {
					System.out.println(arr[i]);
					flag =1;//checked
				}
				
			}else if(count>k){
				greaterThenK[greaterCount] = arr[i];
				greaterCount++;
			}
			count=1;
		}
		if(flag ==0) {
			System.out.println("No element found");
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
		
		System.out.println("Enter the no of times element repeted :");
		int k = sc.nextInt();
		System.out.println("output :");
		retivingElements(arr,k);
	}

}
