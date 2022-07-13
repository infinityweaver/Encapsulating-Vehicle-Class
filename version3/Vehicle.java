public class Vehicle
{
	private double load;
	private double maxLoad;

	public Vehicle(double maxLoad)
	{
		this.maxLoad = this.kiloToNewts(maxLoad);
	}

	public double getLoad()
	{
		return this.newtsToKilo(load);
	}

	public double getMaxLoad()
	{
		return this.newtsToKilo(maxLoad);
	}

	public boolean addBox(double weight)
	{
		if((this.kiloToNewts(weight) + load) < maxLoad)
		{
			load = load + this.kiloToNewts(weight);
			return true;
		}
		else 
		{
			return false;
		}
	}
	private double kiloToNewts (double weight) 
	{
		return (weight * 9.8);
	}
	private double newtsToKilo (double weight) 
	{
		return (weight / 9.8);
	}
}