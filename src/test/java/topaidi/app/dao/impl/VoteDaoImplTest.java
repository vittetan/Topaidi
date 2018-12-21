package topaidi.app.dao.impl;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import topaidi.app.model.ideas.Vote;
import topaidi.app.model.persons.Brain;
import topaidi.app.utils.Application;

public class VoteDaoImplTest {
	VoteDaoImpl adminDao;
	Vote var1;

	@Before
	public void init() {
		adminDao = new VoteDaoImpl();
		var1 = new Vote();
		Brain brain = new Brain();
		brain.setPseudo("Brain 1");
		var1.setBrain(brain);
	}

	@Test
	public void testFindAll() {
		Vote var2 = new Vote();
		Brain brain2 = new Brain();
		brain2.setPseudo("Brain 2");
		var2.setBrain(brain2);
		
		Vote var3 = new Vote();
		Brain brain3 = new Brain();
		brain3.setPseudo("Brain 3");
		var2.setBrain(brain3);
		
		adminDao.insert(var1);
		adminDao.insert(var2);
		adminDao.insert(var3);

		assertTrue(adminDao.findAll().size() == 3);
	}

	@Test
	public void testFindByKey() {
		adminDao.insert(var1);
		
		assertTrue(adminDao.findByKey(1).getBrain().getPseudo().equals(var1.getBrain().getPseudo()));
	}

	@Test
	public void testInsert() {
		adminDao.insert(var1);

		assertTrue(adminDao.findByKey(1).getBrain().getPseudo().equals(var1.getBrain().getPseudo()));
	}

	@Test
	public void testUpdate() {
		adminDao.insert(var1);
		var1.getBrain().setPseudo("Toto");
		adminDao.update(var1);
		
		assertTrue(adminDao.findByKey(1).getBrain().getPseudo().equals(var1.getBrain().getPseudo()));

	}

	@Test
	public void testDelete() {
		Vote var2 = new Vote();
		Brain brain2 = new Brain();
		brain2.setPseudo("Brain 2");
		var2.setBrain(brain2);
		
		adminDao.insert(var1);
		adminDao.insert(var2);
		
		adminDao.delete(var1);		
		
		assertTrue(adminDao.findAll().size() == 1);		
	}

	@Test
	public void testDeleteByKey() {
		Vote var2 = new Vote();
		Brain brain2 = new Brain();
		brain2.setPseudo("Brain 2");
		var2.setBrain(brain2);
		
		adminDao.insert(var1);
		adminDao.insert(var2);
		
		adminDao.deleteByKey(1);	
		
		assertTrue(adminDao.findAll().size() == 1);		
	}

	@After
	public void stop() {
		Application.stop();
	}

}
