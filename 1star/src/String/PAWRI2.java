package String;

import java.util.Arrays;
import java.util.Scanner;

public class PAWRI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();

        char arr[] = new char[5];
        arr[0 ] = 'p';
        arr[1] = 'a';
        arr[2] = 'r';
        arr[3] = 't';
        arr[4] = 'y';

        for (int i = 0; i <testcases ; i++) {
            String s = sc.next();

            char check [] = new char[s.length()];

            for (int j = 0; j < s.length(); j++) {
                check[j] = s.charAt(j);
            }

            int count =0;
            for (int j = 0; j < s.length()-4; j++) {
                if (check[j] == arr[0] &&
                        check[j+1]==arr[1] &&
                        check[j+2] == arr[2] &&
                        check[j+3]==arr[3] &&
                        check[j+4] == arr[4])
                {
                    check[j+2] = 'w';
                    check[j+3] ='r';
                    check[j+4] = 'i';
                }
            }

            Arrays.toString(check);

             System.out.println(check);



        }

	}

}
