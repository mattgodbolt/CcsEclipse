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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEXINT", "RULE_NUMBER", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'@context'", "'('", "')'", "';'", "'>'", "','", "':'", "'{'", "'}'", "'='", "'@constrain'", "'.'", "'/'", "'@import'"
    };
    public static final int RULE_ID=7;
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


    // $ANTLR start "entryRuleProperty"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:319:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:320:1: ( ruleProperty EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:321:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty620);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty627); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:328:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:332:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:333:1: ( ( rule__Property__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:333:1: ( ( rule__Property__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:334:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:335:1: ( rule__Property__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:335:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty653);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:347:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:348:1: ( rulebool EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:349:1: rulebool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_rulebool_in_entryRulebool680);
            rulebool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebool687); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:356:1: rulebool : ( ( rule__Bool__Alternatives ) ) ;
    public final void rulebool() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:360:2: ( ( ( rule__Bool__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:361:1: ( ( rule__Bool__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:361:1: ( ( rule__Bool__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:362:1: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:363:1: ( rule__Bool__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:363:2: rule__Bool__Alternatives
            {
            pushFollow(FOLLOW_rule__Bool__Alternatives_in_rulebool713);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:375:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:376:1: ( ruleValue EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:377:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue740);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue747); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:384:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:388:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:389:1: ( ( rule__Value__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:389:1: ( ( rule__Value__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:390:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:391:1: ( rule__Value__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:391:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue773);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:403:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:404:1: ( ruleConstraint EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:405:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint800);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint807); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:412:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:416:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:417:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:417:1: ( ( rule__Constraint__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:418:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:419:1: ( rule__Constraint__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:419:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint833);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:431:1: entryRuleSingleStep : ruleSingleStep EOF ;
    public final void entryRuleSingleStep() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:432:1: ( ruleSingleStep EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:433:1: ruleSingleStep EOF
            {
             before(grammarAccess.getSingleStepRule()); 
            pushFollow(FOLLOW_ruleSingleStep_in_entryRuleSingleStep860);
            ruleSingleStep();

            state._fsp--;

             after(grammarAccess.getSingleStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStep867); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:440:1: ruleSingleStep : ( ( rule__SingleStep__Group__0 ) ) ;
    public final void ruleSingleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:444:2: ( ( ( rule__SingleStep__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:445:1: ( ( rule__SingleStep__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:445:1: ( ( rule__SingleStep__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:446:1: ( rule__SingleStep__Group__0 )
            {
             before(grammarAccess.getSingleStepAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:447:1: ( rule__SingleStep__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:447:2: rule__SingleStep__Group__0
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__0_in_ruleSingleStep893);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:459:1: entryRuleIdent : ruleIdent EOF ;
    public final void entryRuleIdent() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:460:1: ( ruleIdent EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:461:1: ruleIdent EOF
            {
             before(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_ruleIdent_in_entryRuleIdent920);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getIdentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdent927); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:468:1: ruleIdent : ( ( rule__Ident__Alternatives ) ) ;
    public final void ruleIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:472:2: ( ( ( rule__Ident__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:473:1: ( ( rule__Ident__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:473:1: ( ( rule__Ident__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:474:1: ( rule__Ident__Alternatives )
            {
             before(grammarAccess.getIdentAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:475:1: ( rule__Ident__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:475:2: rule__Ident__Alternatives
            {
            pushFollow(FOLLOW_rule__Ident__Alternatives_in_ruleIdent953);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:487:1: entryRuleVals : ruleVals EOF ;
    public final void entryRuleVals() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:488:1: ( ruleVals EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:489:1: ruleVals EOF
            {
             before(grammarAccess.getValsRule()); 
            pushFollow(FOLLOW_ruleVals_in_entryRuleVals980);
            ruleVals();

            state._fsp--;

             after(grammarAccess.getValsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVals987); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:496:1: ruleVals : ( ( rule__Vals__Group__0 ) ) ;
    public final void ruleVals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:500:2: ( ( ( rule__Vals__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:501:1: ( ( rule__Vals__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:501:1: ( ( rule__Vals__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:502:1: ( rule__Vals__Group__0 )
            {
             before(grammarAccess.getValsAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:503:1: ( rule__Vals__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:503:2: rule__Vals__Group__0
            {
            pushFollow(FOLLOW_rule__Vals__Group__0_in_ruleVals1013);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:515:1: entryRuleStepSuffix : ruleStepSuffix EOF ;
    public final void entryRuleStepSuffix() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:516:1: ( ruleStepSuffix EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:517:1: ruleStepSuffix EOF
            {
             before(grammarAccess.getStepSuffixRule()); 
            pushFollow(FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix1040);
            ruleStepSuffix();

            state._fsp--;

             after(grammarAccess.getStepSuffixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepSuffix1047); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:524:1: ruleStepSuffix : ( ( rule__StepSuffix__Group__0 ) ) ;
    public final void ruleStepSuffix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:528:2: ( ( ( rule__StepSuffix__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:529:1: ( ( rule__StepSuffix__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:529:1: ( ( rule__StepSuffix__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:530:1: ( rule__StepSuffix__Group__0 )
            {
             before(grammarAccess.getStepSuffixAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:531:1: ( rule__StepSuffix__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:531:2: rule__StepSuffix__Group__0
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__0_in_ruleStepSuffix1073);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:543:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:544:1: ( ruleImport EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:545:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1100);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1107); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:552:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:556:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:557:1: ( ( rule__Import__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:557:1: ( ( rule__Import__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:558:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:559:1: ( rule__Import__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:559:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport1133);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:571:1: rule__Step__Alternatives : ( ( ruleSingleStep ) | ( ( rule__Step__Group_1__0 ) ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:575:1: ( ( ruleSingleStep ) | ( ( rule__Step__Group_1__0 ) ) )
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
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:576:1: ( ruleSingleStep )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:576:1: ( ruleSingleStep )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:577:1: ruleSingleStep
                    {
                     before(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleStep_in_rule__Step__Alternatives1169);
                    ruleSingleStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:582:6: ( ( rule__Step__Group_1__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:582:6: ( ( rule__Step__Group_1__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:583:1: ( rule__Step__Group_1__0 )
                    {
                     before(grammarAccess.getStepAccess().getGroup_1()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:584:1: ( rule__Step__Group_1__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:584:2: rule__Step__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Step__Group_1__0_in_rule__Step__Alternatives1186);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:593:1: rule__Rule__Alternatives_0 : ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) | ( ruleNested ) );
    public final void rule__Rule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:597:1: ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) | ( ruleNested ) )
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
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==24) ) {
                    alt3=3;
                }
                else if ( ((LA3_3>=RULE_STRING && LA3_3<=RULE_ID)||LA3_3==16||(LA3_3>=19 && LA3_3<=22)||(LA3_3>=26 && LA3_3<=27)) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

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
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:598:1: ( ruleImport )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:598:1: ( ruleImport )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:599:1: ruleImport
                    {
                     before(grammarAccess.getRuleAccess().getImportParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__Rule__Alternatives_01219);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getImportParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:604:6: ( ruleConstraint )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:604:6: ( ruleConstraint )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:605:1: ruleConstraint
                    {
                     before(grammarAccess.getRuleAccess().getConstraintParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__Rule__Alternatives_01236);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getConstraintParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:610:6: ( ruleProperty )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:610:6: ( ruleProperty )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:611:1: ruleProperty
                    {
                     before(grammarAccess.getRuleAccess().getPropertyParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleProperty_in_rule__Rule__Alternatives_01253);
                    ruleProperty();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getPropertyParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:616:6: ( ruleNested )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:616:6: ( ruleNested )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:617:1: ruleNested
                    {
                     before(grammarAccess.getRuleAccess().getNestedParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleNested_in_rule__Rule__Alternatives_01270);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:627:1: rule__Nested__Alternatives_1 : ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) );
    public final void rule__Nested__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:631:1: ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) )
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
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:632:1: ( ( rule__Nested__Group_1_0__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:632:1: ( ( rule__Nested__Group_1_0__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:633:1: ( rule__Nested__Group_1_0__0 )
                    {
                     before(grammarAccess.getNestedAccess().getGroup_1_0()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:634:1: ( rule__Nested__Group_1_0__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:634:2: rule__Nested__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Nested__Group_1_0__0_in_rule__Nested__Alternatives_11302);
                    rule__Nested__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:638:6: ( ( rule__Nested__Group_1_1__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:638:6: ( ( rule__Nested__Group_1_1__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:639:1: ( rule__Nested__Group_1_1__0 )
                    {
                     before(grammarAccess.getNestedAccess().getGroup_1_1()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:640:1: ( rule__Nested__Group_1_1__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:640:2: rule__Nested__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Nested__Group_1_1__0_in_rule__Nested__Alternatives_11320);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:649:1: rule__Nested__Alternatives_1_0_1 : ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) );
    public final void rule__Nested__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:653:1: ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) )
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
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:654:1: ( ruleImport )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:654:1: ( ruleImport )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:655:1: ruleImport
                    {
                     before(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__Nested__Alternatives_1_0_11353);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:660:6: ( ruleConstraint )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:660:6: ( ruleConstraint )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:661:1: ruleConstraint
                    {
                     before(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__Nested__Alternatives_1_0_11370);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:666:6: ( ruleProperty )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:666:6: ( ruleProperty )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:667:1: ruleProperty
                    {
                     before(grammarAccess.getNestedAccess().getPropertyParserRuleCall_1_0_1_2()); 
                    pushFollow(FOLLOW_ruleProperty_in_rule__Nested__Alternatives_1_0_11387);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:677:1: rule__Bool__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:681:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:682:1: ( 'true' )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:682:1: ( 'true' )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:683:1: 'true'
                    {
                     before(grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__Bool__Alternatives1420); 
                     after(grammarAccess.getBoolAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:690:6: ( 'false' )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:690:6: ( 'false' )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:691:1: 'false'
                    {
                     before(grammarAccess.getBoolAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__Bool__Alternatives1440); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:703:1: rule__Value__Alternatives : ( ( RULE_HEXINT ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( rulebool ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:707:1: ( ( RULE_HEXINT ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( rulebool ) )
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
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:708:1: ( RULE_HEXINT )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:708:1: ( RULE_HEXINT )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:709:1: RULE_HEXINT
                    {
                     before(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_rule__Value__Alternatives1474); 
                     after(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:714:6: ( RULE_NUMBER )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:714:6: ( RULE_NUMBER )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:715:1: RULE_NUMBER
                    {
                     before(grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Value__Alternatives1491); 
                     after(grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:720:6: ( RULE_STRING )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:720:6: ( RULE_STRING )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:721:1: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives1508); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:726:6: ( rulebool )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:726:6: ( rulebool )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:727:1: rulebool
                    {
                     before(grammarAccess.getValueAccess().getBoolParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulebool_in_rule__Value__Alternatives1525);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:737:1: rule__Ident__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Ident__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:741:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:742:1: ( RULE_ID )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:742:1: ( RULE_ID )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:743:1: RULE_ID
                    {
                     before(grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ident__Alternatives1557); 
                     after(grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:748:6: ( RULE_STRING )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:748:6: ( RULE_STRING )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:749:1: RULE_STRING
                    {
                     before(grammarAccess.getIdentAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Ident__Alternatives1574); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:761:1: rule__RuleSet__Group__0 : rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 ;
    public final void rule__RuleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:765:1: ( rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:766:2: rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01604);
            rule__RuleSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01607);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:773:1: rule__RuleSet__Group__0__Impl : ( ( rule__RuleSet__ContextAssignment_0 )? ) ;
    public final void rule__RuleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:777:1: ( ( ( rule__RuleSet__ContextAssignment_0 )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:778:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:778:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:779:1: ( rule__RuleSet__ContextAssignment_0 )?
            {
             before(grammarAccess.getRuleSetAccess().getContextAssignment_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:780:1: ( rule__RuleSet__ContextAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:780:2: rule__RuleSet__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RuleSet__ContextAssignment_0_in_rule__RuleSet__Group__0__Impl1634);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:790:1: rule__RuleSet__Group__1 : rule__RuleSet__Group__1__Impl ;
    public final void rule__RuleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:794:1: ( rule__RuleSet__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:795:2: rule__RuleSet__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11665);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:801:1: rule__RuleSet__Group__1__Impl : ( ( rule__RuleSet__RulesAssignment_1 )* ) ;
    public final void rule__RuleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:805:1: ( ( ( rule__RuleSet__RulesAssignment_1 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:806:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:806:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:807:1: ( rule__RuleSet__RulesAssignment_1 )*
            {
             before(grammarAccess.getRuleSetAccess().getRulesAssignment_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:808:1: ( rule__RuleSet__RulesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==16||LA10_0==25||LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:808:2: rule__RuleSet__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__RuleSet__RulesAssignment_1_in_rule__RuleSet__Group__1__Impl1692);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:822:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:826:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:827:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01727);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01730);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:834:1: rule__Context__Group__0__Impl : ( '@context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:838:1: ( ( '@context' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:839:1: ( '@context' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:839:1: ( '@context' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:840:1: '@context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Context__Group__0__Impl1758); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:853:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:857:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:858:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11789);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11792);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:865:1: rule__Context__Group__1__Impl : ( '(' ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:869:1: ( ( '(' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:870:1: ( '(' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:870:1: ( '(' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:871:1: '('
            {
             before(grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Context__Group__1__Impl1820); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:884:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:888:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:889:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21851);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21854);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:896:1: rule__Context__Group__2__Impl : ( ( rule__Context__SelectorAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:900:1: ( ( ( rule__Context__SelectorAssignment_2 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:901:1: ( ( rule__Context__SelectorAssignment_2 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:901:1: ( ( rule__Context__SelectorAssignment_2 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:902:1: ( rule__Context__SelectorAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getSelectorAssignment_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:903:1: ( rule__Context__SelectorAssignment_2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:903:2: rule__Context__SelectorAssignment_2
            {
            pushFollow(FOLLOW_rule__Context__SelectorAssignment_2_in_rule__Context__Group__2__Impl1881);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:913:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:917:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:918:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__31911);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__4_in_rule__Context__Group__31914);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:925:1: rule__Context__Group__3__Impl : ( ')' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:929:1: ( ( ')' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:930:1: ( ')' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:930:1: ( ')' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:931:1: ')'
            {
             before(grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Context__Group__3__Impl1942); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:944:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:948:1: ( rule__Context__Group__4__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:949:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__41973);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:955:1: rule__Context__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:959:1: ( ( ( ';' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:960:1: ( ( ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:960:1: ( ( ';' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:961:1: ( ';' )?
            {
             before(grammarAccess.getContextAccess().getSemicolonKeyword_4()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:962:1: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:963:2: ';'
                    {
                    match(input,18,FOLLOW_18_in_rule__Context__Group__4__Impl2002); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:984:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:988:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:989:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__02045);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__02048);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:996:1: rule__Selector__Group__0__Impl : ( ruleSum ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1000:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1001:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1001:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1002:1: ruleSum
            {
             before(grammarAccess.getSelectorAccess().getSumParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSum_in_rule__Selector__Group__0__Impl2075);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1013:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1017:1: ( rule__Selector__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1018:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__12104);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1024:1: rule__Selector__Group__1__Impl : ( ( '>' )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1028:1: ( ( ( '>' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1029:1: ( ( '>' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1029:1: ( ( '>' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1030:1: ( '>' )?
            {
             before(grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1031:1: ( '>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1032:2: '>'
                    {
                    match(input,19,FOLLOW_19_in_rule__Selector__Group__1__Impl2133); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1047:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1051:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1052:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__02170);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__02173);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1059:1: rule__Sum__Group__0__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1063:1: ( ( ruleProduct ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1064:1: ( ruleProduct )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1064:1: ( ruleProduct )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1065:1: ruleProduct
            {
             before(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProduct_in_rule__Sum__Group__0__Impl2200);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1076:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1080:1: ( rule__Sum__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1081:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__12229);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1087:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1091:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1092:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1092:1: ( ( rule__Sum__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1093:1: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1094:1: ( rule__Sum__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1094:2: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Sum__Group_1__0_in_rule__Sum__Group__1__Impl2256);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1108:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1112:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1113:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_rule__Sum__Group_1__0__Impl_in_rule__Sum__Group_1__02291);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sum__Group_1__1_in_rule__Sum__Group_1__02294);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1120:1: rule__Sum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1124:1: ( ( ',' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1125:1: ( ',' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1125:1: ( ',' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1126:1: ','
            {
             before(grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Sum__Group_1__0__Impl2322); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1139:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1143:1: ( rule__Sum__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1144:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sum__Group_1__1__Impl_in_rule__Sum__Group_1__12353);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1150:1: rule__Sum__Group_1__1__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1154:1: ( ( ruleProduct ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1155:1: ( ruleProduct )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1155:1: ( ruleProduct )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1156:1: ruleProduct
            {
             before(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleProduct_in_rule__Sum__Group_1__1__Impl2380);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1171:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1175:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1176:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02413);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02416);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1183:1: rule__Term__Group__0__Impl : ( ruleStep ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1187:1: ( ( ruleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1188:1: ( ruleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1188:1: ( ruleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1189:1: ruleStep
            {
             before(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Term__Group__0__Impl2443);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1200:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1204:1: ( rule__Term__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1205:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12472);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1211:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1215:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1216:1: ( ( rule__Term__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1216:1: ( ( rule__Term__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1217:1: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1218:1: ( rule__Term__Group_1__0 )*
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
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1218:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl2499);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1232:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1236:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1237:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__02534);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__02537);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1244:1: rule__Term__Group_1__0__Impl : ( '>' ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1248:1: ( ( '>' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1249:1: ( '>' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1249:1: ( '>' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1250:1: '>'
            {
             before(grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Term__Group_1__0__Impl2565); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1263:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1267:1: ( rule__Term__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1268:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__12596);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1274:1: rule__Term__Group_1__1__Impl : ( ruleStep ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1278:1: ( ( ruleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1279:1: ( ruleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1279:1: ( ruleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1280:1: ruleStep
            {
             before(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Term__Group_1__1__Impl2623);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1295:1: rule__Step__Group_1__0 : rule__Step__Group_1__0__Impl rule__Step__Group_1__1 ;
    public final void rule__Step__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1299:1: ( rule__Step__Group_1__0__Impl rule__Step__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1300:2: rule__Step__Group_1__0__Impl rule__Step__Group_1__1
            {
            pushFollow(FOLLOW_rule__Step__Group_1__0__Impl_in_rule__Step__Group_1__02656);
            rule__Step__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_1__1_in_rule__Step__Group_1__02659);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1307:1: rule__Step__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Step__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1311:1: ( ( '(' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1312:1: ( '(' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1312:1: ( '(' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1313:1: '('
            {
             before(grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Step__Group_1__0__Impl2687); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1326:1: rule__Step__Group_1__1 : rule__Step__Group_1__1__Impl rule__Step__Group_1__2 ;
    public final void rule__Step__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1330:1: ( rule__Step__Group_1__1__Impl rule__Step__Group_1__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1331:2: rule__Step__Group_1__1__Impl rule__Step__Group_1__2
            {
            pushFollow(FOLLOW_rule__Step__Group_1__1__Impl_in_rule__Step__Group_1__12718);
            rule__Step__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_1__2_in_rule__Step__Group_1__12721);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1338:1: rule__Step__Group_1__1__Impl : ( ruleSum ) ;
    public final void rule__Step__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1342:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1343:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1343:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1344:1: ruleSum
            {
             before(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSum_in_rule__Step__Group_1__1__Impl2748);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1355:1: rule__Step__Group_1__2 : rule__Step__Group_1__2__Impl ;
    public final void rule__Step__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1359:1: ( rule__Step__Group_1__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1360:2: rule__Step__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group_1__2__Impl_in_rule__Step__Group_1__22777);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1366:1: rule__Step__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Step__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1370:1: ( ( ')' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1371:1: ( ')' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1371:1: ( ')' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1372:1: ')'
            {
             before(grammarAccess.getStepAccess().getRightParenthesisKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Step__Group_1__2__Impl2805); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1391:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1395:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1396:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02842);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02845);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1403:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Alternatives_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1407:1: ( ( ( rule__Rule__Alternatives_0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1408:1: ( ( rule__Rule__Alternatives_0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1408:1: ( ( rule__Rule__Alternatives_0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1409:1: ( rule__Rule__Alternatives_0 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1410:1: ( rule__Rule__Alternatives_0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1410:2: rule__Rule__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl2872);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1420:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1424:1: ( rule__Rule__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1425:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12902);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1431:1: rule__Rule__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1435:1: ( ( ( ';' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1436:1: ( ( ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1436:1: ( ( ';' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1437:1: ( ';' )?
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1438:1: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1439:2: ';'
                    {
                    match(input,18,FOLLOW_18_in_rule__Rule__Group__1__Impl2931); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1454:1: rule__Nested__Group__0 : rule__Nested__Group__0__Impl rule__Nested__Group__1 ;
    public final void rule__Nested__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1458:1: ( rule__Nested__Group__0__Impl rule__Nested__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1459:2: rule__Nested__Group__0__Impl rule__Nested__Group__1
            {
            pushFollow(FOLLOW_rule__Nested__Group__0__Impl_in_rule__Nested__Group__02968);
            rule__Nested__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group__1_in_rule__Nested__Group__02971);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1466:1: rule__Nested__Group__0__Impl : ( ruleSelector ) ;
    public final void rule__Nested__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1470:1: ( ( ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1471:1: ( ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1471:1: ( ruleSelector )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1472:1: ruleSelector
            {
             before(grammarAccess.getNestedAccess().getSelectorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__Nested__Group__0__Impl2998);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1483:1: rule__Nested__Group__1 : rule__Nested__Group__1__Impl ;
    public final void rule__Nested__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1487:1: ( rule__Nested__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1488:2: rule__Nested__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group__1__Impl_in_rule__Nested__Group__13027);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1494:1: rule__Nested__Group__1__Impl : ( ( rule__Nested__Alternatives_1 ) ) ;
    public final void rule__Nested__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1498:1: ( ( ( rule__Nested__Alternatives_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1499:1: ( ( rule__Nested__Alternatives_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1499:1: ( ( rule__Nested__Alternatives_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1500:1: ( rule__Nested__Alternatives_1 )
            {
             before(grammarAccess.getNestedAccess().getAlternatives_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1501:1: ( rule__Nested__Alternatives_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1501:2: rule__Nested__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Nested__Alternatives_1_in_rule__Nested__Group__1__Impl3054);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1515:1: rule__Nested__Group_1_0__0 : rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 ;
    public final void rule__Nested__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1519:1: ( rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1520:2: rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_0__0__Impl_in_rule__Nested__Group_1_0__03088);
            rule__Nested__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_0__1_in_rule__Nested__Group_1_0__03091);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1527:1: rule__Nested__Group_1_0__0__Impl : ( ':' ) ;
    public final void rule__Nested__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1531:1: ( ( ':' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1532:1: ( ':' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1532:1: ( ':' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1533:1: ':'
            {
             before(grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Nested__Group_1_0__0__Impl3119); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1546:1: rule__Nested__Group_1_0__1 : rule__Nested__Group_1_0__1__Impl ;
    public final void rule__Nested__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1550:1: ( rule__Nested__Group_1_0__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1551:2: rule__Nested__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_0__1__Impl_in_rule__Nested__Group_1_0__13150);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1557:1: rule__Nested__Group_1_0__1__Impl : ( ( rule__Nested__Alternatives_1_0_1 ) ) ;
    public final void rule__Nested__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1561:1: ( ( ( rule__Nested__Alternatives_1_0_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1562:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1562:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1563:1: ( rule__Nested__Alternatives_1_0_1 )
            {
             before(grammarAccess.getNestedAccess().getAlternatives_1_0_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1564:1: ( rule__Nested__Alternatives_1_0_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1564:2: rule__Nested__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__Nested__Alternatives_1_0_1_in_rule__Nested__Group_1_0__1__Impl3177);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1578:1: rule__Nested__Group_1_1__0 : rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 ;
    public final void rule__Nested__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1582:1: ( rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1583:2: rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__0__Impl_in_rule__Nested__Group_1_1__03211);
            rule__Nested__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_1__1_in_rule__Nested__Group_1_1__03214);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1590:1: rule__Nested__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__Nested__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1594:1: ( ( '{' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1595:1: ( '{' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1595:1: ( '{' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1596:1: '{'
            {
             before(grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Nested__Group_1_1__0__Impl3242); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1609:1: rule__Nested__Group_1_1__1 : rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 ;
    public final void rule__Nested__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1613:1: ( rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1614:2: rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__1__Impl_in_rule__Nested__Group_1_1__13273);
            rule__Nested__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_1__2_in_rule__Nested__Group_1_1__13276);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1621:1: rule__Nested__Group_1_1__1__Impl : ( ( ruleRule )* ) ;
    public final void rule__Nested__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1625:1: ( ( ( ruleRule )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1626:1: ( ( ruleRule )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1626:1: ( ( ruleRule )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1627:1: ( ruleRule )*
            {
             before(grammarAccess.getNestedAccess().getRuleParserRuleCall_1_1_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1628:1: ( ruleRule )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==16||LA16_0==25||LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1628:3: ruleRule
            	    {
            	    pushFollow(FOLLOW_ruleRule_in_rule__Nested__Group_1_1__1__Impl3304);
            	    ruleRule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1638:1: rule__Nested__Group_1_1__2 : rule__Nested__Group_1_1__2__Impl ;
    public final void rule__Nested__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1642:1: ( rule__Nested__Group_1_1__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1643:2: rule__Nested__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__2__Impl_in_rule__Nested__Group_1_1__23335);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1649:1: rule__Nested__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__Nested__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1653:1: ( ( '}' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1654:1: ( '}' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1654:1: ( '}' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1655:1: '}'
            {
             before(grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 
            match(input,23,FOLLOW_23_in_rule__Nested__Group_1_1__2__Impl3363); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1674:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1678:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1679:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03400);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03403);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1686:1: rule__Property__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1690:1: ( ( RULE_ID ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1691:1: ( RULE_ID )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1691:1: ( RULE_ID )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1692:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__Group__0__Impl3430); 
             after(grammarAccess.getPropertyAccess().getIDTerminalRuleCall_0()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1703:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1707:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1708:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13459);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13462);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1715:1: rule__Property__Group__1__Impl : ( '=' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1719:1: ( ( '=' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1720:1: ( '=' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1720:1: ( '=' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1721:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Property__Group__1__Impl3490); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1734:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1738:1: ( rule__Property__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1739:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23521);
            rule__Property__Group__2__Impl();

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1745:1: rule__Property__Group__2__Impl : ( ruleValue ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1749:1: ( ( ruleValue ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1750:1: ( ruleValue )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1750:1: ( ruleValue )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1751:1: ruleValue
            {
             before(grammarAccess.getPropertyAccess().getValueParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Property__Group__2__Impl3548);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValueParserRuleCall_2()); 

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


    // $ANTLR start "rule__Constraint__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1768:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1772:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1773:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03583);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03586);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1780:1: rule__Constraint__Group__0__Impl : ( '@constrain' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1784:1: ( ( '@constrain' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1785:1: ( '@constrain' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1785:1: ( '@constrain' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1786:1: '@constrain'
            {
             before(grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Constraint__Group__0__Impl3614); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1799:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1803:1: ( rule__Constraint__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1804:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13645);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1810:1: rule__Constraint__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1814:1: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1815:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1815:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1816:1: ruleSingleStep
            {
             before(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleStep_in_rule__Constraint__Group__1__Impl3672);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1831:1: rule__SingleStep__Group__0 : rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 ;
    public final void rule__SingleStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1835:1: ( rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1836:2: rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__0__Impl_in_rule__SingleStep__Group__03705);
            rule__SingleStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStep__Group__1_in_rule__SingleStep__Group__03708);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1843:1: rule__SingleStep__Group__0__Impl : ( ruleIdent ) ;
    public final void rule__SingleStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1847:1: ( ( ruleIdent ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1848:1: ( ruleIdent )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1848:1: ( ruleIdent )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1849:1: ruleIdent
            {
             before(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleIdent_in_rule__SingleStep__Group__0__Impl3735);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1860:1: rule__SingleStep__Group__1 : rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 ;
    public final void rule__SingleStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1864:1: ( rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1865:2: rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__1__Impl_in_rule__SingleStep__Group__13764);
            rule__SingleStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStep__Group__2_in_rule__SingleStep__Group__13767);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1872:1: rule__SingleStep__Group__1__Impl : ( ( ruleVals )? ) ;
    public final void rule__SingleStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1876:1: ( ( ( ruleVals )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1877:1: ( ( ruleVals )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1877:1: ( ( ruleVals )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1878:1: ( ruleVals )?
            {
             before(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1879:1: ( ruleVals )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1879:3: ruleVals
                    {
                    pushFollow(FOLLOW_ruleVals_in_rule__SingleStep__Group__1__Impl3795);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1889:1: rule__SingleStep__Group__2 : rule__SingleStep__Group__2__Impl ;
    public final void rule__SingleStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1893:1: ( rule__SingleStep__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1894:2: rule__SingleStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__2__Impl_in_rule__SingleStep__Group__23826);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1900:1: rule__SingleStep__Group__2__Impl : ( ( ruleStepSuffix )? ) ;
    public final void rule__SingleStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1904:1: ( ( ( ruleStepSuffix )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1905:1: ( ( ruleStepSuffix )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1905:1: ( ( ruleStepSuffix )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1906:1: ( ruleStepSuffix )?
            {
             before(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1907:1: ( ruleStepSuffix )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1907:3: ruleStepSuffix
                    {
                    pushFollow(FOLLOW_ruleStepSuffix_in_rule__SingleStep__Group__2__Impl3854);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1923:1: rule__Vals__Group__0 : rule__Vals__Group__0__Impl rule__Vals__Group__1 ;
    public final void rule__Vals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1927:1: ( rule__Vals__Group__0__Impl rule__Vals__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1928:2: rule__Vals__Group__0__Impl rule__Vals__Group__1
            {
            pushFollow(FOLLOW_rule__Vals__Group__0__Impl_in_rule__Vals__Group__03891);
            rule__Vals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vals__Group__1_in_rule__Vals__Group__03894);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1935:1: rule__Vals__Group__0__Impl : ( '.' ) ;
    public final void rule__Vals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1939:1: ( ( '.' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1940:1: ( '.' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1940:1: ( '.' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1941:1: '.'
            {
             before(grammarAccess.getValsAccess().getFullStopKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Vals__Group__0__Impl3922); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1954:1: rule__Vals__Group__1 : rule__Vals__Group__1__Impl rule__Vals__Group__2 ;
    public final void rule__Vals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1958:1: ( rule__Vals__Group__1__Impl rule__Vals__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1959:2: rule__Vals__Group__1__Impl rule__Vals__Group__2
            {
            pushFollow(FOLLOW_rule__Vals__Group__1__Impl_in_rule__Vals__Group__13953);
            rule__Vals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vals__Group__2_in_rule__Vals__Group__13956);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1966:1: rule__Vals__Group__1__Impl : ( ruleIdent ) ;
    public final void rule__Vals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1970:1: ( ( ruleIdent ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1971:1: ( ruleIdent )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1971:1: ( ruleIdent )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1972:1: ruleIdent
            {
             before(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleIdent_in_rule__Vals__Group__1__Impl3983);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1983:1: rule__Vals__Group__2 : rule__Vals__Group__2__Impl ;
    public final void rule__Vals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1987:1: ( rule__Vals__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1988:2: rule__Vals__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Vals__Group__2__Impl_in_rule__Vals__Group__24012);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1994:1: rule__Vals__Group__2__Impl : ( ( ruleVals )* ) ;
    public final void rule__Vals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1998:1: ( ( ( ruleVals )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1999:1: ( ( ruleVals )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1999:1: ( ( ruleVals )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2000:1: ( ruleVals )*
            {
             before(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2001:1: ( ruleVals )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2001:3: ruleVals
            	    {
            	    pushFollow(FOLLOW_ruleVals_in_rule__Vals__Group__2__Impl4040);
            	    ruleVals();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2017:1: rule__StepSuffix__Group__0 : rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 ;
    public final void rule__StepSuffix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2021:1: ( rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2022:2: rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__0__Impl_in_rule__StepSuffix__Group__04077);
            rule__StepSuffix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StepSuffix__Group__1_in_rule__StepSuffix__Group__04080);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2029:1: rule__StepSuffix__Group__0__Impl : ( '/' ) ;
    public final void rule__StepSuffix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2033:1: ( ( '/' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2034:1: ( '/' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2034:1: ( '/' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2035:1: '/'
            {
             before(grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__StepSuffix__Group__0__Impl4108); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2048:1: rule__StepSuffix__Group__1 : rule__StepSuffix__Group__1__Impl ;
    public final void rule__StepSuffix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2052:1: ( rule__StepSuffix__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2053:2: rule__StepSuffix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__1__Impl_in_rule__StepSuffix__Group__14139);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2059:1: rule__StepSuffix__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__StepSuffix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2063:1: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2064:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2064:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2065:1: ruleSingleStep
            {
             before(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleStep_in_rule__StepSuffix__Group__1__Impl4166);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2080:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2084:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2085:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04199);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04202);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2092:1: rule__Import__Group__0__Impl : ( '@import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2096:1: ( ( '@import' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2097:1: ( '@import' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2097:1: ( '@import' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2098:1: '@import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Import__Group__0__Impl4230); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2111:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2115:1: ( rule__Import__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2116:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14261);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2122:1: rule__Import__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2126:1: ( ( RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2127:1: ( RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2127:1: ( RULE_STRING )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2128:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__Group__1__Impl4288); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2144:1: rule__RuleSet__ContextAssignment_0 : ( ruleContext ) ;
    public final void rule__RuleSet__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2148:1: ( ( ruleContext ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2149:1: ( ruleContext )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2149:1: ( ruleContext )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2150:1: ruleContext
            {
             before(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleContext_in_rule__RuleSet__ContextAssignment_04326);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2159:1: rule__RuleSet__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__RuleSet__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2163:1: ( ( ruleRule ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2164:1: ( ruleRule )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2164:1: ( ruleRule )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2165:1: ruleRule
            {
             before(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__RuleSet__RulesAssignment_14357);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2174:1: rule__Context__SelectorAssignment_2 : ( ruleSelector ) ;
    public final void rule__Context__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2178:1: ( ( ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2179:1: ( ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2179:1: ( ruleSelector )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2180:1: ruleSelector
            {
             before(grammarAccess.getContextAccess().getSelectorSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__Context__SelectorAssignment_24388);
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
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebool_in_entryRulebool680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebool687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Alternatives_in_rulebool713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_entryRuleSingleStep860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStep867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__0_in_ruleSingleStep893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_entryRuleIdent920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdent927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ident__Alternatives_in_ruleIdent953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_entryRuleVals980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVals987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__0_in_ruleVals1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix1040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepSuffix1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__0_in_ruleStepSuffix1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__Step__Alternatives1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__0_in_rule__Step__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Rule__Alternatives_01219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Rule__Alternatives_01236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Rule__Alternatives_01253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_rule__Rule__Alternatives_01270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__0_in_rule__Nested__Alternatives_11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__0_in_rule__Nested__Alternatives_11320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Nested__Alternatives_1_0_11353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Nested__Alternatives_1_0_11370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Nested__Alternatives_1_0_11387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Bool__Alternatives1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Bool__Alternatives1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_rule__Value__Alternatives1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Value__Alternatives1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebool_in_rule__Value__Alternatives1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ident__Alternatives1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Ident__Alternatives1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01604 = new BitSet(new long[]{0x00000000120100C0L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__ContextAssignment_0_in_rule__RuleSet__Group__0__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__RulesAssignment_1_in_rule__RuleSet__Group__1__Impl1692 = new BitSet(new long[]{0x00000000120100C2L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01727 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Context__Group__0__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11789 = new BitSet(new long[]{0x00000000120100C0L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Context__Group__1__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21851 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__SelectorAssignment_2_in_rule__Context__Group__2__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__31911 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Context__Group__4_in_rule__Context__Group__31914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Context__Group__3__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__41973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Context__Group__4__Impl2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__02045 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__02048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Selector__Group__0__Impl2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__12104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Selector__Group__1__Impl2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__02170 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__02173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Sum__Group__0__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__12229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__0_in_rule__Sum__Group__1__Impl2256 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__0__Impl_in_rule__Sum__Group_1__02291 = new BitSet(new long[]{0x00000000120100C0L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__1_in_rule__Sum__Group_1__02294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Sum__Group_1__0__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__1__Impl_in_rule__Sum__Group_1__12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Sum__Group_1__1__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02413 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Term__Group__0__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl2499 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__02534 = new BitSet(new long[]{0x00000000000100C0L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__02537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Term__Group_1__0__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Term__Group_1__1__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__0__Impl_in_rule__Step__Group_1__02656 = new BitSet(new long[]{0x00000000120100C0L});
    public static final BitSet FOLLOW_rule__Step__Group_1__1_in_rule__Step__Group_1__02659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Step__Group_1__0__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__1__Impl_in_rule__Step__Group_1__12718 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Step__Group_1__2_in_rule__Step__Group_1__12721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Step__Group_1__1__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__2__Impl_in_rule__Step__Group_1__22777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Step__Group_1__2__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02842 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Rule__Group__1__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__0__Impl_in_rule__Nested__Group__02968 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Nested__Group__1_in_rule__Nested__Group__02971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__Nested__Group__0__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__1__Impl_in_rule__Nested__Group__13027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Alternatives_1_in_rule__Nested__Group__1__Impl3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__0__Impl_in_rule__Nested__Group_1_0__03088 = new BitSet(new long[]{0x0000000012000080L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__1_in_rule__Nested__Group_1_0__03091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Nested__Group_1_0__0__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__1__Impl_in_rule__Nested__Group_1_0__13150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Alternatives_1_0_1_in_rule__Nested__Group_1_0__1__Impl3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__0__Impl_in_rule__Nested__Group_1_1__03211 = new BitSet(new long[]{0x00000000128100C0L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__1_in_rule__Nested__Group_1_1__03214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Nested__Group_1_1__0__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__1__Impl_in_rule__Nested__Group_1_1__13273 = new BitSet(new long[]{0x00000000128100C0L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__2_in_rule__Nested__Group_1_1__13276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Nested__Group_1_1__1__Impl3304 = new BitSet(new long[]{0x00000000120100C2L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__2__Impl_in_rule__Nested__Group_1_1__23335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Nested__Group_1_1__2__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03400 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__Group__0__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13459 = new BitSet(new long[]{0x0000000000006070L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Property__Group__1__Impl3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Property__Group__2__Impl3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03583 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constraint__Group__0__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__Constraint__Group__1__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__0__Impl_in_rule__SingleStep__Group__03705 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__1_in_rule__SingleStep__Group__03708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_rule__SingleStep__Group__0__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__1__Impl_in_rule__SingleStep__Group__13764 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__2_in_rule__SingleStep__Group__13767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_rule__SingleStep__Group__1__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__2__Impl_in_rule__SingleStep__Group__23826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_rule__SingleStep__Group__2__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__0__Impl_in_rule__Vals__Group__03891 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Vals__Group__1_in_rule__Vals__Group__03894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Vals__Group__0__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__1__Impl_in_rule__Vals__Group__13953 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Vals__Group__2_in_rule__Vals__Group__13956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_rule__Vals__Group__1__Impl3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__2__Impl_in_rule__Vals__Group__24012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_rule__Vals__Group__2__Impl4040 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__0__Impl_in_rule__StepSuffix__Group__04077 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__1_in_rule__StepSuffix__Group__04080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StepSuffix__Group__0__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__1__Impl_in_rule__StepSuffix__Group__14139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__StepSuffix__Group__1__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04199 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Import__Group__0__Impl4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__Group__1__Impl4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_rule__RuleSet__ContextAssignment_04326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleSet__RulesAssignment_14357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__Context__SelectorAssignment_24388 = new BitSet(new long[]{0x0000000000000002L});

}