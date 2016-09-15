package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Factorial fact = new Factorial();
		
		try {
			int num = Integer.parseInt(br.readLine());
			System.out.println(fact.facto(num));
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	public int facto(int fa) {
		int result=fa;
		while(fa > 1) {
			fa=fa-1;
			result = result * fa;
		}
		return result;
		
	}

}
