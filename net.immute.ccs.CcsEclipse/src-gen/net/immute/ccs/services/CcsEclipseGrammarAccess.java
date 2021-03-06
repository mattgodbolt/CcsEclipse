/*
 * generated by Xtext
 */
package net.immute.ccs.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class CcsEclipseGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class RuleSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.RuleSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cContextAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cContextContextParserRuleCall_0_0 = (RuleCall)cContextAssignment_0.eContents().get(0);
		private final Assignment cRulesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRulesRuleParserRuleCall_1_0 = (RuleCall)cRulesAssignment_1.eContents().get(0);
		
		//RuleSet hidden(WS, ML_COMMENT, SL_COMMENT):
		//	context=Context? rules+=Rule*;
		@Override public ParserRule getRule() { return rule; }

		//context=Context? rules+=Rule*
		public Group getGroup() { return cGroup; }

		//context=Context?
		public Assignment getContextAssignment_0() { return cContextAssignment_0; }

		//Context
		public RuleCall getContextContextParserRuleCall_0_0() { return cContextContextParserRuleCall_0_0; }

		//rules+=Rule*
		public Assignment getRulesAssignment_1() { return cRulesAssignment_1; }

		//Rule
		public RuleCall getRulesRuleParserRuleCall_1_0() { return cRulesRuleParserRuleCall_1_0; }
	}

	public class ContextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Context");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSelectorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSelectorSelectorParserRuleCall_2_0 = (RuleCall)cSelectorAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Context:
		//	'@context' '(' selector=Selector ')' ';'?;
		@Override public ParserRule getRule() { return rule; }

		//'@context' '(' selector=Selector ')' ';'?
		public Group getGroup() { return cGroup; }

		//'@context'
		public Keyword getContextKeyword_0() { return cContextKeyword_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//selector=Selector
		public Assignment getSelectorAssignment_2() { return cSelectorAssignment_2; }

		//Selector
		public RuleCall getSelectorSelectorParserRuleCall_2_0() { return cSelectorSelectorParserRuleCall_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//';'?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class SelectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Selector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSumAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSumSumParserRuleCall_0_0 = (RuleCall)cSumAssignment_0.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Selector:
		//	sum=Sum '>'?;
		@Override public ParserRule getRule() { return rule; }

		//sum=Sum '>'?
		public Group getGroup() { return cGroup; }

		//sum=Sum
		public Assignment getSumAssignment_0() { return cSumAssignment_0; }

		//Sum
		public RuleCall getSumSumParserRuleCall_0_0() { return cSumSumParserRuleCall_0_0; }

		//'>'?
		public Keyword getGreaterThanSignKeyword_1() { return cGreaterThanSignKeyword_1; }
	}

	public class SumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Sum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cProductParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cProductParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Sum:
		//	Product (',' Product)*;
		@Override public ParserRule getRule() { return rule; }

		//Product (',' Product)*
		public Group getGroup() { return cGroup; }

		//Product
		public RuleCall getProductParserRuleCall_0() { return cProductParserRuleCall_0; }

		//(',' Product)*
		public Group getGroup_1() { return cGroup_1; }

		//','
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//Product
		public RuleCall getProductParserRuleCall_1_1() { return cProductParserRuleCall_1_1; }
	}

	public class ProductElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Product");
		private final RuleCall cTermParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Product:
		//	Term+;
		@Override public ParserRule getRule() { return rule; }

		//Term+
		public RuleCall getTermParserRuleCall() { return cTermParserRuleCall; }
	}

	public class TermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Term");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cStepParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cStepParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Term:
		//	Step ('>' Step)*;
		@Override public ParserRule getRule() { return rule; }

		//Step ('>' Step)*
		public Group getGroup() { return cGroup; }

		//Step
		public RuleCall getStepParserRuleCall_0() { return cStepParserRuleCall_0; }

		//('>' Step)*
		public Group getGroup_1() { return cGroup_1; }

		//'>'
		public Keyword getGreaterThanSignKeyword_1_0() { return cGreaterThanSignKeyword_1_0; }

		//Step
		public RuleCall getStepParserRuleCall_1_1() { return cStepParserRuleCall_1_1; }
	}

	public class StepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Step");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSingleStepParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cSumParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Step:
		//	SingleStep | '(' Sum ')';
		@Override public ParserRule getRule() { return rule; }

		//SingleStep | '(' Sum ')'
		public Alternatives getAlternatives() { return cAlternatives; }

		//SingleStep
		public RuleCall getSingleStepParserRuleCall_0() { return cSingleStepParserRuleCall_0; }

		//'(' Sum ')'
		public Group getGroup_1() { return cGroup_1; }

		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }

		//Sum
		public RuleCall getSumParserRuleCall_1_1() { return cSumParserRuleCall_1_1; }

		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}

	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cImportAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final RuleCall cImportImportParserRuleCall_0_0_0 = (RuleCall)cImportAssignment_0_0.eContents().get(0);
		private final Assignment cConstraintAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final RuleCall cConstraintConstraintParserRuleCall_0_1_0 = (RuleCall)cConstraintAssignment_0_1.eContents().get(0);
		private final Assignment cPropertyAssignment_0_2 = (Assignment)cAlternatives_0.eContents().get(2);
		private final RuleCall cPropertyPropertyParserRuleCall_0_2_0 = (RuleCall)cPropertyAssignment_0_2.eContents().get(0);
		private final Assignment cNestedAssignment_0_3 = (Assignment)cAlternatives_0.eContents().get(3);
		private final RuleCall cNestedNestedParserRuleCall_0_3_0 = (RuleCall)cNestedAssignment_0_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Rule:
		//	(^import=Import | constraint=Constraint | property=Property | nested=Nested) ';'?;
		@Override public ParserRule getRule() { return rule; }

		//(^import=Import | constraint=Constraint | property=Property | nested=Nested) ';'?
		public Group getGroup() { return cGroup; }

		//(^import=Import | constraint=Constraint | property=Property | nested=Nested)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//^import=Import
		public Assignment getImportAssignment_0_0() { return cImportAssignment_0_0; }

		//Import
		public RuleCall getImportImportParserRuleCall_0_0_0() { return cImportImportParserRuleCall_0_0_0; }

		//constraint=Constraint
		public Assignment getConstraintAssignment_0_1() { return cConstraintAssignment_0_1; }

		//Constraint
		public RuleCall getConstraintConstraintParserRuleCall_0_1_0() { return cConstraintConstraintParserRuleCall_0_1_0; }

		//property=Property
		public Assignment getPropertyAssignment_0_2() { return cPropertyAssignment_0_2; }

		//Property
		public RuleCall getPropertyPropertyParserRuleCall_0_2_0() { return cPropertyPropertyParserRuleCall_0_2_0; }

		//nested=Nested
		public Assignment getNestedAssignment_0_3() { return cNestedAssignment_0_3; }

		//Nested
		public RuleCall getNestedNestedParserRuleCall_0_3_0() { return cNestedNestedParserRuleCall_0_3_0; }

		//';'?
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}

	public class NestedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Nested");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSelectorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSelectorSelectorParserRuleCall_0_0 = (RuleCall)cSelectorAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cColonKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Alternatives cAlternatives_1_0_1 = (Alternatives)cGroup_1_0.eContents().get(1);
		private final Assignment cImportAssignment_1_0_1_0 = (Assignment)cAlternatives_1_0_1.eContents().get(0);
		private final RuleCall cImportImportParserRuleCall_1_0_1_0_0 = (RuleCall)cImportAssignment_1_0_1_0.eContents().get(0);
		private final Assignment cConstraintAssignment_1_0_1_1 = (Assignment)cAlternatives_1_0_1.eContents().get(1);
		private final RuleCall cConstraintConstraintParserRuleCall_1_0_1_1_0 = (RuleCall)cConstraintAssignment_1_0_1_1.eContents().get(0);
		private final Assignment cPropertyAssignment_1_0_1_2 = (Assignment)cAlternatives_1_0_1.eContents().get(2);
		private final RuleCall cPropertyPropertyParserRuleCall_1_0_1_2_0 = (RuleCall)cPropertyAssignment_1_0_1_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cRulesAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cRulesRuleParserRuleCall_1_1_1_0 = (RuleCall)cRulesAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		
		//Nested:
		//	selector=Selector (':' (^import=Import | constraint=Constraint | property=Property) | '{' rules+=Rule* '}');
		@Override public ParserRule getRule() { return rule; }

		//selector=Selector (':' (^import=Import | constraint=Constraint | property=Property) | '{' rules+=Rule* '}')
		public Group getGroup() { return cGroup; }

		//selector=Selector
		public Assignment getSelectorAssignment_0() { return cSelectorAssignment_0; }

		//Selector
		public RuleCall getSelectorSelectorParserRuleCall_0_0() { return cSelectorSelectorParserRuleCall_0_0; }

		//(':' (^import=Import | constraint=Constraint | property=Property) | '{' rules+=Rule* '}')
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//':' (^import=Import | constraint=Constraint | property=Property)
		public Group getGroup_1_0() { return cGroup_1_0; }

		//':'
		public Keyword getColonKeyword_1_0_0() { return cColonKeyword_1_0_0; }

		//(^import=Import | constraint=Constraint | property=Property)
		public Alternatives getAlternatives_1_0_1() { return cAlternatives_1_0_1; }

		//^import=Import
		public Assignment getImportAssignment_1_0_1_0() { return cImportAssignment_1_0_1_0; }

		//Import
		public RuleCall getImportImportParserRuleCall_1_0_1_0_0() { return cImportImportParserRuleCall_1_0_1_0_0; }

		//constraint=Constraint
		public Assignment getConstraintAssignment_1_0_1_1() { return cConstraintAssignment_1_0_1_1; }

		//Constraint
		public RuleCall getConstraintConstraintParserRuleCall_1_0_1_1_0() { return cConstraintConstraintParserRuleCall_1_0_1_1_0; }

		//property=Property
		public Assignment getPropertyAssignment_1_0_1_2() { return cPropertyAssignment_1_0_1_2; }

		//Property
		public RuleCall getPropertyPropertyParserRuleCall_1_0_1_2_0() { return cPropertyPropertyParserRuleCall_1_0_1_2_0; }

		//'{' rules+=Rule* '}'
		public Group getGroup_1_1() { return cGroup_1_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_1_0() { return cLeftCurlyBracketKeyword_1_1_0; }

		//rules+=Rule*
		public Assignment getRulesAssignment_1_1_1() { return cRulesAssignment_1_1_1; }

		//Rule
		public RuleCall getRulesRuleParserRuleCall_1_1_1_0() { return cRulesRuleParserRuleCall_1_1_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_1_1_2() { return cRightCurlyBracketKeyword_1_1_2; }
	}

	public class ModifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Modifier");
		private final Assignment cOverrideAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cOverrideOverrideKeyword_0 = (Keyword)cOverrideAssignment.eContents().get(0);
		
		//Modifier:
		//	override?="@override";
		@Override public ParserRule getRule() { return rule; }

		//override?="@override"
		public Assignment getOverrideAssignment() { return cOverrideAssignment; }

		//"@override"
		public Keyword getOverrideOverrideKeyword_0() { return cOverrideOverrideKeyword_0; }
	}

	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cModifiersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cModifiersModifierParserRuleCall_0_0 = (RuleCall)cModifiersAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueValueParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//Property:
		//	modifiers+=Modifier* name=ID '=' value=Value;
		@Override public ParserRule getRule() { return rule; }

		//modifiers+=Modifier* name=ID '=' value=Value
		public Group getGroup() { return cGroup; }

		//modifiers+=Modifier*
		public Assignment getModifiersAssignment_0() { return cModifiersAssignment_0; }

		//Modifier
		public RuleCall getModifiersModifierParserRuleCall_0_0() { return cModifiersModifierParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=Value
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//Value
		public RuleCall getValueValueParserRuleCall_3_0() { return cValueValueParserRuleCall_3_0; }
	}

	public class BooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Boolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Boolean:
		//	'true' | 'false';
		@Override public ParserRule getRule() { return rule; }

		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }

		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }

		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}

	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cHEXINTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNUMBERTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cBooleanParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cIDTerminalRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cNUM_IDTerminalRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Value:
		//	HEXINT
		//	| NUMBER
		//	| STRING
		//	| Boolean
		//	| ID
		//	| NUM_ID;
		@Override public ParserRule getRule() { return rule; }

		//HEXINT | NUMBER | STRING | Boolean | ID | NUM_ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//HEXINT
		public RuleCall getHEXINTTerminalRuleCall_0() { return cHEXINTTerminalRuleCall_0; }

		//NUMBER
		public RuleCall getNUMBERTerminalRuleCall_1() { return cNUMBERTerminalRuleCall_1; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2() { return cSTRINGTerminalRuleCall_2; }

		//Boolean
		public RuleCall getBooleanParserRuleCall_3() { return cBooleanParserRuleCall_3; }

		//ID
		public RuleCall getIDTerminalRuleCall_4() { return cIDTerminalRuleCall_4; }

		//NUM_ID
		public RuleCall getNUM_IDTerminalRuleCall_5() { return cNUM_IDTerminalRuleCall_5; }
	}

	public class ConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Constraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConstrainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cSingleStepParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Constraint:
		//	'@constrain' SingleStep;
		@Override public ParserRule getRule() { return rule; }

		//'@constrain' SingleStep
		public Group getGroup() { return cGroup; }

		//'@constrain'
		public Keyword getConstrainKeyword_0() { return cConstrainKeyword_0; }

		//SingleStep
		public RuleCall getSingleStepParserRuleCall_1() { return cSingleStepParserRuleCall_1; }
	}

	public class SingleStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.SingleStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIdentParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cValsParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cStepSuffixParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//SingleStep:
		//	Ident Vals? StepSuffix?;
		@Override public ParserRule getRule() { return rule; }

		//Ident Vals? StepSuffix?
		public Group getGroup() { return cGroup; }

		//Ident
		public RuleCall getIdentParserRuleCall_0() { return cIdentParserRuleCall_0; }

		//Vals?
		public RuleCall getValsParserRuleCall_1() { return cValsParserRuleCall_1; }

		//StepSuffix?
		public RuleCall getStepSuffixParserRuleCall_2() { return cStepSuffixParserRuleCall_2; }
	}

	public class IdentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Ident");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Ident:
		//	ID | STRING;
		@Override public ParserRule getRule() { return rule; }

		//ID | STRING
		public Alternatives getAlternatives() { return cAlternatives; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
	}

	public class ValsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Vals");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFullStopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIdentParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cValsParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Vals:
		//	'.' Ident Vals*;
		@Override public ParserRule getRule() { return rule; }

		//'.' Ident Vals*
		public Group getGroup() { return cGroup; }

		//'.'
		public Keyword getFullStopKeyword_0() { return cFullStopKeyword_0; }

		//Ident
		public RuleCall getIdentParserRuleCall_1() { return cIdentParserRuleCall_1; }

		//Vals*
		public RuleCall getValsParserRuleCall_2() { return cValsParserRuleCall_2; }
	}

	public class StepSuffixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.StepSuffix");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSolidusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cSingleStepParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//StepSuffix:
		//	'/' SingleStep;
		@Override public ParserRule getRule() { return rule; }

		//'/' SingleStep
		public Group getGroup() { return cGroup; }

		//'/'
		public Keyword getSolidusKeyword_0() { return cSolidusKeyword_0; }

		//SingleStep
		public RuleCall getSingleStepParserRuleCall_1() { return cSingleStepParserRuleCall_1; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Import:
		//	'@import' name=STRING;
		@Override public ParserRule getRule() { return rule; }

		//'@import' name=STRING
		public Group getGroup() { return cGroup; }

		//'@import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	
	
	private final RuleSetElements pRuleSet;
	private final ContextElements pContext;
	private final SelectorElements pSelector;
	private final SumElements pSum;
	private final ProductElements pProduct;
	private final TermElements pTerm;
	private final StepElements pStep;
	private final RuleElements pRule;
	private final NestedElements pNested;
	private final ModifierElements pModifier;
	private final PropertyElements pProperty;
	private final TerminalRule tID;
	private final TerminalRule tSTRING;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tHEXINT;
	private final TerminalRule tNUMBER;
	private final TerminalRule tNUM_ID;
	private final BooleanElements pBoolean;
	private final ValueElements pValue;
	private final ConstraintElements pConstraint;
	private final SingleStepElements pSingleStep;
	private final IdentElements pIdent;
	private final ValsElements pVals;
	private final StepSuffixElements pStepSuffix;
	private final ImportElements pImport;
	
	private final Grammar grammar;

	@Inject
	public CcsEclipseGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pRuleSet = new RuleSetElements();
		this.pContext = new ContextElements();
		this.pSelector = new SelectorElements();
		this.pSum = new SumElements();
		this.pProduct = new ProductElements();
		this.pTerm = new TermElements();
		this.pStep = new StepElements();
		this.pRule = new RuleElements();
		this.pNested = new NestedElements();
		this.pModifier = new ModifierElements();
		this.pProperty = new PropertyElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.ID");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.STRING");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.WS");
		this.tHEXINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.HEXINT");
		this.tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.NUMBER");
		this.tNUM_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "net.immute.ccs.CcsEclipse.NUM_ID");
		this.pBoolean = new BooleanElements();
		this.pValue = new ValueElements();
		this.pConstraint = new ConstraintElements();
		this.pSingleStep = new SingleStepElements();
		this.pIdent = new IdentElements();
		this.pVals = new ValsElements();
		this.pStepSuffix = new StepSuffixElements();
		this.pImport = new ImportElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("net.immute.ccs.CcsEclipse".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//RuleSet hidden(WS, ML_COMMENT, SL_COMMENT):
	//	context=Context? rules+=Rule*;
	public RuleSetElements getRuleSetAccess() {
		return pRuleSet;
	}
	
	public ParserRule getRuleSetRule() {
		return getRuleSetAccess().getRule();
	}

	//Context:
	//	'@context' '(' selector=Selector ')' ';'?;
	public ContextElements getContextAccess() {
		return pContext;
	}
	
	public ParserRule getContextRule() {
		return getContextAccess().getRule();
	}

	//Selector:
	//	sum=Sum '>'?;
	public SelectorElements getSelectorAccess() {
		return pSelector;
	}
	
	public ParserRule getSelectorRule() {
		return getSelectorAccess().getRule();
	}

	//Sum:
	//	Product (',' Product)*;
	public SumElements getSumAccess() {
		return pSum;
	}
	
	public ParserRule getSumRule() {
		return getSumAccess().getRule();
	}

	//Product:
	//	Term+;
	public ProductElements getProductAccess() {
		return pProduct;
	}
	
	public ParserRule getProductRule() {
		return getProductAccess().getRule();
	}

	//Term:
	//	Step ('>' Step)*;
	public TermElements getTermAccess() {
		return pTerm;
	}
	
	public ParserRule getTermRule() {
		return getTermAccess().getRule();
	}

	//Step:
	//	SingleStep | '(' Sum ')';
	public StepElements getStepAccess() {
		return pStep;
	}
	
	public ParserRule getStepRule() {
		return getStepAccess().getRule();
	}

	//Rule:
	//	(^import=Import | constraint=Constraint | property=Property | nested=Nested) ';'?;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}

	//Nested:
	//	selector=Selector (':' (^import=Import | constraint=Constraint | property=Property) | '{' rules+=Rule* '}');
	public NestedElements getNestedAccess() {
		return pNested;
	}
	
	public ParserRule getNestedRule() {
		return getNestedAccess().getRule();
	}

	//Modifier:
	//	override?="@override";
	public ModifierElements getModifierAccess() {
		return pModifier;
	}
	
	public ParserRule getModifierRule() {
		return getModifierAccess().getRule();
	}

	//Property:
	//	modifiers+=Modifier* name=ID '=' value=Value;
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}

	//terminal ID:
	//	('a'..'z' | 'A'..'Z' | '_' | '$') ('a'..'z' | 'A'..'Z' | '_' | '$' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	} 

	//terminal HEXINT returns ecore::EInt:
	//	'0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;
	public TerminalRule getHEXINTRule() {
		return tHEXINT;
	} 

	//terminal NUMBER returns ecore::EBigDecimal:
	//	'-'? ('0'..'9'+ ('.' '0'..'9'*)? |
	//	'.' '0'..'9'+) (('e' | 'E') ('+' | '-')? '0'..'9'+)?;
	public TerminalRule getNUMBERRule() {
		return tNUMBER;
	} 

	//terminal NUM_ID:
	//	('-' | '+' | '0'..'9') ('a'..'z' | 'A'..'Z' | '_' | '$' | '.' | '0'..'9')*;
	public TerminalRule getNUM_IDRule() {
		return tNUM_ID;
	} 

	//Boolean:
	//	'true' | 'false';
	public BooleanElements getBooleanAccess() {
		return pBoolean;
	}
	
	public ParserRule getBooleanRule() {
		return getBooleanAccess().getRule();
	}

	//Value:
	//	HEXINT
	//	| NUMBER
	//	| STRING
	//	| Boolean
	//	| ID
	//	| NUM_ID;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//Constraint:
	//	'@constrain' SingleStep;
	public ConstraintElements getConstraintAccess() {
		return pConstraint;
	}
	
	public ParserRule getConstraintRule() {
		return getConstraintAccess().getRule();
	}

	//SingleStep:
	//	Ident Vals? StepSuffix?;
	public SingleStepElements getSingleStepAccess() {
		return pSingleStep;
	}
	
	public ParserRule getSingleStepRule() {
		return getSingleStepAccess().getRule();
	}

	//Ident:
	//	ID | STRING;
	public IdentElements getIdentAccess() {
		return pIdent;
	}
	
	public ParserRule getIdentRule() {
		return getIdentAccess().getRule();
	}

	//Vals:
	//	'.' Ident Vals*;
	public ValsElements getValsAccess() {
		return pVals;
	}
	
	public ParserRule getValsRule() {
		return getValsAccess().getRule();
	}

	//StepSuffix:
	//	'/' SingleStep;
	public StepSuffixElements getStepSuffixAccess() {
		return pStepSuffix;
	}
	
	public ParserRule getStepSuffixRule() {
		return getStepSuffixAccess().getRule();
	}

	//Import:
	//	'@import' name=STRING;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
}
