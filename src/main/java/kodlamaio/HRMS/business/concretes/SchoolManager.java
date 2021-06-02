package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.SchoolService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.SchoolDal;
import kodlamaio.HRMS.entities.concretes.School;


@Service
public class SchoolManager implements SchoolService{
	
	private SchoolDal schoolDal;
	
	
	@Autowired
	public SchoolManager(SchoolDal schoolDal) {
		super();
		this.schoolDal = schoolDal;
	}

	@Override
	public DataResult<List<School>> getAll() {
		return new SuccessDataResult<List<School>>(this.schoolDal.findAll(),"Bütün okullar listelendi..");
	}

	@Override
	public DataResult<List<School>> getAllSortedByDate() {
		Sort sort = Sort.by(Sort.Direction.DESC,"graduateDate");
		return new SuccessDataResult<List<School>>(this.schoolDal.findAll(sort));
	}

	@Override
	public DataResult<School> add(School school) {
		return new SuccessDataResult<School>(this.schoolDal.save(school));
	}

}
