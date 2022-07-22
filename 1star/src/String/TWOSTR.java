package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class TWOSTR {
	
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
			String x=in.next();
			String y=in.next();
			boolean flag=false;
			for(int i=0;i<x.length();i++) {
				
				
				if(x.charAt(i)!=y.charAt(i)) {
					if(x.charAt(i)!='?' && y.charAt(i)!='?') {
						flag=true;
						break;
					}
					
				}
				
				
			}
			if(flag==false) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
