package ham;

public interface ICatapult extends Ammo {

	public void setAngle(float angle);

	public void setIsLoaded(boolean isLoaded);

	public void fire();

	public float getAngle();

	public void reload();

	public void didHit();

	public int getCurHealth();

	public int getCurArmor();
	
	public int getDamage();

	public int setdamage(int curHealth, int curArmor, int damage);
	
	public boolean isFlamable();

	public boolean isLoaded();
	
	public String getStringInput();
	
	public float getNumericalInput();




	



	

}
