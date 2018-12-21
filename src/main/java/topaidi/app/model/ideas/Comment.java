package topaidi.app.model.ideas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import topaidi.app.model.persons.Brain;
import topaidi.app.model.reports.ReportComment;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private Brain brain;
	
	@Column
	private String description;
	
	@Column
	private boolean isActivated;
	
	@ManyToOne
	@JoinColumn(name="IDEA_ID")
	private Idea idea;

	
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
