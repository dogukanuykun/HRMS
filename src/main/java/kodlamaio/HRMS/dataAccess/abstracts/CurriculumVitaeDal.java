package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeDal extends JpaRepository<CurriculumVitae , Integer> {

}
