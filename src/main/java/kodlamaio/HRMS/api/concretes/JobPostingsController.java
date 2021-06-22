package kodlamaio.HRMS.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobPostingService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.entities.concretes.JobPosting;

@RestController
@RequestMapping("/api/jobpostins")
public class JobPostingsController {
	private final JobPostingService jobPostingService;

	@Autowired
	public JobPostingsController(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosting>> getAll(){
		return this.jobPostingService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.add(jobPosting);
		
	}
	
	@GetMapping("/findByActiveTrue")
	public DataResult<List<JobPosting>> findByActiveTrue(){
		return this.jobPostingService.findByActiveTrue();
		
	}
	@GetMapping("/findByEmployer_IdAndActiveTrue")
	public DataResult<List<JobPosting>>findByEmployer_IdAndActiveTrue(@RequestParam int employerId){
		return this.findByEmployer_IdAndActiveTrue( employerId);
	}
	@GetMapping("/findByActiveTrueOrderByReleaseDate")
	public DataResult<List<JobPosting>>findByActiveTrueOrderByReleaseDate(){
		return this.jobPostingService.findByActiveTrueOrderByReleaseDate();
	}
	@GetMapping("/findByIdAndActiveTrue")
	public DataResult<JobPosting> findByIdAndActiveTrue(@RequestParam int id){
		return this.findByIdAndActiveTrue(id);
		
	}
	
	@PutMapping("/updateActive")
	public DataResult<JobPosting> updateActive(@RequestParam int id,@RequestParam boolean active){
		return this.jobPostingService.updateActive(id, active);
	}

	

}
