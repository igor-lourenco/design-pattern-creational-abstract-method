package abstracts.method.halfSimple.model.iphone;

import abstracts.method.halfSimple.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhone11 extends IPhoneAbstract {

	public IPhone11(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.1in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}

	@Override
	public String toString() {
		return "IPhone11 [rules=" + rules + "]";
	}
	
}
