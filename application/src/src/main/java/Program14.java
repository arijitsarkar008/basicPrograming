package src.main.java;

import java.util.*;

/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program14 {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		int n=sc.nextInt();
//		List<Integer> ls=new ArrayList<Integer>();
//		for(int i=0;i<n;i++) {
//			int a=sc.nextInt();
//			ls.add(a);
//		}
		sc.close();
		int ress=1;
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			String s=String.valueOf(a);
			int m=Integer.valueOf(s);
			ress=ress*m;
			
			
		}
		System.out.println(ress);
	}

}
