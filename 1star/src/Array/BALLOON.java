package Array;

import java.util.Scanner;

public class BALLOON {

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
		
		int req=0;
		int total=0;
		
		for(int i=0;i<n;i++) {
			if(req==7) {
				break;
			}
			
			if(arr[i]<=7) {
				req++;
			}
			total++;
		}
		System.out.println(total);


	}

}
}
