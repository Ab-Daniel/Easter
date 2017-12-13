package Easter;

import javax.swing.JOptionPane;

public class Easter 
{
	private int year;
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int g;
	private int h;
	private int j;
	private int k;
	private int m;
	private int r;
	private int n;
	private int p;

	private static final String ALL_THE_MONTHS = 
					  "January  "
					+ "February "
					+ "March    "
					+ "April    "
					+ "May      "
					+ "June     "
					+ "July     "
					+ "August   "
					+ "September"
					+ "October  "
					+ "November "
					+ "December ";
	
	public Easter()					//constructor
	{
		setYear(Integer.parseInt(JOptionPane.showInputDialog("Enter the year:")));

		a = year % 19;									//calculations 
		b = year / 100;
		c = year % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g) % 30;
		j = c / 4;
		k = c % 4;
		m = (a + 11 * h) / 319;
		r = (2 * e + 2 * j - k - h +m + 32) % 7;
		n = (h - m + r + 90) / 25;
		p = (h - m + r + n + 19) % 32;
}
	
	public void setYear(int value)				//set year
	{
		year = value;
	}

	public int getYear()						//get year
	{
		return year;
	}
	
	public int getMonth()						//get month
	{
		return n;
	}
	
	public int getDate()						//get date
	{
		return p;
	}
	
	public int getFirstLetter()					//get first letter
	{
		return (n * 9) - 9;
	}
	
	public int getLastLetter()						//get last letter
	{
		return (n * 9);
	}
	
	public String getMonthName()			//get the month name
	{
		return ALL_THE_MONTHS.substring(getFirstLetter(), getLastLetter());
	}
}
