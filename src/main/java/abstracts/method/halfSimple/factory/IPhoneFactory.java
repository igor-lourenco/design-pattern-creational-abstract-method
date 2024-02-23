package abstracts.method.halfSimple.factory;

import abstracts.method.halfSimple.factory.abstractFactory.CountryRulesAbstractFactory;
import abstracts.method.halfSimple.model.iphone.IPhoneAbstract;

public abstract class IPhoneFactory {
	
	CountryRulesAbstractFactory rules;
	
	public IPhoneFactory(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public IPhoneAbstract orderIPhone(String level) {
		IPhoneAbstract device = null;
		
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhoneAbstract createIPhone(String level);
}