public class Vehicle
{
	private double load;
	private double maxLoad;

	public Vehicle(double maxLoad)
	{
		this.load = load;
		this.maxLoad = maxLoad;
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
		if((weight + load) < maxLoad)
		{
			load += weight;
			return true;
		}

		else
		{
			return false;
		}
	}

	private double kiloToNewts(double weight)
	{
		return (weight * 9.8);
	}

	private double newtsToKilo(double weight)
	{
		return (weight / 9.8);
	}
	
}
