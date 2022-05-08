package collections;

import java.util.*; 

public class comparable {

	public static void main(String args[]){  
	ArrayList<Student> al=new ArrayList<Student>();  
	al.add(new Student(101,"Vijay",232));  
	al.add(new Student(106,"Ajay",23));  
	al.add(new Student(105,"Jai",21));  
	  
	Collections.sort(al);  
	for(Student st:al){  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	}  
	} 


