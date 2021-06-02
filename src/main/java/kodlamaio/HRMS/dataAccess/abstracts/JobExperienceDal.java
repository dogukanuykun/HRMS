package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.JobExperience;

public interface JobExperienceDal extends JpaRepository<JobExperience, Integer> {

}
