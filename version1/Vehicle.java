public class Vehicle 
{
	public double load;
	public double maxLoad;
	public Vehicle(double max_load)
	{
		this.maxLoad = max_load;
	}
	public double getLoad()
	{
		return load;
	}
	public double getMaxLoad()
	{
		return maxLoad;
	}
}