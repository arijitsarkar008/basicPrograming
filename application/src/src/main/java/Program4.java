package src.main.java;

import java.util.*;
/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program4 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		
		if(x==1 ||  x==2) {
			System.out.println(0);
		}else if(x%2==0) {
			System.out.println(x-3);
		}else if(x%2 !=0) {
			System.out.println(x-1);
		}
	}
}
