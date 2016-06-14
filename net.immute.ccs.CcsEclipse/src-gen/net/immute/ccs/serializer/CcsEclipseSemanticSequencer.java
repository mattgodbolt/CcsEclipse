/*
 * generated by Xtext
 */
package net.immute.ccs.serializer;

import com.google.inject.Inject;
import java.util.Set;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CcsEclipseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CcsEclipseGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CcsEclipsePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CcsEclipsePackage.CONTEXT:
				sequence_Context(context, (Context) semanticObject); 
				return; 
			case CcsEclipsePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case CcsEclipsePackage.MODIFIER:
				sequence_Modifier(context, (Modifier) semanticObject); 
				return; 
			case CcsEclipsePackage.NESTED:
				sequence_Nested(context, (Nested) semanticObject); 
				return; 
			case CcsEclipsePackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case CcsEclipsePackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case CcsEclipsePackage.RULE_SET:
				sequence_RuleSet(context, (RuleSet) semanticObject); 
				return; 
			case CcsEclipsePackage.SELECTOR:
				sequence_Selector(context, (Selector) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Context returns Context
	 *
	 * Constraint:
	 *     selector=Selector
	 */
	protected void sequence_Context(ISerializationContext context, Context semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CcsEclipsePackage.Literals.CONTEXT__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CcsEclipsePackage.Literals.CONTEXT__SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContextAccess().getSelectorSelectorParserRuleCall_2_0(), semanticObject.getSelector());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CcsEclipsePackage.Literals.IMPORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CcsEclipsePackage.Literals.IMPORT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Modifier returns Modifier
	 *
	 * Constraint:
	 *     override?='@override'
	 */
	protected void sequence_Modifier(ISerializationContext context, Modifier semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CcsEclipsePackage.Literals.MODIFIER__OVERRIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CcsEclipsePackage.Literals.MODIFIER__OVERRIDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModifierAccess().getOverrideOverrideKeyword_0(), semanticObject.isOverride());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Nested returns Nested
	 *
	 * Constraint:
	 *     (selector=Selector (import=Import | constraint=Constraint | property=Property | rules+=Rule+)?)
	 */
	protected void sequence_Nested(ISerializationContext context, Nested semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (modifiers+=Modifier* name=ID value=Value)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleSet returns RuleSet
	 *
	 * Constraint:
	 *     ((context=Context rules+=Rule+) | rules+=Rule+)?
	 */
	protected void sequence_RuleSet(ISerializationContext context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (import=Import | constraint=Constraint | property=Property | nested=Nested)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Selector returns Selector
	 *
	 * Constraint:
	 *     sum=Sum
	 */
	protected void sequence_Selector(ISerializationContext context, Selector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CcsEclipsePackage.Literals.SELECTOR__SUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CcsEclipsePackage.Literals.SELECTOR__SUM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectorAccess().getSumSumParserRuleCall_0_0(), semanticObject.getSum());
		feeder.finish();
	}
	
	
}
