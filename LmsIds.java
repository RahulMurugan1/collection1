package sample;

import java.util.ArrayList;

	
	
	public class LmsIds {
		public static void main(String[] args) {
			ArrayList<Integer> lis = new ArrayList<>();
			lis.add(1225);
			lis.add(434);
			lis.add(567);
			lis.add(966);
			lis.add(722);
			for(Integer s : lis) {
				System.out.println(s);
			}
			for(int i = 0 ; i<lis.size(); i++) {
				if(lis.get(i) >=550 && lis.get(i)<=850) {
				System.out.println(lis.get(i));
			}
			}
			lis.forEach(x-> {
				if(x%2==0) {
					System.out.println(x +" is even");
				}
				else {
					System.out.println(x +" is odd");
				}});
	
		int min  = lis.get(0);
		for(int i = 0 ; i<lis.size(); i++) {
			if(lis.get(i)<= min) { 
				min  = lis.get(i);
			}}
		System.out.println(min +" is the min number");
			
			
			
			

		}}
