package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.entities.concretes.School;

public interface SchoolService {
	DataResult<List<School>> getAll();
	DataResult<List<School>> getAllSortedByDate();
	DataResult<School> add(School school);
}
