package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.entities.concretes.ForeignLanguage;

public interface ForeignLanguageService {
	
	DataResult<ForeignLanguage> add(ForeignLanguage foreignLanguage);
	DataResult<List<ForeignLanguage>> getAll();
	
	
}
