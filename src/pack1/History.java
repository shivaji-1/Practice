package pack1;

class History extends Book{
	
	
	private String timePeriod;
	private String description;
	
	public History(String title,String authors,String pub,String description,String period,int year) {
		
		super(title,authors,pub,year);
		
		
		this.timePeriod = period;
		this.description = description;
		
	}
	
	public History(String title,String authors,String pub,int year) {
		super(title,authors,pub,year);
	}
	
	
	
	public String getTimePeriod() {
		return timePeriod;
	}




	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}




	public String getDescription() {
		return description;
	}




	public void setIntro(String intro) {
		this.description = intro;
	}




//	public String intro() {
//		return this.description;
//	}
	
}

