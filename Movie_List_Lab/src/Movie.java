
public class Movie {
	//private class variables
	private   String title;
	private  String category;
	//movie object
	public Movie(String title, String category) {
		this.title = title;	
		this.category = category;
	}
	
	//getter
	public String getTitle() {
		return title;
	}

	//setter
	public void setTitle(String title) {
		this.title = title;
	}

	//getter
	public String getCategory() {
		return category;
	}

	//setter
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return title + ": " + category;
	}
	
}
