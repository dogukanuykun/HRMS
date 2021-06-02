package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobExperienceService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobExperienceDal;
import kodlamaio.HRMS.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService {

	private JobExperienceDal jobExperienceDal;
	
	@Autowired
	public JobExperienceManager(JobExperienceDal jobExperienceDal) {
		super();
		this.jobExperienceDal = jobExperienceDal;
	}

	@Override
	public DataResult<JobExperience> add(JobExperience jobExperience) {
		return new SuccessDataResult<JobExperience>(this.jobExperienceDal.save(jobExperience));
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDal.findAll(),"Listelendi.");
	}

}
