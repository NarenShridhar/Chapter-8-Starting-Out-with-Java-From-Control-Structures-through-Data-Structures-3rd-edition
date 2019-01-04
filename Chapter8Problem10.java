public class Chapter8Problem10
{
	public static void main (String[] args)
	{
		// Create instance (object) of the fuelgauge class, starting the car of with 15 gallons of fuel
		FuelGauge amountFuel = new FuelGauge(10.0);

		// Create instance (object) of the odometer class, starting the odometer at 0 miles
		Odometer currentMileage = new Odometer(999999.0);

		System.out.println("The current amount of fuel is: " +  amountFuel.getFuel());
		System.out.println("The current mileage of the car is: " + currentMileage.getMileage());

		while(amountFuel.getFuel() > 0)
		{
			currentMileage.mileageUp();
			if(currentMileage.getMileage() % 1 == 0)
			{
				amountFuel.fuelDown();
			}

			System.out.println("The current amount of fuel is: " +  amountFuel.getFuel());
			System.out.println("The current mileage of the car is: " + currentMileage.getMileage());
		}
	}
}