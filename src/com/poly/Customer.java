package com.poly;

public class Customer extends Car{
	
	@Override
	public void carName(String name) {
		super.carName(name);
	}
	@Override
	public void carModel(int year) {
		super.carModel(year);
	}
	public static void main(String[] args) {
		Customer r = new Customer();
		r.carName("BMW");
		r.carModel(2019);
	}
	
	
	
	
	
	

}
