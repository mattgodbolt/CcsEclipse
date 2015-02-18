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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEXINT", "RULE_NUMBER", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'@context'", "'('", "')'", "';'", "'>'", "','", "':'", "'{'", "'}'", "'='", "'@constrain'", "'.'", "'/'", "'@import'", "'@override'"
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

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)||LA1_0==16) ) {
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:328:1: ruleModifier : ( ( rule__Modifier__OverrideAssignment ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:332:2: ( ( ( rule__Modifier__OverrideAssignment ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:333:1: ( ( rule__Modifier__OverrideAssignment ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:333:1: ( ( rule__Modifier__OverrideAssignment ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:334:1: ( rule__Modifier__OverrideAssignment )
            {
             before(grammarAccess.getModifierAccess().getOverrideAssignment()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:335:1: ( rule__Modifier__OverrideAssignment )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:335:2: rule__Modifier__OverrideAssignment
            {
            pushFollow(FOLLOW_rule__Modifier__OverrideAssignment_in_ruleModifier653);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:347:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:348:1: ( ruleProperty EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:349:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty680);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty687); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:356:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:360:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:361:1: ( ( rule__Property__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:361:1: ( ( rule__Property__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:362:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:363:1: ( rule__Property__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:363:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty713);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:375:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:376:1: ( ruleBoolean EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:377:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean740);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean747); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:384:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:388:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:389:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:389:1: ( ( rule__Boolean__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:390:1: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:391:1: ( rule__Boolean__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:391:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean773);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:403:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:404:1: ( ruleValue EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:405:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue800);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue807); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:412:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:416:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:417:1: ( ( rule__Value__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:417:1: ( ( rule__Value__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:418:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:419:1: ( rule__Value__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:419:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue833);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:431:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:432:1: ( ruleConstraint EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:433:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint860);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint867); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:440:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:444:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:445:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:445:1: ( ( rule__Constraint__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:446:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:447:1: ( rule__Constraint__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:447:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint893);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:459:1: entryRuleSingleStep : ruleSingleStep EOF ;
    public final void entryRuleSingleStep() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:460:1: ( ruleSingleStep EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:461:1: ruleSingleStep EOF
            {
             before(grammarAccess.getSingleStepRule()); 
            pushFollow(FOLLOW_ruleSingleStep_in_entryRuleSingleStep920);
            ruleSingleStep();

            state._fsp--;

             after(grammarAccess.getSingleStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStep927); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:468:1: ruleSingleStep : ( ( rule__SingleStep__Group__0 ) ) ;
    public final void ruleSingleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:472:2: ( ( ( rule__SingleStep__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:473:1: ( ( rule__SingleStep__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:473:1: ( ( rule__SingleStep__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:474:1: ( rule__SingleStep__Group__0 )
            {
             before(grammarAccess.getSingleStepAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:475:1: ( rule__SingleStep__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:475:2: rule__SingleStep__Group__0
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__0_in_ruleSingleStep953);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:487:1: entryRuleIdent : ruleIdent EOF ;
    public final void entryRuleIdent() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:488:1: ( ruleIdent EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:489:1: ruleIdent EOF
            {
             before(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_ruleIdent_in_entryRuleIdent980);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getIdentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdent987); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:496:1: ruleIdent : ( ( rule__Ident__Alternatives ) ) ;
    public final void ruleIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:500:2: ( ( ( rule__Ident__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:501:1: ( ( rule__Ident__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:501:1: ( ( rule__Ident__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:502:1: ( rule__Ident__Alternatives )
            {
             before(grammarAccess.getIdentAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:503:1: ( rule__Ident__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:503:2: rule__Ident__Alternatives
            {
            pushFollow(FOLLOW_rule__Ident__Alternatives_in_ruleIdent1013);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:515:1: entryRuleVals : ruleVals EOF ;
    public final void entryRuleVals() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:516:1: ( ruleVals EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:517:1: ruleVals EOF
            {
             before(grammarAccess.getValsRule()); 
            pushFollow(FOLLOW_ruleVals_in_entryRuleVals1040);
            ruleVals();

            state._fsp--;

             after(grammarAccess.getValsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVals1047); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:524:1: ruleVals : ( ( rule__Vals__Group__0 ) ) ;
    public final void ruleVals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:528:2: ( ( ( rule__Vals__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:529:1: ( ( rule__Vals__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:529:1: ( ( rule__Vals__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:530:1: ( rule__Vals__Group__0 )
            {
             before(grammarAccess.getValsAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:531:1: ( rule__Vals__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:531:2: rule__Vals__Group__0
            {
            pushFollow(FOLLOW_rule__Vals__Group__0_in_ruleVals1073);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:543:1: entryRuleStepSuffix : ruleStepSuffix EOF ;
    public final void entryRuleStepSuffix() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:544:1: ( ruleStepSuffix EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:545:1: ruleStepSuffix EOF
            {
             before(grammarAccess.getStepSuffixRule()); 
            pushFollow(FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix1100);
            ruleStepSuffix();

            state._fsp--;

             after(grammarAccess.getStepSuffixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepSuffix1107); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:552:1: ruleStepSuffix : ( ( rule__StepSuffix__Group__0 ) ) ;
    public final void ruleStepSuffix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:556:2: ( ( ( rule__StepSuffix__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:557:1: ( ( rule__StepSuffix__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:557:1: ( ( rule__StepSuffix__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:558:1: ( rule__StepSuffix__Group__0 )
            {
             before(grammarAccess.getStepSuffixAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:559:1: ( rule__StepSuffix__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:559:2: rule__StepSuffix__Group__0
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__0_in_ruleStepSuffix1133);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:571:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:572:1: ( ruleImport EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:573:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1160);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1167); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:580:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:584:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:585:1: ( ( rule__Import__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:585:1: ( ( rule__Import__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:586:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:587:1: ( rule__Import__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:587:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport1193);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:599:1: rule__Step__Alternatives : ( ( ruleSingleStep ) | ( ( rule__Step__Group_1__0 ) ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:603:1: ( ( ruleSingleStep ) | ( ( rule__Step__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:604:1: ( ruleSingleStep )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:604:1: ( ruleSingleStep )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:605:1: ruleSingleStep
                    {
                     before(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleStep_in_rule__Step__Alternatives1229);
                    ruleSingleStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:610:6: ( ( rule__Step__Group_1__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:610:6: ( ( rule__Step__Group_1__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:611:1: ( rule__Step__Group_1__0 )
                    {
                     before(grammarAccess.getStepAccess().getGroup_1()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:612:1: ( rule__Step__Group_1__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:612:2: rule__Step__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Step__Group_1__0_in_rule__Step__Alternatives1246);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:621:1: rule__Rule__Alternatives_0 : ( ( ( rule__Rule__ImportAssignment_0_0 ) ) | ( ( rule__Rule__ConstraintAssignment_0_1 ) ) | ( ( rule__Rule__PropertyAssignment_0_2 ) ) | ( ( rule__Rule__NestedAssignment_0_3 ) ) );
    public final void rule__Rule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:625:1: ( ( ( rule__Rule__ImportAssignment_0_0 ) ) | ( ( rule__Rule__ConstraintAssignment_0_1 ) ) | ( ( rule__Rule__PropertyAssignment_0_2 ) ) | ( ( rule__Rule__NestedAssignment_0_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=RULE_STRING && LA3_4<=RULE_ID)||LA3_4==16||(LA3_4>=19 && LA3_4<=22)||(LA3_4>=26 && LA3_4<=27)) ) {
                    alt3=4;
                }
                else if ( (LA3_4==24) ) {
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
            case 16:
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
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:626:1: ( ( rule__Rule__ImportAssignment_0_0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:626:1: ( ( rule__Rule__ImportAssignment_0_0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:627:1: ( rule__Rule__ImportAssignment_0_0 )
                    {
                     before(grammarAccess.getRuleAccess().getImportAssignment_0_0()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:628:1: ( rule__Rule__ImportAssignment_0_0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:628:2: rule__Rule__ImportAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Rule__ImportAssignment_0_0_in_rule__Rule__Alternatives_01279);
                    rule__Rule__ImportAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getImportAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:632:6: ( ( rule__Rule__ConstraintAssignment_0_1 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:632:6: ( ( rule__Rule__ConstraintAssignment_0_1 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:633:1: ( rule__Rule__ConstraintAssignment_0_1 )
                    {
                     before(grammarAccess.getRuleAccess().getConstraintAssignment_0_1()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:634:1: ( rule__Rule__ConstraintAssignment_0_1 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:634:2: rule__Rule__ConstraintAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Rule__ConstraintAssignment_0_1_in_rule__Rule__Alternatives_01297);
                    rule__Rule__ConstraintAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getConstraintAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:638:6: ( ( rule__Rule__PropertyAssignment_0_2 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:638:6: ( ( rule__Rule__PropertyAssignment_0_2 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:639:1: ( rule__Rule__PropertyAssignment_0_2 )
                    {
                     before(grammarAccess.getRuleAccess().getPropertyAssignment_0_2()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:640:1: ( rule__Rule__PropertyAssignment_0_2 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:640:2: rule__Rule__PropertyAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__Rule__PropertyAssignment_0_2_in_rule__Rule__Alternatives_01315);
                    rule__Rule__PropertyAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getPropertyAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:644:6: ( ( rule__Rule__NestedAssignment_0_3 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:644:6: ( ( rule__Rule__NestedAssignment_0_3 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:645:1: ( rule__Rule__NestedAssignment_0_3 )
                    {
                     before(grammarAccess.getRuleAccess().getNestedAssignment_0_3()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:646:1: ( rule__Rule__NestedAssignment_0_3 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:646:2: rule__Rule__NestedAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__Rule__NestedAssignment_0_3_in_rule__Rule__Alternatives_01333);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:655:1: rule__Nested__Alternatives_1 : ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) );
    public final void rule__Nested__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:659:1: ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:660:1: ( ( rule__Nested__Group_1_0__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:660:1: ( ( rule__Nested__Group_1_0__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:661:1: ( rule__Nested__Group_1_0__0 )
                    {
                     before(grammarAccess.getNestedAccess().getGroup_1_0()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:662:1: ( rule__Nested__Group_1_0__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:662:2: rule__Nested__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Nested__Group_1_0__0_in_rule__Nested__Alternatives_11366);
                    rule__Nested__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:666:6: ( ( rule__Nested__Group_1_1__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:666:6: ( ( rule__Nested__Group_1_1__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:667:1: ( rule__Nested__Group_1_1__0 )
                    {
                     before(grammarAccess.getNestedAccess().getGroup_1_1()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:668:1: ( rule__Nested__Group_1_1__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:668:2: rule__Nested__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Nested__Group_1_1__0_in_rule__Nested__Alternatives_11384);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:677:1: rule__Nested__Alternatives_1_0_1 : ( ( ( rule__Nested__ImportAssignment_1_0_1_0 ) ) | ( ( rule__Nested__ConstraintAssignment_1_0_1_1 ) ) | ( ( rule__Nested__PropertyAssignment_1_0_1_2 ) ) );
    public final void rule__Nested__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:681:1: ( ( ( rule__Nested__ImportAssignment_1_0_1_0 ) ) | ( ( rule__Nested__ConstraintAssignment_1_0_1_1 ) ) | ( ( rule__Nested__PropertyAssignment_1_0_1_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
            case 29:
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
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:682:1: ( ( rule__Nested__ImportAssignment_1_0_1_0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:682:1: ( ( rule__Nested__ImportAssignment_1_0_1_0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:683:1: ( rule__Nested__ImportAssignment_1_0_1_0 )
                    {
                     before(grammarAccess.getNestedAccess().getImportAssignment_1_0_1_0()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:684:1: ( rule__Nested__ImportAssignment_1_0_1_0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:684:2: rule__Nested__ImportAssignment_1_0_1_0
                    {
                    pushFollow(FOLLOW_rule__Nested__ImportAssignment_1_0_1_0_in_rule__Nested__Alternatives_1_0_11417);
                    rule__Nested__ImportAssignment_1_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getImportAssignment_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:688:6: ( ( rule__Nested__ConstraintAssignment_1_0_1_1 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:688:6: ( ( rule__Nested__ConstraintAssignment_1_0_1_1 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:689:1: ( rule__Nested__ConstraintAssignment_1_0_1_1 )
                    {
                     before(grammarAccess.getNestedAccess().getConstraintAssignment_1_0_1_1()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:690:1: ( rule__Nested__ConstraintAssignment_1_0_1_1 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:690:2: rule__Nested__ConstraintAssignment_1_0_1_1
                    {
                    pushFollow(FOLLOW_rule__Nested__ConstraintAssignment_1_0_1_1_in_rule__Nested__Alternatives_1_0_11435);
                    rule__Nested__ConstraintAssignment_1_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getConstraintAssignment_1_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:694:6: ( ( rule__Nested__PropertyAssignment_1_0_1_2 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:694:6: ( ( rule__Nested__PropertyAssignment_1_0_1_2 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:695:1: ( rule__Nested__PropertyAssignment_1_0_1_2 )
                    {
                     before(grammarAccess.getNestedAccess().getPropertyAssignment_1_0_1_2()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:696:1: ( rule__Nested__PropertyAssignment_1_0_1_2 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:696:2: rule__Nested__PropertyAssignment_1_0_1_2
                    {
                    pushFollow(FOLLOW_rule__Nested__PropertyAssignment_1_0_1_2_in_rule__Nested__Alternatives_1_0_11453);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:705:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:709:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:710:1: ( 'true' )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:710:1: ( 'true' )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:711:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__Boolean__Alternatives1487); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:718:6: ( 'false' )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:718:6: ( 'false' )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:719:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__Boolean__Alternatives1507); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:731:1: rule__Value__Alternatives : ( ( RULE_HEXINT ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( ruleBoolean ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:735:1: ( ( RULE_HEXINT ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( ruleBoolean ) )
            int alt7=4;
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
            case 13:
            case 14:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:736:1: ( RULE_HEXINT )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:736:1: ( RULE_HEXINT )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:737:1: RULE_HEXINT
                    {
                     before(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_rule__Value__Alternatives1541); 
                     after(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:742:6: ( RULE_NUMBER )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:742:6: ( RULE_NUMBER )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:743:1: RULE_NUMBER
                    {
                     before(grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Value__Alternatives1558); 
                     after(grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:748:6: ( RULE_STRING )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:748:6: ( RULE_STRING )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:749:1: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives1575); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:754:6: ( ruleBoolean )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:754:6: ( ruleBoolean )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:755:1: ruleBoolean
                    {
                     before(grammarAccess.getValueAccess().getBooleanParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBoolean_in_rule__Value__Alternatives1592);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanParserRuleCall_3()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:765:1: rule__Ident__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Ident__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:769:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:770:1: ( RULE_ID )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:770:1: ( RULE_ID )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:771:1: RULE_ID
                    {
                     before(grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ident__Alternatives1624); 
                     after(grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:776:6: ( RULE_STRING )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:776:6: ( RULE_STRING )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:777:1: RULE_STRING
                    {
                     before(grammarAccess.getIdentAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Ident__Alternatives1641); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:789:1: rule__RuleSet__Group__0 : rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 ;
    public final void rule__RuleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:793:1: ( rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:794:2: rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01671);
            rule__RuleSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01674);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:801:1: rule__RuleSet__Group__0__Impl : ( ( rule__RuleSet__ContextAssignment_0 )? ) ;
    public final void rule__RuleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:805:1: ( ( ( rule__RuleSet__ContextAssignment_0 )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:806:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:806:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:807:1: ( rule__RuleSet__ContextAssignment_0 )?
            {
             before(grammarAccess.getRuleSetAccess().getContextAssignment_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:808:1: ( rule__RuleSet__ContextAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:808:2: rule__RuleSet__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RuleSet__ContextAssignment_0_in_rule__RuleSet__Group__0__Impl1701);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:818:1: rule__RuleSet__Group__1 : rule__RuleSet__Group__1__Impl ;
    public final void rule__RuleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:822:1: ( rule__RuleSet__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:823:2: rule__RuleSet__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11732);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:829:1: rule__RuleSet__Group__1__Impl : ( ( rule__RuleSet__RulesAssignment_1 )* ) ;
    public final void rule__RuleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:833:1: ( ( ( rule__RuleSet__RulesAssignment_1 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:834:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:834:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:835:1: ( rule__RuleSet__RulesAssignment_1 )*
            {
             before(grammarAccess.getRuleSetAccess().getRulesAssignment_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:836:1: ( rule__RuleSet__RulesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==16||LA10_0==25||(LA10_0>=28 && LA10_0<=29)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:836:2: rule__RuleSet__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__RuleSet__RulesAssignment_1_in_rule__RuleSet__Group__1__Impl1759);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:850:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:854:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:855:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01794);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01797);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:862:1: rule__Context__Group__0__Impl : ( '@context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:866:1: ( ( '@context' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:867:1: ( '@context' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:867:1: ( '@context' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:868:1: '@context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Context__Group__0__Impl1825); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:881:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:885:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:886:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11856);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11859);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:893:1: rule__Context__Group__1__Impl : ( '(' ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:897:1: ( ( '(' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:898:1: ( '(' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:898:1: ( '(' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:899:1: '('
            {
             before(grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Context__Group__1__Impl1887); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:912:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:916:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:917:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21918);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21921);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:924:1: rule__Context__Group__2__Impl : ( ( rule__Context__SelectorAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:928:1: ( ( ( rule__Context__SelectorAssignment_2 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:929:1: ( ( rule__Context__SelectorAssignment_2 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:929:1: ( ( rule__Context__SelectorAssignment_2 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:930:1: ( rule__Context__SelectorAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getSelectorAssignment_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:931:1: ( rule__Context__SelectorAssignment_2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:931:2: rule__Context__SelectorAssignment_2
            {
            pushFollow(FOLLOW_rule__Context__SelectorAssignment_2_in_rule__Context__Group__2__Impl1948);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:941:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:945:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:946:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__31978);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__4_in_rule__Context__Group__31981);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:953:1: rule__Context__Group__3__Impl : ( ')' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:957:1: ( ( ')' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:958:1: ( ')' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:958:1: ( ')' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:959:1: ')'
            {
             before(grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Context__Group__3__Impl2009); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:972:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:976:1: ( rule__Context__Group__4__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:977:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__42040);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:983:1: rule__Context__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:987:1: ( ( ( ';' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:988:1: ( ( ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:988:1: ( ( ';' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:989:1: ( ';' )?
            {
             before(grammarAccess.getContextAccess().getSemicolonKeyword_4()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:990:1: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:991:2: ';'
                    {
                    match(input,18,FOLLOW_18_in_rule__Context__Group__4__Impl2069); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1012:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1016:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1017:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__02112);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__02115);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1024:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__SumAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1028:1: ( ( ( rule__Selector__SumAssignment_0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1029:1: ( ( rule__Selector__SumAssignment_0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1029:1: ( ( rule__Selector__SumAssignment_0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1030:1: ( rule__Selector__SumAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getSumAssignment_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1031:1: ( rule__Selector__SumAssignment_0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1031:2: rule__Selector__SumAssignment_0
            {
            pushFollow(FOLLOW_rule__Selector__SumAssignment_0_in_rule__Selector__Group__0__Impl2142);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1041:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1045:1: ( rule__Selector__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1046:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__12172);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1052:1: rule__Selector__Group__1__Impl : ( ( '>' )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1056:1: ( ( ( '>' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1057:1: ( ( '>' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1057:1: ( ( '>' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1058:1: ( '>' )?
            {
             before(grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1059:1: ( '>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1060:2: '>'
                    {
                    match(input,19,FOLLOW_19_in_rule__Selector__Group__1__Impl2201); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1075:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1079:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1080:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__02238);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__02241);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1087:1: rule__Sum__Group__0__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1091:1: ( ( ruleProduct ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1092:1: ( ruleProduct )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1092:1: ( ruleProduct )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1093:1: ruleProduct
            {
             before(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProduct_in_rule__Sum__Group__0__Impl2268);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1104:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1108:1: ( rule__Sum__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1109:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__12297);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1115:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1119:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1120:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1120:1: ( ( rule__Sum__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1121:1: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1122:1: ( rule__Sum__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1122:2: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Sum__Group_1__0_in_rule__Sum__Group__1__Impl2324);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1136:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1140:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1141:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_rule__Sum__Group_1__0__Impl_in_rule__Sum__Group_1__02359);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sum__Group_1__1_in_rule__Sum__Group_1__02362);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1148:1: rule__Sum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1152:1: ( ( ',' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1153:1: ( ',' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1153:1: ( ',' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1154:1: ','
            {
             before(grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Sum__Group_1__0__Impl2390); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1167:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1171:1: ( rule__Sum__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1172:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sum__Group_1__1__Impl_in_rule__Sum__Group_1__12421);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1178:1: rule__Sum__Group_1__1__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1182:1: ( ( ruleProduct ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1183:1: ( ruleProduct )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1183:1: ( ruleProduct )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1184:1: ruleProduct
            {
             before(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleProduct_in_rule__Sum__Group_1__1__Impl2448);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1199:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1203:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1204:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02481);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02484);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1211:1: rule__Term__Group__0__Impl : ( ruleStep ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1215:1: ( ( ruleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1216:1: ( ruleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1216:1: ( ruleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1217:1: ruleStep
            {
             before(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Term__Group__0__Impl2511);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1228:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1232:1: ( rule__Term__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1233:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12540);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1239:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1243:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1244:1: ( ( rule__Term__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1244:1: ( ( rule__Term__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1245:1: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1246:1: ( rule__Term__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    int LA14_2 = input.LA(2);

                    if ( ((LA14_2>=RULE_STRING && LA14_2<=RULE_ID)||LA14_2==16) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1246:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl2567);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1260:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1264:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1265:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__02602);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__02605);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1272:1: rule__Term__Group_1__0__Impl : ( '>' ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1276:1: ( ( '>' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1277:1: ( '>' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1277:1: ( '>' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1278:1: '>'
            {
             before(grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Term__Group_1__0__Impl2633); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1291:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1295:1: ( rule__Term__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1296:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__12664);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1302:1: rule__Term__Group_1__1__Impl : ( ruleStep ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1306:1: ( ( ruleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1307:1: ( ruleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1307:1: ( ruleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1308:1: ruleStep
            {
             before(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Term__Group_1__1__Impl2691);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1323:1: rule__Step__Group_1__0 : rule__Step__Group_1__0__Impl rule__Step__Group_1__1 ;
    public final void rule__Step__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1327:1: ( rule__Step__Group_1__0__Impl rule__Step__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1328:2: rule__Step__Group_1__0__Impl rule__Step__Group_1__1
            {
            pushFollow(FOLLOW_rule__Step__Group_1__0__Impl_in_rule__Step__Group_1__02724);
            rule__Step__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_1__1_in_rule__Step__Group_1__02727);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1335:1: rule__Step__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Step__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1339:1: ( ( '(' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1340:1: ( '(' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1340:1: ( '(' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1341:1: '('
            {
             before(grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Step__Group_1__0__Impl2755); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1354:1: rule__Step__Group_1__1 : rule__Step__Group_1__1__Impl rule__Step__Group_1__2 ;
    public final void rule__Step__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1358:1: ( rule__Step__Group_1__1__Impl rule__Step__Group_1__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1359:2: rule__Step__Group_1__1__Impl rule__Step__Group_1__2
            {
            pushFollow(FOLLOW_rule__Step__Group_1__1__Impl_in_rule__Step__Group_1__12786);
            rule__Step__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_1__2_in_rule__Step__Group_1__12789);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1366:1: rule__Step__Group_1__1__Impl : ( ruleSum ) ;
    public final void rule__Step__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1370:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1371:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1371:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1372:1: ruleSum
            {
             before(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSum_in_rule__Step__Group_1__1__Impl2816);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1383:1: rule__Step__Group_1__2 : rule__Step__Group_1__2__Impl ;
    public final void rule__Step__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1387:1: ( rule__Step__Group_1__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1388:2: rule__Step__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group_1__2__Impl_in_rule__Step__Group_1__22845);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1394:1: rule__Step__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Step__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1398:1: ( ( ')' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1399:1: ( ')' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1399:1: ( ')' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1400:1: ')'
            {
             before(grammarAccess.getStepAccess().getRightParenthesisKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Step__Group_1__2__Impl2873); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1419:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1423:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1424:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02910);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02913);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1431:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Alternatives_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1435:1: ( ( ( rule__Rule__Alternatives_0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1436:1: ( ( rule__Rule__Alternatives_0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1436:1: ( ( rule__Rule__Alternatives_0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1437:1: ( rule__Rule__Alternatives_0 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1438:1: ( rule__Rule__Alternatives_0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1438:2: rule__Rule__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl2940);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1448:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1452:1: ( rule__Rule__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1453:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12970);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1459:1: rule__Rule__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1463:1: ( ( ( ';' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1464:1: ( ( ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1464:1: ( ( ';' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1465:1: ( ';' )?
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1466:1: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1467:2: ';'
                    {
                    match(input,18,FOLLOW_18_in_rule__Rule__Group__1__Impl2999); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1482:1: rule__Nested__Group__0 : rule__Nested__Group__0__Impl rule__Nested__Group__1 ;
    public final void rule__Nested__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1486:1: ( rule__Nested__Group__0__Impl rule__Nested__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1487:2: rule__Nested__Group__0__Impl rule__Nested__Group__1
            {
            pushFollow(FOLLOW_rule__Nested__Group__0__Impl_in_rule__Nested__Group__03036);
            rule__Nested__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group__1_in_rule__Nested__Group__03039);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1494:1: rule__Nested__Group__0__Impl : ( ( rule__Nested__SelectorAssignment_0 ) ) ;
    public final void rule__Nested__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1498:1: ( ( ( rule__Nested__SelectorAssignment_0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1499:1: ( ( rule__Nested__SelectorAssignment_0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1499:1: ( ( rule__Nested__SelectorAssignment_0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1500:1: ( rule__Nested__SelectorAssignment_0 )
            {
             before(grammarAccess.getNestedAccess().getSelectorAssignment_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1501:1: ( rule__Nested__SelectorAssignment_0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1501:2: rule__Nested__SelectorAssignment_0
            {
            pushFollow(FOLLOW_rule__Nested__SelectorAssignment_0_in_rule__Nested__Group__0__Impl3066);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1511:1: rule__Nested__Group__1 : rule__Nested__Group__1__Impl ;
    public final void rule__Nested__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1515:1: ( rule__Nested__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1516:2: rule__Nested__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group__1__Impl_in_rule__Nested__Group__13096);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1522:1: rule__Nested__Group__1__Impl : ( ( rule__Nested__Alternatives_1 ) ) ;
    public final void rule__Nested__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1526:1: ( ( ( rule__Nested__Alternatives_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1527:1: ( ( rule__Nested__Alternatives_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1527:1: ( ( rule__Nested__Alternatives_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1528:1: ( rule__Nested__Alternatives_1 )
            {
             before(grammarAccess.getNestedAccess().getAlternatives_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1529:1: ( rule__Nested__Alternatives_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1529:2: rule__Nested__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Nested__Alternatives_1_in_rule__Nested__Group__1__Impl3123);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1543:1: rule__Nested__Group_1_0__0 : rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 ;
    public final void rule__Nested__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1547:1: ( rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1548:2: rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_0__0__Impl_in_rule__Nested__Group_1_0__03157);
            rule__Nested__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_0__1_in_rule__Nested__Group_1_0__03160);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1555:1: rule__Nested__Group_1_0__0__Impl : ( ':' ) ;
    public final void rule__Nested__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1559:1: ( ( ':' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1560:1: ( ':' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1560:1: ( ':' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1561:1: ':'
            {
             before(grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Nested__Group_1_0__0__Impl3188); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1574:1: rule__Nested__Group_1_0__1 : rule__Nested__Group_1_0__1__Impl ;
    public final void rule__Nested__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1578:1: ( rule__Nested__Group_1_0__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1579:2: rule__Nested__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_0__1__Impl_in_rule__Nested__Group_1_0__13219);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1585:1: rule__Nested__Group_1_0__1__Impl : ( ( rule__Nested__Alternatives_1_0_1 ) ) ;
    public final void rule__Nested__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1589:1: ( ( ( rule__Nested__Alternatives_1_0_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1590:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1590:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1591:1: ( rule__Nested__Alternatives_1_0_1 )
            {
             before(grammarAccess.getNestedAccess().getAlternatives_1_0_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1592:1: ( rule__Nested__Alternatives_1_0_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1592:2: rule__Nested__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__Nested__Alternatives_1_0_1_in_rule__Nested__Group_1_0__1__Impl3246);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1606:1: rule__Nested__Group_1_1__0 : rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 ;
    public final void rule__Nested__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1610:1: ( rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1611:2: rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__0__Impl_in_rule__Nested__Group_1_1__03280);
            rule__Nested__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_1__1_in_rule__Nested__Group_1_1__03283);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1618:1: rule__Nested__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__Nested__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1622:1: ( ( '{' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1623:1: ( '{' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1623:1: ( '{' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1624:1: '{'
            {
             before(grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Nested__Group_1_1__0__Impl3311); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1637:1: rule__Nested__Group_1_1__1 : rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 ;
    public final void rule__Nested__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1641:1: ( rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1642:2: rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__1__Impl_in_rule__Nested__Group_1_1__13342);
            rule__Nested__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_1__2_in_rule__Nested__Group_1_1__13345);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1649:1: rule__Nested__Group_1_1__1__Impl : ( ( rule__Nested__RulesAssignment_1_1_1 )* ) ;
    public final void rule__Nested__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1653:1: ( ( ( rule__Nested__RulesAssignment_1_1_1 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1654:1: ( ( rule__Nested__RulesAssignment_1_1_1 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1654:1: ( ( rule__Nested__RulesAssignment_1_1_1 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1655:1: ( rule__Nested__RulesAssignment_1_1_1 )*
            {
             before(grammarAccess.getNestedAccess().getRulesAssignment_1_1_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1656:1: ( rule__Nested__RulesAssignment_1_1_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==16||LA16_0==25||(LA16_0>=28 && LA16_0<=29)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1656:2: rule__Nested__RulesAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Nested__RulesAssignment_1_1_1_in_rule__Nested__Group_1_1__1__Impl3372);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1666:1: rule__Nested__Group_1_1__2 : rule__Nested__Group_1_1__2__Impl ;
    public final void rule__Nested__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1670:1: ( rule__Nested__Group_1_1__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1671:2: rule__Nested__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__2__Impl_in_rule__Nested__Group_1_1__23403);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1677:1: rule__Nested__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__Nested__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1681:1: ( ( '}' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1682:1: ( '}' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1682:1: ( '}' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1683:1: '}'
            {
             before(grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 
            match(input,23,FOLLOW_23_in_rule__Nested__Group_1_1__2__Impl3431); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1702:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1706:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1707:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03468);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03471);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1714:1: rule__Property__Group__0__Impl : ( ( rule__Property__ModifiersAssignment_0 )* ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1718:1: ( ( ( rule__Property__ModifiersAssignment_0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1719:1: ( ( rule__Property__ModifiersAssignment_0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1719:1: ( ( rule__Property__ModifiersAssignment_0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1720:1: ( rule__Property__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getPropertyAccess().getModifiersAssignment_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1721:1: ( rule__Property__ModifiersAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1721:2: rule__Property__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Property__ModifiersAssignment_0_in_rule__Property__Group__0__Impl3498);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1731:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1735:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1736:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13529);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13532);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1743:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1747:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1748:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1748:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1749:1: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1750:1: ( rule__Property__NameAssignment_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1750:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl3559);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1760:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1764:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1765:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23589);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__23592);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1772:1: rule__Property__Group__2__Impl : ( '=' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1776:1: ( ( '=' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1777:1: ( '=' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1777:1: ( '=' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1778:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Property__Group__2__Impl3620); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1791:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1795:1: ( rule__Property__Group__3__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1796:2: rule__Property__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__33651);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1802:1: rule__Property__Group__3__Impl : ( ( rule__Property__ValueAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1806:1: ( ( ( rule__Property__ValueAssignment_3 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1807:1: ( ( rule__Property__ValueAssignment_3 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1807:1: ( ( rule__Property__ValueAssignment_3 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1808:1: ( rule__Property__ValueAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_3()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1809:1: ( rule__Property__ValueAssignment_3 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1809:2: rule__Property__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Property__ValueAssignment_3_in_rule__Property__Group__3__Impl3678);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1827:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1831:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1832:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03716);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03719);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1839:1: rule__Constraint__Group__0__Impl : ( '@constrain' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1843:1: ( ( '@constrain' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1844:1: ( '@constrain' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1844:1: ( '@constrain' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1845:1: '@constrain'
            {
             before(grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Constraint__Group__0__Impl3747); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1858:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1862:1: ( rule__Constraint__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1863:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13778);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1869:1: rule__Constraint__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1873:1: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1874:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1874:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1875:1: ruleSingleStep
            {
             before(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleStep_in_rule__Constraint__Group__1__Impl3805);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1890:1: rule__SingleStep__Group__0 : rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 ;
    public final void rule__SingleStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1894:1: ( rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1895:2: rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__0__Impl_in_rule__SingleStep__Group__03838);
            rule__SingleStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStep__Group__1_in_rule__SingleStep__Group__03841);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1902:1: rule__SingleStep__Group__0__Impl : ( ruleIdent ) ;
    public final void rule__SingleStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1906:1: ( ( ruleIdent ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1907:1: ( ruleIdent )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1907:1: ( ruleIdent )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1908:1: ruleIdent
            {
             before(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleIdent_in_rule__SingleStep__Group__0__Impl3868);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1919:1: rule__SingleStep__Group__1 : rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 ;
    public final void rule__SingleStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1923:1: ( rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1924:2: rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__1__Impl_in_rule__SingleStep__Group__13897);
            rule__SingleStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStep__Group__2_in_rule__SingleStep__Group__13900);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1931:1: rule__SingleStep__Group__1__Impl : ( ( ruleVals )? ) ;
    public final void rule__SingleStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1935:1: ( ( ( ruleVals )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1936:1: ( ( ruleVals )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1936:1: ( ( ruleVals )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1937:1: ( ruleVals )?
            {
             before(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1938:1: ( ruleVals )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1938:3: ruleVals
                    {
                    pushFollow(FOLLOW_ruleVals_in_rule__SingleStep__Group__1__Impl3928);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1948:1: rule__SingleStep__Group__2 : rule__SingleStep__Group__2__Impl ;
    public final void rule__SingleStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1952:1: ( rule__SingleStep__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1953:2: rule__SingleStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__2__Impl_in_rule__SingleStep__Group__23959);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1959:1: rule__SingleStep__Group__2__Impl : ( ( ruleStepSuffix )? ) ;
    public final void rule__SingleStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1963:1: ( ( ( ruleStepSuffix )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1964:1: ( ( ruleStepSuffix )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1964:1: ( ( ruleStepSuffix )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1965:1: ( ruleStepSuffix )?
            {
             before(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1966:1: ( ruleStepSuffix )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1966:3: ruleStepSuffix
                    {
                    pushFollow(FOLLOW_ruleStepSuffix_in_rule__SingleStep__Group__2__Impl3987);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1982:1: rule__Vals__Group__0 : rule__Vals__Group__0__Impl rule__Vals__Group__1 ;
    public final void rule__Vals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1986:1: ( rule__Vals__Group__0__Impl rule__Vals__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1987:2: rule__Vals__Group__0__Impl rule__Vals__Group__1
            {
            pushFollow(FOLLOW_rule__Vals__Group__0__Impl_in_rule__Vals__Group__04024);
            rule__Vals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vals__Group__1_in_rule__Vals__Group__04027);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1994:1: rule__Vals__Group__0__Impl : ( '.' ) ;
    public final void rule__Vals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1998:1: ( ( '.' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1999:1: ( '.' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1999:1: ( '.' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2000:1: '.'
            {
             before(grammarAccess.getValsAccess().getFullStopKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Vals__Group__0__Impl4055); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2013:1: rule__Vals__Group__1 : rule__Vals__Group__1__Impl rule__Vals__Group__2 ;
    public final void rule__Vals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2017:1: ( rule__Vals__Group__1__Impl rule__Vals__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2018:2: rule__Vals__Group__1__Impl rule__Vals__Group__2
            {
            pushFollow(FOLLOW_rule__Vals__Group__1__Impl_in_rule__Vals__Group__14086);
            rule__Vals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vals__Group__2_in_rule__Vals__Group__14089);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2025:1: rule__Vals__Group__1__Impl : ( ruleIdent ) ;
    public final void rule__Vals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2029:1: ( ( ruleIdent ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2030:1: ( ruleIdent )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2030:1: ( ruleIdent )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2031:1: ruleIdent
            {
             before(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleIdent_in_rule__Vals__Group__1__Impl4116);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2042:1: rule__Vals__Group__2 : rule__Vals__Group__2__Impl ;
    public final void rule__Vals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2046:1: ( rule__Vals__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2047:2: rule__Vals__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Vals__Group__2__Impl_in_rule__Vals__Group__24145);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2053:1: rule__Vals__Group__2__Impl : ( ( ruleVals )* ) ;
    public final void rule__Vals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2057:1: ( ( ( ruleVals )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2058:1: ( ( ruleVals )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2058:1: ( ( ruleVals )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2059:1: ( ruleVals )*
            {
             before(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2060:1: ( ruleVals )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2060:3: ruleVals
            	    {
            	    pushFollow(FOLLOW_ruleVals_in_rule__Vals__Group__2__Impl4173);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2076:1: rule__StepSuffix__Group__0 : rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 ;
    public final void rule__StepSuffix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2080:1: ( rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2081:2: rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__0__Impl_in_rule__StepSuffix__Group__04210);
            rule__StepSuffix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StepSuffix__Group__1_in_rule__StepSuffix__Group__04213);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2088:1: rule__StepSuffix__Group__0__Impl : ( '/' ) ;
    public final void rule__StepSuffix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2092:1: ( ( '/' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2093:1: ( '/' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2093:1: ( '/' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2094:1: '/'
            {
             before(grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__StepSuffix__Group__0__Impl4241); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2107:1: rule__StepSuffix__Group__1 : rule__StepSuffix__Group__1__Impl ;
    public final void rule__StepSuffix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2111:1: ( rule__StepSuffix__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2112:2: rule__StepSuffix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__1__Impl_in_rule__StepSuffix__Group__14272);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2118:1: rule__StepSuffix__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__StepSuffix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2122:1: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2123:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2123:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2124:1: ruleSingleStep
            {
             before(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleStep_in_rule__StepSuffix__Group__1__Impl4299);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2139:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2143:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2144:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04332);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04335);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2151:1: rule__Import__Group__0__Impl : ( '@import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2155:1: ( ( '@import' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2156:1: ( '@import' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2156:1: ( '@import' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2157:1: '@import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Import__Group__0__Impl4363); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2170:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2174:1: ( rule__Import__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2175:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14394);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2181:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2185:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2186:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2186:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2187:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2188:1: ( rule__Import__ImportURIAssignment_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2188:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl4421);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2203:1: rule__RuleSet__ContextAssignment_0 : ( ruleContext ) ;
    public final void rule__RuleSet__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2207:1: ( ( ruleContext ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2208:1: ( ruleContext )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2208:1: ( ruleContext )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2209:1: ruleContext
            {
             before(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleContext_in_rule__RuleSet__ContextAssignment_04460);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2218:1: rule__RuleSet__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__RuleSet__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2222:1: ( ( ruleRule ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2223:1: ( ruleRule )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2223:1: ( ruleRule )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2224:1: ruleRule
            {
             before(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__RuleSet__RulesAssignment_14491);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2233:1: rule__Context__SelectorAssignment_2 : ( ruleSelector ) ;
    public final void rule__Context__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2237:1: ( ( ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2238:1: ( ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2238:1: ( ruleSelector )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2239:1: ruleSelector
            {
             before(grammarAccess.getContextAccess().getSelectorSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__Context__SelectorAssignment_24522);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2248:1: rule__Selector__SumAssignment_0 : ( ruleSum ) ;
    public final void rule__Selector__SumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2252:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2253:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2253:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2254:1: ruleSum
            {
             before(grammarAccess.getSelectorAccess().getSumSumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSum_in_rule__Selector__SumAssignment_04553);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2263:1: rule__Rule__ImportAssignment_0_0 : ( ruleImport ) ;
    public final void rule__Rule__ImportAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2267:1: ( ( ruleImport ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2268:1: ( ruleImport )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2268:1: ( ruleImport )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2269:1: ruleImport
            {
             before(grammarAccess.getRuleAccess().getImportImportParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Rule__ImportAssignment_0_04584);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2278:1: rule__Rule__ConstraintAssignment_0_1 : ( ruleConstraint ) ;
    public final void rule__Rule__ConstraintAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2282:1: ( ( ruleConstraint ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2283:1: ( ruleConstraint )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2283:1: ( ruleConstraint )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2284:1: ruleConstraint
            {
             before(grammarAccess.getRuleAccess().getConstraintConstraintParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Rule__ConstraintAssignment_0_14615);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2293:1: rule__Rule__PropertyAssignment_0_2 : ( ruleProperty ) ;
    public final void rule__Rule__PropertyAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2297:1: ( ( ruleProperty ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2298:1: ( ruleProperty )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2298:1: ( ruleProperty )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2299:1: ruleProperty
            {
             before(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Rule__PropertyAssignment_0_24646);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2308:1: rule__Rule__NestedAssignment_0_3 : ( ruleNested ) ;
    public final void rule__Rule__NestedAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2312:1: ( ( ruleNested ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2313:1: ( ruleNested )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2313:1: ( ruleNested )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2314:1: ruleNested
            {
             before(grammarAccess.getRuleAccess().getNestedNestedParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleNested_in_rule__Rule__NestedAssignment_0_34677);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2323:1: rule__Nested__SelectorAssignment_0 : ( ruleSelector ) ;
    public final void rule__Nested__SelectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2327:1: ( ( ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2328:1: ( ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2328:1: ( ruleSelector )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2329:1: ruleSelector
            {
             before(grammarAccess.getNestedAccess().getSelectorSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__Nested__SelectorAssignment_04708);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2338:1: rule__Nested__ImportAssignment_1_0_1_0 : ( ruleImport ) ;
    public final void rule__Nested__ImportAssignment_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2342:1: ( ( ruleImport ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2343:1: ( ruleImport )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2343:1: ( ruleImport )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2344:1: ruleImport
            {
             before(grammarAccess.getNestedAccess().getImportImportParserRuleCall_1_0_1_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Nested__ImportAssignment_1_0_1_04739);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2353:1: rule__Nested__ConstraintAssignment_1_0_1_1 : ( ruleConstraint ) ;
    public final void rule__Nested__ConstraintAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2357:1: ( ( ruleConstraint ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2358:1: ( ruleConstraint )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2358:1: ( ruleConstraint )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2359:1: ruleConstraint
            {
             before(grammarAccess.getNestedAccess().getConstraintConstraintParserRuleCall_1_0_1_1_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Nested__ConstraintAssignment_1_0_1_14770);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2368:1: rule__Nested__PropertyAssignment_1_0_1_2 : ( ruleProperty ) ;
    public final void rule__Nested__PropertyAssignment_1_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2372:1: ( ( ruleProperty ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2373:1: ( ruleProperty )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2373:1: ( ruleProperty )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2374:1: ruleProperty
            {
             before(grammarAccess.getNestedAccess().getPropertyPropertyParserRuleCall_1_0_1_2_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Nested__PropertyAssignment_1_0_1_24801);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2383:1: rule__Nested__RulesAssignment_1_1_1 : ( ruleRule ) ;
    public final void rule__Nested__RulesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2387:1: ( ( ruleRule ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2388:1: ( ruleRule )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2388:1: ( ruleRule )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2389:1: ruleRule
            {
             before(grammarAccess.getNestedAccess().getRulesRuleParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Nested__RulesAssignment_1_1_14832);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2398:1: rule__Modifier__OverrideAssignment : ( ( '@override' ) ) ;
    public final void rule__Modifier__OverrideAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2402:1: ( ( ( '@override' ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2403:1: ( ( '@override' ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2403:1: ( ( '@override' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2404:1: ( '@override' )
            {
             before(grammarAccess.getModifierAccess().getOverrideOverrideKeyword_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2405:1: ( '@override' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2406:1: '@override'
            {
             before(grammarAccess.getModifierAccess().getOverrideOverrideKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Modifier__OverrideAssignment4868); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2421:1: rule__Property__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Property__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2425:1: ( ( ruleModifier ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2426:1: ( ruleModifier )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2426:1: ( ruleModifier )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2427:1: ruleModifier
            {
             before(grammarAccess.getPropertyAccess().getModifiersModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__Property__ModifiersAssignment_04907);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2436:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2440:1: ( ( RULE_ID ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2441:1: ( RULE_ID )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2441:1: ( RULE_ID )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2442:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_14938); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2451:1: rule__Property__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__Property__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2455:1: ( ( ruleValue ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2456:1: ( ruleValue )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2456:1: ( ruleValue )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2457:1: ruleValue
            {
             before(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Property__ValueAssignment_34969);
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


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2466:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2470:1: ( ( RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2471:1: ( RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2471:1: ( RULE_STRING )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2472:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_15000); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportURIAssignment_1"

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
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct337 = new BitSet(new long[]{0x00000000000100C2L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct350 = new BitSet(new long[]{0x00000000000100C2L});
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
    public static final BitSet FOLLOW_rule__Modifier__OverrideAssignment_in_ruleModifier653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_entryRuleSingleStep920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStep927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__0_in_ruleSingleStep953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_entryRuleIdent980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdent987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ident__Alternatives_in_ruleIdent1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_entryRuleVals1040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVals1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__0_in_ruleVals1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepSuffix1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__0_in_ruleStepSuffix1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__Step__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__0_in_rule__Step__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ImportAssignment_0_0_in_rule__Rule__Alternatives_01279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ConstraintAssignment_0_1_in_rule__Rule__Alternatives_01297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__PropertyAssignment_0_2_in_rule__Rule__Alternatives_01315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NestedAssignment_0_3_in_rule__Rule__Alternatives_01333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__0_in_rule__Nested__Alternatives_11366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__0_in_rule__Nested__Alternatives_11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__ImportAssignment_1_0_1_0_in_rule__Nested__Alternatives_1_0_11417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__ConstraintAssignment_1_0_1_1_in_rule__Nested__Alternatives_1_0_11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__PropertyAssignment_1_0_1_2_in_rule__Nested__Alternatives_1_0_11453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Boolean__Alternatives1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Boolean__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_rule__Value__Alternatives1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Value__Alternatives1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Value__Alternatives1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ident__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Ident__Alternatives1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01671 = new BitSet(new long[]{0x00000000320100C0L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__ContextAssignment_0_in_rule__RuleSet__Group__0__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__RulesAssignment_1_in_rule__RuleSet__Group__1__Impl1759 = new BitSet(new long[]{0x00000000320100C2L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01794 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Context__Group__0__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11856 = new BitSet(new long[]{0x00000000320100C0L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Context__Group__1__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21918 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__SelectorAssignment_2_in_rule__Context__Group__2__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__31978 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Context__Group__4_in_rule__Context__Group__31981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Context__Group__3__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__42040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Context__Group__4__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__02112 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__02115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SumAssignment_0_in_rule__Selector__Group__0__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__12172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Selector__Group__1__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__02238 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__02241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Sum__Group__0__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__12297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__0_in_rule__Sum__Group__1__Impl2324 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__0__Impl_in_rule__Sum__Group_1__02359 = new BitSet(new long[]{0x00000000320100C0L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__1_in_rule__Sum__Group_1__02362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Sum__Group_1__0__Impl2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__1__Impl_in_rule__Sum__Group_1__12421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Sum__Group_1__1__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02481 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Term__Group__0__Impl2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl2567 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__02602 = new BitSet(new long[]{0x00000000000100C0L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__02605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Term__Group_1__0__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Term__Group_1__1__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__0__Impl_in_rule__Step__Group_1__02724 = new BitSet(new long[]{0x00000000320100C0L});
    public static final BitSet FOLLOW_rule__Step__Group_1__1_in_rule__Step__Group_1__02727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Step__Group_1__0__Impl2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__1__Impl_in_rule__Step__Group_1__12786 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Step__Group_1__2_in_rule__Step__Group_1__12789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Step__Group_1__1__Impl2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__2__Impl_in_rule__Step__Group_1__22845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Step__Group_1__2__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02910 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Rule__Group__1__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__0__Impl_in_rule__Nested__Group__03036 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Nested__Group__1_in_rule__Nested__Group__03039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__SelectorAssignment_0_in_rule__Nested__Group__0__Impl3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__1__Impl_in_rule__Nested__Group__13096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Alternatives_1_in_rule__Nested__Group__1__Impl3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__0__Impl_in_rule__Nested__Group_1_0__03157 = new BitSet(new long[]{0x0000000032000080L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__1_in_rule__Nested__Group_1_0__03160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Nested__Group_1_0__0__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__1__Impl_in_rule__Nested__Group_1_0__13219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Alternatives_1_0_1_in_rule__Nested__Group_1_0__1__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__0__Impl_in_rule__Nested__Group_1_1__03280 = new BitSet(new long[]{0x00000000328100C0L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__1_in_rule__Nested__Group_1_1__03283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Nested__Group_1_1__0__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__1__Impl_in_rule__Nested__Group_1_1__13342 = new BitSet(new long[]{0x00000000328100C0L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__2_in_rule__Nested__Group_1_1__13345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__RulesAssignment_1_1_1_in_rule__Nested__Group_1_1__1__Impl3372 = new BitSet(new long[]{0x00000000320100C2L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__2__Impl_in_rule__Nested__Group_1_1__23403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Nested__Group_1_1__2__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03468 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ModifiersAssignment_0_in_rule__Property__Group__0__Impl3498 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13529 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23589 = new BitSet(new long[]{0x0000000000006070L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__23592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Property__Group__2__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__33651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ValueAssignment_3_in_rule__Property__Group__3__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03716 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constraint__Group__0__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__Constraint__Group__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__0__Impl_in_rule__SingleStep__Group__03838 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__1_in_rule__SingleStep__Group__03841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_rule__SingleStep__Group__0__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__1__Impl_in_rule__SingleStep__Group__13897 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__2_in_rule__SingleStep__Group__13900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_rule__SingleStep__Group__1__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__2__Impl_in_rule__SingleStep__Group__23959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_rule__SingleStep__Group__2__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__0__Impl_in_rule__Vals__Group__04024 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Vals__Group__1_in_rule__Vals__Group__04027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Vals__Group__0__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__1__Impl_in_rule__Vals__Group__14086 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Vals__Group__2_in_rule__Vals__Group__14089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_rule__Vals__Group__1__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__2__Impl_in_rule__Vals__Group__24145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_rule__Vals__Group__2__Impl4173 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__0__Impl_in_rule__StepSuffix__Group__04210 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__1_in_rule__StepSuffix__Group__04213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StepSuffix__Group__0__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__1__Impl_in_rule__StepSuffix__Group__14272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__StepSuffix__Group__1__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04332 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Import__Group__0__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_rule__RuleSet__ContextAssignment_04460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleSet__RulesAssignment_14491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__Context__SelectorAssignment_24522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Selector__SumAssignment_04553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Rule__ImportAssignment_0_04584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Rule__ConstraintAssignment_0_14615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Rule__PropertyAssignment_0_24646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_rule__Rule__NestedAssignment_0_34677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__Nested__SelectorAssignment_04708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Nested__ImportAssignment_1_0_1_04739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Nested__ConstraintAssignment_1_0_1_14770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Nested__PropertyAssignment_1_0_1_24801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Nested__RulesAssignment_1_1_14832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Modifier__OverrideAssignment4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Property__ModifiersAssignment_04907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_14938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Property__ValueAssignment_34969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_15000 = new BitSet(new long[]{0x0000000000000002L});

}