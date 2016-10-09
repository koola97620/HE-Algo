package implementation;

import java.util.Scanner;

public class GreatKian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int num[] = new int[count];
		
		long sum1=0;
		long sum2=0;
		long sum3=0;int n=0;
		
		for(int i=0; i<count ; i++) {
			num[i] = sc.nextInt();
			if(i == (3*n)) {
				sum1 += num[i];
			} else if(i == (3*n+1)) {
				sum2 += num[i];
			} else {
				sum3 += num[i];
				n++;
			}
		}
		
		System.out.println(sum1 + " " + sum2 + " " + sum3);
		
		

	}

}
