package topaidi.app.model.ideas;

import java.util.ArrayList;
import java.util.List;

import topaidi.app.model.persons.Brain;
import topaidi.app.model.reports.ReportComment;

public class Comment {

	private Brain brain;
	private Idea idea;
	private String description;

	private boolean isActivated;

	private List<ReportComment> reports;

	public Comment(Brain brain,Idea idea, String description) {
		setBrain(brain);
		setIdea(idea);
		setDescription(description);
		
		setActivated(true);
		
		this.reports = new ArrayList<ReportComment>();		
	}

	public Brain getBrain() {
		return brain;
	}

	public void setBrain(Brain brain) {
		this.brain = brain;
	}

	public Idea getIdea() {
		return idea;
	}

	public void setIdea(Idea idea) {
		this.idea = idea;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
