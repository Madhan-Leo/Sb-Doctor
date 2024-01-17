package com.dms.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.dms.bean.Doctor;

@Repository
public class DoctorDAO {
	static List<Doctor> list;

	public static String insert(Doctor bean) {
		list = new ArrayList<Doctor>();
		list.add(bean);
		return "Inserted";
	}

	public static List<Doctor> view() {
		return list;
	}

}