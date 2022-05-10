package com.example.demo;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.Test;
import com.example.controller.HomeController;
import com.example.service.ServiceInterface1;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeMethod;
import org.mockito.MockitoAnnotations;
@RunWith(SpringRunner.class)
@SpringBootTest
public class InOrderMock {
	@InjectMocks
	private HomeController homeController=new HomeController();	
	@Mock
	private ServiceInterface1 serviceInterface1
	//=mock(ServiceInterface1.class)
	;
@BeforeMethod
	public void setup() {
		System.out.println("@BeforeMethod TestNGMockAnnotationExample");
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void retTest() throws Exception{
		//assertEquals(homeController.ret(),"hello from ret method");
		when(serviceInterface1.add(10, 20)).thenReturn(30);
		when(serviceInterface1.ret()).thenReturn("a"); 
		assertEquals(homeController.add(10, 20),30);
		assertEquals(homeController.ret(),"a");		
		InOrder inOrder=inOrder(serviceInterface1);
		inOrder.verify(serviceInterface1).add(10,20);
		inOrder.verify(serviceInterface1).ret();
	}
}
