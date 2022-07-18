package String;

import java.util.Scanner;

public class ALPHABET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		String str="";
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int[] arr=new int[27];
		for(int i=0;i<str.length();i++) {
			arr[(int)str.charAt(i)-96]=1;
		}
		
		
		
		int t=sc.nextInt();
		while(t-->0) {
			String str1=sc.nextLine();
			int f=0;
			
			for(int i=0;i<str1.length();i++) {
				if(arr[(int)str1.charAt(i)-96]==0) {
					f=1;
				}
			}
			

			
			if(f==1) {
				System.out.println("No");
			}
			else System.out.println("Yes");
			
			
			}
		}
		

	}


