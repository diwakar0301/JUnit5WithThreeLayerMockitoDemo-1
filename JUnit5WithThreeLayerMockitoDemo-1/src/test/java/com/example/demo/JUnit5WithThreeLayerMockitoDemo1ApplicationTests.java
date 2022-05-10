package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.DaoInterface1;
import com.example.service.ServiceClass1;

@SpringBootTest
class JUnit5WithThreeLayerMockitoDemo1ApplicationTests {

	@InjectMocks
	private ServiceClass1 serviceClass1;
	
	@Mock
	private DaoInterface1 daoInterface1;
	
	@Test
	public void retTest() throws Exception{
		when(daoInterface1.ret()).thenReturn("a");
		assertEquals(serviceClass1.ret(),"a");
		
	}

}
