package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyPicture {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L,N;
		
		try {
			L = Integer.parseInt(br.readLine());
			N = Integer.parseInt(br.readLine());
			String[] W_H = new String[N];
			
			
			for(int i=0 ; i < N ; i++) {
				W_H[i] = br.readLine();
			}
			
			String[] WH = new String[N];
			for(int i=0 ; i < N ; i++) {
				WH = W_H[i].split(" ");
				int w = Integer.parseInt(WH[0]);
				int h = Integer.parseInt(WH[1]);
				
				if(w >= L && h >= L) {
					if(w != h) {
						System.out.println("CROP IT");
					} else if(w==h) {
						System.out.println("ACCEPTED");
					}
				} else if( w < L || h < L) {
					System.out.println("UPLOAD ANOTHER");
				}
				
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
