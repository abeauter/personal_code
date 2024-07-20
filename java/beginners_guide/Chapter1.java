class Chapter1 {
	public static void main(String[] args) {
		int weight = 210;
		double moon_gravity = 0.17;
		System.out.println("A weight of " + weight + "lbs on the moon is " + (weight - (weight * moon_gravity)+ "lbs."));
	}
}
