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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCcsEclipseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HEXINT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@context'", "'('", "')'", "';'", "'>'", "','", "':'", "'{'", "'}'", "'='", "'true'", "'false'", "'@constrain'", "'.'", "'/'", "'@import'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_HEXINT=5;
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
    public static final int RULE_INT=6;
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
    public String getGrammarFileName() { return "../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g"; }



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



    // $ANTLR start "entryRuleRuleSet"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:67:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:68:2: (iv_ruleRuleSet= ruleRuleSet EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:69:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleSetRule()); 
            }
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet75);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:76:1: ruleRuleSet returns [EObject current=null] : ( ( (lv_context_0_0= ruleContext ) )? ( (lv_rules_1_0= ruleRule ) )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_context_0_0 = null;

        AntlrDatatypeRuleToken lv_rules_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:79:28: ( ( ( (lv_context_0_0= ruleContext ) )? ( (lv_rules_1_0= ruleRule ) )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:80:1: ( ( (lv_context_0_0= ruleContext ) )? ( (lv_rules_1_0= ruleRule ) )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:80:1: ( ( (lv_context_0_0= ruleContext ) )? ( (lv_rules_1_0= ruleRule ) )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:80:2: ( (lv_context_0_0= ruleContext ) )? ( (lv_rules_1_0= ruleRule ) )*
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:80:2: ( (lv_context_0_0= ruleContext ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:81:1: (lv_context_0_0= ruleContext )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:81:1: (lv_context_0_0= ruleContext )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:82:3: lv_context_0_0= ruleContext
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContext_in_ruleRuleSet131);
                    lv_context_0_0=ruleContext();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
                      	        }
                             		set(
                             			current, 
                             			"context",
                              		lv_context_0_0, 
                              		"Context");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:98:3: ( (lv_rules_1_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_STRING||LA2_0==13||LA2_0==24||LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:99:1: (lv_rules_1_0= ruleRule )
            	    {
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:99:1: (lv_rules_1_0= ruleRule )
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:100:3: lv_rules_1_0= ruleRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRule_in_ruleRuleSet153);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rules",
            	              		lv_rules_1_0, 
            	              		"Rule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleContext"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:124:1: entryRuleContext returns [String current=null] : iv_ruleContext= ruleContext EOF ;
    public final String entryRuleContext() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContext = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:125:2: (iv_ruleContext= ruleContext EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:126:2: iv_ruleContext= ruleContext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextRule()); 
            }
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext191);
            iv_ruleContext=ruleContext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContext.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext202); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:133:1: ruleContext returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@context' kw= '(' this_Selector_2= ruleSelector kw= ')' (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleContext() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Selector_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:136:28: ( (kw= '@context' kw= '(' this_Selector_2= ruleSelector kw= ')' (kw= ';' )? ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:137:1: (kw= '@context' kw= '(' this_Selector_2= ruleSelector kw= ')' (kw= ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:137:1: (kw= '@context' kw= '(' this_Selector_2= ruleSelector kw= ')' (kw= ';' )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:138:2: kw= '@context' kw= '(' this_Selector_2= ruleSelector kw= ')' (kw= ';' )?
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleContext240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getContextAccess().getContextKeyword_0()); 
                  
            }
            kw=(Token)match(input,13,FOLLOW_13_in_ruleContext253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getContextAccess().getSelectorParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleSelector_in_ruleContext275);
            this_Selector_2=ruleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Selector_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,14,FOLLOW_14_in_ruleContext293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 
                  
            }
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:166:1: (kw= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:167:2: kw= ';'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleContext307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getContextAccess().getSemicolonKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleSelector"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:180:1: entryRuleSelector returns [String current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final String entryRuleSelector() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelector = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:181:2: (iv_ruleSelector= ruleSelector EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:182:2: iv_ruleSelector= ruleSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector350);
            iv_ruleSelector=ruleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelector.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector361); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:189:1: ruleSelector returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Sum_0= ruleSum (kw= '>' this_Sum_2= ruleSum )* ) ;
    public final AntlrDatatypeRuleToken ruleSelector() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Sum_0 = null;

        AntlrDatatypeRuleToken this_Sum_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:192:28: ( (this_Sum_0= ruleSum (kw= '>' this_Sum_2= ruleSum )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:193:1: (this_Sum_0= ruleSum (kw= '>' this_Sum_2= ruleSum )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:193:1: (this_Sum_0= ruleSum (kw= '>' this_Sum_2= ruleSum )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:194:5: this_Sum_0= ruleSum (kw= '>' this_Sum_2= ruleSum )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectorAccess().getSumParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSum_in_ruleSelector408);
            this_Sum_0=ruleSum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Sum_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:204:1: (kw= '>' this_Sum_2= ruleSum )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:205:2: kw= '>' this_Sum_2= ruleSum
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleSelector427); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSelectorAccess().getSumParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleSum_in_ruleSelector449);
            	    this_Sum_2=ruleSum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Sum_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSum"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:229:1: entryRuleSum returns [String current=null] : iv_ruleSum= ruleSum EOF ;
    public final String entryRuleSum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSum = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:230:2: (iv_ruleSum= ruleSum EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:231:2: iv_ruleSum= ruleSum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumRule()); 
            }
            pushFollow(FOLLOW_ruleSum_in_entryRuleSum497);
            iv_ruleSum=ruleSum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSum.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSum508); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:238:1: ruleSum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* ) ;
    public final AntlrDatatypeRuleToken ruleSum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Product_0 = null;

        AntlrDatatypeRuleToken this_Product_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:241:28: ( (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:242:1: (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:242:1: (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:243:5: this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleProduct_in_ruleSum555);
            this_Product_0=ruleProduct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Product_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:253:1: (kw= ',' this_Product_2= ruleProduct )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:254:2: kw= ',' this_Product_2= ruleProduct
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleSum574); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleProduct_in_ruleSum596);
            	    this_Product_2=ruleProduct();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Product_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleProduct"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:278:1: entryRuleProduct returns [String current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final String entryRuleProduct() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProduct = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:279:2: (iv_ruleProduct= ruleProduct EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:280:2: iv_ruleProduct= ruleProduct EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProductRule()); 
            }
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct644);
            iv_ruleProduct=ruleProduct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProduct.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct655); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:287:1: ruleProduct returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Term_0= ruleTerm )+ ;
    public final AntlrDatatypeRuleToken ruleProduct() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Term_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:290:28: ( (this_Term_0= ruleTerm )+ )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:291:1: (this_Term_0= ruleTerm )+
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:291:1: (this_Term_0= ruleTerm )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==RULE_STRING||LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:292:5: this_Term_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleTerm_in_ruleProduct702);
            	    this_Term_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Term_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleTerm"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:310:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:311:2: (iv_ruleTerm= ruleTerm EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:312:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm749);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm760); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:319:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Step_0= ruleStep ( ( ( '>' )=>kw= '>' ) this_Step_2= ruleStep )* ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Step_0 = null;

        AntlrDatatypeRuleToken this_Step_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:322:28: ( (this_Step_0= ruleStep ( ( ( '>' )=>kw= '>' ) this_Step_2= ruleStep )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:323:1: (this_Step_0= ruleStep ( ( ( '>' )=>kw= '>' ) this_Step_2= ruleStep )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:323:1: (this_Step_0= ruleStep ( ( ( '>' )=>kw= '>' ) this_Step_2= ruleStep )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:324:5: this_Step_0= ruleStep ( ( ( '>' )=>kw= '>' ) this_Step_2= ruleStep )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleStep_in_ruleTerm807);
            this_Step_0=ruleStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Step_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:334:1: ( ( ( '>' )=>kw= '>' ) this_Step_2= ruleStep )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:334:2: ( ( '>' )=>kw= '>' ) this_Step_2= ruleStep
            	    {
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:334:2: ( ( '>' )=>kw= '>' )
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:334:3: ( '>' )=>kw= '>'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleTerm835); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleStep_in_ruleTerm858);
            	    this_Step_2=ruleStep();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Step_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleStep"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:361:1: entryRuleStep returns [String current=null] : iv_ruleStep= ruleStep EOF ;
    public final String entryRuleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStep = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:362:2: (iv_ruleStep= ruleStep EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:363:2: iv_ruleStep= ruleStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStepRule()); 
            }
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep906);
            iv_ruleStep=ruleStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStep.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep917); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:370:1: ruleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_0 = null;

        AntlrDatatypeRuleToken this_Sum_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:373:28: ( (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:374:1: (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:374:1: (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:375:5: this_SingleStep_0= ruleSingleStep
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleStep_in_ruleStep964);
                    this_SingleStep_0=ruleSingleStep();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SingleStep_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:386:6: (kw= '(' this_Sum_2= ruleSum kw= ')' )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:386:6: (kw= '(' this_Sum_2= ruleSum kw= ')' )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:387:2: kw= '(' this_Sum_2= ruleSum kw= ')'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleStep989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSum_in_ruleStep1011);
                    this_Sum_2=ruleSum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sum_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleStep1029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStepAccess().getRightParenthesisKeyword_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleRule"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:417:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:418:2: (iv_ruleRule= ruleRule EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:419:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule1071);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule1082); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:426:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Import_0 = null;

        AntlrDatatypeRuleToken this_Constraint_1 = null;

        AntlrDatatypeRuleToken this_Property_2 = null;

        AntlrDatatypeRuleToken this_Nested_3 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:429:28: ( (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:430:1: (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:430:1: (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==RULE_ID||LA9_3==RULE_STRING||LA9_3==13||(LA9_3>=16 && LA9_3<=19)||(LA9_3>=25 && LA9_3<=26)) ) {
                    alt9=4;
                }
                else if ( (LA9_3==21) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 13:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:431:5: this_Import_0= ruleImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRuleAccess().getImportParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImport_in_ruleRule1129);
                    this_Import_0=ruleImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Import_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:443:5: this_Constraint_1= ruleConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRuleAccess().getConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstraint_in_ruleRule1162);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Constraint_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:455:5: this_Property_2= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRuleAccess().getPropertyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleRule1195);
                    this_Property_2=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Property_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:467:5: this_Nested_3= ruleNested
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRuleAccess().getNestedParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNested_in_ruleRule1228);
                    this_Nested_3=ruleNested();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Nested_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleNested"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:485:1: entryRuleNested returns [String current=null] : iv_ruleNested= ruleNested EOF ;
    public final String entryRuleNested() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNested = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:486:2: (iv_ruleNested= ruleNested EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:487:2: iv_ruleNested= ruleNested EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedRule()); 
            }
            pushFollow(FOLLOW_ruleNested_in_entryRuleNested1274);
            iv_ruleNested=ruleNested();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNested.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNested1285); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNested"


    // $ANTLR start "ruleNested"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:494:1: ruleNested returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleNested() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Selector_0 = null;

        AntlrDatatypeRuleToken this_Import_2 = null;

        AntlrDatatypeRuleToken this_Constraint_3 = null;

        AntlrDatatypeRuleToken this_Property_4 = null;

        AntlrDatatypeRuleToken this_Rule_6 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:497:28: ( (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:498:1: (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:498:1: (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:499:5: this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) )
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNestedAccess().getSelectorParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelector_in_ruleNested1332);
            this_Selector_0=ruleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Selector_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:509:1: ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:509:2: (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:509:2: (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:510:2: kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty )
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleNested1352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
                          
                    }
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:515:1: (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty )
                    int alt10=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt10=1;
                        }
                        break;
                    case 24:
                        {
                        alt10=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt10=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:516:5: this_Import_2= ruleImport
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleImport_in_ruleNested1375);
                            this_Import_2=ruleImport();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Import_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:528:5: this_Constraint_3= ruleConstraint
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleConstraint_in_ruleNested1408);
                            this_Constraint_3=ruleConstraint();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Constraint_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:540:5: this_Property_4= ruleProperty
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getNestedAccess().getPropertyParserRuleCall_1_0_1_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleProperty_in_ruleNested1441);
                            this_Property_4=ruleProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Property_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:551:6: (kw= '{' (this_Rule_6= ruleRule )* kw= '}' )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:551:6: (kw= '{' (this_Rule_6= ruleRule )* kw= '}' )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:552:2: kw= '{' (this_Rule_6= ruleRule )* kw= '}'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleNested1468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
                          
                    }
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:557:1: (this_Rule_6= ruleRule )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==RULE_STRING||LA11_0==13||LA11_0==24||LA11_0==27) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:558:5: this_Rule_6= ruleRule
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getNestedAccess().getRuleParserRuleCall_1_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleRule_in_ruleNested1491);
                    	    this_Rule_6=ruleRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_Rule_6);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    kw=(Token)match(input,20,FOLLOW_20_in_ruleNested1511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNested"


    // $ANTLR start "entryRuleProperty"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:582:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:583:2: (iv_ruleProperty= ruleProperty EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:584:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1554);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1565); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:591:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '=' this_Value_2= ruleValue ) ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Value_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:594:28: ( (this_ID_0= RULE_ID kw= '=' this_Value_2= ruleValue ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:595:1: (this_ID_0= RULE_ID kw= '=' this_Value_2= ruleValue )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:595:1: (this_ID_0= RULE_ID kw= '=' this_Value_2= ruleValue )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:595:6: this_ID_0= RULE_ID kw= '=' this_Value_2= ruleValue
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPropertyAccess().getIDTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,21,FOLLOW_21_in_ruleProperty1623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyAccess().getValueParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleValue_in_ruleProperty1645);
            this_Value_2=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Value_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleValue"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:627:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:628:2: (iv_ruleValue= ruleValue EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:629:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1691);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1702); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:636:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEXINT_0= RULE_HEXINT | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEXINT_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:639:28: ( (this_HEXINT_0= RULE_HEXINT | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | kw= 'true' | kw= 'false' ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:640:1: (this_HEXINT_0= RULE_HEXINT | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | kw= 'true' | kw= 'false' )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:640:1: (this_HEXINT_0= RULE_HEXINT | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | kw= 'true' | kw= 'false' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_HEXINT:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            case 22:
                {
                alt13=4;
                }
                break;
            case 23:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:640:6: this_HEXINT_0= RULE_HEXINT
                    {
                    this_HEXINT_0=(Token)match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleValue1742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXINT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXINT_0, grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:648:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue1768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:656:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue1794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_2, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:665:2: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleValue1818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValueAccess().getTrueKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:672:2: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleValue1837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValueAccess().getFalseKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleConstraint"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:685:1: entryRuleConstraint returns [String current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final String entryRuleConstraint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstraint = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:686:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:687:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1878);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1889); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:694:1: ruleConstraint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@constrain' this_SingleStep_1= ruleSingleStep ) ;
    public final AntlrDatatypeRuleToken ruleConstraint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_1 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:697:28: ( (kw= '@constrain' this_SingleStep_1= ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:698:1: (kw= '@constrain' this_SingleStep_1= ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:698:1: (kw= '@constrain' this_SingleStep_1= ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:699:2: kw= '@constrain' this_SingleStep_1= ruleSingleStep
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleConstraint1927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleSingleStep_in_ruleConstraint1949);
            this_SingleStep_1=ruleSingleStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SingleStep_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleSingleStep"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:723:1: entryRuleSingleStep returns [String current=null] : iv_ruleSingleStep= ruleSingleStep EOF ;
    public final String entryRuleSingleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSingleStep = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:724:2: (iv_ruleSingleStep= ruleSingleStep EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:725:2: iv_ruleSingleStep= ruleSingleStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleStepRule()); 
            }
            pushFollow(FOLLOW_ruleSingleStep_in_entryRuleSingleStep1995);
            iv_ruleSingleStep=ruleSingleStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleStep.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStep2006); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleStep"


    // $ANTLR start "ruleSingleStep"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:732:1: ruleSingleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? ) ;
    public final AntlrDatatypeRuleToken ruleSingleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Ident_0 = null;

        AntlrDatatypeRuleToken this_Vals_1 = null;

        AntlrDatatypeRuleToken this_StepSuffix_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:735:28: ( (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:736:1: (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:736:1: (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:737:5: this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleIdent_in_ruleSingleStep2053);
            this_Ident_0=ruleIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Ident_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:747:1: (this_Vals_1= ruleVals )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:748:5: this_Vals_1= ruleVals
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVals_in_ruleSingleStep2081);
                    this_Vals_1=ruleVals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Vals_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:758:3: (this_StepSuffix_2= ruleStepSuffix )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:759:5: this_StepSuffix_2= ruleStepSuffix
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStepSuffix_in_ruleSingleStep2111);
                    this_StepSuffix_2=ruleStepSuffix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_StepSuffix_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleStep"


    // $ANTLR start "entryRuleIdent"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:777:1: entryRuleIdent returns [String current=null] : iv_ruleIdent= ruleIdent EOF ;
    public final String entryRuleIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdent = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:778:2: (iv_ruleIdent= ruleIdent EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:779:2: iv_ruleIdent= ruleIdent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentRule()); 
            }
            pushFollow(FOLLOW_ruleIdent_in_entryRuleIdent2159);
            iv_ruleIdent=ruleIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdent2170); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdent"


    // $ANTLR start "ruleIdent"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:786:1: ruleIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:789:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:790:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:790:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:790:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdent2210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:798:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdent2236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getIdentAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdent"


    // $ANTLR start "entryRuleVals"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:813:1: entryRuleVals returns [String current=null] : iv_ruleVals= ruleVals EOF ;
    public final String entryRuleVals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVals = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:814:2: (iv_ruleVals= ruleVals EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:815:2: iv_ruleVals= ruleVals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValsRule()); 
            }
            pushFollow(FOLLOW_ruleVals_in_entryRuleVals2282);
            iv_ruleVals=ruleVals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVals.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVals2293); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVals"


    // $ANTLR start "ruleVals"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:822:1: ruleVals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* ) ;
    public final AntlrDatatypeRuleToken ruleVals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Ident_1 = null;

        AntlrDatatypeRuleToken this_Vals_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:825:28: ( (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:826:1: (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:826:1: (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:827:2: kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )*
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleVals2331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getValsAccess().getFullStopKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleIdent_in_ruleVals2353);
            this_Ident_1=ruleIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Ident_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:843:1: (this_Vals_2= ruleVals )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:844:5: this_Vals_2= ruleVals
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleVals_in_ruleVals2381);
            	    this_Vals_2=ruleVals();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Vals_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVals"


    // $ANTLR start "entryRuleStepSuffix"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:862:1: entryRuleStepSuffix returns [String current=null] : iv_ruleStepSuffix= ruleStepSuffix EOF ;
    public final String entryRuleStepSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepSuffix = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:863:2: (iv_ruleStepSuffix= ruleStepSuffix EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:864:2: iv_ruleStepSuffix= ruleStepSuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStepSuffixRule()); 
            }
            pushFollow(FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix2429);
            iv_ruleStepSuffix=ruleStepSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStepSuffix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepSuffix2440); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepSuffix"


    // $ANTLR start "ruleStepSuffix"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:871:1: ruleStepSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_SingleStep_1= ruleSingleStep ) ;
    public final AntlrDatatypeRuleToken ruleStepSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_1 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:874:28: ( (kw= '/' this_SingleStep_1= ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:875:1: (kw= '/' this_SingleStep_1= ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:875:1: (kw= '/' this_SingleStep_1= ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:876:2: kw= '/' this_SingleStep_1= ruleSingleStep
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleStepSuffix2478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleSingleStep_in_ruleStepSuffix2500);
            this_SingleStep_1=ruleSingleStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SingleStep_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepSuffix"


    // $ANTLR start "entryRuleImport"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:900:1: entryRuleImport returns [String current=null] : iv_ruleImport= ruleImport EOF ;
    public final String entryRuleImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:901:2: (iv_ruleImport= ruleImport EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:902:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport2546);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport2557); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:909:1: ruleImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@import' this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:912:28: ( (kw= '@import' this_STRING_1= RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:913:1: (kw= '@import' this_STRING_1= RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:913:1: (kw= '@import' this_STRING_1= RULE_STRING )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:914:2: kw= '@import' this_STRING_1= RULE_STRING
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleImport2595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_0()); 
                  
            }
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport2610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_1, grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"

    // $ANTLR start synpred1_InternalCcsEclipse
    public final void synpred1_InternalCcsEclipse_fragment() throws RecognitionException {   
        // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:334:3: ( '>' )
        // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:335:2: '>'
        {
        match(input,16,FOLLOW_16_in_synpred1_InternalCcsEclipse826); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalCcsEclipse

    // Delegated rules

    public final boolean synpred1_InternalCcsEclipse() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCcsEclipse_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\1\1\12\uffff";
    static final String DFA7_minS =
        "\1\4\1\uffff\1\0\10\uffff";
    static final String DFA7_maxS =
        "\1\23\1\uffff\1\0\10\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA7_specialS =
        "\2\uffff\1\0\10\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\2\uffff\1\1\5\uffff\2\1\1\uffff\1\2\3\1",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 334:1: ( ( ( '>' )=>kw= '>' ) this_Step_2= ruleStep )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalCcsEclipse()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_ruleRuleSet131 = new BitSet(new long[]{0x0000000009002092L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleSet153 = new BitSet(new long[]{0x0000000009002092L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleContext240 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContext253 = new BitSet(new long[]{0x0000000009002090L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleContext275 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContext293 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleContext307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_ruleSelector408 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleSelector427 = new BitSet(new long[]{0x0000000009002090L});
    public static final BitSet FOLLOW_ruleSum_in_ruleSelector449 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleSum_in_entryRuleSum497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSum508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_ruleSum555 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleSum574 = new BitSet(new long[]{0x0000000009002090L});
    public static final BitSet FOLLOW_ruleProduct_in_ruleSum596 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct702 = new BitSet(new long[]{0x0000000009002092L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleTerm807 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleTerm835 = new BitSet(new long[]{0x0000000009002090L});
    public static final BitSet FOLLOW_ruleStep_in_ruleTerm858 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleStep964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStep989 = new BitSet(new long[]{0x0000000009002090L});
    public static final BitSet FOLLOW_ruleSum_in_ruleStep1011 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStep1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule1071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleRule1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleRule1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleRule1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_ruleRule1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_entryRuleNested1274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNested1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleNested1332 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleNested1352 = new BitSet(new long[]{0x0000000009000010L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNested1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleNested1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleNested1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNested1468 = new BitSet(new long[]{0x0000000009102090L});
    public static final BitSet FOLLOW_ruleRule_in_ruleNested1491 = new BitSet(new long[]{0x0000000009102090L});
    public static final BitSet FOLLOW_20_in_ruleNested1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1605 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProperty1623 = new BitSet(new long[]{0x0000000000C000E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleProperty1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleValue1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleValue1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleValue1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleConstraint1927 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleConstraint1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_entryRuleSingleStep1995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStep2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_ruleSingleStep2053 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleVals_in_ruleSingleStep2081 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_ruleSingleStep2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_entryRuleIdent2159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdent2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdent2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdent2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_entryRuleVals2282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVals2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVals2331 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleIdent_in_ruleVals2353 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleVals_in_ruleVals2381 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix2429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepSuffix2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStepSuffix2478 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleStepSuffix2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport2546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleImport2595 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred1_InternalCcsEclipse826 = new BitSet(new long[]{0x0000000000000002L});

}