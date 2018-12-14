package topaidi.app.model.reports;

public abstract class Report {

	private String description;

	public Report(String description) {
		setDescription(description);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
