package ham;

public interface CatapultConfig {
	
	
	public void setAngle(float angle);
	public void setIsLoaded(boolean isLoaded);
	public boolean setShoot(boolean shoot);
	public void fire();
	public float getAngle();
	public void reload();
	public void didHit();
	public int getCurHealth();
	public int getCurArmor();
	public int setdamage(int curHealth,int curArmor, int damage);
	public int setRandom();



	
    
 
	

}
