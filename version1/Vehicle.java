public class Vehicle
{
	public double load;
	public double maxLoad;

	public Vehicle(double maxLoad)
	{
	this.maxLoad = maxLoad;
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