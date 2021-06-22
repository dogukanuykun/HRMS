package kodlamaio.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.JobPosting;

public interface JobPostingDal extends JpaRepository<JobPosting, Integer>{
	List<JobPosting> findByActiveTrue();
	List<JobPosting> findByEmployer_IdAndActiveTrue(String companyName);
	List<JobPosting> findByActiveTrueOrderByReleaseDate();
	JobPosting findByIdAndActiveTrue(int id);


}
