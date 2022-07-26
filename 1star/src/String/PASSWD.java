package String;

import java.util.Scanner;

public class PASSWD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			String string = scanner.next();

			if (string.length() < 10) {
				System.out.println("NO");
			} 
			else 
			
			{
				boolean up = false, low = false, dig = false, sc = false;
				
				for (int i = 0; i < string.length(); i++) {
					if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
						low = true;
					}

				}
				for (int i = 1; i < string.length() - 1; i++) {
					if (string.charAt(i) >= 48 && string.charAt(i) <= 57) {
						dig = true;
					}

						if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
							up = true;
						}

							if (string.charAt(i) == '@' || string.charAt(i) == '#' || string.charAt(i) == '&'
									|| string.charAt(i) == '%' || string.charAt(i) == '?') {
								sc = true;
							}
						}
					
				

				if (up && low && dig && sc) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}

	}

}
