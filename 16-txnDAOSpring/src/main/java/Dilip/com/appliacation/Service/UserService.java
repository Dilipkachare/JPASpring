package Dilip.com.appliacation.Service;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dilip.com.appliacation.Repository.UserRepo;
import Dilip.com.appliacation.entity.User;

@Service
public class UserService  {

	@Autowired
	private UserRepo userRepo;
	
	public void saveUser() throws Exception {
		String path="C:\\Users\\91777\\Desktop\\SpringAppliacation\\DilipPassport.jpg";

		File file=new File(path);
		if(!file.exists()) {
			System.out.println("File not found");
		}
		
		User user=new User();
		user.setUserName("Dilip");
		user.setUserEmail("Dilip.@gmail.com");
		
		byte[] arr=new byte[2048];
		
		FileInputStream fileInputStream=new FileInputStream(file);
		fileInputStream.readAllBytes();
		fileInputStream.close();
		user.setUserImage(arr);
		
		userRepo.save(user);
		System.out.println("Image save sucssfully");
		
	}

	
}
