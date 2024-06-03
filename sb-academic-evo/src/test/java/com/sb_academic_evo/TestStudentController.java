package com.sb_academic_evo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sb_academic_evo.controller.StudentController;

@SpringBootTest
class TestStudentController {
	
	@Autowired
	StudentController controller;
	

	@Test
	void testStudentLogin() {
		assertNotNull(controller.verifyStudent("official.sundhar11@gmail.com", "Sundhar Raj S"));
	}

}
