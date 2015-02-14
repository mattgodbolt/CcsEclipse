package net.immute.ccs.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.immute.ccs.ccsEclipse.CcsEclipsePackage;
import net.immute.ccs.ccsEclipse.Context;
import net.immute.ccs.ccsEclipse.RuleSet;
import net.immute.ccs.services.CcsEclipseGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CcsEclipseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CcsEclipseGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CcsEclipsePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CcsEclipsePackage.CONTEXT:
				if(context == grammarAccess.getContextRule()) {
					sequence_Context(context, (Context) semanticObject); 
					return; 
				}
				else break;
			case CcsEclipsePackage.RULE_SET:
				if(context == grammarAccess.getRuleSetRule()) {
					sequence_RuleSet(context, (RuleSet) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     selector=Selector
	 */
	protected void sequence_Context(EObject context, Context semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CcsEclipsePackage.Literals.CONTEXT__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CcsEclipsePackage.Literals.CONTEXT__SELECTOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContextAccess().getSelectorSelectorParserRuleCall_2_0(), semanticObject.getSelector());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (context=Context? rules+=Rule*)
	 */
	protected void sequence_RuleSet(EObject context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
