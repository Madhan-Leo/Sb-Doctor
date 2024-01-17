package com.dms;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dms.bean.Doctor;
import com.dms.dao.DoctorDAO;

@SpringBootTest
class SbDmsApplicationTests {

	DoctorDAO dao = new DoctorDAO();
	Doctor bean = new Doctor(101, "Madhan", "heart", "cardio", 5);

	@Test
	void testDao() {
		String expect = "Inserted";
		String result = dao.insert(bean);
		assertEquals(expect, result);
	}

}
