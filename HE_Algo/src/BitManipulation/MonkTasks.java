package BitManipulation;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MonkTasks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int count = sc.nextInt();
		// Case 숫
		for(int i=0 ; i < count ; i++) {
			//배열의 갯
			int arr_count = sc.nextInt();
			Integer[][] nums = new Integer[arr_count][2];
			//한 배열 내에서 1 개수 세서 랭크 정렬하기.
			for(int j=0 ; j < arr_count ; j++) {
//				nums[j][0] = Integer.toBinaryString(sc.nextInt());
				nums[j][0] = sc.nextInt();
				
				int one_count =0;
				String temp_binary = Integer.toBinaryString(nums[j][0]);
				
				for(int k=0 ; k < temp_binary.length() ; k++) {
					if(temp_binary.charAt(k)=='1') {
						one_count++;
					}
				}
				//2진수의 1 갯수를 저장시킨다.
				nums[j][1] = one_count;
				//여기서 괄호 닫고 다시 아래에 작성해보자.
			}
			//이 위에까진 정상작동
			
			System.out.println("[0][0] : " + nums[0][0] + "   [0][1] : " + nums[0][1]);
			System.out.println("[1][0] : " + nums[1][0] + "   [1][1] : " + nums[1][1]);
			System.out.println("[2][0] : " + nums[2][0] + "   [2][1] : " + nums[2][1]);
			System.out.println("[3][0] : " + nums[3][0] + "   [3][1] : " + nums[3][1]);
			
			Integer[] temp = nums[0];	
			
			for(int k=0 ; k < arr_count ; k++) {
				int max_index=0;
				
				for(int t=k+1 ; t < arr_count ; t++ ) {
					if(nums[k][1] > nums[t][1]) {
						temp = nums[k];
						nums[k] = nums[t];
						nums[t] = temp;
					} else if(nums[k][1] == nums[t][1]) {
						if(nums[k][0] > nums[t][0]) {
							temp = nums[k];
							nums[k] = nums[t];
							nums[t] = temp;
						}
					}
				}
				
				System.out.print(nums[k][0] + " ");
				
			}
		

		}

	}

}
