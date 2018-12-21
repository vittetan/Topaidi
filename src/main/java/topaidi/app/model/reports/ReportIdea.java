package topaidi.app.model.reports;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import topaidi.app.model.ideas.Idea;
import topaidi.app.model.persons.Brain;

@Entity
public class ReportIdea extends Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column()
	private Brain brain;
	
	@ManyToOne
	@JoinColumn(name="IDEA_ID")
	private Idea idea;
	

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
