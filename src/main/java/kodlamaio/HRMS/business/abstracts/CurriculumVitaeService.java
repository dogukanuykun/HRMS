package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeService {
	DataResult<CurriculumVitae> add(CurriculumVitae curriculumVitae);
	DataResult<List<CurriculumVitae>> getAll();
	
}
