/* 
	Try this 1-1 
	
	This program converts gallons to litres.

	Call this program GalToLit.java 

*/
class GalToLit {
	public static void main(String[] args) {
		double gallons; //holds the number of gallons.
		double liters; //holds conversion to litres

		gallons = 10;

		liters = (gallons * 3.7854); 
		
		System.out.println(gallons + " gallons is " + liters + " liters.");
	}
}
