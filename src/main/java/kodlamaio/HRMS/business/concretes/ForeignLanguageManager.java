package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.ForeignLanguageService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.ForeignLanguageDal;
import kodlamaio.HRMS.entities.concretes.ForeignLanguage;


@Service
public class ForeignLanguageManager implements ForeignLanguageService{

	private ForeignLanguageDal foreignLanguageDal;
	
	@Autowired
	public ForeignLanguageManager(ForeignLanguageDal foreignLanguageDal) {
		super();
		this.foreignLanguageDal = foreignLanguageDal;
	}

	@Override
	public DataResult<ForeignLanguage> add(ForeignLanguage foreignLanguage) {
		return new SuccessDataResult<ForeignLanguage>(this.foreignLanguageDal.save(foreignLanguage));
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAll() {
		return new SuccessDataResult<List<ForeignLanguage>>(this.foreignLanguageDal.findAll(),"Diller listelendi");
	}

}
