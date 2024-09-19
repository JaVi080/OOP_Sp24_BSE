public class Artwork{
	private String title;
	private int year;
    private Artist artist;
	
	//Constructor Overloading
	//Construtor 1 : (Parametrized Constructor)
	Artwork(String title, int year,Artist artist){
		this.title=title;
		this.year=year;
		this.artist=artist;
	}
	//Constructor 2 :
	Artwork(String title,int year){
		title=title;
		year=year;
		artist=new Artist("JaVi");
	}
	//setter method 
	public void setTitle(String Title){
		this.title=title;
	}
	public void setYear(int year){
		this.year=year;
	}
	
	//getter methods
	public String getTitle(){
		return title;
	}
	public int getYear(){
		return year;
	}
	public Artist getArtist(){
		return artist;
	}
	
	//method to display Artwork_info()
	public void artwork_info(){
		System.out.println("Title : "+title+"\nYear : "+year);
		artist.art_info();
		
	}
	
	
	
}