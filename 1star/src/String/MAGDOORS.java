package String;

import java.util.Scanner;

public class MAGDOORS {
	
	static void rev(int[] str,int n) {
		for(int j=n;j<str.length;j++) {
			if(str[j]==0) {
				str[j]=1;
			}
			else {
				str[j]=0;
			}
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0) {
			String string=sc.next();
			int[] arr=new int[string.length()+10];
			for(int i=0;i<string.length();i++) {
				arr[i]=string.charAt(i)-'0';
			}
			int flag=0;
			int count=0;
//			for(int i=0;i<arr.length;i++) {
//				if(arr[i]==0) {
//					count++;
//					rev(arr,i);
//				}
//			}
			
			
			
			for(int i=0;i<string.length();i++) {
				if(arr[i]==flag) {
					count++;
					if(flag==0)flag=1;
					else flag=0;

				}
			}
			System.out.println(count);
		}

	}

}
