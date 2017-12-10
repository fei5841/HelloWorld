package com.liuchunshu;

public class Person {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setNoUser(){
		this.username=null;
	}

	@Override
	protected void finalize() throws Throwable {
		if(username!=null){
			System.out.println("*********:"+username);
		}
//		super.finalize();
	}
	
	
}
