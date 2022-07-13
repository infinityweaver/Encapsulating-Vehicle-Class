public class Vehicle
{
	private double load;
	private double maaxload;
	public Vehicle(double max_load
	{
		maxload = max_load;
	}
	public double getlaod()
	{
		return load;
	}
	public double getMaxLoad()
	{
		retuen maxload;
	}
	public boolean addBox(double weight)
	{
		if((load + weight)<maxLoad)
		{
			load+=weight;
			return true;
		}
		else 
		return false;
	}
}