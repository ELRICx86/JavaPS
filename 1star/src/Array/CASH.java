package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import Array.CARVANS.FastReader;

public class CASH {
	
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
		int n = in.nextInt();
		int k = in.nextInt();

		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextLong();
			}
		
		long count =0;
		for(int i=0;i<n;i++) {
			count+=arr[i];
				
			}
		
		System.out.println(count%k);
		}

	}

}
