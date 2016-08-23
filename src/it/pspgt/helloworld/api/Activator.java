/*
 * Author Gabriele Tramonte
 * Classe Attivatore del Bundle
 */
package it.pspgt.helloworld.api;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

public class Activator extends DependencyActivatorBase {

	@Override
	public void init(BundleContext arg0, DependencyManager man) throws Exception {
		//man.add(createComponent().setInterface(HelloWorldInterface.class.getName(), null));

	}

}
