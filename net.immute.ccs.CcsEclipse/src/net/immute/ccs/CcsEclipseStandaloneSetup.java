/*
* generated by Xtext
*/
package net.immute.ccs;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CcsEclipseStandaloneSetup extends CcsEclipseStandaloneSetupGenerated{

	public static void doSetup() {
		new CcsEclipseStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

