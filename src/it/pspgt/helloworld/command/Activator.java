package it.pspgt.helloworld.command;

import java.util.Properties;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.apache.felix.service.command.CommandProcessor;
import org.osgi.framework.BundleContext;

import it.pspgt.helloworld.api.HelloWorldInterface;

public class Activator extends DependencyActivatorBase{

	@Override
	public void init(BundleContext arg0, DependencyManager man) throws Exception {
		Properties shell_properties = new Properties();
		shell_properties.put(CommandProcessor.COMMAND_SCOPE, "hello");
		shell_properties.put(CommandProcessor.COMMAND_FUNCTION, new String[] { "print" });
		man.add(createComponent().setInterface(Object.class.getName(), shell_properties)
				.setImplementation(Command.class).add(createServiceDependency().setService(HelloWorldInterface.class)));
		
	}
	
}
