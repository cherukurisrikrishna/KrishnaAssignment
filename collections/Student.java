package collections;

import java.util.*;


public class Student 
{
	String firstName;
	String lastName;
	double gpa;
	@Override
	public String toString() {
		return "student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public Student(String firstName, String lastName, double d) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = d;
	}
	public static void main(String[] args) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student("Srikrishna","chowdary",4.9));
		al.add(new Student("Sree","cherukuri",5.5));
		al.add(new Student("SRI","KRISHNA",9));
		al.add(new Student("Sri","CH",9.1));
		al.add(new Student("CH","Sri",9.2));
		double totalgpa=0;
		
		for(Student s:al)
		{
			totalgpa=totalgpa+s.getGpa();
		}
		double avgcgpa=totalgpa/al.size();
		for(Student s1:al)
		{
			if(avgcgpa<s1.getGpa())
			{
				System.out.println(s1.getLastName()+" "+s1.getFirstName()+" "+s1.getGpa() );
			}
		}
		
		
	}

}
