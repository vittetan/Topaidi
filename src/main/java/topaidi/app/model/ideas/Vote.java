package topaidi.app.model.ideas;

import topaidi.app.model.persons.Brain;

public class Vote {

	private boolean isTop;
	private Brain brain;
	private Idea idea;

	public Vote() {
	}
	
	public Vote(boolean isTop, Brain brain, Idea idea) {
		setTop(isTop);
		setBrain(brain);
		setIdea(idea);
	}

	public boolean isTop() {
		return isTop;
	}

	public void setTop(boolean isTop) {
		this.isTop = isTop;
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

}
