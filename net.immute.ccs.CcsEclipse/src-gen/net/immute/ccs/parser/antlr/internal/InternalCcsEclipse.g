/*
* generated by Xtext
*/
grammar InternalCcsEclipse;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package net.immute.ccs.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package net.immute.ccs.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.immute.ccs.services.CcsEclipseGrammarAccess;

}

@parser::members {

 	private CcsEclipseGrammarAccess grammarAccess;
 	
    public InternalCcsEclipseParser(TokenStream input, CcsEclipseGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "RuleSet";	
   	}
   	
   	@Override
   	protected CcsEclipseGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleRuleSet
entryRuleRuleSet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleSetRule()); }
	 iv_ruleRuleSet=ruleRuleSet 
	 { $current=$iv_ruleRuleSet.current; } 
	 EOF 
;

// Rule RuleSet
ruleRuleSet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
	    }
		lv_context_0_0=ruleContext		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleSetRule());
	        }
       		set(
       			$current, 
       			"context",
        		lv_context_0_0, 
        		"Context");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
	    }
		lv_rules_1_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleSetRule());
	        }
       		add(
       			$current, 
       			"rules",
        		lv_rules_1_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleContext
entryRuleContext returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getContextRule()); } 
	 iv_ruleContext=ruleContext 
	 { $current=$iv_ruleContext.current.getText(); }  
	 EOF 
;

// Rule Context
ruleContext returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='@context' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getContextAccess().getContextKeyword_0()); 
    }

	kw='(' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 
    }

    { 
        newCompositeNode(grammarAccess.getContextAccess().getSelectorParserRuleCall_2()); 
    }
    this_Selector_2=ruleSelector    {
		$current.merge(this_Selector_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw=')' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 
    }
(
	kw=';' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getContextAccess().getSemicolonKeyword_4()); 
    }
)?)
    ;





// Entry rule entryRuleSelector
entryRuleSelector returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getSelectorRule()); } 
	 iv_ruleSelector=ruleSelector 
	 { $current=$iv_ruleSelector.current.getText(); }  
	 EOF 
;

// Rule Selector
ruleSelector returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSelectorAccess().getSumParserRuleCall_0()); 
    }
    this_Sum_0=ruleSum    {
		$current.merge(this_Sum_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw='>' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getSelectorAccess().getSumParserRuleCall_1_1()); 
    }
    this_Sum_2=ruleSum    {
		$current.merge(this_Sum_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;





// Entry rule entryRuleSum
entryRuleSum returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getSumRule()); } 
	 iv_ruleSum=ruleSum 
	 { $current=$iv_ruleSum.current.getText(); }  
	 EOF 
;

// Rule Sum
ruleSum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
    }
    this_Product_0=ruleProduct    {
		$current.merge(this_Product_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw=',' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
    }
    this_Product_2=ruleProduct    {
		$current.merge(this_Product_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;





// Entry rule entryRuleProduct
entryRuleProduct returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getProductRule()); } 
	 iv_ruleProduct=ruleProduct 
	 { $current=$iv_ruleProduct.current.getText(); }  
	 EOF 
;

// Rule Product
ruleProduct returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getProductAccess().getTermParserRuleCall()); 
    }
    this_Term_0=ruleTerm    {
		$current.merge(this_Term_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)+
    ;





// Entry rule entryRuleTerm
entryRuleTerm returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTermRule()); } 
	 iv_ruleTerm=ruleTerm 
	 { $current=$iv_ruleTerm.current.getText(); }  
	 EOF 
;

// Rule Term
ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
    }
    this_Step_0=ruleStep    {
		$current.merge(this_Step_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw='>' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
    }
    this_Step_2=ruleStep    {
		$current.merge(this_Step_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;





// Entry rule entryRuleStep
entryRuleStep returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getStepRule()); } 
	 iv_ruleStep=ruleStep 
	 { $current=$iv_ruleStep.current.getText(); }  
	 EOF 
;

// Rule Step
ruleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getStepAccess().getSingleStepParserRuleCall()); 
    }
    this_SingleStep_0=ruleSingleStep    {
		$current.merge(this_SingleStep_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    ;





// Entry rule entryRuleRule
entryRuleRule returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); } 
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current.getText(); }  
	 EOF 
;

// Rule Rule
ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getRuleAccess().getImportParserRuleCall_0()); 
    }
    this_Import_0=ruleImport    {
		$current.merge(this_Import_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRuleAccess().getConstraintParserRuleCall_1()); 
    }
    this_Constraint_1=ruleConstraint    {
		$current.merge(this_Constraint_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRuleAccess().getPropertyParserRuleCall_2()); 
    }
    this_Property_2=ruleProperty    {
		$current.merge(this_Property_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRuleAccess().getNestedParserRuleCall_3()); 
    }
    this_Nested_3=ruleNested    {
		$current.merge(this_Nested_3);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleNested
entryRuleNested returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getNestedRule()); } 
	 iv_ruleNested=ruleNested 
	 { $current=$iv_ruleNested.current.getText(); }  
	 EOF 
;

// Rule Nested
ruleNested returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getNestedAccess().getSelectorParserRuleCall_0()); 
    }
    this_Selector_0=ruleSelector    {
		$current.merge(this_Selector_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
((
	kw=':' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
    }
(
    { 
        newCompositeNode(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 
    }
    this_Import_2=ruleImport    {
		$current.merge(this_Import_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 
    }
    this_Constraint_3=ruleConstraint    {
		$current.merge(this_Constraint_3);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNestedAccess().getPropertyParserRuleCall_1_0_1_2()); 
    }
    this_Property_4=ruleProperty    {
		$current.merge(this_Property_4);
    }

    { 
        afterParserOrEnumRuleCall();
    }
))
    |(
	kw='{' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
    }
(
    { 
        newCompositeNode(grammarAccess.getNestedAccess().getRuleParserRuleCall_1_1_1()); 
    }
    this_Rule_6=ruleRule    {
		$current.merge(this_Rule_6);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*
	kw='}' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 
    }
)))
    ;





// Entry rule entryRuleProperty
entryRuleProperty returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyRule()); } 
	 iv_ruleProperty=ruleProperty 
	 { $current=$iv_ruleProperty.current.getText(); }  
	 EOF 
;

// Rule Property
ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getPropertyAccess().getIDTerminalRuleCall_0()); 
    }

	kw='=' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
    }

    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getValueParserRuleCall_2()); 
    }
    this_Value_2=ruleValue    {
		$current.merge(this_Value_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleValue
entryRuleValue returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); } 
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current.getText(); }  
	 EOF 
;

// Rule Value
ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_HEXINT_0=RULE_HEXINT    {
		$current.merge(this_HEXINT_0);
    }

    { 
    newLeafNode(this_HEXINT_0, grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
    }

    |    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 
    }

    |
	kw='true' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getValueAccess().getTrueKeyword_2()); 
    }

    |
	kw='false' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getValueAccess().getFalseKeyword_3()); 
    }
)
    ;





// Entry rule entryRuleConstraint
entryRuleConstraint returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstraintRule()); } 
	 iv_ruleConstraint=ruleConstraint 
	 { $current=$iv_ruleConstraint.current.getText(); }  
	 EOF 
;

// Rule Constraint
ruleConstraint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='@constrain' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
    }
    this_SingleStep_1=ruleSingleStep    {
		$current.merge(this_SingleStep_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleSingleStep
entryRuleSingleStep returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleStepRule()); } 
	 iv_ruleSingleStep=ruleSingleStep 
	 { $current=$iv_ruleSingleStep.current.getText(); }  
	 EOF 
;

// Rule SingleStep
ruleSingleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getSingleStepAccess().getIDTerminalRuleCall_0()); 
    }
(
    { 
        newCompositeNode(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
    }
    this_Vals_1=ruleVals    {
		$current.merge(this_Vals_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)?(
    { 
        newCompositeNode(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
    }
    this_StepSuffix_2=ruleStepSuffix    {
		$current.merge(this_StepSuffix_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)?)
    ;





// Entry rule entryRuleVals
entryRuleVals returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getValsRule()); } 
	 iv_ruleVals=ruleVals 
	 { $current=$iv_ruleVals.current.getText(); }  
	 EOF 
;

// Rule Vals
ruleVals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getValsAccess().getFullStopKeyword_0()); 
    }
    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getValsAccess().getIDTerminalRuleCall_1()); 
    }
(
    { 
        newCompositeNode(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
    }
    this_Vals_2=ruleVals    {
		$current.merge(this_Vals_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;





// Entry rule entryRuleStepSuffix
entryRuleStepSuffix returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getStepSuffixRule()); } 
	 iv_ruleStepSuffix=ruleStepSuffix 
	 { $current=$iv_ruleStepSuffix.current.getText(); }  
	 EOF 
;

// Rule StepSuffix
ruleStepSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='/' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
    }
    this_SingleStep_1=ruleSingleStep    {
		$current.merge(this_SingleStep_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleImport
entryRuleImport returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); } 
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current.getText(); }  
	 EOF 
;

// Rule Import
ruleImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='@import' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_0()); 
    }
    this_STRING_1=RULE_STRING    {
		$current.merge(this_STRING_1);
    }

    { 
    newLeafNode(this_STRING_1, grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_1()); 
    }
)
    ;





RULE_HEXINT : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


