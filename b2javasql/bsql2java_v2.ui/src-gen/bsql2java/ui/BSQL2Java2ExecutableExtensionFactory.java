/*
 * generated by Xtext 2.10.0
 */
package bsql2java.ui;

import bsql2java_v2.ui.internal.Bsql2java_v2Activator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BSQL2Java2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Bsql2java_v2Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Bsql2java_v2Activator.getInstance().getInjector(Bsql2java_v2Activator.BSQL2JAVA_BSQL2JAVA2);
	}
	
}
