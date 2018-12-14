package topaidi.app.model.persons;

public abstract class Person {

	private String login;
	private String password;
	private String pseudo;

	public Person(String login, String password, String pseudo) {
		setLogin(login);
		setPassword(password);
		setPseudo(pseudo);
	}

	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

}
