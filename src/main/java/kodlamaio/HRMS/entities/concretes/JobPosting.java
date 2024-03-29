package kodlamaio.HRMS.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_postings")
public class JobPosting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_salary")
	private int min_salary;
	
	@Column(name="max_salary")
	private int max_salary;
	
	@Column(name="release_date")  
	private Date releaseDate;
	
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@Column(name="is_active")
	private Boolean active;
	
	@Column(name = "open_position_count")
	private int openPositionCount;

	@ManyToOne()
	@JoinColumn(name="company_id")
	private Company company;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private Job jobPosition;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	
	
	

}
