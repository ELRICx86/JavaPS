package String;

import java.security.Identity;
import java.util.ArrayList;
import java.util.Scanner;

public class SNAKPROC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1=new Scanner(System.in);
		int t=sc1.nextInt();
		while(t-->0) {
			int n=sc1.nextInt();
			String str1=sc1.next();
			ArrayList<Character> aList=new ArrayList<>();
			Boolean flag=false;
			char c='H';
			for(int i=0;i<n;i++) {
				if(str1.charAt(i)!='.') {
					aList.add(str1.charAt(i));
				}
			}
			
			
			if(aList.isEmpty())System.out.println("VALID");
			else if(aList.get(0)=='T') {
				System.out.println("INVALID");
				
			}
			else if(aList.size()%2!=0)System.out.println("INVALID");
			else {
				for(int i=1;i<aList.size();i++) {
					if(aList.get(i)==aList.get(i-1)) {
						flag=true;
					}
				}
				
				if(flag)System.out.println("INVALID");
				else System.out.println("VALID");
			}
			
			
			
			
			
		}

	}

}
