package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.School;

public interface SchoolDal extends JpaRepository<School, Integer> {

}
