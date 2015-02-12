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

                if ( (LA2_0==RULE_ID||LA2_0==24||LA2_0==27) ) {
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:124:1: entryRuleContext returns [String current=null] : iv_ruleContext= ruleContext EOF ;
    public final String entryRuleContext() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContext = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:125:2: (iv_ruleContext= ruleContext EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:126:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext191);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext202); 

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
            kw=(Token)match(input,12,FOLLOW_12_in_ruleContext240); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getContextAccess().getContextKeyword_0()); 
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleContext253); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getContextAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getContextAccess().getSelectorParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleSelector_in_ruleContext275);
            this_Selector_2=ruleSelector();

            state._fsp--;


            		current.merge(this_Selector_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleContext293); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getContextAccess().getRightParenthesisKeyword_3()); 
                
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
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleContext307); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getContextAccess().getSemicolonKeyword_4()); 
                        

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:180:1: entryRuleSelector returns [String current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final String entryRuleSelector() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelector = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:181:2: (iv_ruleSelector= ruleSelector EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:182:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector350);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector361); 

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
             
                    newCompositeNode(grammarAccess.getSelectorAccess().getSumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSum_in_ruleSelector408);
            this_Sum_0=ruleSum();

            state._fsp--;


            		current.merge(this_Sum_0);
                
             
                    afterParserOrEnumRuleCall();
                
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
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleSelector427); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getSelectorAccess().getGreaterThanSignKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getSelectorAccess().getSumParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleSum_in_ruleSelector449);
            	    this_Sum_2=ruleSum();

            	    state._fsp--;


            	    		current.merge(this_Sum_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_ruleSum_in_entryRuleSum497);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSum508); 

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
             
                    newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleProduct_in_ruleSum555);
            this_Product_0=ruleProduct();

            state._fsp--;


            		current.merge(this_Product_0);
                
             
                    afterParserOrEnumRuleCall();
                
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
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleSum574); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getSumAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getSumAccess().getProductParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleProduct_in_ruleSum596);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:278:1: entryRuleProduct returns [String current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final String entryRuleProduct() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProduct = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:279:2: (iv_ruleProduct= ruleProduct EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:280:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct644);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct655); 

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

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:292:5: this_Term_0= ruleTerm
            	    {
            	     
            	            newCompositeNode(grammarAccess.getProductAccess().getTermParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_ruleTerm_in_ruleProduct702);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:310:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:311:2: (iv_ruleTerm= ruleTerm EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:312:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm749);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm760); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:319:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Step_0 = null;

        AntlrDatatypeRuleToken this_Step_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:322:28: ( (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:323:1: (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:323:1: (this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:324:5: this_Step_0= ruleStep (kw= '>' this_Step_2= ruleStep )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleStep_in_ruleTerm807);
            this_Step_0=ruleStep();

            state._fsp--;


            		current.merge(this_Step_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:334:1: (kw= '>' this_Step_2= ruleStep )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==RULE_ID) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:335:2: kw= '>' this_Step_2= ruleStep
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleTerm826); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTermAccess().getGreaterThanSignKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTermAccess().getStepParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleStep_in_ruleTerm848);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:359:1: entryRuleStep returns [String current=null] : iv_ruleStep= ruleStep EOF ;
    public final String entryRuleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStep = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:360:2: (iv_ruleStep= ruleStep EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:361:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep896);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep907); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:368:1: ruleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SingleStep_0= ruleSingleStep ;
    public final AntlrDatatypeRuleToken ruleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SingleStep_0 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:371:28: (this_SingleStep_0= ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:373:5: this_SingleStep_0= ruleSingleStep
            {
             
                    newCompositeNode(grammarAccess.getStepAccess().getSingleStepParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSingleStep_in_ruleStep953);
            this_SingleStep_0=ruleSingleStep();

            state._fsp--;


            		current.merge(this_SingleStep_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:391:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:392:2: (iv_ruleRule= ruleRule EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:393:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule998);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule1009); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:400:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Import_0 = null;

        AntlrDatatypeRuleToken this_Constraint_1 = null;

        AntlrDatatypeRuleToken this_Property_2 = null;

        AntlrDatatypeRuleToken this_Nested_3 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:403:28: ( (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:404:1: (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:404:1: (this_Import_0= ruleImport | this_Constraint_1= ruleConstraint | this_Property_2= ruleProperty | this_Nested_3= ruleNested )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==21) ) {
                    alt8=3;
                }
                else if ( (LA8_3==RULE_ID||(LA8_3>=16 && LA8_3<=19)||(LA8_3>=25 && LA8_3<=26)) ) {
                    alt8=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:405:5: this_Import_0= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getImportParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleRule1056);
                    this_Import_0=ruleImport();

                    state._fsp--;


                    		current.merge(this_Import_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:417:5: this_Constraint_1= ruleConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getConstraintParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConstraint_in_ruleRule1089);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;


                    		current.merge(this_Constraint_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:429:5: this_Property_2= ruleProperty
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getPropertyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleProperty_in_ruleRule1122);
                    this_Property_2=ruleProperty();

                    state._fsp--;


                    		current.merge(this_Property_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:441:5: this_Nested_3= ruleNested
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getNestedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNested_in_ruleRule1155);
                    this_Nested_3=ruleNested();

                    state._fsp--;


                    		current.merge(this_Nested_3);
                        
                     
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleNested"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:459:1: entryRuleNested returns [String current=null] : iv_ruleNested= ruleNested EOF ;
    public final String entryRuleNested() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNested = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:460:2: (iv_ruleNested= ruleNested EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:461:2: iv_ruleNested= ruleNested EOF
            {
             newCompositeNode(grammarAccess.getNestedRule()); 
            pushFollow(FOLLOW_ruleNested_in_entryRuleNested1201);
            iv_ruleNested=ruleNested();

            state._fsp--;

             current =iv_ruleNested.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNested1212); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:468:1: ruleNested returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) ) ;
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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:471:28: ( (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:472:1: (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:472:1: (this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:473:5: this_Selector_0= ruleSelector ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) )
            {
             
                    newCompositeNode(grammarAccess.getNestedAccess().getSelectorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSelector_in_ruleNested1259);
            this_Selector_0=ruleSelector();

            state._fsp--;


            		current.merge(this_Selector_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:483:1: ( (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) ) | (kw= '{' (this_Rule_6= ruleRule )* kw= '}' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:483:2: (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:483:2: (kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty ) )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:484:2: kw= ':' (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty )
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleNested1279); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNestedAccess().getColonKeyword_1_0_0()); 
                        
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:489:1: (this_Import_2= ruleImport | this_Constraint_3= ruleConstraint | this_Property_4= ruleProperty )
                    int alt9=3;
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
                        alt9=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:490:5: this_Import_2= ruleImport
                            {
                             
                                    newCompositeNode(grammarAccess.getNestedAccess().getImportParserRuleCall_1_0_1_0()); 
                                
                            pushFollow(FOLLOW_ruleImport_in_ruleNested1302);
                            this_Import_2=ruleImport();

                            state._fsp--;


                            		current.merge(this_Import_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:502:5: this_Constraint_3= ruleConstraint
                            {
                             
                                    newCompositeNode(grammarAccess.getNestedAccess().getConstraintParserRuleCall_1_0_1_1()); 
                                
                            pushFollow(FOLLOW_ruleConstraint_in_ruleNested1335);
                            this_Constraint_3=ruleConstraint();

                            state._fsp--;


                            		current.merge(this_Constraint_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 3 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:514:5: this_Property_4= ruleProperty
                            {
                             
                                    newCompositeNode(grammarAccess.getNestedAccess().getPropertyParserRuleCall_1_0_1_2()); 
                                
                            pushFollow(FOLLOW_ruleProperty_in_ruleNested1368);
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
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:525:6: (kw= '{' (this_Rule_6= ruleRule )* kw= '}' )
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:525:6: (kw= '{' (this_Rule_6= ruleRule )* kw= '}' )
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:526:2: kw= '{' (this_Rule_6= ruleRule )* kw= '}'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleNested1395); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1_1_0()); 
                        
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:531:1: (this_Rule_6= ruleRule )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||LA10_0==24||LA10_0==27) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:532:5: this_Rule_6= ruleRule
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getNestedAccess().getRuleParserRuleCall_1_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleRule_in_ruleNested1418);
                    	    this_Rule_6=ruleRule();

                    	    state._fsp--;


                    	    		current.merge(this_Rule_6);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    kw=(Token)match(input,20,FOLLOW_20_in_ruleNested1438); 

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


    // $ANTLR start "entryRuleProperty"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:556:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:557:2: (iv_ruleProperty= ruleProperty EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:558:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1481);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1492); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:565:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '=' this_Value_2= ruleValue ) ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Value_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:568:28: ( (this_ID_0= RULE_ID kw= '=' this_Value_2= ruleValue ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:569:1: (this_ID_0= RULE_ID kw= '=' this_Value_2= ruleValue )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:569:1: (this_ID_0= RULE_ID kw= '=' this_Value_2= ruleValue )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:569:6: this_ID_0= RULE_ID kw= '=' this_Value_2= ruleValue
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1532); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPropertyAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,21,FOLLOW_21_in_ruleProperty1550); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getPropertyAccess().getValueParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleProperty1572);
            this_Value_2=ruleValue();

            state._fsp--;


            		current.merge(this_Value_2);
                
             
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


    // $ANTLR start "entryRuleValue"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:601:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:602:2: (iv_ruleValue= ruleValue EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:603:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1618);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1629); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:610:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEXINT_0= RULE_HEXINT | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEXINT_0=null;
        Token this_INT_1=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:613:28: ( (this_HEXINT_0= RULE_HEXINT | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:614:1: (this_HEXINT_0= RULE_HEXINT | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:614:1: (this_HEXINT_0= RULE_HEXINT | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_HEXINT:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
                {
                alt12=2;
                }
                break;
            case 22:
                {
                alt12=3;
                }
                break;
            case 23:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:614:6: this_HEXINT_0= RULE_HEXINT
                    {
                    this_HEXINT_0=(Token)match(input,RULE_HEXINT,FOLLOW_RULE_HEXINT_in_ruleValue1669); 

                    		current.merge(this_HEXINT_0);
                        
                     
                        newLeafNode(this_HEXINT_0, grammarAccess.getValueAccess().getHEXINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:622:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue1695); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:631:2: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleValue1719); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValueAccess().getTrueKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:638:2: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleValue1738); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValueAccess().getFalseKeyword_3()); 
                        

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:651:1: entryRuleConstraint returns [String current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final String entryRuleConstraint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstraint = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:652:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:653:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1779);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1790); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:660:1: ruleConstraint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@constrain' this_SingleStep_1= ruleSingleStep ) ;
    public final AntlrDatatypeRuleToken ruleConstraint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_1 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:663:28: ( (kw= '@constrain' this_SingleStep_1= ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:664:1: (kw= '@constrain' this_SingleStep_1= ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:664:1: (kw= '@constrain' this_SingleStep_1= ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:665:2: kw= '@constrain' this_SingleStep_1= ruleSingleStep
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleConstraint1828); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstraintAccess().getConstrainKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getConstraintAccess().getSingleStepParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSingleStep_in_ruleConstraint1850);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:689:1: entryRuleSingleStep returns [String current=null] : iv_ruleSingleStep= ruleSingleStep EOF ;
    public final String entryRuleSingleStep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSingleStep = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:690:2: (iv_ruleSingleStep= ruleSingleStep EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:691:2: iv_ruleSingleStep= ruleSingleStep EOF
            {
             newCompositeNode(grammarAccess.getSingleStepRule()); 
            pushFollow(FOLLOW_ruleSingleStep_in_entryRuleSingleStep1896);
            iv_ruleSingleStep=ruleSingleStep();

            state._fsp--;

             current =iv_ruleSingleStep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStep1907); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:698:1: ruleSingleStep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? ) ;
    public final AntlrDatatypeRuleToken ruleSingleStep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Vals_1 = null;

        AntlrDatatypeRuleToken this_StepSuffix_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:701:28: ( (this_ID_0= RULE_ID (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:702:1: (this_ID_0= RULE_ID (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:702:1: (this_ID_0= RULE_ID (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:702:6: this_ID_0= RULE_ID (this_Vals_1= ruleVals )? (this_StepSuffix_2= ruleStepSuffix )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleStep1947); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSingleStepAccess().getIDTerminalRuleCall_0()); 
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:709:1: (this_Vals_1= ruleVals )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:710:5: this_Vals_1= ruleVals
                    {
                     
                            newCompositeNode(grammarAccess.getSingleStepAccess().getValsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVals_in_ruleSingleStep1975);
                    this_Vals_1=ruleVals();

                    state._fsp--;


                    		current.merge(this_Vals_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:720:3: (this_StepSuffix_2= ruleStepSuffix )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:721:5: this_StepSuffix_2= ruleStepSuffix
                    {
                     
                            newCompositeNode(grammarAccess.getSingleStepAccess().getStepSuffixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStepSuffix_in_ruleSingleStep2005);
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


    // $ANTLR start "entryRuleVals"
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:739:1: entryRuleVals returns [String current=null] : iv_ruleVals= ruleVals EOF ;
    public final String entryRuleVals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVals = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:740:2: (iv_ruleVals= ruleVals EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:741:2: iv_ruleVals= ruleVals EOF
            {
             newCompositeNode(grammarAccess.getValsRule()); 
            pushFollow(FOLLOW_ruleVals_in_entryRuleVals2053);
            iv_ruleVals=ruleVals();

            state._fsp--;

             current =iv_ruleVals.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVals2064); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:748:1: ruleVals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID (this_Vals_2= ruleVals )* ) ;
    public final AntlrDatatypeRuleToken ruleVals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Vals_2 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:751:28: ( (kw= '.' this_ID_1= RULE_ID (this_Vals_2= ruleVals )* ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:752:1: (kw= '.' this_ID_1= RULE_ID (this_Vals_2= ruleVals )* )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:752:1: (kw= '.' this_ID_1= RULE_ID (this_Vals_2= ruleVals )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:753:2: kw= '.' this_ID_1= RULE_ID (this_Vals_2= ruleVals )*
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleVals2102); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getValsAccess().getFullStopKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVals2117); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getValsAccess().getIDTerminalRuleCall_1()); 
                
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:765:1: (this_Vals_2= ruleVals )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:766:5: this_Vals_2= ruleVals
            	    {
            	     
            	            newCompositeNode(grammarAccess.getValsAccess().getValsParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleVals_in_ruleVals2145);
            	    this_Vals_2=ruleVals();

            	    state._fsp--;


            	    		current.merge(this_Vals_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:784:1: entryRuleStepSuffix returns [String current=null] : iv_ruleStepSuffix= ruleStepSuffix EOF ;
    public final String entryRuleStepSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepSuffix = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:785:2: (iv_ruleStepSuffix= ruleStepSuffix EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:786:2: iv_ruleStepSuffix= ruleStepSuffix EOF
            {
             newCompositeNode(grammarAccess.getStepSuffixRule()); 
            pushFollow(FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix2193);
            iv_ruleStepSuffix=ruleStepSuffix();

            state._fsp--;

             current =iv_ruleStepSuffix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepSuffix2204); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:793:1: ruleStepSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_SingleStep_1= ruleSingleStep ) ;
    public final AntlrDatatypeRuleToken ruleStepSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SingleStep_1 = null;


         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:796:28: ( (kw= '/' this_SingleStep_1= ruleSingleStep ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:797:1: (kw= '/' this_SingleStep_1= ruleSingleStep )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:797:1: (kw= '/' this_SingleStep_1= ruleSingleStep )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:798:2: kw= '/' this_SingleStep_1= ruleSingleStep
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleStepSuffix2242); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStepSuffixAccess().getSolidusKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getStepSuffixAccess().getSingleStepParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSingleStep_in_ruleStepSuffix2264);
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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:822:1: entryRuleImport returns [String current=null] : iv_ruleImport= ruleImport EOF ;
    public final String entryRuleImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport = null;


        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:823:2: (iv_ruleImport= ruleImport EOF )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:824:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport2310);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport2321); 

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
    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:831:1: ruleImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@import' this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:834:28: ( (kw= '@import' this_STRING_1= RULE_STRING ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:835:1: (kw= '@import' this_STRING_1= RULE_STRING )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:835:1: (kw= '@import' this_STRING_1= RULE_STRING )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:836:2: kw= '@import' this_STRING_1= RULE_STRING
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleImport2359); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport2374); 

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
    public static final BitSet FOLLOW_ruleContext_in_ruleRuleSet131 = new BitSet(new long[]{0x0000000009000012L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleSet153 = new BitSet(new long[]{0x0000000009000012L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleContext240 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContext253 = new BitSet(new long[]{0x0000000009000010L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleContext275 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContext293 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleContext307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSum_in_ruleSelector408 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleSelector427 = new BitSet(new long[]{0x0000000009000010L});
    public static final BitSet FOLLOW_ruleSum_in_ruleSelector449 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleSum_in_entryRuleSum497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSum508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_ruleSum555 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleSum574 = new BitSet(new long[]{0x0000000009000010L});
    public static final BitSet FOLLOW_ruleProduct_in_ruleSum596 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleProduct702 = new BitSet(new long[]{0x0000000009000012L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleTerm807 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleTerm826 = new BitSet(new long[]{0x0000000009000010L});
    public static final BitSet FOLLOW_ruleStep_in_ruleTerm848 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleStep953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleRule1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleRule1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleRule1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_ruleRule1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNested_in_entryRuleNested1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNested1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleNested1259 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleNested1279 = new BitSet(new long[]{0x0000000009000010L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNested1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleNested1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleNested1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNested1395 = new BitSet(new long[]{0x0000000009100010L});
    public static final BitSet FOLLOW_ruleRule_in_ruleNested1418 = new BitSet(new long[]{0x0000000009100010L});
    public static final BitSet FOLLOW_20_in_ruleNested1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1532 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProperty1550 = new BitSet(new long[]{0x0000000000C00060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleProperty1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXINT_in_ruleValue1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleValue1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleValue1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleConstraint1828 = new BitSet(new long[]{0x0000000009000010L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleConstraint1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStep_in_entryRuleSingleStep1896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStep1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleStep1947 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleVals_in_ruleSingleStep1975 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_ruleSingleStep2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVals_in_entryRuleVals2053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVals2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVals2102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVals2117 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleVals_in_ruleVals2145 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleStepSuffix_in_entryRuleStepSuffix2193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepSuffix2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStepSuffix2242 = new BitSet(new long[]{0x0000000009000010L});
    public static final BitSet FOLLOW_ruleSingleStep_in_ruleStepSuffix2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport2310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleImport2359 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport2374 = new BitSet(new long[]{0x0000000000000002L});

}