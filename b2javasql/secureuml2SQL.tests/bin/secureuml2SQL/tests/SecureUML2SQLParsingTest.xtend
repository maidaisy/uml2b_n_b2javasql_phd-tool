/*
 * generated by Xtext 2.10.0
 */
package secureuml2SQL.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import secureuml2SQL.secureUML2SQL.SecureUML2SQL

@RunWith(XtextRunner)
@InjectWith(SecureUML2SQLInjectorProvider)
class SecureUML2SQLParsingTest{

	@Inject
	ParseHelper<SecureUML2SQL> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
