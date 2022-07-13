public class Vehicle {

	private double load;
	private double maxLoad;
	public Vehicle(double max_load)
	{
		maxLoad = max_load;
	}
	public double getLoad()
	{
		return load;
	}
	public double getMaxLoad()
	{
		return maxLoad;
	}
	public boolean addBox(double weight)
	{
		if((load + weight)<maxLoad)
		{
			load+=weight;
			return true;
		}
		else
		return false;
	}
}
