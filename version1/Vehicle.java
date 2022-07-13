public class Vehicle{
	
	public double load;
	public double maxLoad;

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

}