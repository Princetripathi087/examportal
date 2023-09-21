package com.exam;

import com.exam.entity.Roles;
import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
		System.out.println("Hello");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");

//		User user = new User();
//
//		user.setFirstname("Prince");
//		user.setLastname("Tripathi");
//		user.setUsername("princetripathi");
//		user.setPassword("abc");
//		user.setEmail("abc@gmail.com");
//		user.setProfile("default.png");
//
//		Roles role1 = new Roles();
//		role1.setRoleId(44L);
//		role1.setRoleName("Admin");
//
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		User user1 = this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());
		//userRoleSet.add(UserRole)

	}
}
