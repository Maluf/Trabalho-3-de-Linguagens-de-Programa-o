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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'*'", "'/'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=5;
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

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_DOUBLE)) ) {
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
    // InternalSCH.g:87:1: ruleExpression : ( ( rule__Expression__XAssignment ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:91:2: ( ( ( rule__Expression__XAssignment ) ) )
            // InternalSCH.g:92:2: ( ( rule__Expression__XAssignment ) )
            {
            // InternalSCH.g:92:2: ( ( rule__Expression__XAssignment ) )
            // InternalSCH.g:93:3: ( rule__Expression__XAssignment )
            {
             before(grammarAccess.getExpressionAccess().getXAssignment()); 
            // InternalSCH.g:94:3: ( rule__Expression__XAssignment )
            // InternalSCH.g:94:4: rule__Expression__XAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Expression__XAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getXAssignment()); 

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


    // $ANTLR start "entryRuleSubtract"
    // InternalSCH.g:128:1: entryRuleSubtract : ruleSubtract EOF ;
    public final void entryRuleSubtract() throws RecognitionException {
        try {
            // InternalSCH.g:129:1: ( ruleSubtract EOF )
            // InternalSCH.g:130:1: ruleSubtract EOF
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
    // InternalSCH.g:137:1: ruleSubtract : ( '-' ) ;
    public final void ruleSubtract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:141:2: ( ( '-' ) )
            // InternalSCH.g:142:2: ( '-' )
            {
            // InternalSCH.g:142:2: ( '-' )
            // InternalSCH.g:143:3: '-'
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
    // InternalSCH.g:153:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalSCH.g:154:1: ( ruleAdd EOF )
            // InternalSCH.g:155:1: ruleAdd EOF
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
    // InternalSCH.g:162:1: ruleAdd : ( '+' ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:166:2: ( ( '+' ) )
            // InternalSCH.g:167:2: ( '+' )
            {
            // InternalSCH.g:167:2: ( '+' )
            // InternalSCH.g:168:3: '+'
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
    // InternalSCH.g:178:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalSCH.g:179:1: ( ruleMultiply EOF )
            // InternalSCH.g:180:1: ruleMultiply EOF
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
    // InternalSCH.g:187:1: ruleMultiply : ( '*' ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:191:2: ( ( '*' ) )
            // InternalSCH.g:192:2: ( '*' )
            {
            // InternalSCH.g:192:2: ( '*' )
            // InternalSCH.g:193:3: '*'
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
    // InternalSCH.g:203:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalSCH.g:204:1: ( ruleDivide EOF )
            // InternalSCH.g:205:1: ruleDivide EOF
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
    // InternalSCH.g:212:1: ruleDivide : ( '/' ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:216:2: ( ( '/' ) )
            // InternalSCH.g:217:2: ( '/' )
            {
            // InternalSCH.g:217:2: ( '/' )
            // InternalSCH.g:218:3: '/'
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


    // $ANTLR start "rule__Value__Alternatives"
    // InternalSCH.g:227:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_DOUBLE ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:231:1: ( ( RULE_INT ) | ( RULE_DOUBLE ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_DOUBLE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSCH.g:232:2: ( RULE_INT )
                    {
                    // InternalSCH.g:232:2: ( RULE_INT )
                    // InternalSCH.g:233:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:238:2: ( RULE_DOUBLE )
                    {
                    // InternalSCH.g:238:2: ( RULE_DOUBLE )
                    // InternalSCH.g:239:3: RULE_DOUBLE
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


    // $ANTLR start "rule__Model__ExpressionsAssignment"
    // InternalSCH.g:248:1: rule__Model__ExpressionsAssignment : ( ruleExpression ) ;
    public final void rule__Model__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:252:1: ( ( ruleExpression ) )
            // InternalSCH.g:253:2: ( ruleExpression )
            {
            // InternalSCH.g:253:2: ( ruleExpression )
            // InternalSCH.g:254:3: ruleExpression
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


    // $ANTLR start "rule__Expression__XAssignment"
    // InternalSCH.g:263:1: rule__Expression__XAssignment : ( ruleValue ) ;
    public final void rule__Expression__XAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:267:1: ( ( ruleValue ) )
            // InternalSCH.g:268:2: ( ruleValue )
            {
            // InternalSCH.g:268:2: ( ruleValue )
            // InternalSCH.g:269:3: ruleValue
            {
             before(grammarAccess.getExpressionAccess().getXValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getXValueParserRuleCall_0()); 

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
    // $ANTLR end "rule__Expression__XAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});

}