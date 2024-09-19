public class Main{
	public static void main(String arg[]){
		Artist art=new Artist("No name");
		Artwork a1=new Artwork("Book-title",2023,new artist("Nimra"));
		Artwork a2=new Artwork(artist);
		art.art_info();
		a1.artwork_info();
		a2.setYear(2024);
		a2.setTitle("Book3");
		
		a2.artwork_info();
		//shallow
		Artwork sha=a1;
		sha.artwork_info();
		//deep
		Artwork deep=new Artwork(a1)
		deep.artwork_info();
	}
}