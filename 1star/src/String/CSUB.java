package String;

import java.util.ArrayList;
import java.util.Scanner;

public class CSUB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int t =scanner.nextInt();
		while(t-->0) {
			int n =scanner.nextInt();
			String string=scanner.next();
			
			int ones=0;
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='1') {
					ones++;
				}
			}
			
//			ArrayList<String> arrayList=new ArrayList<>();
//			for(int i=1;i<=n;i++) {
//				for(int j=0;j<n-i+1;j++) {
//					arrayList.add(string.substring(j,j+i));
//				}
//			}
//			int count=0;
//			String str1="";
//			for(int i=0;i<arrayList.size();i++) {
//				str1=arrayList.get(i);
//				if(str1.charAt(0)=='1' && str1.charAt(str1.length()-1)=='1')count++;
//			}
			System.out.println(ones*(ones+1)/2);
		}

	}

}
