package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.entities.concretes.JobExperience;

public interface JobExperienceService {
	DataResult<JobExperience> add(JobExperience jobExperience);
	DataResult<List<JobExperience>> getAll();
	
}
