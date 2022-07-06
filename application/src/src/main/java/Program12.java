package src.main.java;

import java.util.*;

public class Program12 {
	
	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		sc.close();
		if(str2.contains(str1)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
