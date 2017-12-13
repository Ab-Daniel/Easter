package Easter;

public class EasterTest
{
	public static void main(String[ ] args)
	{
		Easter easter = new Easter();
		
		System.out.println("Easter's date for the year " + easter.getYear());
		System.out.println("Month: " + easter.getMonthName());		//get month and date
		System.out.println("Date: " + easter.getDate());
	}
}
