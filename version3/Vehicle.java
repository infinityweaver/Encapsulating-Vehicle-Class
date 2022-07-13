public class Vehicle
{
	private double load;
	private double maxLoad;
	private boolean addBox;
	private double weight;

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

	public double getweight()
	{
		return this.weight;
	}

	public boolean addBox(double weight)
	{
		if((weight + load) < maxLoad)
		{
			load +=weight;
			return true;
		}
		else
		{
			return false;
		}
	}

	private double kiloToNewts()
	{
		return (weight * 9.8);
	}
	private double newsToKilo()
	{
		return (weight / 9.8);
	}
}