package pack1;

class Comic extends Book{
	
	String[] characters;
	String description;
	
	public Comic(String title,String authors,String pub,String intro,String character,int year) {
		super(title, authors, pub, year);
		this.description = intro;
		this.characters = character.split(",");
		
	}
	
	
	public Comic(String title,String authors,String pub,int year) {
		super(title,authors,pub,year);
	}
	
	public void setCharacters(String characters) {
		
		this.characters = characters.split(",");
		
	}
	
	public void setDescription(String intro) {
		
		if(intro.length() > 3)
			this.description = intro;
		
	}
	
	public String[] getCharacters() {
		return this.characters;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String test() {
		return "test";
	}
	
	
}

