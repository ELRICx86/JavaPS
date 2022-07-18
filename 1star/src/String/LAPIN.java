package String;

import java.util.Scanner;

public class LAPIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			String str=sc.next();
			int ss=str.length();
			int[] s1,s2;
			s1=new int[27];
			s2=new int[27];
			
			
			for(int i=0;i<ss/2;i++) {
				s1[str.charAt(i)-'a']++;
				s2[str.charAt(ss-i-1)-'a']++;
			}
			
			int flag=0;
			for(int i=0;i<27;i++) {
				if(s1[i]!=s2[i]) {
					flag=1;
				}
			
			}
			if(flag==1) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
	
		}
		

	}

}
