package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDivisors {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			String[] nums = line.split(" ");
			int[] num = new int[nums.length];
			for(int i=0 ; i < nums.length ; i++) {
				num[i] = Integer.parseInt(nums[i]);
			}
			int result=0;
			if(num[0]==num[1]) {
				result = (num[1]-num[0])/num[2];
			} else {
				result =(num[1]-num[0])/num[2]+1;
			}
			
			
			System.out.println(result);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
