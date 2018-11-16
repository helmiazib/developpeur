package org.api.devlang.controller;

import java.util.List;
import java.util.Optional;

import org.api.devlang.dao.LanguageDao;
import org.api.devlang.entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class LanguageController {
	
	@Autowired
	private LanguageDao languageDao;
	
	@RequestMapping(value = "/Languages", method=RequestMethod.GET)
	public List<Language> displayAllLanguages(){
		return languageDao.findAll();
	}
	
	@GetMapping(value = "/Languages/{id}")
	public Optional<Language> displayLanguage(@PathVariable int id){
		return languageDao.findById(id);
	}
	
	@RequestMapping(value = "/Languages", method= RequestMethod.POST)
	public Language save(Language language){
		return languageDao.save(language);
	}

	@RequestMapping(value = "/Languages/{id}", method= RequestMethod.PATCH)
	public Language patch(Language language){
		return languageDao.save(language);
	}
}
