package Sorting;

import java.util.Scanner;

public class LINCHESS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1=new Scanner(System.in);
		int t=sc1.nextInt();
		while(t-->0) {
			int n=sc1.nextInt();
			int k=sc1.nextInt();
			int x=0;
			int max=0;
			for(int i=0;i<n;i++) {
				
				
				x=sc1.nextInt();
				if(k>=x && k%x==0 )
				max = Math.max(max, x);
			}
			
			if(max==0)System.out.println(-1);
			else System.out.println(max);
			
		}

	}

}
