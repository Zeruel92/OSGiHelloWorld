package it.pspgt.helloworld.rest;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

public class Activator extends DependencyActivatorBase {

	@Override
	public void init(BundleContext arg0, DependencyManager arg1) throws Exception {
		arg1.add(createComponent()
                .setInterface(Object.class.getName(),null)
                .setImplementation(Resources.class));
		System.out.println("Bundle Attivato");
	}

}
