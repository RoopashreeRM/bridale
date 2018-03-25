package com.src.service;

public class dbFactory1 {
	private dbFactory1(){
		
	}
	private static dbintr1 di;
	public static dbintr1 getInstance(){
		di=new dbimp();
		return di;
	}

}
