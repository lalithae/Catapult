package ham;

public class Catapult implements CatapultConfig{

	
	private float angle;
	private boolean isLoaded;
	private boolean shoot;
	protected boolean inflamable;
	private int curHealth = 200;
	private int curArmor = 100;
	private int rand;
	private int total;
	
	
	
	
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

	@Override
	public void isHit(int rand) {
		this.rand=rand;
		if(rand%2==0){
			System.out.println(" hit");
			
		}
		else{
			System.out.println(" miss");
			
		}
		
	}
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
	public int setdamage(int curHealth, int curArmor, int damage) {
		 curArmor =  curArmor - damage;
		curHealth = curHealth -(- curArmor);
		
		this.curHealth=curHealth;
		this.curArmor=curArmor;

		if(curHealth >0){

			System.out.println("damn it we are taking damage, \n  Status Report!, \n  Damage recived: '"+ damage +"',\n the armor: '"+ curArmor+"',\n  & the health: "+ curHealth);

			return total;
		}else{
			System.out.println("you is manno!!!");
			return 0;
			}
	
}



}
