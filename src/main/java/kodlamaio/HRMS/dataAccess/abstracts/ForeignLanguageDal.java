package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.ForeignLanguage;

public interface ForeignLanguageDal extends JpaRepository<ForeignLanguage, Integer> {

}
