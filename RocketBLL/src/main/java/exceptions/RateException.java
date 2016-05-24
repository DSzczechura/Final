package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {

	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
	
	private RateDomainModel e;
	
	public RateException(RateDomainModel e) {
		System.out.println("Didn't Qualify for Loan");
		
	}
	
	public RateDomainModel getRateDomainModel() {
		return e;
	}

}
