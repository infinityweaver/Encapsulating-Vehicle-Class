public class Vehicle
{
	private double load;
	private double maxLoad;


	public Vehicle(double maxLoad)
	{
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

	private double kiloToNewts(double weight)
	{
		return (weight * 9.8);
	}

	private double newtsToKilo(double weight)
	{
		return (weight / 9.8);
	}

	public boolean addBox(double weight)
	{
		if ((weight+load) < maxLoad)
		{
			this.load += weight;
			return true;
		}
		else
		{
			return false;
		}
	}
}