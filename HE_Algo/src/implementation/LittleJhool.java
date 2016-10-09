package implementation;

import java.util.Scanner;

public class LittleJhool {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		int c1=0; int c0=0;
		
		for(int i=0 ; i < ch.length ; i++) {
			if(ch[i]=='0') {
				c0++;
				c1=0;
				if(c0==6) {
					System.out.println("Sorry, sorry!");
					return;
				}
			}else {
				c1++;
				c0=0;
				if(c1==6) {
					System.out.println("Sorry, sorry!");
					return;
				}
			}
		}
		
		System.out.println("Good luck!");
		
		
		

	}

}
