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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HEXINT", "RULE_NUMBER", "RULE_STRING", "RULE_NUM_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'@context'", "'('", "')'", "';'", "'>'", "','", "':'", "'{'", "'}'", "'@override'", "'='", "'true'", "'false'", "'@constrain'", "'.'", "'/'", "'@import'"
    };
    public static final int RULE_STRING=7;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_NUMBER=6;
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
    public static final int RULE_HEXINT=5;

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
    // InternalCcsEclipse.g:67:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalCcsEclipse.g:71:2: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalCcsEclipse.g:72:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalCcsEclipse.g:82:1: ruleRuleSet returns [EObject current=null] : ( ( (lv_context_0_0= ruleContext ) )? ( (lv_rules_1_0= ruleRule ) )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject lv_context_0_0 = null;

        EObject lv_rules_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalCcsEclipse.g:86:28: ( ( ( (lv_context_0_0= ruleContext ) )? ( (lv_rules_1_0= ruleRule ) )* ) )
            // InternalCcsEclipse.g:87:1: ( ( (lv_context_0_0= ruleContext ) )? ( (lv_rules_1_0= ruleRule ) )* )
            {
            // InternalCcsEclipse.g:87:1: ( ( (lv_context_0_0= ruleContext ) )? ( (lv_rules_1_0= ruleRule ) )* )
            // InternalCcsEclipse.g:87:2: ( (lv_context_0_0= ruleContext ) )? ( (lv_rules_1_0= ruleRule ) )*
            {
            // InternalCcsEclipse.g:87:2: ( (lv_context_0_0= ruleContext ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCcsEclipse.g:88:1: (lv_context_0_0= ruleContext )
                    {
                    // InternalCcsEclipse.g:88:1: (lv_context_0_0= ruleContext )
                    // InternalCcsEclipse.g:89:3: lv_context_0_0= ruleContext
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleSetAccess().getContextContextParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_3);
                    lv_context_0_0=ruleContext();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
                    	        }
                           		set(
                           			current, 
                           			"context",
                            		lv_context_0_0, 
                            		"net.immute.ccs.CcsEclipse.Context");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalCcsEclipse.g:105:3: ( (lv_rules_1_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_STRING||LA2_0==13||LA2_0==21||LA2_0==25||LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCcsEclipse.g:106:1: (lv_rules_1_0= ruleRule )
            	    {
            	    // InternalCcsEclipse.g:106:1: (lv_rules_1_0= ruleRule )
            	    // InternalCcsEclipse.g:107:3: lv_rules_1_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_1_0, 
            	            		"net.immute.ccs.CcsEclipse.Rule");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleContext"
    // InternalCcsEclipse.g:134:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalCcsEclipse.g:135:2: (iv_ruleContext= ruleContext EOF )
            // InternalCcsEclipse.g:136:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:143:1: ruleContext returns [EObject current=null] : (otherlv_0= '@context' otherlv_1= '(' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= ')' (otherlv_4= ';' )? ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_selector_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:146:28: ( (otherlv_0= '@context' otherlv_1= '(' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= ')' (otherlv_4= ';' )? ) )
            // InternalCcsEclipse.g:147:1: (otherlv_0= '@context' otherlv_1= '(' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= ')' (otherlv_4= ';' )? )
            {
            // InternalCcsEclipse.g:147:1: (otherlv_0= '@context' otherlv_1= '(' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= ')' (otherlv_4= ';' )? )
            // InternalCcsEclipse.g:147:3: otherlv_0= '@context' otherlv_1= '(' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= ')' (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getContextAccess().getLeftParenthesisKeyword_1());
                
            // InternalCcsEclipse.g:155:1: ( (lv_selector_2_0= ruleSelector ) )
            // InternalCcsEclipse.g:156:1: (lv_selector_2_0= ruleSelector )
            {
            // InternalCcsEclipse.g:156:1: (lv_selector_2_0= ruleSelector )
            // InternalCcsEclipse.g:157:3: lv_selector_2_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getContextAccess().getSelectorSelectorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_6);
            lv_selector_2_0=ruleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextRule());
            	        }
                   		set(
                   			current, 
                   			"selector",
                    		lv_selector_2_0, 
                    		"net.immute.ccs.CcsEclipse.Selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

                	newLeafNode(otherlv_3, grammarAccess.getContextAccess().getRightParenthesisKeyword_3());
                
            // InternalCcsEclipse.g:177:1: (otherlv_4= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCcsEclipse.g:177:3: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalCcsEclipse.g:189:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalCcsEclipse.g:190:2: (iv_ruleSelector= ruleSelector EOF )
            // InternalCcsEclipse.g:191:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:198:1: ruleSelector returns [EObject current=null] : ( ( (lv_sum_0_0= ruleSum ) ) (otherlv_1= '>' )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sum_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:201:28: ( ( ( (lv_sum_0_0= ruleSum ) ) (otherlv_1= '>' )? ) )
            // InternalCcsEclipse.g:202:1: ( ( (lv_sum_0_0= ruleSum ) ) (otherlv_1= '>' )? )
            {
            // InternalCcsEclipse.g:202:1: ( ( (lv_sum_0_0= ruleSum ) ) (otherlv_1= '>' )? )
            // InternalCcsEclipse.g:202:2: ( (lv_sum_0_0= ruleSum ) ) (otherlv_1= '>' )?
            {
            // InternalCcsEclipse.g:202:2: ( (lv_sum_0_0= ruleSum ) )
            // InternalCcsEclipse.g:203:1: (lv_sum_0_0= ruleSum )
            {
            // InternalCcsEclipse.g:203:1: (lv_sum_0_0= ruleSum )
            // InternalCcsEclipse.g:204:3: lv_sum_0_0= ruleSum
            {
             
            	        newCompositeNode(grammarAccess.getSelectorAccess().getSumSumParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_8);
            lv_sum_0_0=ruleSum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectorRule());
            	        }
                   		set(
                   			current, 
                   			"sum",
                    		lv_sum_0_0, 
                    		"net.immute.ccs.CcsEclipse.Sum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCcsEclipse.g:220:2: (otherlv_1= '>' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCcsEclipse.g:220:4: otherlv_1= '>'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); 

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
    // InternalCcsEclipse.g:232:1: entryRuleSum returns [String current=null] : iv_ruleSum= ruleSum EOF ;
    public final String entryRuleSum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSum = null;


        try {
            // InternalCcsEclipse.g:233:2: (iv_ruleSum= ruleSum EOF )
            // InternalCcsEclipse.g:234:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:241:1: ruleSum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* ) ;
    public final AntlrDatatypeRuleToken ruleSum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Product_0 = null;

        AntlrDatatypeRuleToken this_Product_2 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:244:28: ( (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* ) )
            // InternalCcsEclipse.g:245:1: (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* )
            {
            // InternalCcsEclipse.g:245:1: (this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )* )
            // InternalCcsEclipse.g:246:5: this_Product_0= ruleProduct (kw= ',' this_Product_2= ruleProduct )*
            {
             
                    newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
                
            pushFollow(FOLLOW_9);
            this_Product_0=ruleProduct();

            state._fsp--;


            		current.merge(this_Product_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalCcsEclipse.g:256:1: (kw= ',' this_Product_2= ruleProduct )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCcsEclipse.g:257:2: kw= ',' this_Product_2= ruleProduct
            	    {
            	    kw=(Token)match(input,17,FOLLOW_5); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_9);
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
    // InternalCcsEclipse.g:281:1: entryRuleProduct returns [String current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final String entryRuleProduct() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProduct = null;


        try {
            // InternalCcsEclipse.g:282:2: (iv_ruleProduct= ruleProduct EOF )
            // InternalCcsEclipse.g:283:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:290:1: ruleProduct returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Term_0= ruleTerm )+ ;
    public final AntlrDatatypeRuleToken ruleProduct() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Term_0 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:293:28: ( (this_Term_0= ruleTerm )+ )
            // InternalCcsEclipse.g:294:1: (this_Term_0= ruleTerm )+
            {
            // InternalCcsEclipse.g:294:1: (this_Term_0= ruleTerm )+
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
            	    // InternalCcsEclipse.g:295:5: this_Term_0= ruleTerm
            	    {
            	     
            	            newCompositeNode(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_3);
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
    // InternalCcsEclipse.g:313:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            // InternalCcsEclipse.g:314:2: (iv_ruleTerm= ruleTerm EOF )
            // InternalCcsEclipse.g:315:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:322:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Step_0 = null;

        AntlrDatatypeRuleToken this_Step_2 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:325:28: ( (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* ) )
            // InternalCcsEclipse.g:326:1: (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* )
            {
            // InternalCcsEclipse.g:326:1: (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* )
            // InternalCcsEclipse.g:327:5: this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
                
            pushFollow(FOLLOW_8);
            this_Step_0=ruleStep();

            state._fsp--;


            		current.merge(this_Step_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalCcsEclipse.g:337:1: (kw= '>' this_Step_2= ruleStep )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==RULE_ID||LA7_2==RULE_STRING||LA7_2==13) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalCcsEclipse.g:338:2: kw= '>' this_Step_2= ruleStep
            	    {
            	    kw=(Token)match(input,16,FOLLOW_5); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_8);
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
    // InternalCcsEclipse.g:362:1: entryRuleStep returns [String current=null] : iv_ruleStep= ruleStep EOF ;
    public final String entryRuleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStep = null;


        try {
            // InternalCcsEclipse.g:363:2: (iv_ruleStep= ruleStep EOF )
            // InternalCcsEclipse.g:364:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:371:1: ruleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_0 = null;

        AntlrDatatypeRuleToken this_Sum_2 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:374:28: ( (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) ) )
            // InternalCcsEclipse.g:375:1: (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) )
            {
            // InternalCcsEclipse.g:375:1: (this_SingleStep_0= ruleSingleStep | (kw= '(' this_Sum_2= ruleSum kw= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCcsEclipse.g:376:5: this_SingleStep_0= ruleSingleStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getSingleStepParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SingleStep_0=ruleSingleStep();

                    state._fsp--;


                    		current.merge(this_SingleStep_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:387:6: (kw= '(' this_Sum_2= ruleSum kw= ')' )
                    {
                    // InternalCcsEclipse.g:387:6: (kw= '(' this_Sum_2= ruleSum kw= ')' )
                    // InternalCcsEclipse.g:388:2: kw= '(' this_Sum_2= ruleSum kw= ')'
                    {
                    kw=(Token)match(input,13,FOLLOW_5); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStepAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getStepAccess().getSumParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_6);
                    this_Sum_2=ruleSum();

                    state._fsp--;


                    		current.merge(this_Sum_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,14,FOLLOW_2); 

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
    // InternalCcsEclipse.g:418:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalCcsEclipse.g:419:2: (iv_ruleRule= ruleRule EOF )
            // InternalCcsEclipse.g:420:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:427:1: ruleRule returns [EObject current=null] : ( ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_import_0_0 = null;

        AntlrDatatypeRuleToken lv_constraint_1_0 = null;

        EObject lv_property_2_0 = null;

        EObject lv_nested_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:430:28: ( ( ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) ) (otherlv_4= ';' )? ) )
            // InternalCcsEclipse.g:431:1: ( ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) ) (otherlv_4= ';' )? )
            {
            // InternalCcsEclipse.g:431:1: ( ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) ) (otherlv_4= ';' )? )
            // InternalCcsEclipse.g:431:2: ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) ) (otherlv_4= ';' )?
            {
            // InternalCcsEclipse.g:431:2: ( ( (lv_import_0_0= ruleImport ) ) | ( (lv_constraint_1_0= ruleConstraint ) ) | ( (lv_property_2_0= ruleProperty ) ) | ( (lv_nested_3_0= ruleNested ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==RULE_ID||LA9_4==RULE_STRING||LA9_4==13||(LA9_4>=16 && LA9_4<=19)||(LA9_4>=26 && LA9_4<=27)) ) {
                    alt9=4;
                }
                else if ( (LA9_4==22) ) {
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
            case 13:
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
                    // InternalCcsEclipse.g:431:3: ( (lv_import_0_0= ruleImport ) )
                    {
                    // InternalCcsEclipse.g:431:3: ( (lv_import_0_0= ruleImport ) )
                    // InternalCcsEclipse.g:432:1: (lv_import_0_0= ruleImport )
                    {
                    // InternalCcsEclipse.g:432:1: (lv_import_0_0= ruleImport )
                    // InternalCcsEclipse.g:433:3: lv_import_0_0= ruleImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getImportImportParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_7);
                    lv_import_0_0=ruleImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"import",
                            		lv_import_0_0, 
                            		"net.immute.ccs.CcsEclipse.Import");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:450:6: ( (lv_constraint_1_0= ruleConstraint ) )
                    {
                    // InternalCcsEclipse.g:450:6: ( (lv_constraint_1_0= ruleConstraint ) )
                    // InternalCcsEclipse.g:451:1: (lv_constraint_1_0= ruleConstraint )
                    {
                    // InternalCcsEclipse.g:451:1: (lv_constraint_1_0= ruleConstraint )
                    // InternalCcsEclipse.g:452:3: lv_constraint_1_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getConstraintConstraintParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_7);
                    lv_constraint_1_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"constraint",
                            		lv_constraint_1_0, 
                            		"net.immute.ccs.CcsEclipse.Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCcsEclipse.g:469:6: ( (lv_property_2_0= ruleProperty ) )
                    {
                    // InternalCcsEclipse.g:469:6: ( (lv_property_2_0= ruleProperty ) )
                    // InternalCcsEclipse.g:470:1: (lv_property_2_0= ruleProperty )
                    {
                    // InternalCcsEclipse.g:470:1: (lv_property_2_0= ruleProperty )
                    // InternalCcsEclipse.g:471:3: lv_property_2_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getPropertyPropertyParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_7);
                    lv_property_2_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"property",
                            		lv_property_2_0, 
                            		"net.immute.ccs.CcsEclipse.Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCcsEclipse.g:488:6: ( (lv_nested_3_0= ruleNested ) )
                    {
                    // InternalCcsEclipse.g:488:6: ( (lv_nested_3_0= ruleNested ) )
                    // InternalCcsEclipse.g:489:1: (lv_nested_3_0= ruleNested )
                    {
                    // InternalCcsEclipse.g:489:1: (lv_nested_3_0= ruleNested )
                    // InternalCcsEclipse.g:490:3: lv_nested_3_0= ruleNested
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getNestedNestedParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_7);
                    lv_nested_3_0=ruleNested();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"nested",
                            		lv_nested_3_0, 
                            		"net.immute.ccs.CcsEclipse.Nested");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalCcsEclipse.g:506:3: (otherlv_4= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCcsEclipse.g:506:5: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalCcsEclipse.g:518:1: entryRuleNested returns [EObject current=null] : iv_ruleNested= ruleNested EOF ;
    public final EObject entryRuleNested() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNested = null;


        try {
            // InternalCcsEclipse.g:519:2: (iv_ruleNested= ruleNested EOF )
            // InternalCcsEclipse.g:520:2: iv_ruleNested= ruleNested EOF
            {
             newCompositeNode(grammarAccess.getNestedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNested=ruleNested();

            state._fsp--;

             current =iv_ruleNested; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:527:1: ruleNested returns [EObject current=null] : ( ( (lv_selector_0_0= ruleSelector ) ) ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) ) ) ;
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
            // InternalCcsEclipse.g:530:28: ( ( ( (lv_selector_0_0= ruleSelector ) ) ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) ) ) )
            // InternalCcsEclipse.g:531:1: ( ( (lv_selector_0_0= ruleSelector ) ) ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) ) )
            {
            // InternalCcsEclipse.g:531:1: ( ( (lv_selector_0_0= ruleSelector ) ) ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) ) )
            // InternalCcsEclipse.g:531:2: ( (lv_selector_0_0= ruleSelector ) ) ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) )
            {
            // InternalCcsEclipse.g:531:2: ( (lv_selector_0_0= ruleSelector ) )
            // InternalCcsEclipse.g:532:1: (lv_selector_0_0= ruleSelector )
            {
            // InternalCcsEclipse.g:532:1: (lv_selector_0_0= ruleSelector )
            // InternalCcsEclipse.g:533:3: lv_selector_0_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getNestedAccess().getSelectorSelectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_10);
            lv_selector_0_0=ruleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNestedRule());
            	        }
                   		set(
                   			current, 
                   			"selector",
                    		lv_selector_0_0, 
                    		"net.immute.ccs.CcsEclipse.Selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCcsEclipse.g:549:2: ( (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) ) | (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==19) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCcsEclipse.g:549:3: (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) )
                    {
                    // InternalCcsEclipse.g:549:3: (otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) ) )
                    // InternalCcsEclipse.g:549:5: otherlv_1= ':' ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_11); 

                        	newLeafNode(otherlv_1, grammarAccess.getNestedAccess().getColonKeyword_1_0_0());
                        
                    // InternalCcsEclipse.g:553:1: ( ( (lv_import_2_0= ruleImport ) ) | ( (lv_constraint_3_0= ruleConstraint ) ) | ( (lv_property_4_0= ruleProperty ) ) )
                    int alt11=3;
                    switch ( input.LA(1) ) {
                    case 28:
                        {
                        alt11=1;
                        }
                        break;
                    case 25:
                        {
                        alt11=2;
                        }
                        break;
                    case RULE_ID:
                    case 21:
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
                            // InternalCcsEclipse.g:553:2: ( (lv_import_2_0= ruleImport ) )
                            {
                            // InternalCcsEclipse.g:553:2: ( (lv_import_2_0= ruleImport ) )
                            // InternalCcsEclipse.g:554:1: (lv_import_2_0= ruleImport )
                            {
                            // InternalCcsEclipse.g:554:1: (lv_import_2_0= ruleImport )
                            // InternalCcsEclipse.g:555:3: lv_import_2_0= ruleImport
                            {
                             
                            	        newCompositeNode(grammarAccess.getNestedAccess().getImportImportParserRuleCall_1_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_2);
                            lv_import_2_0=ruleImport();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNestedRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"import",
                                    		lv_import_2_0, 
                                    		"net.immute.ccs.CcsEclipse.Import");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalCcsEclipse.g:572:6: ( (lv_constraint_3_0= ruleConstraint ) )
                            {
                            // InternalCcsEclipse.g:572:6: ( (lv_constraint_3_0= ruleConstraint ) )
                            // InternalCcsEclipse.g:573:1: (lv_constraint_3_0= ruleConstraint )
                            {
                            // InternalCcsEclipse.g:573:1: (lv_constraint_3_0= ruleConstraint )
                            // InternalCcsEclipse.g:574:3: lv_constraint_3_0= ruleConstraint
                            {
                             
                            	        newCompositeNode(grammarAccess.getNestedAccess().getConstraintConstraintParserRuleCall_1_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_2);
                            lv_constraint_3_0=ruleConstraint();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNestedRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"constraint",
                                    		lv_constraint_3_0, 
                                    		"net.immute.ccs.CcsEclipse.Constraint");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalCcsEclipse.g:591:6: ( (lv_property_4_0= ruleProperty ) )
                            {
                            // InternalCcsEclipse.g:591:6: ( (lv_property_4_0= ruleProperty ) )
                            // InternalCcsEclipse.g:592:1: (lv_property_4_0= ruleProperty )
                            {
                            // InternalCcsEclipse.g:592:1: (lv_property_4_0= ruleProperty )
                            // InternalCcsEclipse.g:593:3: lv_property_4_0= ruleProperty
                            {
                             
                            	        newCompositeNode(grammarAccess.getNestedAccess().getPropertyPropertyParserRuleCall_1_0_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_2);
                            lv_property_4_0=ruleProperty();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNestedRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"property",
                                    		lv_property_4_0, 
                                    		"net.immute.ccs.CcsEclipse.Property");
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
                    // InternalCcsEclipse.g:610:6: (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' )
                    {
                    // InternalCcsEclipse.g:610:6: (otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' )
                    // InternalCcsEclipse.g:610:8: otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_12); 

                        	newLeafNode(otherlv_5, grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0());
                        
                    // InternalCcsEclipse.g:614:1: ( (lv_rules_6_0= ruleRule ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||LA12_0==RULE_STRING||LA12_0==13||LA12_0==21||LA12_0==25||LA12_0==28) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCcsEclipse.g:615:1: (lv_rules_6_0= ruleRule )
                    	    {
                    	    // InternalCcsEclipse.g:615:1: (lv_rules_6_0= ruleRule )
                    	    // InternalCcsEclipse.g:616:3: lv_rules_6_0= ruleRule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNestedAccess().getRulesRuleParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_12);
                    	    lv_rules_6_0=ruleRule();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNestedRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rules",
                    	            		lv_rules_6_0, 
                    	            		"net.immute.ccs.CcsEclipse.Rule");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

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
    // InternalCcsEclipse.g:644:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalCcsEclipse.g:645:2: (iv_ruleModifier= ruleModifier EOF )
            // InternalCcsEclipse.g:646:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:653:1: ruleModifier returns [EObject current=null] : ( (lv_override_0_0= '@override' ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token lv_override_0_0=null;

         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:656:28: ( ( (lv_override_0_0= '@override' ) ) )
            // InternalCcsEclipse.g:657:1: ( (lv_override_0_0= '@override' ) )
            {
            // InternalCcsEclipse.g:657:1: ( (lv_override_0_0= '@override' ) )
            // InternalCcsEclipse.g:658:1: (lv_override_0_0= '@override' )
            {
            // InternalCcsEclipse.g:658:1: (lv_override_0_0= '@override' )
            // InternalCcsEclipse.g:659:3: lv_override_0_0= '@override'
            {
            lv_override_0_0=(Token)match(input,21,FOLLOW_2); 

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
    // InternalCcsEclipse.g:680:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalCcsEclipse.g:681:2: (iv_ruleProperty= ruleProperty EOF )
            // InternalCcsEclipse.g:682:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:689:1: ruleProperty returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:692:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalCcsEclipse.g:693:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalCcsEclipse.g:693:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            // InternalCcsEclipse.g:693:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) )
            {
            // InternalCcsEclipse.g:693:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCcsEclipse.g:694:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // InternalCcsEclipse.g:694:1: (lv_modifiers_0_0= ruleModifier )
            	    // InternalCcsEclipse.g:695:3: lv_modifiers_0_0= ruleModifier
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyAccess().getModifiersModifierParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modifiers",
            	            		lv_modifiers_0_0, 
            	            		"net.immute.ccs.CcsEclipse.Modifier");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalCcsEclipse.g:711:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCcsEclipse.g:712:1: (lv_name_1_0= RULE_ID )
            {
            // InternalCcsEclipse.g:712:1: (lv_name_1_0= RULE_ID )
            // InternalCcsEclipse.g:713:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"net.immute.ccs.CcsEclipse.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_15); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
                
            // InternalCcsEclipse.g:733:1: ( (lv_value_3_0= ruleValue ) )
            // InternalCcsEclipse.g:734:1: (lv_value_3_0= ruleValue )
            {
            // InternalCcsEclipse.g:734:1: (lv_value_3_0= ruleValue )
            // InternalCcsEclipse.g:735:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"net.immute.ccs.CcsEclipse.Value");
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
    // InternalCcsEclipse.g:759:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalCcsEclipse.g:760:2: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalCcsEclipse.g:761:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:768:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:771:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalCcsEclipse.g:772:1: (kw= 'true' | kw= 'false' )
            {
            // InternalCcsEclipse.g:772:1: (kw= 'true' | kw= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            else if ( (LA15_0==24) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCcsEclipse.g:773:2: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:780:2: kw= 'false'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

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
    // InternalCcsEclipse.g:793:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalCcsEclipse.g:794:2: (iv_ruleValue= ruleValue EOF )
            // InternalCcsEclipse.g:795:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:802:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_Boolean_3= ruleBoolean | this_ID_4= RULE_ID | this_NUM_ID_5= RULE_NUM_ID ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEXINT_0=null;
        Token this_NUMBER_1=null;
        Token this_STRING_2=null;
        Token this_ID_4=null;
        Token this_NUM_ID_5=null;
        AntlrDatatypeRuleToken this_Boolean_3 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:805:28: ( (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_Boolean_3= ruleBoolean | this_ID_4= RULE_ID | this_NUM_ID_5= RULE_NUM_ID ) )
            // InternalCcsEclipse.g:806:1: (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_Boolean_3= ruleBoolean | this_ID_4= RULE_ID | this_NUM_ID_5= RULE_NUM_ID )
            {
            // InternalCcsEclipse.g:806:1: (this_HEXINT_0= RULE_HEXINT | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_Boolean_3= ruleBoolean | this_ID_4= RULE_ID | this_NUM_ID_5= RULE_NUM_ID )
            int alt16=6;
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
            case 23:
            case 24:
                {
                alt16=4;
                }
                break;
            case RULE_ID:
                {
                alt16=5;
                }
                break;
            case RULE_NUM_ID:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalCcsEclipse.g:806:6: this_HEXINT_0= RULE_HEXINT
                    {
                    this_HEXINT_0=(Token)match(input,RULE_HEXINT,FOLLOW_2); 

                    		current.merge(this_HEXINT_0);
                        
                     
                        newLeafNode(this_HEXINT_0, grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:814:10: this_NUMBER_1= RULE_NUMBER
                    {
                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    		current.merge(this_NUMBER_1);
                        
                     
                        newLeafNode(this_NUMBER_1, grammarAccess.getValueAccess().getNUMBERTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalCcsEclipse.g:822:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalCcsEclipse.g:831:5: this_Boolean_3= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Boolean_3=ruleBoolean();

                    state._fsp--;


                    		current.merge(this_Boolean_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalCcsEclipse.g:842:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_4);
                        
                     
                        newLeafNode(this_ID_4, grammarAccess.getValueAccess().getIDTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // InternalCcsEclipse.g:850:10: this_NUM_ID_5= RULE_NUM_ID
                    {
                    this_NUM_ID_5=(Token)match(input,RULE_NUM_ID,FOLLOW_2); 

                    		current.merge(this_NUM_ID_5);
                        
                     
                        newLeafNode(this_NUM_ID_5, grammarAccess.getValueAccess().getNUM_IDTerminalRuleCall_5()); 
                        

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
    // InternalCcsEclipse.g:865:1: entryRuleConstraint returns [String current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final String entryRuleConstraint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstraint = null;


        try {
            // InternalCcsEclipse.g:866:2: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalCcsEclipse.g:867:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:874:1: ruleConstraint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@constrain' this_SingleStep_1= ruleSingleStep ) ;
    public final AntlrDatatypeRuleToken ruleConstraint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_1 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:877:28: ( (kw= '@constrain' this_SingleStep_1= ruleSingleStep ) )
            // InternalCcsEclipse.g:878:1: (kw= '@constrain' this_SingleStep_1= ruleSingleStep )
            {
            // InternalCcsEclipse.g:878:1: (kw= '@constrain' this_SingleStep_1= ruleSingleStep )
            // InternalCcsEclipse.g:879:2: kw= '@constrain' this_SingleStep_1= ruleSingleStep
            {
            kw=(Token)match(input,25,FOLLOW_16); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
                
            pushFollow(FOLLOW_2);
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
    // InternalCcsEclipse.g:903:1: entryRuleSingleStep returns [String current=null] : iv_ruleSingleStep= ruleSingleStep EOF ;
    public final String entryRuleSingleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSingleStep = null;


        try {
            // InternalCcsEclipse.g:904:2: (iv_ruleSingleStep= ruleSingleStep EOF )
            // InternalCcsEclipse.g:905:2: iv_ruleSingleStep= ruleSingleStep EOF
            {
             newCompositeNode(grammarAccess.getSingleStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleStep=ruleSingleStep();

            state._fsp--;

             current =iv_ruleSingleStep.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:912:1: ruleSingleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? ) ;
    public final AntlrDatatypeRuleToken ruleSingleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Ident_0 = null;

        AntlrDatatypeRuleToken this_Vals_1 = null;

        AntlrDatatypeRuleToken this_StepSuffix_2 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:915:28: ( (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? ) )
            // InternalCcsEclipse.g:916:1: (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? )
            {
            // InternalCcsEclipse.g:916:1: (this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? )
            // InternalCcsEclipse.g:917:5: this_Ident_0= ruleIdent (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )?
            {
             
                    newCompositeNode(grammarAccess.getSingleStepAccess().getIdentParserRuleCall_0()); 
                
            pushFollow(FOLLOW_17);
            this_Ident_0=ruleIdent();

            state._fsp--;


            		current.merge(this_Ident_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalCcsEclipse.g:927:1: (this_Vals_1= ruleVals )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCcsEclipse.g:928:5: this_Vals_1= ruleVals
                    {
                     
                            newCompositeNode(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_18);
                    this_Vals_1=ruleVals();

                    state._fsp--;


                    		current.merge(this_Vals_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalCcsEclipse.g:938:3: (this_StepSuffix_2= ruleStepSuffix )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCcsEclipse.g:939:5: this_StepSuffix_2= ruleStepSuffix
                    {
                     
                            newCompositeNode(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalCcsEclipse.g:957:1: entryRuleIdent returns [String current=null] : iv_ruleIdent= ruleIdent EOF ;
    public final String entryRuleIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdent = null;


        try {
            // InternalCcsEclipse.g:958:2: (iv_ruleIdent= ruleIdent EOF )
            // InternalCcsEclipse.g:959:2: iv_ruleIdent= ruleIdent EOF
            {
             newCompositeNode(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdent=ruleIdent();

            state._fsp--;

             current =iv_ruleIdent.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:966:1: ruleIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:969:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // InternalCcsEclipse.g:970:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // InternalCcsEclipse.g:970:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
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
                    // InternalCcsEclipse.g:970:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getIdentAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:978:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

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
    // InternalCcsEclipse.g:993:1: entryRuleVals returns [String current=null] : iv_ruleVals= ruleVals EOF ;
    public final String entryRuleVals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVals = null;


        try {
            // InternalCcsEclipse.g:994:2: (iv_ruleVals= ruleVals EOF )
            // InternalCcsEclipse.g:995:2: iv_ruleVals= ruleVals EOF
            {
             newCompositeNode(grammarAccess.getValsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVals=ruleVals();

            state._fsp--;

             current =iv_ruleVals.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:1002:1: ruleVals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* ) ;
    public final AntlrDatatypeRuleToken ruleVals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Ident_1 = null;

        AntlrDatatypeRuleToken this_Vals_2 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:1005:28: ( (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* ) )
            // InternalCcsEclipse.g:1006:1: (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* )
            {
            // InternalCcsEclipse.g:1006:1: (kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )* )
            // InternalCcsEclipse.g:1007:2: kw= '.' this_Ident_1= ruleIdent (this_Vals_2= ruleVals )*
            {
            kw=(Token)match(input,26,FOLLOW_16); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getValsAccess().getFullStopKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getValsAccess().getIdentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_19);
            this_Ident_1=ruleIdent();

            state._fsp--;


            		current.merge(this_Ident_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalCcsEclipse.g:1023:1: (this_Vals_2= ruleVals )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCcsEclipse.g:1024:5: this_Vals_2= ruleVals
            	    {
            	     
            	            newCompositeNode(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_19);
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
    // InternalCcsEclipse.g:1042:1: entryRuleStepSuffix returns [String current=null] : iv_ruleStepSuffix= ruleStepSuffix EOF ;
    public final String entryRuleStepSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepSuffix = null;


        try {
            // InternalCcsEclipse.g:1043:2: (iv_ruleStepSuffix= ruleStepSuffix EOF )
            // InternalCcsEclipse.g:1044:2: iv_ruleStepSuffix= ruleStepSuffix EOF
            {
             newCompositeNode(grammarAccess.getStepSuffixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepSuffix=ruleStepSuffix();

            state._fsp--;

             current =iv_ruleStepSuffix.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:1051:1: ruleStepSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_SingleStep_1= ruleSingleStep ) ;
    public final AntlrDatatypeRuleToken ruleStepSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_1 = null;


         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:1054:28: ( (kw= '/' this_SingleStep_1= ruleSingleStep ) )
            // InternalCcsEclipse.g:1055:1: (kw= '/' this_SingleStep_1= ruleSingleStep )
            {
            // InternalCcsEclipse.g:1055:1: (kw= '/' this_SingleStep_1= ruleSingleStep )
            // InternalCcsEclipse.g:1056:2: kw= '/' this_SingleStep_1= ruleSingleStep
            {
            kw=(Token)match(input,27,FOLLOW_16); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
                
            pushFollow(FOLLOW_2);
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
    // InternalCcsEclipse.g:1080:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalCcsEclipse.g:1081:2: (iv_ruleImport= ruleImport EOF )
            // InternalCcsEclipse.g:1082:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsEclipse.g:1089:1: ruleImport returns [EObject current=null] : (otherlv_0= '@import' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalCcsEclipse.g:1092:28: ( (otherlv_0= '@import' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalCcsEclipse.g:1093:1: (otherlv_0= '@import' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalCcsEclipse.g:1093:1: (otherlv_0= '@import' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalCcsEclipse.g:1093:3: otherlv_0= '@import' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalCcsEclipse.g:1097:1: ( (lv_name_1_0= RULE_STRING ) )
            // InternalCcsEclipse.g:1098:1: (lv_name_1_0= RULE_STRING )
            {
            // InternalCcsEclipse.g:1098:1: (lv_name_1_0= RULE_STRING )
            // InternalCcsEclipse.g:1099:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"net.immute.ccs.CcsEclipse.STRING");
            	    

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000012202092L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000012202090L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000012200010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000012302090L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000018001F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});

}