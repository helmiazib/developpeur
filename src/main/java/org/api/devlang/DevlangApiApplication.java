package org.api.devlang;

import org.api.devlang.entity.Developpeur;
import org.api.devlang.entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class DevlangApiApplication implements CommandLineRunner{
	
	@Autowired
	private RepositoryRestConfiguration repRestConfig;

	public static void main(String[] args) {
		SpringApplication.run(DevlangApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		repRestConfig.exposeIdsFor(Developpeur.class, Language.class);
	}
	
}
