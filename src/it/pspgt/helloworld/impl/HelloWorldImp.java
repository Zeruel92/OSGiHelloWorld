/*
 * Author Gabriele Tramonte
 * Implementazione dell'interfaccia dell'HelloWorld
 */
package it.pspgt.helloworld.impl;

import it.pspgt.helloworld.api.HelloWorldInterface;

public class HelloWorldImp implements HelloWorldInterface {

	@Override
	public void hello() {
		System.out.println("Ciao Primo Progetto OSGi con BNDTools");
	}

}
