package net.immute.ccs.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCcsEclipseLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
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

    public InternalCcsEclipseLexer() {;} 
    public InternalCcsEclipseLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCcsEclipseLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:11:7: ( '@context' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:11:9: '@context'
            {
            match("@context"); 


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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:12:7: ( '(' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:12:9: '('
            {
            match('('); 

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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:13:7: ( ')' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:13:9: ')'
            {
            match(')'); 

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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:14:7: ( ';' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:14:9: ';'
            {
            match(';'); 

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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:15:7: ( '>' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:15:9: '>'
            {
            match('>'); 

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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:16:7: ( ',' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:16:9: ','
            {
            match(','); 

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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:17:7: ( ':' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:17:9: ':'
            {
            match(':'); 

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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:18:7: ( '{' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:18:9: '{'
            {
            match('{'); 

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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:19:7: ( '}' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:19:9: '}'
            {
            match('}'); 

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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:20:7: ( '@override' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:20:9: '@override'
            {
            match("@override"); 


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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:21:7: ( '=' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:21:9: '='
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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:22:7: ( 'true' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:22:9: 'true'
            {
            match("true"); 


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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:23:7: ( 'false' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:23:9: 'false'
            {
            match("false"); 


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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:24:7: ( '@constrain' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:24:9: '@constrain'
            {
            match("@constrain"); 


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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:25:7: ( '.' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:25:9: '.'
            {
            match('.'); 

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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:26:7: ( '/' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:26:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:27:7: ( '@import' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:27:9: '@import'
            {
            match("@import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_HEXINT"
    public final void mRULE_HEXINT() throws RecognitionException {
        try {
            int _type = RULE_HEXINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1096:13: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1096:15: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1096:20: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:13: ( ( '-' )? ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ ) ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:15: ( '-' )? ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ ) ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:15: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:20: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='.') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:21: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:21: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:33: ( '.' ( '0' .. '9' )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:34: '.' ( '0' .. '9' )*
                            {
                            match('.'); 
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:38: ( '0' .. '9' )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:39: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:52: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:56: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:57: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
                    break;

            }

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:69: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='E'||LA10_0=='e') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:70: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:80: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:
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

                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:91: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1098:92: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1100:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1100:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1100:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1100:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1100:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1102:10: ( ( '0' .. '9' )+ )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1102:12: ( '0' .. '9' )+
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1102:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1102:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1104:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop15;
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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1106:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1106:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1106:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1106:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1108:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1108:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1108:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1108:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop18;
                }
            } while (true);

            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1108:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1108:41: ( '\\r' )? '\\n'
                    {
                    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1108:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1108:41: '\\r'
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
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1110:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1110:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1110:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1112:16: ( . )
            // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1112:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_HEXINT | RULE_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=26;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:112: RULE_HEXINT
                {
                mRULE_HEXINT(); 

                }
                break;
            case 19 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:124: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 20 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:136: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:144: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:153: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:165: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:181: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:197: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // ../net.immute.ccs.CcsEclipse/src-gen/net/immute/ccs/parser/antlr/internal/InternalCcsEclipse.g:1:205: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\1\27\11\uffff\2\45\1\47\1\53\1\50\1\27\1\50\1\27\1\uffff\2\27\16\uffff\1\45\1\uffff\1\45\6\uffff\1\50\3\uffff\2\45\1\uffff\1\70\1\45\3\uffff\1\72\1\uffff";
    static final String DFA22_eofS =
        "\73\uffff";
    static final String DFA22_minS =
        "\1\0\1\143\11\uffff\1\162\1\141\1\60\1\52\1\60\1\56\1\60\1\101\1\uffff\2\0\2\uffff\1\157\13\uffff\1\165\1\uffff\1\154\6\uffff\1\60\2\uffff\1\156\1\145\2\163\1\60\1\145\3\uffff\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\157\11\uffff\1\162\1\141\1\71\1\57\1\170\2\71\1\172\1\uffff\2\uffff\2\uffff\1\157\13\uffff\1\165\1\uffff\1\154\6\uffff\1\71\2\uffff\1\156\1\145\1\163\1\164\1\172\1\145\3\uffff\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\10\uffff\1\24\2\uffff\1\31\1\32\1\uffff\1\12\1\21\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\uffff\1\24\1\uffff\1\17\1\23\1\27\1\30\1\20\1\22\1\uffff\1\26\1\31\6\uffff\1\1\1\16\1\14\1\uffff\1\15";
    static final String DFA22_specialS =
        "\1\2\23\uffff\1\0\1\1\45\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\24\4\27\1\25\1\2\1\3\2\27\1\6\1\20\1\15\1\16\1\17\11\21\1\7\1\4\1\27\1\12\1\5\1\27\1\1\32\23\3\27\1\22\1\23\1\27\5\23\1\14\15\23\1\13\6\23\1\10\1\27\1\11\uff82\27",
            "\1\30\5\uffff\1\32\5\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\46",
            "\12\50",
            "\1\51\4\uffff\1\52",
            "\12\55\76\uffff\1\54",
            "\1\50\1\uffff\12\50",
            "\12\55",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\0\56",
            "\0\56",
            "",
            "",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61",
            "",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\55",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\67\1\66",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\71",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_HEXINT | RULE_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_20 = input.LA(1);

                        s = -1;
                        if ( ((LA22_20>='\u0000' && LA22_20<='\uFFFF')) ) {s = 46;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_21 = input.LA(1);

                        s = -1;
                        if ( ((LA22_21>='\u0000' && LA22_21<='\uFFFF')) ) {s = 46;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='@') ) {s = 1;}

                        else if ( (LA22_0=='(') ) {s = 2;}

                        else if ( (LA22_0==')') ) {s = 3;}

                        else if ( (LA22_0==';') ) {s = 4;}

                        else if ( (LA22_0=='>') ) {s = 5;}

                        else if ( (LA22_0==',') ) {s = 6;}

                        else if ( (LA22_0==':') ) {s = 7;}

                        else if ( (LA22_0=='{') ) {s = 8;}

                        else if ( (LA22_0=='}') ) {s = 9;}

                        else if ( (LA22_0=='=') ) {s = 10;}

                        else if ( (LA22_0=='t') ) {s = 11;}

                        else if ( (LA22_0=='f') ) {s = 12;}

                        else if ( (LA22_0=='.') ) {s = 13;}

                        else if ( (LA22_0=='/') ) {s = 14;}

                        else if ( (LA22_0=='0') ) {s = 15;}

                        else if ( (LA22_0=='-') ) {s = 16;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 17;}

                        else if ( (LA22_0=='^') ) {s = 18;}

                        else if ( ((LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='e')||(LA22_0>='g' && LA22_0<='s')||(LA22_0>='u' && LA22_0<='z')) ) {s = 19;}

                        else if ( (LA22_0=='\"') ) {s = 20;}

                        else if ( (LA22_0=='\'') ) {s = 21;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 22;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='&')||(LA22_0>='*' && LA22_0<='+')||LA22_0=='<'||LA22_0=='?'||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||LA22_0=='|'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}