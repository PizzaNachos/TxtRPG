import java.util.Scanner;

public class rpg {

	Scanner usrinput = new Scanner(System.in);
	
	public void run(){
		player PLAYER = new player();
		PLAYER.setprofession();
		PLAYER.setname();

		int dead = 0;
		while(dead != 1){
			System.out.println("What would you like to do?");
		 	String action;
			action = usrinput.nextLine();


			switch(action){
			case "move":
				PLAYER.move();
				break;
			case "attack":
				//PLAYER.attack();
				break;
			default:
				System.out.println("I dont know what that means yet, maybe try something else");
				break;
			}
		}
	}

	public static void main(String[] args){
		rpg game = new rpg();
		game.run();
	}
}
