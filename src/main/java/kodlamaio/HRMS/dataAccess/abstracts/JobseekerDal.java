package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Jobseeker;
import kodlamaio.HRMS.entities.concretes.User;

public interface JobseekerDal extends JpaRepository<Jobseeker, Integer> {
	
	Jobseeker getById(int id);
	User getByIdentityNo(String identityNo);
    
}
