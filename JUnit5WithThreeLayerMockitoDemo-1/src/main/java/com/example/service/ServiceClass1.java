package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DaoClass1;
import com.example.dao.DaoInterface1;

@Service
public class ServiceClass1 implements ServiceInterface1{
	
	@Autowired
	private DaoInterface1 daoInterface1;
	

	@Override
	public int add(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in add method of serviceClass1");
		return daoInterface1.add(a, b);
	}

	@Override
	public String ret() throws Exception {
		// TODO Auto-generated method stub
	//	Thread.sleep(8000);
		System.out.println("in ret method of serviceClass1");
		return daoInterface1.ret();
	}

}
