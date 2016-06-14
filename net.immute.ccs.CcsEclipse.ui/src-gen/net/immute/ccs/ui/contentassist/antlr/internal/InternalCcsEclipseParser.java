package net.immute.ccs.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import net.immute.ccs.services.CcsEclipseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCcsEclipseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEXINT", "RULE_NUMBER", "RULE_STRING", "RULE_ID", "RULE_NUM_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'true'", "'false'", "'@context'", "'('", "')'", "';'", "'>'", "','", "':'", "'{'", "'}'", "'='", "'@constrain'", "'.'", "'/'", "'@import'", "'@override'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_NUMBER=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_NUM_ID=8;
    public static final int T__28=28;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_HEXINT=4;

    // delegates
    // delegators


        public InternalCcsEclipseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCcsEclipseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCcsEclipseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCcsEclipse.g"; }


     
     	private CcsEclipseGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CcsEclipseGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRuleSet"
    // InternalCcsEclipse.g:60:1: entryRuleRuleSet : ruleRuleSet EOF ;
    public final void entryRuleRuleSet() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalCcsEclipse.g:64:1: ( ruleRuleSet EOF )
            // InternalCcsEclipse.g:65:1: ruleRuleSet EOF
            {
             before(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleSet();

            state._fsp--;

             after(grammarAccess.getRuleSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalCcsEclipse.g:75:1: ruleRuleSet : ( ( rule__RuleSet__Group__0 ) ) ;
    public final void ruleRuleSet() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:80:2: ( ( ( rule__RuleSet__Group__0 ) ) )
            // InternalCcsEclipse.g:81:1: ( ( rule__RuleSet__Group__0 ) )
            {
            // InternalCcsEclipse.g:81:1: ( ( rule__RuleSet__Group__0 ) )
            // InternalCcsEclipse.g:82:1: ( rule__RuleSet__Group__0 )
            {
             before(grammarAccess.getRuleSetAccess().getGroup()); 
            // InternalCcsEclipse.g:83:1: ( rule__RuleSet__Group__0 )
            // InternalCcsEclipse.g:83:2: rule__RuleSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleContext"
    // InternalCcsEclipse.g:96:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:97:1: ( ruleContext EOF )
            // InternalCcsEclipse.g:98:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalCcsEclipse.g:105:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:109:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalCcsEclipse.g:110:1: ( ( rule__Context__Group__0 ) )
            {
            // InternalCcsEclipse.g:110:1: ( ( rule__Context__Group__0 ) )
            // InternalCcsEclipse.g:111:1: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalCcsEclipse.g:112:1: ( rule__Context__Group__0 )
            // InternalCcsEclipse.g:112:2: rule__Context__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleSelector"
    // InternalCcsEclipse.g:124:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:125:1: ( ruleSelector EOF )
            // InternalCcsEclipse.g:126:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalCcsEclipse.g:133:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:137:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalCcsEclipse.g:138:1: ( ( rule__Selector__Group__0 ) )
            {
            // InternalCcsEclipse.g:138:1: ( ( rule__Selector__Group__0 ) )
            // InternalCcsEclipse.g:139:1: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalCcsEclipse.g:140:1: ( rule__Selector__Group__0 )
            // InternalCcsEclipse.g:140:2: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSum"
    // InternalCcsEclipse.g:152:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:153:1: ( ruleSum EOF )
            // InternalCcsEclipse.g:154:1: ruleSum EOF
            {
             before(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalCcsEclipse.g:161:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:165:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalCcsEclipse.g:166:1: ( ( rule__Sum__Group__0 ) )
            {
            // InternalCcsEclipse.g:166:1: ( ( rule__Sum__Group__0 ) )
            // InternalCcsEclipse.g:167:1: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // InternalCcsEclipse.g:168:1: ( rule__Sum__Group__0 )
            // InternalCcsEclipse.g:168:2: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleProduct"
    // InternalCcsEclipse.g:180:1: entryRuleProduct : ruleProduct EOF ;
    public final void entryRuleProduct() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:181:1: ( ruleProduct EOF )
            // InternalCcsEclipse.g:182:1: ruleProduct EOF
            {
             before(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getProductRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalCcsEclipse.g:189:1: ruleProduct : ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) ) ;
    public final void ruleProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:193:2: ( ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) ) )
            // InternalCcsEclipse.g:194:1: ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) )
            {
            // InternalCcsEclipse.g:194:1: ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) )
            // InternalCcsEclipse.g:195:1: ( ( ruleTerm ) ) ( ( ruleTerm )* )
            {
            // InternalCcsEclipse.g:195:1: ( ( ruleTerm ) )
            // InternalCcsEclipse.g:196:1: ( ruleTerm )
            {
             before(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            // InternalCcsEclipse.g:197:1: ( ruleTerm )
            // InternalCcsEclipse.g:197:3: ruleTerm
            {
            pushFollow(FOLLOW_3);
            ruleTerm();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getTermParserRuleCall()); 

            }

            // InternalCcsEclipse.g:200:1: ( ( ruleTerm )* )
            // InternalCcsEclipse.g:201:1: ( ruleTerm )*
            {
             before(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            // InternalCcsEclipse.g:202:1: ( ruleTerm )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCcsEclipse.g:202:3: ruleTerm
            	    {
            	    pushFollow(FOLLOW_3);
            	    ruleTerm();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProductAccess().getTermParserRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleTerm"
    // InternalCcsEclipse.g:215:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:216:1: ( ruleTerm EOF )
            // InternalCcsEclipse.g:217:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalCcsEclipse.g:224:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:228:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalCcsEclipse.g:229:1: ( ( rule__Term__Group__0 ) )
            {
            // InternalCcsEclipse.g:229:1: ( ( rule__Term__Group__0 ) )
            // InternalCcsEclipse.g:230:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalCcsEclipse.g:231:1: ( rule__Term__Group__0 )
            // InternalCcsEclipse.g:231:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleStep"
    // InternalCcsEclipse.g:243:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:244:1: ( ruleStep EOF )
            // InternalCcsEclipse.g:245:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalCcsEclipse.g:252:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:256:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalCcsEclipse.g:257:1: ( ( rule__Step__Alternatives ) )
            {
            // InternalCcsEclipse.g:257:1: ( ( rule__Step__Alternatives ) )
            // InternalCcsEclipse.g:258:1: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalCcsEclipse.g:259:1: ( rule__Step__Alternatives )
            // InternalCcsEclipse.g:259:2: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Step__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleRule"
    // InternalCcsEclipse.g:271:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:272:1: ( ruleRule EOF )
            // InternalCcsEclipse.g:273:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalCcsEclipse.g:280:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:284:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalCcsEclipse.g:285:1: ( ( rule__Rule__Group__0 ) )
            {
            // InternalCcsEclipse.g:285:1: ( ( rule__Rule__Group__0 ) )
            // InternalCcsEclipse.g:286:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalCcsEclipse.g:287:1: ( rule__Rule__Group__0 )
            // InternalCcsEclipse.g:287:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleNested"
    // InternalCcsEclipse.g:299:1: entryRuleNested : ruleNested EOF ;
    public final void entryRuleNested() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:300:1: ( ruleNested EOF )
            // InternalCcsEclipse.g:301:1: ruleNested EOF
            {
             before(grammarAccess.getNestedRule()); 
            pushFollow(FOLLOW_1);
            ruleNested();

            state._fsp--;

             after(grammarAccess.getNestedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNested"


    // $ANTLR start "ruleNested"
    // InternalCcsEclipse.g:308:1: ruleNested : ( ( rule__Nested__Group__0 ) ) ;
    public final void ruleNested() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:312:2: ( ( ( rule__Nested__Group__0 ) ) )
            // InternalCcsEclipse.g:313:1: ( ( rule__Nested__Group__0 ) )
            {
            // InternalCcsEclipse.g:313:1: ( ( rule__Nested__Group__0 ) )
            // InternalCcsEclipse.g:314:1: ( rule__Nested__Group__0 )
            {
             before(grammarAccess.getNestedAccess().getGroup()); 
            // InternalCcsEclipse.g:315:1: ( rule__Nested__Group__0 )
            // InternalCcsEclipse.g:315:2: rule__Nested__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nested__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNested"


    // $ANTLR start "entryRuleModifier"
    // InternalCcsEclipse.g:327:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:328:1: ( ruleModifier EOF )
            // InternalCcsEclipse.g:329:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalCcsEclipse.g:336:1: ruleModifier : ( ( rule__Modifier__OverrideAssignment ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:340:2: ( ( ( rule__Modifier__OverrideAssignment ) ) )
            // InternalCcsEclipse.g:341:1: ( ( rule__Modifier__OverrideAssignment ) )
            {
            // InternalCcsEclipse.g:341:1: ( ( rule__Modifier__OverrideAssignment ) )
            // InternalCcsEclipse.g:342:1: ( rule__Modifier__OverrideAssignment )
            {
             before(grammarAccess.getModifierAccess().getOverrideAssignment()); 
            // InternalCcsEclipse.g:343:1: ( rule__Modifier__OverrideAssignment )
            // InternalCcsEclipse.g:343:2: rule__Modifier__OverrideAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__OverrideAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getOverrideAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleProperty"
    // InternalCcsEclipse.g:355:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:356:1: ( ruleProperty EOF )
            // InternalCcsEclipse.g:357:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalCcsEclipse.g:364:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:368:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalCcsEclipse.g:369:1: ( ( rule__Property__Group__0 ) )
            {
            // InternalCcsEclipse.g:369:1: ( ( rule__Property__Group__0 ) )
            // InternalCcsEclipse.g:370:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalCcsEclipse.g:371:1: ( rule__Property__Group__0 )
            // InternalCcsEclipse.g:371:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleBoolean"
    // InternalCcsEclipse.g:383:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:384:1: ( ruleBoolean EOF )
            // InternalCcsEclipse.g:385:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalCcsEclipse.g:392:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:396:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalCcsEclipse.g:397:1: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalCcsEclipse.g:397:1: ( ( rule__Boolean__Alternatives ) )
            // InternalCcsEclipse.g:398:1: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalCcsEclipse.g:399:1: ( rule__Boolean__Alternatives )
            // InternalCcsEclipse.g:399:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleValue"
    // InternalCcsEclipse.g:411:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:412:1: ( ruleValue EOF )
            // InternalCcsEclipse.g:413:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalCcsEclipse.g:420:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:424:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalCcsEclipse.g:425:1: ( ( rule__Value__Alternatives ) )
            {
            // InternalCcsEclipse.g:425:1: ( ( rule__Value__Alternatives ) )
            // InternalCcsEclipse.g:426:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalCcsEclipse.g:427:1: ( rule__Value__Alternatives )
            // InternalCcsEclipse.g:427:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleConstraint"
    // InternalCcsEclipse.g:439:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:440:1: ( ruleConstraint EOF )
            // InternalCcsEclipse.g:441:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalCcsEclipse.g:448:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:452:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalCcsEclipse.g:453:1: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalCcsEclipse.g:453:1: ( ( rule__Constraint__Group__0 ) )
            // InternalCcsEclipse.g:454:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalCcsEclipse.g:455:1: ( rule__Constraint__Group__0 )
            // InternalCcsEclipse.g:455:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleSingleStep"
    // InternalCcsEclipse.g:467:1: entryRuleSingleStep : ruleSingleStep EOF ;
    public final void entryRuleSingleStep() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:468:1: ( ruleSingleStep EOF )
            // InternalCcsEclipse.g:469:1: ruleSingleStep EOF
            {
             before(grammarAccess.getSingleStepRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleStep();

            state._fsp--;

             after(grammarAccess.getSingleStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleStep"


    // $ANTLR start "ruleSingleStep"
    // InternalCcsEclipse.g:476:1: ruleSingleStep : ( ( rule__SingleStep__Group__0 ) ) ;
    public final void ruleSingleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:480:2: ( ( ( rule__SingleStep__Group__0 ) ) )
            // InternalCcsEclipse.g:481:1: ( ( rule__SingleStep__Group__0 ) )
            {
            // InternalCcsEclipse.g:481:1: ( ( rule__SingleStep__Group__0 ) )
            // InternalCcsEclipse.g:482:1: ( rule__SingleStep__Group__0 )
            {
             before(grammarAccess.getSingleStepAccess().getGroup()); 
            // InternalCcsEclipse.g:483:1: ( rule__SingleStep__Group__0 )
            // InternalCcsEclipse.g:483:2: rule__SingleStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleStep"


    // $ANTLR start "entryRuleIdent"
    // InternalCcsEclipse.g:495:1: entryRuleIdent : ruleIdent EOF ;
    public final void entryRuleIdent() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:496:1: ( ruleIdent EOF )
            // InternalCcsEclipse.g:497:1: ruleIdent EOF
            {
             before(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_1);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getIdentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdent"


    // $ANTLR start "ruleIdent"
    // InternalCcsEclipse.g:504:1: ruleIdent : ( ( rule__Ident__Alternatives ) ) ;
    public final void ruleIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:508:2: ( ( ( rule__Ident__Alternatives ) ) )
            // InternalCcsEclipse.g:509:1: ( ( rule__Ident__Alternatives ) )
            {
            // InternalCcsEclipse.g:509:1: ( ( rule__Ident__Alternatives ) )
            // InternalCcsEclipse.g:510:1: ( rule__Ident__Alternatives )
            {
             before(grammarAccess.getIdentAccess().getAlternatives()); 
            // InternalCcsEclipse.g:511:1: ( rule__Ident__Alternatives )
            // InternalCcsEclipse.g:511:2: rule__Ident__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ident__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdent"


    // $ANTLR start "entryRuleVals"
    // InternalCcsEclipse.g:523:1: entryRuleVals : ruleVals EOF ;
    public final void entryRuleVals() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:524:1: ( ruleVals EOF )
            // InternalCcsEclipse.g:525:1: ruleVals EOF
            {
             before(grammarAccess.getValsRule()); 
            pushFollow(FOLLOW_1);
            ruleVals();

            state._fsp--;

             after(grammarAccess.getValsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVals"


    // $ANTLR start "ruleVals"
    // InternalCcsEclipse.g:532:1: ruleVals : ( ( rule__Vals__Group__0 ) ) ;
    public final void ruleVals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:536:2: ( ( ( rule__Vals__Group__0 ) ) )
            // InternalCcsEclipse.g:537:1: ( ( rule__Vals__Group__0 ) )
            {
            // InternalCcsEclipse.g:537:1: ( ( rule__Vals__Group__0 ) )
            // InternalCcsEclipse.g:538:1: ( rule__Vals__Group__0 )
            {
             before(grammarAccess.getValsAccess().getGroup()); 
            // InternalCcsEclipse.g:539:1: ( rule__Vals__Group__0 )
            // InternalCcsEclipse.g:539:2: rule__Vals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVals"


    // $ANTLR start "entryRuleStepSuffix"
    // InternalCcsEclipse.g:551:1: entryRuleStepSuffix : ruleStepSuffix EOF ;
    public final void entryRuleStepSuffix() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:552:1: ( ruleStepSuffix EOF )
            // InternalCcsEclipse.g:553:1: ruleStepSuffix EOF
            {
             before(grammarAccess.getStepSuffixRule()); 
            pushFollow(FOLLOW_1);
            ruleStepSuffix();

            state._fsp--;

             after(grammarAccess.getStepSuffixRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepSuffix"


    // $ANTLR start "ruleStepSuffix"
    // InternalCcsEclipse.g:560:1: ruleStepSuffix : ( ( rule__StepSuffix__Group__0 ) ) ;
    public final void ruleStepSuffix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:564:2: ( ( ( rule__StepSuffix__Group__0 ) ) )
            // InternalCcsEclipse.g:565:1: ( ( rule__StepSuffix__Group__0 ) )
            {
            // InternalCcsEclipse.g:565:1: ( ( rule__StepSuffix__Group__0 ) )
            // InternalCcsEclipse.g:566:1: ( rule__StepSuffix__Group__0 )
            {
             before(grammarAccess.getStepSuffixAccess().getGroup()); 
            // InternalCcsEclipse.g:567:1: ( rule__StepSuffix__Group__0 )
            // InternalCcsEclipse.g:567:2: rule__StepSuffix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StepSuffix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepSuffixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepSuffix"


    // $ANTLR start "entryRuleImport"
    // InternalCcsEclipse.g:579:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalCcsEclipse.g:580:1: ( ruleImport EOF )
            // InternalCcsEclipse.g:581:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalCcsEclipse.g:588:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:592:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalCcsEclipse.g:593:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalCcsEclipse.g:593:1: ( ( rule__Import__Group__0 ) )
            // InternalCcsEclipse.g:594:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalCcsEclipse.g:595:1: ( rule__Import__Group__0 )
            // InternalCcsEclipse.g:595:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "rule__Step__Alternatives"
    // InternalCcsEclipse.g:607:1: rule__Step__Alternatives : ( ( ruleSingleStep ) | ( ( rule__Step__Group_1__0 ) ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:611:1: ( ( ruleSingleStep ) | ( ( rule__Step__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCcsEclipse.g:612:1: ( ruleSingleStep )
                    {
                    // InternalCcsEclipse.g:612:1: ( ruleSingleStep )
                    // InternalCcsEclipse.g:613:1: ruleSingleStep
                    {
                     before(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:618:6: ( ( rule__Step__Group_1__0 ) )
                    {
                    // InternalCcsEclipse.g:618:6: ( ( rule__Step__Group_1__0 ) )
                    // InternalCcsEclipse.g:619:1: ( rule__Step__Group_1__0 )
                    {
                     before(grammarAccess.getStepAccess().getGroup_1()); 
                    // InternalCcsEclipse.g:620:1: ( rule__Step__Group_1__0 )
                    // InternalCcsEclipse.g:620:2: rule__Step__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Alternatives"


    // $ANTLR start "rule__Rule__Alternatives_0"
    // InternalCcsEclipse.g:629:1: rule__Rule__Alternatives_0 : ( ( ( rule__Rule__ImportAssignment_0_0 ) ) | ( ( rule__Rule__ConstraintAssignment_0_1 ) ) | ( ( rule__Rule__PropertyAssignment_0_2 ) ) | ( ( rule__Rule__NestedAssignment_0_3 ) ) );
    public final void rule__Rule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:633:1: ( ( ( rule__Rule__ImportAssignment_0_0 ) ) | ( ( rule__Rule__ConstraintAssignment_0_1 ) ) | ( ( rule__Rule__PropertyAssignment_0_2 ) ) | ( ( rule__Rule__NestedAssignment_0_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=RULE_STRING && LA3_4<=RULE_ID)||LA3_4==15||(LA3_4>=18 && LA3_4<=21)||(LA3_4>=25 && LA3_4<=26)) ) {
                    alt3=4;
                }
                else if ( (LA3_4==23) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 15:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCcsEclipse.g:634:1: ( ( rule__Rule__ImportAssignment_0_0 ) )
                    {
                    // InternalCcsEclipse.g:634:1: ( ( rule__Rule__ImportAssignment_0_0 ) )
                    // InternalCcsEclipse.g:635:1: ( rule__Rule__ImportAssignment_0_0 )
                    {
                     before(grammarAccess.getRuleAccess().getImportAssignment_0_0()); 
                    // InternalCcsEclipse.g:636:1: ( rule__Rule__ImportAssignment_0_0 )
                    // InternalCcsEclipse.g:636:2: rule__Rule__ImportAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__ImportAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getImportAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:640:6: ( ( rule__Rule__ConstraintAssignment_0_1 ) )
                    {
                    // InternalCcsEclipse.g:640:6: ( ( rule__Rule__ConstraintAssignment_0_1 ) )
                    // InternalCcsEclipse.g:641:1: ( rule__Rule__ConstraintAssignment_0_1 )
                    {
                     before(grammarAccess.getRuleAccess().getConstraintAssignment_0_1()); 
                    // InternalCcsEclipse.g:642:1: ( rule__Rule__ConstraintAssignment_0_1 )
                    // InternalCcsEclipse.g:642:2: rule__Rule__ConstraintAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__ConstraintAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getConstraintAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCcsEclipse.g:646:6: ( ( rule__Rule__PropertyAssignment_0_2 ) )
                    {
                    // InternalCcsEclipse.g:646:6: ( ( rule__Rule__PropertyAssignment_0_2 ) )
                    // InternalCcsEclipse.g:647:1: ( rule__Rule__PropertyAssignment_0_2 )
                    {
                     before(grammarAccess.getRuleAccess().getPropertyAssignment_0_2()); 
                    // InternalCcsEclipse.g:648:1: ( rule__Rule__PropertyAssignment_0_2 )
                    // InternalCcsEclipse.g:648:2: rule__Rule__PropertyAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__PropertyAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getPropertyAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCcsEclipse.g:652:6: ( ( rule__Rule__NestedAssignment_0_3 ) )
                    {
                    // InternalCcsEclipse.g:652:6: ( ( rule__Rule__NestedAssignment_0_3 ) )
                    // InternalCcsEclipse.g:653:1: ( rule__Rule__NestedAssignment_0_3 )
                    {
                     before(grammarAccess.getRuleAccess().getNestedAssignment_0_3()); 
                    // InternalCcsEclipse.g:654:1: ( rule__Rule__NestedAssignment_0_3 )
                    // InternalCcsEclipse.g:654:2: rule__Rule__NestedAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__NestedAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getNestedAssignment_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_0"


    // $ANTLR start "rule__Nested__Alternatives_1"
    // InternalCcsEclipse.g:663:1: rule__Nested__Alternatives_1 : ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) );
    public final void rule__Nested__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:667:1: ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCcsEclipse.g:668:1: ( ( rule__Nested__Group_1_0__0 ) )
                    {
                    // InternalCcsEclipse.g:668:1: ( ( rule__Nested__Group_1_0__0 ) )
                    // InternalCcsEclipse.g:669:1: ( rule__Nested__Group_1_0__0 )
                    {
                     before(grammarAccess.getNestedAccess().getGroup_1_0()); 
                    // InternalCcsEclipse.g:670:1: ( rule__Nested__Group_1_0__0 )
                    // InternalCcsEclipse.g:670:2: rule__Nested__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nested__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:674:6: ( ( rule__Nested__Group_1_1__0 ) )
                    {
                    // InternalCcsEclipse.g:674:6: ( ( rule__Nested__Group_1_1__0 ) )
                    // InternalCcsEclipse.g:675:1: ( rule__Nested__Group_1_1__0 )
                    {
                     before(grammarAccess.getNestedAccess().getGroup_1_1()); 
                    // InternalCcsEclipse.g:676:1: ( rule__Nested__Group_1_1__0 )
                    // InternalCcsEclipse.g:676:2: rule__Nested__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nested__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Alternatives_1"


    // $ANTLR start "rule__Nested__Alternatives_1_0_1"
    // InternalCcsEclipse.g:685:1: rule__Nested__Alternatives_1_0_1 : ( ( ( rule__Nested__ImportAssignment_1_0_1_0 ) ) | ( ( rule__Nested__ConstraintAssignment_1_0_1_1 ) ) | ( ( rule__Nested__PropertyAssignment_1_0_1_2 ) ) );
    public final void rule__Nested__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:689:1: ( ( ( rule__Nested__ImportAssignment_1_0_1_0 ) ) | ( ( rule__Nested__ConstraintAssignment_1_0_1_1 ) ) | ( ( rule__Nested__PropertyAssignment_1_0_1_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
            case 28:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCcsEclipse.g:690:1: ( ( rule__Nested__ImportAssignment_1_0_1_0 ) )
                    {
                    // InternalCcsEclipse.g:690:1: ( ( rule__Nested__ImportAssignment_1_0_1_0 ) )
                    // InternalCcsEclipse.g:691:1: ( rule__Nested__ImportAssignment_1_0_1_0 )
                    {
                     before(grammarAccess.getNestedAccess().getImportAssignment_1_0_1_0()); 
                    // InternalCcsEclipse.g:692:1: ( rule__Nested__ImportAssignment_1_0_1_0 )
                    // InternalCcsEclipse.g:692:2: rule__Nested__ImportAssignment_1_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nested__ImportAssignment_1_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getImportAssignment_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:696:6: ( ( rule__Nested__ConstraintAssignment_1_0_1_1 ) )
                    {
                    // InternalCcsEclipse.g:696:6: ( ( rule__Nested__ConstraintAssignment_1_0_1_1 ) )
                    // InternalCcsEclipse.g:697:1: ( rule__Nested__ConstraintAssignment_1_0_1_1 )
                    {
                     before(grammarAccess.getNestedAccess().getConstraintAssignment_1_0_1_1()); 
                    // InternalCcsEclipse.g:698:1: ( rule__Nested__ConstraintAssignment_1_0_1_1 )
                    // InternalCcsEclipse.g:698:2: rule__Nested__ConstraintAssignment_1_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nested__ConstraintAssignment_1_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getConstraintAssignment_1_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCcsEclipse.g:702:6: ( ( rule__Nested__PropertyAssignment_1_0_1_2 ) )
                    {
                    // InternalCcsEclipse.g:702:6: ( ( rule__Nested__PropertyAssignment_1_0_1_2 ) )
                    // InternalCcsEclipse.g:703:1: ( rule__Nested__PropertyAssignment_1_0_1_2 )
                    {
                     before(grammarAccess.getNestedAccess().getPropertyAssignment_1_0_1_2()); 
                    // InternalCcsEclipse.g:704:1: ( rule__Nested__PropertyAssignment_1_0_1_2 )
                    // InternalCcsEclipse.g:704:2: rule__Nested__PropertyAssignment_1_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nested__PropertyAssignment_1_0_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getPropertyAssignment_1_0_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Alternatives_1_0_1"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalCcsEclipse.g:713:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:717:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCcsEclipse.g:718:1: ( 'true' )
                    {
                    // InternalCcsEclipse.g:718:1: ( 'true' )
                    // InternalCcsEclipse.g:719:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:726:6: ( 'false' )
                    {
                    // InternalCcsEclipse.g:726:6: ( 'false' )
                    // InternalCcsEclipse.g:727:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalCcsEclipse.g:739:1: rule__Value__Alternatives : ( ( RULE_HEXINT ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( ruleBoolean ) | ( RULE_ID ) | ( RULE_NUM_ID ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:743:1: ( ( RULE_HEXINT ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( ruleBoolean ) | ( RULE_ID ) | ( RULE_NUM_ID ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_HEXINT:
                {
                alt7=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            case 12:
            case 13:
                {
                alt7=4;
                }
                break;
            case RULE_ID:
                {
                alt7=5;
                }
                break;
            case RULE_NUM_ID:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCcsEclipse.g:744:1: ( RULE_HEXINT )
                    {
                    // InternalCcsEclipse.g:744:1: ( RULE_HEXINT )
                    // InternalCcsEclipse.g:745:1: RULE_HEXINT
                    {
                     before(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                    match(input,RULE_HEXINT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:750:6: ( RULE_NUMBER )
                    {
                    // InternalCcsEclipse.g:750:6: ( RULE_NUMBER )
                    // InternalCcsEclipse.g:751:1: RULE_NUMBER
                    {
                     before(grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 
                    match(input,RULE_NUMBER,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCcsEclipse.g:756:6: ( RULE_STRING )
                    {
                    // InternalCcsEclipse.g:756:6: ( RULE_STRING )
                    // InternalCcsEclipse.g:757:1: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCcsEclipse.g:762:6: ( ruleBoolean )
                    {
                    // InternalCcsEclipse.g:762:6: ( ruleBoolean )
                    // InternalCcsEclipse.g:763:1: ruleBoolean
                    {
                     before(grammarAccess.getValueAccess().getBooleanParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCcsEclipse.g:768:6: ( RULE_ID )
                    {
                    // InternalCcsEclipse.g:768:6: ( RULE_ID )
                    // InternalCcsEclipse.g:769:1: RULE_ID
                    {
                     before(grammarAccess.getValueAccess().getIDTerminalRuleCall_4()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getIDTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCcsEclipse.g:774:6: ( RULE_NUM_ID )
                    {
                    // InternalCcsEclipse.g:774:6: ( RULE_NUM_ID )
                    // InternalCcsEclipse.g:775:1: RULE_NUM_ID
                    {
                     before(grammarAccess.getValueAccess().getNUM_IDTerminalRuleCall_5()); 
                    match(input,RULE_NUM_ID,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getNUM_IDTerminalRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Ident__Alternatives"
    // InternalCcsEclipse.g:785:1: rule__Ident__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Ident__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:789:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCcsEclipse.g:790:1: ( RULE_ID )
                    {
                    // InternalCcsEclipse.g:790:1: ( RULE_ID )
                    // InternalCcsEclipse.g:791:1: RULE_ID
                    {
                     before(grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:796:6: ( RULE_STRING )
                    {
                    // InternalCcsEclipse.g:796:6: ( RULE_STRING )
                    // InternalCcsEclipse.g:797:1: RULE_STRING
                    {
                     before(grammarAccess.getIdentAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIdentAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ident__Alternatives"


    // $ANTLR start "rule__RuleSet__Group__0"
    // InternalCcsEclipse.g:809:1: rule__RuleSet__Group__0 : rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 ;
    public final void rule__RuleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:813:1: ( rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 )
            // InternalCcsEclipse.g:814:2: rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RuleSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__0"


    // $ANTLR start "rule__RuleSet__Group__0__Impl"
    // InternalCcsEclipse.g:821:1: rule__RuleSet__Group__0__Impl : ( ( rule__RuleSet__ContextAssignment_0 )? ) ;
    public final void rule__RuleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:825:1: ( ( ( rule__RuleSet__ContextAssignment_0 )? ) )
            // InternalCcsEclipse.g:826:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            {
            // InternalCcsEclipse.g:826:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            // InternalCcsEclipse.g:827:1: ( rule__RuleSet__ContextAssignment_0 )?
            {
             before(grammarAccess.getRuleSetAccess().getContextAssignment_0()); 
            // InternalCcsEclipse.g:828:1: ( rule__RuleSet__ContextAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCcsEclipse.g:828:2: rule__RuleSet__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleSet__ContextAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleSetAccess().getContextAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__0__Impl"


    // $ANTLR start "rule__RuleSet__Group__1"
    // InternalCcsEclipse.g:838:1: rule__RuleSet__Group__1 : rule__RuleSet__Group__1__Impl ;
    public final void rule__RuleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:842:1: ( rule__RuleSet__Group__1__Impl )
            // InternalCcsEclipse.g:843:2: rule__RuleSet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleSet__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__1"


    // $ANTLR start "rule__RuleSet__Group__1__Impl"
    // InternalCcsEclipse.g:849:1: rule__RuleSet__Group__1__Impl : ( ( rule__RuleSet__RulesAssignment_1 )* ) ;
    public final void rule__RuleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:853:1: ( ( ( rule__RuleSet__RulesAssignment_1 )* ) )
            // InternalCcsEclipse.g:854:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            {
            // InternalCcsEclipse.g:854:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            // InternalCcsEclipse.g:855:1: ( rule__RuleSet__RulesAssignment_1 )*
            {
             before(grammarAccess.getRuleSetAccess().getRulesAssignment_1()); 
            // InternalCcsEclipse.g:856:1: ( rule__RuleSet__RulesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==15||LA10_0==24||(LA10_0>=27 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCcsEclipse.g:856:2: rule__RuleSet__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RuleSet__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRuleSetAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // InternalCcsEclipse.g:870:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:874:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalCcsEclipse.g:875:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // InternalCcsEclipse.g:882:1: rule__Context__Group__0__Impl : ( '@context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:886:1: ( ( '@context' ) )
            // InternalCcsEclipse.g:887:1: ( '@context' )
            {
            // InternalCcsEclipse.g:887:1: ( '@context' )
            // InternalCcsEclipse.g:888:1: '@context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // InternalCcsEclipse.g:901:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:905:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalCcsEclipse.g:906:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // InternalCcsEclipse.g:913:1: rule__Context__Group__1__Impl : ( '(' ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:917:1: ( ( '(' ) )
            // InternalCcsEclipse.g:918:1: ( '(' )
            {
            // InternalCcsEclipse.g:918:1: ( '(' )
            // InternalCcsEclipse.g:919:1: '('
            {
             before(grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // InternalCcsEclipse.g:932:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:936:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalCcsEclipse.g:937:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // InternalCcsEclipse.g:944:1: rule__Context__Group__2__Impl : ( ( rule__Context__SelectorAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:948:1: ( ( ( rule__Context__SelectorAssignment_2 ) ) )
            // InternalCcsEclipse.g:949:1: ( ( rule__Context__SelectorAssignment_2 ) )
            {
            // InternalCcsEclipse.g:949:1: ( ( rule__Context__SelectorAssignment_2 ) )
            // InternalCcsEclipse.g:950:1: ( rule__Context__SelectorAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getSelectorAssignment_2()); 
            // InternalCcsEclipse.g:951:1: ( rule__Context__SelectorAssignment_2 )
            // InternalCcsEclipse.g:951:2: rule__Context__SelectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Context__SelectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getSelectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // InternalCcsEclipse.g:961:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:965:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalCcsEclipse.g:966:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3"


    // $ANTLR start "rule__Context__Group__3__Impl"
    // InternalCcsEclipse.g:973:1: rule__Context__Group__3__Impl : ( ')' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:977:1: ( ( ')' ) )
            // InternalCcsEclipse.g:978:1: ( ')' )
            {
            // InternalCcsEclipse.g:978:1: ( ')' )
            // InternalCcsEclipse.g:979:1: ')'
            {
             before(grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Context__Group__4"
    // InternalCcsEclipse.g:992:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:996:1: ( rule__Context__Group__4__Impl )
            // InternalCcsEclipse.g:997:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4"


    // $ANTLR start "rule__Context__Group__4__Impl"
    // InternalCcsEclipse.g:1003:1: rule__Context__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1007:1: ( ( ( ';' )? ) )
            // InternalCcsEclipse.g:1008:1: ( ( ';' )? )
            {
            // InternalCcsEclipse.g:1008:1: ( ( ';' )? )
            // InternalCcsEclipse.g:1009:1: ( ';' )?
            {
             before(grammarAccess.getContextAccess().getSemicolonKeyword_4()); 
            // InternalCcsEclipse.g:1010:1: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCcsEclipse.g:1011:2: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getContextAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalCcsEclipse.g:1032:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1036:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalCcsEclipse.g:1037:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // InternalCcsEclipse.g:1044:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__SumAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1048:1: ( ( ( rule__Selector__SumAssignment_0 ) ) )
            // InternalCcsEclipse.g:1049:1: ( ( rule__Selector__SumAssignment_0 ) )
            {
            // InternalCcsEclipse.g:1049:1: ( ( rule__Selector__SumAssignment_0 ) )
            // InternalCcsEclipse.g:1050:1: ( rule__Selector__SumAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getSumAssignment_0()); 
            // InternalCcsEclipse.g:1051:1: ( rule__Selector__SumAssignment_0 )
            // InternalCcsEclipse.g:1051:2: rule__Selector__SumAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__SumAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSumAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // InternalCcsEclipse.g:1061:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1065:1: ( rule__Selector__Group__1__Impl )
            // InternalCcsEclipse.g:1066:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // InternalCcsEclipse.g:1072:1: rule__Selector__Group__1__Impl : ( ( '>' )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1076:1: ( ( ( '>' )? ) )
            // InternalCcsEclipse.g:1077:1: ( ( '>' )? )
            {
            // InternalCcsEclipse.g:1077:1: ( ( '>' )? )
            // InternalCcsEclipse.g:1078:1: ( '>' )?
            {
             before(grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1()); 
            // InternalCcsEclipse.g:1079:1: ( '>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCcsEclipse.g:1080:2: '>'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // InternalCcsEclipse.g:1095:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1099:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalCcsEclipse.g:1100:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0"


    // $ANTLR start "rule__Sum__Group__0__Impl"
    // InternalCcsEclipse.g:1107:1: rule__Sum__Group__0__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1111:1: ( ( ruleProduct ) )
            // InternalCcsEclipse.g:1112:1: ( ruleProduct )
            {
            // InternalCcsEclipse.g:1112:1: ( ruleProduct )
            // InternalCcsEclipse.g:1113:1: ruleProduct
            {
             before(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // InternalCcsEclipse.g:1124:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1128:1: ( rule__Sum__Group__1__Impl )
            // InternalCcsEclipse.g:1129:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1"


    // $ANTLR start "rule__Sum__Group__1__Impl"
    // InternalCcsEclipse.g:1135:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1139:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // InternalCcsEclipse.g:1140:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // InternalCcsEclipse.g:1140:1: ( ( rule__Sum__Group_1__0 )* )
            // InternalCcsEclipse.g:1141:1: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // InternalCcsEclipse.g:1142:1: ( rule__Sum__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCcsEclipse.g:1142:2: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Sum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSumAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group_1__0"
    // InternalCcsEclipse.g:1156:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1160:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // InternalCcsEclipse.g:1161:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__0"


    // $ANTLR start "rule__Sum__Group_1__0__Impl"
    // InternalCcsEclipse.g:1168:1: rule__Sum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1172:1: ( ( ',' ) )
            // InternalCcsEclipse.g:1173:1: ( ',' )
            {
            // InternalCcsEclipse.g:1173:1: ( ',' )
            // InternalCcsEclipse.g:1174:1: ','
            {
             before(grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1__1"
    // InternalCcsEclipse.g:1187:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1191:1: ( rule__Sum__Group_1__1__Impl )
            // InternalCcsEclipse.g:1192:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__1"


    // $ANTLR start "rule__Sum__Group_1__1__Impl"
    // InternalCcsEclipse.g:1198:1: rule__Sum__Group_1__1__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1202:1: ( ( ruleProduct ) )
            // InternalCcsEclipse.g:1203:1: ( ruleProduct )
            {
            // InternalCcsEclipse.g:1203:1: ( ruleProduct )
            // InternalCcsEclipse.g:1204:1: ruleProduct
            {
             before(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalCcsEclipse.g:1219:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1223:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalCcsEclipse.g:1224:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalCcsEclipse.g:1231:1: rule__Term__Group__0__Impl : ( ruleStep ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1235:1: ( ( ruleStep ) )
            // InternalCcsEclipse.g:1236:1: ( ruleStep )
            {
            // InternalCcsEclipse.g:1236:1: ( ruleStep )
            // InternalCcsEclipse.g:1237:1: ruleStep
            {
             before(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalCcsEclipse.g:1248:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1252:1: ( rule__Term__Group__1__Impl )
            // InternalCcsEclipse.g:1253:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalCcsEclipse.g:1259:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1263:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalCcsEclipse.g:1264:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalCcsEclipse.g:1264:1: ( ( rule__Term__Group_1__0 )* )
            // InternalCcsEclipse.g:1265:1: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalCcsEclipse.g:1266:1: ( rule__Term__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    int LA14_2 = input.LA(2);

                    if ( ((LA14_2>=RULE_STRING && LA14_2<=RULE_ID)||LA14_2==15) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalCcsEclipse.g:1266:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalCcsEclipse.g:1280:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1284:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalCcsEclipse.g:1285:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalCcsEclipse.g:1292:1: rule__Term__Group_1__0__Impl : ( '>' ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1296:1: ( ( '>' ) )
            // InternalCcsEclipse.g:1297:1: ( '>' )
            {
            // InternalCcsEclipse.g:1297:1: ( '>' )
            // InternalCcsEclipse.g:1298:1: '>'
            {
             before(grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalCcsEclipse.g:1311:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1315:1: ( rule__Term__Group_1__1__Impl )
            // InternalCcsEclipse.g:1316:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalCcsEclipse.g:1322:1: rule__Term__Group_1__1__Impl : ( ruleStep ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1326:1: ( ( ruleStep ) )
            // InternalCcsEclipse.g:1327:1: ( ruleStep )
            {
            // InternalCcsEclipse.g:1327:1: ( ruleStep )
            // InternalCcsEclipse.g:1328:1: ruleStep
            {
             before(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Step__Group_1__0"
    // InternalCcsEclipse.g:1343:1: rule__Step__Group_1__0 : rule__Step__Group_1__0__Impl rule__Step__Group_1__1 ;
    public final void rule__Step__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1347:1: ( rule__Step__Group_1__0__Impl rule__Step__Group_1__1 )
            // InternalCcsEclipse.g:1348:2: rule__Step__Group_1__0__Impl rule__Step__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Step__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_1__0"


    // $ANTLR start "rule__Step__Group_1__0__Impl"
    // InternalCcsEclipse.g:1355:1: rule__Step__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Step__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1359:1: ( ( '(' ) )
            // InternalCcsEclipse.g:1360:1: ( '(' )
            {
            // InternalCcsEclipse.g:1360:1: ( '(' )
            // InternalCcsEclipse.g:1361:1: '('
            {
             before(grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_1__0__Impl"


    // $ANTLR start "rule__Step__Group_1__1"
    // InternalCcsEclipse.g:1374:1: rule__Step__Group_1__1 : rule__Step__Group_1__1__Impl rule__Step__Group_1__2 ;
    public final void rule__Step__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1378:1: ( rule__Step__Group_1__1__Impl rule__Step__Group_1__2 )
            // InternalCcsEclipse.g:1379:2: rule__Step__Group_1__1__Impl rule__Step__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Step__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_1__1"


    // $ANTLR start "rule__Step__Group_1__1__Impl"
    // InternalCcsEclipse.g:1386:1: rule__Step__Group_1__1__Impl : ( ruleSum ) ;
    public final void rule__Step__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1390:1: ( ( ruleSum ) )
            // InternalCcsEclipse.g:1391:1: ( ruleSum )
            {
            // InternalCcsEclipse.g:1391:1: ( ruleSum )
            // InternalCcsEclipse.g:1392:1: ruleSum
            {
             before(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_1__1__Impl"


    // $ANTLR start "rule__Step__Group_1__2"
    // InternalCcsEclipse.g:1403:1: rule__Step__Group_1__2 : rule__Step__Group_1__2__Impl ;
    public final void rule__Step__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1407:1: ( rule__Step__Group_1__2__Impl )
            // InternalCcsEclipse.g:1408:2: rule__Step__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_1__2"


    // $ANTLR start "rule__Step__Group_1__2__Impl"
    // InternalCcsEclipse.g:1414:1: rule__Step__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Step__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1418:1: ( ( ')' ) )
            // InternalCcsEclipse.g:1419:1: ( ')' )
            {
            // InternalCcsEclipse.g:1419:1: ( ')' )
            // InternalCcsEclipse.g:1420:1: ')'
            {
             before(grammarAccess.getStepAccess().getRightParenthesisKeyword_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_1__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalCcsEclipse.g:1439:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1443:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalCcsEclipse.g:1444:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalCcsEclipse.g:1451:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Alternatives_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1455:1: ( ( ( rule__Rule__Alternatives_0 ) ) )
            // InternalCcsEclipse.g:1456:1: ( ( rule__Rule__Alternatives_0 ) )
            {
            // InternalCcsEclipse.g:1456:1: ( ( rule__Rule__Alternatives_0 ) )
            // InternalCcsEclipse.g:1457:1: ( rule__Rule__Alternatives_0 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_0()); 
            // InternalCcsEclipse.g:1458:1: ( rule__Rule__Alternatives_0 )
            // InternalCcsEclipse.g:1458:2: rule__Rule__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalCcsEclipse.g:1468:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1472:1: ( rule__Rule__Group__1__Impl )
            // InternalCcsEclipse.g:1473:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalCcsEclipse.g:1479:1: rule__Rule__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1483:1: ( ( ( ';' )? ) )
            // InternalCcsEclipse.g:1484:1: ( ( ';' )? )
            {
            // InternalCcsEclipse.g:1484:1: ( ( ';' )? )
            // InternalCcsEclipse.g:1485:1: ( ';' )?
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_1()); 
            // InternalCcsEclipse.g:1486:1: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCcsEclipse.g:1487:2: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Nested__Group__0"
    // InternalCcsEclipse.g:1502:1: rule__Nested__Group__0 : rule__Nested__Group__0__Impl rule__Nested__Group__1 ;
    public final void rule__Nested__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1506:1: ( rule__Nested__Group__0__Impl rule__Nested__Group__1 )
            // InternalCcsEclipse.g:1507:2: rule__Nested__Group__0__Impl rule__Nested__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Nested__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nested__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group__0"


    // $ANTLR start "rule__Nested__Group__0__Impl"
    // InternalCcsEclipse.g:1514:1: rule__Nested__Group__0__Impl : ( ( rule__Nested__SelectorAssignment_0 ) ) ;
    public final void rule__Nested__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1518:1: ( ( ( rule__Nested__SelectorAssignment_0 ) ) )
            // InternalCcsEclipse.g:1519:1: ( ( rule__Nested__SelectorAssignment_0 ) )
            {
            // InternalCcsEclipse.g:1519:1: ( ( rule__Nested__SelectorAssignment_0 ) )
            // InternalCcsEclipse.g:1520:1: ( rule__Nested__SelectorAssignment_0 )
            {
             before(grammarAccess.getNestedAccess().getSelectorAssignment_0()); 
            // InternalCcsEclipse.g:1521:1: ( rule__Nested__SelectorAssignment_0 )
            // InternalCcsEclipse.g:1521:2: rule__Nested__SelectorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Nested__SelectorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNestedAccess().getSelectorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group__0__Impl"


    // $ANTLR start "rule__Nested__Group__1"
    // InternalCcsEclipse.g:1531:1: rule__Nested__Group__1 : rule__Nested__Group__1__Impl ;
    public final void rule__Nested__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1535:1: ( rule__Nested__Group__1__Impl )
            // InternalCcsEclipse.g:1536:2: rule__Nested__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nested__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group__1"


    // $ANTLR start "rule__Nested__Group__1__Impl"
    // InternalCcsEclipse.g:1542:1: rule__Nested__Group__1__Impl : ( ( rule__Nested__Alternatives_1 ) ) ;
    public final void rule__Nested__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1546:1: ( ( ( rule__Nested__Alternatives_1 ) ) )
            // InternalCcsEclipse.g:1547:1: ( ( rule__Nested__Alternatives_1 ) )
            {
            // InternalCcsEclipse.g:1547:1: ( ( rule__Nested__Alternatives_1 ) )
            // InternalCcsEclipse.g:1548:1: ( rule__Nested__Alternatives_1 )
            {
             before(grammarAccess.getNestedAccess().getAlternatives_1()); 
            // InternalCcsEclipse.g:1549:1: ( rule__Nested__Alternatives_1 )
            // InternalCcsEclipse.g:1549:2: rule__Nested__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Nested__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group__1__Impl"


    // $ANTLR start "rule__Nested__Group_1_0__0"
    // InternalCcsEclipse.g:1563:1: rule__Nested__Group_1_0__0 : rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 ;
    public final void rule__Nested__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1567:1: ( rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 )
            // InternalCcsEclipse.g:1568:2: rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Nested__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nested__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group_1_0__0"


    // $ANTLR start "rule__Nested__Group_1_0__0__Impl"
    // InternalCcsEclipse.g:1575:1: rule__Nested__Group_1_0__0__Impl : ( ':' ) ;
    public final void rule__Nested__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1579:1: ( ( ':' ) )
            // InternalCcsEclipse.g:1580:1: ( ':' )
            {
            // InternalCcsEclipse.g:1580:1: ( ':' )
            // InternalCcsEclipse.g:1581:1: ':'
            {
             before(grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group_1_0__0__Impl"


    // $ANTLR start "rule__Nested__Group_1_0__1"
    // InternalCcsEclipse.g:1594:1: rule__Nested__Group_1_0__1 : rule__Nested__Group_1_0__1__Impl ;
    public final void rule__Nested__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1598:1: ( rule__Nested__Group_1_0__1__Impl )
            // InternalCcsEclipse.g:1599:2: rule__Nested__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nested__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group_1_0__1"


    // $ANTLR start "rule__Nested__Group_1_0__1__Impl"
    // InternalCcsEclipse.g:1605:1: rule__Nested__Group_1_0__1__Impl : ( ( rule__Nested__Alternatives_1_0_1 ) ) ;
    public final void rule__Nested__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1609:1: ( ( ( rule__Nested__Alternatives_1_0_1 ) ) )
            // InternalCcsEclipse.g:1610:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            {
            // InternalCcsEclipse.g:1610:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            // InternalCcsEclipse.g:1611:1: ( rule__Nested__Alternatives_1_0_1 )
            {
             before(grammarAccess.getNestedAccess().getAlternatives_1_0_1()); 
            // InternalCcsEclipse.g:1612:1: ( rule__Nested__Alternatives_1_0_1 )
            // InternalCcsEclipse.g:1612:2: rule__Nested__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Nested__Alternatives_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedAccess().getAlternatives_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group_1_0__1__Impl"


    // $ANTLR start "rule__Nested__Group_1_1__0"
    // InternalCcsEclipse.g:1626:1: rule__Nested__Group_1_1__0 : rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 ;
    public final void rule__Nested__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1630:1: ( rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 )
            // InternalCcsEclipse.g:1631:2: rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Nested__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nested__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group_1_1__0"


    // $ANTLR start "rule__Nested__Group_1_1__0__Impl"
    // InternalCcsEclipse.g:1638:1: rule__Nested__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__Nested__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1642:1: ( ( '{' ) )
            // InternalCcsEclipse.g:1643:1: ( '{' )
            {
            // InternalCcsEclipse.g:1643:1: ( '{' )
            // InternalCcsEclipse.g:1644:1: '{'
            {
             before(grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group_1_1__0__Impl"


    // $ANTLR start "rule__Nested__Group_1_1__1"
    // InternalCcsEclipse.g:1657:1: rule__Nested__Group_1_1__1 : rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 ;
    public final void rule__Nested__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1661:1: ( rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 )
            // InternalCcsEclipse.g:1662:2: rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Nested__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nested__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group_1_1__1"


    // $ANTLR start "rule__Nested__Group_1_1__1__Impl"
    // InternalCcsEclipse.g:1669:1: rule__Nested__Group_1_1__1__Impl : ( ( rule__Nested__RulesAssignment_1_1_1 )* ) ;
    public final void rule__Nested__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1673:1: ( ( ( rule__Nested__RulesAssignment_1_1_1 )* ) )
            // InternalCcsEclipse.g:1674:1: ( ( rule__Nested__RulesAssignment_1_1_1 )* )
            {
            // InternalCcsEclipse.g:1674:1: ( ( rule__Nested__RulesAssignment_1_1_1 )* )
            // InternalCcsEclipse.g:1675:1: ( rule__Nested__RulesAssignment_1_1_1 )*
            {
             before(grammarAccess.getNestedAccess().getRulesAssignment_1_1_1()); 
            // InternalCcsEclipse.g:1676:1: ( rule__Nested__RulesAssignment_1_1_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==15||LA16_0==24||(LA16_0>=27 && LA16_0<=28)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCcsEclipse.g:1676:2: rule__Nested__RulesAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Nested__RulesAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getNestedAccess().getRulesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group_1_1__1__Impl"


    // $ANTLR start "rule__Nested__Group_1_1__2"
    // InternalCcsEclipse.g:1686:1: rule__Nested__Group_1_1__2 : rule__Nested__Group_1_1__2__Impl ;
    public final void rule__Nested__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1690:1: ( rule__Nested__Group_1_1__2__Impl )
            // InternalCcsEclipse.g:1691:2: rule__Nested__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nested__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group_1_1__2"


    // $ANTLR start "rule__Nested__Group_1_1__2__Impl"
    // InternalCcsEclipse.g:1697:1: rule__Nested__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__Nested__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1701:1: ( ( '}' ) )
            // InternalCcsEclipse.g:1702:1: ( '}' )
            {
            // InternalCcsEclipse.g:1702:1: ( '}' )
            // InternalCcsEclipse.g:1703:1: '}'
            {
             before(grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__Group_1_1__2__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalCcsEclipse.g:1722:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1726:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalCcsEclipse.g:1727:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalCcsEclipse.g:1734:1: rule__Property__Group__0__Impl : ( ( rule__Property__ModifiersAssignment_0 )* ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1738:1: ( ( ( rule__Property__ModifiersAssignment_0 )* ) )
            // InternalCcsEclipse.g:1739:1: ( ( rule__Property__ModifiersAssignment_0 )* )
            {
            // InternalCcsEclipse.g:1739:1: ( ( rule__Property__ModifiersAssignment_0 )* )
            // InternalCcsEclipse.g:1740:1: ( rule__Property__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getPropertyAccess().getModifiersAssignment_0()); 
            // InternalCcsEclipse.g:1741:1: ( rule__Property__ModifiersAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCcsEclipse.g:1741:2: rule__Property__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Property__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getModifiersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalCcsEclipse.g:1751:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1755:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalCcsEclipse.g:1756:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalCcsEclipse.g:1763:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1767:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalCcsEclipse.g:1768:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalCcsEclipse.g:1768:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalCcsEclipse.g:1769:1: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // InternalCcsEclipse.g:1770:1: ( rule__Property__NameAssignment_1 )
            // InternalCcsEclipse.g:1770:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalCcsEclipse.g:1780:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1784:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalCcsEclipse.g:1785:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalCcsEclipse.g:1792:1: rule__Property__Group__2__Impl : ( '=' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1796:1: ( ( '=' ) )
            // InternalCcsEclipse.g:1797:1: ( '=' )
            {
            // InternalCcsEclipse.g:1797:1: ( '=' )
            // InternalCcsEclipse.g:1798:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalCcsEclipse.g:1811:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1815:1: ( rule__Property__Group__3__Impl )
            // InternalCcsEclipse.g:1816:2: rule__Property__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalCcsEclipse.g:1822:1: rule__Property__Group__3__Impl : ( ( rule__Property__ValueAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1826:1: ( ( ( rule__Property__ValueAssignment_3 ) ) )
            // InternalCcsEclipse.g:1827:1: ( ( rule__Property__ValueAssignment_3 ) )
            {
            // InternalCcsEclipse.g:1827:1: ( ( rule__Property__ValueAssignment_3 ) )
            // InternalCcsEclipse.g:1828:1: ( rule__Property__ValueAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_3()); 
            // InternalCcsEclipse.g:1829:1: ( rule__Property__ValueAssignment_3 )
            // InternalCcsEclipse.g:1829:2: rule__Property__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalCcsEclipse.g:1847:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1851:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalCcsEclipse.g:1852:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalCcsEclipse.g:1859:1: rule__Constraint__Group__0__Impl : ( '@constrain' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1863:1: ( ( '@constrain' ) )
            // InternalCcsEclipse.g:1864:1: ( '@constrain' )
            {
            // InternalCcsEclipse.g:1864:1: ( '@constrain' )
            // InternalCcsEclipse.g:1865:1: '@constrain'
            {
             before(grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalCcsEclipse.g:1878:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1882:1: ( rule__Constraint__Group__1__Impl )
            // InternalCcsEclipse.g:1883:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalCcsEclipse.g:1889:1: rule__Constraint__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1893:1: ( ( ruleSingleStep ) )
            // InternalCcsEclipse.g:1894:1: ( ruleSingleStep )
            {
            // InternalCcsEclipse.g:1894:1: ( ruleSingleStep )
            // InternalCcsEclipse.g:1895:1: ruleSingleStep
            {
             before(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSingleStep();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__SingleStep__Group__0"
    // InternalCcsEclipse.g:1910:1: rule__SingleStep__Group__0 : rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 ;
    public final void rule__SingleStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1914:1: ( rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 )
            // InternalCcsEclipse.g:1915:2: rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SingleStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStep__Group__0"


    // $ANTLR start "rule__SingleStep__Group__0__Impl"
    // InternalCcsEclipse.g:1922:1: rule__SingleStep__Group__0__Impl : ( ruleIdent ) ;
    public final void rule__SingleStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1926:1: ( ( ruleIdent ) )
            // InternalCcsEclipse.g:1927:1: ( ruleIdent )
            {
            // InternalCcsEclipse.g:1927:1: ( ruleIdent )
            // InternalCcsEclipse.g:1928:1: ruleIdent
            {
             before(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStep__Group__0__Impl"


    // $ANTLR start "rule__SingleStep__Group__1"
    // InternalCcsEclipse.g:1939:1: rule__SingleStep__Group__1 : rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 ;
    public final void rule__SingleStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1943:1: ( rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 )
            // InternalCcsEclipse.g:1944:2: rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__SingleStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStep__Group__1"


    // $ANTLR start "rule__SingleStep__Group__1__Impl"
    // InternalCcsEclipse.g:1951:1: rule__SingleStep__Group__1__Impl : ( ( ruleVals )? ) ;
    public final void rule__SingleStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1955:1: ( ( ( ruleVals )? ) )
            // InternalCcsEclipse.g:1956:1: ( ( ruleVals )? )
            {
            // InternalCcsEclipse.g:1956:1: ( ( ruleVals )? )
            // InternalCcsEclipse.g:1957:1: ( ruleVals )?
            {
             before(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
            // InternalCcsEclipse.g:1958:1: ( ruleVals )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCcsEclipse.g:1958:3: ruleVals
                    {
                    pushFollow(FOLLOW_2);
                    ruleVals();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStep__Group__1__Impl"


    // $ANTLR start "rule__SingleStep__Group__2"
    // InternalCcsEclipse.g:1968:1: rule__SingleStep__Group__2 : rule__SingleStep__Group__2__Impl ;
    public final void rule__SingleStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1972:1: ( rule__SingleStep__Group__2__Impl )
            // InternalCcsEclipse.g:1973:2: rule__SingleStep__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleStep__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStep__Group__2"


    // $ANTLR start "rule__SingleStep__Group__2__Impl"
    // InternalCcsEclipse.g:1979:1: rule__SingleStep__Group__2__Impl : ( ( ruleStepSuffix )? ) ;
    public final void rule__SingleStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:1983:1: ( ( ( ruleStepSuffix )? ) )
            // InternalCcsEclipse.g:1984:1: ( ( ruleStepSuffix )? )
            {
            // InternalCcsEclipse.g:1984:1: ( ( ruleStepSuffix )? )
            // InternalCcsEclipse.g:1985:1: ( ruleStepSuffix )?
            {
             before(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
            // InternalCcsEclipse.g:1986:1: ( ruleStepSuffix )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCcsEclipse.g:1986:3: ruleStepSuffix
                    {
                    pushFollow(FOLLOW_2);
                    ruleStepSuffix();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStep__Group__2__Impl"


    // $ANTLR start "rule__Vals__Group__0"
    // InternalCcsEclipse.g:2002:1: rule__Vals__Group__0 : rule__Vals__Group__0__Impl rule__Vals__Group__1 ;
    public final void rule__Vals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2006:1: ( rule__Vals__Group__0__Impl rule__Vals__Group__1 )
            // InternalCcsEclipse.g:2007:2: rule__Vals__Group__0__Impl rule__Vals__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Vals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vals__Group__0"


    // $ANTLR start "rule__Vals__Group__0__Impl"
    // InternalCcsEclipse.g:2014:1: rule__Vals__Group__0__Impl : ( '.' ) ;
    public final void rule__Vals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2018:1: ( ( '.' ) )
            // InternalCcsEclipse.g:2019:1: ( '.' )
            {
            // InternalCcsEclipse.g:2019:1: ( '.' )
            // InternalCcsEclipse.g:2020:1: '.'
            {
             before(grammarAccess.getValsAccess().getFullStopKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getValsAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vals__Group__0__Impl"


    // $ANTLR start "rule__Vals__Group__1"
    // InternalCcsEclipse.g:2033:1: rule__Vals__Group__1 : rule__Vals__Group__1__Impl rule__Vals__Group__2 ;
    public final void rule__Vals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2037:1: ( rule__Vals__Group__1__Impl rule__Vals__Group__2 )
            // InternalCcsEclipse.g:2038:2: rule__Vals__Group__1__Impl rule__Vals__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Vals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vals__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vals__Group__1"


    // $ANTLR start "rule__Vals__Group__1__Impl"
    // InternalCcsEclipse.g:2045:1: rule__Vals__Group__1__Impl : ( ruleIdent ) ;
    public final void rule__Vals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2049:1: ( ( ruleIdent ) )
            // InternalCcsEclipse.g:2050:1: ( ruleIdent )
            {
            // InternalCcsEclipse.g:2050:1: ( ruleIdent )
            // InternalCcsEclipse.g:2051:1: ruleIdent
            {
             before(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vals__Group__1__Impl"


    // $ANTLR start "rule__Vals__Group__2"
    // InternalCcsEclipse.g:2062:1: rule__Vals__Group__2 : rule__Vals__Group__2__Impl ;
    public final void rule__Vals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2066:1: ( rule__Vals__Group__2__Impl )
            // InternalCcsEclipse.g:2067:2: rule__Vals__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vals__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vals__Group__2"


    // $ANTLR start "rule__Vals__Group__2__Impl"
    // InternalCcsEclipse.g:2073:1: rule__Vals__Group__2__Impl : ( ( ruleVals )* ) ;
    public final void rule__Vals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2077:1: ( ( ( ruleVals )* ) )
            // InternalCcsEclipse.g:2078:1: ( ( ruleVals )* )
            {
            // InternalCcsEclipse.g:2078:1: ( ( ruleVals )* )
            // InternalCcsEclipse.g:2079:1: ( ruleVals )*
            {
             before(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            // InternalCcsEclipse.g:2080:1: ( ruleVals )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCcsEclipse.g:2080:3: ruleVals
            	    {
            	    pushFollow(FOLLOW_24);
            	    ruleVals();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vals__Group__2__Impl"


    // $ANTLR start "rule__StepSuffix__Group__0"
    // InternalCcsEclipse.g:2096:1: rule__StepSuffix__Group__0 : rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 ;
    public final void rule__StepSuffix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2100:1: ( rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 )
            // InternalCcsEclipse.g:2101:2: rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__StepSuffix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepSuffix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepSuffix__Group__0"


    // $ANTLR start "rule__StepSuffix__Group__0__Impl"
    // InternalCcsEclipse.g:2108:1: rule__StepSuffix__Group__0__Impl : ( '/' ) ;
    public final void rule__StepSuffix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2112:1: ( ( '/' ) )
            // InternalCcsEclipse.g:2113:1: ( '/' )
            {
            // InternalCcsEclipse.g:2113:1: ( '/' )
            // InternalCcsEclipse.g:2114:1: '/'
            {
             before(grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepSuffix__Group__0__Impl"


    // $ANTLR start "rule__StepSuffix__Group__1"
    // InternalCcsEclipse.g:2127:1: rule__StepSuffix__Group__1 : rule__StepSuffix__Group__1__Impl ;
    public final void rule__StepSuffix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2131:1: ( rule__StepSuffix__Group__1__Impl )
            // InternalCcsEclipse.g:2132:2: rule__StepSuffix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepSuffix__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepSuffix__Group__1"


    // $ANTLR start "rule__StepSuffix__Group__1__Impl"
    // InternalCcsEclipse.g:2138:1: rule__StepSuffix__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__StepSuffix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2142:1: ( ( ruleSingleStep ) )
            // InternalCcsEclipse.g:2143:1: ( ruleSingleStep )
            {
            // InternalCcsEclipse.g:2143:1: ( ruleSingleStep )
            // InternalCcsEclipse.g:2144:1: ruleSingleStep
            {
             before(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSingleStep();

            state._fsp--;

             after(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepSuffix__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalCcsEclipse.g:2159:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2163:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalCcsEclipse.g:2164:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalCcsEclipse.g:2171:1: rule__Import__Group__0__Impl : ( '@import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2175:1: ( ( '@import' ) )
            // InternalCcsEclipse.g:2176:1: ( '@import' )
            {
            // InternalCcsEclipse.g:2176:1: ( '@import' )
            // InternalCcsEclipse.g:2177:1: '@import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalCcsEclipse.g:2190:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2194:1: ( rule__Import__Group__1__Impl )
            // InternalCcsEclipse.g:2195:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalCcsEclipse.g:2201:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2205:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalCcsEclipse.g:2206:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalCcsEclipse.g:2206:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalCcsEclipse.g:2207:1: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // InternalCcsEclipse.g:2208:1: ( rule__Import__NameAssignment_1 )
            // InternalCcsEclipse.g:2208:2: rule__Import__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__RuleSet__ContextAssignment_0"
    // InternalCcsEclipse.g:2223:1: rule__RuleSet__ContextAssignment_0 : ( ruleContext ) ;
    public final void rule__RuleSet__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2227:1: ( ( ruleContext ) )
            // InternalCcsEclipse.g:2228:1: ( ruleContext )
            {
            // InternalCcsEclipse.g:2228:1: ( ruleContext )
            // InternalCcsEclipse.g:2229:1: ruleContext
            {
             before(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__ContextAssignment_0"


    // $ANTLR start "rule__RuleSet__RulesAssignment_1"
    // InternalCcsEclipse.g:2238:1: rule__RuleSet__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__RuleSet__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2242:1: ( ( ruleRule ) )
            // InternalCcsEclipse.g:2243:1: ( ruleRule )
            {
            // InternalCcsEclipse.g:2243:1: ( ruleRule )
            // InternalCcsEclipse.g:2244:1: ruleRule
            {
             before(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSet__RulesAssignment_1"


    // $ANTLR start "rule__Context__SelectorAssignment_2"
    // InternalCcsEclipse.g:2253:1: rule__Context__SelectorAssignment_2 : ( ruleSelector ) ;
    public final void rule__Context__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2257:1: ( ( ruleSelector ) )
            // InternalCcsEclipse.g:2258:1: ( ruleSelector )
            {
            // InternalCcsEclipse.g:2258:1: ( ruleSelector )
            // InternalCcsEclipse.g:2259:1: ruleSelector
            {
             before(grammarAccess.getContextAccess().getSelectorSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getContextAccess().getSelectorSelectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__SelectorAssignment_2"


    // $ANTLR start "rule__Selector__SumAssignment_0"
    // InternalCcsEclipse.g:2268:1: rule__Selector__SumAssignment_0 : ( ruleSum ) ;
    public final void rule__Selector__SumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2272:1: ( ( ruleSum ) )
            // InternalCcsEclipse.g:2273:1: ( ruleSum )
            {
            // InternalCcsEclipse.g:2273:1: ( ruleSum )
            // InternalCcsEclipse.g:2274:1: ruleSum
            {
             before(grammarAccess.getSelectorAccess().getSumSumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSumSumParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SumAssignment_0"


    // $ANTLR start "rule__Rule__ImportAssignment_0_0"
    // InternalCcsEclipse.g:2283:1: rule__Rule__ImportAssignment_0_0 : ( ruleImport ) ;
    public final void rule__Rule__ImportAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2287:1: ( ( ruleImport ) )
            // InternalCcsEclipse.g:2288:1: ( ruleImport )
            {
            // InternalCcsEclipse.g:2288:1: ( ruleImport )
            // InternalCcsEclipse.g:2289:1: ruleImport
            {
             before(grammarAccess.getRuleAccess().getImportImportParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getImportImportParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ImportAssignment_0_0"


    // $ANTLR start "rule__Rule__ConstraintAssignment_0_1"
    // InternalCcsEclipse.g:2298:1: rule__Rule__ConstraintAssignment_0_1 : ( ruleConstraint ) ;
    public final void rule__Rule__ConstraintAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2302:1: ( ( ruleConstraint ) )
            // InternalCcsEclipse.g:2303:1: ( ruleConstraint )
            {
            // InternalCcsEclipse.g:2303:1: ( ruleConstraint )
            // InternalCcsEclipse.g:2304:1: ruleConstraint
            {
             before(grammarAccess.getRuleAccess().getConstraintConstraintParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConstraintConstraintParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConstraintAssignment_0_1"


    // $ANTLR start "rule__Rule__PropertyAssignment_0_2"
    // InternalCcsEclipse.g:2313:1: rule__Rule__PropertyAssignment_0_2 : ( ruleProperty ) ;
    public final void rule__Rule__PropertyAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2317:1: ( ( ruleProperty ) )
            // InternalCcsEclipse.g:2318:1: ( ruleProperty )
            {
            // InternalCcsEclipse.g:2318:1: ( ruleProperty )
            // InternalCcsEclipse.g:2319:1: ruleProperty
            {
             before(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PropertyAssignment_0_2"


    // $ANTLR start "rule__Rule__NestedAssignment_0_3"
    // InternalCcsEclipse.g:2328:1: rule__Rule__NestedAssignment_0_3 : ( ruleNested ) ;
    public final void rule__Rule__NestedAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2332:1: ( ( ruleNested ) )
            // InternalCcsEclipse.g:2333:1: ( ruleNested )
            {
            // InternalCcsEclipse.g:2333:1: ( ruleNested )
            // InternalCcsEclipse.g:2334:1: ruleNested
            {
             before(grammarAccess.getRuleAccess().getNestedNestedParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNested();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getNestedNestedParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NestedAssignment_0_3"


    // $ANTLR start "rule__Nested__SelectorAssignment_0"
    // InternalCcsEclipse.g:2343:1: rule__Nested__SelectorAssignment_0 : ( ruleSelector ) ;
    public final void rule__Nested__SelectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2347:1: ( ( ruleSelector ) )
            // InternalCcsEclipse.g:2348:1: ( ruleSelector )
            {
            // InternalCcsEclipse.g:2348:1: ( ruleSelector )
            // InternalCcsEclipse.g:2349:1: ruleSelector
            {
             before(grammarAccess.getNestedAccess().getSelectorSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getNestedAccess().getSelectorSelectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__SelectorAssignment_0"


    // $ANTLR start "rule__Nested__ImportAssignment_1_0_1_0"
    // InternalCcsEclipse.g:2358:1: rule__Nested__ImportAssignment_1_0_1_0 : ( ruleImport ) ;
    public final void rule__Nested__ImportAssignment_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2362:1: ( ( ruleImport ) )
            // InternalCcsEclipse.g:2363:1: ( ruleImport )
            {
            // InternalCcsEclipse.g:2363:1: ( ruleImport )
            // InternalCcsEclipse.g:2364:1: ruleImport
            {
             before(grammarAccess.getNestedAccess().getImportImportParserRuleCall_1_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getNestedAccess().getImportImportParserRuleCall_1_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__ImportAssignment_1_0_1_0"


    // $ANTLR start "rule__Nested__ConstraintAssignment_1_0_1_1"
    // InternalCcsEclipse.g:2373:1: rule__Nested__ConstraintAssignment_1_0_1_1 : ( ruleConstraint ) ;
    public final void rule__Nested__ConstraintAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2377:1: ( ( ruleConstraint ) )
            // InternalCcsEclipse.g:2378:1: ( ruleConstraint )
            {
            // InternalCcsEclipse.g:2378:1: ( ruleConstraint )
            // InternalCcsEclipse.g:2379:1: ruleConstraint
            {
             before(grammarAccess.getNestedAccess().getConstraintConstraintParserRuleCall_1_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getNestedAccess().getConstraintConstraintParserRuleCall_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__ConstraintAssignment_1_0_1_1"


    // $ANTLR start "rule__Nested__PropertyAssignment_1_0_1_2"
    // InternalCcsEclipse.g:2388:1: rule__Nested__PropertyAssignment_1_0_1_2 : ( ruleProperty ) ;
    public final void rule__Nested__PropertyAssignment_1_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2392:1: ( ( ruleProperty ) )
            // InternalCcsEclipse.g:2393:1: ( ruleProperty )
            {
            // InternalCcsEclipse.g:2393:1: ( ruleProperty )
            // InternalCcsEclipse.g:2394:1: ruleProperty
            {
             before(grammarAccess.getNestedAccess().getPropertyPropertyParserRuleCall_1_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getNestedAccess().getPropertyPropertyParserRuleCall_1_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__PropertyAssignment_1_0_1_2"


    // $ANTLR start "rule__Nested__RulesAssignment_1_1_1"
    // InternalCcsEclipse.g:2403:1: rule__Nested__RulesAssignment_1_1_1 : ( ruleRule ) ;
    public final void rule__Nested__RulesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2407:1: ( ( ruleRule ) )
            // InternalCcsEclipse.g:2408:1: ( ruleRule )
            {
            // InternalCcsEclipse.g:2408:1: ( ruleRule )
            // InternalCcsEclipse.g:2409:1: ruleRule
            {
             before(grammarAccess.getNestedAccess().getRulesRuleParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getNestedAccess().getRulesRuleParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nested__RulesAssignment_1_1_1"


    // $ANTLR start "rule__Modifier__OverrideAssignment"
    // InternalCcsEclipse.g:2418:1: rule__Modifier__OverrideAssignment : ( ( '@override' ) ) ;
    public final void rule__Modifier__OverrideAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2422:1: ( ( ( '@override' ) ) )
            // InternalCcsEclipse.g:2423:1: ( ( '@override' ) )
            {
            // InternalCcsEclipse.g:2423:1: ( ( '@override' ) )
            // InternalCcsEclipse.g:2424:1: ( '@override' )
            {
             before(grammarAccess.getModifierAccess().getOverrideOverrideKeyword_0()); 
            // InternalCcsEclipse.g:2425:1: ( '@override' )
            // InternalCcsEclipse.g:2426:1: '@override'
            {
             before(grammarAccess.getModifierAccess().getOverrideOverrideKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModifierAccess().getOverrideOverrideKeyword_0()); 

            }

             after(grammarAccess.getModifierAccess().getOverrideOverrideKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__OverrideAssignment"


    // $ANTLR start "rule__Property__ModifiersAssignment_0"
    // InternalCcsEclipse.g:2441:1: rule__Property__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Property__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2445:1: ( ( ruleModifier ) )
            // InternalCcsEclipse.g:2446:1: ( ruleModifier )
            {
            // InternalCcsEclipse.g:2446:1: ( ruleModifier )
            // InternalCcsEclipse.g:2447:1: ruleModifier
            {
             before(grammarAccess.getPropertyAccess().getModifiersModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getModifiersModifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ModifiersAssignment_0"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // InternalCcsEclipse.g:2456:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2460:1: ( ( RULE_ID ) )
            // InternalCcsEclipse.g:2461:1: ( RULE_ID )
            {
            // InternalCcsEclipse.g:2461:1: ( RULE_ID )
            // InternalCcsEclipse.g:2462:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__Property__ValueAssignment_3"
    // InternalCcsEclipse.g:2471:1: rule__Property__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__Property__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2475:1: ( ( ruleValue ) )
            // InternalCcsEclipse.g:2476:1: ( ruleValue )
            {
            // InternalCcsEclipse.g:2476:1: ( ruleValue )
            // InternalCcsEclipse.g:2477:1: ruleValue
            {
             before(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_3"


    // $ANTLR start "rule__Import__NameAssignment_1"
    // InternalCcsEclipse.g:2486:1: rule__Import__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCcsEclipse.g:2490:1: ( ( RULE_STRING ) )
            // InternalCcsEclipse.g:2491:1: ( RULE_STRING )
            {
            // InternalCcsEclipse.g:2491:1: ( RULE_STRING )
            // InternalCcsEclipse.g:2492:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000080C2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000190080C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000190080C2L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000019000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000194080C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000031F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});

}