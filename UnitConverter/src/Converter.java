import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		// cups to teaspoons functions
		Converter ctt = new Converter();
		Converter ttc = new Converter();
		//second converter functions
		Converter mtk = new Converter();
		Converter ktm = new Converter();
		//Gallons to Imperial converter functions
		Converter uti = new Converter();
		Converter itu = new Converter();
		
		//scanner object to receive menu selection
		Scanner menu = new Scanner(System.in);
		
		int menuSelection;
		
		//do while loop to iterate conversion menu
		do {
		//display message asking for option
		System.out.println("Please select an Option: ");
		//options
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");
		
		//menuSelection converting input into integer
		menuSelection = menu.nextInt();
		
		//switch statement to travel to different methods
		switch(menuSelection)
		{
		//convert cups to teaspoons or teaspoons to cups
		case 1: 
			System.out.println("Choose a conversion: ");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Teaspoons to Cups");
			Scanner selection = new Scanner(System.in);
			int select = selection.nextInt();
			if (select == 1) {
				System.out.println("Enter the amount of Cups you would like to convert to Teaspoons");
				Scanner cup = new Scanner(System.in);
				double cups = cup.nextDouble();
				System.out.println(cups + " Cups is equal to: " + ctt.convertCupsToTeaspoons(cups) + " teaspoons");
			}else {
				System.out.println("Enter the amount of Teaspoons you would like to convert to Cups");
				Scanner tea = new Scanner(System.in);
				double teas = tea.nextDouble();
				System.out.println(teas + " Teaspoons are equal to: " + ttc.convertTeaspoonsToCups(teas) + " cups");
			
			}
			
			break;
			
		//converting miles to kilometers or kilometers to miles	
		case 2:
			System.out.println("Choose a Conversion: ");
			System.out.println("1. Miles to Kilometers");
			System.out.println("2. Kilometers to Miles");
			Scanner sel = new Scanner(System.in);
			int sele = sel.nextInt();
			//select which conversion
			if (sele == 1) {
				//ask how many miles are being converted to kilometers
				System.out.println("Enter the number of Miles you would like to convert to Kilometers");
				Scanner mile = new Scanner(System.in);
				double miles = mile.nextDouble();
				System.out.println(miles + " Miles is equal to: " + mtk.convertMilesToKilo(miles) + " Kilometers");
			}else {
				System.out.println("Enter the number of kilometers you would like to convert to Miles");
				Scanner kilo = new Scanner(System.in);
				double kil = kilo.nextDouble();
				System.out.println(kil + " Kilometers are equal to: " + ktm.convertKiloToMiles(kil) + " miles");
			
			}
			break;
		//converting 
		case 3:
			System.out.println("Choose a Conversion: ");
			System.out.println("1. US Gallons to Imperial Gallons");
			System.out.println("2. Imperial Gallons to US Gallons");
			Scanner selec = new Scanner(System.in);
			int selet = selec.nextInt();
			//select which conversion
			if (selet == 1) {
				//ask how many US gallons are being converted to Imperial Gallons
				System.out.println("Enter the number of US Gallons to be converted into Imperial Gallons");
				Scanner USGAL = new Scanner(System.in);
				double USGALS = USGAL.nextDouble();
				System.out.println(USGALS + " US Gallons are equal to: " + uti.convertUSGToIMPG(USGALS) + " Imperial Gallons.");
			}else {
				System.out.println("Enter the number of Imperial Gallons to be converted into US Gallons.");
				Scanner IMPG = new Scanner(System.in);
				double IMPGa = IMPG.nextDouble();
				System.out.println(IMPGa + " Imperial Gallons are equal to: " + uti.convertIMPGToUSG(IMPGa) + " US Gallons.");
			
			}
			break;
			
			
		case 4: 
			System.out.println("YOU HAVE QUIT THE PROGRAM");
		}
		
		//do while condition
		}while(menuSelection != 4);
		
		
	}
	//method to convert cups to teaspoons
	public Double convertCupsToTeaspoons(double qty) {
		return qty * 48.0d;
	}
	//method to convert teaspoons to cups 
	public Double convertTeaspoonsToCups(double qty) {
		return qty / 48d;
	}
	
	
	//method to convert miles to kilometers
	public Double convertMilesToKilo(double qty) {
		return qty * 1.609344d;
	}
	
	//method to convert kilometers to miles
	public Double convertKiloToMiles(double qty) {
		return qty / 1.609344d;
	}
	
	//method to convert US Gallons to Imperial Gallons
	public Double convertUSGToIMPG(double qty) {
		return qty / 1.201d;
	}
	
	//method to convert Imperial Gallons to US Gallons
	public Double convertIMPGToUSG(double qty) {
		return 1.201 * qty;
	}
}
