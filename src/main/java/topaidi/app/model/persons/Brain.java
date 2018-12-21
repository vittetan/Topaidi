package topaidi.app.model.persons;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import topaidi.app.model.ideas.Comment;
import topaidi.app.model.ideas.Idea;
import topaidi.app.model.ideas.Vote;
import topaidi.app.model.reports.ReportComment;
import topaidi.app.model.reports.ReportIdea;

@Entity
public class Brain extends Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column()
	private boolean isValidated;
	
	@Column()
	private boolean isActivated;

	@OneToMany(mappedBy="brain")
	private Set<Idea> ideas;
	
	
	private List<Comment> comments;
	private List<Vote> votes;
	private List<ReportIdea> reportIdeas;
	private List<ReportComment> reportComments;
	
	public Brain() {
	}
	
	public Brain(String login, String password, String pseudo) {
		super(login, password, pseudo);
		setValidated(false);
		setActivated(true);
		
		this.ideas = new HashSet<Idea>();
		this.comments = new ArrayList<Comment>();
		this.votes = new ArrayList<Vote>();
		this.reportIdeas = new ArrayList<ReportIdea>();
		this.reportComments = new ArrayList<ReportComment>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Idea> getIdeas() {
		return ideas;
	}

	public void setIdeas(Set<Idea> ideas) {
		this.ideas = ideas;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Vote> getVotes() {
		return votes;
	}

	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

	public List<ReportIdea> getReportIdeas() {
		return reportIdeas;
	}

	public void setReportIdeas(List<ReportIdea> reportIdeas) {
		this.reportIdeas = reportIdeas;
	}

	public List<ReportComment> getReportComments() {
		return reportComments;
	}

	public void setReportComments(List<ReportComment> reportComments) {
		this.reportComments = reportComments;
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
