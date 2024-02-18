package abstracts.method.halfSimple.factory.abstractFactory;

import abstracts.method.halfSimple.model.certificate.Certificate;
import abstracts.method.halfSimple.model.packing.Packing;

public interface CountryRulesAbstractFactory {

	Certificate getCertificate();
	
	Packing getPacking();
}
