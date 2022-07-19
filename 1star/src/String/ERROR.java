package String;

import java.util.Scanner;

public class ERROR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String str=sc.next();
			if(str.contains("010") || str.contains("101")) {
				System.out.println("Good");
			}
			else {
				System.out.println("Bad");
			}
		}

	}

}
