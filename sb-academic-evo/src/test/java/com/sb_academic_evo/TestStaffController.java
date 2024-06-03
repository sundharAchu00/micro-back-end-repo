package com.sb_academic_evo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sb_academic_evo.controller.StaffController;

@SpringBootTest
class TestStaffController {
	
	@Autowired
	StaffController controller;

	@Test
	void testGetAllStudents() {
		assertNotNull(controller.getAllStudent());
	}
	
	@Test
	void testStaffLogin() {
		assertNotNull(controller.loginRequest("t975615@gmail.com", "Srini@89"));
	}

}
