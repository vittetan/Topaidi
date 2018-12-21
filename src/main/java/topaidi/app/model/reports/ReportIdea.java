package topaidi.app.model.reports;

import topaidi.app.model.ideas.Idea;
import topaidi.app.model.persons.Brain;

public class ReportIdea extends Report {

	private Idea idea;
	private Brain brain;

	public ReportIdea() {
	}
	
	public ReportIdea(Idea idea, Brain brain, String description) {
		super(description);
		setIdea(idea);
		setBrain(brain);
	}

	public Idea getIdea() {
		return idea;
	}

	private void setIdea(Idea idea) {
		this.idea = idea;
	}

	public Brain getBrain() {
		return brain;
	}

	private void setBrain(Brain brain) {
		this.brain = brain;
	}

}
