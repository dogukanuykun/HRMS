package kodlamaio.HRMS.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="curriculum_vitaes")
public class CurriculumVitae {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @OneToMany(mappedBy = "curriculumVitae")
    @JsonIgnore
    private List<School> schools;
    
    @OneToMany(mappedBy = "curriculumVitae")
    @JsonIgnore
    private List<ForeignLanguage> foreignLanguages;
    
    @Column(name = "linkedin_address")
    private String linkedinAddress;

    @Column(name = "github_address")
    private String githubAddress;
    
    @Column(name = "cover_letter")
    private String coverLetter;

    @Column(name = "abilities")
    private String abilities;

    @JsonIgnore
    @Column(name = "created_Date")
    private LocalDate createdDate = LocalDate.now();

    @OneToMany(mappedBy = "curriculumVitae")
    @JsonIgnore
    private List<JobExperience> jobExperiences;




}
