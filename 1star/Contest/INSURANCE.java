import java.util.Scanner;

public class INSURANCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(Math.min(x, y));
		}

	}

}
