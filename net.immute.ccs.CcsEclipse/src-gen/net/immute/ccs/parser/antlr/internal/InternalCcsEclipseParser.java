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
        AntlrDatatypeRuleToken lv_selector_2_0 = null;


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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:179:1: entryRuleSelector returns [String current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final String entryRuleSelector() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelector = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:180:2: (iv_ruleSelector= ruleSelector EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:181:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector334);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector345); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:188:1: ruleSelector returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Sum_0= ruleSum (kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleSelector() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Sum_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:191:28: ( (this_Sum_0= ruleSum (kw= '>' )? ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:192:1: (this_Sum_0= ruleSum (kw= '>' )? )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:192:1: (this_Sum_0= ruleSum (kw= '>' )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:193:5: this_Sum_0= ruleSum (kw= '>' )?
            {
             
                    newCompositeNode(grammarAccess.getSelectorAccess().getSumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSum_in_ruleSelector392);
            this_Sum_0=ruleSum();

            state._fsp--;


            		current.merge(this_Sum_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:203:1: (kw= '>' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:204:2: kw= '>'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleSelector411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1()); 
                        

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:217:1: entryRuleSum returns [String current=null] : iv_ruleSum= ruleSum EOF ;
    public final String entryRuleSum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSum = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:218:2: (iv_ruleSum= ruleSum EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:219:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_ruleSum_in_entryRuleSum454);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSum465); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:226:1: ruleSum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* ) ;
    public final AntlrDatatypeRuleToken ruleSum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Product_0 = null;

        AntlrDatatypeRuleToken this_Product_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:229:28: ( (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:230:1: (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:230:1: (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:231:5: this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )*
            {
             
                    newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleProduct_in_ruleSum512);
            this_Product_0=ruleProduct();

            state._fsp--;


            		current.merge(this_Product_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:241:1: (kw= ',' this_Product_2= ruleProduct )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:242:2: kw= ',' this_Product_2= ruleProduct
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleSum531); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleProduct_in_ruleSum553);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:266:1: entryRuleProduct returns [String current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final String entryRuleProduct() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProduct = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:267:2: (iv_ruleProduct= ruleProduct EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:268:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct601);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct612); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:275:1: ruleProduct returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Term_0= ruleTerm )+ ;
    public final AntlrDatatypeRuleToken ruleProduct() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Term_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:278:28: ( (this_Term_0= ruleTerm )+ )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:279:1: (this_Term_0= ruleTerm )+
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:279:1: (this_Term_0= ruleTerm )+
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
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:280:5: this_Term_0= ruleTerm
            	    {
            	     
            	            newCompositeNode(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_ruleTerm_in_ruleProduct659);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:298:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:299:2: (iv_ruleTerm= ruleTerm EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:300:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm706);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm717); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:307:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Step_0 = null;

        AntlrDatatypeRuleToken this_Step_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:310:28: ( (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:311:1: (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:311:1: (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:312:5: this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleStep_in_ruleTerm764);
            this_Step_0=ruleStep();

            state._fsp--;


            		current.merge(this_Step_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:322:1: (kw= '>' this_Step_2= ruleStep )*
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
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:323:2: kw= '>' this_Step_2= ruleStep
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleTerm783); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleStep_in_ruleTerm805);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:347:1: entryRuleStep returns [String current=null] : iv_ruleStep= ruleStep EOF ;
    public final String entryRuleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStep = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:348:2: (iv_ruleStep= ruleStep EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:349:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep853);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep864); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:356:1: ruleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_0 = null;

        AntlrDatatypeRuleToken this_Sum_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:359:28: ( (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:360:1: (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:360:1: (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) )
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
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:361:5: this_SingleStep_0= ruleSingleStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleStep_in_ruleStep911);
                    this_SingleStep_0=ruleSingleStep();

                    state._fsp--;


                    		current.merge(this_SingleStep_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:372:6: (kw= '(' this_Sum_2= ruleSum kw= ')' )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:372:6: (kw= '(' this_Sum_2= ruleSum kw= ')' )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:373:2: kw= '(' this_Sum_2= ruleSum kw= ')'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleStep936); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleSum_in_ruleStep958);
                    this_Sum_2=ruleSum();

                    state._fsp--;


                    		current.merge(this_Sum_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleStep976); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:403:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:404:2: (iv_ruleRule= ruleRule EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:405:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule1018);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule1029); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:412:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested ) (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Import_0 = null;

        AntlrDatatypeRuleToken this_Constraint_1 = null;

        AntlrDatatypeRuleToken this_Property_2 = null;

        AntlrDatatypeRuleToken this_Nested_3 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:415:28: ( ( (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested ) (kw= ';' )? ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:416:1: ( (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested ) (kw= ';' )? )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:416:1: ( (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested ) (kw= ';' )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:416:2: (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested ) (kw= ';' )?
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:416:2: (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested )
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

                if ( (LA9_4==RULE_ID||LA9_4==RULE_STRING||LA9_4==14||(LA9_4>=17 && LA9_4<=20)||(LA9_4>=27 && LA9_4<=28)) ) {
                    alt9=4;
                }
                else if ( (LA9_4==23) ) {
                    alt9=3;
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
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:417:5: this_Import_0= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getImportParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleRule1077);
                    this_Import_0=ruleImport();

                    state._fsp--;


                    		current.merge(this_Import_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:429:5: this_Constraint_1= ruleConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getConstraintParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleConstraint_in_ruleRule1110);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;


                    		current.merge(this_Constraint_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:441:5: this_Property_2= ruleProperty
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getPropertyParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleProperty_in_ruleRule1143);
                    this_Property_2=ruleProperty();

                    state._fsp--;


                    		current.merge(this_Property_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:453:5: this_Nested_3= ruleNested
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getNestedParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleNested_in_ruleRule1176);
                    this_Nested_3=ruleNested();

                    state._fsp--;


                    		current.merge(this_Nested_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:463:2: (kw= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:464:2: kw= ';'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleRule1196); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRuleAccess().getSemicolonKeyword_1()); 
                        

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:477:1: entryRuleNested returns [String current=null] : iv_ruleNested= ruleNested EOF ;
    public final String entryRuleNested() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNested = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:478:2: (iv_ruleNested= ruleNested EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:479:2: iv_ruleNested= ruleNested EOF
            {
             newCompositeNode(grammarAccess.getNestedRule()); 
            pushFollow(FOLLOW_ruleNested_in_entryRuleNested1239);
            iv_ruleNested=ruleNested();

            state._fsp--;

             current =iv_ruleNested.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNested1250); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:486:1: ruleNested returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) ) ;
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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:489:28: ( (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:490:1: (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:490:1: (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:491:5: this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) )
            {
             
                    newCompositeNode(grammarAccess.getNestedAccess().getSelectorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSelector_in_ruleNested1297);
            this_Selector_0=ruleSelector();

            state._fsp--;


            		current.merge(this_Selector_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:501:1: ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) )
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
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:501:2: (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:501:2: (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:502:2: kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty )
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleNested1317); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
                        
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:507:1: (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty )
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
                    case EOF:
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
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:508:5: this_Import_2= ruleImport
                            {
                             
                                    newCompositeNode(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 
                                
                            pushFollow(FOLLOW_ruleImport_in_ruleNested1340);
                            this_Import_2=ruleImport();

                            state._fsp--;


                            		current.merge(this_Import_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:520:5: this_Constraint_3= ruleConstraint
                            {
                             
                                    newCompositeNode(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 
                                
                            pushFollow(FOLLOW_ruleConstraint_in_ruleNested1373);
                            this_Constraint_3=ruleConstraint();

                            state._fsp--;


                            		current.merge(this_Constraint_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 3 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:532:5: this_Property_4= ruleProperty
                            {
                             
                                    newCompositeNode(grammarAccess.getNestedAccess().getPropertyParserRuleCall_1_0_1_2()); 
                                
                            pushFollow(FOLLOW_ruleProperty_in_ruleNested1406);
                            this_Property_4=ruleProperty();

                            state._fsp--;


                            		current.merge(this_Property_4);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:543:6: (kw= '{' (this_Rule_6= ruleRule )* kw= '}' )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:543:6: (kw= '{' (this_Rule_6= ruleRule )* kw= '}' )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:544:2: kw= '{' (this_Rule_6= ruleRule )* kw= '}'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleNested1433); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
                        
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:549:1: (this_Rule_6= ruleRule )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==EOF||LA12_0==RULE_ID||LA12_0==RULE_STRING||LA12_0==14||LA12_0==22||LA12_0==26||LA12_0==29) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:550:5: this_Rule_6= ruleRule
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getNestedAccess().getRuleParserRuleCall_1_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleRule_in_ruleNested1456);
                    	    this_Rule_6=ruleRule();

                    	    state._fsp--;


                    	    		current.merge(this_Rule_6);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    kw=(Token)match(input,21,FOLLOW_21_in_ruleNested1476); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_1_1_2()); 
                        

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:574:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:575:2: (iv_ruleModifier= ruleModifier EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:576:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier1519);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier1530); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:583:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@override' )? ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:586:28: ( (kw= '@override' )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:587:1: (kw= '@override' )?
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:587:1: (kw= '@override' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:588:2: kw= '@override'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleModifier1568); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierAccess().getOverrideKeyword()); 
                        

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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleProperty"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:601:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:602:2: (iv_ruleProperty= ruleProperty EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:603:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1610);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1621); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:610:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Modifier_0= ruleModifier this_ID_1= RULE_ID kw= '=' this_Value_3= ruleValue ) ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Modifier_0 = null;

        AntlrDatatypeRuleToken this_Value_3 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:613:28: ( (this_Modifier_0= ruleModifier this_ID_1= RULE_ID kw= '=' this_Value_3= ruleValue ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:614:1: (this_Modifier_0= ruleModifier this_ID_1= RULE_ID kw= '=' this_Value_3= ruleValue )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:614:1: (this_Modifier_0= ruleModifier this_ID_1= RULE_ID kw= '=' this_Value_3= ruleValue )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:615:5: this_Modifier_0= ruleModifier this_ID_1= RULE_ID kw= '=' this_Value_3= ruleValue
            {
             
                    newCompositeNode(grammarAccess.getPropertyAccess().getModifierParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleModifier_in_ruleProperty1668);
            this_Modifier_0=ruleModifier();

            state._fsp--;


            		current.merge(this_Modifier_0);
                
             
                    afterParserOrEnumRuleCall();
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1688); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getPropertyAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,23,FOLLOW_23_in_ruleProperty1706); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getPropertyAccess().getValueParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleProperty1728);
            this_Value_3=ruleValue();

            state._fsp--;


            		current.merge(this_Value_3);
                
             
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulebool"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:657:1: entryRulebool returns [String current=null] : iv_rulebool= rulebool EOF ;
    public final String entryRulebool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebool = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:658:2: (iv_rulebool= rulebool EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:659:2: iv_rulebool= rulebool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_rulebool_in_entryRulebool1774);
            iv_rulebool=rulebool();

            state._fsp--;

             current =iv_rulebool.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebool1785); 

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
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:666:1: rulebool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken rulebool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:669:28: ( (kw= 'true' | kw= 'false' ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:670:1: (kw= 'true' | kw= 'false' )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:670:1: (kw= 'true' | kw= 'false' )
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
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:671:2: kw= 'true'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_rulebool1823); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:678:2: kw= 'false'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulebool1842); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBoolAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleValue"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:691:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:692:2: (iv_ruleValue= ruleValue EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:693:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1883);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1894); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:700:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_bool_3= rulebool ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEXINT_0=null;
        Token this_NUMBER_1=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_bool_3 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:703:28: ( (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_bool_3= rulebool ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:704:1: (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_bool_3= rulebool )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:704:1: (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_bool_3= rulebool )
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
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:704:6: this_HEXINT_0= RULE_HEXINT
                    {
                    this_HEXINT_0=(Token)match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleValue1934); 

                    		current.merge(this_HEXINT_0);
                        
                     
                        newLeafNode(this_HEXINT_0, grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:712:10: this_NUMBER_1= RULE_NUMBER
                    {
                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleValue1960); 

                    		current.merge(this_NUMBER_1);
                        
                     
                        newLeafNode(this_NUMBER_1, grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:720:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue1986); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:729:5: this_bool_3= rulebool
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBoolParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulebool_in_ruleValue2019);
                    this_bool_3=rulebool();

                    state._fsp--;


                    		current.merge(this_bool_3);
                        
                     
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:747:1: entryRuleConstraint returns [String current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final String entryRuleConstraint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstraint = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:748:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:749:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint2065);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint2076); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:756:1: ruleConstraint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@constrain' this_SingleStep_1= ruleSingleStep ) ;
    public final AntlrDatatypeRuleToken ruleConstraint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_1 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:759:28: ( (kw= '@constrain' this_SingleStep_1= ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:760:1: (kw= '@constrain' this_SingleStep_1= ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:760:1: (kw= '@constrain' this_SingleStep_1= ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:761:2: kw= '@constrain' this_SingleStep_1= ruleSingleStep
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleConstraint2114); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSingleStep_in_ruleConstraint2136);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:785:1: entryRuleSingleStep returns [String current=null] : iv_ruleSingleStep= ruleSingleStep EOF ;
    public final String entryRuleSingleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSingleStep = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:786:2: (iv_ruleSingleStep= ruleSingleStep EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:787:2: iv_ruleSingleStep= ruleSingleStep EOF
            {
             newCompositeNode(grammarAccess.getSingleStepRule()); 
            pushFollow(FOLLOW_ruleSingleStep_in_entryRuleSingleStep2182);
            iv_ruleSingleStep=ruleSingleStep();

            state._fsp--;

             current =iv_ruleSingleStep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStep2193); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:794:1: ruleSingleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? ) ;
    public final AntlrDatatypeRuleToken ruleSingleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Ident_0 = null;

        AntlrDatatypeRuleToken this_Vals_1 = null;

        AntlrDatatypeRuleToken this_StepSuffix_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:797:28: ( (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:798:1: (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:798:1: (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:799:5: this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )?
            {
             
                    newCompositeNode(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIdent_in_ruleSingleStep2240);
            this_Ident_0=ruleIdent();

            state._fsp--;


            		current.merge(this_Ident_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:809:1: (this_Vals_1= ruleVals )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:810:5: this_Vals_1= ruleVals
                    {
                     
                            newCompositeNode(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVals_in_ruleSingleStep2268);
                    this_Vals_1=ruleVals();

                    state._fsp--;


                    		current.merge(this_Vals_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:820:3: (this_StepSuffix_2= ruleStepSuffix )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:821:5: this_StepSuffix_2= ruleStepSuffix
                    {
                     
                            newCompositeNode(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStepSuffix_in_ruleSingleStep2298);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:839:1: entryRuleIdent returns [String current=null] : iv_ruleIdent= ruleIdent EOF ;
    public final String entryRuleIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdent = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:840:2: (iv_ruleIdent= ruleIdent EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:841:2: iv_ruleIdent= ruleIdent EOF
            {
             newCompositeNode(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_ruleIdent_in_entryRuleIdent2346);
            iv_ruleIdent=ruleIdent();

            state._fsp--;

             current =iv_ruleIdent.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdent2357); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:848:1: ruleIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:851:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:852:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:852:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
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
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:852:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdent2397); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:860:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdent2423); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:875:1: entryRuleVals returns [String current=null] : iv_ruleVals= ruleVals EOF ;
    public final String entryRuleVals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVals = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:876:2: (iv_ruleVals= ruleVals EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:877:2: iv_ruleVals= ruleVals EOF
            {
             newCompositeNode(grammarAccess.getValsRule()); 
            pushFollow(FOLLOW_ruleVals_in_entryRuleVals2469);
            iv_ruleVals=ruleVals();

            state._fsp--;

             current =iv_ruleVals.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVals2480); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:884:1: ruleVals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* ) ;
    public final AntlrDatatypeRuleToken ruleVals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Ident_1 = null;

        AntlrDatatypeRuleToken this_Vals_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:887:28: ( (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:888:1: (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:888:1: (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:889:2: kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )*
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleVals2518); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getValsAccess().getFullStopKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleIdent_in_ruleVals2540);
            this_Ident_1=ruleIdent();

            state._fsp--;


            		current.merge(this_Ident_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:905:1: (this_Vals_2= ruleVals )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:906:5: this_Vals_2= ruleVals
            	    {
            	     
            	            newCompositeNode(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleVals_in_ruleVals2568);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:924:1: entryRuleStepSuffix returns [String current=null] : iv_ruleStepSuffix= ruleStepSuffix EOF ;
    public final String entryRuleStepSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepSuffix = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:925:2: (iv_ruleStepSuffix= ruleStepSuffix EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:926:2: iv_ruleStepSuffix= ruleStepSuffix EOF
            {
             newCompositeNode(grammarAccess.getStepSuffixRule()); 
            pushFollow(FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix2616);
            iv_ruleStepSuffix=ruleStepSuffix();

            state._fsp--;

             current =iv_ruleStepSuffix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepSuffix2627); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:933:1: ruleStepSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_SingleStep_1= ruleSingleStep ) ;
    public final AntlrDatatypeRuleToken ruleStepSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_1 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:936:28: ( (kw= '/' this_SingleStep_1= ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:937:1: (kw= '/' this_SingleStep_1= ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:937:1: (kw= '/' this_SingleStep_1= ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:938:2: kw= '/' this_SingleStep_1= ruleSingleStep
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleStepSuffix2665); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSingleStep_in_ruleStepSuffix2687);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:962:1: entryRuleImport returns [String current=null] : iv_ruleImport= ruleImport EOF ;
    public final String entryRuleImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:963:2: (iv_ruleImport= ruleImport EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:964:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport2733);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport2744); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:971:1: ruleImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@import' this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:974:28: ( (kw= '@import' this_STRING_1= RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:975:1: (kw= '@import' this_STRING_1= RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:975:1: (kw= '@import' this_STRING_1= RULE_STRING )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:976:2: kw= '@import' this_STRING_1= RULE_STRING
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleImport2782); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport2797); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getImportAccess().getSTRINGTerminalRuleCall_1()); 
                

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
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_ruleSelector392 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleSelector411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_entryRuleSum454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSum465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_ruleSum512 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleSum531 = new BitSet(new long[]{0x0000000024404090L});
    public static final BitSet FOLLOW_ruleProduct_in_ruleSum553 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct659 = new BitSet(new long[]{0x0000000024404092L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleTerm764 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleTerm783 = new BitSet(new long[]{0x0000000024404090L});
    public static final BitSet FOLLOW_ruleStep_in_ruleTerm805 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleStep911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStep936 = new BitSet(new long[]{0x0000000024404090L});
    public static final BitSet FOLLOW_ruleSum_in_ruleStep958 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStep976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleRule1077 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleRule1110 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleRule1143 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleNested_in_ruleRule1176 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleRule1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_entryRuleNested1239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNested1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleNested1297 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleNested1317 = new BitSet(new long[]{0x0000000024400010L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNested1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleNested1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleNested1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNested1433 = new BitSet(new long[]{0x0000000024604090L});
    public static final BitSet FOLLOW_ruleRule_in_ruleNested1456 = new BitSet(new long[]{0x0000000024604090L});
    public static final BitSet FOLLOW_21_in_ruleNested1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleModifier1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleProperty1668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1688 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProperty1706 = new BitSet(new long[]{0x00000000030000E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleProperty1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebool_in_entryRulebool1774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebool1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulebool1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulebool1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleValue1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleValue1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebool_in_ruleValue2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint2065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConstraint2114 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleConstraint2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_entryRuleSingleStep2182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStep2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_ruleSingleStep2240 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleVals_in_ruleSingleStep2268 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_ruleSingleStep2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdent_in_entryRuleIdent2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdent2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdent2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdent2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_entryRuleVals2469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVals2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleVals2518 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleIdent_in_ruleVals2540 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleVals_in_ruleVals2568 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix2616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepSuffix2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleStepSuffix2665 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleStepSuffix2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport2733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleImport2782 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport2797 = new BitSet(new long[]{0x0000000000000002L});

}