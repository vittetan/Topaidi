package topaidi.app.model.ideas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import topaidi.app.model.categories.Category;
import topaidi.app.model.persons.Brain;
import topaidi.app.model.reports.ReportIdea;

public class Idea {

	private Brain brain;
	private String title;
	private String description;
	private Category category;
	private String image;

	private Date dateCreation;
	private Date dateEnd;
	private boolean isActivated;

	private List<Comment> comments;
	private List<Vote> votes;
	private List<ReportIdea> reportIdeas;

	public Idea(Brain brain, String title, String description, Category category) {
		setBrain(brain);
		setTitle(title);
		setDescription(description);
		setCategory(category);

		setDateCreation();
		setDateEnd();
		setActivated(true);

		this.comments = new ArrayList<Comment>();
		this.votes = new ArrayList<Vote>();
		this.reportIdeas = new ArrayList<ReportIdea>();
	}

	public Idea(Brain brain, String title, String description, String image, Category category) {
		setBrain(brain);
		setTitle(title);
		setDescription(description);
		setCategory(category);
		setImage(image);

		setDateCreation();
		setDateEnd();
		setActivated(true);

		this.comments = new ArrayList<Comment>();
		this.votes = new ArrayList<Vote>();
		this.reportIdeas = new ArrayList<ReportIdea>();
	}

	
	public List<Idea> topRanking(){
		return new ArrayList<Idea>();
	}
	
	public List<Idea> buzzRanking(){
		return new ArrayList<Idea>();
	}
	
	public int myTopRanking() {
		return 0;
	}
	
	public int myBuzzRanking() {
		return 0;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation() {
		this.dateCreation = new Date();
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd() {
		this.dateEnd = new Date();
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brain getBrain() {
		return brain;
	}

	public void setBrain(Brain brain) {
		this.brain = brain;
	}

}
