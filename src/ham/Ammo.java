package ham;

public class Ammo implements IAmmo {
	private String ammoType;
	private int damage;
	

	@Override
	public void create(String ammoType) {
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
	public int getDamage(){
		return this.damage;
	}
	
}