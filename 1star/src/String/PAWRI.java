package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PAWRI {
	
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
			String str=in.next();
			String str1="";
			if(str.length()<5) {
				System.out.println(str);
			}
			else {
				
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='p' && str.charAt(i+1)=='a' && str.charAt(i+2)=='r'&& str.charAt(i+3)=='t' && str.charAt(i+4)=='y' ) {
					
									str1+="pawri";
									i=i+4;
								
				}
				else {
					str1+=str.charAt(i);
				}
			}
			System.out.println(str1);
		}
		}

	}

}
