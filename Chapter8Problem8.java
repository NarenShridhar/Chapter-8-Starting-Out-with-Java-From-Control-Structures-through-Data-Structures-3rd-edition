public class Chapter8Problem8
{
	public static void main (String[] args)
	{
		ParkedCar car1 = new ParkedCar("Lamborghini", "2018", "Gold", "ABCDEFGH", 60);
		ParkingMeter meter1 = new ParkingMeter(120);
		PoliceOfficer officer1 = new PoliceOfficer("James", "4788");

		
		ParkingTicket ticket1 = officer1.examine(car1, meter1);

		if(ticket1 != null)
		{
			System.out.println("There is a ticket here");	
		}

		else
		{
			System.out.println("No crimes committed");
		}
	}
}