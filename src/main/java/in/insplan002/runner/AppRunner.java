/*package in.insplan002.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.insplan002.entity.EligibilityDetails;
import in.insplan002.repository.EligibilityDetailsRepo;

@Component
public class AppRunner implements ApplicationRunner{

	@Autowired
	private EligibilityDetailsRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		EligibilityDetails entity1 = new EligibilityDetails();
		entity1.setEligId(1);
		entity1.setName("Shiva");
		entity1.setMobile(8794739917l);
		entity1.setEmail("shiva.java@gmail.com");
		entity1.setGender('M');
		entity1.setSsn(8027414285l);
		entity1.setPlanName("SAP");
		entity1.setPlanStatus("Approved");
		
		repo.save(entity1);
		
		EligibilityDetails entity2 = new EligibilityDetails();
		entity1.setEligId(2);
		entity1.setName("Vishnu");
		entity1.setMobile(9704882702l);
		entity1.setEmail("vishnu.java@gmail.com");
		entity1.setGender('M');
		entity1.setSsn(972835782l);
		entity1.setPlanName("CCAP");
		entity1.setPlanStatus("Denied");
		
		repo.save(entity2);
		
		EligibilityDetails entity3 = new EligibilityDetails();
		entity1.setEligId(3);
		entity1.setName("Mahesh");
		entity1.setMobile(9126497391l);
		entity1.setEmail("mahesh.java@gmail.com");
		entity1.setGender('M');
		entity1.setSsn(90143979274l);
		entity1.setPlanName("SAP");
		entity1.setPlanStatus("Pending");
		
		repo.save(entity3);
		
		EligibilityDetails entity4 = new EligibilityDetails();
		entity1.setEligId(4);
		entity1.setName("Sitara");
		entity1.setMobile(92749273932l);
		entity1.setEmail("sitara.java@gmail.com");
		entity1.setGender('F');
		entity1.setSsn(6729840280l);
		entity1.setPlanName("MEDICAL");
		entity1.setPlanStatus("Approved");
		
		repo.save(entity4);
	}

}*/
