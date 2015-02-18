package net.immute.ccs.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.immute.ccs.ccsEclipse.CcsEclipsePackage;
import net.immute.ccs.ccsEclipse.Context;
import net.immute.ccs.ccsEclipse.Import;
import net.immute.ccs.ccsEclipse.Modifier;
import net.immute.ccs.ccsEclipse.Nested;
import net.immute.ccs.ccsEclipse.Property;
import net.immute.ccs.ccsEclipse.Rule;
import net.immute.ccs.ccsEclipse.RuleSet;
import net.immute.ccs.ccsEclipse.Selector;
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
			case CcsEclipsePackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case CcsEclipsePackage.MODIFIER:
				if(context == grammarAccess.getModifierRule()) {
					sequence_Modifier(context, (Modifier) semanticObject); 
					return; 
				}
				else break;
			case CcsEclipsePackage.NESTED:
				if(context == grammarAccess.getNestedRule()) {
					sequence_Nested(context, (Nested) semanticObject); 
					return; 
				}
				else break;
			case CcsEclipsePackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case CcsEclipsePackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case CcsEclipsePackage.RULE_SET:
				if(context == grammarAccess.getRuleSetRule()) {
					sequence_RuleSet(context, (RuleSet) semanticObject); 
					return; 
				}
				else break;
			case CcsEclipsePackage.SELECTOR:
				if(context == grammarAccess.getSelectorRule()) {
					sequence_Selector(context, (Selector) semanticObject); 
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
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CcsEclipsePackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CcsEclipsePackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     override?='@override'
	 */
	protected void sequence_Modifier(EObject context, Modifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CcsEclipsePackage.Literals.MODIFIER__OVERRIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CcsEclipsePackage.Literals.MODIFIER__OVERRIDE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModifierAccess().getOverrideOverrideKeyword_0(), semanticObject.isOverride());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (selector=Selector (import=Import | constraint=Constraint | property=Property | rules+=Rule*))
	 */
	protected void sequence_Nested(EObject context, Nested semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* name=ID value=Value)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (context=Context? rules+=Rule*)
	 */
	protected void sequence_RuleSet(EObject context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (import=Import | constraint=Constraint | property=Property | nested=Nested)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sum=Sum
	 */
	protected void sequence_Selector(EObject context, Selector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CcsEclipsePackage.Literals.SELECTOR__SUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CcsEclipsePackage.Literals.SELECTOR__SUM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectorAccess().getSumSumParserRuleCall_0_0(), semanticObject.getSum());
		feeder.finish();
	}
}
