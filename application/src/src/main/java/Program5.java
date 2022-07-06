package src.main.java;

import java.util.*;

/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program5 {
	
	public static void main(String args[]) {
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> ls=new ArrayList<Integer>();;
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			ls.add(a);
		}
		sc.close();
		int sum=0;
		for (int i=0;i<n;i++) {
			sum=sum+ls.get(i);;
		}
		System.out.println(sum);
	}

}
