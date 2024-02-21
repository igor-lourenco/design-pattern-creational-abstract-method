package abstracts.method.halfSimple.model.certificate;

public class BrazilianCertificate implements Certificate {

	@Override
	public String applyCertification() {
		return "\t- Calibrando as regras brasileiras\n\t- Aplicando o Selo da Anatel";
	}
}
