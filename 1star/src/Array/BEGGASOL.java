package Array;

import java.util.Scanner;

public class BEGGASOL {

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
		
		int sum =arr[0];
		int req=arr[0];
		for(int i=1;i<n;i++) {
			
			if(req<=0) {
				break;
			}

			
			sum+=arr[i];
			req+=arr[i]-1;

			

			}
		
		System.out.println(sum);

	}

}
}
