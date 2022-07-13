public class Vehicle
{
	private double load;
	private double maxLoad;
	private boolean addBox;

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
		if((weight + load) < maxLoad)
		{
			load +=weight;
			return true;
		}else
		{
			return false;
		}

		


		
	}
}