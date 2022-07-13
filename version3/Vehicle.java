public class Vehicle
{
	private double load;
	private double maaxload;
	public Vehicle(double max_load
	{
		maxload = kilotonewts (max_load);
	}
	public double getlaod()
	{
		return newtsToKilo (load);
	}
	public double getMaxLoad()
	{
		return newtsToKilo (maxload);
	}
	public boolean addBox(double weight)
	{
		if((load + newtsToKilo(weight)<maxLoad)
		{
			load+=kiloToNewts(weight);
			return true;
		}
		else 
		return false;
	}
	private double newtsToKilo(double weight)
	{
		return(weught / 9.8);
	}
	private double kiloToNewts(double weight)
	{
		return(weight*9.8);
	}
}