package sample;

import java.util.ArrayList;

public class Student {
	public static void main(String[] args) {
		ArrayList <String > li  = new ArrayList<> () ;
		li.add("rahul") ;
		li.add("pechi");
		li.add("daya");
		li.add("geja");
		li.add("gowri");
		
		for(int i = 0 ;i< li.size(); i++) {
			System.out.println(li.get(i).charAt(0));
		}
		li.forEach(s-> {
			if(s.length()>4) {
				System.out.println(s);
			}
			
		});
		for(int i = 0; i<li.size() ; i++) {
			if(li.get(i).contains("a") ||li.get(i).contains("e") || li.get(i).contains("i") ||li.contains("o") ||li.contains("u")  ) {
				System.out.println(li.get(i) +" contains vowels ");
			}
			else {
				System.out.println(li.get(i) +" does not contains vowels ");
			}
		}
		
 		
		
		
		
		
		
		
		
		
		
	}

}
