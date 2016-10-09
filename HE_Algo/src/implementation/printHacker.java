package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class printHacker {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		char ch[] = str.toCharArray();
		
		int counth=0;int counta=0;int countc=0;int countk=0;int counte=0;int countr=0;
		int countt=0; int count=0;
		
		for(int i =0 ; i < ch.length ; i++) {
			if(ch[i]=='h') {
				counth++;
			}else if(ch[i] == 'a') {
				counta++;
			}else if(ch[i] == 'c') {
				countc++;
			}else if(ch[i] == 'k') {
				countk++;
			}else if(ch[i] == 'e') {
				counte++;
			}else if(ch[i] == 'r') {
				countr++;
			}else if(ch[i] == 't') {
				countt++;
			}
		}
		while(counth>=2 && counta>=2 && countr>=2 && countc>=1 && countk>=1 && counte>=2 && countt>=1) {
			counth -= 2;
			counta -= 2;
			countr -= 2;
			countc -= 1;
			countk -= 1;
			counte -= 2;
			countt -= 1;
			count++;
		}
		System.out.println(count);
		

	}

}
