package abstracts.method.halfSimple.model.iphone;

import abstracts.method.halfSimple.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhoneX extends IPhoneAbstract {

	public IPhoneX(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 5.8in Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}

	@Override
	public String toString() {
		return "IPhoneX [rules=" + rules + "]";
	}
	
	
}
