package com.poly;

public class Users extends Facebook{

	@Override
	public void password() {
		System.out.println("Rocky@221");
	}
	public static void main(String[] args) {
		Users a = new Users();
		a.username();
		a.password();
	}
	

}
