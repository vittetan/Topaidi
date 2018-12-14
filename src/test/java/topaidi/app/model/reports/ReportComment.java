package topaidi.app.model.reports;

import topaidi.app.model.ideas.Comment;
import topaidi.app.model.persons.Brain;

public class ReportComment extends Report {

	private Brain brain;
	private Comment comment;

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
