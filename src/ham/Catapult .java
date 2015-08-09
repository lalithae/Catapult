package ham;

public class Catapult implements CatapultConfig{

	
	private float angle;
	private boolean isLoaded;
	private boolean shoot;
	protected boolean inflamable;
	private int curHealth = 200;
	private int curArmor = 100;
	private int rand;

	
	
	
	
	public Catapult(){
		System.out.println("Ready");
	}
	
	public void setAngle(float angle){
		this.angle=angle;		
	}
	
	public float getAngle(){
		return this.angle;
	}
	
	public boolean isLoaded(){
		return this.isLoaded;
	}
	
	public void setIsLoaded( boolean isLoaded){
		
		this.isLoaded = isLoaded;
	}
	
	public boolean setShoot(boolean shoot){	
		return this.shoot;
		
	}
	
	
	public void fire(){
		this.setIsLoaded(false);	
		System.out.println("Fire!!!");
	}
	
	public void didHit(){
		System.out.println("Sucessfully hit target");
	}
	
	public void reload(){
		System.out.println("Reload!!");
	}

//	@Override
//	public void isHit(int rand) {
//		this.rand=rand;
//		if(rand%2==0){
//			didHit();
//			
//		}
//		else{
//			System.out.println(" miss");
//			
//		}
//		
//	}
	public int setRandom() {
		rand = (int) Math.ceil(Math.random()*100);
		return this.rand;

	}
	
@Override
	public int getCurHealth() {
		return this.curHealth;	
	
	}
	
	public int getCurArmor() {
		return this.curArmor;	
	
	}





	@Override
	public  int setdamage(int curHealth, int curArmor, int damage) {
		 curArmor =  curArmor - damage;
		 this.curArmor=curArmor;
		
		if(curArmor <=0){
			
			curHealth = curHealth -(- curArmor);
			this.curHealth=curHealth;
			System.out.println("Status Report!, \n  Damage Dealt: '"+ damage +"',\n the armor energy: '"+ curArmor+"',\n  & the current health: "+ curHealth);
		}else{
			System.out.println("Status Report!, \n  Damage Dealt: '"+ damage +"',\n the armor energy: '"+ curArmor+"',\n  & the current health: "+ curHealth);
				
}
		return damage;
}


}
