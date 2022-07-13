public class Vehicle
{
	private double load;
	private double maxLoad;

	public Vehicle(double maxLoad)
	{
		this.maxLoad = kiloToNewts(maxLoad);
	}

	public double getLoad()
	{
		return newtsToKilo(load);
	}

	public double getMaxLoad()
	{
		return kiloToNewts(maxLoad);
	}

	public boolean addBox(double weight)
	{
		if((load + kiloToNewts(weight)) < maxLoad)
		{
			load = load + kiloToNewts(weight);
			return true;
		}
		else 
		{
			return false;
		}
	}

	private double kiloToNewts(double weight)
	{
		return(weight * 9.8);
	}

	private double newtsToKilo(double weight)
	{
		return(weight / 9.8);
	}
}