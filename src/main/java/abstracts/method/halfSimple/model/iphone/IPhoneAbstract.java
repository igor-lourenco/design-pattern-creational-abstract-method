package abstracts.method.halfSimple.model.iphone;

import abstracts.method.halfSimple.factory.abstractFactory.CountryRulesAbstractFactory;

public abstract class IPhoneAbstract {
	
	CountryRulesAbstractFactory rules;

	public IPhoneAbstract(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public abstract void getHardware();
	
	public void assemble() {
		System.out.println("Montando todos os hardwares");
	}

	public void certificates() {
		System.out.println("Testando todos os certificados");
		System.out.println(rules.getCertificate().applyCertification());
	}

	public void pack() {
		System.out.println("Embalando o dispositivo");
		System.out.println(rules.getPacking().pack());
	}
}

