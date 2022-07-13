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
		return this.load;
	}

	public double getMaxLoad()
	{
		return this.maxLoad;
	}
}