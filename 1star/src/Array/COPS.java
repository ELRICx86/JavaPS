package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import Array.CASH.FastReader;

public class COPS {
	
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FastReader in=new FastReader();
		int t;
		
		t= in.nextInt();
		
		while(t-->0) {
		int m = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		
		int[] hs= new int[m];
		
		for(int i=0;i<m;i++) {
			hs[i]=in.nextInt();
		}
		
		int[] arr = new int[101];
		
		
		for(int i=0;i<m;i++) {
			int a=(hs[i]-x*y)<=0?1:(hs[i]-x*y);

			int b=(hs[i]+x*y)>=100?100:(hs[i]+x*y);
			
			
			
			for(int j=a;j<=b;j++) {
				arr[j]=1;
			}
		}
		
		int sum=0;
		for(int j=0;j<=100;j++) {
			sum+=arr[j];
		}
		
		System.out.println(100-sum);
		
		
		}

	}

}
