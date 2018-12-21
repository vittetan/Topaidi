package topaidi.app.model.persons;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import topaidi.app.model.categories.Category;
import topaidi.app.model.ideas.Comment;
import topaidi.app.model.ideas.Idea;

@Entity
public class Admin extends Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	public Admin() {
		super();
	}
	
	public Admin(String login, String password, String pseudo) {
		super(login, password, pseudo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void validateBrain(Brain brain) {

	}

	public void toggleBrain(Brain brain, boolean status) {

	}

	public void deleteBrain(Brain brain) {

	}

	public void toggleIdea(Idea idea) {

	}

	public void toggleComment(Comment comment) {

	}

	public void addCategory(Category category) {

	}

	public void deleteCategory(Category category) {

	}
}
