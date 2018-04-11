package fm.pucrs.br.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fm.pucrs.br.services.SCHGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSCHParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSCHParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCHParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSCHParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSCH.g"; }


    	private SCHGrammarAccess grammarAccess;

    	public void setGrammarAccess(SCHGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalSCH.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSCH.g:54:1: ( ruleModel EOF )
            // InternalSCH.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSCH.g:62:1: ruleModel : ( ( rule__Model__ExpressionsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:66:2: ( ( ( rule__Model__ExpressionsAssignment )* ) )
            // InternalSCH.g:67:2: ( ( rule__Model__ExpressionsAssignment )* )
            {
            // InternalSCH.g:67:2: ( ( rule__Model__ExpressionsAssignment )* )
            // InternalSCH.g:68:3: ( rule__Model__ExpressionsAssignment )*
            {
             before(grammarAccess.getModelAccess().getExpressionsAssignment()); 
            // InternalSCH.g:69:3: ( rule__Model__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_DOUBLE)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSCH.g:69:4: rule__Model__ExpressionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ExpressionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getExpressionsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // InternalSCH.g:78:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSCH.g:79:1: ( ruleExpression EOF )
            // InternalSCH.g:80:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSCH.g:87:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:91:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalSCH.g:92:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalSCH.g:92:2: ( ( rule__Expression__Alternatives ) )
            // InternalSCH.g:93:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalSCH.g:94:3: ( rule__Expression__Alternatives )
            // InternalSCH.g:94:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleValue"
    // InternalSCH.g:103:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSCH.g:104:1: ( ruleValue EOF )
            // InternalSCH.g:105:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSCH.g:112:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:116:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalSCH.g:117:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalSCH.g:117:2: ( ( rule__Value__Alternatives ) )
            // InternalSCH.g:118:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalSCH.g:119:3: ( rule__Value__Alternatives )
            // InternalSCH.g:119:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleOperator"
    // InternalSCH.g:128:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalSCH.g:129:1: ( ruleOperator EOF )
            // InternalSCH.g:130:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalSCH.g:137:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:141:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalSCH.g:142:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalSCH.g:142:2: ( ( rule__Operator__Alternatives ) )
            // InternalSCH.g:143:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalSCH.g:144:3: ( rule__Operator__Alternatives )
            // InternalSCH.g:144:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleSubtract"
    // InternalSCH.g:153:1: entryRuleSubtract : ruleSubtract EOF ;
    public final void entryRuleSubtract() throws RecognitionException {
        try {
            // InternalSCH.g:154:1: ( ruleSubtract EOF )
            // InternalSCH.g:155:1: ruleSubtract EOF
            {
             before(grammarAccess.getSubtractRule()); 
            pushFollow(FOLLOW_1);
            ruleSubtract();

            state._fsp--;

             after(grammarAccess.getSubtractRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubtract"


    // $ANTLR start "ruleSubtract"
    // InternalSCH.g:162:1: ruleSubtract : ( '-' ) ;
    public final void ruleSubtract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:166:2: ( ( '-' ) )
            // InternalSCH.g:167:2: ( '-' )
            {
            // InternalSCH.g:167:2: ( '-' )
            // InternalSCH.g:168:3: '-'
            {
             before(grammarAccess.getSubtractAccess().getHyphenMinusKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSubtractAccess().getHyphenMinusKeyword()); 

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
    // $ANTLR end "ruleSubtract"


    // $ANTLR start "entryRuleAdd"
    // InternalSCH.g:178:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalSCH.g:179:1: ( ruleAdd EOF )
            // InternalSCH.g:180:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalSCH.g:187:1: ruleAdd : ( '+' ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:191:2: ( ( '+' ) )
            // InternalSCH.g:192:2: ( '+' )
            {
            // InternalSCH.g:192:2: ( '+' )
            // InternalSCH.g:193:3: '+'
            {
             before(grammarAccess.getAddAccess().getPlusSignKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getPlusSignKeyword()); 

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleMultiply"
    // InternalSCH.g:203:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalSCH.g:204:1: ( ruleMultiply EOF )
            // InternalSCH.g:205:1: ruleMultiply EOF
            {
             before(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getMultiplyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalSCH.g:212:1: ruleMultiply : ( '*' ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:216:2: ( ( '*' ) )
            // InternalSCH.g:217:2: ( '*' )
            {
            // InternalSCH.g:217:2: ( '*' )
            // InternalSCH.g:218:3: '*'
            {
             before(grammarAccess.getMultiplyAccess().getAsteriskKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMultiplyAccess().getAsteriskKeyword()); 

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
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleDivide"
    // InternalSCH.g:228:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalSCH.g:229:1: ( ruleDivide EOF )
            // InternalSCH.g:230:1: ruleDivide EOF
            {
             before(grammarAccess.getDivideRule()); 
            pushFollow(FOLLOW_1);
            ruleDivide();

            state._fsp--;

             after(grammarAccess.getDivideRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDivide"


    // $ANTLR start "ruleDivide"
    // InternalSCH.g:237:1: ruleDivide : ( '/' ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:241:2: ( ( '/' ) )
            // InternalSCH.g:242:2: ( '/' )
            {
            // InternalSCH.g:242:2: ( '/' )
            // InternalSCH.g:243:3: '/'
            {
             before(grammarAccess.getDivideAccess().getSolidusKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDivideAccess().getSolidusKeyword()); 

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
    // $ANTLR end "ruleDivide"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalSCH.g:252:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ruleValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:256:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ruleValue ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=RULE_INT && LA2_1<=RULE_DOUBLE)||LA2_1==16) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=12 && LA2_1<=15)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_DOUBLE)) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSCH.g:257:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalSCH.g:257:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalSCH.g:258:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalSCH.g:259:3: ( rule__Expression__Group_0__0 )
                    // InternalSCH.g:259:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:263:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalSCH.g:263:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalSCH.g:264:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalSCH.g:265:3: ( rule__Expression__Group_1__0 )
                    // InternalSCH.g:265:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSCH.g:269:2: ( ruleValue )
                    {
                    // InternalSCH.g:269:2: ( ruleValue )
                    // InternalSCH.g:270:3: ruleValue
                    {
                     before(grammarAccess.getExpressionAccess().getValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getValueParserRuleCall_2()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalSCH.g:279:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_DOUBLE ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:283:1: ( ( RULE_INT ) | ( RULE_DOUBLE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_DOUBLE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSCH.g:284:2: ( RULE_INT )
                    {
                    // InternalSCH.g:284:2: ( RULE_INT )
                    // InternalSCH.g:285:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:290:2: ( RULE_DOUBLE )
                    {
                    // InternalSCH.g:290:2: ( RULE_DOUBLE )
                    // InternalSCH.g:291:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getValueAccess().getDOUBLETerminalRuleCall_1()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getDOUBLETerminalRuleCall_1()); 

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


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalSCH.g:300:1: rule__Operator__Alternatives : ( ( ruleDivide ) | ( ruleMultiply ) | ( ruleAdd ) | ( ruleSubtract ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:304:1: ( ( ruleDivide ) | ( ruleMultiply ) | ( ruleAdd ) | ( ruleSubtract ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 12:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSCH.g:305:2: ( ruleDivide )
                    {
                    // InternalSCH.g:305:2: ( ruleDivide )
                    // InternalSCH.g:306:3: ruleDivide
                    {
                     before(grammarAccess.getOperatorAccess().getDivideParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDivide();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getDivideParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:311:2: ( ruleMultiply )
                    {
                    // InternalSCH.g:311:2: ( ruleMultiply )
                    // InternalSCH.g:312:3: ruleMultiply
                    {
                     before(grammarAccess.getOperatorAccess().getMultiplyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiply();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getMultiplyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSCH.g:317:2: ( ruleAdd )
                    {
                    // InternalSCH.g:317:2: ( ruleAdd )
                    // InternalSCH.g:318:3: ruleAdd
                    {
                     before(grammarAccess.getOperatorAccess().getAddParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getAddParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSCH.g:323:2: ( ruleSubtract )
                    {
                    // InternalSCH.g:323:2: ( ruleSubtract )
                    // InternalSCH.g:324:3: ruleSubtract
                    {
                     before(grammarAccess.getOperatorAccess().getSubtractParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSubtract();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getSubtractParserRuleCall_3()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalSCH.g:333:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:337:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalSCH.g:338:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalSCH.g:345:1: rule__Expression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:349:1: ( ( '(' ) )
            // InternalSCH.g:350:1: ( '(' )
            {
            // InternalSCH.g:350:1: ( '(' )
            // InternalSCH.g:351:2: '('
            {
             before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalSCH.g:360:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:364:1: ( rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 )
            // InternalSCH.g:365:2: rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalSCH.g:372:1: rule__Expression__Group_0__1__Impl : ( ruleOperator ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:376:1: ( ( ruleOperator ) )
            // InternalSCH.g:377:1: ( ruleOperator )
            {
            // InternalSCH.g:377:1: ( ruleOperator )
            // InternalSCH.g:378:2: ruleOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__2"
    // InternalSCH.g:387:1: rule__Expression__Group_0__2 : rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3 ;
    public final void rule__Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:391:1: ( rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3 )
            // InternalSCH.g:392:2: rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__3();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_0__2"


    // $ANTLR start "rule__Expression__Group_0__2__Impl"
    // InternalSCH.g:399:1: rule__Expression__Group_0__2__Impl : ( ruleExpression ) ;
    public final void rule__Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:403:1: ( ( ruleExpression ) )
            // InternalSCH.g:404:1: ( ruleExpression )
            {
            // InternalSCH.g:404:1: ( ruleExpression )
            // InternalSCH.g:405:2: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_0_2()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__Expression__Group_0__2__Impl"


    // $ANTLR start "rule__Expression__Group_0__3"
    // InternalSCH.g:414:1: rule__Expression__Group_0__3 : rule__Expression__Group_0__3__Impl rule__Expression__Group_0__4 ;
    public final void rule__Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:418:1: ( rule__Expression__Group_0__3__Impl rule__Expression__Group_0__4 )
            // InternalSCH.g:419:2: rule__Expression__Group_0__3__Impl rule__Expression__Group_0__4
            {
            pushFollow(FOLLOW_6);
            rule__Expression__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__4();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_0__3"


    // $ANTLR start "rule__Expression__Group_0__3__Impl"
    // InternalSCH.g:426:1: rule__Expression__Group_0__3__Impl : ( ruleExpression ) ;
    public final void rule__Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:430:1: ( ( ruleExpression ) )
            // InternalSCH.g:431:1: ( ruleExpression )
            {
            // InternalSCH.g:431:1: ( ruleExpression )
            // InternalSCH.g:432:2: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_0_3()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_0_3()); 

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
    // $ANTLR end "rule__Expression__Group_0__3__Impl"


    // $ANTLR start "rule__Expression__Group_0__4"
    // InternalSCH.g:441:1: rule__Expression__Group_0__4 : rule__Expression__Group_0__4__Impl ;
    public final void rule__Expression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:445:1: ( rule__Expression__Group_0__4__Impl )
            // InternalSCH.g:446:2: rule__Expression__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_0__4"


    // $ANTLR start "rule__Expression__Group_0__4__Impl"
    // InternalSCH.g:452:1: rule__Expression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__Expression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:456:1: ( ( ')' ) )
            // InternalSCH.g:457:1: ( ')' )
            {
            // InternalSCH.g:457:1: ( ')' )
            // InternalSCH.g:458:2: ')'
            {
             before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_4()); 

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
    // $ANTLR end "rule__Expression__Group_0__4__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalSCH.g:468:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:472:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalSCH.g:473:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalSCH.g:480:1: rule__Expression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:484:1: ( ( '(' ) )
            // InternalSCH.g:485:1: ( '(' )
            {
            // InternalSCH.g:485:1: ( '(' )
            // InternalSCH.g:486:2: '('
            {
             before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalSCH.g:495:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:499:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalSCH.g:500:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalSCH.g:507:1: rule__Expression__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:511:1: ( ( ruleExpression ) )
            // InternalSCH.g:512:1: ( ruleExpression )
            {
            // InternalSCH.g:512:1: ( ruleExpression )
            // InternalSCH.g:513:2: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalSCH.g:522:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:526:1: ( rule__Expression__Group_1__2__Impl )
            // InternalSCH.g:527:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalSCH.g:533:1: rule__Expression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:537:1: ( ( ')' ) )
            // InternalSCH.g:538:1: ( ')' )
            {
            // InternalSCH.g:538:1: ( ')' )
            // InternalSCH.g:539:2: ')'
            {
             before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Model__ExpressionsAssignment"
    // InternalSCH.g:549:1: rule__Model__ExpressionsAssignment : ( ruleExpression ) ;
    public final void rule__Model__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:553:1: ( ( ruleExpression ) )
            // InternalSCH.g:554:2: ( ruleExpression )
            {
            // InternalSCH.g:554:2: ( ruleExpression )
            // InternalSCH.g:555:3: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ExpressionsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});

}