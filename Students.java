package sample;

public class Students {
  private  String name ;
  private int examNo ;
  private int age ;
  private boolean isMale ;
  private char grade ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getExamNo() {
	return examNo;
}
public void setExamNo(int examNo) {
	this.examNo = examNo;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isMale() {
	return isMale;
}
public void setMale(boolean isMale) {
	this.isMale = isMale;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}
public Students(String name, int examNo, int age, boolean isMale, char grade) {
	super();
	this.name = name;
	this.examNo = examNo;
	this.age = age;
	this.isMale = isMale;
	this.grade = grade;
}
@Override
public String toString() {
	return "Students [name=" + name + ", examNo=" + examNo + ", age=" + age + ", isMale=" + isMale + ", grade=" + grade
			+ "]";
}
  





}
