package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CurriculumVitaeService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.CurriculumVitaeDal;
import kodlamaio.HRMS.entities.concretes.CurriculumVitae;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService {

	private CurriculumVitaeDal curriculumVitaeDal;
	
	@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDal curriculumVitaeDal) {
		super();
		this.curriculumVitaeDal = curriculumVitaeDal;
	}

	@Override
	public DataResult<CurriculumVitae> add(CurriculumVitae curriculumVitae) {
		return new SuccessDataResult<CurriculumVitae>(this.curriculumVitaeDal.save(curriculumVitae));
	}

	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		return new SuccessDataResult<List<CurriculumVitae>>(this.curriculumVitaeDal.findAll(),"Listelendi.");
	}

}
