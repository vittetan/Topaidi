package topaidi.app.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
	private static Application instance = null;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("toto");
	
	private Application() {}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}
		return instance;
	}
	
	public static void stop() {
		Application inst = getInstance();
		inst.getEmf().close();
		instance = null;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}
}
