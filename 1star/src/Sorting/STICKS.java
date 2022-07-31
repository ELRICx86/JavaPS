package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class STICKS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int t=sc1.nextInt();
		while(t-->0) {
			int n=sc1.nextInt();
			int[] arr=new int[10000+10];
			ArrayList<Integer> arrayList=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				int x=sc1.nextInt();
				arr[x]++;
			}
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>=2) {
					arrayList.add(i);
				}
			}
			
			Collections.sort(arrayList,Collections.reverseOrder());
			
			//System.out.println(arrayList);
			
			if(arr[arrayList.get(0)]>=4)
				System.out.println(arrayList.get(0)*arrayList.get(0));
			else if(arrayList.size()>=2){
				System.out.println(arrayList.get(0)*arrayList.get(1));
			}
			else {
				System.out.println(-1);
			}

		}

	}

}
