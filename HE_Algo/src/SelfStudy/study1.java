package SelfStudy;

import java.util.Scanner;

public class study1 {

	// 최대값을 구하는 코드
	
	public static void main(String[] args) {
		study1 st1 = new study1();
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		
		int array[] = new int[count];
		for(int i=0; i < count ; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int k : array) {
			System.out.print(k + " ");
		}
		
		System.out.println("\n"+ st1.CompareToMax(array, count));
		System.out.println("GIT 재연결");
		System.out.println("GIT 재연결");
		

	}
	public int CompareToMax(int arr[], int n) {
		int curMax=0;
		int i=0;
		
		if(n<=0) {
			return -1;
		}
		curMax = arr[0];
		for(i=1 ; i < n ; i++) {
			if(arr[i] > curMax) {
				curMax = arr[i];
			}
		}
		
		return curMax;
	}

}
