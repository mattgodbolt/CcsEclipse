/*
 * generated by Xtext
 */
package net.immute.ccs.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import net.immute.ccs.ui.internal.CcsEclipseActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CcsEclipseExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CcsEclipseActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CcsEclipseActivator.getInstance().getInjector(CcsEclipseActivator.NET_IMMUTE_CCS_CCSECLIPSE);
	}
	
}