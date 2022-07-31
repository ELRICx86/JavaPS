import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HIGHFREQ {
	
	
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
		FastReader sc1=new FastReader();
		int t=sc1.nextInt();
		while(t-->0) {
			int n=sc1.nextInt();
			int[] arr =new int[n];
			int[] arr1 =new int[1000000+10];
			for(int i=0;i<n;i++) {
				int x=sc1.nextInt();
				arr1[x]++;
			}
			
			//Arrays.sort(arr1);
			int mx = 0;
			int min=0;
			for(int i=0;i<arr1.length;i++) {
				
				if (arr1[i] >= mx) {
	                min = mx;
	                mx = arr1[i];
	            }
	            else if (arr1[i] >= min && arr1[i] != mx)
	                min = arr1[i];
			}
			
			System.out.println(mx+" "+min);
			
			
			if(mx/2<min) {
				System.out.println(min);
			}
			else System.out.println((mx+1)/2);
			
			//System.out.println( mx + " " + min);
		}

	}

}
