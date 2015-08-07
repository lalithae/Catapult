package ham;

public class CatapultStats {
	
	private float weight;
	private float height;
	private int health;
	
	public void setWeight(float weight){
		this.weight = weight;
	
	}  	 
	public float getWeight(){
		return this.weight;
		
	} 
	
	public void setHeight(float height){
		this.height = height;
	}
	
	public float getHeight(){
		return this.height;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public void reload(){
		System.out.println("Reload!!");
	}

	public void fire(){
		System.out.println("let loose!!!!");
	}
	
	public void hit(){
		System.out.println("hit");
	}
	
    
 
	

}
