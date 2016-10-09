package BitManipulation;

import java.util.Scanner;

public class LuckyNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int sum = 0,c=0;
		while(t>0) {
			int n = sc.nextInt();
			for(int i=1; i<=n ; i++) {
				c=0;
				int q=i;
				while(q!=0) {
					q=q&(q-1);
					c++;
				}
				if(c==2) 
					sum += i;
			}
			System.out.println(sum);
			t--;
		}

	}

}
