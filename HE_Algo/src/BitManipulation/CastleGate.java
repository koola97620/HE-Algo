package BitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CastleGate {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			int line = Integer.parseInt(br.readLine());
			int[] k = new int[line];
			
			
			for(int i=0 ; i < line ; i++) {
				k[i] = Integer.parseInt(br.readLine());
			}
			
			for(int i=0 ; i< line ; i++) {
				int as=0;
				for(int j=1 ; j <= k[i]-1 ; j++) {
					for(int t=j+1 ; t <= k[i] ; t++) {
						if((j^t) <= k[i]) {
							System.out.println(j + " , " + t);
							as++;
						}
						
					}
				}
				System.out.println(as);
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
