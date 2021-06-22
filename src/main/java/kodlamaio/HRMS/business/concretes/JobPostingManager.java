package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobPostingService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.ErrorResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.core.SuccessDataResult;
import kodlamaio.HRMS.core.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobPostingDal;
import kodlamaio.HRMS.entities.concretes.JobPosting;

@Service
public class JobPostingManager implements JobPostingService{
	private JobPostingDal jobPostingDao;
	
	@Autowired
	public JobPostingManager(JobPostingDal jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
	}

	@Override
	public DataResult<List<JobPosting>> getAll() {
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll());
	}

	@Override
	public Result add(JobPosting jobPosting) {
		if (!CheckIfNullField(jobPosting)) {
			return new ErrorResult("You have entered missing information. Please fill in all fields.");  //Eksik bilgi girdiniz. lütfen bütün boşlukları doldurun
		}
		this.jobPostingDao.save(jobPosting);
		return new SuccessResult("Job posting has been added.");  //İş ilanı eklendi

	}

	@Override
	public DataResult<List<JobPosting>> findByActiveTrue() {
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findByActiveTrue());
	}

	@Override
	public DataResult<List<JobPosting>> findByEmployer_IdAndActiveTrue(String companyName) {
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findByEmployer_IdAndActiveTrue(companyName));
	}

	@Override
	public DataResult<List<JobPosting>> findByActiveTrueOrderByReleaseDate() {
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findByActiveTrueOrderByReleaseDate());
	}

	@Override
	public DataResult<JobPosting> findByIdAndActiveTrue(int id) {
		return new SuccessDataResult<JobPosting>(this.jobPostingDao.findByIdAndActiveTrue(id)) ;
	}	

	@Override
	public DataResult<JobPosting> updateActive(int id, boolean active) {
		JobPosting tempJobPosting=jobPostingDao.findById(id).orElse(null);
		tempJobPosting.setActive(active);
		this.jobPostingDao.save(tempJobPosting);
		return new SuccessDataResult<JobPosting>(tempJobPosting);
	}

	private boolean CheckIfNullField(JobPosting jobPosting) {
		if (jobPosting.getJobPosition() != null && jobPosting.getJobDescription() != null && jobPosting.getCity() != null
				&& jobPosting.getOpenPositionCount() != 0) {
			return true;
		}
		return false;
	}

}
