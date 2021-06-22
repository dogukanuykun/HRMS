package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.entities.concretes.JobPosting;

public interface JobPostingService {
	DataResult<List<JobPosting>>getAll();
	Result add(JobPosting jobposting);
	DataResult<List<JobPosting>> findByActiveTrue();
	DataResult<List<JobPosting>> findByEmployer_IdAndActiveTrue(String companyName);
	DataResult<List<JobPosting>> findByActiveTrueOrderByReleaseDate();
	DataResult<JobPosting> findByIdAndActiveTrue(int id);
	DataResult<JobPosting> updateActive(int id, boolean active);
	

}
