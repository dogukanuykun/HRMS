package kodlamaio.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.HRMS.entities.concretes.Job;
import kodlamaio.HRMS.entities.dtos.JobForListDto;

public interface JobListDal extends JpaRepository<Job, Integer> {
    
    @Query("select new com.kodlamaio.HRMS.entities.dtos.JobForListDto(j.id,j.company.companyName,j.job.name,j.NumberOfPosition,j.releaseDate,j.deadline) from Job as j where j.active=:isActive")
    List<JobForListDto> getByActiveSortedByReleaseDate(@Param("isActive") boolean isActive);
    @Query("select new com.kodlamaio.HRMS.entities.dtos.JobForListDto(j.id,j.employer.companyName,j.jobPosition.name,j.NumberOfPosition,j.releaseDate,j.deadline) from Job as j where j.active=:isActive and j.company.id=:companyId")
    List<JobForListDto> getByActiveAndCompany(@Param("isActive") boolean isActive,@Param("employerId") int companyId);
    @Query(value = "select new com.kodlamaio.HRMS.entities.dtos.JobForListDto(j.id,j.company.companyName,j.jobPosition.name,j.NumberOfPosition,j.releaseDate,j.deadline) from Job as j where j.active=:isActive")
    List<JobForListDto> getByActive(@Param("isActive") boolean isActive);

}
