package src.main.java;

import java.util.*;

/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program8 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int  s=sc.nextInt();
		List<Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<s;i++) {
			int a=sc.nextInt();
			ls.add(a);
		}
		sc.close();
		
		int mul=1;
		for(int i=0;i<s;i++) {
			mul=mul*ls.get(i);
		}
		int res = mul%n;
		System.out.println(res);
	}

}
