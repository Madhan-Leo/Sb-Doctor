package com.dms;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dms.bean.Doctor;
import com.dms.controller.DMSController;
import com.dms.dao.DoctorDAO;

@SpringBootApplication
public class SbDmsApplication {

	public Doctor menu()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Id ,name,department , specialization , experience");

	return new Doctor(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextInt());
	}
	public static void main(String[] args) {
	SpringApplication.run(SbDmsApplication.class, args);
	SbDmsApplication obj=new SbDmsApplication();

	Doctor bean =obj.menu();
	DMSController control=new DMSController();

	control.performInsert(bean);
	}
}
