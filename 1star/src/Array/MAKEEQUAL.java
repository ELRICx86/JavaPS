package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MAKEEQUAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t;
		Scanner scanner= new Scanner(System.in);
		t= scanner.nextInt();
		
		while(t-->0) {
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
			}
		
		Arrays.sort(arr);
		System.out.print(arr[n-1]-arr[0]);
		
		
		}

	}

}
