package topaidi.app.model.reports;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import topaidi.app.model.ideas.Comment;
import topaidi.app.model.persons.Brain;

@Entity
public class ReportComment extends Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column()
	private Brain brain;
	
	@Column()
	private Comment comment;

	public ReportComment() {
	}
	
	public ReportComment(Brain brain,Comment comment, String description) {
		super(description);
		setBrain(brain);
		setComment(comment);
	}

	public Brain getBrain() {
		return brain;
	}

	public void setBrain(Brain brain) {
		this.brain = brain;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

}
