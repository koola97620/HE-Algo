package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LifeUniverseEverything {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			while(true) {
				int k =Integer.parseInt( br.readLine());
				if(k != 42) {
					System.out.println(k);
				}else {
					break;
				}
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
