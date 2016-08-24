/*
 * Author Gabriele Tramonte
 * Classe Attivatore del Bundle
 */
package it.pspgt.helloworld.gui;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

import it.pspgt.helloworld.api.HelloWorldInterface;

public class Activator extends DependencyActivatorBase {
	Frame f;
	
	@Override
	public void init(BundleContext arg0, DependencyManager man) throws Exception {
		f=new Frame();
		man.add(createComponent().setImplementation(f).add(createServiceDependency().setService(HelloWorldInterface.class)));
	}
}
