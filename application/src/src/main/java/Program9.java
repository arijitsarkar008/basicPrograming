package src.main.java;

import java.util.*;

/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program9 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			ls.add(a);
		}
		sc.close();
		boolean flag=false;
		boolean flag1=false;
		for(int i=0;i<n-1;i++) {
			if(ls.get(i)>=ls.get(i+1)) {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		
		for(int i=0;i<n-1;i++) {
			if(ls.get(i)<=ls.get(i+1)) {
				flag1=true;
			}else {
				flag1=false;
				break;
			}
		}
		if(flag || flag1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
