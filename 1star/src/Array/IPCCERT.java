package Array;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class IPCCERT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t,m,k;
		Scanner scanner= new Scanner(System.in);
		t= scanner.nextInt();
		m= scanner.nextInt();
		k= scanner.nextInt();
		int total=0;
		
		while(t-->0) {
			int[] arr=new int[k+1];
			for(int i=0;i<k+1;i++) {
				arr[i]=scanner.nextInt();
			}
			//System.out.println(Arrays.toString(arr));
			int sum=0;
			for(int i=0;i<k;i++) {
				sum+=arr[i];
			}
			//System.out.println(sum);
			
			if(sum>=m && arr[k]<=10) {
				total++;
			}
			
			
			
			
		}
		System.out.println(total);

	}

}
