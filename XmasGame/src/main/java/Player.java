import java.util.Scanner;

public class Player {

	private int idName;

	public Player(int idName) {
		this.setIdName(idName);
	}

	public int getIdName() {
		return idName;
	}

	public void setIdName(int idName) {
		this.idName = idName;
	}

	public void LairDescription() {
		System.out.println(
				"The cold wind howling behind you as you approach the blood stained lair. You enter with caution...");
		System.out.println("You notice your magical device start to glow and shows you a number...");
		System.out
				.println("Navigate through the lair('north', 'east', 'south', 'west') for a chance of the rare loot!");
		System.out.println("Beware... as The Grinch lurks in the shadows...");
		System.out.println("");
	}

	public void Navigator() {
		int north = 2;
		int south = 2;
		int east = 2;
		int west = 2;

		int treasureX = 10;
		int treasureY = 14;
		
		int realTreasureX = 2;
		int realTreasureY = 2;
		int grinchX = 6;
		int grinchY = 14;

		int coX = 0;
		int coY = 0;		

		System.out
				.println("The device glows... " + "Required co-ordinates: " + "X: " + treasureX + ", Y: " + treasureY);
		System.out.println("The device glows... " + "Current co-ordinates: " + "X: " + coX + ", Y: " + coY);

		while (true) {

			Scanner sc2 = new Scanner(System.in);
			System.out.println("(Please enter a direction('north', 'east', 'south', 'west'): ");
			String direction = sc2.next();

			if (direction.equals("north")) {
				coX = coX + north;
				treasureX = treasureX - north;
				System.out.println(
						"The device glows... " + "Required co-ordinates: " + "X: " + treasureX + ", Y: " + treasureY);
				System.out.println("The device glows... " + "Current co-ordinates: " + "X: " + coX + ", Y: " + coY);

			} else if (direction.equals("east")) {
				coY = coY + east;
				treasureY = treasureY - east;
				System.out.println(
						"The device glows... " + "Required co-ordinates: " + "X: " + treasureX + ", Y: " + treasureY);
				System.out.println("The device glows... " + "Current co-ordinates: " + "X: " + coX + ", Y: " + coY);

			} else if (direction.equals("south")) {
				coX = coX - south;
				treasureX = treasureX + south;
				System.out.println(
						"The device glows... " + "Required co-ordinates: " + "X: " + treasureX + ", Y: " + treasureY);
				System.out.println("The device glows... " + "Current co-ordinates: " + "X: " + coX + ", Y: " + coY);

			} else if (direction.equals("west")) {
				coY = coY - west;
				treasureY = treasureY + west;
				System.out.println(
						"The device glows... " + "Required co-ordinates: " + "X: " + treasureX + ", Y: " + treasureY);
				System.out.println("The device glows... " + "Current co-ordinates: " + "X: " + coX + ", Y: " + coY);

			}

			else if (coX == realTreasureX && coY == realTreasureY) {
				System.out.println("");
				System.out.println("You see the big glowing red sack with gifts spilling out. ");
				System.out.print("You quickly dip your hand in to retrieve a gift");
				System.out.println("You retrieve a... ginger breadman...");
				System.out.println("Well done! You risked your life for a ginger breadman!");
				break; //I have no idea why this code won't execute.
			} 
			else if (coX == grinchX && coY == grinchY) {
				System.out.println("");
				System.out.println("~~~~~~~Congratulations!~~~~~~~");
				System.out.println("You found the grinch!");
				System.out.println("Enjoy the last few moments of this festive season. Merry Xmas!");
				System.out.println("PS. GAME OVER!");
				break;
			}
			
			System.out.println("");

		}
	}
}
