package topaidi.app.model.persons;

import topaidi.app.model.categories.Category;
import topaidi.app.model.ideas.Comment;
import topaidi.app.model.ideas.Idea;

public class Admin extends Person {

	public Admin() {
		super();
	}
	
	public Admin(String login, String password, String pseudo) {
		super(login, password, pseudo);
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
