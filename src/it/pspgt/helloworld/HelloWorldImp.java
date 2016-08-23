package it.pspgt.helloworld;

import it.pspgt.helloworld.api.HelloWorldInterface;

public class HelloWorldImp implements HelloWorldInterface {

	@Override
	public void hello() {
		System.out.println("Ciao Primo Progetto OSGi con BNDTools");
	}

}
