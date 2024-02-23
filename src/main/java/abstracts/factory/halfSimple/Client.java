package abstracts.factory.halfSimple;

import abstracts.method.halfSimple.factory.IPhone11Factory;
import abstracts.method.halfSimple.factory.IPhoneFactory;
import abstracts.method.halfSimple.factory.IPhoneXFactory;
import abstracts.method.halfSimple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import abstracts.method.halfSimple.factory.abstractFactory.CountryRulesAbstractFactory;
import abstracts.method.halfSimple.model.iphone.IPhoneAbstract;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an iPhone X");
		IPhoneAbstract iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhoneAbstract iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
