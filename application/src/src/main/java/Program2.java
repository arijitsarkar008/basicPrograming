package src.main.java;

import java.util.*;

/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program2 {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			ls.add(a);
		}
		sc.close();
		List<Integer> resLs=new ArrayList<Integer>();
		for(int i=0;i<n-1;i++) {
			int sum=0;
			for(int j=i+1;j<n;j++) {
				sum=sum+ls.get(j);
			}
			resLs.add(sum);
		}
		System.out.println(resLs);
		for(int i=0;i<resLs.size();i++) {
		System.out.print(resLs.get(i));
		}
	}

}
