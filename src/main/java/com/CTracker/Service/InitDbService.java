package com.CTracker.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.Persistence;
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
		
		EntityManagerFactory enttyFactory = Persistence.createEntityManagerFactory("");
		
		User user = new User();
		user.setName("hassan");
		user.setEmail("hrk@hotmail.com");
				
//		RoleAndPermission adminRole = new RoleAndPermission();
//		adminRole.setName("admin");
//		adminRole.setUser(user);
//		adminRole.setCreate(true);
//		adminRole.setUpdate(true);
//		adminRole.setDelete(false);
//		adminRole.setRead(true);
//		roleRepo.save(adminRole);
//		
//		user.setRole(adminRole);
		
		userRepo.save(user);

//		
//		List<Practise> practiseList =new ArrayList<Practise>();
//		Practise practise = new Practise();
//		practise.setName("Shakaut Khanum");
//		practiseList.add(practise);
//		
//		InsuranceDetail insuranceDetail = new InsuranceDetail();
//		insuranceDetail.setStatus("POR");
//		insuranceDetail.setApplicationFiledData(new Date());
//		insuranceDetail.setProvider("Dr asif");
//		insuranceRepo.save(insuranceDetail);
//		
//		Comment comment = new Comment();
//		comment.setDetail("Hello this is test comment");
//		comment.setDate(new Date());
//		comment.setInsuranceDetail(insuranceDetail);
//		commentRepo.save(comment);
//		
//		practiseRepo.save(practise);
//		
//		user.setPractiseList(practiseList);
//		
//		userRepo.save(user);
		
	}
}
