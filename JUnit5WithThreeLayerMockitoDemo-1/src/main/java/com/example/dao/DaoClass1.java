package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoClass1 implements DaoInterface1{
	
	@Override
	public int add(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in add method of DAO Class1");
		return a+b;
	}

	@Override
	public String ret() throws Exception {
		// TODO Auto-generated method stub
	//	Thread.sleep(8000);
		System.out.println("in ret method of DAO Class1");
		return "hello from ret method";
	}


}
