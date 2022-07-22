package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EQUINOX {
	
	
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
			int n;
			long a,b;
			n=in.nextInt();
			a=in.nextLong();
			b=in.nextLong();
			String str=new String();
			Long c1=0l;
			Long c2=0l;
			for(int i=0;i<n;i++) {
				str=in.next();
				
					if(str.charAt(0)=='E' 
							||str.charAt(0)=='Q' 
							||str.charAt(0)=='U' 
							||str.charAt(0)=='I' 
							||str.charAt(0)=='N' 
							||str.charAt(0)=='O' 
							||str.charAt(0)=='X' )c1+=a;
					else c2+=b;
				
			}
			//System.out.println(c1+" "+c2);
			if(c1==c2)System.out.println("DRAW");
			else if(c1>c2)System.out.println("SARTHAK");
			else System.out.println("ANURADHA");
		}
	}

}
