package ham;



public class Catapult implements ICatapult {

	private float angle;
	private boolean isLoaded;
	protected boolean flamable = true;
	private int curHealth = 200;
	private int curArmor = 100;

	
	public Catapult() {
	}

//	public int getDamage(){
//		return this.damage;
//	}
//	
	public void setAngle(float angle) {
		this.angle = angle;
	}

	public float getAngle() {
		System.out.println(angle);
		return this.angle;
	
	}

	public boolean isLoaded() {
		return this.isLoaded;
	}

	public void setIsLoaded(boolean isLoaded) {

		this.isLoaded = isLoaded;
	}

	public void fire() {
		this.setIsLoaded(false);
		System.out.println("Fire!!!");
	}

	public void didHit() {
		System.out.println("Sucessfully hit target");
	}

	public void reload() {
		System.out.println("Reload!!");
	}

	@Override
	public int getCurHealth() {
		return this.curHealth;

	}

	public int getCurArmor() {
		return this.curArmor;

	}

	@Override
	public int setdamage(int curHealth, int curArmor, int damage) {
		curArmor = curArmor - damage;
		this.curArmor = curArmor;

		if (curArmor <= 0) {

			curHealth = curHealth - (-curArmor);
			this.curHealth = curHealth;
			System.out.println("Status Report!, \n  Damage Dealt: '" + damage
					+ "',\n the armor energy: '" + curArmor
					+ "',\n  & the current health: " + curHealth);
		} else {
			System.out.println("Status Report!, \n  Damage Dealt: '" + damage
					+ "',\n the armor energy: '" + curArmor
					+ "',\n  & the current health: " + curHealth);

		}
		return damage;
	}

	@Override
	public boolean isFlamable() {
		return this.flamable;
	}


	



		







}
