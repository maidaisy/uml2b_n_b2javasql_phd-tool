/*
 * generated by Xtext 2.10.0
 */
package secureuml2SQL.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import secureuml2SQL.ui.internal.Secureuml2SQLActivator;

public class SecureUML2SQLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Secureuml2SQLActivator.getInstance().getInjector("secureuml2SQL.SecureUML2SQL");
	}

}
