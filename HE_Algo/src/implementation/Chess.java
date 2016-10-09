package implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		 Scanner br=new Scanner(System.in);
        int n=br.nextInt();
        int h[][]=new int[2000][2000];
        double k=Math.pow((double)2,(double)n);
        
        int y=(int)k;
        for(int i=0;i<k-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                h[i][j]=br.nextInt();
            }
        }
        int a[]=new int[y+1];
        for(int i=1;i<=y;i++)
        {
            a[i]=i;
 
        }
        while(y>1)
        {
            for(int i=1;i<y;i+=2)
            {
                if(h[a[i+1]-2][a[i]-1]==0)
                {
                    a[(i+1)/2]=a[i];
 
                }
                else
                {
                    a[(i+1)/2]=a[i+1];
                }
 
            }
 
            y=y/2;
        }
        System.out.println(a[1]);
        
        ArrayList<String> haha = new ArrayList<String>();

	}

}
