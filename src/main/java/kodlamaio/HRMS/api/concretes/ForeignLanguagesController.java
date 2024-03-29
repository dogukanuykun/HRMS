package kodlamaio.HRMS.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.ForeignLanguageService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/foreignlanguages")
public class ForeignLanguagesController {
	
	private ForeignLanguageService foreignLanguageService;

	@Autowired
	public ForeignLanguagesController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<ForeignLanguage>> getAll(){
		return this.foreignLanguageService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<ForeignLanguage> add(@RequestBody ForeignLanguage foreignLanguage){
		return this.foreignLanguageService.add(foreignLanguage);
	}
	
}
