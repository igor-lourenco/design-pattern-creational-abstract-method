package abstracts.method.halfSimple.factory.abstractFactory;

import abstracts.method.halfSimple.model.certificate.Certificate;
import abstracts.method.halfSimple.model.certificate.USCertificate;
import abstracts.method.halfSimple.model.packing.Packing;
import abstracts.method.halfSimple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	@Override
	public Certificate getCertificate() {
		return new USCertificate();
	}

	@Override
	public Packing getPacking() {
		// TODO Auto-generated method stub
		return new USPacking();
	}

}
