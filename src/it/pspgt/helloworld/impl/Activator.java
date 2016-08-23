/*
 * Author Gabriele Tramonte
 * Classe Attivatore del Bundle
 */
package it.pspgt.helloworld.impl;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;
import it.pspgt.helloworld.api.HelloWorldInterface;


public class Activator extends DependencyActivatorBase {

	@Override
	public void init(BundleContext contex, DependencyManager man) throws Exception {
		man.add(createComponent()
				.setInterface(HelloWorldInterface.class.getName(), null)
				.setImplementation(HelloWorldImp.class));
	}
}
