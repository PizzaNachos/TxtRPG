
import java.util.Scanner;
import java.lang.*;
public class rpg {

	Scanner usrinput = new Scanner(System.in);

	public void run(){
		player PLAYER = new player();
		PLAYER.setprofession();
		PLAYER.setname();

		int difficulty = 1;
		int turnCount = 0;

		monster monsters[3];
		monsters[0] = new monster(0,0,0,false);
		monsters[1] = new monster(1,0,0,false);
		monsters[2] = new monster(2,0,0,false);

		while(PLAYER.getHealth() > 0){

			int level = 0;
			if(monster[level].isAlive() == false)

			PLAYER.printATR();

			System.out.print("What would you like to do? (attack, move, rest, ect..)\n\t");
		 	String action;
			action = usrinput.nextLine();

			switch(action){
			case "move":
				PLAYER.move();
				break;
			case "attack":
				battle(PLAYER, monster[level]);
				break;
			case "rest":
				if(this.canRest(PLAYER, monster[level])) {
					PLAYER.rest();
				} else {
					System.out.println("There are monsters near by, you cannot rest");
				}
				break;
			case "scout":
				scout(PLAYER, monster[level]);
				break;
			case "die":
				PLAYER.die();
				break;
			case "help":
				System.out.println("Commands: move attack rest scout die help");
				break;
			default:
				System.out.println("I dont know what that means yet, maybe try something else");
				break;
			}



		}
	}

	public void scout(player P, monster M){
		int counter = 0;
		int range = P.getRange() * 2;
		for (int i = -range; i <= range; ++i)
		{
			if( (P.getPosX() + i) == M.getPosX() ){
				counter++;
			}
			if( (P.getPosY() + i) == M.getPosY()){
				counter++;
			}
		}
		if(counter >=2){
			System.out.println("There is a " + M.getType() + " At X: " + M.getPosX() + " Y: " + M.getPosY());
		}else{
			System.out.print("There is nothing you can see\n");
		}
	}

	public void spawnMonster(player P, monster M){
		int x = P.getPosX + (Math.random * 2);
		int y = P.getPosX + (Math.random * 2);
		M.spawn(x,y);
		}

	public boolean canRest(player P, monster M)
	{
		int counter = 0;
		for (int i = -1; i <= 1; ++i)
		{
			if( (P.getPosX() + i) == M.getPosX() )
			{
				counter++;
			}

			if( (P.getPosY() + i) == M.getPosY())
			{
				counter++;
			}
			if(counter >= 2)
			{
				return false;
			}
		}
		return true;
	}

	public void battle(player P, monster M)
	{
		int counter = 0;
		int range = P.getRange();
		for (int i = -range; i <= range; ++i)
		{
			if( (P.getPosX() + i) == M.getPosX() )
			{
				counter++;
			}

			if( (P.getPosY() + i) == M.getPosY())
			{
				counter++;
			}

		}
		if(counter >= 2)
		{
			System.out.println("You attack a " + M.getType() + " At X: " + M.getPosX() + " Y: " + M.getPosY());
			int strength = Math.abs(P.getStrength() - M.getStrength());
			int damage = strength * (int)((Math.random() + 1) * 15);
			P.takeDamage(damage);
			M.takeDamage(damage);

		} else {
			System.out.println("There is nothing to attack in your range");
		}
	}


	public void moveMonster(int pX, int pY, monster M)
	{
		int dX = pX - M.getPosX
		int dY = pY - M.getPosY

		if(Math.abs(dX) > Math.abs(dY)){
			if(dX > 0){
				M.move("right");
			}else{
				M.move("left");
			}
		}else{
			if(dY > 0){
				M.move("forward");
			}else{
				M.move("backward");
			}
		}
	}


	public static void main(String[] args){
		rpg game = new rpg();
		game.run();
	}
}
