package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Death {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
		try {
			line = br.readLine();
			
			int N = Integer.parseInt(line);
			int[] A = new int[N];
	        for (int i = 0; i < N; i++) {
	        	A[i] = Integer.parseInt(br.readLine());
	        }
	        for(int i =0 ; i <N ; i++) {
	        	System.out.println(A[i]-1);
	        }
	        
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        

	}

}
