package src.main.java;

import  java.util.*;

/**
 * 
 * @author Arijit Sarkar
 *
 */

public class Program11 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();	
		sc.close();
		String word[]=str.split("\\s");
		List<String>  ls=new ArrayList<String>();
		for(String s: word) {
			ls.add(s);
		}
		int n=ls.size();
		int k=n;
		for(int i=0;i<n;i++) {
			if(k!=1) {
				System.out.print(ls.get(k-1)+" ");
			}else {
				System.out.print(ls.get(k-1));
			}
			k--;
		}

	}

}
