package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NOBEL {
	
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
		int t;
		FastReader in =new FastReader();
		t= in.nextInt();
		
		while(t-->0) {
		int n = in.nextInt();
		int m=in.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		int x=0;
		for(int i=0;i<n;i++) {
			x=in.nextInt();
			set.add(x);
			}
		
		if(set.size()<m) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		
		}

	}

}
