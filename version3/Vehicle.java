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
		return newtsToKilo(this.load);	
	}

	public double getMaxLoad()
	{
		return newtsToKilo(this.maxLoad);
	}

	public boolean addBox(double weight)
	{
		if((kiloToNewts(weight) + load) < maxLoad)
		{
			load +=kiloToNewts(weight);
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
