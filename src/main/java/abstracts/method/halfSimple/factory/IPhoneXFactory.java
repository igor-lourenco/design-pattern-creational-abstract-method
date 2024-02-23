package abstracts.method.halfSimple.factory;

import abstracts.method.halfSimple.factory.abstractFactory.CountryRulesAbstractFactory;
import abstracts.method.halfSimple.model.iphone.IPhoneAbstract;
import abstracts.method.halfSimple.model.iphone.IPhoneX;
import abstracts.method.halfSimple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}
	
	@Override
	protected IPhoneAbstract createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
