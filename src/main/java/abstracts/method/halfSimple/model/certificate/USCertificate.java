package abstracts.method.halfSimple.model.certificate;

public class USCertificate implements Certificate {

	@Override
	public String applyCertification() {
		return "\t- Calibrando as regras dos US\n\t- Aplicando o Selo da  Federal Communications Commission - FCC";
	}
}
