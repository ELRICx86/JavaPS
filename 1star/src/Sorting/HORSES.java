package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HORSES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int t=sc1.nextInt();
		while(t-->0) {
			int n=sc1.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i] =sc1.nextInt();
			}
			
			Arrays.sort(arr);
			int x=0;
			int min=1000000000;
			for(int i=1;i<n;i++) {
				x=Math.abs(arr[i]-arr[i-1]);
				if(x<=min)min=x;
			}
			
			System.out.println(min);
		

	}

}
}
