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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEXINT", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'@context'", "'('", "')'", "';'", "'>'", "','", "':'", "'{'", "'}'", "'='", "'@constrain'", "'.'", "'/'", "'@import'"
    };
    public static final int RULE_ID=6;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_HEXINT=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

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

                if ( (LA1_0==RULE_ID) ) {
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:244:1: ruleStep : ( ruleSingleStep ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:248:2: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:249:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:249:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:250:1: ruleSingleStep
            {
             before(grammarAccess.getStepAccess().getSingleStepParserRuleCall()); 
            pushFollow(FOLLOW_ruleSingleStep_in_ruleStep473);
            ruleSingleStep();

            state._fsp--;

             after(grammarAccess.getStepAccess().getSingleStepParserRuleCall()); 

            }


            }

        }
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
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule499);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule506); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:272:1: ruleRule : ( ( rule__Rule__Alternatives ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:276:2: ( ( ( rule__Rule__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:277:1: ( ( rule__Rule__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:277:1: ( ( rule__Rule__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:278:1: ( rule__Rule__Alternatives )
            {
             before(grammarAccess.getRuleAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:279:1: ( rule__Rule__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:279:2: rule__Rule__Alternatives
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_in_ruleRule532);
            rule__Rule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives()); 

            }


            }

        }
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
            pushFollow(FOLLOW_ruleNested_in_entryRuleNested559);
            ruleNested();

            state._fsp--;

             after(grammarAccess.getNestedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNested566); 

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
            pushFollow(FOLLOW_rule__Nested__Group__0_in_ruleNested592);
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
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty619);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty626); 

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
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty652);
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


    // $ANTLR start "entryRuleValue"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:347:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:348:1: ( ruleValue EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:349:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue679);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue686); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:356:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:360:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:361:1: ( ( rule__Value__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:361:1: ( ( rule__Value__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:362:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:363:1: ( rule__Value__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:363:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue712);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:375:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:376:1: ( ruleConstraint EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:377:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint739);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint746); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:384:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:388:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:389:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:389:1: ( ( rule__Constraint__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:390:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:391:1: ( rule__Constraint__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:391:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint772);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:403:1: entryRuleSingleStep : ruleSingleStep EOF ;
    public final void entryRuleSingleStep() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:404:1: ( ruleSingleStep EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:405:1: ruleSingleStep EOF
            {
             before(grammarAccess.getSingleStepRule()); 
            pushFollow(FOLLOW_ruleSingleStep_in_entryRuleSingleStep799);
            ruleSingleStep();

            state._fsp--;

             after(grammarAccess.getSingleStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStep806); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:412:1: ruleSingleStep : ( ( rule__SingleStep__Group__0 ) ) ;
    public final void ruleSingleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:416:2: ( ( ( rule__SingleStep__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:417:1: ( ( rule__SingleStep__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:417:1: ( ( rule__SingleStep__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:418:1: ( rule__SingleStep__Group__0 )
            {
             before(grammarAccess.getSingleStepAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:419:1: ( rule__SingleStep__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:419:2: rule__SingleStep__Group__0
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__0_in_ruleSingleStep832);
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


    // $ANTLR start "entryRuleVals"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:431:1: entryRuleVals : ruleVals EOF ;
    public final void entryRuleVals() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:432:1: ( ruleVals EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:433:1: ruleVals EOF
            {
             before(grammarAccess.getValsRule()); 
            pushFollow(FOLLOW_ruleVals_in_entryRuleVals859);
            ruleVals();

            state._fsp--;

             after(grammarAccess.getValsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVals866); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:440:1: ruleVals : ( ( rule__Vals__Group__0 ) ) ;
    public final void ruleVals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:444:2: ( ( ( rule__Vals__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:445:1: ( ( rule__Vals__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:445:1: ( ( rule__Vals__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:446:1: ( rule__Vals__Group__0 )
            {
             before(grammarAccess.getValsAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:447:1: ( rule__Vals__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:447:2: rule__Vals__Group__0
            {
            pushFollow(FOLLOW_rule__Vals__Group__0_in_ruleVals892);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:459:1: entryRuleStepSuffix : ruleStepSuffix EOF ;
    public final void entryRuleStepSuffix() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:460:1: ( ruleStepSuffix EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:461:1: ruleStepSuffix EOF
            {
             before(grammarAccess.getStepSuffixRule()); 
            pushFollow(FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix919);
            ruleStepSuffix();

            state._fsp--;

             after(grammarAccess.getStepSuffixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepSuffix926); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:468:1: ruleStepSuffix : ( ( rule__StepSuffix__Group__0 ) ) ;
    public final void ruleStepSuffix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:472:2: ( ( ( rule__StepSuffix__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:473:1: ( ( rule__StepSuffix__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:473:1: ( ( rule__StepSuffix__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:474:1: ( rule__StepSuffix__Group__0 )
            {
             before(grammarAccess.getStepSuffixAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:475:1: ( rule__StepSuffix__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:475:2: rule__StepSuffix__Group__0
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__0_in_ruleStepSuffix952);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:487:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:488:1: ( ruleImport EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:489:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport979);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport986); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:496:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:500:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:501:1: ( ( rule__Import__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:501:1: ( ( rule__Import__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:502:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:503:1: ( rule__Import__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:503:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport1012);
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


    // $ANTLR start "rule__Rule__Alternatives"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:515:1: rule__Rule__Alternatives : ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) | ( ruleNested ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:519:1: ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) | ( ruleNested ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==23) ) {
                    alt2=3;
                }
                else if ( (LA2_3==RULE_ID||(LA2_3>=18 && LA2_3<=21)||(LA2_3>=25 && LA2_3<=26)) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:520:1: ( ruleImport )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:520:1: ( ruleImport )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:521:1: ruleImport
                    {
                     before(grammarAccess.getRuleAccess().getImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__Rule__Alternatives1048);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:526:6: ( ruleConstraint )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:526:6: ( ruleConstraint )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:527:1: ruleConstraint
                    {
                     before(grammarAccess.getRuleAccess().getConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__Rule__Alternatives1065);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getConstraintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:532:6: ( ruleProperty )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:532:6: ( ruleProperty )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:533:1: ruleProperty
                    {
                     before(grammarAccess.getRuleAccess().getPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleProperty_in_rule__Rule__Alternatives1082);
                    ruleProperty();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getPropertyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:538:6: ( ruleNested )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:538:6: ( ruleNested )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:539:1: ruleNested
                    {
                     before(grammarAccess.getRuleAccess().getNestedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNested_in_rule__Rule__Alternatives1099);
                    ruleNested();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getNestedParserRuleCall_3()); 

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
    // $ANTLR end "rule__Rule__Alternatives"


    // $ANTLR start "rule__Nested__Alternatives_1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:549:1: rule__Nested__Alternatives_1 : ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) );
    public final void rule__Nested__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:553:1: ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:554:1: ( ( rule__Nested__Group_1_0__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:554:1: ( ( rule__Nested__Group_1_0__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:555:1: ( rule__Nested__Group_1_0__0 )
                    {
                     before(grammarAccess.getNestedAccess().getGroup_1_0()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:556:1: ( rule__Nested__Group_1_0__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:556:2: rule__Nested__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Nested__Group_1_0__0_in_rule__Nested__Alternatives_11131);
                    rule__Nested__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:560:6: ( ( rule__Nested__Group_1_1__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:560:6: ( ( rule__Nested__Group_1_1__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:561:1: ( rule__Nested__Group_1_1__0 )
                    {
                     before(grammarAccess.getNestedAccess().getGroup_1_1()); 
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:562:1: ( rule__Nested__Group_1_1__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:562:2: rule__Nested__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Nested__Group_1_1__0_in_rule__Nested__Alternatives_11149);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:571:1: rule__Nested__Alternatives_1_0_1 : ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) );
    public final void rule__Nested__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:575:1: ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:576:1: ( ruleImport )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:576:1: ( ruleImport )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:577:1: ruleImport
                    {
                     before(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__Nested__Alternatives_1_0_11182);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:582:6: ( ruleConstraint )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:582:6: ( ruleConstraint )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:583:1: ruleConstraint
                    {
                     before(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__Nested__Alternatives_1_0_11199);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:588:6: ( ruleProperty )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:588:6: ( ruleProperty )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:589:1: ruleProperty
                    {
                     before(grammarAccess.getNestedAccess().getPropertyParserRuleCall_1_0_1_2()); 
                    pushFollow(FOLLOW_ruleProperty_in_rule__Nested__Alternatives_1_0_11216);
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


    // $ANTLR start "rule__Value__Alternatives"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:599:1: rule__Value__Alternatives : ( ( RULE_HEXINT ) | ( RULE_INT ) | ( 'true' ) | ( 'false' ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:603:1: ( ( RULE_HEXINT ) | ( RULE_INT ) | ( 'true' ) | ( 'false' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_HEXINT:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case 12:
                {
                alt5=3;
                }
                break;
            case 13:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:604:1: ( RULE_HEXINT )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:604:1: ( RULE_HEXINT )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:605:1: RULE_HEXINT
                    {
                     before(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_rule__Value__Alternatives1248); 
                     after(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:610:6: ( RULE_INT )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:610:6: ( RULE_INT )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:611:1: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Value__Alternatives1265); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:616:6: ( 'true' )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:616:6: ( 'true' )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:617:1: 'true'
                    {
                     before(grammarAccess.getValueAccess().getTrueKeyword_2()); 
                    match(input,12,FOLLOW_12_in_rule__Value__Alternatives1283); 
                     after(grammarAccess.getValueAccess().getTrueKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:624:6: ( 'false' )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:624:6: ( 'false' )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:625:1: 'false'
                    {
                     before(grammarAccess.getValueAccess().getFalseKeyword_3()); 
                    match(input,13,FOLLOW_13_in_rule__Value__Alternatives1303); 
                     after(grammarAccess.getValueAccess().getFalseKeyword_3()); 

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


    // $ANTLR start "rule__RuleSet__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:639:1: rule__RuleSet__Group__0 : rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 ;
    public final void rule__RuleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:643:1: ( rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:644:2: rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01335);
            rule__RuleSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01338);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:651:1: rule__RuleSet__Group__0__Impl : ( ( rule__RuleSet__ContextAssignment_0 )? ) ;
    public final void rule__RuleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:655:1: ( ( ( rule__RuleSet__ContextAssignment_0 )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:656:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:656:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:657:1: ( rule__RuleSet__ContextAssignment_0 )?
            {
             before(grammarAccess.getRuleSetAccess().getContextAssignment_0()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:658:1: ( rule__RuleSet__ContextAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:658:2: rule__RuleSet__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RuleSet__ContextAssignment_0_in_rule__RuleSet__Group__0__Impl1365);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:668:1: rule__RuleSet__Group__1 : rule__RuleSet__Group__1__Impl ;
    public final void rule__RuleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:672:1: ( rule__RuleSet__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:673:2: rule__RuleSet__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11396);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:679:1: rule__RuleSet__Group__1__Impl : ( ( rule__RuleSet__RulesAssignment_1 )* ) ;
    public final void rule__RuleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:683:1: ( ( ( rule__RuleSet__RulesAssignment_1 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:684:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:684:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:685:1: ( rule__RuleSet__RulesAssignment_1 )*
            {
             before(grammarAccess.getRuleSetAccess().getRulesAssignment_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:686:1: ( rule__RuleSet__RulesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==24||LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:686:2: rule__RuleSet__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__RuleSet__RulesAssignment_1_in_rule__RuleSet__Group__1__Impl1423);
            	    rule__RuleSet__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:700:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:704:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:705:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01458);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01461);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:712:1: rule__Context__Group__0__Impl : ( '@context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:716:1: ( ( '@context' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:717:1: ( '@context' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:717:1: ( '@context' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:718:1: '@context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Context__Group__0__Impl1489); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:731:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:735:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:736:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11520);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11523);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:743:1: rule__Context__Group__1__Impl : ( '(' ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:747:1: ( ( '(' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:748:1: ( '(' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:748:1: ( '(' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:749:1: '('
            {
             before(grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Context__Group__1__Impl1551); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:762:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:766:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:767:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21582);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21585);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:774:1: rule__Context__Group__2__Impl : ( ruleSelector ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:778:1: ( ( ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:779:1: ( ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:779:1: ( ruleSelector )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:780:1: ruleSelector
            {
             before(grammarAccess.getContextAccess().getSelectorParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__Context__Group__2__Impl1612);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getContextAccess().getSelectorParserRuleCall_2()); 

            }


            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:791:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:795:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:796:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__31641);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__4_in_rule__Context__Group__31644);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:803:1: rule__Context__Group__3__Impl : ( ')' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:807:1: ( ( ')' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:808:1: ( ')' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:808:1: ( ')' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:809:1: ')'
            {
             before(grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Context__Group__3__Impl1672); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:822:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:826:1: ( rule__Context__Group__4__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:827:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__41703);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:833:1: rule__Context__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:837:1: ( ( ( ';' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:838:1: ( ( ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:838:1: ( ( ';' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:839:1: ( ';' )?
            {
             before(grammarAccess.getContextAccess().getSemicolonKeyword_4()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:840:1: ( ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:841:2: ';'
                    {
                    match(input,17,FOLLOW_17_in_rule__Context__Group__4__Impl1732); 

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:862:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:866:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:867:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__01775);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__01778);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:874:1: rule__Selector__Group__0__Impl : ( ruleSum ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:878:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:879:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:879:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:880:1: ruleSum
            {
             before(grammarAccess.getSelectorAccess().getSumParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSum_in_rule__Selector__Group__0__Impl1805);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:891:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:895:1: ( rule__Selector__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:896:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__11834);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:902:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Group_1__0 )* ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:906:1: ( ( ( rule__Selector__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:907:1: ( ( rule__Selector__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:907:1: ( ( rule__Selector__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:908:1: ( rule__Selector__Group_1__0 )*
            {
             before(grammarAccess.getSelectorAccess().getGroup_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:909:1: ( rule__Selector__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:909:2: rule__Selector__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Selector__Group_1__0_in_rule__Selector__Group__1__Impl1861);
            	    rule__Selector__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSelectorAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Selector__Group_1__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:923:1: rule__Selector__Group_1__0 : rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 ;
    public final void rule__Selector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:927:1: ( rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:928:2: rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1__0__Impl_in_rule__Selector__Group_1__01896);
            rule__Selector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1__1_in_rule__Selector__Group_1__01899);
            rule__Selector__Group_1__1();

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
    // $ANTLR end "rule__Selector__Group_1__0"


    // $ANTLR start "rule__Selector__Group_1__0__Impl"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:935:1: rule__Selector__Group_1__0__Impl : ( '>' ) ;
    public final void rule__Selector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:939:1: ( ( '>' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:940:1: ( '>' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:940:1: ( '>' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:941:1: '>'
            {
             before(grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Selector__Group_1__0__Impl1927); 
             after(grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:954:1: rule__Selector__Group_1__1 : rule__Selector__Group_1__1__Impl ;
    public final void rule__Selector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:958:1: ( rule__Selector__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:959:2: rule__Selector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1__1__Impl_in_rule__Selector__Group_1__11958);
            rule__Selector__Group_1__1__Impl();

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
    // $ANTLR end "rule__Selector__Group_1__1"


    // $ANTLR start "rule__Selector__Group_1__1__Impl"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:965:1: rule__Selector__Group_1__1__Impl : ( ruleSum ) ;
    public final void rule__Selector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:969:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:970:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:970:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:971:1: ruleSum
            {
             before(grammarAccess.getSelectorAccess().getSumParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSum_in_rule__Selector__Group_1__1__Impl1985);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSumParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__1__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:986:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:990:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:991:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__02018);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__02021);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:998:1: rule__Sum__Group__0__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1002:1: ( ( ruleProduct ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1003:1: ( ruleProduct )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1003:1: ( ruleProduct )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1004:1: ruleProduct
            {
             before(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProduct_in_rule__Sum__Group__0__Impl2048);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1015:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1019:1: ( rule__Sum__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1020:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__12077);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1026:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1030:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1031:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1031:1: ( ( rule__Sum__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1032:1: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1033:1: ( rule__Sum__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1033:2: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Sum__Group_1__0_in_rule__Sum__Group__1__Impl2104);
            	    rule__Sum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1047:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1051:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1052:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_rule__Sum__Group_1__0__Impl_in_rule__Sum__Group_1__02139);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sum__Group_1__1_in_rule__Sum__Group_1__02142);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1059:1: rule__Sum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1063:1: ( ( ',' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1064:1: ( ',' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1064:1: ( ',' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1065:1: ','
            {
             before(grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Sum__Group_1__0__Impl2170); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1078:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1082:1: ( rule__Sum__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1083:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sum__Group_1__1__Impl_in_rule__Sum__Group_1__12201);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1089:1: rule__Sum__Group_1__1__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1093:1: ( ( ruleProduct ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1094:1: ( ruleProduct )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1094:1: ( ruleProduct )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1095:1: ruleProduct
            {
             before(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleProduct_in_rule__Sum__Group_1__1__Impl2228);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1110:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1114:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1115:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02261);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02264);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1122:1: rule__Term__Group__0__Impl : ( ruleStep ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1126:1: ( ( ruleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1127:1: ( ruleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1127:1: ( ruleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1128:1: ruleStep
            {
             before(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Term__Group__0__Impl2291);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1139:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1143:1: ( rule__Term__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1144:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12320);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1150:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1154:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1155:1: ( ( rule__Term__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1155:1: ( ( rule__Term__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1156:1: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1157:1: ( rule__Term__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1157:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl2347);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1171:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1175:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1176:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__02382);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__02385);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1183:1: rule__Term__Group_1__0__Impl : ( '>' ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1187:1: ( ( '>' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1188:1: ( '>' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1188:1: ( '>' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1189:1: '>'
            {
             before(grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Term__Group_1__0__Impl2413); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1202:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1206:1: ( rule__Term__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1207:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__12444);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1213:1: rule__Term__Group_1__1__Impl : ( ruleStep ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1217:1: ( ( ruleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1218:1: ( ruleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1218:1: ( ruleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1219:1: ruleStep
            {
             before(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Term__Group_1__1__Impl2471);
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


    // $ANTLR start "rule__Nested__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1234:1: rule__Nested__Group__0 : rule__Nested__Group__0__Impl rule__Nested__Group__1 ;
    public final void rule__Nested__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1238:1: ( rule__Nested__Group__0__Impl rule__Nested__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1239:2: rule__Nested__Group__0__Impl rule__Nested__Group__1
            {
            pushFollow(FOLLOW_rule__Nested__Group__0__Impl_in_rule__Nested__Group__02504);
            rule__Nested__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group__1_in_rule__Nested__Group__02507);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1246:1: rule__Nested__Group__0__Impl : ( ruleSelector ) ;
    public final void rule__Nested__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1250:1: ( ( ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1251:1: ( ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1251:1: ( ruleSelector )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1252:1: ruleSelector
            {
             before(grammarAccess.getNestedAccess().getSelectorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__Nested__Group__0__Impl2534);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1263:1: rule__Nested__Group__1 : rule__Nested__Group__1__Impl ;
    public final void rule__Nested__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1267:1: ( rule__Nested__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1268:2: rule__Nested__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group__1__Impl_in_rule__Nested__Group__12563);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1274:1: rule__Nested__Group__1__Impl : ( ( rule__Nested__Alternatives_1 ) ) ;
    public final void rule__Nested__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1278:1: ( ( ( rule__Nested__Alternatives_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1279:1: ( ( rule__Nested__Alternatives_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1279:1: ( ( rule__Nested__Alternatives_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1280:1: ( rule__Nested__Alternatives_1 )
            {
             before(grammarAccess.getNestedAccess().getAlternatives_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1281:1: ( rule__Nested__Alternatives_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1281:2: rule__Nested__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Nested__Alternatives_1_in_rule__Nested__Group__1__Impl2590);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1295:1: rule__Nested__Group_1_0__0 : rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 ;
    public final void rule__Nested__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1299:1: ( rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1300:2: rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_0__0__Impl_in_rule__Nested__Group_1_0__02624);
            rule__Nested__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_0__1_in_rule__Nested__Group_1_0__02627);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1307:1: rule__Nested__Group_1_0__0__Impl : ( ':' ) ;
    public final void rule__Nested__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1311:1: ( ( ':' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1312:1: ( ':' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1312:1: ( ':' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1313:1: ':'
            {
             before(grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Nested__Group_1_0__0__Impl2655); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1326:1: rule__Nested__Group_1_0__1 : rule__Nested__Group_1_0__1__Impl ;
    public final void rule__Nested__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1330:1: ( rule__Nested__Group_1_0__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1331:2: rule__Nested__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_0__1__Impl_in_rule__Nested__Group_1_0__12686);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1337:1: rule__Nested__Group_1_0__1__Impl : ( ( rule__Nested__Alternatives_1_0_1 ) ) ;
    public final void rule__Nested__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1341:1: ( ( ( rule__Nested__Alternatives_1_0_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1342:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1342:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1343:1: ( rule__Nested__Alternatives_1_0_1 )
            {
             before(grammarAccess.getNestedAccess().getAlternatives_1_0_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1344:1: ( rule__Nested__Alternatives_1_0_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1344:2: rule__Nested__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__Nested__Alternatives_1_0_1_in_rule__Nested__Group_1_0__1__Impl2713);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1358:1: rule__Nested__Group_1_1__0 : rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 ;
    public final void rule__Nested__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1362:1: ( rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1363:2: rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__0__Impl_in_rule__Nested__Group_1_1__02747);
            rule__Nested__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_1__1_in_rule__Nested__Group_1_1__02750);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1370:1: rule__Nested__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__Nested__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1374:1: ( ( '{' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1375:1: ( '{' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1375:1: ( '{' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1376:1: '{'
            {
             before(grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Nested__Group_1_1__0__Impl2778); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1389:1: rule__Nested__Group_1_1__1 : rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 ;
    public final void rule__Nested__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1393:1: ( rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1394:2: rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__1__Impl_in_rule__Nested__Group_1_1__12809);
            rule__Nested__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nested__Group_1_1__2_in_rule__Nested__Group_1_1__12812);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1401:1: rule__Nested__Group_1_1__1__Impl : ( ( ruleRule )* ) ;
    public final void rule__Nested__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1405:1: ( ( ( ruleRule )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1406:1: ( ( ruleRule )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1406:1: ( ( ruleRule )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1407:1: ( ruleRule )*
            {
             before(grammarAccess.getNestedAccess().getRuleParserRuleCall_1_1_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1408:1: ( ruleRule )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==24||LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1408:3: ruleRule
            	    {
            	    pushFollow(FOLLOW_ruleRule_in_rule__Nested__Group_1_1__1__Impl2840);
            	    ruleRule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1418:1: rule__Nested__Group_1_1__2 : rule__Nested__Group_1_1__2__Impl ;
    public final void rule__Nested__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1422:1: ( rule__Nested__Group_1_1__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1423:2: rule__Nested__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__2__Impl_in_rule__Nested__Group_1_1__22871);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1429:1: rule__Nested__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__Nested__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1433:1: ( ( '}' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1434:1: ( '}' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1434:1: ( '}' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1435:1: '}'
            {
             before(grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 
            match(input,22,FOLLOW_22_in_rule__Nested__Group_1_1__2__Impl2899); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1454:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1458:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1459:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__02936);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__02939);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1466:1: rule__Property__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1470:1: ( ( RULE_ID ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1471:1: ( RULE_ID )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1471:1: ( RULE_ID )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1472:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__Group__0__Impl2966); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1483:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1487:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1488:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__12995);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__12998);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1495:1: rule__Property__Group__1__Impl : ( '=' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1499:1: ( ( '=' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1500:1: ( '=' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1500:1: ( '=' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1501:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Property__Group__1__Impl3026); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1514:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1518:1: ( rule__Property__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1519:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23057);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1525:1: rule__Property__Group__2__Impl : ( ruleValue ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1529:1: ( ( ruleValue ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1530:1: ( ruleValue )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1530:1: ( ruleValue )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1531:1: ruleValue
            {
             before(grammarAccess.getPropertyAccess().getValueParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Property__Group__2__Impl3084);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1548:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1552:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1553:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03119);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03122);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1560:1: rule__Constraint__Group__0__Impl : ( '@constrain' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1564:1: ( ( '@constrain' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1565:1: ( '@constrain' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1565:1: ( '@constrain' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1566:1: '@constrain'
            {
             before(grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Constraint__Group__0__Impl3150); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1579:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1583:1: ( rule__Constraint__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1584:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13181);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1590:1: rule__Constraint__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1594:1: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1595:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1595:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1596:1: ruleSingleStep
            {
             before(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleStep_in_rule__Constraint__Group__1__Impl3208);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1611:1: rule__SingleStep__Group__0 : rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 ;
    public final void rule__SingleStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1615:1: ( rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1616:2: rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__0__Impl_in_rule__SingleStep__Group__03241);
            rule__SingleStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStep__Group__1_in_rule__SingleStep__Group__03244);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1623:1: rule__SingleStep__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SingleStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1627:1: ( ( RULE_ID ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1628:1: ( RULE_ID )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1628:1: ( RULE_ID )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1629:1: RULE_ID
            {
             before(grammarAccess.getSingleStepAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleStep__Group__0__Impl3271); 
             after(grammarAccess.getSingleStepAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1640:1: rule__SingleStep__Group__1 : rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 ;
    public final void rule__SingleStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1644:1: ( rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1645:2: rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__1__Impl_in_rule__SingleStep__Group__13300);
            rule__SingleStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStep__Group__2_in_rule__SingleStep__Group__13303);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1652:1: rule__SingleStep__Group__1__Impl : ( ( ruleVals )? ) ;
    public final void rule__SingleStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1656:1: ( ( ( ruleVals )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1657:1: ( ( ruleVals )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1657:1: ( ( ruleVals )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1658:1: ( ruleVals )?
            {
             before(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1659:1: ( ruleVals )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1659:3: ruleVals
                    {
                    pushFollow(FOLLOW_ruleVals_in_rule__SingleStep__Group__1__Impl3331);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1669:1: rule__SingleStep__Group__2 : rule__SingleStep__Group__2__Impl ;
    public final void rule__SingleStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1673:1: ( rule__SingleStep__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1674:2: rule__SingleStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__2__Impl_in_rule__SingleStep__Group__23362);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1680:1: rule__SingleStep__Group__2__Impl : ( ( ruleStepSuffix )? ) ;
    public final void rule__SingleStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1684:1: ( ( ( ruleStepSuffix )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1685:1: ( ( ruleStepSuffix )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1685:1: ( ( ruleStepSuffix )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1686:1: ( ruleStepSuffix )?
            {
             before(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1687:1: ( ruleStepSuffix )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1687:3: ruleStepSuffix
                    {
                    pushFollow(FOLLOW_ruleStepSuffix_in_rule__SingleStep__Group__2__Impl3390);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1703:1: rule__Vals__Group__0 : rule__Vals__Group__0__Impl rule__Vals__Group__1 ;
    public final void rule__Vals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1707:1: ( rule__Vals__Group__0__Impl rule__Vals__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1708:2: rule__Vals__Group__0__Impl rule__Vals__Group__1
            {
            pushFollow(FOLLOW_rule__Vals__Group__0__Impl_in_rule__Vals__Group__03427);
            rule__Vals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vals__Group__1_in_rule__Vals__Group__03430);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1715:1: rule__Vals__Group__0__Impl : ( '.' ) ;
    public final void rule__Vals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1719:1: ( ( '.' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1720:1: ( '.' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1720:1: ( '.' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1721:1: '.'
            {
             before(grammarAccess.getValsAccess().getFullStopKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Vals__Group__0__Impl3458); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1734:1: rule__Vals__Group__1 : rule__Vals__Group__1__Impl rule__Vals__Group__2 ;
    public final void rule__Vals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1738:1: ( rule__Vals__Group__1__Impl rule__Vals__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1739:2: rule__Vals__Group__1__Impl rule__Vals__Group__2
            {
            pushFollow(FOLLOW_rule__Vals__Group__1__Impl_in_rule__Vals__Group__13489);
            rule__Vals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vals__Group__2_in_rule__Vals__Group__13492);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1746:1: rule__Vals__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Vals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1750:1: ( ( RULE_ID ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1751:1: ( RULE_ID )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1751:1: ( RULE_ID )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1752:1: RULE_ID
            {
             before(grammarAccess.getValsAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Vals__Group__1__Impl3519); 
             after(grammarAccess.getValsAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1763:1: rule__Vals__Group__2 : rule__Vals__Group__2__Impl ;
    public final void rule__Vals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1767:1: ( rule__Vals__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1768:2: rule__Vals__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Vals__Group__2__Impl_in_rule__Vals__Group__23548);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1774:1: rule__Vals__Group__2__Impl : ( ( ruleVals )* ) ;
    public final void rule__Vals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1778:1: ( ( ( ruleVals )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1779:1: ( ( ruleVals )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1779:1: ( ( ruleVals )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1780:1: ( ruleVals )*
            {
             before(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1781:1: ( ruleVals )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1781:3: ruleVals
            	    {
            	    pushFollow(FOLLOW_ruleVals_in_rule__Vals__Group__2__Impl3576);
            	    ruleVals();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1797:1: rule__StepSuffix__Group__0 : rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 ;
    public final void rule__StepSuffix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1801:1: ( rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1802:2: rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__0__Impl_in_rule__StepSuffix__Group__03613);
            rule__StepSuffix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StepSuffix__Group__1_in_rule__StepSuffix__Group__03616);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1809:1: rule__StepSuffix__Group__0__Impl : ( '/' ) ;
    public final void rule__StepSuffix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1813:1: ( ( '/' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1814:1: ( '/' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1814:1: ( '/' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1815:1: '/'
            {
             before(grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__StepSuffix__Group__0__Impl3644); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1828:1: rule__StepSuffix__Group__1 : rule__StepSuffix__Group__1__Impl ;
    public final void rule__StepSuffix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1832:1: ( rule__StepSuffix__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1833:2: rule__StepSuffix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__1__Impl_in_rule__StepSuffix__Group__13675);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1839:1: rule__StepSuffix__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__StepSuffix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1843:1: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1844:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1844:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1845:1: ruleSingleStep
            {
             before(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleStep_in_rule__StepSuffix__Group__1__Impl3702);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1860:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1864:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1865:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03735);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03738);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1872:1: rule__Import__Group__0__Impl : ( '@import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1876:1: ( ( '@import' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1877:1: ( '@import' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1877:1: ( '@import' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1878:1: '@import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Import__Group__0__Impl3766); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1891:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1895:1: ( rule__Import__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1896:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13797);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1902:1: rule__Import__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1906:1: ( ( RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1907:1: ( RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1907:1: ( RULE_STRING )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1908:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__Group__1__Impl3824); 
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1924:1: rule__RuleSet__ContextAssignment_0 : ( ruleContext ) ;
    public final void rule__RuleSet__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1928:1: ( ( ruleContext ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1929:1: ( ruleContext )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1929:1: ( ruleContext )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1930:1: ruleContext
            {
             before(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleContext_in_rule__RuleSet__ContextAssignment_03862);
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1939:1: rule__RuleSet__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__RuleSet__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1943:1: ( ( ruleRule ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1944:1: ( ruleRule )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1944:1: ( ruleRule )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1945:1: ruleRule
            {
             before(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__RuleSet__RulesAssignment_13893);
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
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct337 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct350 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleStep473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_in_ruleRule532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_entryRuleNested559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNested566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__0_in_ruleNested592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_entryRuleSingleStep799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStep806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__0_in_ruleSingleStep832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_entryRuleVals859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVals866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__0_in_ruleVals892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepSuffix926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__0_in_ruleStepSuffix952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Rule__Alternatives1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Rule__Alternatives1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Rule__Alternatives1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_rule__Rule__Alternatives1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__0_in_rule__Nested__Alternatives_11131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__0_in_rule__Nested__Alternatives_11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Nested__Alternatives_1_0_11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Nested__Alternatives_1_0_11199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Nested__Alternatives_1_0_11216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_rule__Value__Alternatives1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Value__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Value__Alternatives1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Value__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01335 = new BitSet(new long[]{0x0000000009000040L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__ContextAssignment_0_in_rule__RuleSet__Group__0__Impl1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__RulesAssignment_1_in_rule__RuleSet__Group__1__Impl1423 = new BitSet(new long[]{0x0000000009000042L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01458 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Context__Group__0__Impl1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11520 = new BitSet(new long[]{0x0000000009000040L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Context__Group__1__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21582 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__Context__Group__2__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__31641 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Context__Group__4_in_rule__Context__Group__31644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Context__Group__3__Impl1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__41703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Context__Group__4__Impl1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__01775 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__01778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Selector__Group__0__Impl1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__11834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__0_in_rule__Selector__Group__1__Impl1861 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__0__Impl_in_rule__Selector__Group_1__01896 = new BitSet(new long[]{0x0000000009000040L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__1_in_rule__Selector__Group_1__01899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Selector__Group_1__0__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__1__Impl_in_rule__Selector__Group_1__11958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Selector__Group_1__1__Impl1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__02018 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__02021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Sum__Group__0__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__12077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__0_in_rule__Sum__Group__1__Impl2104 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__0__Impl_in_rule__Sum__Group_1__02139 = new BitSet(new long[]{0x0000000009000040L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__1_in_rule__Sum__Group_1__02142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sum__Group_1__0__Impl2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__1__Impl_in_rule__Sum__Group_1__12201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Sum__Group_1__1__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02261 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Term__Group__0__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl2347 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__02382 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__02385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Term__Group_1__0__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__12444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Term__Group_1__1__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__0__Impl_in_rule__Nested__Group__02504 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Nested__Group__1_in_rule__Nested__Group__02507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__Nested__Group__0__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__1__Impl_in_rule__Nested__Group__12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Alternatives_1_in_rule__Nested__Group__1__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__0__Impl_in_rule__Nested__Group_1_0__02624 = new BitSet(new long[]{0x0000000009000040L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__1_in_rule__Nested__Group_1_0__02627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Nested__Group_1_0__0__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__1__Impl_in_rule__Nested__Group_1_0__12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Alternatives_1_0_1_in_rule__Nested__Group_1_0__1__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__0__Impl_in_rule__Nested__Group_1_1__02747 = new BitSet(new long[]{0x0000000009400040L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__1_in_rule__Nested__Group_1_1__02750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Nested__Group_1_1__0__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__1__Impl_in_rule__Nested__Group_1_1__12809 = new BitSet(new long[]{0x0000000009400040L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__2_in_rule__Nested__Group_1_1__12812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Nested__Group_1_1__1__Impl2840 = new BitSet(new long[]{0x0000000009000042L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__2__Impl_in_rule__Nested__Group_1_1__22871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Nested__Group_1_1__2__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__02936 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__02939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__Group__0__Impl2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__12995 = new BitSet(new long[]{0x0000000000003030L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__12998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Property__Group__1__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Property__Group__2__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constraint__Group__0__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__Constraint__Group__1__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__0__Impl_in_rule__SingleStep__Group__03241 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__1_in_rule__SingleStep__Group__03244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleStep__Group__0__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__1__Impl_in_rule__SingleStep__Group__13300 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__2_in_rule__SingleStep__Group__13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_rule__SingleStep__Group__1__Impl3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__2__Impl_in_rule__SingleStep__Group__23362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_rule__SingleStep__Group__2__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__0__Impl_in_rule__Vals__Group__03427 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Vals__Group__1_in_rule__Vals__Group__03430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Vals__Group__0__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__1__Impl_in_rule__Vals__Group__13489 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Vals__Group__2_in_rule__Vals__Group__13492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Vals__Group__1__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__2__Impl_in_rule__Vals__Group__23548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_rule__Vals__Group__2__Impl3576 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__0__Impl_in_rule__StepSuffix__Group__03613 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__1_in_rule__StepSuffix__Group__03616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StepSuffix__Group__0__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__1__Impl_in_rule__StepSuffix__Group__13675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__StepSuffix__Group__1__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03735 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Import__Group__0__Impl3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__Group__1__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_rule__RuleSet__ContextAssignment_03862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleSet__RulesAssignment_13893 = new BitSet(new long[]{0x0000000000000002L});

}