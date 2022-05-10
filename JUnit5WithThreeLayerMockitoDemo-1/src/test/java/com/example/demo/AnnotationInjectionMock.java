package com.example.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.controller.HomeController;
import com.example.service.ServiceClass1;
import com.example.service.ServiceInterface1;



@SpringBootTest
public class AnnotationInjectionMock {
	
	
	@InjectMocks
	private HomeController homeController=new HomeController();
	
	@Mock
	private ServiceInterface1 serviceInterface1;
	
	private HomeController homeController2;
	private ServiceInterface1 serviceInterface2;
	
	
	@BeforeEach
    void setup() {
        // Alternative way of creating a spy
        // List<String> list = new LinkedList<>();
        // List<String> spy = spy(list);
		homeController2=new HomeController();
		ServiceClass1 ss=new ServiceClass1();
		serviceInterface2=spy(ss);
    }

@Test
@DisplayName("Test3")
public void retTest() throws Exception{
	//assertEquals(homeController.ret(),"hello from ret method");
	
	when(serviceInterface1.ret()).thenReturn("a");
	assertEquals(homeController.ret(),"a");
	assertEquals(homeController2.ret(),"hello from ret method");
//	assertEquals(homeController.ret(),"a");
//	assertEquals(homeController.ret(),"a");
//	verify(serviceInterface1,times(3)).ret();
//	verify(serviceInterface1,never()).ret();
//	verify(serviceInterface1,atLeastOnce()).ret();
//	verify(serviceInterface1, atLeast(2)).ret();
//	verify(serviceInterface1,atMost(3)).ret();
	
	//verify(serviceInterface1,timeout(1)).ret();
}

//@Test
//@DisplayName("Test1")
//public void addTest() throws Exception{
//	
//	when(serviceInterface1.add(10, 20)).thenReturn(30);
//	assertEquals(homeController.add(10, 20),30);
//	
//	
//}

//	@Test(expected=Exception.class)
//	public void checkException() throws Exception{
//		
//		 doThrow(new Exception("mthod not implementation"))
//         .when(serviceInterface1).add(10,20);
//
//      //test the add functionality
//      assertEquals(homeController.add(10, 20),30); 		
	//}


//@Test
//@DisplayName("Test2")
//public void checkException1() throws Exception{
//	
//	Exception e= assertThrows(Exception.class,()->{throw new Exception("exc");}); //pass
//	 assertEquals("exc",e.getMessage());//pass
// //assertEquals("exce",e.getMessage()); //fail
////	 assertThrows(Exception.class,()->{throw new Throwable();}); //fails
//	
//}

}
