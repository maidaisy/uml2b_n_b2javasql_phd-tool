/**
 * generated by Xtext 2.10.0
 */
package bsql2java;

import bsql2java.BSQL2Java2StandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BSQL2Java2StandaloneSetup extends BSQL2Java2StandaloneSetupGenerated {
  public static void doSetup() {
    BSQL2Java2StandaloneSetup _bSQL2Java2StandaloneSetup = new BSQL2Java2StandaloneSetup();
    _bSQL2Java2StandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
