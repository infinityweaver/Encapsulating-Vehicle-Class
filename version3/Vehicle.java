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
		return newtsToKilo(this.load);
	}

	public double getMaxLoad()
	{
		return newtsToKilo(this.maxLoad);
	}

	public boolean addBox(double weight)
	{
		
		double loader = this.load + kiloToNewts(weight);

		if(loader < kiloToNewts(this.maxLoad))
		{
			load+=kiloToNewts(weight);
			return true;
		}

		else
		{
			return false;
		}
	}

	private double newtsToKilo(double weight)
	{
		return (weight / 9.8);
	}

	private double kiloToNewts(double weight)
	{
		return (weight * 9.8);
	}
}