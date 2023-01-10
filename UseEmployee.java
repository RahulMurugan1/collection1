package sample;

import java.util.ArrayList;

public class UseEmployee {
public static void main(String[] args) {
	Employee a  = new Employee("rahul" , 100000 , 'm' , 1007 , true ,"junior dev");
	Employee b  = new Employee("pechiyappan" , 1300000 , 'm' , 1003 ,false , "senior dev" );
	Employee c  = new Employee("daya" , 110000 , 'm' , 1005 , true, "junior dev");
	Employee d  = new Employee("geja" , 120000 , 'm' , 1002 , true, "junior dev");
Employee e [] = {a,b,c,d};

for(int i = 0 ; i<e.length ; i++) {
	if(e[i].getGender()=='f') {
		System.out.println(e[i].getName());
	}
	else {
		System.out.println("No girl employee ");
	}

}
for(Employee x : e) {
	if(x.getEmpId()%2==0) {
		System.out.println(x.getEmpId()+" is odd");
	}
	else System.out.println(x.getEmpId()+" is even");
}
ArrayList <Employee> li = new ArrayList<>();
li.add(a);
li.add(b);
li.add(c);
li.add(d);
li.forEach(s -> {
	if(s.isVaccinated()== true) {
		System.out.println(s.getName());
	}
	
});

for(int i = 0 ; i<li.size() ; i++) {
	if(li.get(i).getName().startsWith("n")) {
		System.out.println(li.get(i).getName());
	}
}


for(Employee s : li) {
	if(s.isVaccinated()==true) {
		System.out.println(s);
	}
	
}

li.forEach(s -> {
	if(s.getSalery() >=50000) {
		System.out.println(s);
	}
});

Employee  max  = li.get(0) ;
for(int i = 0 ; i< li.size(); i++) {
	if(li.get(i).getName().length() >= max.getName().length()) {
		max = li.get(i);
	}
}
System.out.println(max.getName());

ArrayList<Employee> lis  = new ArrayList <> ();
for(int i = 0 ; i<li.size() ; i ++) {
	if(li.get(i).getSalery() >100000) {
		 lis.add(li.get(i)) ;
	}
}





}
}
