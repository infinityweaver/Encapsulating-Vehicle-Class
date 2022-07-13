public class Vehicle
{
	private double load;
	private double maxLoad;

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

	public boolean addBox(double weight)
	{
		double loader = this.load + weight;

		if(loader < maxLoad)
		{
			load+=weight;
			return true;
		}

		else
		{
			return false;
		}
	}
}