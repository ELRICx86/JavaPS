package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;

public class AVGFLEX2 {
	
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
		
		FastReader in = new FastReader();
		int t;
		
		t= in.nextInt();
		
		while(t-->0) {
			int n= in.nextInt();
			int x;
			
			int[] arr=new int[101];
			for(int i=0;i<n;i++) {
				x=in.nextInt();
				arr[x]++;
			}
			
			//System.out.println(Arrays.toString(arr));
			
			int count=0;
			int ans=0;
			

				for(int i=0;i<101;i++) {
					if(arr[i]!=0) {
						count+=arr[i];
						if(count>n-count) {
							ans+=arr[i];
						}
					}
				}
				System.out.println(ans);
				
			}

	}

}
