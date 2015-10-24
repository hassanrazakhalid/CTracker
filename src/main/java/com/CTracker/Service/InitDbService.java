package com.CTracker.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CTracker.Entities.*;
import com.CTracker.Repositories.*;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private InsuranceRepository insuranceRepo;
	
	@Autowired
	private CommentRepository commentRepo;
	
	@Autowired
	private PractiseRepository practiseRepo;
	
	@PostConstruct
	public void initDbDummaydata(){
		
		User user = new User();
		user.setName("hassan");
		user.setEmail("hrk@hotmail.com");
		
		RoleAndPermission adminRole = new RoleAndPermission();
		adminRole.setName("admin");
		adminRole.setUser(user);
		adminRole.setCreate(true);
		adminRole.setUpdate(true);
		adminRole.setDelete(false);
		adminRole.setRead(true);
		roleRepo.save(adminRole);
		
		user.setRole(adminRole);
		
		userRepo.save(user);
		
		
		
	}
}
