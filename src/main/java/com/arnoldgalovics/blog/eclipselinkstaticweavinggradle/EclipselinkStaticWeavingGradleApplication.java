package com.arnoldgalovics.blog.eclipselinkstaticweavinggradle;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class EclipselinkStaticWeavingGradleApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(EclipselinkStaticWeavingGradleApplication.class, args);
	}

	public static final UUID ACTOR_ID = UUID.fromString("a6728ebd-e1be-4ba7-9738-cc45b8f0df43");

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		Actor actor = new Actor(ACTOR_ID, "Test");
		entityManager.persist(actor);
	}
}
