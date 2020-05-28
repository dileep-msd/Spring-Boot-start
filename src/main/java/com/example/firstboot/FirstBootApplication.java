package com.example.firstboot;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstboot.user.service.UserManagementService;

@SpringBootApplication
public class FirstBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBootApplication.class, args);
	}

}

@RestController
class MyRestController{
	@Autowired
	@Qualifier("aws") 
	private UserManagementService awsService;
	@Autowired
	@Qualifier("google")
	private UserManagementService googleService;
	@GetMapping("/message")
	public MyModel getMessage() {
		awsService.getUserName();
		googleService.getUserName();
		return new MyModel("hello spring", "12345");
	}
}
class MyModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3227637431295660360L;
	private String message;
	private String id;
	public MyModel(String message, String id) {
		super();
		this.message = message;
		this.id = id;
	}
	public MyModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
