package com.sb_academic_evo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sb_academic_evo.controller.AdminController;

@SpringBootTest
class TestAdminController {
	
	
	
	@Autowired
	AdminController adminController;
	
	
	@Test
	void testGetAllStaff() {
		assertNotNull(adminController.getAllStaff());
	}
	
	@Test
	void testGetStaffIds() {
		assertNotNull(adminController.getAllStaffIds());
	}
	
	
	@Test
	void testGetAllStudents() {
		assertNotNull(adminController.getAllStudent());
	}
	
	@Test
	void testGetAllStudentsIds() {
		assertNotNull(adminController.getAllStudentIds());
	}
	
	@Test
	@Disabled("due to testing")
	void testAdminSignIn() {
		adminController.loginRequest("sundhar@gmail.com", "Shree@123");
		assertNotNull(adminController.loginRequest("sundhar@gmail.com", "Shree@123") );
	}
	
	
	
	
	
	
//	public List<Student> getAllStudent()
	
/*
 * @GetMapping("/getStaff")
	public List<Staff> getAllStaff() {
		return service.getAllStaff();

	}
	@GetMapping("/studIds")
	public List<Integer> getAllStudentIds() {
		return service.getAllStudentIds();

	}
	
	@GetMapping("/staffIds")
	public List<Integer> getAllStaffIds() {
		return service.getAllStaffIds();

	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginRequest(@RequestParam String email, @RequestParam String password) {
		return service.findByEmail(email, password);
	}

 * 
 * */	



}
