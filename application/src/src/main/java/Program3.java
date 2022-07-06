package src.main.java;

import java.util.*;

/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program3 {
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> ls= new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int  input=sc.nextInt();
			ls.add(input);
		}
		sc.close();
		List<Integer> resLs=new ArrayList<Integer>();
		
		for(int i=0; i<n;i++) {
			int k=0;
			for(int j=0;j<=i;j++) {
				if(ls.get(i)>=ls.get(j)) {
					k++;
				}else {
					k=0;
				}
			}
			resLs.add(k);
		}
		System.out.println(resLs);
	}

}
