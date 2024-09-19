public class Artist{
	private String name;
	
	//Constructor
	Artist(String name){
		this.name=name;	
	}
	//getter
	public String getName(){
		return name;
	}
	//method to display 
	public void art_info(){
		System.out.println("Artist Name : "+name);
	}
}