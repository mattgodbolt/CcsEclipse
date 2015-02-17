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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEXINT", "RULE_NUMBER", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@override'", "'true'", "'false'", "'@context'", "'('", "')'", "';'", "'>'", "','", "':'", "'{'", "'}'", "'='", "'@constrain'", "'.'", "'/'", "'@import'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_HEXINT=4;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalCcsEclipseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCcsEclipseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCcsEclipseParser.tokenNames; }
    public String getGrammarFileName() { return "../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g"; }


     
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:60:1: entryRuleRuleSet : ruleRuleSet EOF ;
    public final void entryRuleRuleSet() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:61:1: ( ruleRuleSet EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:62:1: ruleRuleSet EOF
            {
             before(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet61);
            ruleRuleSet();

            state._fsp--;

             after(grammarAccess.getRuleSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet68); 

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
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:69:1: ruleRuleSet : ( ( rule__RuleSet__Group__0 ) ) ;
    public final void ruleRuleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:73:2: ( ( ( rule__RuleSet__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:74:1: ( ( rule__RuleSet__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:74:1: ( ( rule__RuleSet__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:75:1: ( rule__RuleSet__Group__0 )
            {
             before(grammarAccess.getRuleSetAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:76:1: ( rule__RuleSet__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:76:2: rule__RuleSet__Group__0
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__0_in_ruleRuleSet94);
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

        }
        return ;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleContext"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:88:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:89:1: ( ruleContext EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:90:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext121);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext128); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:97:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:101:2: ( ( ( rule__Context__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:102:1: ( ( rule__Context__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:102:1: ( ( rule__Context__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:103:1: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:104:1: ( rule__Context__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:104:2: rule__Context__Group__0
            {
            pushFollow(FOLLOW_rule__Context__Group__0_in_ruleContext154);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:116:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:117:1: ( ruleSelector EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:118:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector181);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector188); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:125:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:129:2: ( ( ( rule__Selector__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:130:1: ( ( rule__Selector__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:130:1: ( ( rule__Selector__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:131:1: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:132:1: ( rule__Selector__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:132:2: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_rule__Selector__Group__0_in_ruleSelector214);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:144:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:145:1: ( ruleSum EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:146:1: ruleSum EOF
            {
             before(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_ruleSum_in_entryRuleSum241);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSum248); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:153:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:157:2: ( ( ( rule__Sum__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:158:1: ( ( rule__Sum__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:158:1: ( ( rule__Sum__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:159:1: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:160:1: ( rule__Sum__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:160:2: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_rule__Sum__Group__0_in_ruleSum274);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:172:1: entryRuleProduct : ruleProduct EOF ;
    public final void entryRuleProduct() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:173:1: ( ruleProduct EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:174:1: ruleProduct EOF
            {
             before(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct301);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getProductRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct308); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:181:1: ruleProduct : ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) ) ;
    public final void ruleProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:185:2: ( ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:186:1: ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:186:1: ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:187:1: ( ( ruleTerm ) ) ( ( ruleTerm )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:187:1: ( ( ruleTerm ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:188:1: ( ruleTerm )
            {
             before(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:189:1: ( ruleTerm )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:189:3: ruleTerm
            {
            pushFollow(FOLLOW_ruleTerm_in_ruleProduct337);
            ruleTerm();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getTermParserRuleCall()); 

            }

            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:192:1: ( ( ruleTerm )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:193:1: ( ruleTerm )*
            {
             before(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:194:1: ( ruleTerm )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:194:3: ruleTerm
            	    {
            	    pushFollow(FOLLOW_ruleTerm_in_ruleProduct350);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:207:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:208:1: ( ruleTerm EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:209:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm380);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm387); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:216:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:220:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:221:1: ( ( rule__Term__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:221:1: ( ( rule__Term__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:222:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:223:1: ( rule__Term__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:223:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleTerm413);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:235:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:236:1: ( ruleStep EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:237:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep440);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep447); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:244:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:248:2: ( ( ( rule__Step__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:249:1: ( ( rule__Step__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:249:1: ( ( rule__Step__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:250:1: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:251:1: ( rule__Step__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:251:2: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_rule__Step__Alternatives_in_ruleStep473);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:263:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:264:1: ( ruleRule EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:265:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule500);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule507); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:272:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:276:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:277:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:277:1: ( ( rule__Rule__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:278:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:279:1: ( rule__Rule__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:279:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule533);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:291:1: entryRuleNested : ruleNested EOF ;
    public final void entryRuleNested() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:292:1: ( ruleNested EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:293:1: ruleNested EOF
            {
             before(grammarAccess.getNestedRule()); 
            pushFollow(FOLLOW_ruleNested_in_entryRuleNested560);
            ruleNested();

            state._fsp--;

             after(grammarAccess.getNestedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNested567); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:300:1: ruleNested : ( ( rule__Nested__Group__0 ) ) ;
    public final void ruleNested() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:304:2: ( ( ( rule__Nested__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:305:1: ( ( rule__Nested__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:305:1: ( ( rule__Nested__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:306:1: ( rule__Nested__Group__0 )
            {
             before(grammarAccess.getNestedAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:307:1: ( rule__Nested__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:307:2: rule__Nested__Group__0
            {
            pushFollow(FOLLOW_rule__Nested__Group__0_in_ruleNested593);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:319:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:320:1: ( ruleModifier EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:321:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier620);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier627); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:328:1: ruleModifier : ( ( '@override' )? ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:332:2: ( ( ( '@override' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:333:1: ( ( '@override' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:333:1: ( ( '@override' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:334:1: ( '@override' )?
            {
             before(grammarAccess.getModifierAccess().getOverrideKeyword()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:335:1: ( '@override' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:336:2: '@override'
                    {
                    match(input,13,FOLLOW_13_in_ruleModifier655); 

                    }
                    break;

            }

             after(grammarAccess.getModifierAccess().getOverrideKeyword()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:349:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:350:1: ( ruleProperty EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:351:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty685);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty692); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:358:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:362:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:363:1: ( ( rule__Property__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:363:1: ( ( rule__Property__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:364:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:365:1: ( rule__Property__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:365:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty718);
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


    // $ANTLR start "entryRulebool"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:377:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:378:1: ( rulebool EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:379:1: rulebool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_rulebool_in_entryRulebool745);
            rulebool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebool752); 

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
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:386:1: rulebool : ( ( rule__Bool__Alternatives ) ) ;
    public final void rulebool() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:390:2: ( ( ( rule__Bool__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:391:1: ( ( rule__Bool__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:391:1: ( ( rule__Bool__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:392:1: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:393:1: ( rule__Bool__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:393:2: rule__Bool__Alternatives
            {
            pushFollow(FOLLOW_rule__Bool__Alternatives_in_rulebool778);
            rule__Bool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getAlternatives()); 

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
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleValue"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:405:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:406:1: ( ruleValue EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:407:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue805);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue812); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:414:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:418:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:419:1: ( ( rule__Value__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:419:1: ( ( rule__Value__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:420:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:421:1: ( rule__Value__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:421:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue838);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:433:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:434:1: ( ruleConstraint EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:435:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint865);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint872); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:442:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:446:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:447:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:447:1: ( ( rule__Constraint__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:448:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:449:1: ( rule__Constraint__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:449:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint898);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:461:1: entryRuleSingleStep : ruleSingleStep EOF ;
    public final void entryRuleSingleStep() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:462:1: ( ruleSingleStep EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:463:1: ruleSingleStep EOF
            {
             before(grammarAccess.getSingleStepRule()); 
            pushFollow(FOLLOW_ruleSingleStep_in_entryRuleSingleStep925);
            ruleSingleStep();

            state._fsp--;

             after(grammarAccess.getSingleStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStep932); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:470:1: ruleSingleStep : ( ( rule__SingleStep__Group__0 ) ) ;
    public final void ruleSingleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:474:2: ( ( ( rule__SingleStep__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:475:1: ( ( rule__SingleStep__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:475:1: ( ( rule__SingleStep__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:476:1: ( rule__SingleStep__Group__0 )
            {
             before(grammarAccess.getSingleStepAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:477:1: ( rule__SingleStep__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:477:2: rule__SingleStep__Group__0
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__0_in_ruleSingleStep958);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:489:1: entryRuleIdent : ruleIdent EOF ;
    public final void entryRuleIdent() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:490:1: ( ruleIdent EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:491:1: ruleIdent EOF
            {
             before(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_ruleIdent_in_entryRuleIdent985);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getIdentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdent992); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:498:1: ruleIdent : ( ( rule__Ident__Alternatives ) ) ;
    public final void ruleIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:502:2: ( ( ( rule__Ident__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:503:1: ( ( rule__Ident__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:503:1: ( ( rule__Ident__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:504:1: ( rule__Ident__Alternatives )
            {
             before(grammarAccess.getIdentAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:505:1: ( rule__Ident__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:505:2: rule__Ident__Alternatives
            {
            pushFollow(FOLLOW_rule__Ident__Alternatives_in_ruleIdent1018);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:517:1: entryRuleVals : ruleVals EOF ;
    public final void entryRuleVals() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:518:1: ( ruleVals EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:519:1: ruleVals EOF
            {
             before(grammarAccess.getValsRule()); 
            pushFollow(FOLLOW_ruleVals_in_entryRuleVals1045);
            ruleVals();

            state._fsp--;

             after(grammarAccess.getValsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVals1052); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:526:1: ruleVals : ( ( rule__Vals__Group__0 ) ) ;
    public final void ruleVals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:530:2: ( ( ( rule__Vals__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:531:1: ( ( rule__Vals__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:531:1: ( ( rule__Vals__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:532:1: ( rule__Vals__Group__0 )
            {
             before(grammarAccess.getValsAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:533:1: ( rule__Vals__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:533:2: rule__Vals__Group__0
            {
            pushFollow(FOLLOW_rule__Vals__Group__0_in_ruleVals1078);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:545:1: entryRuleStepSuffix : ruleStepSuffix EOF ;
    public final void entryRuleStepSuffix() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:546:1: ( ruleStepSuffix EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:547:1: ruleStepSuffix EOF
            {
             before(grammarAccess.getStepSuffixRule()); 
            pushFollow(FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix1105);
            ruleStepSuffix();

            state._fsp--;

             after(grammarAccess.getStepSuffixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepSuffix1112); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:554:1: ruleStepSuffix : ( ( rule__StepSuffix__Group__0 ) ) ;
    public final void ruleStepSuffix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:558:2: ( ( ( rule__StepSuffix__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:559:1: ( ( rule__StepSuffix__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:559:1: ( ( rule__StepSuffix__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:560:1: ( rule__StepSuffix__Group__0 )
            {
             before(grammarAccess.getStepSuffixAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:561:1: ( rule__StepSuffix__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:561:2: rule__StepSuffix__Group__0
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__0_in_ruleStepSuffix1138);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:573:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:574:1: ( ruleImport EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:575:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1165);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1172); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:582:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:586:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:587:1: ( ( rule__Import__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:587:1: ( ( rule__Import__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:588:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:589:1: ( rule__Import__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:589:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport1198);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:601:1: rule__Step__Alternatives : ( ( ruleSingleStep ) | ( ( rule__Step__Group_1__0 ) ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:605:1: ( ( ruleSingleStep ) | ( ( rule__Step__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:606:1: ( ruleSingleStep )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:606:1: ( ruleSingleStep )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:607:1: ruleSingleStep
                    {
                     before(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleStep_in_rule__Step__Alternatives1234);
                    ruleSingleStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:612:6: ( ( rule__Step__Group_1__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:612:6: ( ( rule__Step__Group_1__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:613:1: ( rule__Step__Group_1__0 )
                    {
                     before(grammarAccess.getStepAccess().getGroup_1()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:614:1: ( rule__Step__Group_1__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:614:2: rule__Step__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Step__Group_1__0_in_rule__Step__Alternatives1251);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:623:1: rule__Rule__Alternatives_0 : ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) | ( ruleNested ) );
    public final void rule__Rule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:627:1: ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) | ( ruleNested ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                int LA4_4 = input.LA(2);

                if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)||LA4_4==17||(LA4_4>=20 && LA4_4<=23)||(LA4_4>=27 && LA4_4<=28)) ) {
                    alt4=4;
                }
                else if ( (LA4_4==25) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 17:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:628:1: ( ruleImport )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:628:1: ( ruleImport )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:629:1: ruleImport
                    {
                     before(grammarAccess.getRuleAccess().getImportParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__Rule__Alternatives_01284);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getImportParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:634:6: ( ruleConstraint )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:634:6: ( ruleConstraint )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:635:1: ruleConstraint
                    {
                     before(grammarAccess.getRuleAccess().getConstraintParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__Rule__Alternatives_01301);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getConstraintParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:640:6: ( ruleProperty )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:640:6: ( ruleProperty )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:641:1: ruleProperty
                    {
                     before(grammarAccess.getRuleAccess().getPropertyParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleProperty_in_rule__Rule__Alternatives_01318);
                    ruleProperty();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getPropertyParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:646:6: ( ruleNested )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:646:6: ( ruleNested )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:647:1: ruleNested
                    {
                     before(grammarAccess.getRuleAccess().getNestedParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleNested_in_rule__Rule__Alternatives_01335);
                    ruleNested();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getNestedParserRuleCall_0_3()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:657:1: rule__Nested__Alternatives_1 : ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) );
    public final void rule__Nested__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:661:1: ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:662:1: ( ( rule__Nested__Group_1_0__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:662:1: ( ( rule__Nested__Group_1_0__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:663:1: ( rule__Nested__Group_1_0__0 )
                    {
                     before(grammarAccess.getNestedAccess().getGroup_1_0()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:664:1: ( rule__Nested__Group_1_0__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:664:2: rule__Nested__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Nested__Group_1_0__0_in_rule__Nested__Alternatives_11367);
                    rule__Nested__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:668:6: ( ( rule__Nested__Group_1_1__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:668:6: ( ( rule__Nested__Group_1_1__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:669:1: ( rule__Nested__Group_1_1__0 )
                    {
                     before(grammarAccess.getNestedAccess().getGroup_1_1()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:670:1: ( rule__Nested__Group_1_1__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:670:2: rule__Nested__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Nested__Group_1_1__0_in_rule__Nested__Alternatives_11385);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:679:1: rule__Nested__Alternatives_1_0_1 : ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) );
    public final void rule__Nested__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:683:1: ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case EOF:
            case RULE_ID:
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:684:1: ( ruleImport )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:684:1: ( ruleImport )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:685:1: ruleImport
                    {
                     before(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__Nested__Alternatives_1_0_11418);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:690:6: ( ruleConstraint )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:690:6: ( ruleConstraint )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:691:1: ruleConstraint
                    {
                     before(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__Nested__Alternatives_1_0_11435);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:696:6: ( ruleProperty )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:696:6: ( ruleProperty )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:697:1: ruleProperty
                    {
                     before(grammarAccess.getNestedAccess().getPropertyParserRuleCall_1_0_1_2()); 
                    pushFollow(FOLLOW_ruleProperty_in_rule__Nested__Alternatives_1_0_11452);
                    ruleProperty();

                    state._fsp--;

                     after(grammarAccess.getNestedAccess().getPropertyParserRuleCall_1_0_1_2()); 

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


    // $ANTLR start "rule__Bool__Alternatives"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:707:1: rule__Bool__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:711:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:712:1: ( 'true' )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:712:1: ( 'true' )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:713:1: 'true'
                    {
                     before(grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__Bool__Alternatives1485); 
                     after(grammarAccess.getBoolAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:720:6: ( 'false' )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:720:6: ( 'false' )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:721:1: 'false'
                    {
                     before(grammarAccess.getBoolAccess().getFalseKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__Bool__Alternatives1505); 
                     after(grammarAccess.getBoolAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__Bool__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:733:1: rule__Value__Alternatives : ( ( RULE_HEXINT ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( rulebool ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:737:1: ( ( RULE_HEXINT ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( rulebool ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_HEXINT:
                {
                alt8=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            case 14:
            case 15:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:738:1: ( RULE_HEXINT )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:738:1: ( RULE_HEXINT )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:739:1: RULE_HEXINT
                    {
                     before(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_rule__Value__Alternatives1539); 
                     after(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:744:6: ( RULE_NUMBER )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:744:6: ( RULE_NUMBER )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:745:1: RULE_NUMBER
                    {
                     before(grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Value__Alternatives1556); 
                     after(grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:750:6: ( RULE_STRING )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:750:6: ( RULE_STRING )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:751:1: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives1573); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:756:6: ( rulebool )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:756:6: ( rulebool )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:757:1: rulebool
                    {
                     before(grammarAccess.getValueAccess().getBoolParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulebool_in_rule__Value__Alternatives1590);
                    rulebool();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBoolParserRuleCall_3()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:767:1: rule__Ident__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Ident__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:771:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:772:1: ( RULE_ID )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:772:1: ( RULE_ID )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:773:1: RULE_ID
                    {
                     before(grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ident__Alternatives1622); 
                     after(grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:778:6: ( RULE_STRING )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:778:6: ( RULE_STRING )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:779:1: RULE_STRING
                    {
                     before(grammarAccess.getIdentAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Ident__Alternatives1639); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:791:1: rule__RuleSet__Group__0 : rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 ;
    public final void rule__RuleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:795:1: ( rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:796:2: rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01669);
            rule__RuleSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01672);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:803:1: rule__RuleSet__Group__0__Impl : ( ( rule__RuleSet__ContextAssignment_0 )? ) ;
    public final void rule__RuleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:807:1: ( ( ( rule__RuleSet__ContextAssignment_0 )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:808:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:808:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:809:1: ( rule__RuleSet__ContextAssignment_0 )?
            {
             before(grammarAccess.getRuleSetAccess().getContextAssignment_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:810:1: ( rule__RuleSet__ContextAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:810:2: rule__RuleSet__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RuleSet__ContextAssignment_0_in_rule__RuleSet__Group__0__Impl1699);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:820:1: rule__RuleSet__Group__1 : rule__RuleSet__Group__1__Impl ;
    public final void rule__RuleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:824:1: ( rule__RuleSet__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:825:2: rule__RuleSet__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11730);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:831:1: rule__RuleSet__Group__1__Impl : ( ( rule__RuleSet__RulesAssignment_1 )* ) ;
    public final void rule__RuleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:835:1: ( ( ( rule__RuleSet__RulesAssignment_1 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:836:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:836:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:837:1: ( rule__RuleSet__RulesAssignment_1 )*
            {
             before(grammarAccess.getRuleSetAccess().getRulesAssignment_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:838:1: ( rule__RuleSet__RulesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)||LA11_0==13||LA11_0==17||LA11_0==26||LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:838:2: rule__RuleSet__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__RuleSet__RulesAssignment_1_in_rule__RuleSet__Group__1__Impl1757);
            	    rule__RuleSet__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:852:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:856:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:857:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01792);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01795);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:864:1: rule__Context__Group__0__Impl : ( '@context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:868:1: ( ( '@context' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:869:1: ( '@context' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:869:1: ( '@context' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:870:1: '@context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Context__Group__0__Impl1823); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:883:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:887:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:888:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11854);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11857);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:895:1: rule__Context__Group__1__Impl : ( '(' ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:899:1: ( ( '(' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:900:1: ( '(' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:900:1: ( '(' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:901:1: '('
            {
             before(grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Context__Group__1__Impl1885); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:914:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:918:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:919:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21916);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21919);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:926:1: rule__Context__Group__2__Impl : ( ( rule__Context__SelectorAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:930:1: ( ( ( rule__Context__SelectorAssignment_2 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:931:1: ( ( rule__Context__SelectorAssignment_2 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:931:1: ( ( rule__Context__SelectorAssignment_2 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:932:1: ( rule__Context__SelectorAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getSelectorAssignment_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:933:1: ( rule__Context__SelectorAssignment_2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:933:2: rule__Context__SelectorAssignment_2
            {
            pushFollow(FOLLOW_rule__Context__SelectorAssignment_2_in_rule__Context__Group__2__Impl1946);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:943:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:947:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:948:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__31976);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__4_in_rule__Context__Group__31979);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:955:1: rule__Context__Group__3__Impl : ( ')' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:959:1: ( ( ')' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:960:1: ( ')' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:960:1: ( ')' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:961:1: ')'
            {
             before(grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Context__Group__3__Impl2007); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:974:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:978:1: ( rule__Context__Group__4__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:979:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__42038);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:985:1: rule__Context__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:989:1: ( ( ( ';' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:990:1: ( ( ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:990:1: ( ( ';' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:991:1: ( ';' )?
            {
             before(grammarAccess.getContextAccess().getSemicolonKeyword_4()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:992:1: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:993:2: ';'
                    {
                    match(input,19,FOLLOW_19_in_rule__Context__Group__4__Impl2067); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1014:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1018:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1019:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__02110);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__02113);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1026:1: rule__Selector__Group__0__Impl : ( ruleSum ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1030:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1031:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1031:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1032:1: ruleSum
            {
             before(grammarAccess.getSelectorAccess().getSumParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSum_in_rule__Selector__Group__0__Impl2140);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSumParserRuleCall_0()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1043:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1047:1: ( rule__Selector__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1048:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__12169);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1054:1: rule__Selector__Group__1__Impl : ( ( '>' )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1058:1: ( ( ( '>' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1059:1: ( ( '>' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1059:1: ( ( '>' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1060:1: ( '>' )?
            {
             before(grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1061:1: ( '>' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1062:2: '>'
                    {
                    match(input,20,FOLLOW_20_in_rule__Selector__Group__1__Impl2198); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1077:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1081:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1082:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__02235);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__02238);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1089:1: rule__Sum__Group__0__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1093:1: ( ( ruleProduct ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1094:1: ( ruleProduct )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1094:1: ( ruleProduct )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1095:1: ruleProduct
            {
             before(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProduct_in_rule__Sum__Group__0__Impl2265);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1106:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1110:1: ( rule__Sum__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1111:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__12294);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1117:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1121:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1122:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1122:1: ( ( rule__Sum__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1123:1: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1124:1: ( rule__Sum__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1124:2: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Sum__Group_1__0_in_rule__Sum__Group__1__Impl2321);
            	    rule__Sum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1138:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1142:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1143:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_rule__Sum__Group_1__0__Impl_in_rule__Sum__Group_1__02356);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sum__Group_1__1_in_rule__Sum__Group_1__02359);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1150:1: rule__Sum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1154:1: ( ( ',' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1155:1: ( ',' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1155:1: ( ',' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1156:1: ','
            {
             before(grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Sum__Group_1__0__Impl2387); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1169:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1173:1: ( rule__Sum__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1174:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sum__Group_1__1__Impl_in_rule__Sum__Group_1__12418);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1180:1: rule__Sum__Group_1__1__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1184:1: ( ( ruleProduct ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1185:1: ( ruleProduct )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1185:1: ( ruleProduct )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1186:1: ruleProduct
            {
             before(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleProduct_in_rule__Sum__Group_1__1__Impl2445);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1201:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1205:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1206:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02478);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02481);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1213:1: rule__Term__Group__0__Impl : ( ruleStep ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1217:1: ( ( ruleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1218:1: ( ruleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1218:1: ( ruleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1219:1: ruleStep
            {
             before(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Term__Group__0__Impl2508);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1230:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1234:1: ( rule__Term__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1235:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12537);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1241:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1245:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1246:1: ( ( rule__Term__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1246:1: ( ( rule__Term__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1247:1: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1248:1: ( rule__Term__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    int LA15_2 = input.LA(2);

                    if ( ((LA15_2>=RULE_STRING && LA15_2<=RULE_ID)||LA15_2==17) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1248:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl2564);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1262:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1266:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1267:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__02599);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__02602);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1274:1: rule__Term__Group_1__0__Impl : ( '>' ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1278:1: ( ( '>' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1279:1: ( '>' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1279:1: ( '>' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1280:1: '>'
            {
             before(grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Term__Group_1__0__Impl2630); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1293:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1297:1: ( rule__Term__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1298:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__12661);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1304:1: rule__Term__Group_1__1__Impl : ( ruleStep ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1308:1: ( ( ruleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1309:1: ( ruleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1309:1: ( ruleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1310:1: ruleStep
            {
             before(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Term__Group_1__1__Impl2688);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1325:1: rule__Step__Group_1__0 : rule__Step__Group_1__0__Impl rule__Step__Group_1__1 ;
    public final void rule__Step__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1329:1: ( rule__Step__Group_1__0__Impl rule__Step__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1330:2: rule__Step__Group_1__0__Impl rule__Step__Group_1__1
            {
            pushFollow(FOLLOW_rule__Step__Group_1__0__Impl_in_rule__Step__Group_1__02721);
            rule__Step__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_1__1_in_rule__Step__Group_1__02724);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1337:1: rule__Step__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Step__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1341:1: ( ( '(' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1342:1: ( '(' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1342:1: ( '(' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1343:1: '('
            {
             before(grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Step__Group_1__0__Impl2752); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1356:1: rule__Step__Group_1__1 : rule__Step__Group_1__1__Impl rule__Step__Group_1__2 ;
    public final void rule__Step__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1360:1: ( rule__Step__Group_1__1__Impl rule__Step__Group_1__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1361:2: rule__Step__Group_1__1__Impl rule__Step__Group_1__2
            {
            pushFollow(FOLLOW_rule__Step__Group_1__1__Impl_in_rule__Step__Group_1__12783);
            rule__Step__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_1__2_in_rule__Step__Group_1__12786);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1368:1: rule__Step__Group_1__1__Impl : ( ruleSum ) ;
    public final void rule__Step__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1372:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1373:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1373:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1374:1: ruleSum
            {
             before(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSum_in_rule__Step__Group_1__1__Impl2813);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1385:1: rule__Step__Group_1__2 : rule__Step__Group_1__2__Impl ;
    public final void rule__Step__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1389:1: ( rule__Step__Group_1__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1390:2: rule__Step__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group_1__2__Impl_in_rule__Step__Group_1__22842);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1396:1: rule__Step__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Step__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1400:1: ( ( ')' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1401:1: ( ')' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1401:1: ( ')' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1402:1: ')'
            {
             before(grammarAccess.getStepAccess().getRightParenthesisKeyword_1_2()); 
            match(input,18,FOLLOW_18_in_rule__Step__Group_1__2__Impl2870); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1421:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1425:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1426:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02907);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02910);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1433:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Alternatives_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1437:1: ( ( ( rule__Rule__Alternatives_0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1438:1: ( ( rule__Rule__Alternatives_0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1438:1: ( ( rule__Rule__Alternatives_0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1439:1: ( rule__Rule__Alternatives_0 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1440:1: ( rule__Rule__Alternatives_0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1440:2: rule__Rule__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl2937);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1450:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1454:1: ( rule__Rule__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1455:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12967);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1461:1: rule__Rule__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1465:1: ( ( ( ';' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1466:1: ( ( ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1466:1: ( ( ';' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1467:1: ( ';' )?
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1468:1: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1469:2: ';'
                    {
                    match(input,19,FOLLOW_19_in_rule__Rule__Group__1__Impl2996); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1484:1: rule__Nested__Group__0 : rule__Nested__Group__0__Impl rule__Nested__Group__1 ;
    public final void rule__Nested__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1488:1: ( rule__Nested__Group__0__Impl rule__Nested__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1489:2: rule__Nested__Group__0__Impl rule__Nested__Group__1
            {
            pushFollow(FOLLOW_rule__Nested__Group__0__Impl_in_rule__Nested__Group__03033);
            rule__Nested__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group__1_in_rule__Nested__Group__03036);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1496:1: rule__Nested__Group__0__Impl : ( ruleSelector ) ;
    public final void rule__Nested__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1500:1: ( ( ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1501:1: ( ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1501:1: ( ruleSelector )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1502:1: ruleSelector
            {
             before(grammarAccess.getNestedAccess().getSelectorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__Nested__Group__0__Impl3063);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getNestedAccess().getSelectorParserRuleCall_0()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1513:1: rule__Nested__Group__1 : rule__Nested__Group__1__Impl ;
    public final void rule__Nested__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1517:1: ( rule__Nested__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1518:2: rule__Nested__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group__1__Impl_in_rule__Nested__Group__13092);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1524:1: rule__Nested__Group__1__Impl : ( ( rule__Nested__Alternatives_1 ) ) ;
    public final void rule__Nested__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1528:1: ( ( ( rule__Nested__Alternatives_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1529:1: ( ( rule__Nested__Alternatives_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1529:1: ( ( rule__Nested__Alternatives_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1530:1: ( rule__Nested__Alternatives_1 )
            {
             before(grammarAccess.getNestedAccess().getAlternatives_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1531:1: ( rule__Nested__Alternatives_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1531:2: rule__Nested__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Nested__Alternatives_1_in_rule__Nested__Group__1__Impl3119);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1545:1: rule__Nested__Group_1_0__0 : rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 ;
    public final void rule__Nested__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1549:1: ( rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1550:2: rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_0__0__Impl_in_rule__Nested__Group_1_0__03153);
            rule__Nested__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_0__1_in_rule__Nested__Group_1_0__03156);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1557:1: rule__Nested__Group_1_0__0__Impl : ( ':' ) ;
    public final void rule__Nested__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1561:1: ( ( ':' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1562:1: ( ':' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1562:1: ( ':' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1563:1: ':'
            {
             before(grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
            match(input,22,FOLLOW_22_in_rule__Nested__Group_1_0__0__Impl3184); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1576:1: rule__Nested__Group_1_0__1 : rule__Nested__Group_1_0__1__Impl ;
    public final void rule__Nested__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1580:1: ( rule__Nested__Group_1_0__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1581:2: rule__Nested__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_0__1__Impl_in_rule__Nested__Group_1_0__13215);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1587:1: rule__Nested__Group_1_0__1__Impl : ( ( rule__Nested__Alternatives_1_0_1 ) ) ;
    public final void rule__Nested__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1591:1: ( ( ( rule__Nested__Alternatives_1_0_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1592:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1592:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1593:1: ( rule__Nested__Alternatives_1_0_1 )
            {
             before(grammarAccess.getNestedAccess().getAlternatives_1_0_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1594:1: ( rule__Nested__Alternatives_1_0_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1594:2: rule__Nested__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__Nested__Alternatives_1_0_1_in_rule__Nested__Group_1_0__1__Impl3242);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1608:1: rule__Nested__Group_1_1__0 : rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 ;
    public final void rule__Nested__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1612:1: ( rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1613:2: rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__0__Impl_in_rule__Nested__Group_1_1__03276);
            rule__Nested__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_1__1_in_rule__Nested__Group_1_1__03279);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1620:1: rule__Nested__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__Nested__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1624:1: ( ( '{' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1625:1: ( '{' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1625:1: ( '{' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1626:1: '{'
            {
             before(grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Nested__Group_1_1__0__Impl3307); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1639:1: rule__Nested__Group_1_1__1 : rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 ;
    public final void rule__Nested__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1643:1: ( rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1644:2: rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__1__Impl_in_rule__Nested__Group_1_1__13338);
            rule__Nested__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_1__2_in_rule__Nested__Group_1_1__13341);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1651:1: rule__Nested__Group_1_1__1__Impl : ( ( ruleRule )* ) ;
    public final void rule__Nested__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1655:1: ( ( ( ruleRule )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1656:1: ( ( ruleRule )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1656:1: ( ( ruleRule )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1657:1: ( ruleRule )*
            {
             before(grammarAccess.getNestedAccess().getRuleParserRuleCall_1_1_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1658:1: ( ruleRule )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==EOF||(LA17_0>=RULE_STRING && LA17_0<=RULE_ID)||LA17_0==13||LA17_0==17||LA17_0==26||LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1658:3: ruleRule
            	    {
            	    pushFollow(FOLLOW_ruleRule_in_rule__Nested__Group_1_1__1__Impl3369);
            	    ruleRule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNestedAccess().getRuleParserRuleCall_1_1_1()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1668:1: rule__Nested__Group_1_1__2 : rule__Nested__Group_1_1__2__Impl ;
    public final void rule__Nested__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1672:1: ( rule__Nested__Group_1_1__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1673:2: rule__Nested__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__2__Impl_in_rule__Nested__Group_1_1__23400);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1679:1: rule__Nested__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__Nested__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1683:1: ( ( '}' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1684:1: ( '}' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1684:1: ( '}' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1685:1: '}'
            {
             before(grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 
            match(input,24,FOLLOW_24_in_rule__Nested__Group_1_1__2__Impl3428); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1704:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1708:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1709:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03465);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03468);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1716:1: rule__Property__Group__0__Impl : ( ruleModifier ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1720:1: ( ( ruleModifier ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1721:1: ( ruleModifier )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1721:1: ( ruleModifier )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1722:1: ruleModifier
            {
             before(grammarAccess.getPropertyAccess().getModifierParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__Property__Group__0__Impl3495);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getModifierParserRuleCall_0()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1733:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1737:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1738:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13524);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13527);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1745:1: rule__Property__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1749:1: ( ( RULE_ID ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1750:1: ( RULE_ID )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1750:1: ( RULE_ID )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1751:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__Group__1__Impl3554); 
             after(grammarAccess.getPropertyAccess().getIDTerminalRuleCall_1()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1762:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1766:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1767:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23583);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__23586);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1774:1: rule__Property__Group__2__Impl : ( '=' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1778:1: ( ( '=' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1779:1: ( '=' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1779:1: ( '=' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1780:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Property__Group__2__Impl3614); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1793:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1797:1: ( rule__Property__Group__3__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1798:2: rule__Property__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__33645);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1804:1: rule__Property__Group__3__Impl : ( ruleValue ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1808:1: ( ( ruleValue ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1809:1: ( ruleValue )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1809:1: ( ruleValue )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1810:1: ruleValue
            {
             before(grammarAccess.getPropertyAccess().getValueParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Property__Group__3__Impl3672);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValueParserRuleCall_3()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1829:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1833:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1834:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03709);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03712);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1841:1: rule__Constraint__Group__0__Impl : ( '@constrain' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1845:1: ( ( '@constrain' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1846:1: ( '@constrain' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1846:1: ( '@constrain' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1847:1: '@constrain'
            {
             before(grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Constraint__Group__0__Impl3740); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1860:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1864:1: ( rule__Constraint__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1865:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13771);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1871:1: rule__Constraint__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1875:1: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1876:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1876:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1877:1: ruleSingleStep
            {
             before(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleStep_in_rule__Constraint__Group__1__Impl3798);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1892:1: rule__SingleStep__Group__0 : rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 ;
    public final void rule__SingleStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1896:1: ( rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1897:2: rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__0__Impl_in_rule__SingleStep__Group__03831);
            rule__SingleStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStep__Group__1_in_rule__SingleStep__Group__03834);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1904:1: rule__SingleStep__Group__0__Impl : ( ruleIdent ) ;
    public final void rule__SingleStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1908:1: ( ( ruleIdent ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1909:1: ( ruleIdent )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1909:1: ( ruleIdent )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1910:1: ruleIdent
            {
             before(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleIdent_in_rule__SingleStep__Group__0__Impl3861);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1921:1: rule__SingleStep__Group__1 : rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 ;
    public final void rule__SingleStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1925:1: ( rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1926:2: rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__1__Impl_in_rule__SingleStep__Group__13890);
            rule__SingleStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStep__Group__2_in_rule__SingleStep__Group__13893);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1933:1: rule__SingleStep__Group__1__Impl : ( ( ruleVals )? ) ;
    public final void rule__SingleStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1937:1: ( ( ( ruleVals )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1938:1: ( ( ruleVals )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1938:1: ( ( ruleVals )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1939:1: ( ruleVals )?
            {
             before(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1940:1: ( ruleVals )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1940:3: ruleVals
                    {
                    pushFollow(FOLLOW_ruleVals_in_rule__SingleStep__Group__1__Impl3921);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1950:1: rule__SingleStep__Group__2 : rule__SingleStep__Group__2__Impl ;
    public final void rule__SingleStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1954:1: ( rule__SingleStep__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1955:2: rule__SingleStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__2__Impl_in_rule__SingleStep__Group__23952);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1961:1: rule__SingleStep__Group__2__Impl : ( ( ruleStepSuffix )? ) ;
    public final void rule__SingleStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1965:1: ( ( ( ruleStepSuffix )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1966:1: ( ( ruleStepSuffix )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1966:1: ( ( ruleStepSuffix )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1967:1: ( ruleStepSuffix )?
            {
             before(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1968:1: ( ruleStepSuffix )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1968:3: ruleStepSuffix
                    {
                    pushFollow(FOLLOW_ruleStepSuffix_in_rule__SingleStep__Group__2__Impl3980);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1984:1: rule__Vals__Group__0 : rule__Vals__Group__0__Impl rule__Vals__Group__1 ;
    public final void rule__Vals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1988:1: ( rule__Vals__Group__0__Impl rule__Vals__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1989:2: rule__Vals__Group__0__Impl rule__Vals__Group__1
            {
            pushFollow(FOLLOW_rule__Vals__Group__0__Impl_in_rule__Vals__Group__04017);
            rule__Vals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vals__Group__1_in_rule__Vals__Group__04020);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1996:1: rule__Vals__Group__0__Impl : ( '.' ) ;
    public final void rule__Vals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2000:1: ( ( '.' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2001:1: ( '.' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2001:1: ( '.' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2002:1: '.'
            {
             before(grammarAccess.getValsAccess().getFullStopKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Vals__Group__0__Impl4048); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2015:1: rule__Vals__Group__1 : rule__Vals__Group__1__Impl rule__Vals__Group__2 ;
    public final void rule__Vals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2019:1: ( rule__Vals__Group__1__Impl rule__Vals__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2020:2: rule__Vals__Group__1__Impl rule__Vals__Group__2
            {
            pushFollow(FOLLOW_rule__Vals__Group__1__Impl_in_rule__Vals__Group__14079);
            rule__Vals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vals__Group__2_in_rule__Vals__Group__14082);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2027:1: rule__Vals__Group__1__Impl : ( ruleIdent ) ;
    public final void rule__Vals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2031:1: ( ( ruleIdent ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2032:1: ( ruleIdent )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2032:1: ( ruleIdent )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2033:1: ruleIdent
            {
             before(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleIdent_in_rule__Vals__Group__1__Impl4109);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2044:1: rule__Vals__Group__2 : rule__Vals__Group__2__Impl ;
    public final void rule__Vals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2048:1: ( rule__Vals__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2049:2: rule__Vals__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Vals__Group__2__Impl_in_rule__Vals__Group__24138);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2055:1: rule__Vals__Group__2__Impl : ( ( ruleVals )* ) ;
    public final void rule__Vals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2059:1: ( ( ( ruleVals )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2060:1: ( ( ruleVals )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2060:1: ( ( ruleVals )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2061:1: ( ruleVals )*
            {
             before(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2062:1: ( ruleVals )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2062:3: ruleVals
            	    {
            	    pushFollow(FOLLOW_ruleVals_in_rule__Vals__Group__2__Impl4166);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2078:1: rule__StepSuffix__Group__0 : rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 ;
    public final void rule__StepSuffix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2082:1: ( rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2083:2: rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__0__Impl_in_rule__StepSuffix__Group__04203);
            rule__StepSuffix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StepSuffix__Group__1_in_rule__StepSuffix__Group__04206);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2090:1: rule__StepSuffix__Group__0__Impl : ( '/' ) ;
    public final void rule__StepSuffix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2094:1: ( ( '/' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2095:1: ( '/' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2095:1: ( '/' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2096:1: '/'
            {
             before(grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__StepSuffix__Group__0__Impl4234); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2109:1: rule__StepSuffix__Group__1 : rule__StepSuffix__Group__1__Impl ;
    public final void rule__StepSuffix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2113:1: ( rule__StepSuffix__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2114:2: rule__StepSuffix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__1__Impl_in_rule__StepSuffix__Group__14265);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2120:1: rule__StepSuffix__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__StepSuffix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2124:1: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2125:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2125:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2126:1: ruleSingleStep
            {
             before(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleStep_in_rule__StepSuffix__Group__1__Impl4292);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2141:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2145:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2146:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04325);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04328);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2153:1: rule__Import__Group__0__Impl : ( '@import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2157:1: ( ( '@import' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2158:1: ( '@import' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2158:1: ( '@import' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2159:1: '@import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Import__Group__0__Impl4356); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2172:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2176:1: ( rule__Import__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2177:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14387);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2183:1: rule__Import__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2187:1: ( ( RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2188:1: ( RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2188:1: ( RULE_STRING )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2189:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__Group__1__Impl4414); 
             after(grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_1()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2205:1: rule__RuleSet__ContextAssignment_0 : ( ruleContext ) ;
    public final void rule__RuleSet__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2209:1: ( ( ruleContext ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2210:1: ( ruleContext )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2210:1: ( ruleContext )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2211:1: ruleContext
            {
             before(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleContext_in_rule__RuleSet__ContextAssignment_04452);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2220:1: rule__RuleSet__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__RuleSet__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2224:1: ( ( ruleRule ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2225:1: ( ruleRule )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2225:1: ( ruleRule )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2226:1: ruleRule
            {
             before(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__RuleSet__RulesAssignment_14483);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2235:1: rule__Context__SelectorAssignment_2 : ( ruleSelector ) ;
    public final void rule__Context__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2239:1: ( ( ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2240:1: ( ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2240:1: ( ruleSelector )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2241:1: ruleSelector
            {
             before(grammarAccess.getContextAccess().getSelectorSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__Context__SelectorAssignment_24514);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__0_in_ruleRuleSet94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0_in_ruleContext154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0_in_ruleSelector214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_entryRuleSum241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSum248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__0_in_ruleSum274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct337 = new BitSet(new long[]{0x00000000000200C2L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct350 = new BitSet(new long[]{0x00000000000200C2L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Alternatives_in_ruleStep473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_entryRuleNested560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNested567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__0_in_ruleNested593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleModifier655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebool_in_entryRulebool745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebool752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Alternatives_in_rulebool778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_entryRuleSingleStep925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStep932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__0_in_ruleSingleStep958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_entryRuleIdent985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdent992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ident__Alternatives_in_ruleIdent1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_entryRuleVals1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVals1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__0_in_ruleVals1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepSuffix1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__0_in_ruleStepSuffix1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__Step__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__0_in_rule__Step__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Rule__Alternatives_01284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Rule__Alternatives_01301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Rule__Alternatives_01318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_rule__Rule__Alternatives_01335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__0_in_rule__Nested__Alternatives_11367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__0_in_rule__Nested__Alternatives_11385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Nested__Alternatives_1_0_11418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Nested__Alternatives_1_0_11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Nested__Alternatives_1_0_11452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Bool__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Bool__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_rule__Value__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Value__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebool_in_rule__Value__Alternatives1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ident__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Ident__Alternatives1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01669 = new BitSet(new long[]{0x00000000240220C0L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__ContextAssignment_0_in_rule__RuleSet__Group__0__Impl1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__RulesAssignment_1_in_rule__RuleSet__Group__1__Impl1757 = new BitSet(new long[]{0x00000000240220C2L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01792 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Context__Group__0__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11854 = new BitSet(new long[]{0x00000000240220C0L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Context__Group__1__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21916 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__SelectorAssignment_2_in_rule__Context__Group__2__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__31976 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Context__Group__4_in_rule__Context__Group__31979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Context__Group__3__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__42038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Context__Group__4__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__02110 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__02113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Selector__Group__0__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__12169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Selector__Group__1__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__02235 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__02238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Sum__Group__0__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__12294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__0_in_rule__Sum__Group__1__Impl2321 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__0__Impl_in_rule__Sum__Group_1__02356 = new BitSet(new long[]{0x00000000240220C0L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__1_in_rule__Sum__Group_1__02359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Sum__Group_1__0__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__1__Impl_in_rule__Sum__Group_1__12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Sum__Group_1__1__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02478 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Term__Group__0__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl2564 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__02599 = new BitSet(new long[]{0x00000000000200C0L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__02602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Term__Group_1__0__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Term__Group_1__1__Impl2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__0__Impl_in_rule__Step__Group_1__02721 = new BitSet(new long[]{0x00000000240220C0L});
    public static final BitSet FOLLOW_rule__Step__Group_1__1_in_rule__Step__Group_1__02724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Step__Group_1__0__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__1__Impl_in_rule__Step__Group_1__12783 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Step__Group_1__2_in_rule__Step__Group_1__12786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Step__Group_1__1__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__2__Impl_in_rule__Step__Group_1__22842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Step__Group_1__2__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02907 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Rule__Group__1__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__0__Impl_in_rule__Nested__Group__03033 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Nested__Group__1_in_rule__Nested__Group__03036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__Nested__Group__0__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__1__Impl_in_rule__Nested__Group__13092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Alternatives_1_in_rule__Nested__Group__1__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__0__Impl_in_rule__Nested__Group_1_0__03153 = new BitSet(new long[]{0x0000000024002000L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__1_in_rule__Nested__Group_1_0__03156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Nested__Group_1_0__0__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__1__Impl_in_rule__Nested__Group_1_0__13215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Alternatives_1_0_1_in_rule__Nested__Group_1_0__1__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__0__Impl_in_rule__Nested__Group_1_1__03276 = new BitSet(new long[]{0x00000000250220C0L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__1_in_rule__Nested__Group_1_1__03279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Nested__Group_1_1__0__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__1__Impl_in_rule__Nested__Group_1_1__13338 = new BitSet(new long[]{0x00000000250220C0L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__2_in_rule__Nested__Group_1_1__13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Nested__Group_1_1__1__Impl3369 = new BitSet(new long[]{0x00000000240220C2L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__2__Impl_in_rule__Nested__Group_1_1__23400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Nested__Group_1_1__2__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03465 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Property__Group__0__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13524 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__Group__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23583 = new BitSet(new long[]{0x000000000000C070L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__23586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Property__Group__2__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__33645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Property__Group__3__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03709 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Constraint__Group__0__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__Constraint__Group__1__Impl3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__0__Impl_in_rule__SingleStep__Group__03831 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__1_in_rule__SingleStep__Group__03834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_rule__SingleStep__Group__0__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__1__Impl_in_rule__SingleStep__Group__13890 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__2_in_rule__SingleStep__Group__13893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_rule__SingleStep__Group__1__Impl3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__2__Impl_in_rule__SingleStep__Group__23952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_rule__SingleStep__Group__2__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__0__Impl_in_rule__Vals__Group__04017 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Vals__Group__1_in_rule__Vals__Group__04020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Vals__Group__0__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__1__Impl_in_rule__Vals__Group__14079 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Vals__Group__2_in_rule__Vals__Group__14082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_rule__Vals__Group__1__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__2__Impl_in_rule__Vals__Group__24138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_rule__Vals__Group__2__Impl4166 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__0__Impl_in_rule__StepSuffix__Group__04203 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__1_in_rule__StepSuffix__Group__04206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StepSuffix__Group__0__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__1__Impl_in_rule__StepSuffix__Group__14265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__StepSuffix__Group__1__Impl4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04325 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Import__Group__0__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__Group__1__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_rule__RuleSet__ContextAssignment_04452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleSet__RulesAssignment_14483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__Context__SelectorAssignment_24514 = new BitSet(new long[]{0x0000000000000002L});

}