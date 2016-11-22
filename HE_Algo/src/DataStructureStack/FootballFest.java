package DataStructureStack;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import org.junit.Test;

public class FootballFest {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<Integer>();
		
		int line = Integer.parseInt(br.readLine());
		
		for(int k=0 ; k < line ; k++) {
			String input[] = br.readLine().split(" ");
			
			int count = Integer.parseInt(input[0]);
			
			// 처음값
			st.push(Integer.parseInt(input[1]));
			
			String input2;
			
			for(int i=0 ; i < count ; i++) {
				input2 = br.readLine();
				String str[] = input2.split(" ");
				String alpha = str[0];
				int player;
				
				if(alpha.equals("P")) {
					player = Integer.parseInt(str[1]);
					st.push(player);
				}else {
					if(st.size() >1 ) {
						int temp1 = st.pop();
						int temp2 = st.pop();
						st.push(temp1);
						st.push(temp2);
					}
				}
			}
			System.out.println("Player " + st.peek());
			
			
		} //for 끝.
		
	}

}
