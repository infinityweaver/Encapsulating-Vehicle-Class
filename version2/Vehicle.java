public class Vehicle{
	
	private double load;
	private double maxLoad;

	public Vehicle(double maxLoad)
	{
		this.maxLoad = maxLoad;
	}

	public double getLoad(){
		return this.load;
	}

	public double getmaxLoad(){
		return this.maxLoad;
	}

	public boolean addBox(double weight){
		if ((weight+load) < maxLoad) {
			load = load + weight;
			return true;		
		} else {
			return false;
		}
	}

}