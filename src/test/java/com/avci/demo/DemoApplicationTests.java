package com.avci.demo;

import com.avci.rest.StudentInfoController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Mock
	static StudentInfoController studentInfo;


	@BeforeAll
	public static void setUp() {
		studentInfo = new StudentInfoController();
	}
	@Test
	void contextLoads() {
		String s = studentInfo.hello();
	}

}
