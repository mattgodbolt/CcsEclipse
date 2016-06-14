package net.immute.ccs.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCcsEclipseLexer extends Lexer {
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_NUMBER=5;
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
    public static final int RULE_HEXINT=4;

    // delegates
    // delegators

    public InternalCcsEclipseLexer() {;} 
    public InternalCcsEclipseLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCcsEclipseLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCcsEclipse.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:11:7: ( 'true' )
            // InternalCcsEclipse.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:12:7: ( 'false' )
            // InternalCcsEclipse.g:12:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:13:7: ( '@context' )
            // InternalCcsEclipse.g:13:9: '@context'
            {
            match("@context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:14:7: ( '(' )
            // InternalCcsEclipse.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:15:7: ( ')' )
            // InternalCcsEclipse.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:16:7: ( ';' )
            // InternalCcsEclipse.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:17:7: ( '>' )
            // InternalCcsEclipse.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:18:7: ( ',' )
            // InternalCcsEclipse.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:19:7: ( ':' )
            // InternalCcsEclipse.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:20:7: ( '{' )
            // InternalCcsEclipse.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:21:7: ( '}' )
            // InternalCcsEclipse.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:22:7: ( '=' )
            // InternalCcsEclipse.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:23:7: ( '@constrain' )
            // InternalCcsEclipse.g:23:9: '@constrain'
            {
            match("@constrain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:24:7: ( '.' )
            // InternalCcsEclipse.g:24:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:25:7: ( '/' )
            // InternalCcsEclipse.g:25:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:26:7: ( '@import' )
            // InternalCcsEclipse.g:26:9: '@import'
            {
            match("@import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:27:7: ( '@override' )
            // InternalCcsEclipse.g:27:9: '@override'
            {
            match("@override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:2502:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )* )
            // InternalCcsEclipse.g:2502:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCcsEclipse.g:2502:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCcsEclipse.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:2504:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCcsEclipse.g:2504:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCcsEclipse.g:2504:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCcsEclipse.g:2504:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCcsEclipse.g:2504:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalCcsEclipse.g:2504:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCcsEclipse.g:2504:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:2504:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCcsEclipse.g:2504:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCcsEclipse.g:2504:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCcsEclipse.g:2504:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:2506:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCcsEclipse.g:2506:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCcsEclipse.g:2506:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCcsEclipse.g:2506:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:2508:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCcsEclipse.g:2508:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCcsEclipse.g:2508:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCcsEclipse.g:2508:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalCcsEclipse.g:2508:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCcsEclipse.g:2508:41: ( '\\r' )? '\\n'
                    {
                    // InternalCcsEclipse.g:2508:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalCcsEclipse.g:2508:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:2510:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCcsEclipse.g:2510:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCcsEclipse.g:2510:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCcsEclipse.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_HEXINT"
    public final void mRULE_HEXINT() throws RecognitionException {
        try {
            int _type = RULE_HEXINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:2512:13: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalCcsEclipse.g:2512:15: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalCcsEclipse.g:2512:20: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='F')||(LA10_0>='a' && LA10_0<='f')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCcsEclipse.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXINT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:2514:13: ( ( '-' )? ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ ) ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
            // InternalCcsEclipse.g:2514:15: ( '-' )? ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ ) ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            {
            // InternalCcsEclipse.g:2514:15: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCcsEclipse.g:2514:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalCcsEclipse.g:2514:20: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                alt16=1;
            }
            else if ( (LA16_0=='.') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCcsEclipse.g:2514:21: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
                    {
                    // InternalCcsEclipse.g:2514:21: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCcsEclipse.g:2514:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // InternalCcsEclipse.g:2514:33: ( '.' ( '0' .. '9' )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='.') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalCcsEclipse.g:2514:34: '.' ( '0' .. '9' )*
                            {
                            match('.'); 
                            // InternalCcsEclipse.g:2514:38: ( '0' .. '9' )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalCcsEclipse.g:2514:39: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsEclipse.g:2514:52: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalCcsEclipse.g:2514:56: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCcsEclipse.g:2514:57: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;

            }

            // InternalCcsEclipse.g:2514:69: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='E'||LA19_0=='e') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCcsEclipse.g:2514:70: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalCcsEclipse.g:2514:80: ( '+' | '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='+'||LA17_0=='-') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalCcsEclipse.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalCcsEclipse.g:2514:91: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalCcsEclipse.g:2514:92: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_NUM_ID"
    public final void mRULE_NUM_ID() throws RecognitionException {
        try {
            int _type = RULE_NUM_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCcsEclipse.g:2516:13: ( ( '-' | '+' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '.' | '0' .. '9' )* )
            // InternalCcsEclipse.g:2516:15: ( '-' | '+' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '.' | '0' .. '9' )*
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCcsEclipse.g:2516:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '.' | '0' .. '9' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='$'||LA20_0=='.'||(LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCcsEclipse.g:
            	    {
            	    if ( input.LA(1)=='$'||input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUM_ID"

    public void mTokens() throws RecognitionException {
        // InternalCcsEclipse.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_HEXINT | RULE_NUMBER | RULE_NUM_ID )
        int alt21=25;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalCcsEclipse.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalCcsEclipse.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalCcsEclipse.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalCcsEclipse.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalCcsEclipse.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalCcsEclipse.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalCcsEclipse.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalCcsEclipse.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalCcsEclipse.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalCcsEclipse.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalCcsEclipse.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalCcsEclipse.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalCcsEclipse.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalCcsEclipse.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalCcsEclipse.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalCcsEclipse.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalCcsEclipse.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalCcsEclipse.g:1:112: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // InternalCcsEclipse.g:1:120: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalCcsEclipse.g:1:132: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalCcsEclipse.g:1:148: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalCcsEclipse.g:1:164: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalCcsEclipse.g:1:172: RULE_HEXINT
                {
                mRULE_HEXINT(); 

                }
                break;
            case 24 :
                // InternalCcsEclipse.g:1:184: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 25 :
                // InternalCcsEclipse.g:1:196: RULE_NUM_ID
                {
                mRULE_NUM_ID(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\2\17\12\uffff\1\33\1\37\3\uffff\1\34\1\25\1\34\1\uffff\2\17\10\uffff\1\25\1\34\1\25\1\34\1\25\2\17\1\uffff\1\57\3\34\1\60\1\17\3\uffff\1\64\3\uffff";
    static final String DFA21_eofS =
        "\65\uffff";
    static final String DFA21_minS =
        "\1\11\1\162\1\141\1\143\11\uffff\1\60\1\52\3\uffff\1\44\1\56\1\44\1\uffff\1\165\1\154\1\157\7\uffff\1\60\1\44\1\53\1\44\1\60\1\145\1\163\1\156\5\44\1\145\1\163\2\uffff\1\44\3\uffff";
    static final String DFA21_maxS =
        "\1\175\1\162\1\141\1\157\11\uffff\1\71\1\57\3\uffff\1\172\1\71\1\172\1\uffff\1\165\1\154\1\157\7\uffff\1\146\1\172\1\71\1\172\1\71\1\145\1\163\1\156\5\172\1\145\1\164\2\uffff\1\172\3\uffff";
    static final String DFA21_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff\1\22\1\23\1\26\3\uffff\1\31\3\uffff\1\20\1\21\1\16\1\30\1\24\1\25\1\17\17\uffff\1\27\1\1\1\uffff\1\3\1\15\1\2";
    static final String DFA21_specialS =
        "\65\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\21\2\uffff\1\21\22\uffff\1\21\1\uffff\1\20\1\uffff\1\17\2\uffff\1\20\1\4\1\5\1\uffff\1\25\1\10\1\23\1\15\1\16\1\22\11\24\1\11\1\6\1\uffff\1\14\1\7\1\uffff\1\3\32\17\4\uffff\1\17\1\uffff\5\17\1\2\15\17\1\1\6\17\1\12\1\uffff\1\13",
            "\1\26",
            "\1\27",
            "\1\30\5\uffff\1\31\5\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\34",
            "\1\35\4\uffff\1\36",
            "",
            "",
            "",
            "\1\25\11\uffff\1\41\1\uffff\12\43\7\uffff\4\25\1\42\25\25\4\uffff\1\25\1\uffff\4\25\1\42\22\25\1\40\2\25",
            "\1\44\1\uffff\12\43",
            "\1\25\11\uffff\1\41\1\uffff\12\43\7\uffff\4\25\1\42\25\25\4\uffff\1\25\1\uffff\4\25\1\42\25\25",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\6\50\32\uffff\6\50",
            "\1\25\11\uffff\1\25\1\uffff\12\51\7\uffff\4\25\1\42\25\25\4\uffff\1\25\1\uffff\4\25\1\42\25\25",
            "\1\34\1\uffff\1\34\2\uffff\12\52",
            "\1\25\11\uffff\1\41\1\uffff\12\43\7\uffff\4\25\1\42\25\25\4\uffff\1\25\1\uffff\4\25\1\42\25\25",
            "\12\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\25\11\uffff\1\25\1\uffff\12\50\7\uffff\6\50\24\25\4\uffff\1\25\1\uffff\6\50\24\25",
            "\1\25\11\uffff\1\25\1\uffff\12\51\7\uffff\4\25\1\42\25\25\4\uffff\1\25\1\uffff\4\25\1\42\25\25",
            "\1\25\11\uffff\1\25\1\uffff\12\52\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\25\11\uffff\1\25\1\uffff\12\53\7\uffff\4\25\1\42\25\25\4\uffff\1\25\1\uffff\4\25\1\42\25\25",
            "\1\17\13\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\61",
            "\1\63\1\62",
            "",
            "",
            "\1\17\13\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_HEXINT | RULE_NUMBER | RULE_NUM_ID );";
        }
    }
 

}