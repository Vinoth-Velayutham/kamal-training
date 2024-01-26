package interfaces;

public class YamahaBikes implements VechilePolicy {

	public void MTBike() {
		BS6Engine();
		alwaysOnHeadLamp();
		pollutionControlCert();
		helmetMust();
	}

	@Override
	public void BS6Engine() {
		System.out.println("I have a BS6 Engine");

	}

	@Override
	public void alwaysOnHeadLamp() {
		// TODO Auto-generated method stub
		System.out.println("I have a always on HeadLamp");

	}

	@Override
	public void pollutionControlCert() {
		// TODO Auto-generated method stub
		System.out.println("I have pollution control converter");
	}

	@Override
	public void helmetMust() {
		// TODO Auto-generated method stub
		System.out.println("I give helmet");
	}

}
