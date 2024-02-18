package abstracts.method.halfSimple.factory.abstractFactory;

import abstracts.method.halfSimple.model.certificate.BrazilianCertificate;
import abstracts.method.halfSimple.model.certificate.Certificate;
import abstracts.method.halfSimple.model.packing.BrazilianPacking;
import abstracts.method.halfSimple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	@Override
	public Certificate getCertificate() {
		return new BrazilianCertificate();
	}

	@Override
	public Packing getPacking() {
		return new BrazilianPacking();
	}

	
}
