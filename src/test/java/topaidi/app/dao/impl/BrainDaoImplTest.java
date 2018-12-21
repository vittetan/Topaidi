package com.jpa2.app.dao.impl;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import topaidi.app.model.persons.Brain;

public class BrainDaoImplTest {
	BrainDaoImpl BrainDao;
	Brain q;

	@Before
	public void init() {
		BrainDao = new BrainDaoImpl();
		q = new Brain();
		q.setName("Brain 1");
	}

	@Test
	public void testFindAll() {
		Brain q2 = new Brain();
		q2.setName("Brain 2");
		
		Brain q3 = new Brain();
		q3.setName("Brain 3");
		
		BrainDao.insert(q);
		BrainDao.insert(q2);
		BrainDao.insert(q3);

		assertTrue(BrainDao.findAll().size() == 3);
	}

	@Test
	public void testFindByKey() {
		BrainDao.insert(q);
		
		assertTrue(BrainDao.findByKey(1).getName().equals(q.getName()));
	}

	@Test
	public void testInsert() {
		BrainDao.insert(q);

		assertTrue(BrainDao.findByKey(1).getName().equals(q.getName()));
	}

	@Test
	public void testUpdate() {
		BrainDao.insert(q);
		q.setName("Toto");
		BrainDao.update(q);
		
		assertTrue(q.getName().equals(BrainDao.findByKey(1).getName()));		
	}

	@Test
	public void testDelete() {
		Brain q2 = new Brain();
		q2.setName("Brain 2");
		
		BrainDao.insert(q);
		BrainDao.insert(q2);
		
		BrainDao.delete(q);		
		
		assertTrue(BrainDao.findAll().size() == 1);		
	}

	@Test
	public void testDeleteByKey() {
		Brain q2 = new Brain();
		q2.setName("Brain 2");
		
		BrainDao.insert(q);
		BrainDao.insert(q2);
		
		BrainDao.deleteByKey(1);	
		
		assertTrue(BrainDao.findAll().size() == 1);		
	}

	@After
	public void stop() {
		Application.stop();
	}

}
