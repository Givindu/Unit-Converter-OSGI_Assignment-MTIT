package energyconverter_subscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.osgi.globalconvertor.ServicePublish;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start energy convertor subscriber");
		serviceReference = bundleContext.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish) bundleContext.getService(serviceReference);
		System.out.println(servicePublish.publishService());
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Select one option");
		System.out.println("Convert Horsepower to Kilowatt : Enter 1");
		System.out.println("Convert Kilowatt to Horsepower : Enter 2");

		int number = scan.nextInt();

		if (number == 1) {
			System.out.println("Power in Horsepowers : ");
			float value1 = scan.nextFloat();

			System.out.println(value1+" Horsepower into Kilowatt is: "+servicePublish.convertHorsepowerToKilowatt(value1));
			
System.out.println("Do you want to continue [y/n]?");
			
			String answer = scan.next();
			if(answer.equals("n") || answer.equals("N")) {
				System.out.println("Good bye!!!");
			} if(answer.equals("y") || answer.equals("Y")) {
				start(bundleContext);
			} else {
				System.out.println("Please press 'n' or 'y'");
			}
		} else {
			System.out.println("Power in Kilowatt : ");
			float value2 = scan.nextFloat();

			System.out.println(value2+" Kilowatt into Horsepower is: "+servicePublish.convertKilowattToHorsepower(value2));
			
System.out.println("Do you want to continue [y/n]?");
			
			String answer = scan.next();
			if(answer.equals("n") || answer.equals("N")) {
				System.out.println("Good bye!!!");
			} if(answer.equals("y") || answer.equals("Y")) {
				start(bundleContext);
			} else {
				System.out.println("Please press 'n' or 'y'");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good bye!!!");
		bundleContext.ungetService(serviceReference);
	}

}
