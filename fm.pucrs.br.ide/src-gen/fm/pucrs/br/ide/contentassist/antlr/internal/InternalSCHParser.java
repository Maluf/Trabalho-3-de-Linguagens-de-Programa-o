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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_DOUBLE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'define'", "'-'", "'+'", "'*'", "'/'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=6;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
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

                if ( (LA1_0==RULE_INT||LA1_0==12) ) {
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


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalSCH.g:78:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalSCH.g:79:1: ( ruleTerminalExpression EOF )
            // InternalSCH.g:80:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalSCH.g:87:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:91:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalSCH.g:92:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalSCH.g:92:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalSCH.g:93:3: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // InternalSCH.g:94:3: ( rule__TerminalExpression__Alternatives )
            // InternalSCH.g:94:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalSCH.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSCH.g:104:1: ( ruleExpression EOF )
            // InternalSCH.g:105:1: ruleExpression EOF
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
    // InternalSCH.g:112:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:116:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalSCH.g:117:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalSCH.g:117:2: ( ( rule__Expression__Group__0 ) )
            // InternalSCH.g:118:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalSCH.g:119:3: ( rule__Expression__Group__0 )
            // InternalSCH.g:119:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleDefine"
    // InternalSCH.g:128:1: entryRuleDefine : ruleDefine EOF ;
    public final void entryRuleDefine() throws RecognitionException {
        try {
            // InternalSCH.g:129:1: ( ruleDefine EOF )
            // InternalSCH.g:130:1: ruleDefine EOF
            {
             before(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getDefineRule()); 
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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalSCH.g:137:1: ruleDefine : ( ( rule__Define__Group__0 ) ) ;
    public final void ruleDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:141:2: ( ( ( rule__Define__Group__0 ) ) )
            // InternalSCH.g:142:2: ( ( rule__Define__Group__0 ) )
            {
            // InternalSCH.g:142:2: ( ( rule__Define__Group__0 ) )
            // InternalSCH.g:143:3: ( rule__Define__Group__0 )
            {
             before(grammarAccess.getDefineAccess().getGroup()); 
            // InternalSCH.g:144:3: ( rule__Define__Group__0 )
            // InternalSCH.g:144:4: rule__Define__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Define__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getGroup()); 

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleOperator"
    // InternalSCH.g:153:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalSCH.g:154:1: ( ruleOperator EOF )
            // InternalSCH.g:155:1: ruleOperator EOF
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
    // InternalSCH.g:162:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:166:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalSCH.g:167:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalSCH.g:167:2: ( ( rule__Operator__Alternatives ) )
            // InternalSCH.g:168:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalSCH.g:169:3: ( rule__Operator__Alternatives )
            // InternalSCH.g:169:4: rule__Operator__Alternatives
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
    // InternalSCH.g:178:1: entryRuleSubtract : ruleSubtract EOF ;
    public final void entryRuleSubtract() throws RecognitionException {
        try {
            // InternalSCH.g:179:1: ( ruleSubtract EOF )
            // InternalSCH.g:180:1: ruleSubtract EOF
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
    // InternalSCH.g:187:1: ruleSubtract : ( ( rule__Subtract__MinusAssignment ) ) ;
    public final void ruleSubtract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:191:2: ( ( ( rule__Subtract__MinusAssignment ) ) )
            // InternalSCH.g:192:2: ( ( rule__Subtract__MinusAssignment ) )
            {
            // InternalSCH.g:192:2: ( ( rule__Subtract__MinusAssignment ) )
            // InternalSCH.g:193:3: ( rule__Subtract__MinusAssignment )
            {
             before(grammarAccess.getSubtractAccess().getMinusAssignment()); 
            // InternalSCH.g:194:3: ( rule__Subtract__MinusAssignment )
            // InternalSCH.g:194:4: rule__Subtract__MinusAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Subtract__MinusAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSubtractAccess().getMinusAssignment()); 

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
    // InternalSCH.g:203:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalSCH.g:204:1: ( ruleAdd EOF )
            // InternalSCH.g:205:1: ruleAdd EOF
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
    // InternalSCH.g:212:1: ruleAdd : ( ( rule__Add__PlusAssignment ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:216:2: ( ( ( rule__Add__PlusAssignment ) ) )
            // InternalSCH.g:217:2: ( ( rule__Add__PlusAssignment ) )
            {
            // InternalSCH.g:217:2: ( ( rule__Add__PlusAssignment ) )
            // InternalSCH.g:218:3: ( rule__Add__PlusAssignment )
            {
             before(grammarAccess.getAddAccess().getPlusAssignment()); 
            // InternalSCH.g:219:3: ( rule__Add__PlusAssignment )
            // InternalSCH.g:219:4: rule__Add__PlusAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Add__PlusAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getPlusAssignment()); 

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
    // InternalSCH.g:228:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalSCH.g:229:1: ( ruleMultiply EOF )
            // InternalSCH.g:230:1: ruleMultiply EOF
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
    // InternalSCH.g:237:1: ruleMultiply : ( ( rule__Multiply__TimesAssignment ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:241:2: ( ( ( rule__Multiply__TimesAssignment ) ) )
            // InternalSCH.g:242:2: ( ( rule__Multiply__TimesAssignment ) )
            {
            // InternalSCH.g:242:2: ( ( rule__Multiply__TimesAssignment ) )
            // InternalSCH.g:243:3: ( rule__Multiply__TimesAssignment )
            {
             before(grammarAccess.getMultiplyAccess().getTimesAssignment()); 
            // InternalSCH.g:244:3: ( rule__Multiply__TimesAssignment )
            // InternalSCH.g:244:4: rule__Multiply__TimesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__TimesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getTimesAssignment()); 

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
    // InternalSCH.g:253:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalSCH.g:254:1: ( ruleDivide EOF )
            // InternalSCH.g:255:1: ruleDivide EOF
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
    // InternalSCH.g:262:1: ruleDivide : ( ( rule__Divide__DivededAssignment ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:266:2: ( ( ( rule__Divide__DivededAssignment ) ) )
            // InternalSCH.g:267:2: ( ( rule__Divide__DivededAssignment ) )
            {
            // InternalSCH.g:267:2: ( ( rule__Divide__DivededAssignment ) )
            // InternalSCH.g:268:3: ( rule__Divide__DivededAssignment )
            {
             before(grammarAccess.getDivideAccess().getDivededAssignment()); 
            // InternalSCH.g:269:3: ( rule__Divide__DivededAssignment )
            // InternalSCH.g:269:4: rule__Divide__DivededAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Divide__DivededAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDivideAccess().getDivededAssignment()); 

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


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalSCH.g:277:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( ( rule__TerminalExpression__ValueAssignment_2 ) ) ( ( rule__TerminalExpression__ValueAssignment_2 )* ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:281:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( ( rule__TerminalExpression__ValueAssignment_2 ) ) ( ( rule__TerminalExpression__ValueAssignment_2 )* ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==14) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=15 && LA3_1<=18)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSCH.g:282:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalSCH.g:282:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalSCH.g:283:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // InternalSCH.g:284:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalSCH.g:284:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:288:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalSCH.g:288:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalSCH.g:289:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // InternalSCH.g:290:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalSCH.g:290:4: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSCH.g:294:2: ( ( ( rule__TerminalExpression__ValueAssignment_2 ) ) ( ( rule__TerminalExpression__ValueAssignment_2 )* ) )
                    {
                    // InternalSCH.g:294:2: ( ( ( rule__TerminalExpression__ValueAssignment_2 ) ) ( ( rule__TerminalExpression__ValueAssignment_2 )* ) )
                    // InternalSCH.g:295:3: ( ( rule__TerminalExpression__ValueAssignment_2 ) ) ( ( rule__TerminalExpression__ValueAssignment_2 )* )
                    {
                    // InternalSCH.g:295:3: ( ( rule__TerminalExpression__ValueAssignment_2 ) )
                    // InternalSCH.g:296:4: ( rule__TerminalExpression__ValueAssignment_2 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2()); 
                    // InternalSCH.g:297:4: ( rule__TerminalExpression__ValueAssignment_2 )
                    // InternalSCH.g:297:5: rule__TerminalExpression__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_4);
                    rule__TerminalExpression__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2()); 

                    }

                    // InternalSCH.g:300:3: ( ( rule__TerminalExpression__ValueAssignment_2 )* )
                    // InternalSCH.g:301:4: ( rule__TerminalExpression__ValueAssignment_2 )*
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2()); 
                    // InternalSCH.g:302:4: ( rule__TerminalExpression__ValueAssignment_2 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_INT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSCH.g:302:5: rule__TerminalExpression__ValueAssignment_2
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__TerminalExpression__ValueAssignment_2();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2()); 

                    }


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
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalSCH.g:311:1: rule__Operator__Alternatives : ( ( ruleDivide ) | ( ruleMultiply ) | ( ruleAdd ) | ( ruleSubtract ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:315:1: ( ( ruleDivide ) | ( ruleMultiply ) | ( ruleAdd ) | ( ruleSubtract ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 15:
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
                    // InternalSCH.g:316:2: ( ruleDivide )
                    {
                    // InternalSCH.g:316:2: ( ruleDivide )
                    // InternalSCH.g:317:3: ruleDivide
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
                    // InternalSCH.g:322:2: ( ruleMultiply )
                    {
                    // InternalSCH.g:322:2: ( ruleMultiply )
                    // InternalSCH.g:323:3: ruleMultiply
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
                    // InternalSCH.g:328:2: ( ruleAdd )
                    {
                    // InternalSCH.g:328:2: ( ruleAdd )
                    // InternalSCH.g:329:3: ruleAdd
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
                    // InternalSCH.g:334:2: ( ruleSubtract )
                    {
                    // InternalSCH.g:334:2: ( ruleSubtract )
                    // InternalSCH.g:335:3: ruleSubtract
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


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalSCH.g:344:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:348:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalSCH.g:349:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalSCH.g:356:1: rule__TerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:360:1: ( ( '(' ) )
            // InternalSCH.g:361:1: ( '(' )
            {
            // InternalSCH.g:361:1: ( '(' )
            // InternalSCH.g:362:2: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalSCH.g:371:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:375:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // InternalSCH.g:376:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__2();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalSCH.g:383:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:387:1: ( ( ruleExpression ) )
            // InternalSCH.g:388:1: ( ruleExpression )
            {
            // InternalSCH.g:388:1: ( ruleExpression )
            // InternalSCH.g:389:2: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__2"
    // InternalSCH.g:398:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:402:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // InternalSCH.g:403:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__2__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__2"


    // $ANTLR start "rule__TerminalExpression__Group_0__2__Impl"
    // InternalSCH.g:409:1: rule__TerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:413:1: ( ( ')' ) )
            // InternalSCH.g:414:1: ( ')' )
            {
            // InternalSCH.g:414:1: ( ')' )
            // InternalSCH.g:415:2: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_0__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__0"
    // InternalSCH.g:425:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:429:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalSCH.g:430:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_1__0__Impl"
    // InternalSCH.g:437:1: rule__TerminalExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:441:1: ( ( '(' ) )
            // InternalSCH.g:442:1: ( '(' )
            {
            // InternalSCH.g:442:1: ( '(' )
            // InternalSCH.g:443:2: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__1"
    // InternalSCH.g:452:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl rule__TerminalExpression__Group_1__2 ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:456:1: ( rule__TerminalExpression__Group_1__1__Impl rule__TerminalExpression__Group_1__2 )
            // InternalSCH.g:457:2: rule__TerminalExpression__Group_1__1__Impl rule__TerminalExpression__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__TerminalExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__2();

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
    // $ANTLR end "rule__TerminalExpression__Group_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_1__1__Impl"
    // InternalSCH.g:464:1: rule__TerminalExpression__Group_1__1__Impl : ( ruleDefine ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:468:1: ( ( ruleDefine ) )
            // InternalSCH.g:469:1: ( ruleDefine )
            {
            // InternalSCH.g:469:1: ( ruleDefine )
            // InternalSCH.g:470:2: ruleDefine
            {
             before(grammarAccess.getTerminalExpressionAccess().getDefineParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getDefineParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__2"
    // InternalSCH.g:479:1: rule__TerminalExpression__Group_1__2 : rule__TerminalExpression__Group_1__2__Impl ;
    public final void rule__TerminalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:483:1: ( rule__TerminalExpression__Group_1__2__Impl )
            // InternalSCH.g:484:2: rule__TerminalExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_1__2"


    // $ANTLR start "rule__TerminalExpression__Group_1__2__Impl"
    // InternalSCH.g:490:1: rule__TerminalExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:494:1: ( ( ')' ) )
            // InternalSCH.g:495:1: ( ')' )
            {
            // InternalSCH.g:495:1: ( ')' )
            // InternalSCH.g:496:2: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalSCH.g:506:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:510:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalSCH.g:511:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalSCH.g:518:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__OpAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:522:1: ( ( ( rule__Expression__OpAssignment_0 ) ) )
            // InternalSCH.g:523:1: ( ( rule__Expression__OpAssignment_0 ) )
            {
            // InternalSCH.g:523:1: ( ( rule__Expression__OpAssignment_0 ) )
            // InternalSCH.g:524:2: ( rule__Expression__OpAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_0()); 
            // InternalSCH.g:525:2: ( rule__Expression__OpAssignment_0 )
            // InternalSCH.g:525:3: rule__Expression__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOpAssignment_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalSCH.g:533:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:537:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalSCH.g:538:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__2();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalSCH.g:545:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__LeftAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:549:1: ( ( ( rule__Expression__LeftAssignment_1 ) ) )
            // InternalSCH.g:550:1: ( ( rule__Expression__LeftAssignment_1 ) )
            {
            // InternalSCH.g:550:1: ( ( rule__Expression__LeftAssignment_1 ) )
            // InternalSCH.g:551:2: ( rule__Expression__LeftAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_1()); 
            // InternalSCH.g:552:2: ( rule__Expression__LeftAssignment_1 )
            // InternalSCH.g:552:3: rule__Expression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLeftAssignment_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // InternalSCH.g:560:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:564:1: ( rule__Expression__Group__2__Impl )
            // InternalSCH.g:565:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__2__Impl();

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
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalSCH.g:571:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__RightAssignment_2 )* ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:575:1: ( ( ( rule__Expression__RightAssignment_2 )* ) )
            // InternalSCH.g:576:1: ( ( rule__Expression__RightAssignment_2 )* )
            {
            // InternalSCH.g:576:1: ( ( rule__Expression__RightAssignment_2 )* )
            // InternalSCH.g:577:2: ( rule__Expression__RightAssignment_2 )*
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_2()); 
            // InternalSCH.g:578:2: ( rule__Expression__RightAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT||LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSCH.g:578:3: rule__Expression__RightAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Expression__RightAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__Define__Group__0"
    // InternalSCH.g:587:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:591:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // InternalSCH.g:592:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Define__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__1();

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
    // $ANTLR end "rule__Define__Group__0"


    // $ANTLR start "rule__Define__Group__0__Impl"
    // InternalSCH.g:599:1: rule__Define__Group__0__Impl : ( 'define' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:603:1: ( ( 'define' ) )
            // InternalSCH.g:604:1: ( 'define' )
            {
            // InternalSCH.g:604:1: ( 'define' )
            // InternalSCH.g:605:2: 'define'
            {
             before(grammarAccess.getDefineAccess().getDefineKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getDefineKeyword_0()); 

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
    // $ANTLR end "rule__Define__Group__0__Impl"


    // $ANTLR start "rule__Define__Group__1"
    // InternalSCH.g:614:1: rule__Define__Group__1 : rule__Define__Group__1__Impl rule__Define__Group__2 ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:618:1: ( rule__Define__Group__1__Impl rule__Define__Group__2 )
            // InternalSCH.g:619:2: rule__Define__Group__1__Impl rule__Define__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Define__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__2();

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
    // $ANTLR end "rule__Define__Group__1"


    // $ANTLR start "rule__Define__Group__1__Impl"
    // InternalSCH.g:626:1: rule__Define__Group__1__Impl : ( ( rule__Define__IdAssignment_1 ) ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:630:1: ( ( ( rule__Define__IdAssignment_1 ) ) )
            // InternalSCH.g:631:1: ( ( rule__Define__IdAssignment_1 ) )
            {
            // InternalSCH.g:631:1: ( ( rule__Define__IdAssignment_1 ) )
            // InternalSCH.g:632:2: ( rule__Define__IdAssignment_1 )
            {
             before(grammarAccess.getDefineAccess().getIdAssignment_1()); 
            // InternalSCH.g:633:2: ( rule__Define__IdAssignment_1 )
            // InternalSCH.g:633:3: rule__Define__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Define__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__Define__Group__1__Impl"


    // $ANTLR start "rule__Define__Group__2"
    // InternalSCH.g:641:1: rule__Define__Group__2 : rule__Define__Group__2__Impl ;
    public final void rule__Define__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:645:1: ( rule__Define__Group__2__Impl )
            // InternalSCH.g:646:2: rule__Define__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Define__Group__2__Impl();

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
    // $ANTLR end "rule__Define__Group__2"


    // $ANTLR start "rule__Define__Group__2__Impl"
    // InternalSCH.g:652:1: rule__Define__Group__2__Impl : ( ( rule__Define__ExAssignment_2 )* ) ;
    public final void rule__Define__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:656:1: ( ( ( rule__Define__ExAssignment_2 )* ) )
            // InternalSCH.g:657:1: ( ( rule__Define__ExAssignment_2 )* )
            {
            // InternalSCH.g:657:1: ( ( rule__Define__ExAssignment_2 )* )
            // InternalSCH.g:658:2: ( rule__Define__ExAssignment_2 )*
            {
             before(grammarAccess.getDefineAccess().getExAssignment_2()); 
            // InternalSCH.g:659:2: ( rule__Define__ExAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_INT||LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSCH.g:659:3: rule__Define__ExAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Define__ExAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDefineAccess().getExAssignment_2()); 

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
    // $ANTLR end "rule__Define__Group__2__Impl"


    // $ANTLR start "rule__Model__ExpressionsAssignment"
    // InternalSCH.g:668:1: rule__Model__ExpressionsAssignment : ( ruleTerminalExpression ) ;
    public final void rule__Model__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:672:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:673:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:673:2: ( ruleTerminalExpression )
            // InternalSCH.g:674:3: ruleTerminalExpression
            {
             before(grammarAccess.getModelAccess().getExpressionsTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExpressionsTerminalExpressionParserRuleCall_0()); 

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


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_2"
    // InternalSCH.g:683:1: rule__TerminalExpression__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:687:1: ( ( RULE_INT ) )
            // InternalSCH.g:688:2: ( RULE_INT )
            {
            // InternalSCH.g:688:2: ( RULE_INT )
            // InternalSCH.g:689:3: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_2"


    // $ANTLR start "rule__Expression__OpAssignment_0"
    // InternalSCH.g:698:1: rule__Expression__OpAssignment_0 : ( ruleOperator ) ;
    public final void rule__Expression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:702:1: ( ( ruleOperator ) )
            // InternalSCH.g:703:2: ( ruleOperator )
            {
            // InternalSCH.g:703:2: ( ruleOperator )
            // InternalSCH.g:704:3: ruleOperator
            {
             before(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expression__OpAssignment_0"


    // $ANTLR start "rule__Expression__LeftAssignment_1"
    // InternalSCH.g:713:1: rule__Expression__LeftAssignment_1 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:717:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:718:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:718:2: ( ruleTerminalExpression )
            // InternalSCH.g:719:3: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getLeftTerminalExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLeftTerminalExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expression__LeftAssignment_1"


    // $ANTLR start "rule__Expression__RightAssignment_2"
    // InternalSCH.g:728:1: rule__Expression__RightAssignment_2 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:732:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:733:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:733:2: ( ruleTerminalExpression )
            // InternalSCH.g:734:3: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_2"


    // $ANTLR start "rule__Define__IdAssignment_1"
    // InternalSCH.g:743:1: rule__Define__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Define__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:747:1: ( ( RULE_ID ) )
            // InternalSCH.g:748:2: ( RULE_ID )
            {
            // InternalSCH.g:748:2: ( RULE_ID )
            // InternalSCH.g:749:3: RULE_ID
            {
             before(grammarAccess.getDefineAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Define__IdAssignment_1"


    // $ANTLR start "rule__Define__ExAssignment_2"
    // InternalSCH.g:758:1: rule__Define__ExAssignment_2 : ( ruleTerminalExpression ) ;
    public final void rule__Define__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:762:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:763:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:763:2: ( ruleTerminalExpression )
            // InternalSCH.g:764:3: ruleTerminalExpression
            {
             before(grammarAccess.getDefineAccess().getExTerminalExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getExTerminalExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Define__ExAssignment_2"


    // $ANTLR start "rule__Subtract__MinusAssignment"
    // InternalSCH.g:773:1: rule__Subtract__MinusAssignment : ( ( '-' ) ) ;
    public final void rule__Subtract__MinusAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:777:1: ( ( ( '-' ) ) )
            // InternalSCH.g:778:2: ( ( '-' ) )
            {
            // InternalSCH.g:778:2: ( ( '-' ) )
            // InternalSCH.g:779:3: ( '-' )
            {
             before(grammarAccess.getSubtractAccess().getMinusHyphenMinusKeyword_0()); 
            // InternalSCH.g:780:3: ( '-' )
            // InternalSCH.g:781:4: '-'
            {
             before(grammarAccess.getSubtractAccess().getMinusHyphenMinusKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubtractAccess().getMinusHyphenMinusKeyword_0()); 

            }

             after(grammarAccess.getSubtractAccess().getMinusHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Subtract__MinusAssignment"


    // $ANTLR start "rule__Add__PlusAssignment"
    // InternalSCH.g:792:1: rule__Add__PlusAssignment : ( ( '+' ) ) ;
    public final void rule__Add__PlusAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:796:1: ( ( ( '+' ) ) )
            // InternalSCH.g:797:2: ( ( '+' ) )
            {
            // InternalSCH.g:797:2: ( ( '+' ) )
            // InternalSCH.g:798:3: ( '+' )
            {
             before(grammarAccess.getAddAccess().getPlusPlusSignKeyword_0()); 
            // InternalSCH.g:799:3: ( '+' )
            // InternalSCH.g:800:4: '+'
            {
             before(grammarAccess.getAddAccess().getPlusPlusSignKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getPlusPlusSignKeyword_0()); 

            }

             after(grammarAccess.getAddAccess().getPlusPlusSignKeyword_0()); 

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
    // $ANTLR end "rule__Add__PlusAssignment"


    // $ANTLR start "rule__Multiply__TimesAssignment"
    // InternalSCH.g:811:1: rule__Multiply__TimesAssignment : ( ( '*' ) ) ;
    public final void rule__Multiply__TimesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:815:1: ( ( ( '*' ) ) )
            // InternalSCH.g:816:2: ( ( '*' ) )
            {
            // InternalSCH.g:816:2: ( ( '*' ) )
            // InternalSCH.g:817:3: ( '*' )
            {
             before(grammarAccess.getMultiplyAccess().getTimesAsteriskKeyword_0()); 
            // InternalSCH.g:818:3: ( '*' )
            // InternalSCH.g:819:4: '*'
            {
             before(grammarAccess.getMultiplyAccess().getTimesAsteriskKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMultiplyAccess().getTimesAsteriskKeyword_0()); 

            }

             after(grammarAccess.getMultiplyAccess().getTimesAsteriskKeyword_0()); 

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
    // $ANTLR end "rule__Multiply__TimesAssignment"


    // $ANTLR start "rule__Divide__DivededAssignment"
    // InternalSCH.g:830:1: rule__Divide__DivededAssignment : ( ( '/' ) ) ;
    public final void rule__Divide__DivededAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:834:1: ( ( ( '/' ) ) )
            // InternalSCH.g:835:2: ( ( '/' ) )
            {
            // InternalSCH.g:835:2: ( ( '/' ) )
            // InternalSCH.g:836:3: ( '/' )
            {
             before(grammarAccess.getDivideAccess().getDivededSolidusKeyword_0()); 
            // InternalSCH.g:837:3: ( '/' )
            // InternalSCH.g:838:4: '/'
            {
             before(grammarAccess.getDivideAccess().getDivededSolidusKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDivideAccess().getDivededSolidusKeyword_0()); 

            }

             after(grammarAccess.getDivideAccess().getDivededSolidusKeyword_0()); 

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
    // $ANTLR end "rule__Divide__DivededAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});

}