package ham;

import java.util.Scanner;

public class Catapult implements ICatapult {

	private float angle;
	private boolean isLoaded;
	protected boolean flamable = true;
	private int curHealth = 200;
	private int curArmor = 100;
	private int damage;
	private String ammoType;
	Scanner input = new Scanner(System.in);
	
	
	public Catapult() {
	}

	public int getDamage(){
		return this.damage;
	}
	
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

	@Override
	public void setAmmoType(String ammoType) {
		this.ammoType = ammoType;
		switch (ammoType){
		case "wood":
			System.out.println("you chose ammo type : "+ ammoType);
			this.damage = 30;
			break;
		case "stone":
			System.out.println("you chose ammo type : "+ ammoType);
			this.damage= 75;
			break;
		case "motar":
			System.out.println("you chose ammo type : "+ ammoType);
			this.damage= 95;
			break;
		default :
			System.out.println("pleas enter the god dam options, you blind bat, im not an ace programmer to promp you to chose again, re-run smarty pants");
			
		break;
		}
	}
		

	@Override
	public String getAmmoType() {
		System.out.println(ammoType);
		return this.ammoType;
		
	}

	@Override
	public String getStringInput() {
		String ammoType = input.nextLine();
		
		return ammoType;
	}

	@Override
	public float getNumericalInput() {
		float angle = input.nextFloat();
		// TODO Auto-generated method stub
		return angle;
	}





}
