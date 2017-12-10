package com.liuchunshu;

public class Test2 {

	public static void main(String[] args) {
		Person p=new Person();
		p.setUsername("asd");
		p.setNoUser();
		
		new Person().setUsername("dddd");
		new Person().setUsername("ffff");
		System.gc();
	}

}
