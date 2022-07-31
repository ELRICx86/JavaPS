import java.util.Scanner;

public class lol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1=new Scanner(System.in);
		int t=sc1.nextInt();
		while(t-->0) {
			int a=sc1.nextInt();
			int b=sc1.nextInt();
			int c=sc1.nextInt();
			
			if(a!=b) {
				if(b!=c || c!=a)
				
					System.out.println("NO");
				
			}
			else {
				System.out.println("YES");
			}
		

			
			
		}

	}

}
