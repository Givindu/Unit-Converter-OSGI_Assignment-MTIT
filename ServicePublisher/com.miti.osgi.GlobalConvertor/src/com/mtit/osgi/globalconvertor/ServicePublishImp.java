package com.mtit.osgi.globalconvertor;

public class ServicePublishImp implements ServicePublish{
	@Override
	public String publishService() {
		// TODO Auto-generated method stub
		return "Execute the publish service of ServicePublisher";
	}

	@Override
	public float convertSpeedKMtoMiles(float kilometers) {
		// TODO Auto-generated method stub
		return (float) (kilometers * 0.621371);

	}

	@Override
	public float convertSpeedMilestoKM(float miles) {
		// TODO Auto-generated method stub
		return (float) (miles * 1.60934);
	}

	@Override
	public float convertHorsepowerToKilowatt(float Horsepower) {
		// TODO Auto-generated method stub
		return (float) (Horsepower * 0.7457);
	}

	@Override
	public float convertKilowattToHorsepower(float Kilowatt) {
		// TODO Auto-generated method stub
		return (float) (Kilowatt * 1.34102);
	}

	@Override
	public float convertTerabyteToPetabyte(float Terabyte) {
		// TODO Auto-generated method stub
		return (float) (Terabyte * 0.001);
	}

	@Override
	public float convertPetabyteToTerabyte(float Petabyte) {
		// TODO Auto-generated method stub
		return (float) (Petabyte * 1000);
	}

	@Override
	public float convertDollarToRupee(float Dollar) {
		// TODO Auto-generated method stub
		return (float) (Dollar * 196.55);
	}

	@Override
	public float convertRupeeToDollar(float Rupee) {
		// TODO Auto-generated method stub
		return (float) (Rupee * 0.014);
	}
}
