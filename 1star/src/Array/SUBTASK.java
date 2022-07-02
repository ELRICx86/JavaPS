package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SUBTASK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner scanner= new Scanner(System.in);
		t= scanner.nextInt();
		
		while(t-->0) {
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
			}
		int sum=0;
		int sum1=0;
		
		for(int j=0;j<m;j++) {
			sum1+=arr[j];
			
		}
		
		
		for(int j=0;j<n;j++) {
			sum+=arr[j];
			
		}
		
		if(sum1==m && sum==n) {
			System.out.println(100);
		}
		else if(sum1==m && sum!=n) {
			System.out.println(k);
		}
		else {
			System.out.println(0);
		}
		
		

	}

}
}
