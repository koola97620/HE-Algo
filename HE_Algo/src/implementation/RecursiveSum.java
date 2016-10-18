package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RecursiveSum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(br.readLine());
		int section=0; int count=0; int number=0; int sum=0;
		String result="";
		
		for(int i=0 ; i < num ; i++) {
			section = Integer.parseInt(br.readLine());
			sum=0;
			for(int k=0 ; k < section ; k++) {
				count = sc.nextInt();
				number = sc.nextInt();
				sum += (count*number); // 숫자 다 더함. 여기 for문 나가서 자릿수따져보기
			}
			// sum이 10이상이면 연산 한번더
			if(sum <10) {
				System.out.println(sum);
			} else {
				int temp = sum;
				int newtemp=sum;
				
				while(newtemp > 10) {
					temp = newtemp;
					newtemp=0;
					result = Integer.toString(temp);
					
					char ch2[] = result.toCharArray();
					for(int j =0 ; j < ch2.length ; j++) {
						int tt =Integer.parseInt(Character.toString(ch2[j]));
						
						newtemp += tt;
					}
					if(newtemp < 10) {
						System.out.println(newtemp);
						break;
					}
					
				}
//				System.out.println(temp);
			}
						
			
			
		}

	}

}
