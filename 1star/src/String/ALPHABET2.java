package String;

import java.util.Scanner;

public class ALPHABET2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int t=sc.nextInt();
		while(t-->0) {
			String str1=sc.next();
			int sum=0;
			
			for(int i=0;i<str.length();i++) {
				for (int j=0;j<str1.length();j++) {
					if(str.charAt(i)==str1.charAt(j)) {
						sum++;
					}
				}
			}
			
			if(sum==str.length()){
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
