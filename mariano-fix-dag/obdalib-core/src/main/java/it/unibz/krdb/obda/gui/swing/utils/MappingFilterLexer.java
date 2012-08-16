// $ANTLR 3.3 Nov 30, 2010 12:50:56 MappingFilter.g 2011-06-30 14:09:08

package it.unibz.krdb.obda.gui.swing.utils;

import java.util.List;
import java.util.Vector;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class MappingFilterLexer extends Lexer {
    public static final int EOF=-1;
    public static final int SEMI=4;
    public static final int NOT=5;
    public static final int COLON=6;
    public static final int ID=7;
    public static final int TEXT=8;
    public static final int TARGET=9;
    public static final int SOURCE=10;
    public static final int FUNCT=11;
    public static final int PRED=12;
    public static final int STRING=13;
    public static final int COMMA=14;
    public static final int UNDERSCORE=15;
    public static final int DASH=16;
    public static final int ALPHA=17;
    public static final int DIGIT=18;
    public static final int ALPHANUM=19;
    public static final int CHAR=20;
    public static final int WS=21;

    private List<String> errors = new Vector<String>();

    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        errors.add(hdr + " " + msg);
    }

    public List<String> getErrors() {
        return errors;
    }   


    // delegates
    // delegators

    public MappingFilterLexer() {;} 
    public MappingFilterLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MappingFilterLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "MappingFilter.g"; }

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:95:4: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // MappingFilter.g:95:6: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:97:3: ( ( 'I' | 'i' ) ( 'D' | 'd' ) )
            // MappingFilter.g:97:5: ( 'I' | 'i' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:99:5: ( ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) )
            // MappingFilter.g:99:7: ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "TARGET"
    public final void mTARGET() throws RecognitionException {
        try {
            int _type = TARGET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:101:7: ( ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // MappingFilter.g:101:9: ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TARGET"

    // $ANTLR start "SOURCE"
    public final void mSOURCE() throws RecognitionException {
        try {
            int _type = SOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:103:7: ( ( 'S' | 's' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // MappingFilter.g:103:9: ( 'S' | 's' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOURCE"

    // $ANTLR start "FUNCT"
    public final void mFUNCT() throws RecognitionException {
        try {
            int _type = FUNCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:105:6: ( ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // MappingFilter.g:105:8: ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCT"

    // $ANTLR start "PRED"
    public final void mPRED() throws RecognitionException {
        try {
            int _type = PRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:107:5: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // MappingFilter.g:107:7: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRED"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:109:6: ( ',' )
            // MappingFilter.g:109:16: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:110:6: ( ':' )
            // MappingFilter.g:110:16: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:111:5: ( ';' )
            // MappingFilter.g:111:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:112:11: ( '_' )
            // MappingFilter.g:112:16: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "DASH"
    public final void mDASH() throws RecognitionException {
        try {
            int _type = DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:113:5: ( '-' )
            // MappingFilter.g:113:16: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DASH"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // MappingFilter.g:115:15: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // MappingFilter.g:115:17: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHA"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // MappingFilter.g:117:15: ( '0' .. '9' )
            // MappingFilter.g:117:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ALPHANUM"
    public final void mALPHANUM() throws RecognitionException {
        try {
            // MappingFilter.g:119:18: ( ( ALPHA | DIGIT ) )
            // MappingFilter.g:119:20: ( ALPHA | DIGIT )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHANUM"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // MappingFilter.g:121:14: ( ( ALPHANUM | UNDERSCORE | DASH ) )
            // MappingFilter.g:121:16: ( ALPHANUM | UNDERSCORE | DASH )
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:123:7: ( ( CHAR )* )
            // MappingFilter.g:123:9: ( CHAR )*
            {
            // MappingFilter.g:123:9: ( CHAR )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MappingFilter.g:123:9: CHAR
            	    {
            	    mCHAR(); 

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
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MappingFilter.g:125:3: ( ( ' ' | '\\t' | ( '\\n' | '\\r' ( '\\n' ) ) )+ )
            // MappingFilter.g:125:5: ( ' ' | '\\t' | ( '\\n' | '\\r' ( '\\n' ) ) )+
            {
            // MappingFilter.g:125:5: ( ' ' | '\\t' | ( '\\n' | '\\r' ( '\\n' ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt3=1;
                    }
                    break;
                case '\t':
                    {
                    alt3=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // MappingFilter.g:125:6: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // MappingFilter.g:125:10: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // MappingFilter.g:125:15: ( '\\n' | '\\r' ( '\\n' ) )
            	    {
            	    // MappingFilter.g:125:15: ( '\\n' | '\\r' ( '\\n' ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='\n') ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0=='\r') ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // MappingFilter.g:125:16: '\\n'
            	            {
            	            match('\n'); 

            	            }
            	            break;
            	        case 2 :
            	            // MappingFilter.g:125:21: '\\r' ( '\\n' )
            	            {
            	            match('\r'); 
            	            // MappingFilter.g:125:25: ( '\\n' )
            	            // MappingFilter.g:125:26: '\\n'
            	            {
            	            match('\n'); 

            	            }


            	            }
            	            break;

            	    }


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

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // MappingFilter.g:1:8: ( NOT | ID | TEXT | TARGET | SOURCE | FUNCT | PRED | COMMA | COLON | SEMI | UNDERSCORE | DASH | STRING | WS )
        int alt4=14;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // MappingFilter.g:1:10: NOT
                {
                mNOT(); 

                }
                break;
            case 2 :
                // MappingFilter.g:1:14: ID
                {
                mID(); 

                }
                break;
            case 3 :
                // MappingFilter.g:1:17: TEXT
                {
                mTEXT(); 

                }
                break;
            case 4 :
                // MappingFilter.g:1:22: TARGET
                {
                mTARGET(); 

                }
                break;
            case 5 :
                // MappingFilter.g:1:29: SOURCE
                {
                mSOURCE(); 

                }
                break;
            case 6 :
                // MappingFilter.g:1:36: FUNCT
                {
                mFUNCT(); 

                }
                break;
            case 7 :
                // MappingFilter.g:1:42: PRED
                {
                mPRED(); 

                }
                break;
            case 8 :
                // MappingFilter.g:1:47: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 9 :
                // MappingFilter.g:1:53: COLON
                {
                mCOLON(); 

                }
                break;
            case 10 :
                // MappingFilter.g:1:59: SEMI
                {
                mSEMI(); 

                }
                break;
            case 11 :
                // MappingFilter.g:1:64: UNDERSCORE
                {
                mUNDERSCORE(); 

                }
                break;
            case 12 :
                // MappingFilter.g:1:75: DASH
                {
                mDASH(); 

                }
                break;
            case 13 :
                // MappingFilter.g:1:80: STRING
                {
                mSTRING(); 

                }
                break;
            case 14 :
                // MappingFilter.g:1:87: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\7\14\3\uffff\1\25\1\26\2\uffff\1\14\1\30\5\14\2\uffff\1\36\1\uffff"+
        "\5\14\1\uffff\1\44\3\14\1\50\1\uffff\2\14\1\53\1\uffff\1\54\1\55"+
        "\3\uffff";
    static final String DFA4_eofS =
        "\56\uffff";
    static final String DFA4_minS =
        "\1\11\1\117\1\104\1\101\1\117\1\125\1\122\3\uffff\2\55\2\uffff\1"+
        "\124\1\55\1\130\1\122\1\125\1\116\1\105\2\uffff\1\55\1\uffff\1\124"+
        "\1\107\1\122\1\103\1\104\1\uffff\1\55\1\105\1\103\1\124\1\55\1\uffff"+
        "\1\124\1\105\1\55\1\uffff\2\55\3\uffff";
    static final String DFA4_maxS =
        "\1\164\1\157\1\144\1\145\1\157\1\165\1\162\3\uffff\2\172\2\uffff"+
        "\1\164\1\172\1\170\1\162\1\165\1\156\1\145\2\uffff\1\172\1\uffff"+
        "\1\164\1\147\1\162\1\143\1\144\1\uffff\1\172\1\145\1\143\1\164\1"+
        "\172\1\uffff\1\164\1\145\1\172\1\uffff\2\172\3\uffff";
    static final String DFA4_acceptS =
        "\7\uffff\1\10\1\11\1\12\2\uffff\1\15\1\16\7\uffff\1\13\1\14\1\uffff"+
        "\1\2\5\uffff\1\1\5\uffff\1\3\3\uffff\1\7\2\uffff\1\6\1\4\1\5";
    static final String DFA4_specialS =
        "\56\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\15\2\uffff\1\15\22\uffff\1\15\13\uffff\1\7\1\13\14\uffff"+
            "\1\10\1\11\12\uffff\1\5\2\uffff\1\2\4\uffff\1\1\1\uffff\1\6"+
            "\2\uffff\1\4\1\3\12\uffff\1\12\6\uffff\1\5\2\uffff\1\2\4\uffff"+
            "\1\1\1\uffff\1\6\2\uffff\1\4\1\3",
            "\1\16\37\uffff\1\16",
            "\1\17\37\uffff\1\17",
            "\1\21\3\uffff\1\20\33\uffff\1\21\3\uffff\1\20",
            "\1\22\37\uffff\1\22",
            "\1\23\37\uffff\1\23",
            "\1\24\37\uffff\1\24",
            "",
            "",
            "",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "",
            "\1\27\37\uffff\1\27",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\31\37\uffff\1\31",
            "\1\32\37\uffff\1\32",
            "\1\33\37\uffff\1\33",
            "\1\34\37\uffff\1\34",
            "\1\35\37\uffff\1\35",
            "",
            "",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "\1\37\37\uffff\1\37",
            "\1\40\37\uffff\1\40",
            "\1\41\37\uffff\1\41",
            "\1\42\37\uffff\1\42",
            "\1\43\37\uffff\1\43",
            "",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\1\47\37\uffff\1\47",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "\1\51\37\uffff\1\51",
            "\1\52\37\uffff\1\52",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
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
            return "1:1: Tokens : ( NOT | ID | TEXT | TARGET | SOURCE | FUNCT | PRED | COMMA | COLON | SEMI | UNDERSCORE | DASH | STRING | WS );";
        }
    }
 

}