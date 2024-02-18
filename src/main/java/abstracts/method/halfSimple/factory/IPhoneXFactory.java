package abstracts.method.halfSimple.factory;

import abstracts.method.halfSimple.model.iphone.IPhoneAbstract;
import abstracts.method.halfSimple.model.iphone.IPhoneX;
import abstracts.method.halfSimple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	@Override
	protected IPhoneAbstract createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
