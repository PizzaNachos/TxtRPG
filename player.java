
import java.util.Scanner;

public class player {
	private String profession;
	private String name;
	private int range;
	private int strength;
	private int health;
	private int posX = 0;
	private int posY = 0;

	Scanner input = new Scanner(System.in);

	public void move(){
		System.out.print("Which Direction? (left, right, forward, backward)\n\t");
		String direction = input.nextLine();
		if(direction.compareTo("left") == 0){
			posX--;
		}
		if(direction.compareTo("right") == 0){
			posX++;
		}
		if(direction.compareTo("forward") == 0){
			posY++;
		}
		if(direction.compareTo("backward") == 0){
			posY--;
		}


	}
	public void printATR(){
		System.out.println("\t\t" + name + " is a " + profession);
		System.out.println("\t\t  X: " + posX + " Y: " + posY + " Health: " + health);
	}
	public void takeDamage(int d){
	        health -= d;
	}
	public int getStrength(){
		return strength;
	}
	public int getPosX(){
		return posX;
	}
	public int getPosY(){
		return posY;
	}
	public int getHealth(){
		return health;
	}
	public int getRange(){
		return range;
	}
	public void setprofession(){
		System.out.print("Set your profession, warrior, mage, or archern\n\t");
		profession = input.nextLine();
		setattributes();
	}

	public void setname(){
		System.out.print("Set your name:\n\t");
		name = input.nextLine();
	}
	public void die(){
		try
		{
		System.out.print("\n\n\tY");
		Thread.sleep(200);
		System.out.print("o");
		Thread.sleep(200);
		System.out.print("u\n\n");
		Thread.sleep(200);
		System.out.print("\tD");
		Thread.sleep(200);
		System.out.print("i");
		Thread.sleep(200);
		System.out.print("e\n\n");
		Thread.sleep(200);
		health = 0;
		}
		catch(InterruptedException e)
		{
		System.out.println("Unknown error dying...");
		}
	}


	public void rest(){
		try
		{
		System.out.print("R");
		Thread.sleep(500);

		System.out.print("e");
		Thread.sleep(500);

		System.out.print("s");
		Thread.sleep(500);

		System.out.print("t");
		Thread.sleep(500);

		System.out.print("i");
		Thread.sleep(500);

		System.out.print("n");
		Thread.sleep(500);

		System.out.print("g");
		Thread.sleep(500);

		System.out.print(".");

		Thread.sleep(2000);
		System.out.print(".");

		Thread.sleep(2000);
		System.out.print(".");

		Thread.sleep(2000);
		System.out.print(".\n");

		health += 50;
		}
		catch(InterruptedException e)
		{
		System.out.println("Unknown error rest...");
		}
	}

	private void setattributes(){
		if(profession.compareTo("warrior") == 0){
			range = 1;
			strength = 3;
			health = 300;}
		if(profession.compareTo("mage") == 0){
			range = 2;
			strength = 2;
			health = 200;}
		if(profession.compareTo("archer") == 0){
			range = 3;
			strength = 1;
			health = 100;}
	}
}
