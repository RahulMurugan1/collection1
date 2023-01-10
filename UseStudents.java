package sample;

import java.util.ArrayList;

public class UseStudents {
	public static void main(String[] args) {
	Students a  = new Students("rahul" , 1007 , 25 , true , 'a');
	Students b  = new Students("pechiyappan" , 1057 , 21 , true , 'c');
	Students c  = new Students("gowri" , 1004 , 24 , true , 'b');
	Students d  = new Students("dayalan" , 1005 , 25 , true , 'a');
	ArrayList <Students> li  = new ArrayList<> ();
	ArrayList <Students> lis  = new ArrayList<> ();
	ArrayList <Students> l  = new ArrayList<> ();
	li.add(a);
	li.add(b);
	li.add(c);
	li.add(d);
	for(int i = 0 ; i<li.size() ; i++) {
		if(li.get(i).getExamNo()>=1005 &&li.get(i).getExamNo()<=1009 ) {
			lis.add(li.get(i));
		}
	}
	li.forEach(s -> {
		if(s.getGrade()== 'a') {
			l.add(s);
		}
	});	
		
		
		
	}

}
