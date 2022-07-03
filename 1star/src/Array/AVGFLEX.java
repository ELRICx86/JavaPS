package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AVGFLEX {
	
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
			
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}
			
			int count=0;
			
			Arrays.sort(arr);
			
			int target =arr[n/2];

				for(int i=0;i<n;i++) {
					if(arr[i]>=target) {
						count++;
					}
				}
				System.out.println(count);
				
			}

	}

}
