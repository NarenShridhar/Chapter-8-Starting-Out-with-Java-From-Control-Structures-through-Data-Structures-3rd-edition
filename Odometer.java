public class Odometer
{
	// Created an instance double variable mileage to hold the current mileage of the car
	private double mileage;

	// Constructor
	public Odometer(double mileageGiven)
	{
		setMileage(mileageGiven);
	}

	// Setter method
	public void setMileage(double mileageGiven)
	{
		mileage = mileageGiven;
	}

	// Getter method
	public double getMileage()
	{
		return mileage;
	}

	// To increment the mileage
	public void mileageUp()
	{
		if(mileage>= 999999.0)
		{
			mileage = 0;
		}
		else
		{
			mileage++;
		}
	}
}