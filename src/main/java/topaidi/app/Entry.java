package topaidi.app;

import topaidi.app.dao.impl.CategoryDaoImpl;

public class Entry {

	public static void main(String[] args) {
		CategoryDaoImpl catDAO = new CategoryDaoImpl(); 
		catDAO.findAll();
	}

}
