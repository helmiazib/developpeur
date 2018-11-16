package org.api.devlang.controller;

import java.util.List;
import java.util.Optional;

import org.api.devlang.dao.DeveloppeurDao;
import org.api.devlang.entity.Developpeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloppeurController {
	
	@Autowired
	private DeveloppeurDao developpeurDao;
	
	@RequestMapping(value="/DeveloppeursByLanguage", method = RequestMethod.GET)
	public List<Developpeur> chercher(String name){
		return developpeurDao.chercher(name);
	}
	
	@RequestMapping(value = "/Developpeurs", method=RequestMethod.GET)
	public List<Developpeur> displayAllDeveloppeurs(){
		return developpeurDao.findAll();
	}
	
	@GetMapping(value = "/Developpeurs/{id}")
	public Optional<Developpeur> displayDeveloppeur(@PathVariable int id){
		return developpeurDao.findById(id);
	}
	
	@PostMapping(value="/Developpeurs")
	public Developpeur save(Developpeur developpeur){
		return developpeurDao.save(developpeur);
	}
	
	@PatchMapping(value="/Developpeurs/{id}")
	public Developpeur patch(Developpeur developpeur){
		return developpeurDao.save(developpeur);
	}
	
}
