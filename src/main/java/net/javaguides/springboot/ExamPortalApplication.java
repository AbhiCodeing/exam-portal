package net.javaguides.springboot;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import net.javaguides.springboot.model.Role;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.model.UserRole;
import net.javaguides.springboot.service.UserService;

@SpringBootApplication
public class ExamPortalApplication implements CommandLineRunner  {
	
	/*
	 * @Autowired private UserService userService;
	 * 
	 * 
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 */

	public static void main(String[] args)
	{
		SpringApplication.run(ExamPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * System.out.println("Starting code");
		 * 
		 * User user=new User(); bCryptPasswordEncoderser.setFirstName("Abhishek");
		 * user.setLastName("Gharjale"); user.setUsername("abhi007");
		 * user.setPassword(this..encode("abhi1234...."));
		 * user.setEmail("abhigharjale@gmail.com"); user.setProfile("default.png");
		 * 
		 * Role role=new Role(); role.setRoleId(45L); role.setRoleName("ADMIN");
		 * 
		 * Set<UserRole> set=new HashSet<>(); UserRole userRole=new UserRole();
		 * userRole.setUser(user); userRole.setRole(role); set.add(userRole);
		 * 
		 * User user1=this.userService.createUser(user,set);
		 * System.out.println(user1.getUsername());
		 */
		
	}

}
