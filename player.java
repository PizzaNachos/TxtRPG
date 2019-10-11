import java.util.Scanner;

public class player {
	private String profession;
	private String name;
	private int range;
	private int speed;
	private int health;
	private int[] position = new int[]{0,0};

	Scanner input = new Scanner(System.in);

	public void move(){
		String direction = input.nextLine();
		System.out.println("Which Direction?");
		switch(direction){
			case "left":
				position[0] = position[0]--;
				break;
			case "right":
				position[0] = position[0]++;
				break;
			case "forward":
				position[1] = position[1]++;
				break;
			case "backward":
				position[1] = position[1]--;
				break;
		}
		System.out.println("Your position is now X: " + position[0] + "Y: " + position[1]);
	}


	public void setprofession(){
		System.out.println("Set your profession, warrior, mage, or archer");
		profession = input.nextLine();
		setattributes();
	}

	public void setname(){
		System.out.println("Set your name: ");
		name = input.nextLine();
	}

	private void setattributes(){
		if(profession == "warrior"){
			range = 1;
			speed = 1;
			health = 300;}
		if(profession == "mage"){
			range = 2;
			speed = 2;
			health = 200;}
		if(profession == "archer"){
			range = 3;
			speed = 3;
			health = 100;}
	}
}
