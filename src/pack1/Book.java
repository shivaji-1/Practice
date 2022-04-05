package pack1;

abstract class Book{
	
	private String title;
	private String[] authors;
	private String publisher;
	private int year;
	
	public Book(String title,String authors,String publisher,int year) {
		
		this.title = title;
		this.publisher = publisher;
		this.authors = authors.split(",");
		this.year = year;
		
		
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String[] getAuthors() {
		return this.authors;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setTitle(String title) {
		
		if(title.length() >= 3) {
			this.title = title;
		}
				
	}
	
	public void setPublisher(String pub) {
		
		if(pub.length() > 0) {
			this.publisher = pub;
		}
		
	}
	
	public void setAuthors(String authors) {
		
		if(authors.length() > 0) {
			this.authors = authors.split(",");
		}
		
	}
	
	public abstract String getDescription();

	
}
