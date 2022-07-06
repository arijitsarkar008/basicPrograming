package src.main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCharRepeat {
	
	public static void main(String args[]) {
		
		String str="";
		
		Scanner sc = new Scanner(System.in);
		
		try {
			str=sc.nextLine();
		}finally{
			sc.close();
		}
		
		boolean flag= numberOFrepeat(str);
		
		if(flag) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
	}
	
	public static boolean numberOFrepeat(String str) {
	 
//		int[] ls =new int[str.length()];
		
		ArrayList<Integer> ls=new ArrayList<Integer>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(ch == str.charAt(j)) {
					count++;
				}
				
			}
			
			ls.add(count);
			
		}
	
		int a= ls.get(0);
		for(int i=0;i<ls.size();i++) {  // abc condition
			
			if(a==ls.get(i)) {
				continue;
			}
			else {  // abccee condition
				
				
				return false;
				}
			}
			
		
		
		return true;
		
	}

}
