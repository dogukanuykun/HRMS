package kodlamaio.HRMS.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name="Jobseekers")
public class Jobseeker extends User {

	@Id
	@GeneratedValue
	@Column(name="jobseeker_id")
	private int id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Identity")
	private String identityNo;
	
	@Column(name = "image_url")
    private String imageUrl;
	
	@Column(name="date_of_birth")
    private int dateOfBirth;
	
	
}
