package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalDestination {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		char ch[] = str.toCharArray();
		int lr = 0;
		int ud = 0;
		
		for(int i=0 ; i < ch.length ; i++) {
			switch(ch[i]) {
			case 'L':
				lr--;
				break;
			case 'R':
				lr++;
				break;
			case 'U':
				ud++;
				break;
			case 'D':
				ud--;
				break;
			}
		}
		
		System.out.print(lr + " " + ud);
		

	}

}
