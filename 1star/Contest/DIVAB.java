import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class DIVAB {
	
	static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		FastWriter out=new FastWriter();
		int t=scanner.nextInt();
		while(t-->0) {
			long x=scanner.nextLong();
			long y=scanner.nextLong();
			long n=scanner.nextLong();
			long ans=0;
//			if(x%y==0){
//		        System.out.println(-1);;
//		    }
//		    else{
//		        ans=x*(n/x +1);
//		        if(n%x==0){
//		            ans=n;
//		        }
//		        if(ans%y==0){
//		            ans+=x;
//		        }
//		             System.out.println(ans);;
//		    }
			
		
			
			if(x%y==0) {
				System.out.println(-1);
			}
			else {
				Long ll=n/x;
			while(true) {
				ll++;
				Long z=ll*x;
				if(z%y!=0) {
					System.out.println(z);
					break;
				
				}
				
			}
		}

	}
	}
}
