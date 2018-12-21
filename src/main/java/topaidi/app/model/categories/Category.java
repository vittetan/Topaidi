package topaidi.app.model.categories;

import java.util.List;

import topaidi.app.model.ideas.Idea;

public class Category {

	private String name;
	private String description;
	private List<Idea> ideas;

	public Category() {
	}
	
	
	public Category(String name, String description, List<Idea> ideas) {
		setName(name);
		setDescription(description);
		setIdeas(ideas);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Idea> getIdeas() {
		return ideas;
	}

	public void setIdeas(List<Idea> ideas) {
		this.ideas = ideas;
	}

}
