public class Vehicle
{
	public double load;
	public double maxLoad;

	public Vehicle(double max_Load)
	{
		this.maxLoad = max_Load;
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