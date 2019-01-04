public class FuelGauge
{
	// Created an instance double variable gallons to hold the current gallons of fuel in the car
	private double gallons;

	// Constructor
	public FuelGauge(double gallonsGiven)
	{
		setFuel(gallonsGiven);
	}

	// Setter method
	public void setFuel(double gallonsGiven)
	{
		gallons = gallonsGiven;
	}

	// Getter method
	public double getFuel()
	{
		return gallons;
	}

	// To increment the fuel
	public void fuelUp()
	{
		if(gallons < 15)
		{
			gallons++;
		}
	}

	// To decrement the fuel
	public void fuelDown()
	{
		if(gallons > 0)
		{
			gallons--;
		}
	}
}