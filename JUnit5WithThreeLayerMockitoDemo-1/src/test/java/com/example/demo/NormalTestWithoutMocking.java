package com.example.demo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.controller.HomeController;


@SpringBootTest
public class  NormalTestWithoutMocking {

	@Autowired
	private HomeController homeController;
	
@Test
public void test() throws Exception {
	
	
	assertEquals(homeController.ret(),"hello from ret method");
}

	
}
