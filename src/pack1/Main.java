package pack1;


import java.util.Scanner;

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
	
	public abstract String intro();

	
}

class Comic extends Book{
	
	String[] characters;
	String intro;
	
	public Comic(String title,String authors,String pub,String character,String intro,int year) {
		super(title, authors, pub, year);
		this.intro = intro;
		this.characters = character.split(",");
		
	}
	
	public String[] getCharacters() {
		return this.characters;
	}
	
	public String intro() {
		return this.intro;
	}
	
	
}

class History extends Book{
	
	
	private String timePeriod;
	private String intro;
	
	public History(String title,String authors,String pub,String intro,String period,int year) {
		
		super(title,authors,pub,year);
		
		
		this.timePeriod = period;
		this.intro = intro;
		
	}
	
	
	
	
	public String getTimePeriod() {
		return timePeriod;
	}




	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}




	public String getIntro() {
		return intro;
	}




	public void setIntro(String intro) {
		this.intro = intro;
	}




	public String intro() {
		return this.intro;
	}
	
}





public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String title,String authors,String pub,String character,String intro,int year
		
		Scanner sc = new Scanner(System.in);
		
		String t;
		String auth;
		String pub;
		String intro;
		
		System.out.println("enter title, authors,publications,intro about book for comic");
		
		t = sc.nextLine();
		auth = sc.nextLine();
		pub = sc.nextLine();
		intro = sc.nextLine();
		
		
		Comic c1 = new Comic(t,auth,pub,"tom,jerry",intro,1990);
		
		System.out.println("\n\n**********details of book*******");
		
		System.out.println(c1.getPublisher());
		System.out.println(c1.intro());
		

		
		
		System.out.println("enter title, authors,publications,intro about book for history");
		
		t = sc.nextLine();
		auth = sc.nextLine();
		pub = sc.nextLine();
//		intro = sc.nextLine();
		
//		String title,String authors,String pub,String intro,String period,int year
		
		System.out.println("\n\n**********details of book**********");
		
		History h1 = new History(t,auth,pub,"india ccc","1400-2000 ac",2021);
		System.out.println(h1.getPublisher());
		System.out.println(h1.intro());
		
				

	}
	

}
