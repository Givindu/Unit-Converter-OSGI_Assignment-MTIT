package com.mtit.osgi.globalconvertor;

public interface ServicePublish {
	public String publishService();

	public float convertSpeedKMtoMiles(float kilometers);

	public float convertSpeedMilestoKM(float miles);
	
	public float convertHorsepowerToKilowatt(float Horsepower);
	
	public float convertKilowattToHorsepower(float Kilowatt);
	
	public float convertTerabyteToPetabyte(float Terabyte);
	
	public float convertPetabyteToTerabyte(float Petabyte);
	
	public float convertDollarToRupee(float Petabyte);
	
	public float convertRupeeToDollar(float Petabyte);
}
