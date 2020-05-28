package com.example.firstboot.dummy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//@SpringBootTest
public class MyServiceTest {
   // @Autowired
	private MyService myService = new MyService();
	@Test
	private void test_getMessage() {
		System.out.print(myService.getMessage());
	}
}
