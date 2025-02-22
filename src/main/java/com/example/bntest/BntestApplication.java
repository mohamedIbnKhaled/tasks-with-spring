package com.example.bntest;

import com.example.bntest.employee.EmployeeServ;
import com.example.bntest.exercise3.AppConfig;
import com.example.bntest.exercise3.Employ;
import com.example.bntest.exercise4.AccountMang;
import com.example.bntest.exercise4.AppConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

//@SpringBootApplication
public class BntestApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BntestApplication.class, args);
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeServ.class);
//		EmployeeServ employeeServ = applicationContext.getBean(EmployeeServ.class);
//		employeeServ.createEmp(3232,"Mohamed");
//		employeeServ.createEmp(34,"khaled");
//		employeeServ.createEmp(76,"Essam");
//		employeeServ.createEmp(65,"hisham");
//		employeeServ.getAll();
//		employeeServ.deleteEmp(65);
//		employeeServ.getAll();
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		Employ employ = applicationContext.getBean(Employ.class);
//		employ.destroy();
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig2.class);
		AccountMang accountMang = applicationContext.getBean(AccountMang.class);
		accountMang.createAcc("mohamed");
		accountMang.createAcc("khaled");


	}

}
