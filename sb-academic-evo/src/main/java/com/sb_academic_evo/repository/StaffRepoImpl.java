package com.sb_academic_evo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sb_academic_evo.entity.Staff;
import com.sb_academic_evo.entity.StaffProfile;
import com.sb_academic_evo.entity.Student;
import com.sb_academic_evo.entity.Subject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;


/*************************************************

* Author: Sundhar Raj S - 12106

* Project_Name: Stduent-mark-evaluation-system

* Class: StaffRepoImpl

************************************************/

@Repository
public class StaffRepoImpl implements StaffRepo {

	private EntityManager em;

	public StaffRepoImpl() {
		super();
	}

	@Autowired
	public StaffRepoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public Staff findStaffById(int id) {

		return em.find(Staff.class, id);
	}

	@Override
	public boolean updatePasswordUsingOldPassword(StaffProfile profile) {

		try {
			em.merge(profile);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			em.close();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudents() {

		try {
			Query query = em.createQuery("select s from Student s");

			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}

	}

	@Override
	public List<Subject> findSubjectsByStudentId(int studentId) {
		String jpql = "SELECT s FROM Subject s JOIN s.students st WHERE st.id = :studentId";
		TypedQuery<Subject> query = em.createQuery(jpql, Subject.class);
		query.setParameter("studentId", studentId);
		return query.getResultList();
	}

	@Override
	public boolean updateStaff(Staff staff) {
		try {
			em.merge(staff);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			em.close();
		}
	}

	@Override
	public boolean addStudent(Student student) {
		try {
			em.merge(student);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			em.close();
		}
	}

	@Override
	public Student findStudentById(int id) {
		
		try {
			return em.find(Student.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Staff findByEmail(String email) {
		
		Staff staff = null;
		
		try {
			Query query = em.createQuery("select s from Staff s where s.staffProfile.staffEmail = :email");
			return (Staff) query.setParameter("email", email).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return staff;
		}
		
		

	}

}
