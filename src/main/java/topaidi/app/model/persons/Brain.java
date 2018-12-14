package topaidi.app.model.persons;

import java.util.ArrayList;
import java.util.List;

import topaidi.app.model.ideas.Comment;
import topaidi.app.model.ideas.Idea;
import topaidi.app.model.ideas.Vote;
import topaidi.app.model.reports.ReportComment;
import topaidi.app.model.reports.ReportIdea;

public class Brain extends Person {

	private boolean isValidated;
	private boolean isActivated;

	private List<Idea> ideas;
	private List<Comment> comments;
	private List<Vote> votes;
	private List<ReportIdea> reportIdeas;
	private List<ReportComment> reportComments;
	
	public Brain(String login, String password, String pseudo) {
		super(login, password, pseudo);
		setValidated(false);
		setActivated(true);
		
		this.ideas = new ArrayList<Idea>();
		this.comments = new ArrayList<Comment>();
		this.votes = new ArrayList<Vote>();
		this.reportIdeas = new ArrayList<ReportIdea>();
		this.reportComments = new ArrayList<ReportComment>();
	}

	public boolean isValidated() {
		return isValidated;
	}

	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

}
