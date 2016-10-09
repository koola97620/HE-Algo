package implementation;

import java.util.Scanner;

public class RoyLife {
	public int countC=0;
	public static int maxCount1 =0;
	public static int maxCount2 =0;
	
	//countC 메소드는 한 라인에서 C를 세는것이다.
	//FOR문에서 한글자씩 C인지 판별하며 수를 증가시키고
	//마지막에 countC 변수를 초기화 하느냐 마느냐로 일별 갯수인지. 연속된일별 갯수인지 판단한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RoyLife rf = new RoyLife();
		
		int count = Integer.parseInt(sc.nextLine());
		String strList[] = new String[count];
		for(int i=0 ; i < count ; i++) {
			strList[i] = sc.nextLine();
		}
		
		for(String str : strList) {
			rf.countC(str,0);
		}
		
		System.out.print(maxCount1);
		
		
		for(String str : strList) {
			rf.countC(str,1);
		}
		
		System.out.print(" " + maxCount1);
		

	}
	
	public void countC(String str,int k){
		char line[] = str.toCharArray();
		for(int i=0 ; i < line.length ; i++) {
			if(line[i]=='C') {
				countC++;
				if(maxCount1 <= countC) {
					maxCount1 = countC;
				}
				
			}else {
				if(maxCount1 <= countC) {
					maxCount1 = countC;
					countC=0;
				}else {
					countC=0;
				}
				
			}
			
		}
		//여기에 countC=0을 넣어야 countC값이 다음줄에선 초기화됨.
		//이것을 기준으로 maxCount1 maxCount2를 나눈다.
		//k가 0이면 하루중에 연속된 C가 제일 많은것을 센다.
		//k가 0이 아니면 연속된 날들중에 C가 제일 많은것을 센다.
		if(k ==0) {
			countC=0;
		}
		
//		return maxCount1;
	}

}
