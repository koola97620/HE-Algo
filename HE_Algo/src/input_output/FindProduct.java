package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line; //숫자 갯수 : 5
		String line2; //숫자 : 1 2 3 4 5
		try {
			line=br.readLine();
			int N = Integer.parseInt(line);
			
			long sum=1;  
			//int로 하면 출력 안된다.  10^9 +7 은 int 계산에 적합하지않다. 너무 크다? 그래서 long으로 해야한다.
			
			if( 1<= N && N<=1000) {
				int[] K = new int[N];
				
				line2=br.readLine();
				String[] word = line2.split(" ");
				
				for(int i=0 ; i < word.length ; i++) {
					K[i] = Integer.parseInt(word[i]);
					if(1<=K[i] && K[i] <=1000) {
						sum = (sum * K[i])%(1000000000 +7);
					}else {
						return;
					}
					
				}
				System.out.println(sum);
			}else {
				return;
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
