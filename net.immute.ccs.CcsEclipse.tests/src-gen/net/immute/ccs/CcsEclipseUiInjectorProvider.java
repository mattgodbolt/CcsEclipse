/*
* generated by Xtext
*/
package net.immute.ccs;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CcsEclipseUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return net.immute.ccs.ui.internal.CcsEclipseActivator.getInstance().getInjector("net.immute.ccs.CcsEclipse");
	}
	
}
