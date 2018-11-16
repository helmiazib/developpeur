package org.api.devlang.dao;

import java.util.List;

import org.api.devlang.entity.Developpeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloppeurDao extends JpaRepository<Developpeur, Integer>{

	@Query("Select d from Developpeur d, Language l where l.id = d.language and l.name like :x")
	public List<Developpeur> chercher(@Param("x")String name);
}
