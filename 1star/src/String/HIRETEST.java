package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HIRETEST {
	
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
		int t=in.nextInt();
		
		while(t-->0) {
			int n,m,x,y;
			n=in.nextInt();
			m=in.nextInt();
			x=in.nextInt();
			y=in.nextInt();
			String str1="";

			for(int i=0;i<n;i++) {
			String str=in.next();
			int f=0;
			int p=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='F') {
					f++;
				}
				else if(str.charAt(j)=='P') {
					p++;
				}
			}
			
			if(f>=x){
				str1+='1';
			}
			else if(f==x-1 &&p>=y) {
				str1+='1';
			}
			else {
				str1+='0';
			}
			
			}
			System.out.println(str1);
			
		}

	}

}
