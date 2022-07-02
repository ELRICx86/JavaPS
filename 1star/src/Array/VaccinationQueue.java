package Array;

import java.util.Scanner;

public class VaccinationQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner scanner= new Scanner(System.in);
		t= scanner.nextInt();
		
		while(t-->0) {
			int n,p,x,y;
			n=scanner.nextInt();
			p=scanner.nextInt();
			x=scanner.nextInt();
			y=scanner.nextInt();
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=scanner.nextInt();
			}
			int sum=0;
			for(int i=0;i<p;i++) {
				if(arr[i]==0) {
					sum+=x;
				}
				else {
					sum+=y;
				}
			}
			
			
			System.out.println(sum);
			
			
			
			
			
			
			}

	}

}
