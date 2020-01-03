
//should make this a class that all the monsters are built off of using
//class templated or something like that inhetitance
//make all moster types different classes with their own abilities
//maybe have an items class that does different things ex weapons armor health speed item
//they change attributes 


public class monster {
	private String type;
	private int range;
	private int strength;
	private int health;
	private int posX;
	private int posY;
	private boolean isAlive;

	monster(int t, int pX, int pY, boolean b)
	{
		this.isAlive = b;
		switch(t) {
		case 0:
			this.type = "slime";
			setType("slime");
			break;
		case 1:
			this.type = "vampire";
			setType("vampire");
			break;
		case 2:
			this.type = "necromancer";
			setType("necromancer");
			break;
		default:
			System.out.println("Shit man something broke making a monster...");
		}
		posX = pX;
		posY = pY;
	}

	public void move(String d)
	{
		if(d.compareTo("left") == 0){
			posX--;
		}
		if(d.compareTo("right") == 0){
			posX++;
		}
		if(d.compareTo("forward") == 0){
			posY++;
		}
		if(d.compareTo("backwards") == 0){
			posY--;
		}
	}

	public int getPosX()
	{
		return this.posX;
	}

	public int getPosY()
	{
		return this.posY;
	}

	public int getStrength(){
		return strength;
	}

	public String getType(){
		return type;
	}

	public void takeDamage(int d)
	{
        	health -= d;
			if(health <= 0)
			{
				posX = null;
				posY = null;
				System.out.println(type + " has been slain!");
			}
	}

	public void spawn(int x, int y)
	{
		this.posX = x;
		this.posY = y;
	}

	public void setType(String type)
	{
        	if(type == "slime"){
			range = 1;
			strength = 3;
			health = 100;}
		if(type == "vampire"){
			range = 2;
			strength = 2;
			health = 50;}
		if(type == "necromancer"){
			range = 3;
			strength = 1;
			health = 25;}
	}
}
