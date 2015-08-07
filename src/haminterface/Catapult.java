package ham;

public class Catapult extends CatapultStats {

	
	private float angle;
	private boolean isLoaded;
	private boolean shoot;
	
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
		
		this.setIsLoaded(false);
		
		return this.shoot;
		
	}
	
	public void fire(){
		System.out.println("Fire!!!");
	}
	
	public void hit(){
		System.out.println("Sucessfully hit target");
	}
	
	

	
	
	
	
	
	
}
