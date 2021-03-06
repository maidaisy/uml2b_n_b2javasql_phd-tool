/*
 * generated by Xtext 2.10.0
 */
package b2sql.tests

import b2sql.b2SQL2.B2SQL2
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(B2SQL2InjectorProvider)
class B2SQL2ParsingTest{

	@Inject
	ParseHelper<B2SQL2> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
