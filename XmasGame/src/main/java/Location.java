import java.util.Scanner;

public class Location extends Player {
	
	private String place;

	public Location(int idName, String place) {
		super(idName);
		this.place = place;
		// TODO Auto-generated constructor stub
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void ChooseLocation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a location: 'grinch' for grinch lair or 'lost' for lost pole");
        String location = sc.next();
        
        if (location.equals("grinch lair")) {
        	
        }
        
        System.out.println(location + " has been selected.");

	}

}
