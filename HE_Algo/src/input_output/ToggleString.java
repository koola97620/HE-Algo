package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToggleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String line;
		try {
			line = br.readLine();
			char[] ch = line.toCharArray();
			
			for(int i=0 ; i < ch.length ; i++) {
				if(Character.isLowerCase(ch[i])==true) {
					ch[i] = Character.toUpperCase(ch[i]);
					
				} else if (Character.isUpperCase(ch[i]) == true) {
					ch[i] = Character.toLowerCase(ch[i]);
				}
				System.out.print(ch[i]);
			}
	        
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
