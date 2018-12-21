package topaidi.app.model.ideas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import topaidi.app.model.categories.Category;
import topaidi.app.model.persons.Brain;

@Entity
public class Vote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private boolean isTop;
	
	@Column
	private Brain brain;

	
	@ManyToOne
	@JoinColumn(name="IDEA_ID")
	private Idea idea;
	

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
