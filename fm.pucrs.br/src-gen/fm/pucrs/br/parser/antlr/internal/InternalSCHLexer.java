package fm.pucrs.br.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSCHLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_DOUBLE=7;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalSCHLexer() {;} 
    public InternalSCHLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSCHLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSCH.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCH.g:11:7: ( '(' )
            // InternalSCH.g:11:9: '('
            {
            match('('); 

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
            // InternalSCH.g:12:7: ( ')' )
            // InternalSCH.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCH.g:312:13: ( RULE_INT '.' RULE_INT )
            // InternalSCH.g:312:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCH.g:314:14: ( ( '#t' | '#f' ) )
            // InternalSCH.g:314:16: ( '#t' | '#f' )
            {
            // InternalSCH.g:314:16: ( '#t' | '#f' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='#') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='t') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='f') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSCH.g:314:17: '#t'
                    {
                    match("#t"); 


                    }
                    break;
                case 2 :
                    // InternalSCH.g:314:22: '#f'
                    {
                    match("#f"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCH.g:316:9: ( ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '!' )* | '+' | '-' | '*' | '/' | '=' | '<' | '>' | '<=' | '>=' ) )
            // InternalSCH.g:316:11: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '!' )* | '+' | '-' | '*' | '/' | '=' | '<' | '>' | '<=' | '>=' )
            {
            // InternalSCH.g:316:11: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '!' )* | '+' | '-' | '*' | '/' | '=' | '<' | '>' | '<=' | '>=' )
            int alt4=10;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSCH.g:316:12: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '!' )*
                    {
                    // InternalSCH.g:316:12: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalSCH.g:316:12: '^'
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

                    // InternalSCH.g:316:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '!' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='!'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSCH.g:
                    	    {
                    	    if ( input.LA(1)=='!'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


                    }
                    break;
                case 2 :
                    // InternalSCH.g:316:79: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 3 :
                    // InternalSCH.g:316:83: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 4 :
                    // InternalSCH.g:316:87: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 5 :
                    // InternalSCH.g:316:91: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 6 :
                    // InternalSCH.g:316:95: '='
                    {
                    match('='); 

                    }
                    break;
                case 7 :
                    // InternalSCH.g:316:99: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 8 :
                    // InternalSCH.g:316:103: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 9 :
                    // InternalSCH.g:316:107: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 10 :
                    // InternalSCH.g:316:112: '>='
                    {
                    match(">="); 


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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCH.g:318:10: ( ( '0' .. '9' )+ )
            // InternalSCH.g:318:12: ( '0' .. '9' )+
            {
            // InternalSCH.g:318:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSCH.g:318:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalSCH.g:320:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSCH.g:320:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSCH.g:320:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSCH.g:320:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSCH.g:320:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSCH.g:320:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSCH.g:320:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSCH.g:320:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSCH.g:320:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSCH.g:320:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSCH.g:320:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalSCH.g:322:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSCH.g:322:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSCH.g:322:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSCH.g:322:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalSCH.g:324:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSCH.g:324:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSCH.g:324:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSCH.g:324:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalSCH.g:324:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSCH.g:324:41: ( '\\r' )? '\\n'
                    {
                    // InternalSCH.g:324:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSCH.g:324:41: '\\r'
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
            // InternalSCH.g:326:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSCH.g:326:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSCH.g:326:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSCH.g:
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCH.g:328:16: ( . )
            // InternalSCH.g:328:18: .
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
        // InternalSCH.g:1:8: ( T__13 | T__14 | RULE_DOUBLE | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=11;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalSCH.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalSCH.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalSCH.g:1:22: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 4 :
                // InternalSCH.g:1:34: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 5 :
                // InternalSCH.g:1:47: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 6 :
                // InternalSCH.g:1:55: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 7 :
                // InternalSCH.g:1:64: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 8 :
                // InternalSCH.g:1:76: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 9 :
                // InternalSCH.g:1:92: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 10 :
                // InternalSCH.g:1:108: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 11 :
                // InternalSCH.g:1:116: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA4_eotS =
        "\7\uffff\1\12\1\14\4\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\1\52\6\uffff\2\75\4\uffff";
    static final String DFA4_maxS =
        "\1\172\6\uffff\2\75\4\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\11\1\7\1\12\1\10";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\1\2\1\uffff\1\3\1\uffff\1\5\14\uffff\1\7\1\6\1\10\2\uffff\32\1\3\uffff\2\1\1\uffff\32\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11",
            "\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "316:11: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '!' )* | '+' | '-' | '*' | '/' | '=' | '<' | '>' | '<=' | '>=' )";
        }
    }
    static final String DFA14_eotS =
        "\3\uffff\1\24\2\21\4\uffff\1\30\3\uffff\2\21\5\uffff\1\24\7\uffff";
    static final String DFA14_eofS =
        "\35\uffff";
    static final String DFA14_minS =
        "\1\0\2\uffff\1\56\1\146\1\101\4\uffff\1\52\3\uffff\2\0\5\uffff\1\56\7\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\uffff\1\71\1\164\1\172\4\uffff\1\57\3\uffff\2\uffff\5\uffff\1\71\7\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\4\5\1\uffff\3\5\2\uffff\1\12\1\13\1\1\1\2\1\6\1\uffff\1\3\1\4\1\5\1\10\1\11\1\7\1\12";
    static final String DFA14_specialS =
        "\1\1\15\uffff\1\2\1\0\15\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\16\1\4\3\21\1\17\1\1\1\2\1\11\1\7\1\21\1\10\1\21\1\12\12\3\2\21\1\14\1\13\1\15\2\21\32\6\3\21\1\5\1\6\1\21\32\6\uff85\21",
            "",
            "",
            "\1\26\1\uffff\12\25",
            "\1\27\15\uffff\1\27",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "",
            "\1\31\4\uffff\1\32",
            "",
            "",
            "",
            "\0\33",
            "\0\33",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\uffff\12\25",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | RULE_DOUBLE | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) ) {s = 27;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='(') ) {s = 1;}

                        else if ( (LA14_0==')') ) {s = 2;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 3;}

                        else if ( (LA14_0=='#') ) {s = 4;}

                        else if ( (LA14_0=='^') ) {s = 5;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 6;}

                        else if ( (LA14_0=='+') ) {s = 7;}

                        else if ( (LA14_0=='-') ) {s = 8;}

                        else if ( (LA14_0=='*') ) {s = 9;}

                        else if ( (LA14_0=='/') ) {s = 10;}

                        else if ( (LA14_0=='=') ) {s = 11;}

                        else if ( (LA14_0=='<') ) {s = 12;}

                        else if ( (LA14_0=='>') ) {s = 13;}

                        else if ( (LA14_0=='\"') ) {s = 14;}

                        else if ( (LA14_0=='\'') ) {s = 15;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 16;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||LA14_0==','||LA14_0=='.'||(LA14_0>=':' && LA14_0<=';')||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_14 = input.LA(1);

                        s = -1;
                        if ( ((LA14_14>='\u0000' && LA14_14<='\uFFFF')) ) {s = 27;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}