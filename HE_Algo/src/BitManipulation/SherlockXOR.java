package BitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class SherlockXOR {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
		try {
			int count = Integer.parseInt(br.readLine());
			if(count <1 || count >10) {
				return;
			}
			
			int arr_count;
			for(int i=0; i < count ; i++) {
				arr_count = Integer.parseInt(br.readLine());
				if(arr_count <1 || arr_count >100000) {
					return;
				}
				
				int[] nums = new int[arr_count];
				String line = br.readLine();
				String[] line2 = line.split(" ");
				
				for(int k=0 ; k < arr_count ; k++) {
					nums[k] = Integer.parseInt(line2[k]);
					if(nums[k] <0 || nums[k] >1000000000) {
						return;
					}
//					nums[k] = sc.nextInt();
				}
				
				//OUTPUT 결과 출력용 변수.
				int odd_count =0;
				
				for(int k=0 ; k < arr_count-1 ; k++) {
					for(int j=k+1 ; j < arr_count ; j++) {
						if(((nums[k]^nums[j]) % 2) != 0) {
							odd_count++;
						}
					}
				}
				System.out.println(odd_count);
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
