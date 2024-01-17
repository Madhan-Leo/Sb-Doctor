package com.dms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dms.dao.DoctorDAO;
import com.dms.bean.Doctor;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/hospitalmgmgtrest/api")
public class DMSController {
	@Autowired
	DoctorDAO dao;

	@PostMapping("/doctors")
	public void performInsert(@RequestBody Doctor bean) {
		dao.insert(bean);
		System.out.println("Inserted");
		List<Doctor> list = dao.view();
		System.out.println(list);
	}
}