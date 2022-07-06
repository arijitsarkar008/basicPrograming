package src.main.java;

import java.util.*;

/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program13 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> ls= new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			ls.add(a);
		}
		sc.close();

		List<Integer> sumArray= new ArrayList<Integer>();
		int sum=ls.get(0);
		for(int i=1;i<n;i++) {
			if(ls.get(i-1)<=ls.get(i)) {
				sum=sum+ls.get(i);
			}
			else {
				sumArray.add(sum);
				sum=ls.get(i);
			}
			if(i==n-1){
				sumArray.add(sum);
			}
		}
		int res=sumArray.get(0);
		for(int i=1;i<sumArray.size();i++) {
			if(sumArray.get(i)>sumArray.get(i-1)) {
				res=sumArray.get(i);
			}
		}
		System.out.println(res);


	}

}
