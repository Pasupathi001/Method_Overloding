package com.poly;

public class overload {

	public void clg(String name) {
		
		System.out.println("My college name is "+name);
	}
	public  void clg(int rollno,String dept) {
		System.out.println(rollno);
		System.out.println(dept);
		
	}
	public void clg(float cgpa,float gpa) {
		System.out.println(cgpa);
		System.out.println(gpa);
		
	}
	public static void main(String[] args) {
		overload e = new overload();
		e.clg("Rajalakshmi Engineering College");
		e.clg(191001061, "Information Technology");
		e.clg(8.5f, 8.23f);
	}
}
 
