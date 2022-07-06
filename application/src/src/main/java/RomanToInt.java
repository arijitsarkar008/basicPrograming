package src.main.java;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {
	
	public static void main(String args[]) {
	
	Scanner sc =new Scanner(System.in);
	String s="";
	try {
		s=sc.nextLine();
	}finally {
		sc.close();
	}
	
	 HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	            map.put('I',1);
	            map.put('V',5);
	            map.put('X',10);
	            map.put('L',50);
	            map.put ('C',100);
	            map.put('D',500);
	            map.put('M',1000);
	        
	        int res=0;
	        for(int i=0; i<s.length(); i++){
	        	
	        	int s1=getNumber(map,s.charAt(i));
	        	if(i+1 < s.length()) {
	        		int s2=getNumber(map,s.charAt(i+1));
	        		if(s1>s2) {
		        		res=res +s1;
		        	}else if(s1==s2){
                        res= res+s2 +s1;
                        i++;
                }
	        		else {
		        		 res= res+s2 -s1;
		        		 i++;
		        	}
	        	}else {
	        		res=res+s1;
	        	}
	            
	        	
	        	
	        	
	            
	        }
	        
	        System.out.println("Response:::::::::"+res);
	
	}
	
public static int getNumber(HashMap<Character,Integer> map, char c){
      
        if(map.containsKey(c)) {
        	return map.get(c);
        }
        
        return 0;
    }
}
