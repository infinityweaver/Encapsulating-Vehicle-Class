public class Vehicle
{
	private double load;
	private double maxLoad;

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

	public boolean addBox(double weight)
	{
		if(maxLoad >= (load + weight))
		{
			load += weight;
			return true;
		}
		else
			return false;
	}
}