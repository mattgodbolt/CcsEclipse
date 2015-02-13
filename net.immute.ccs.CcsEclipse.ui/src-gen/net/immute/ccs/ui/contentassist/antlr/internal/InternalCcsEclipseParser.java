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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCcsEclipseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEXINT", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'@context'", "'('", "')'", "';'", "'>'", "','", "':'", "'{'", "'}'", "'='", "'@constrain'", "'.'", "'/'", "'@import'"
    };
    public static final int RULE_ID=7;
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
    public static final int RULE_STRING=6;
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:61:1: entryRuleRuleSet : ruleRuleSet EOF ;
    public final void entryRuleRuleSet() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:62:1: ( ruleRuleSet EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:63:1: ruleRuleSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetRule()); 
            }
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet67);
            ruleRuleSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet74); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:70:1: ruleRuleSet : ( ( rule__RuleSet__Group__0 ) ) ;
    public final void ruleRuleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:74:2: ( ( ( rule__RuleSet__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:75:1: ( ( rule__RuleSet__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:75:1: ( ( rule__RuleSet__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:76:1: ( rule__RuleSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:77:1: ( rule__RuleSet__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:77:2: rule__RuleSet__Group__0
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__0_in_ruleRuleSet100);
            rule__RuleSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getGroup()); 
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
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleContext"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:89:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:90:1: ( ruleContext EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:91:1: ruleContext EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextRule()); 
            }
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext127);
            ruleContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext134); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:98:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:102:2: ( ( ( rule__Context__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:103:1: ( ( rule__Context__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:103:1: ( ( rule__Context__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:104:1: ( rule__Context__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:105:1: ( rule__Context__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:105:2: rule__Context__Group__0
            {
            pushFollow(FOLLOW_rule__Context__Group__0_in_ruleContext160);
            rule__Context__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextAccess().getGroup()); 
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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleSelector"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:117:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:118:1: ( ruleSelector EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:119:1: ruleSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector187);
            ruleSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector194); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:126:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:130:2: ( ( ( rule__Selector__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:131:1: ( ( rule__Selector__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:131:1: ( ( rule__Selector__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:132:1: ( rule__Selector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:133:1: ( rule__Selector__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:133:2: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_rule__Selector__Group__0_in_ruleSelector220);
            rule__Selector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getGroup()); 
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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSum"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:145:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:146:1: ( ruleSum EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:147:1: ruleSum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumRule()); 
            }
            pushFollow(FOLLOW_ruleSum_in_entryRuleSum247);
            ruleSum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSum254); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:154:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:158:2: ( ( ( rule__Sum__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:159:1: ( ( rule__Sum__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:159:1: ( ( rule__Sum__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:160:1: ( rule__Sum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:161:1: ( rule__Sum__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:161:2: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_rule__Sum__Group__0_in_ruleSum280);
            rule__Sum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getGroup()); 
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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleProduct"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:173:1: entryRuleProduct : ruleProduct EOF ;
    public final void entryRuleProduct() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:174:1: ( ruleProduct EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:175:1: ruleProduct EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductRule()); 
            }
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct307);
            ruleProduct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct314); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:182:1: ruleProduct : ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) ) ;
    public final void ruleProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:186:2: ( ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:187:1: ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:187:1: ( ( ( ruleTerm ) ) ( ( ruleTerm )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:188:1: ( ( ruleTerm ) ) ( ( ruleTerm )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:188:1: ( ( ruleTerm ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:189:1: ( ruleTerm )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:190:1: ( ruleTerm )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:190:3: ruleTerm
            {
            pushFollow(FOLLOW_ruleTerm_in_ruleProduct343);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            }

            }

            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:193:1: ( ( ruleTerm )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:194:1: ( ruleTerm )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:195:1: ( ruleTerm )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:195:3: ruleTerm
            	    {
            	    pushFollow(FOLLOW_ruleTerm_in_ruleProduct356);
            	    ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            }

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:208:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:209:1: ( ruleTerm EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:210:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm386);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm393); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:217:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:221:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:222:1: ( ( rule__Term__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:222:1: ( ( rule__Term__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:223:1: ( rule__Term__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:224:1: ( rule__Term__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:224:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleTerm419);
            rule__Term__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup()); 
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleStep"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:236:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:237:1: ( ruleStep EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:238:1: ruleStep EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepRule()); 
            }
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep446);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep453); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:245:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:249:2: ( ( ( rule__Step__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:250:1: ( ( rule__Step__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:250:1: ( ( rule__Step__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:251:1: ( rule__Step__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getAlternatives()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:252:1: ( rule__Step__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:252:2: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_rule__Step__Alternatives_in_ruleStep479);
            rule__Step__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleRule"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:264:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:265:1: ( ruleRule EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:266:1: ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule506);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule513); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:273:1: ruleRule : ( ( rule__Rule__Alternatives ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:277:2: ( ( ( rule__Rule__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:278:1: ( ( rule__Rule__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:278:1: ( ( rule__Rule__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:279:1: ( rule__Rule__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:280:1: ( rule__Rule__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:280:2: rule__Rule__Alternatives
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_in_ruleRule539);
            rule__Rule__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getAlternatives()); 
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleNested"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:292:1: entryRuleNested : ruleNested EOF ;
    public final void entryRuleNested() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:293:1: ( ruleNested EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:294:1: ruleNested EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRule()); 
            }
            pushFollow(FOLLOW_ruleNested_in_entryRuleNested566);
            ruleNested();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNested573); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:301:1: ruleNested : ( ( rule__Nested__Group__0 ) ) ;
    public final void ruleNested() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:305:2: ( ( ( rule__Nested__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:306:1: ( ( rule__Nested__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:306:1: ( ( rule__Nested__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:307:1: ( rule__Nested__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:308:1: ( rule__Nested__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:308:2: rule__Nested__Group__0
            {
            pushFollow(FOLLOW_rule__Nested__Group__0_in_ruleNested599);
            rule__Nested__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAccess().getGroup()); 
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
    // $ANTLR end "ruleNested"


    // $ANTLR start "entryRuleProperty"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:320:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:321:1: ( ruleProperty EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:322:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty626);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty633); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:329:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:333:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:334:1: ( ( rule__Property__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:334:1: ( ( rule__Property__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:335:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:336:1: ( rule__Property__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:336:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty659);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleValue"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:348:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:349:1: ( ruleValue EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:350:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue686);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue693); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:357:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:361:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:362:1: ( ( rule__Value__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:362:1: ( ( rule__Value__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:363:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:364:1: ( rule__Value__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:364:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue719);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleConstraint"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:376:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:377:1: ( ruleConstraint EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:378:1: ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint746);
            ruleConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint753); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:385:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:389:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:390:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:390:1: ( ( rule__Constraint__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:391:1: ( rule__Constraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:392:1: ( rule__Constraint__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:392:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint779);
            rule__Constraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getGroup()); 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleSingleStep"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:404:1: entryRuleSingleStep : ruleSingleStep EOF ;
    public final void entryRuleSingleStep() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:405:1: ( ruleSingleStep EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:406:1: ruleSingleStep EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStepRule()); 
            }
            pushFollow(FOLLOW_ruleSingleStep_in_entryRuleSingleStep806);
            ruleSingleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStepRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStep813); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:413:1: ruleSingleStep : ( ( rule__SingleStep__Group__0 ) ) ;
    public final void ruleSingleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:417:2: ( ( ( rule__SingleStep__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:418:1: ( ( rule__SingleStep__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:418:1: ( ( rule__SingleStep__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:419:1: ( rule__SingleStep__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStepAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:420:1: ( rule__SingleStep__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:420:2: rule__SingleStep__Group__0
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__0_in_ruleSingleStep839);
            rule__SingleStep__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStepAccess().getGroup()); 
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
    // $ANTLR end "ruleSingleStep"


    // $ANTLR start "entryRuleIdent"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:432:1: entryRuleIdent : ruleIdent EOF ;
    public final void entryRuleIdent() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:433:1: ( ruleIdent EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:434:1: ruleIdent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentRule()); 
            }
            pushFollow(FOLLOW_ruleIdent_in_entryRuleIdent866);
            ruleIdent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdent873); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:441:1: ruleIdent : ( ( rule__Ident__Alternatives ) ) ;
    public final void ruleIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:445:2: ( ( ( rule__Ident__Alternatives ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:446:1: ( ( rule__Ident__Alternatives ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:446:1: ( ( rule__Ident__Alternatives ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:447:1: ( rule__Ident__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentAccess().getAlternatives()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:448:1: ( rule__Ident__Alternatives )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:448:2: rule__Ident__Alternatives
            {
            pushFollow(FOLLOW_rule__Ident__Alternatives_in_ruleIdent899);
            rule__Ident__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentAccess().getAlternatives()); 
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
    // $ANTLR end "ruleIdent"


    // $ANTLR start "entryRuleVals"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:460:1: entryRuleVals : ruleVals EOF ;
    public final void entryRuleVals() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:461:1: ( ruleVals EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:462:1: ruleVals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValsRule()); 
            }
            pushFollow(FOLLOW_ruleVals_in_entryRuleVals926);
            ruleVals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVals933); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:469:1: ruleVals : ( ( rule__Vals__Group__0 ) ) ;
    public final void ruleVals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:473:2: ( ( ( rule__Vals__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:474:1: ( ( rule__Vals__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:474:1: ( ( rule__Vals__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:475:1: ( rule__Vals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValsAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:476:1: ( rule__Vals__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:476:2: rule__Vals__Group__0
            {
            pushFollow(FOLLOW_rule__Vals__Group__0_in_ruleVals959);
            rule__Vals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValsAccess().getGroup()); 
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
    // $ANTLR end "ruleVals"


    // $ANTLR start "entryRuleStepSuffix"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:488:1: entryRuleStepSuffix : ruleStepSuffix EOF ;
    public final void entryRuleStepSuffix() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:489:1: ( ruleStepSuffix EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:490:1: ruleStepSuffix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepSuffixRule()); 
            }
            pushFollow(FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix986);
            ruleStepSuffix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepSuffixRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepSuffix993); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:497:1: ruleStepSuffix : ( ( rule__StepSuffix__Group__0 ) ) ;
    public final void ruleStepSuffix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:501:2: ( ( ( rule__StepSuffix__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:502:1: ( ( rule__StepSuffix__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:502:1: ( ( rule__StepSuffix__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:503:1: ( rule__StepSuffix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepSuffixAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:504:1: ( rule__StepSuffix__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:504:2: rule__StepSuffix__Group__0
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__0_in_ruleStepSuffix1019);
            rule__StepSuffix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepSuffixAccess().getGroup()); 
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
    // $ANTLR end "ruleStepSuffix"


    // $ANTLR start "entryRuleImport"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:516:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:517:1: ( ruleImport EOF )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:518:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1046);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1053); if (state.failed) return ;

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:525:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:529:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:530:1: ( ( rule__Import__Group__0 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:530:1: ( ( rule__Import__Group__0 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:531:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:532:1: ( rule__Import__Group__0 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:532:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport1079);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "rule__Step__Alternatives"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:544:1: rule__Step__Alternatives : ( ( ruleSingleStep ) | ( ( rule__Step__Group_1__0 ) ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:548:1: ( ( ruleSingleStep ) | ( ( rule__Step__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:549:1: ( ruleSingleStep )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:549:1: ( ruleSingleStep )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:550:1: ruleSingleStep
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSingleStep_in_rule__Step__Alternatives1115);
                    ruleSingleStep();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:555:6: ( ( rule__Step__Group_1__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:555:6: ( ( rule__Step__Group_1__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:556:1: ( rule__Step__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStepAccess().getGroup_1()); 
                    }
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:557:1: ( rule__Step__Group_1__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:557:2: rule__Step__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Step__Group_1__0_in_rule__Step__Alternatives1132);
                    rule__Step__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStepAccess().getGroup_1()); 
                    }

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


    // $ANTLR start "rule__Rule__Alternatives"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:566:1: rule__Rule__Alternatives : ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) | ( ruleNested ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:570:1: ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) | ( ruleNested ) )
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
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==23) ) {
                    alt3=3;
                }
                else if ( ((LA3_3>=RULE_STRING && LA3_3<=RULE_ID)||LA3_3==15||(LA3_3>=18 && LA3_3<=21)||(LA3_3>=25 && LA3_3<=26)) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:571:1: ( ruleImport )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:571:1: ( ruleImport )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:572:1: ruleImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getImportParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleImport_in_rule__Rule__Alternatives1165);
                    ruleImport();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getImportParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:577:6: ( ruleConstraint )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:577:6: ( ruleConstraint )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:578:1: ruleConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getConstraintParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleConstraint_in_rule__Rule__Alternatives1182);
                    ruleConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getConstraintParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:583:6: ( ruleProperty )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:583:6: ( ruleProperty )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:584:1: ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getPropertyParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleProperty_in_rule__Rule__Alternatives1199);
                    ruleProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getPropertyParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:589:6: ( ruleNested )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:589:6: ( ruleNested )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:590:1: ruleNested
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getNestedParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleNested_in_rule__Rule__Alternatives1216);
                    ruleNested();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getNestedParserRuleCall_3()); 
                    }

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:600:1: rule__Nested__Alternatives_1 : ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) );
    public final void rule__Nested__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:604:1: ( ( ( rule__Nested__Group_1_0__0 ) ) | ( ( rule__Nested__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:605:1: ( ( rule__Nested__Group_1_0__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:605:1: ( ( rule__Nested__Group_1_0__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:606:1: ( rule__Nested__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNestedAccess().getGroup_1_0()); 
                    }
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:607:1: ( rule__Nested__Group_1_0__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:607:2: rule__Nested__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Nested__Group_1_0__0_in_rule__Nested__Alternatives_11248);
                    rule__Nested__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNestedAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:611:6: ( ( rule__Nested__Group_1_1__0 ) )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:611:6: ( ( rule__Nested__Group_1_1__0 ) )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:612:1: ( rule__Nested__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNestedAccess().getGroup_1_1()); 
                    }
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:613:1: ( rule__Nested__Group_1_1__0 )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:613:2: rule__Nested__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Nested__Group_1_1__0_in_rule__Nested__Alternatives_11266);
                    rule__Nested__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNestedAccess().getGroup_1_1()); 
                    }

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:622:1: rule__Nested__Alternatives_1_0_1 : ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) );
    public final void rule__Nested__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:626:1: ( ( ruleImport ) | ( ruleConstraint ) | ( ruleProperty ) )
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
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:627:1: ( ruleImport )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:627:1: ( ruleImport )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:628:1: ruleImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleImport_in_rule__Nested__Alternatives_1_0_11299);
                    ruleImport();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:633:6: ( ruleConstraint )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:633:6: ( ruleConstraint )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:634:1: ruleConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleConstraint_in_rule__Nested__Alternatives_1_0_11316);
                    ruleConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:639:6: ( ruleProperty )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:639:6: ( ruleProperty )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:640:1: ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNestedAccess().getPropertyParserRuleCall_1_0_1_2()); 
                    }
                    pushFollow(FOLLOW_ruleProperty_in_rule__Nested__Alternatives_1_0_11333);
                    ruleProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNestedAccess().getPropertyParserRuleCall_1_0_1_2()); 
                    }

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:650:1: rule__Value__Alternatives : ( ( RULE_HEXINT ) | ( RULE_INT ) | ( RULE_STRING ) | ( 'true' ) | ( 'false' ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:654:1: ( ( RULE_HEXINT ) | ( RULE_INT ) | ( RULE_STRING ) | ( 'true' ) | ( 'false' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_HEXINT:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case 12:
                {
                alt6=4;
                }
                break;
            case 13:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:655:1: ( RULE_HEXINT )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:655:1: ( RULE_HEXINT )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:656:1: RULE_HEXINT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_rule__Value__Alternatives1365); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:661:6: ( RULE_INT )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:661:6: ( RULE_INT )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:662:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Value__Alternatives1382); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:667:6: ( RULE_STRING )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:667:6: ( RULE_STRING )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:668:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives1399); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:673:6: ( 'true' )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:673:6: ( 'true' )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:674:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getTrueKeyword_3()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Value__Alternatives1417); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getTrueKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:681:6: ( 'false' )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:681:6: ( 'false' )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:682:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getFalseKeyword_4()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Value__Alternatives1437); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getFalseKeyword_4()); 
                    }

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:694:1: rule__Ident__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Ident__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:698:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:699:1: ( RULE_ID )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:699:1: ( RULE_ID )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:700:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ident__Alternatives1471); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:705:6: ( RULE_STRING )
                    {
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:705:6: ( RULE_STRING )
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:706:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Ident__Alternatives1488); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentAccess().getSTRINGTerminalRuleCall_1()); 
                    }

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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:718:1: rule__RuleSet__Group__0 : rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 ;
    public final void rule__RuleSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:722:1: ( rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:723:2: rule__RuleSet__Group__0__Impl rule__RuleSet__Group__1
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01518);
            rule__RuleSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01521);
            rule__RuleSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:730:1: rule__RuleSet__Group__0__Impl : ( ( rule__RuleSet__ContextAssignment_0 )? ) ;
    public final void rule__RuleSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:734:1: ( ( ( rule__RuleSet__ContextAssignment_0 )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:735:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:735:1: ( ( rule__RuleSet__ContextAssignment_0 )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:736:1: ( rule__RuleSet__ContextAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getContextAssignment_0()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:737:1: ( rule__RuleSet__ContextAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:737:2: rule__RuleSet__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RuleSet__ContextAssignment_0_in_rule__RuleSet__Group__0__Impl1548);
                    rule__RuleSet__ContextAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getContextAssignment_0()); 
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
    // $ANTLR end "rule__RuleSet__Group__0__Impl"


    // $ANTLR start "rule__RuleSet__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:747:1: rule__RuleSet__Group__1 : rule__RuleSet__Group__1__Impl ;
    public final void rule__RuleSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:751:1: ( rule__RuleSet__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:752:2: rule__RuleSet__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11579);
            rule__RuleSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:758:1: rule__RuleSet__Group__1__Impl : ( ( rule__RuleSet__RulesAssignment_1 )* ) ;
    public final void rule__RuleSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:762:1: ( ( ( rule__RuleSet__RulesAssignment_1 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:763:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:763:1: ( ( rule__RuleSet__RulesAssignment_1 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:764:1: ( rule__RuleSet__RulesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getRulesAssignment_1()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:765:1: ( rule__RuleSet__RulesAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==15||LA9_0==24||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:765:2: rule__RuleSet__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__RuleSet__RulesAssignment_1_in_rule__RuleSet__Group__1__Impl1606);
            	    rule__RuleSet__RulesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getRulesAssignment_1()); 
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
    // $ANTLR end "rule__RuleSet__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:779:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:783:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:784:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01641);
            rule__Context__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01644);
            rule__Context__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:791:1: rule__Context__Group__0__Impl : ( '@context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:795:1: ( ( '@context' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:796:1: ( '@context' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:796:1: ( '@context' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:797:1: '@context'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Context__Group__0__Impl1672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextAccess().getContextKeyword_0()); 
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
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:810:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:814:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:815:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11703);
            rule__Context__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11706);
            rule__Context__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:822:1: rule__Context__Group__1__Impl : ( '(' ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:826:1: ( ( '(' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:827:1: ( '(' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:827:1: ( '(' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:828:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Context__Group__1__Impl1734); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:841:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:845:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:846:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21765);
            rule__Context__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21768);
            rule__Context__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:853:1: rule__Context__Group__2__Impl : ( ruleSelector ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:857:1: ( ( ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:858:1: ( ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:858:1: ( ruleSelector )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:859:1: ruleSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextAccess().getSelectorParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleSelector_in_rule__Context__Group__2__Impl1795);
            ruleSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextAccess().getSelectorParserRuleCall_2()); 
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
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:870:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:874:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:875:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__31824);
            rule__Context__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__4_in_rule__Context__Group__31827);
            rule__Context__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:882:1: rule__Context__Group__3__Impl : ( ')' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:886:1: ( ( ')' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:887:1: ( ')' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:887:1: ( ')' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:888:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Context__Group__3__Impl1855); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Context__Group__4"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:901:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:905:1: ( rule__Context__Group__4__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:906:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__41886);
            rule__Context__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:912:1: rule__Context__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:916:1: ( ( ( ';' )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:917:1: ( ( ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:917:1: ( ( ';' )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:918:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextAccess().getSemicolonKeyword_4()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:919:1: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:920:2: ';'
                    {
                    match(input,17,FOLLOW_17_in_rule__Context__Group__4__Impl1915); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__Context__Group__4__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:941:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:945:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:946:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__01958);
            rule__Selector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__01961);
            rule__Selector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:953:1: rule__Selector__Group__0__Impl : ( ruleSum ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:957:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:958:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:958:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:959:1: ruleSum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSumParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSum_in_rule__Selector__Group__0__Impl1988);
            ruleSum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSumParserRuleCall_0()); 
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
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:970:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:974:1: ( rule__Selector__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:975:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__12017);
            rule__Selector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:981:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Group_1__0 )* ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:985:1: ( ( ( rule__Selector__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:986:1: ( ( rule__Selector__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:986:1: ( ( rule__Selector__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:987:1: ( rule__Selector__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getGroup_1()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:988:1: ( rule__Selector__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:988:2: rule__Selector__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Selector__Group_1__0_in_rule__Selector__Group__1__Impl2044);
            	    rule__Selector__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group_1__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1002:1: rule__Selector__Group_1__0 : rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 ;
    public final void rule__Selector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1006:1: ( rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1007:2: rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1__0__Impl_in_rule__Selector__Group_1__02079);
            rule__Selector__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selector__Group_1__1_in_rule__Selector__Group_1__02082);
            rule__Selector__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1014:1: rule__Selector__Group_1__0__Impl : ( '>' ) ;
    public final void rule__Selector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1018:1: ( ( '>' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1019:1: ( '>' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1019:1: ( '>' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1020:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Selector__Group_1__0__Impl2110); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1_0()); 
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
    // $ANTLR end "rule__Selector__Group_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1033:1: rule__Selector__Group_1__1 : rule__Selector__Group_1__1__Impl ;
    public final void rule__Selector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1037:1: ( rule__Selector__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1038:2: rule__Selector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1__1__Impl_in_rule__Selector__Group_1__12141);
            rule__Selector__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1044:1: rule__Selector__Group_1__1__Impl : ( ruleSum ) ;
    public final void rule__Selector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1048:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1049:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1049:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1050:1: ruleSum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSumParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleSum_in_rule__Selector__Group_1__1__Impl2168);
            ruleSum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSumParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__Selector__Group_1__1__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1065:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1069:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1070:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__02201);
            rule__Sum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__02204);
            rule__Sum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1077:1: rule__Sum__Group__0__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1081:1: ( ( ruleProduct ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1082:1: ( ruleProduct )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1082:1: ( ruleProduct )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1083:1: ruleProduct
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleProduct_in_rule__Sum__Group__0__Impl2231);
            ruleProduct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
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
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1094:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1098:1: ( rule__Sum__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1099:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__12260);
            rule__Sum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1105:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1109:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1110:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1110:1: ( ( rule__Sum__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1111:1: ( rule__Sum__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getGroup_1()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1112:1: ( rule__Sum__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1112:2: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Sum__Group_1__0_in_rule__Sum__Group__1__Impl2287);
            	    rule__Sum__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group_1__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1126:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1130:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1131:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_rule__Sum__Group_1__0__Impl_in_rule__Sum__Group_1__02322);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sum__Group_1__1_in_rule__Sum__Group_1__02325);
            rule__Sum__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1138:1: rule__Sum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1142:1: ( ( ',' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1143:1: ( ',' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1143:1: ( ',' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1144:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Sum__Group_1__0__Impl2353); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Sum__Group_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1157:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1161:1: ( rule__Sum__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1162:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sum__Group_1__1__Impl_in_rule__Sum__Group_1__12384);
            rule__Sum__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1168:1: rule__Sum__Group_1__1__Impl : ( ruleProduct ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1172:1: ( ( ruleProduct ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1173:1: ( ruleProduct )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1173:1: ( ruleProduct )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1174:1: ruleProduct
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleProduct_in_rule__Sum__Group_1__1__Impl2411);
            ruleProduct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__Sum__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1189:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1193:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1194:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02444);
            rule__Term__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02447);
            rule__Term__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1201:1: rule__Term__Group__0__Impl : ( ruleStep ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1205:1: ( ( ruleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1206:1: ( ruleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1206:1: ( ruleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1207:1: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleStep_in_rule__Term__Group__0__Impl2474);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
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
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1218:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1222:1: ( rule__Term__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1223:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12503);
            rule__Term__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1229:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1233:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1234:1: ( ( rule__Term__Group_1__0 )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1234:1: ( ( rule__Term__Group_1__0 )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1235:1: ( rule__Term__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_1()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1236:1: ( rule__Term__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1236:2: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl2530);
            	    rule__Term__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1250:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1254:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1255:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__02565);
            rule__Term__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__02568);
            rule__Term__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1262:1: rule__Term__Group_1__0__Impl : ( ( '>' ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1266:1: ( ( ( '>' ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1267:1: ( ( '>' ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1267:1: ( ( '>' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1268:1: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1269:1: ( '>' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1270:2: '>'
            {
            match(input,18,FOLLOW_18_in_rule__Term__Group_1__0__Impl2597); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
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
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1281:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1285:1: ( rule__Term__Group_1__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1286:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__12629);
            rule__Term__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1292:1: rule__Term__Group_1__1__Impl : ( ruleStep ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1296:1: ( ( ruleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1297:1: ( ruleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1297:1: ( ruleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1298:1: ruleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleStep_in_rule__Term__Group_1__1__Impl2656);
            ruleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Step__Group_1__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1313:1: rule__Step__Group_1__0 : rule__Step__Group_1__0__Impl rule__Step__Group_1__1 ;
    public final void rule__Step__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1317:1: ( rule__Step__Group_1__0__Impl rule__Step__Group_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1318:2: rule__Step__Group_1__0__Impl rule__Step__Group_1__1
            {
            pushFollow(FOLLOW_rule__Step__Group_1__0__Impl_in_rule__Step__Group_1__02689);
            rule__Step__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Step__Group_1__1_in_rule__Step__Group_1__02692);
            rule__Step__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1325:1: rule__Step__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Step__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1329:1: ( ( '(' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1330:1: ( '(' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1330:1: ( '(' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1331:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Step__Group_1__0__Impl2720); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 
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
    // $ANTLR end "rule__Step__Group_1__0__Impl"


    // $ANTLR start "rule__Step__Group_1__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1344:1: rule__Step__Group_1__1 : rule__Step__Group_1__1__Impl rule__Step__Group_1__2 ;
    public final void rule__Step__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1348:1: ( rule__Step__Group_1__1__Impl rule__Step__Group_1__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1349:2: rule__Step__Group_1__1__Impl rule__Step__Group_1__2
            {
            pushFollow(FOLLOW_rule__Step__Group_1__1__Impl_in_rule__Step__Group_1__12751);
            rule__Step__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Step__Group_1__2_in_rule__Step__Group_1__12754);
            rule__Step__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1356:1: rule__Step__Group_1__1__Impl : ( ruleSum ) ;
    public final void rule__Step__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1360:1: ( ( ruleSum ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1361:1: ( ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1361:1: ( ruleSum )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1362:1: ruleSum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleSum_in_rule__Step__Group_1__1__Impl2781);
            ruleSum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__Step__Group_1__1__Impl"


    // $ANTLR start "rule__Step__Group_1__2"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1373:1: rule__Step__Group_1__2 : rule__Step__Group_1__2__Impl ;
    public final void rule__Step__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1377:1: ( rule__Step__Group_1__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1378:2: rule__Step__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group_1__2__Impl_in_rule__Step__Group_1__22810);
            rule__Step__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1384:1: rule__Step__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Step__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1388:1: ( ( ')' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1389:1: ( ')' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1389:1: ( ')' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1390:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__Step__Group_1__2__Impl2838); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepAccess().getRightParenthesisKeyword_1_2()); 
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
    // $ANTLR end "rule__Step__Group_1__2__Impl"


    // $ANTLR start "rule__Nested__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1409:1: rule__Nested__Group__0 : rule__Nested__Group__0__Impl rule__Nested__Group__1 ;
    public final void rule__Nested__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1413:1: ( rule__Nested__Group__0__Impl rule__Nested__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1414:2: rule__Nested__Group__0__Impl rule__Nested__Group__1
            {
            pushFollow(FOLLOW_rule__Nested__Group__0__Impl_in_rule__Nested__Group__02875);
            rule__Nested__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Nested__Group__1_in_rule__Nested__Group__02878);
            rule__Nested__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1421:1: rule__Nested__Group__0__Impl : ( ruleSelector ) ;
    public final void rule__Nested__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1425:1: ( ( ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1426:1: ( ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1426:1: ( ruleSelector )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1427:1: ruleSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAccess().getSelectorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSelector_in_rule__Nested__Group__0__Impl2905);
            ruleSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAccess().getSelectorParserRuleCall_0()); 
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
    // $ANTLR end "rule__Nested__Group__0__Impl"


    // $ANTLR start "rule__Nested__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1438:1: rule__Nested__Group__1 : rule__Nested__Group__1__Impl ;
    public final void rule__Nested__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1442:1: ( rule__Nested__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1443:2: rule__Nested__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group__1__Impl_in_rule__Nested__Group__12934);
            rule__Nested__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1449:1: rule__Nested__Group__1__Impl : ( ( rule__Nested__Alternatives_1 ) ) ;
    public final void rule__Nested__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1453:1: ( ( ( rule__Nested__Alternatives_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1454:1: ( ( rule__Nested__Alternatives_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1454:1: ( ( rule__Nested__Alternatives_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1455:1: ( rule__Nested__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAccess().getAlternatives_1()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1456:1: ( rule__Nested__Alternatives_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1456:2: rule__Nested__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Nested__Alternatives_1_in_rule__Nested__Group__1__Impl2961);
            rule__Nested__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Nested__Group__1__Impl"


    // $ANTLR start "rule__Nested__Group_1_0__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1470:1: rule__Nested__Group_1_0__0 : rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 ;
    public final void rule__Nested__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1474:1: ( rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1475:2: rule__Nested__Group_1_0__0__Impl rule__Nested__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_0__0__Impl_in_rule__Nested__Group_1_0__02995);
            rule__Nested__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Nested__Group_1_0__1_in_rule__Nested__Group_1_0__02998);
            rule__Nested__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1482:1: rule__Nested__Group_1_0__0__Impl : ( ':' ) ;
    public final void rule__Nested__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1486:1: ( ( ':' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1487:1: ( ':' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1487:1: ( ':' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1488:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Nested__Group_1_0__0__Impl3026); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
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
    // $ANTLR end "rule__Nested__Group_1_0__0__Impl"


    // $ANTLR start "rule__Nested__Group_1_0__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1501:1: rule__Nested__Group_1_0__1 : rule__Nested__Group_1_0__1__Impl ;
    public final void rule__Nested__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1505:1: ( rule__Nested__Group_1_0__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1506:2: rule__Nested__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_0__1__Impl_in_rule__Nested__Group_1_0__13057);
            rule__Nested__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1512:1: rule__Nested__Group_1_0__1__Impl : ( ( rule__Nested__Alternatives_1_0_1 ) ) ;
    public final void rule__Nested__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1516:1: ( ( ( rule__Nested__Alternatives_1_0_1 ) ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1517:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1517:1: ( ( rule__Nested__Alternatives_1_0_1 ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1518:1: ( rule__Nested__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAccess().getAlternatives_1_0_1()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1519:1: ( rule__Nested__Alternatives_1_0_1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1519:2: rule__Nested__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__Nested__Alternatives_1_0_1_in_rule__Nested__Group_1_0__1__Impl3084);
            rule__Nested__Alternatives_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAccess().getAlternatives_1_0_1()); 
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
    // $ANTLR end "rule__Nested__Group_1_0__1__Impl"


    // $ANTLR start "rule__Nested__Group_1_1__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1533:1: rule__Nested__Group_1_1__0 : rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 ;
    public final void rule__Nested__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1537:1: ( rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1538:2: rule__Nested__Group_1_1__0__Impl rule__Nested__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__0__Impl_in_rule__Nested__Group_1_1__03118);
            rule__Nested__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Nested__Group_1_1__1_in_rule__Nested__Group_1_1__03121);
            rule__Nested__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1545:1: rule__Nested__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__Nested__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1549:1: ( ( '{' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1550:1: ( '{' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1550:1: ( '{' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1551:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Nested__Group_1_1__0__Impl3149); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
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
    // $ANTLR end "rule__Nested__Group_1_1__0__Impl"


    // $ANTLR start "rule__Nested__Group_1_1__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1564:1: rule__Nested__Group_1_1__1 : rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 ;
    public final void rule__Nested__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1568:1: ( rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1569:2: rule__Nested__Group_1_1__1__Impl rule__Nested__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__1__Impl_in_rule__Nested__Group_1_1__13180);
            rule__Nested__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Nested__Group_1_1__2_in_rule__Nested__Group_1_1__13183);
            rule__Nested__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1576:1: rule__Nested__Group_1_1__1__Impl : ( ( ruleRule )* ) ;
    public final void rule__Nested__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1580:1: ( ( ( ruleRule )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1581:1: ( ( ruleRule )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1581:1: ( ( ruleRule )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1582:1: ( ruleRule )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAccess().getRuleParserRuleCall_1_1_1()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1583:1: ( ruleRule )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||LA14_0==15||LA14_0==24||LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1583:3: ruleRule
            	    {
            	    pushFollow(FOLLOW_ruleRule_in_rule__Nested__Group_1_1__1__Impl3211);
            	    ruleRule();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAccess().getRuleParserRuleCall_1_1_1()); 
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
    // $ANTLR end "rule__Nested__Group_1_1__1__Impl"


    // $ANTLR start "rule__Nested__Group_1_1__2"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1593:1: rule__Nested__Group_1_1__2 : rule__Nested__Group_1_1__2__Impl ;
    public final void rule__Nested__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1597:1: ( rule__Nested__Group_1_1__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1598:2: rule__Nested__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Nested__Group_1_1__2__Impl_in_rule__Nested__Group_1_1__23242);
            rule__Nested__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1604:1: rule__Nested__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__Nested__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1608:1: ( ( '}' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1609:1: ( '}' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1609:1: ( '}' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1610:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__Nested__Group_1_1__2__Impl3270); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 
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
    // $ANTLR end "rule__Nested__Group_1_1__2__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1629:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1633:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1634:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03307);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03310);
            rule__Property__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1641:1: rule__Property__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1645:1: ( ( RULE_ID ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1646:1: ( RULE_ID )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1646:1: ( RULE_ID )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1647:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__Group__0__Impl3337); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1658:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1662:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1663:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13366);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13369);
            rule__Property__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1670:1: rule__Property__Group__1__Impl : ( '=' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1674:1: ( ( '=' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1675:1: ( '=' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1675:1: ( '=' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1676:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__Property__Group__1__Impl3397); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1689:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1693:1: ( rule__Property__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1694:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23428);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1700:1: rule__Property__Group__2__Impl : ( ruleValue ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1704:1: ( ( ruleValue ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1705:1: ( ruleValue )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1705:1: ( ruleValue )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1706:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Property__Group__2__Impl3455);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueParserRuleCall_2()); 
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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1723:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1727:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1728:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03490);
            rule__Constraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03493);
            rule__Constraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1735:1: rule__Constraint__Group__0__Impl : ( '@constrain' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1739:1: ( ( '@constrain' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1740:1: ( '@constrain' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1740:1: ( '@constrain' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1741:1: '@constrain'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Constraint__Group__0__Impl3521); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
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
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1754:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1758:1: ( rule__Constraint__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1759:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13552);
            rule__Constraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1765:1: rule__Constraint__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1769:1: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1770:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1770:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1771:1: ruleSingleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleSingleStep_in_rule__Constraint__Group__1__Impl3579);
            ruleSingleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
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
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__SingleStep__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1786:1: rule__SingleStep__Group__0 : rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 ;
    public final void rule__SingleStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1790:1: ( rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1791:2: rule__SingleStep__Group__0__Impl rule__SingleStep__Group__1
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__0__Impl_in_rule__SingleStep__Group__03612);
            rule__SingleStep__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SingleStep__Group__1_in_rule__SingleStep__Group__03615);
            rule__SingleStep__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1798:1: rule__SingleStep__Group__0__Impl : ( ruleIdent ) ;
    public final void rule__SingleStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1802:1: ( ( ruleIdent ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1803:1: ( ruleIdent )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1803:1: ( ruleIdent )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1804:1: ruleIdent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleIdent_in_rule__SingleStep__Group__0__Impl3642);
            ruleIdent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 
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
    // $ANTLR end "rule__SingleStep__Group__0__Impl"


    // $ANTLR start "rule__SingleStep__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1815:1: rule__SingleStep__Group__1 : rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 ;
    public final void rule__SingleStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1819:1: ( rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1820:2: rule__SingleStep__Group__1__Impl rule__SingleStep__Group__2
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__1__Impl_in_rule__SingleStep__Group__13671);
            rule__SingleStep__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SingleStep__Group__2_in_rule__SingleStep__Group__13674);
            rule__SingleStep__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1827:1: rule__SingleStep__Group__1__Impl : ( ( ruleVals )? ) ;
    public final void rule__SingleStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1831:1: ( ( ( ruleVals )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1832:1: ( ( ruleVals )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1832:1: ( ( ruleVals )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1833:1: ( ruleVals )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1834:1: ( ruleVals )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1834:3: ruleVals
                    {
                    pushFollow(FOLLOW_ruleVals_in_rule__SingleStep__Group__1__Impl3702);
                    ruleVals();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
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
    // $ANTLR end "rule__SingleStep__Group__1__Impl"


    // $ANTLR start "rule__SingleStep__Group__2"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1844:1: rule__SingleStep__Group__2 : rule__SingleStep__Group__2__Impl ;
    public final void rule__SingleStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1848:1: ( rule__SingleStep__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1849:2: rule__SingleStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleStep__Group__2__Impl_in_rule__SingleStep__Group__23733);
            rule__SingleStep__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1855:1: rule__SingleStep__Group__2__Impl : ( ( ruleStepSuffix )? ) ;
    public final void rule__SingleStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1859:1: ( ( ( ruleStepSuffix )? ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1860:1: ( ( ruleStepSuffix )? )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1860:1: ( ( ruleStepSuffix )? )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1861:1: ( ruleStepSuffix )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1862:1: ( ruleStepSuffix )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1862:3: ruleStepSuffix
                    {
                    pushFollow(FOLLOW_ruleStepSuffix_in_rule__SingleStep__Group__2__Impl3761);
                    ruleStepSuffix();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
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
    // $ANTLR end "rule__SingleStep__Group__2__Impl"


    // $ANTLR start "rule__Vals__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1878:1: rule__Vals__Group__0 : rule__Vals__Group__0__Impl rule__Vals__Group__1 ;
    public final void rule__Vals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1882:1: ( rule__Vals__Group__0__Impl rule__Vals__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1883:2: rule__Vals__Group__0__Impl rule__Vals__Group__1
            {
            pushFollow(FOLLOW_rule__Vals__Group__0__Impl_in_rule__Vals__Group__03798);
            rule__Vals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vals__Group__1_in_rule__Vals__Group__03801);
            rule__Vals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1890:1: rule__Vals__Group__0__Impl : ( '.' ) ;
    public final void rule__Vals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1894:1: ( ( '.' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1895:1: ( '.' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1895:1: ( '.' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1896:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValsAccess().getFullStopKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Vals__Group__0__Impl3829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValsAccess().getFullStopKeyword_0()); 
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
    // $ANTLR end "rule__Vals__Group__0__Impl"


    // $ANTLR start "rule__Vals__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1909:1: rule__Vals__Group__1 : rule__Vals__Group__1__Impl rule__Vals__Group__2 ;
    public final void rule__Vals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1913:1: ( rule__Vals__Group__1__Impl rule__Vals__Group__2 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1914:2: rule__Vals__Group__1__Impl rule__Vals__Group__2
            {
            pushFollow(FOLLOW_rule__Vals__Group__1__Impl_in_rule__Vals__Group__13860);
            rule__Vals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vals__Group__2_in_rule__Vals__Group__13863);
            rule__Vals__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1921:1: rule__Vals__Group__1__Impl : ( ruleIdent ) ;
    public final void rule__Vals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1925:1: ( ( ruleIdent ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1926:1: ( ruleIdent )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1926:1: ( ruleIdent )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1927:1: ruleIdent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleIdent_in_rule__Vals__Group__1__Impl3890);
            ruleIdent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 
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
    // $ANTLR end "rule__Vals__Group__1__Impl"


    // $ANTLR start "rule__Vals__Group__2"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1938:1: rule__Vals__Group__2 : rule__Vals__Group__2__Impl ;
    public final void rule__Vals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1942:1: ( rule__Vals__Group__2__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1943:2: rule__Vals__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Vals__Group__2__Impl_in_rule__Vals__Group__23919);
            rule__Vals__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1949:1: rule__Vals__Group__2__Impl : ( ( ruleVals )* ) ;
    public final void rule__Vals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1953:1: ( ( ( ruleVals )* ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1954:1: ( ( ruleVals )* )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1954:1: ( ( ruleVals )* )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1955:1: ( ruleVals )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            }
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1956:1: ( ruleVals )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred23_InternalCcsEclipse()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1956:3: ruleVals
            	    {
            	    pushFollow(FOLLOW_ruleVals_in_rule__Vals__Group__2__Impl3947);
            	    ruleVals();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
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
    // $ANTLR end "rule__Vals__Group__2__Impl"


    // $ANTLR start "rule__StepSuffix__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1972:1: rule__StepSuffix__Group__0 : rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 ;
    public final void rule__StepSuffix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1976:1: ( rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1977:2: rule__StepSuffix__Group__0__Impl rule__StepSuffix__Group__1
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__0__Impl_in_rule__StepSuffix__Group__03984);
            rule__StepSuffix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StepSuffix__Group__1_in_rule__StepSuffix__Group__03987);
            rule__StepSuffix__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1984:1: rule__StepSuffix__Group__0__Impl : ( '/' ) ;
    public final void rule__StepSuffix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1988:1: ( ( '/' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1989:1: ( '/' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1989:1: ( '/' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1990:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__StepSuffix__Group__0__Impl4015); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
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
    // $ANTLR end "rule__StepSuffix__Group__0__Impl"


    // $ANTLR start "rule__StepSuffix__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2003:1: rule__StepSuffix__Group__1 : rule__StepSuffix__Group__1__Impl ;
    public final void rule__StepSuffix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2007:1: ( rule__StepSuffix__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2008:2: rule__StepSuffix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StepSuffix__Group__1__Impl_in_rule__StepSuffix__Group__14046);
            rule__StepSuffix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2014:1: rule__StepSuffix__Group__1__Impl : ( ruleSingleStep ) ;
    public final void rule__StepSuffix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2018:1: ( ( ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2019:1: ( ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2019:1: ( ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2020:1: ruleSingleStep
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleSingleStep_in_rule__StepSuffix__Group__1__Impl4073);
            ruleSingleStep();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
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
    // $ANTLR end "rule__StepSuffix__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2035:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2039:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2040:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04106);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04109);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2047:1: rule__Import__Group__0__Impl : ( '@import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2051:1: ( ( '@import' ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2052:1: ( '@import' )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2052:1: ( '@import' )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2053:1: '@import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Import__Group__0__Impl4137); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2066:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2070:1: ( rule__Import__Group__1__Impl )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2071:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14168);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2077:1: rule__Import__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2081:1: ( ( RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2082:1: ( RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2082:1: ( RULE_STRING )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2083:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__Group__1__Impl4195); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__RuleSet__ContextAssignment_0"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2099:1: rule__RuleSet__ContextAssignment_0 : ( ruleContext ) ;
    public final void rule__RuleSet__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2103:1: ( ( ruleContext ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2104:1: ( ruleContext )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2104:1: ( ruleContext )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2105:1: ruleContext
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleContext_in_rule__RuleSet__ContextAssignment_04233);
            ruleContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__RuleSet__ContextAssignment_0"


    // $ANTLR start "rule__RuleSet__RulesAssignment_1"
    // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2114:1: rule__RuleSet__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__RuleSet__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2118:1: ( ( ruleRule ) )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2119:1: ( ruleRule )
            {
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2119:1: ( ruleRule )
            // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:2120:1: ruleRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleRule_in_rule__RuleSet__RulesAssignment_14264);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__RuleSet__RulesAssignment_1"

    // $ANTLR start synpred19_InternalCcsEclipse
    public final void synpred19_InternalCcsEclipse_fragment() throws RecognitionException {   
        // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1236:2: ( rule__Term__Group_1__0 )
        // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1236:2: rule__Term__Group_1__0
        {
        pushFollow(FOLLOW_rule__Term__Group_1__0_in_synpred19_InternalCcsEclipse2530);
        rule__Term__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalCcsEclipse

    // $ANTLR start synpred23_InternalCcsEclipse
    public final void synpred23_InternalCcsEclipse_fragment() throws RecognitionException {   
        // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1956:3: ( ruleVals )
        // ../net.immute.ccs.CcsEclipse.ui/src-gen/net/immute/ccs/ui/contentassist/antlr/internal/InternalCcsEclipse.g:1956:3: ruleVals
        {
        pushFollow(FOLLOW_ruleVals_in_synpred23_InternalCcsEclipse3947);
        ruleVals();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalCcsEclipse

    // Delegated rules

    public final boolean synpred19_InternalCcsEclipse() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalCcsEclipse_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalCcsEclipse() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalCcsEclipse_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\1\1\12\uffff";
    static final String DFA13_minS =
        "\1\6\5\uffff\1\0\4\uffff";
    static final String DFA13_maxS =
        "\1\25\5\uffff\1\0\4\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA13_specialS =
        "\6\uffff\1\0\4\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\1\7\uffff\2\1\1\uffff\1\6\3\1",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 1236:1: ( rule__Term__Group_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalCcsEclipse()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__0_in_ruleRuleSet100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0_in_ruleContext160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0_in_ruleSelector220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_entryRuleSum247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSum254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__0_in_ruleSum280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct343 = new BitSet(new long[]{0x00000000000080C2L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct356 = new BitSet(new long[]{0x00000000000080C2L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Alternatives_in_ruleStep479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_in_ruleRule539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_entryRuleNested566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNested573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__0_in_ruleNested599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_entryRuleSingleStep806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStep813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__0_in_ruleSingleStep839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_entryRuleIdent866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdent873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ident__Alternatives_in_ruleIdent899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_entryRuleVals926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVals933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__0_in_ruleVals959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepSuffix993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__0_in_ruleStepSuffix1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__Step__Alternatives1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__0_in_rule__Step__Alternatives1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Rule__Alternatives1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Rule__Alternatives1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Rule__Alternatives1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_rule__Rule__Alternatives1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__0_in_rule__Nested__Alternatives_11248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__0_in_rule__Nested__Alternatives_11266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Nested__Alternatives_1_0_11299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Nested__Alternatives_1_0_11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Nested__Alternatives_1_0_11333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_rule__Value__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Value__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Value__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Value__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ident__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Ident__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__0__Impl_in_rule__RuleSet__Group__01518 = new BitSet(new long[]{0x00000000090080C0L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1_in_rule__RuleSet__Group__01521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__ContextAssignment_0_in_rule__RuleSet__Group__0__Impl1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__Group__1__Impl_in_rule__RuleSet__Group__11579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleSet__RulesAssignment_1_in_rule__RuleSet__Group__1__Impl1606 = new BitSet(new long[]{0x00000000090080C2L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Context__Group__0__Impl1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11703 = new BitSet(new long[]{0x00000000090080C0L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Context__Group__1__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21765 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__Context__Group__2__Impl1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__31824 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Context__Group__4_in_rule__Context__Group__31827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Context__Group__3__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__41886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Context__Group__4__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__01958 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__01961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Selector__Group__0__Impl1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__12017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__0_in_rule__Selector__Group__1__Impl2044 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__0__Impl_in_rule__Selector__Group_1__02079 = new BitSet(new long[]{0x00000000090080C0L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__1_in_rule__Selector__Group_1__02082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Selector__Group_1__0__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__1__Impl_in_rule__Selector__Group_1__12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Selector__Group_1__1__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__02201 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__02204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Sum__Group__0__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__12260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__0_in_rule__Sum__Group__1__Impl2287 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__0__Impl_in_rule__Sum__Group_1__02322 = new BitSet(new long[]{0x00000000090080C0L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__1_in_rule__Sum__Group_1__02325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sum__Group_1__0__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sum__Group_1__1__Impl_in_rule__Sum__Group_1__12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Sum__Group_1__1__Impl2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02444 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Term__Group__0__Impl2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl2530 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__02565 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__02568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Term__Group_1__0__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__12629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Term__Group_1__1__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__0__Impl_in_rule__Step__Group_1__02689 = new BitSet(new long[]{0x00000000090080C0L});
    public static final BitSet FOLLOW_rule__Step__Group_1__1_in_rule__Step__Group_1__02692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Step__Group_1__0__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__1__Impl_in_rule__Step__Group_1__12751 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Step__Group_1__2_in_rule__Step__Group_1__12754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_rule__Step__Group_1__1__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_1__2__Impl_in_rule__Step__Group_1__22810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Step__Group_1__2__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__0__Impl_in_rule__Nested__Group__02875 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Nested__Group__1_in_rule__Nested__Group__02878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__Nested__Group__0__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group__1__Impl_in_rule__Nested__Group__12934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Alternatives_1_in_rule__Nested__Group__1__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__0__Impl_in_rule__Nested__Group_1_0__02995 = new BitSet(new long[]{0x0000000009000080L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__1_in_rule__Nested__Group_1_0__02998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Nested__Group_1_0__0__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_0__1__Impl_in_rule__Nested__Group_1_0__13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Alternatives_1_0_1_in_rule__Nested__Group_1_0__1__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__0__Impl_in_rule__Nested__Group_1_1__03118 = new BitSet(new long[]{0x00000000094080C0L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__1_in_rule__Nested__Group_1_1__03121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Nested__Group_1_1__0__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__1__Impl_in_rule__Nested__Group_1_1__13180 = new BitSet(new long[]{0x00000000094080C0L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__2_in_rule__Nested__Group_1_1__13183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Nested__Group_1_1__1__Impl3211 = new BitSet(new long[]{0x00000000090080C2L});
    public static final BitSet FOLLOW_rule__Nested__Group_1_1__2__Impl_in_rule__Nested__Group_1_1__23242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Nested__Group_1_1__2__Impl3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03307 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__Group__0__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13366 = new BitSet(new long[]{0x0000000000003070L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Property__Group__1__Impl3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Property__Group__2__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03490 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constraint__Group__0__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__Constraint__Group__1__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__0__Impl_in_rule__SingleStep__Group__03612 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__1_in_rule__SingleStep__Group__03615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_rule__SingleStep__Group__0__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__1__Impl_in_rule__SingleStep__Group__13671 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__2_in_rule__SingleStep__Group__13674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_rule__SingleStep__Group__1__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStep__Group__2__Impl_in_rule__SingleStep__Group__23733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_rule__SingleStep__Group__2__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__0__Impl_in_rule__Vals__Group__03798 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Vals__Group__1_in_rule__Vals__Group__03801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Vals__Group__0__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__1__Impl_in_rule__Vals__Group__13860 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Vals__Group__2_in_rule__Vals__Group__13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_rule__Vals__Group__1__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vals__Group__2__Impl_in_rule__Vals__Group__23919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_rule__Vals__Group__2__Impl3947 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__0__Impl_in_rule__StepSuffix__Group__03984 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__1_in_rule__StepSuffix__Group__03987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StepSuffix__Group__0__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepSuffix__Group__1__Impl_in_rule__StepSuffix__Group__14046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_rule__StepSuffix__Group__1__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04106 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Import__Group__0__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__Group__1__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_rule__RuleSet__ContextAssignment_04233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleSet__RulesAssignment_14264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_synpred19_InternalCcsEclipse2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_synpred23_InternalCcsEclipse3947 = new BitSet(new long[]{0x0000000000000002L});

}