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

@SuppressWarnings("all")
public class InternalCcsEclipseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HEXINT", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@context'", "'('", "')'", "';'", "'>'", "','", "':'", "'{'", "'}'", "'@override'", "'='", "'true'", "'false'", "'@constrain'", "'.'", "'/'", "'@import'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_HEXINT=5;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
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
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_ruleRuleSet_in_entryRuleRuleSet75);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleSet85); 

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

        EObject lv_context_0_0 = null;

        EObject lv_rules_1_0 = null;


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

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:81:1: (lv_context_0_0= ruleContext )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:81:1: (lv_context_0_0= ruleContext )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:82:3: lv_context_0_0= ruleContext
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContext_in_ruleRuleSet131);
                    lv_context_0_0=ruleContext();

                    state._fsp--;


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
                    break;

            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:98:3: ( (lv_rules_1_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_STRING||LA2_0==14||LA2_0==22||LA2_0==26||LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:99:1: (lv_rules_1_0= ruleRule )
            	    {
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:99:1: (lv_rules_1_0= ruleRule )
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:100:3: lv_rules_1_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleRuleSet153);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:124:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:125:2: (iv_ruleContext= ruleContext EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:126:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext190);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext200); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:133:1: ruleContext returns [EObject current=null] : (otherlv_0= '@context' otherlv_1= '(' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= ')' (otherlv_4= ';' )? ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_selector_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:136:28: ( (otherlv_0= '@context' otherlv_1= '(' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= ')' (otherlv_4= ';' )? ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:137:1: (otherlv_0= '@context' otherlv_1= '(' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= ')' (otherlv_4= ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:137:1: (otherlv_0= '@context' otherlv_1= '(' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= ')' (otherlv_4= ';' )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:137:3: otherlv_0= '@context' otherlv_1= '(' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= ')' (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleContext237); 

                	newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleContext249); 

                	newLeafNode(otherlv_1, grammarAccess.getContextAccess().getLeftParenthesisKeyword_1());
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:145:1: ( (lv_selector_2_0= ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:146:1: (lv_selector_2_0= ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:146:1: (lv_selector_2_0= ruleSelector )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:147:3: lv_selector_2_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getContextAccess().getSelectorSelectorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleContext270);
            lv_selector_2_0=ruleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextRule());
            	        }
                   		set(
                   			current, 
                   			"selector",
                    		lv_selector_2_0, 
                    		"Selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleContext282); 

                	newLeafNode(otherlv_3, grammarAccess.getContextAccess().getRightParenthesisKeyword_3());
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:167:1: (otherlv_4= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:167:3: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleContext295); 

                        	newLeafNode(otherlv_4, grammarAccess.getContextAccess().getSemicolonKeyword_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:179:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:180:2: (iv_ruleSelector= ruleSelector EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:181:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector333);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector343); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:188:1: ruleSelector returns [EObject current=null] : ( ( (lv_sum_0_0= ruleSum ) ) (otherlv_1= '>' )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sum_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:191:28: ( ( ( (lv_sum_0_0= ruleSum ) ) (otherlv_1= '>' )? ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:192:1: ( ( (lv_sum_0_0= ruleSum ) ) (otherlv_1= '>' )? )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:192:1: ( ( (lv_sum_0_0= ruleSum ) ) (otherlv_1= '>' )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:192:2: ( (lv_sum_0_0= ruleSum ) ) (otherlv_1= '>' )?
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:192:2: ( (lv_sum_0_0= ruleSum ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:193:1: (lv_sum_0_0= ruleSum )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:193:1: (lv_sum_0_0= ruleSum )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:194:3: lv_sum_0_0= ruleSum
            {
             
            	        newCompositeNode(grammarAccess.getSelectorAccess().getSumSumParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSum_in_ruleSelector389);
            lv_sum_0_0=ruleSum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectorRule());
            	        }
                   		set(
                   			current, 
                   			"sum",
                    		lv_sum_0_0, 
                    		"Sum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:210:2: (otherlv_1= '>' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:210:4: otherlv_1= '>'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSelector402); 

                        	newLeafNode(otherlv_1, grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:222:1: entryRuleSum returns [String current=null] : iv_ruleSum= ruleSum EOF ;
    public final String entryRuleSum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSum = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:223:2: (iv_ruleSum= ruleSum EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:224:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_ruleSum_in_entryRuleSum441);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSum452); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:231:1: ruleSum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* ) ;
    public final AntlrDatatypeRuleToken ruleSum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Product_0 = null;

        AntlrDatatypeRuleToken this_Product_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:234:28: ( (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:235:1: (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:235:1: (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:236:5: this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )*
            {
             
                    newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleProduct_in_ruleSum499);
            this_Product_0=ruleProduct();

            state._fsp--;


            		current.merge(this_Product_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:246:1: (kw= ',' this_Product_2= ruleProduct )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:247:2: kw= ',' this_Product_2= ruleProduct
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleSum518); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleProduct_in_ruleSum540);
            	    this_Product_2=ruleProduct();

            	    state._fsp--;


            	    		current.merge(this_Product_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:271:1: entryRuleProduct returns [String current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final String entryRuleProduct() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProduct = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:272:2: (iv_ruleProduct= ruleProduct EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:273:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct588);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct599); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:280:1: ruleProduct returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Term_0= ruleTerm )+ ;
    public final AntlrDatatypeRuleToken ruleProduct() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Term_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:283:28: ( (this_Term_0= ruleTerm )+ )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:284:1: (this_Term_0= ruleTerm )+
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:284:1: (this_Term_0= ruleTerm )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==RULE_STRING||LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:285:5: this_Term_0= ruleTerm
            	    {
            	     
            	            newCompositeNode(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_ruleTerm_in_ruleProduct646);
            	    this_Term_0=ruleTerm();

            	    state._fsp--;


            	    		current.merge(this_Term_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:303:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:304:2: (iv_ruleTerm= ruleTerm EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:305:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm693);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm704); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:312:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Step_0 = null;

        AntlrDatatypeRuleToken this_Step_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:315:28: ( (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:316:1: (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:316:1: (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:317:5: this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleStep_in_ruleTerm751);
            this_Step_0=ruleStep();

            state._fsp--;


            		current.merge(this_Step_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:327:1: (kw= '>' this_Step_2= ruleStep )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==RULE_ID||LA7_2==RULE_STRING||LA7_2==14) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:328:2: kw= '>' this_Step_2= ruleStep
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleTerm770); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleStep_in_ruleTerm792);
            	    this_Step_2=ruleStep();

            	    state._fsp--;


            	    		current.merge(this_Step_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:352:1: entryRuleStep returns [String current=null] : iv_ruleStep= ruleStep EOF ;
    public final String entryRuleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStep = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:353:2: (iv_ruleStep= ruleStep EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:354:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep840);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep851); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:361:1: ruleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_0 = null;

        AntlrDatatypeRuleToken this_Sum_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:364:28: ( (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:365:1: (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:365:1: (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:366:5: this_SingleStep_0= ruleSingleStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleStep_in_ruleStep898);
                    this_SingleStep_0=ruleSingleStep();

                    state._fsp--;


                    		current.merge(this_SingleStep_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:377:6: (kw= '(' this_Sum_2= ruleSum kw= ')' )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:377:6: (kw= '(' this_Sum_2= ruleSum kw= ')' )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:378:2: kw= '(' this_Sum_2= ruleSum kw= ')'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleStep923); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleSum_in_ruleStep945);
                    this_Sum_2=ruleSum();

                    state._fsp--;


                    		current.merge(this_Sum_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleStep963); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStepAccess().getRightParenthesisKeyword_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:408:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:409:2: (iv_ruleRule= ruleRule EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:410:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule1004);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule1014); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:417:1: ruleRule returns [EObject current=null] : ( ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_import_0_0 = null;

        AntlrDatatypeRuleToken lv_constraint_1_0 = null;

        EObject lv_property_2_0 = null;

        EObject lv_nested_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:420:28: ( ( ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) ) (otherlv_4= ';' )? ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:421:1: ( ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) ) (otherlv_4= ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:421:1: ( ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) ) (otherlv_4= ';' )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:421:2: ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) ) (otherlv_4= ';' )?
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:421:2: ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==23) ) {
                    alt9=3;
                }
                else if ( (LA9_4==RULE_ID||LA9_4==RULE_STRING||LA9_4==14||(LA9_4>=17 && LA9_4<=20)||(LA9_4>=27 && LA9_4<=28)) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 14:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:421:3: ( (lv_import_0_0= ruleImport ) )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:421:3: ( (lv_import_0_0= ruleImport ) )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:422:1: (lv_import_0_0= ruleImport )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:422:1: (lv_import_0_0= ruleImport )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:423:3: lv_import_0_0= ruleImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getImportImportParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImport_in_ruleRule1061);
                    lv_import_0_0=ruleImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"import",
                            		lv_import_0_0, 
                            		"Import");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:440:6: ( (lv_constraint_1_0= ruleConstraint ) )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:440:6: ( (lv_constraint_1_0= ruleConstraint ) )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:441:1: (lv_constraint_1_0= ruleConstraint )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:441:1: (lv_constraint_1_0= ruleConstraint )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:442:3: lv_constraint_1_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getConstraintConstraintParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraint_in_ruleRule1088);
                    lv_constraint_1_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"constraint",
                            		lv_constraint_1_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:459:6: ( (lv_property_2_0= ruleProperty ) )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:459:6: ( (lv_property_2_0= ruleProperty ) )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:460:1: (lv_property_2_0= ruleProperty )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:460:1: (lv_property_2_0= ruleProperty )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:461:3: lv_property_2_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperty_in_ruleRule1115);
                    lv_property_2_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"property",
                            		lv_property_2_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:478:6: ( (lv_nested_3_0= ruleNested ) )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:478:6: ( (lv_nested_3_0= ruleNested ) )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:479:1: (lv_nested_3_0= ruleNested )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:479:1: (lv_nested_3_0= ruleNested )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:480:3: lv_nested_3_0= ruleNested
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getNestedNestedParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNested_in_ruleRule1142);
                    lv_nested_3_0=ruleNested();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"nested",
                            		lv_nested_3_0, 
                            		"Nested");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:496:3: (otherlv_4= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:496:5: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRule1156); 

                        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getSemicolonKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:508:1: entryRuleNested returns [EObject current=null] : iv_ruleNested= ruleNested EOF ;
    public final EObject entryRuleNested() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNested = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:509:2: (iv_ruleNested= ruleNested EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:510:2: iv_ruleNested= ruleNested EOF
            {
             newCompositeNode(grammarAccess.getNestedRule()); 
            pushFollow(FOLLOW_ruleNested_in_entryRuleNested1194);
            iv_ruleNested=ruleNested();

            state._fsp--;

             current =iv_ruleNested; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNested1204); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:517:1: ruleNested returns [EObject current=null] : ( ( (lv_selector_0_0= ruleSelector ) ) ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleNested() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_selector_0_0 = null;

        EObject lv_import_2_0 = null;

        AntlrDatatypeRuleToken lv_constraint_3_0 = null;

        EObject lv_property_4_0 = null;

        EObject lv_rules_6_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:520:28: ( ( ( (lv_selector_0_0= ruleSelector ) ) ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:521:1: ( ( (lv_selector_0_0= ruleSelector ) ) ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:521:1: ( ( (lv_selector_0_0= ruleSelector ) ) ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:521:2: ( (lv_selector_0_0= ruleSelector ) ) ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:521:2: ( (lv_selector_0_0= ruleSelector ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:522:1: (lv_selector_0_0= ruleSelector )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:522:1: (lv_selector_0_0= ruleSelector )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:523:3: lv_selector_0_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getNestedAccess().getSelectorSelectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleNested1250);
            lv_selector_0_0=ruleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNestedRule());
            	        }
                   		set(
                   			current, 
                   			"selector",
                    		lv_selector_0_0, 
                    		"Selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:539:2: ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:539:3: (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:539:3: (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:539:5: otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleNested1264); 

                        	newLeafNode(otherlv_1, grammarAccess.getNestedAccess().getColonKeyword_1_0_0());
                        
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:543:1: ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) )
                    int alt11=3;
                    switch ( input.LA(1) ) {
                    case 29:
                        {
                        alt11=1;
                        }
                        break;
                    case 26:
                        {
                        alt11=2;
                        }
                        break;
                    case RULE_ID:
                    case 22:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:543:2: ( (lv_import_2_0= ruleImport ) )
                            {
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:543:2: ( (lv_import_2_0= ruleImport ) )
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:544:1: (lv_import_2_0= ruleImport )
                            {
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:544:1: (lv_import_2_0= ruleImport )
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:545:3: lv_import_2_0= ruleImport
                            {
                             
                            	        newCompositeNode(grammarAccess.getNestedAccess().getImportImportParserRuleCall_1_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleImport_in_ruleNested1286);
                            lv_import_2_0=ruleImport();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNestedRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"import",
                                    		lv_import_2_0, 
                                    		"Import");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:562:6: ( (lv_constraint_3_0= ruleConstraint ) )
                            {
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:562:6: ( (lv_constraint_3_0= ruleConstraint ) )
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:563:1: (lv_constraint_3_0= ruleConstraint )
                            {
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:563:1: (lv_constraint_3_0= ruleConstraint )
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:564:3: lv_constraint_3_0= ruleConstraint
                            {
                             
                            	        newCompositeNode(grammarAccess.getNestedAccess().getConstraintConstraintParserRuleCall_1_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConstraint_in_ruleNested1313);
                            lv_constraint_3_0=ruleConstraint();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNestedRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"constraint",
                                    		lv_constraint_3_0, 
                                    		"Constraint");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:581:6: ( (lv_property_4_0= ruleProperty ) )
                            {
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:581:6: ( (lv_property_4_0= ruleProperty ) )
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:582:1: (lv_property_4_0= ruleProperty )
                            {
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:582:1: (lv_property_4_0= ruleProperty )
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:583:3: lv_property_4_0= ruleProperty
                            {
                             
                            	        newCompositeNode(grammarAccess.getNestedAccess().getPropertyPropertyParserRuleCall_1_0_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleProperty_in_ruleNested1340);
                            lv_property_4_0=ruleProperty();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNestedRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"property",
                                    		lv_property_4_0, 
                                    		"Property");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:600:6: (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:600:6: (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:600:8: otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleNested1361); 

                        	newLeafNode(otherlv_5, grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0());
                        
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:604:1: ( (lv_rules_6_0= ruleRule ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||LA12_0==RULE_STRING||LA12_0==14||LA12_0==22||LA12_0==26||LA12_0==29) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:605:1: (lv_rules_6_0= ruleRule )
                    	    {
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:605:1: (lv_rules_6_0= ruleRule )
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:606:3: lv_rules_6_0= ruleRule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNestedAccess().getRulesRuleParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRule_in_ruleNested1382);
                    	    lv_rules_6_0=ruleRule();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNestedRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rules",
                    	            		lv_rules_6_0, 
                    	            		"Rule");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleNested1395); 

                        	newLeafNode(otherlv_7, grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleModifier"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:634:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:635:2: (iv_ruleModifier= ruleModifier EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:636:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier1433);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier1443); 

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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:643:1: ruleModifier returns [EObject current=null] : ( (lv_override_0_0= '@override' ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token lv_override_0_0=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:646:28: ( ( (lv_override_0_0= '@override' ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:647:1: ( (lv_override_0_0= '@override' ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:647:1: ( (lv_override_0_0= '@override' ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:648:1: (lv_override_0_0= '@override' )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:648:1: (lv_override_0_0= '@override' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:649:3: lv_override_0_0= '@override'
            {
            lv_override_0_0=(Token)match(input,22,FOLLOW_22_in_ruleModifier1485); 

                    newLeafNode(lv_override_0_0, grammarAccess.getModifierAccess().getOverrideOverrideKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModifierRule());
            	        }
                   		setWithLastConsumed(current, "override", true, "@override");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleProperty"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:670:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:671:2: (iv_ruleProperty= ruleProperty EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:672:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1533);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1543); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:679:1: ruleProperty returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:682:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:683:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:683:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:683:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:683:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:684:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:684:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:685:3: lv_modifiers_0_0= ruleModifier
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyAccess().getModifiersModifierParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifier_in_ruleProperty1589);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modifiers",
            	            		lv_modifiers_0_0, 
            	            		"Modifier");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:701:3: ( (lv_name_1_0= RULE_ID ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:702:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:702:1: (lv_name_1_0= RULE_ID )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:703:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1607); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleProperty1624); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:723:1: ( (lv_value_3_0= ruleValue ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:724:1: (lv_value_3_0= ruleValue )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:724:1: (lv_value_3_0= ruleValue )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:725:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleProperty1645);
            lv_value_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleBoolean"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:749:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:750:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:751:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean1682);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean1693); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:758:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:761:28: ( (kw= 'true' | kw= 'false' ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:762:1: (kw= 'true' | kw= 'false' )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:762:1: (kw= 'true' | kw= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:763:2: kw= 'true'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleBoolean1731); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:770:2: kw= 'false'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleBoolean1750); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleValue"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:783:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:784:2: (iv_ruleValue= ruleValue EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:785:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1791);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1802); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:792:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_Boolean_3= ruleBoolean ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEXINT_0=null;
        Token this_NUMBER_1=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_Boolean_3 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:795:28: ( (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_Boolean_3= ruleBoolean ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:796:1: (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_Boolean_3= ruleBoolean )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:796:1: (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_Boolean_3= ruleBoolean )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_HEXINT:
                {
                alt16=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt16=2;
                }
                break;
            case RULE_STRING:
                {
                alt16=3;
                }
                break;
            case 24:
            case 25:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:796:6: this_HEXINT_0= RULE_HEXINT
                    {
                    this_HEXINT_0=(Token)match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleValue1842); 

                    		current.merge(this_HEXINT_0);
                        
                     
                        newLeafNode(this_HEXINT_0, grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:804:10: this_NUMBER_1= RULE_NUMBER
                    {
                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleValue1868); 

                    		current.merge(this_NUMBER_1);
                        
                     
                        newLeafNode(this_NUMBER_1, grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:812:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue1894); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:821:5: this_Boolean_3= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBoolean_in_ruleValue1927);
                    this_Boolean_3=ruleBoolean();

                    state._fsp--;


                    		current.merge(this_Boolean_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:839:1: entryRuleConstraint returns [String current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final String entryRuleConstraint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstraint = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:840:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:841:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1973);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1984); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:848:1: ruleConstraint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@constrain' this_SingleStep_1= ruleSingleStep ) ;
    public final AntlrDatatypeRuleToken ruleConstraint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_1 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:851:28: ( (kw= '@constrain' this_SingleStep_1= ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:852:1: (kw= '@constrain' this_SingleStep_1= ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:852:1: (kw= '@constrain' this_SingleStep_1= ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:853:2: kw= '@constrain' this_SingleStep_1= ruleSingleStep
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleConstraint2022); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSingleStep_in_ruleConstraint2044);
            this_SingleStep_1=ruleSingleStep();

            state._fsp--;


            		current.merge(this_SingleStep_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:877:1: entryRuleSingleStep returns [String current=null] : iv_ruleSingleStep= ruleSingleStep EOF ;
    public final String entryRuleSingleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSingleStep = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:878:2: (iv_ruleSingleStep= ruleSingleStep EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:879:2: iv_ruleSingleStep= ruleSingleStep EOF
            {
             newCompositeNode(grammarAccess.getSingleStepRule()); 
            pushFollow(FOLLOW_ruleSingleStep_in_entryRuleSingleStep2090);
            iv_ruleSingleStep=ruleSingleStep();

            state._fsp--;

             current =iv_ruleSingleStep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStep2101); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:886:1: ruleSingleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? ) ;
    public final AntlrDatatypeRuleToken ruleSingleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Ident_0 = null;

        AntlrDatatypeRuleToken this_Vals_1 = null;

        AntlrDatatypeRuleToken this_StepSuffix_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:889:28: ( (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:890:1: (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:890:1: (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:891:5: this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )?
            {
             
                    newCompositeNode(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIdent_in_ruleSingleStep2148);
            this_Ident_0=ruleIdent();

            state._fsp--;


            		current.merge(this_Ident_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:901:1: (this_Vals_1= ruleVals )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:902:5: this_Vals_1= ruleVals
                    {
                     
                            newCompositeNode(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVals_in_ruleSingleStep2176);
                    this_Vals_1=ruleVals();

                    state._fsp--;


                    		current.merge(this_Vals_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:912:3: (this_StepSuffix_2= ruleStepSuffix )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:913:5: this_StepSuffix_2= ruleStepSuffix
                    {
                     
                            newCompositeNode(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStepSuffix_in_ruleSingleStep2206);
                    this_StepSuffix_2=ruleStepSuffix();

                    state._fsp--;


                    		current.merge(this_StepSuffix_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:931:1: entryRuleIdent returns [String current=null] : iv_ruleIdent= ruleIdent EOF ;
    public final String entryRuleIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdent = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:932:2: (iv_ruleIdent= ruleIdent EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:933:2: iv_ruleIdent= ruleIdent EOF
            {
             newCompositeNode(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_ruleIdent_in_entryRuleIdent2254);
            iv_ruleIdent=ruleIdent();

            state._fsp--;

             current =iv_ruleIdent.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdent2265); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:940:1: ruleIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:943:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:944:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:944:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:944:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdent2305); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:952:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdent2331); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getIdentAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:967:1: entryRuleVals returns [String current=null] : iv_ruleVals= ruleVals EOF ;
    public final String entryRuleVals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVals = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:968:2: (iv_ruleVals= ruleVals EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:969:2: iv_ruleVals= ruleVals EOF
            {
             newCompositeNode(grammarAccess.getValsRule()); 
            pushFollow(FOLLOW_ruleVals_in_entryRuleVals2377);
            iv_ruleVals=ruleVals();

            state._fsp--;

             current =iv_ruleVals.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVals2388); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:976:1: ruleVals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* ) ;
    public final AntlrDatatypeRuleToken ruleVals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Ident_1 = null;

        AntlrDatatypeRuleToken this_Vals_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:979:28: ( (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:980:1: (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:980:1: (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:981:2: kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )*
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleVals2426); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getValsAccess().getFullStopKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleIdent_in_ruleVals2448);
            this_Ident_1=ruleIdent();

            state._fsp--;


            		current.merge(this_Ident_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:997:1: (this_Vals_2= ruleVals )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:998:5: this_Vals_2= ruleVals
            	    {
            	     
            	            newCompositeNode(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleVals_in_ruleVals2476);
            	    this_Vals_2=ruleVals();

            	    state._fsp--;


            	    		current.merge(this_Vals_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1016:1: entryRuleStepSuffix returns [String current=null] : iv_ruleStepSuffix= ruleStepSuffix EOF ;
    public final String entryRuleStepSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepSuffix = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1017:2: (iv_ruleStepSuffix= ruleStepSuffix EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1018:2: iv_ruleStepSuffix= ruleStepSuffix EOF
            {
             newCompositeNode(grammarAccess.getStepSuffixRule()); 
            pushFollow(FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix2524);
            iv_ruleStepSuffix=ruleStepSuffix();

            state._fsp--;

             current =iv_ruleStepSuffix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepSuffix2535); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1025:1: ruleStepSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_SingleStep_1= ruleSingleStep ) ;
    public final AntlrDatatypeRuleToken ruleStepSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_1 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1028:28: ( (kw= '/' this_SingleStep_1= ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1029:1: (kw= '/' this_SingleStep_1= ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1029:1: (kw= '/' this_SingleStep_1= ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1030:2: kw= '/' this_SingleStep_1= ruleSingleStep
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleStepSuffix2573); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSingleStep_in_ruleStepSuffix2595);
            this_SingleStep_1=ruleSingleStep();

            state._fsp--;


            		current.merge(this_SingleStep_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1054:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1055:2: (iv_ruleImport= ruleImport EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1056:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport2640);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport2650); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1063:1: ruleImport returns [EObject current=null] : (otherlv_0= '@import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1066:28: ( (otherlv_0= '@import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1067:1: (otherlv_0= '@import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1067:1: (otherlv_0= '@import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1067:3: otherlv_0= '@import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleImport2687); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1071:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1072:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1072:1: (lv_importURI_1_0= RULE_STRING )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1073:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport2704); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRuleSet_in_entryRuleRuleSet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleSet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_ruleRuleSet131 = new BitSet(new long[]{0x0000000024404092L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleSet153 = new BitSet(new long[]{0x0000000024404092L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleContext237 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContext249 = new BitSet(new long[]{0x0000000024404090L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleContext270 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContext282 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleContext295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_ruleSelector389 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleSelector402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_entryRuleSum441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSum452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_ruleSum499 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleSum518 = new BitSet(new long[]{0x0000000024404090L});
    public static final BitSet FOLLOW_ruleProduct_in_ruleSum540 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct646 = new BitSet(new long[]{0x0000000024404092L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleTerm751 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleTerm770 = new BitSet(new long[]{0x0000000024404090L});
    public static final BitSet FOLLOW_ruleStep_in_ruleTerm792 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleStep898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStep923 = new BitSet(new long[]{0x0000000024404090L});
    public static final BitSet FOLLOW_ruleSum_in_ruleStep945 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStep963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule1004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleRule1061 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleRule1088 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleRule1115 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleNested_in_ruleRule1142 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleRule1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_entryRuleNested1194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNested1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleNested1250 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleNested1264 = new BitSet(new long[]{0x0000000024400010L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNested1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleNested1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleNested1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNested1361 = new BitSet(new long[]{0x0000000024604090L});
    public static final BitSet FOLLOW_ruleRule_in_ruleNested1382 = new BitSet(new long[]{0x0000000024604090L});
    public static final BitSet FOLLOW_21_in_ruleNested1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleModifier1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleProperty1589 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1607 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProperty1624 = new BitSet(new long[]{0x00000000030000E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleProperty1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBoolean1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBoolean1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleValue1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleValue1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleValue1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConstraint2022 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleConstraint2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_entryRuleSingleStep2090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStep2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_ruleSingleStep2148 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleVals_in_ruleSingleStep2176 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_ruleSingleStep2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_entryRuleIdent2254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdent2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdent2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdent2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_entryRuleVals2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVals2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleVals2426 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleIdent_in_ruleVals2448 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleVals_in_ruleVals2476 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix2524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepSuffix2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleStepSuffix2573 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleStepSuffix2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport2640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleImport2687 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport2704 = new BitSet(new long[]{0x0000000000000002L});

}