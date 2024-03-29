package kodlamaio.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import kodlamaio.HRMS.entities.abstracts.Position;


@Data
@Entity
@Table(name="JobTitles")
public class Job implements Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@OneToMany(mappedBy = "jobPosition")
	private List<JobPosting> jobPostings;
	
	
	
	

}
