package com.poly;

public class Son implements Father,Mother {

	@Override
	public void mname() {
		System.out.println("Ana");

		
	}

	@Override
	public void mage() {
		System.out.println("45");
		
	}

	@Override
	public void name() {
		System.out.println("Mike");
		
	}

	@Override
	public void age() {
		System.out.println("56");
		
	}
	public static void main(String[] args) {
		Son q = new Son();
		q.mname();
		q.mage();
		q.name();
		q.age();
	}

}
