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
		return newtsToKilo(this.load);
	}

	public double getMaxLoad()
	{
		return newtsToKilo(this.maxLoad);
	}

	public boolean addBox(double weight)
	{
		if(kiloToNewts(maxLoad) >= (load + kiloToNewts(weight)))
		{
			load += kiloToNewts(weight);
			return true;
		}
		else
			return false;
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