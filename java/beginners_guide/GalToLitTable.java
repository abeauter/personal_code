/*
	Program prints a table of 1-100 gallons to litre conversion(s)
	Every ten gallons a blank line will be printed. 
*/

class GalToLitTable {
	public static void main(String[] args) {
		double gallons, liters = 0.0;
		int counter = 0;
		
		for (gallons = 1; gallons <= 100; gallons++) {
			liters = (gallons * 3.7854);
			System.out.println(gallons + " gallons is " + liters + " liters.");
			counter++;
			if (counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}
}
