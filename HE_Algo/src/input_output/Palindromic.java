package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
		try {
			line = br.readLine();
			char[] a = line.toCharArray();
			if(a[0] == a[a.length-1]) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

	}

}
