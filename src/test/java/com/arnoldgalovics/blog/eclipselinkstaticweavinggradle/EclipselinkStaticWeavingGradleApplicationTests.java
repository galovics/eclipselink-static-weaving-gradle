package com.arnoldgalovics.blog.eclipselinkstaticweavinggradle;

import static org.junit.jupiter.api.Assertions.assertTrue;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.eclipse.persistence.internal.weaving.PersistenceWeaved;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@SpringBootTest
class EclipselinkStaticWeavingGradleApplicationTests {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Test
	public void testStaticWeavingWorks() {
		Actor actor = entityManager.find(Actor.class, EclipselinkStaticWeavingGradleApplication.ACTOR_ID);
		assertTrue(actor instanceof PersistenceWeaved, "Actor entity is not weaved by EclipseLink");
	}

}
