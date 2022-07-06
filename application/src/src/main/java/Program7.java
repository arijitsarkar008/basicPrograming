package src.main.java;

import java.util.*; 

/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program7 {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		List<Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			ls.add(a);
		}
		sc.close();
		List<Integer> resLs=new ArrayList<Integer>();
		
		for(int i=d;i<n;i++) {
			resLs.add(ls.get(i));
		}
		for(int i=0;i<d;i++) {
			resLs.add(ls.get(i));
		}
		System.out.println(resLs);
	}
}
