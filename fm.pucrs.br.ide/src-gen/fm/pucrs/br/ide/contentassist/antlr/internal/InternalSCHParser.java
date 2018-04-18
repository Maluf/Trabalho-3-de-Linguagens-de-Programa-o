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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#t'", "'#f'", "'('", "')'", "'define'", "'lambda'", "'if'", "'='", "'>='", "'<='", "'!='", "'>'", "'<'", "'-'", "'+'", "'*'", "'/'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_STRING)||(LA1_0>=12 && LA1_0<=14)) ) {
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


    // $ANTLR start "entryRuleLambda"
    // InternalSCH.g:153:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalSCH.g:154:1: ( ruleLambda EOF )
            // InternalSCH.g:155:1: ruleLambda EOF
            {
             before(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getLambdaRule()); 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalSCH.g:162:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:166:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalSCH.g:167:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalSCH.g:167:2: ( ( rule__Lambda__Group__0 ) )
            // InternalSCH.g:168:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalSCH.g:169:3: ( rule__Lambda__Group__0 )
            // InternalSCH.g:169:4: rule__Lambda__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getGroup()); 

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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleIf"
    // InternalSCH.g:178:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalSCH.g:179:1: ( ruleIf EOF )
            // InternalSCH.g:180:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalSCH.g:187:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:191:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalSCH.g:192:2: ( ( rule__If__Group__0 ) )
            {
            // InternalSCH.g:192:2: ( ( rule__If__Group__0 ) )
            // InternalSCH.g:193:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalSCH.g:194:3: ( rule__If__Group__0 )
            // InternalSCH.g:194:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleBool"
    // InternalSCH.g:203:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // InternalSCH.g:204:1: ( ruleBool EOF )
            // InternalSCH.g:205:1: ruleBool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalSCH.g:212:1: ruleBool : ( ( rule__Bool__Alternatives ) ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:216:2: ( ( ( rule__Bool__Alternatives ) ) )
            // InternalSCH.g:217:2: ( ( rule__Bool__Alternatives ) )
            {
            // InternalSCH.g:217:2: ( ( rule__Bool__Alternatives ) )
            // InternalSCH.g:218:3: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // InternalSCH.g:219:3: ( rule__Bool__Alternatives )
            // InternalSCH.g:219:4: rule__Bool__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleEqual"
    // InternalSCH.g:228:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalSCH.g:229:1: ( ruleEqual EOF )
            // InternalSCH.g:230:1: ruleEqual EOF
            {
             before(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            ruleEqual();

            state._fsp--;

             after(grammarAccess.getEqualRule()); 
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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalSCH.g:237:1: ruleEqual : ( ( rule__Equal__EqualAssignment ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:241:2: ( ( ( rule__Equal__EqualAssignment ) ) )
            // InternalSCH.g:242:2: ( ( rule__Equal__EqualAssignment ) )
            {
            // InternalSCH.g:242:2: ( ( rule__Equal__EqualAssignment ) )
            // InternalSCH.g:243:3: ( rule__Equal__EqualAssignment )
            {
             before(grammarAccess.getEqualAccess().getEqualAssignment()); 
            // InternalSCH.g:244:3: ( rule__Equal__EqualAssignment )
            // InternalSCH.g:244:4: rule__Equal__EqualAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Equal__EqualAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getEqualAssignment()); 

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
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleMoreOrEqual"
    // InternalSCH.g:253:1: entryRuleMoreOrEqual : ruleMoreOrEqual EOF ;
    public final void entryRuleMoreOrEqual() throws RecognitionException {
        try {
            // InternalSCH.g:254:1: ( ruleMoreOrEqual EOF )
            // InternalSCH.g:255:1: ruleMoreOrEqual EOF
            {
             before(grammarAccess.getMoreOrEqualRule()); 
            pushFollow(FOLLOW_1);
            ruleMoreOrEqual();

            state._fsp--;

             after(grammarAccess.getMoreOrEqualRule()); 
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
    // $ANTLR end "entryRuleMoreOrEqual"


    // $ANTLR start "ruleMoreOrEqual"
    // InternalSCH.g:262:1: ruleMoreOrEqual : ( ( rule__MoreOrEqual__MoreOrEqualAssignment ) ) ;
    public final void ruleMoreOrEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:266:2: ( ( ( rule__MoreOrEqual__MoreOrEqualAssignment ) ) )
            // InternalSCH.g:267:2: ( ( rule__MoreOrEqual__MoreOrEqualAssignment ) )
            {
            // InternalSCH.g:267:2: ( ( rule__MoreOrEqual__MoreOrEqualAssignment ) )
            // InternalSCH.g:268:3: ( rule__MoreOrEqual__MoreOrEqualAssignment )
            {
             before(grammarAccess.getMoreOrEqualAccess().getMoreOrEqualAssignment()); 
            // InternalSCH.g:269:3: ( rule__MoreOrEqual__MoreOrEqualAssignment )
            // InternalSCH.g:269:4: rule__MoreOrEqual__MoreOrEqualAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MoreOrEqual__MoreOrEqualAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMoreOrEqualAccess().getMoreOrEqualAssignment()); 

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
    // $ANTLR end "ruleMoreOrEqual"


    // $ANTLR start "entryRuleLessOrEqual"
    // InternalSCH.g:278:1: entryRuleLessOrEqual : ruleLessOrEqual EOF ;
    public final void entryRuleLessOrEqual() throws RecognitionException {
        try {
            // InternalSCH.g:279:1: ( ruleLessOrEqual EOF )
            // InternalSCH.g:280:1: ruleLessOrEqual EOF
            {
             before(grammarAccess.getLessOrEqualRule()); 
            pushFollow(FOLLOW_1);
            ruleLessOrEqual();

            state._fsp--;

             after(grammarAccess.getLessOrEqualRule()); 
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
    // $ANTLR end "entryRuleLessOrEqual"


    // $ANTLR start "ruleLessOrEqual"
    // InternalSCH.g:287:1: ruleLessOrEqual : ( ( rule__LessOrEqual__LessOrEqualAssignment ) ) ;
    public final void ruleLessOrEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:291:2: ( ( ( rule__LessOrEqual__LessOrEqualAssignment ) ) )
            // InternalSCH.g:292:2: ( ( rule__LessOrEqual__LessOrEqualAssignment ) )
            {
            // InternalSCH.g:292:2: ( ( rule__LessOrEqual__LessOrEqualAssignment ) )
            // InternalSCH.g:293:3: ( rule__LessOrEqual__LessOrEqualAssignment )
            {
             before(grammarAccess.getLessOrEqualAccess().getLessOrEqualAssignment()); 
            // InternalSCH.g:294:3: ( rule__LessOrEqual__LessOrEqualAssignment )
            // InternalSCH.g:294:4: rule__LessOrEqual__LessOrEqualAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LessOrEqual__LessOrEqualAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLessOrEqualAccess().getLessOrEqualAssignment()); 

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
    // $ANTLR end "ruleLessOrEqual"


    // $ANTLR start "entryRuleDifferent"
    // InternalSCH.g:303:1: entryRuleDifferent : ruleDifferent EOF ;
    public final void entryRuleDifferent() throws RecognitionException {
        try {
            // InternalSCH.g:304:1: ( ruleDifferent EOF )
            // InternalSCH.g:305:1: ruleDifferent EOF
            {
             before(grammarAccess.getDifferentRule()); 
            pushFollow(FOLLOW_1);
            ruleDifferent();

            state._fsp--;

             after(grammarAccess.getDifferentRule()); 
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
    // $ANTLR end "entryRuleDifferent"


    // $ANTLR start "ruleDifferent"
    // InternalSCH.g:312:1: ruleDifferent : ( ( rule__Different__DifferentAssignment ) ) ;
    public final void ruleDifferent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:316:2: ( ( ( rule__Different__DifferentAssignment ) ) )
            // InternalSCH.g:317:2: ( ( rule__Different__DifferentAssignment ) )
            {
            // InternalSCH.g:317:2: ( ( rule__Different__DifferentAssignment ) )
            // InternalSCH.g:318:3: ( rule__Different__DifferentAssignment )
            {
             before(grammarAccess.getDifferentAccess().getDifferentAssignment()); 
            // InternalSCH.g:319:3: ( rule__Different__DifferentAssignment )
            // InternalSCH.g:319:4: rule__Different__DifferentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Different__DifferentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDifferentAccess().getDifferentAssignment()); 

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
    // $ANTLR end "ruleDifferent"


    // $ANTLR start "entryRuleMore"
    // InternalSCH.g:328:1: entryRuleMore : ruleMore EOF ;
    public final void entryRuleMore() throws RecognitionException {
        try {
            // InternalSCH.g:329:1: ( ruleMore EOF )
            // InternalSCH.g:330:1: ruleMore EOF
            {
             before(grammarAccess.getMoreRule()); 
            pushFollow(FOLLOW_1);
            ruleMore();

            state._fsp--;

             after(grammarAccess.getMoreRule()); 
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
    // $ANTLR end "entryRuleMore"


    // $ANTLR start "ruleMore"
    // InternalSCH.g:337:1: ruleMore : ( ( rule__More__MoreAssignment ) ) ;
    public final void ruleMore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:341:2: ( ( ( rule__More__MoreAssignment ) ) )
            // InternalSCH.g:342:2: ( ( rule__More__MoreAssignment ) )
            {
            // InternalSCH.g:342:2: ( ( rule__More__MoreAssignment ) )
            // InternalSCH.g:343:3: ( rule__More__MoreAssignment )
            {
             before(grammarAccess.getMoreAccess().getMoreAssignment()); 
            // InternalSCH.g:344:3: ( rule__More__MoreAssignment )
            // InternalSCH.g:344:4: rule__More__MoreAssignment
            {
            pushFollow(FOLLOW_2);
            rule__More__MoreAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMoreAccess().getMoreAssignment()); 

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
    // $ANTLR end "ruleMore"


    // $ANTLR start "entryRuleLess"
    // InternalSCH.g:353:1: entryRuleLess : ruleLess EOF ;
    public final void entryRuleLess() throws RecognitionException {
        try {
            // InternalSCH.g:354:1: ( ruleLess EOF )
            // InternalSCH.g:355:1: ruleLess EOF
            {
             before(grammarAccess.getLessRule()); 
            pushFollow(FOLLOW_1);
            ruleLess();

            state._fsp--;

             after(grammarAccess.getLessRule()); 
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
    // $ANTLR end "entryRuleLess"


    // $ANTLR start "ruleLess"
    // InternalSCH.g:362:1: ruleLess : ( ( rule__Less__LessAssignment ) ) ;
    public final void ruleLess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:366:2: ( ( ( rule__Less__LessAssignment ) ) )
            // InternalSCH.g:367:2: ( ( rule__Less__LessAssignment ) )
            {
            // InternalSCH.g:367:2: ( ( rule__Less__LessAssignment ) )
            // InternalSCH.g:368:3: ( rule__Less__LessAssignment )
            {
             before(grammarAccess.getLessAccess().getLessAssignment()); 
            // InternalSCH.g:369:3: ( rule__Less__LessAssignment )
            // InternalSCH.g:369:4: rule__Less__LessAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Less__LessAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLessAccess().getLessAssignment()); 

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
    // $ANTLR end "ruleLess"


    // $ANTLR start "entryRuleOperator"
    // InternalSCH.g:378:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalSCH.g:379:1: ( ruleOperator EOF )
            // InternalSCH.g:380:1: ruleOperator EOF
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
    // InternalSCH.g:387:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:391:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalSCH.g:392:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalSCH.g:392:2: ( ( rule__Operator__Alternatives ) )
            // InternalSCH.g:393:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalSCH.g:394:3: ( rule__Operator__Alternatives )
            // InternalSCH.g:394:4: rule__Operator__Alternatives
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
    // InternalSCH.g:403:1: entryRuleSubtract : ruleSubtract EOF ;
    public final void entryRuleSubtract() throws RecognitionException {
        try {
            // InternalSCH.g:404:1: ( ruleSubtract EOF )
            // InternalSCH.g:405:1: ruleSubtract EOF
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
    // InternalSCH.g:412:1: ruleSubtract : ( ( rule__Subtract__MinusAssignment ) ) ;
    public final void ruleSubtract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:416:2: ( ( ( rule__Subtract__MinusAssignment ) ) )
            // InternalSCH.g:417:2: ( ( rule__Subtract__MinusAssignment ) )
            {
            // InternalSCH.g:417:2: ( ( rule__Subtract__MinusAssignment ) )
            // InternalSCH.g:418:3: ( rule__Subtract__MinusAssignment )
            {
             before(grammarAccess.getSubtractAccess().getMinusAssignment()); 
            // InternalSCH.g:419:3: ( rule__Subtract__MinusAssignment )
            // InternalSCH.g:419:4: rule__Subtract__MinusAssignment
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
    // InternalSCH.g:428:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalSCH.g:429:1: ( ruleAdd EOF )
            // InternalSCH.g:430:1: ruleAdd EOF
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
    // InternalSCH.g:437:1: ruleAdd : ( ( rule__Add__PlusAssignment ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:441:2: ( ( ( rule__Add__PlusAssignment ) ) )
            // InternalSCH.g:442:2: ( ( rule__Add__PlusAssignment ) )
            {
            // InternalSCH.g:442:2: ( ( rule__Add__PlusAssignment ) )
            // InternalSCH.g:443:3: ( rule__Add__PlusAssignment )
            {
             before(grammarAccess.getAddAccess().getPlusAssignment()); 
            // InternalSCH.g:444:3: ( rule__Add__PlusAssignment )
            // InternalSCH.g:444:4: rule__Add__PlusAssignment
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
    // InternalSCH.g:453:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalSCH.g:454:1: ( ruleMultiply EOF )
            // InternalSCH.g:455:1: ruleMultiply EOF
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
    // InternalSCH.g:462:1: ruleMultiply : ( ( rule__Multiply__TimesAssignment ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:466:2: ( ( ( rule__Multiply__TimesAssignment ) ) )
            // InternalSCH.g:467:2: ( ( rule__Multiply__TimesAssignment ) )
            {
            // InternalSCH.g:467:2: ( ( rule__Multiply__TimesAssignment ) )
            // InternalSCH.g:468:3: ( rule__Multiply__TimesAssignment )
            {
             before(grammarAccess.getMultiplyAccess().getTimesAssignment()); 
            // InternalSCH.g:469:3: ( rule__Multiply__TimesAssignment )
            // InternalSCH.g:469:4: rule__Multiply__TimesAssignment
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
    // InternalSCH.g:478:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalSCH.g:479:1: ( ruleDivide EOF )
            // InternalSCH.g:480:1: ruleDivide EOF
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
    // InternalSCH.g:487:1: ruleDivide : ( ( rule__Divide__DivededAssignment ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:491:2: ( ( ( rule__Divide__DivededAssignment ) ) )
            // InternalSCH.g:492:2: ( ( rule__Divide__DivededAssignment ) )
            {
            // InternalSCH.g:492:2: ( ( rule__Divide__DivededAssignment ) )
            // InternalSCH.g:493:3: ( rule__Divide__DivededAssignment )
            {
             before(grammarAccess.getDivideAccess().getDivededAssignment()); 
            // InternalSCH.g:494:3: ( rule__Divide__DivededAssignment )
            // InternalSCH.g:494:4: rule__Divide__DivededAssignment
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
    // InternalSCH.g:502:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( ( rule__TerminalExpression__ValueAssignment_4 ) ) ( ( rule__TerminalExpression__ValueAssignment_4 )* ) ) | ( ( ( rule__TerminalExpression__IdentifierAssignment_5 ) ) ( ( rule__TerminalExpression__IdentifierAssignment_5 )* ) ) | ( ( ( rule__TerminalExpression__BoolAssignment_6 ) ) ( ( rule__TerminalExpression__BoolAssignment_6 )* ) ) | ( ( rule__TerminalExpression__StrAssignment_7 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:506:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( ( rule__TerminalExpression__ValueAssignment_4 ) ) ( ( rule__TerminalExpression__ValueAssignment_4 )* ) ) | ( ( ( rule__TerminalExpression__IdentifierAssignment_5 ) ) ( ( rule__TerminalExpression__IdentifierAssignment_5 )* ) ) | ( ( ( rule__TerminalExpression__BoolAssignment_6 ) ) ( ( rule__TerminalExpression__BoolAssignment_6 )* ) ) | ( ( rule__TerminalExpression__StrAssignment_7 ) ) )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalSCH.g:507:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalSCH.g:507:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalSCH.g:508:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // InternalSCH.g:509:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalSCH.g:509:4: rule__TerminalExpression__Group_0__0
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
                    // InternalSCH.g:513:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalSCH.g:513:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalSCH.g:514:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // InternalSCH.g:515:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalSCH.g:515:4: rule__TerminalExpression__Group_1__0
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
                    // InternalSCH.g:519:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalSCH.g:519:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalSCH.g:520:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // InternalSCH.g:521:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalSCH.g:521:4: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSCH.g:525:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalSCH.g:525:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalSCH.g:526:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    // InternalSCH.g:527:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalSCH.g:527:4: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSCH.g:531:2: ( ( ( rule__TerminalExpression__ValueAssignment_4 ) ) ( ( rule__TerminalExpression__ValueAssignment_4 )* ) )
                    {
                    // InternalSCH.g:531:2: ( ( ( rule__TerminalExpression__ValueAssignment_4 ) ) ( ( rule__TerminalExpression__ValueAssignment_4 )* ) )
                    // InternalSCH.g:532:3: ( ( rule__TerminalExpression__ValueAssignment_4 ) ) ( ( rule__TerminalExpression__ValueAssignment_4 )* )
                    {
                    // InternalSCH.g:532:3: ( ( rule__TerminalExpression__ValueAssignment_4 ) )
                    // InternalSCH.g:533:4: ( rule__TerminalExpression__ValueAssignment_4 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4()); 
                    // InternalSCH.g:534:4: ( rule__TerminalExpression__ValueAssignment_4 )
                    // InternalSCH.g:534:5: rule__TerminalExpression__ValueAssignment_4
                    {
                    pushFollow(FOLLOW_4);
                    rule__TerminalExpression__ValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4()); 

                    }

                    // InternalSCH.g:537:3: ( ( rule__TerminalExpression__ValueAssignment_4 )* )
                    // InternalSCH.g:538:4: ( rule__TerminalExpression__ValueAssignment_4 )*
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4()); 
                    // InternalSCH.g:539:4: ( rule__TerminalExpression__ValueAssignment_4 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_INT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSCH.g:539:5: rule__TerminalExpression__ValueAssignment_4
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__TerminalExpression__ValueAssignment_4();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4()); 

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSCH.g:544:2: ( ( ( rule__TerminalExpression__IdentifierAssignment_5 ) ) ( ( rule__TerminalExpression__IdentifierAssignment_5 )* ) )
                    {
                    // InternalSCH.g:544:2: ( ( ( rule__TerminalExpression__IdentifierAssignment_5 ) ) ( ( rule__TerminalExpression__IdentifierAssignment_5 )* ) )
                    // InternalSCH.g:545:3: ( ( rule__TerminalExpression__IdentifierAssignment_5 ) ) ( ( rule__TerminalExpression__IdentifierAssignment_5 )* )
                    {
                    // InternalSCH.g:545:3: ( ( rule__TerminalExpression__IdentifierAssignment_5 ) )
                    // InternalSCH.g:546:4: ( rule__TerminalExpression__IdentifierAssignment_5 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getIdentifierAssignment_5()); 
                    // InternalSCH.g:547:4: ( rule__TerminalExpression__IdentifierAssignment_5 )
                    // InternalSCH.g:547:5: rule__TerminalExpression__IdentifierAssignment_5
                    {
                    pushFollow(FOLLOW_5);
                    rule__TerminalExpression__IdentifierAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getIdentifierAssignment_5()); 

                    }

                    // InternalSCH.g:550:3: ( ( rule__TerminalExpression__IdentifierAssignment_5 )* )
                    // InternalSCH.g:551:4: ( rule__TerminalExpression__IdentifierAssignment_5 )*
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getIdentifierAssignment_5()); 
                    // InternalSCH.g:552:4: ( rule__TerminalExpression__IdentifierAssignment_5 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSCH.g:552:5: rule__TerminalExpression__IdentifierAssignment_5
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__TerminalExpression__IdentifierAssignment_5();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getTerminalExpressionAccess().getIdentifierAssignment_5()); 

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalSCH.g:557:2: ( ( ( rule__TerminalExpression__BoolAssignment_6 ) ) ( ( rule__TerminalExpression__BoolAssignment_6 )* ) )
                    {
                    // InternalSCH.g:557:2: ( ( ( rule__TerminalExpression__BoolAssignment_6 ) ) ( ( rule__TerminalExpression__BoolAssignment_6 )* ) )
                    // InternalSCH.g:558:3: ( ( rule__TerminalExpression__BoolAssignment_6 ) ) ( ( rule__TerminalExpression__BoolAssignment_6 )* )
                    {
                    // InternalSCH.g:558:3: ( ( rule__TerminalExpression__BoolAssignment_6 ) )
                    // InternalSCH.g:559:4: ( rule__TerminalExpression__BoolAssignment_6 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getBoolAssignment_6()); 
                    // InternalSCH.g:560:4: ( rule__TerminalExpression__BoolAssignment_6 )
                    // InternalSCH.g:560:5: rule__TerminalExpression__BoolAssignment_6
                    {
                    pushFollow(FOLLOW_6);
                    rule__TerminalExpression__BoolAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getBoolAssignment_6()); 

                    }

                    // InternalSCH.g:563:3: ( ( rule__TerminalExpression__BoolAssignment_6 )* )
                    // InternalSCH.g:564:4: ( rule__TerminalExpression__BoolAssignment_6 )*
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getBoolAssignment_6()); 
                    // InternalSCH.g:565:4: ( rule__TerminalExpression__BoolAssignment_6 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==12) ) {
                            alt4=1;
                        }
                        else if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSCH.g:565:5: rule__TerminalExpression__BoolAssignment_6
                    	    {
                    	    pushFollow(FOLLOW_6);
                    	    rule__TerminalExpression__BoolAssignment_6();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                     after(grammarAccess.getTerminalExpressionAccess().getBoolAssignment_6()); 

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalSCH.g:570:2: ( ( rule__TerminalExpression__StrAssignment_7 ) )
                    {
                    // InternalSCH.g:570:2: ( ( rule__TerminalExpression__StrAssignment_7 ) )
                    // InternalSCH.g:571:3: ( rule__TerminalExpression__StrAssignment_7 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getStrAssignment_7()); 
                    // InternalSCH.g:572:3: ( rule__TerminalExpression__StrAssignment_7 )
                    // InternalSCH.g:572:4: rule__TerminalExpression__StrAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__StrAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getStrAssignment_7()); 

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


    // $ANTLR start "rule__Bool__Alternatives"
    // InternalSCH.g:580:1: rule__Bool__Alternatives : ( ( '#t' ) | ( '#f' ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:584:1: ( ( '#t' ) | ( '#f' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSCH.g:585:2: ( '#t' )
                    {
                    // InternalSCH.g:585:2: ( '#t' )
                    // InternalSCH.g:586:3: '#t'
                    {
                     before(grammarAccess.getBoolAccess().getTKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:591:2: ( '#f' )
                    {
                    // InternalSCH.g:591:2: ( '#f' )
                    // InternalSCH.g:592:3: '#f'
                    {
                     before(grammarAccess.getBoolAccess().getFKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getFKeyword_1()); 

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
    // $ANTLR end "rule__Bool__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalSCH.g:601:1: rule__Operator__Alternatives : ( ( ruleDivide ) | ( ruleMultiply ) | ( ruleAdd ) | ( ruleSubtract ) | ( ruleEqual ) | ( ruleMoreOrEqual ) | ( ruleLessOrEqual ) | ( ruleDifferent ) | ( ruleMore ) | ( ruleLess ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:605:1: ( ( ruleDivide ) | ( ruleMultiply ) | ( ruleAdd ) | ( ruleSubtract ) | ( ruleEqual ) | ( ruleMoreOrEqual ) | ( ruleLessOrEqual ) | ( ruleDifferent ) | ( ruleMore ) | ( ruleLess ) )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            case 20:
                {
                alt7=6;
                }
                break;
            case 21:
                {
                alt7=7;
                }
                break;
            case 22:
                {
                alt7=8;
                }
                break;
            case 23:
                {
                alt7=9;
                }
                break;
            case 24:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSCH.g:606:2: ( ruleDivide )
                    {
                    // InternalSCH.g:606:2: ( ruleDivide )
                    // InternalSCH.g:607:3: ruleDivide
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
                    // InternalSCH.g:612:2: ( ruleMultiply )
                    {
                    // InternalSCH.g:612:2: ( ruleMultiply )
                    // InternalSCH.g:613:3: ruleMultiply
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
                    // InternalSCH.g:618:2: ( ruleAdd )
                    {
                    // InternalSCH.g:618:2: ( ruleAdd )
                    // InternalSCH.g:619:3: ruleAdd
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
                    // InternalSCH.g:624:2: ( ruleSubtract )
                    {
                    // InternalSCH.g:624:2: ( ruleSubtract )
                    // InternalSCH.g:625:3: ruleSubtract
                    {
                     before(grammarAccess.getOperatorAccess().getSubtractParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSubtract();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getSubtractParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSCH.g:630:2: ( ruleEqual )
                    {
                    // InternalSCH.g:630:2: ( ruleEqual )
                    // InternalSCH.g:631:3: ruleEqual
                    {
                     before(grammarAccess.getOperatorAccess().getEqualParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEqual();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getEqualParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSCH.g:636:2: ( ruleMoreOrEqual )
                    {
                    // InternalSCH.g:636:2: ( ruleMoreOrEqual )
                    // InternalSCH.g:637:3: ruleMoreOrEqual
                    {
                     before(grammarAccess.getOperatorAccess().getMoreOrEqualParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleMoreOrEqual();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getMoreOrEqualParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSCH.g:642:2: ( ruleLessOrEqual )
                    {
                    // InternalSCH.g:642:2: ( ruleLessOrEqual )
                    // InternalSCH.g:643:3: ruleLessOrEqual
                    {
                     before(grammarAccess.getOperatorAccess().getLessOrEqualParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleLessOrEqual();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getLessOrEqualParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSCH.g:648:2: ( ruleDifferent )
                    {
                    // InternalSCH.g:648:2: ( ruleDifferent )
                    // InternalSCH.g:649:3: ruleDifferent
                    {
                     before(grammarAccess.getOperatorAccess().getDifferentParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleDifferent();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getDifferentParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSCH.g:654:2: ( ruleMore )
                    {
                    // InternalSCH.g:654:2: ( ruleMore )
                    // InternalSCH.g:655:3: ruleMore
                    {
                     before(grammarAccess.getOperatorAccess().getMoreParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleMore();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getMoreParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSCH.g:660:2: ( ruleLess )
                    {
                    // InternalSCH.g:660:2: ( ruleLess )
                    // InternalSCH.g:661:3: ruleLess
                    {
                     before(grammarAccess.getOperatorAccess().getLessParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleLess();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getLessParserRuleCall_9()); 

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
    // InternalSCH.g:670:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:674:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalSCH.g:675:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSCH.g:682:1: rule__TerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:686:1: ( ( '(' ) )
            // InternalSCH.g:687:1: ( '(' )
            {
            // InternalSCH.g:687:1: ( '(' )
            // InternalSCH.g:688:2: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSCH.g:697:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:701:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // InternalSCH.g:702:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSCH.g:709:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:713:1: ( ( ruleExpression ) )
            // InternalSCH.g:714:1: ( ruleExpression )
            {
            // InternalSCH.g:714:1: ( ruleExpression )
            // InternalSCH.g:715:2: ruleExpression
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
    // InternalSCH.g:724:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:728:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // InternalSCH.g:729:2: rule__TerminalExpression__Group_0__2__Impl
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
    // InternalSCH.g:735:1: rule__TerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:739:1: ( ( ')' ) )
            // InternalSCH.g:740:1: ( ')' )
            {
            // InternalSCH.g:740:1: ( ')' )
            // InternalSCH.g:741:2: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSCH.g:751:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:755:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalSCH.g:756:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSCH.g:763:1: rule__TerminalExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:767:1: ( ( '(' ) )
            // InternalSCH.g:768:1: ( '(' )
            {
            // InternalSCH.g:768:1: ( '(' )
            // InternalSCH.g:769:2: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSCH.g:778:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl rule__TerminalExpression__Group_1__2 ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:782:1: ( rule__TerminalExpression__Group_1__1__Impl rule__TerminalExpression__Group_1__2 )
            // InternalSCH.g:783:2: rule__TerminalExpression__Group_1__1__Impl rule__TerminalExpression__Group_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSCH.g:790:1: rule__TerminalExpression__Group_1__1__Impl : ( ruleDefine ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:794:1: ( ( ruleDefine ) )
            // InternalSCH.g:795:1: ( ruleDefine )
            {
            // InternalSCH.g:795:1: ( ruleDefine )
            // InternalSCH.g:796:2: ruleDefine
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
    // InternalSCH.g:805:1: rule__TerminalExpression__Group_1__2 : rule__TerminalExpression__Group_1__2__Impl ;
    public final void rule__TerminalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:809:1: ( rule__TerminalExpression__Group_1__2__Impl )
            // InternalSCH.g:810:2: rule__TerminalExpression__Group_1__2__Impl
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
    // InternalSCH.g:816:1: rule__TerminalExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:820:1: ( ( ')' ) )
            // InternalSCH.g:821:1: ( ')' )
            {
            // InternalSCH.g:821:1: ( ')' )
            // InternalSCH.g:822:2: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__TerminalExpression__Group_2__0"
    // InternalSCH.g:832:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:836:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalSCH.g:837:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__TerminalExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_2__0"


    // $ANTLR start "rule__TerminalExpression__Group_2__0__Impl"
    // InternalSCH.g:844:1: rule__TerminalExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:848:1: ( ( '(' ) )
            // InternalSCH.g:849:1: ( '(' )
            {
            // InternalSCH.g:849:1: ( '(' )
            // InternalSCH.g:850:2: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__1"
    // InternalSCH.g:859:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2 ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:863:1: ( rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2 )
            // InternalSCH.g:864:2: rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__TerminalExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__2();

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
    // $ANTLR end "rule__TerminalExpression__Group_2__1"


    // $ANTLR start "rule__TerminalExpression__Group_2__1__Impl"
    // InternalSCH.g:871:1: rule__TerminalExpression__Group_2__1__Impl : ( ruleLambda ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:875:1: ( ( ruleLambda ) )
            // InternalSCH.g:876:1: ( ruleLambda )
            {
            // InternalSCH.g:876:1: ( ruleLambda )
            // InternalSCH.g:877:2: ruleLambda
            {
             before(grammarAccess.getTerminalExpressionAccess().getLambdaParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getLambdaParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__2"
    // InternalSCH.g:886:1: rule__TerminalExpression__Group_2__2 : rule__TerminalExpression__Group_2__2__Impl ;
    public final void rule__TerminalExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:890:1: ( rule__TerminalExpression__Group_2__2__Impl )
            // InternalSCH.g:891:2: rule__TerminalExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__2__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_2__2"


    // $ANTLR start "rule__TerminalExpression__Group_2__2__Impl"
    // InternalSCH.g:897:1: rule__TerminalExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:901:1: ( ( ')' ) )
            // InternalSCH.g:902:1: ( ')' )
            {
            // InternalSCH.g:902:1: ( ')' )
            // InternalSCH.g:903:2: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_2__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__0"
    // InternalSCH.g:913:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:917:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalSCH.g:918:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__TerminalExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_3__0"


    // $ANTLR start "rule__TerminalExpression__Group_3__0__Impl"
    // InternalSCH.g:925:1: rule__TerminalExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:929:1: ( ( '(' ) )
            // InternalSCH.g:930:1: ( '(' )
            {
            // InternalSCH.g:930:1: ( '(' )
            // InternalSCH.g:931:2: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__1"
    // InternalSCH.g:940:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2 ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:944:1: ( rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2 )
            // InternalSCH.g:945:2: rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__TerminalExpression__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__2();

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
    // $ANTLR end "rule__TerminalExpression__Group_3__1"


    // $ANTLR start "rule__TerminalExpression__Group_3__1__Impl"
    // InternalSCH.g:952:1: rule__TerminalExpression__Group_3__1__Impl : ( ruleIf ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:956:1: ( ( ruleIf ) )
            // InternalSCH.g:957:1: ( ruleIf )
            {
            // InternalSCH.g:957:1: ( ruleIf )
            // InternalSCH.g:958:2: ruleIf
            {
             before(grammarAccess.getTerminalExpressionAccess().getIfParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getIfParserRuleCall_3_1()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__2"
    // InternalSCH.g:967:1: rule__TerminalExpression__Group_3__2 : rule__TerminalExpression__Group_3__2__Impl ;
    public final void rule__TerminalExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:971:1: ( rule__TerminalExpression__Group_3__2__Impl )
            // InternalSCH.g:972:2: rule__TerminalExpression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__2__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_3__2"


    // $ANTLR start "rule__TerminalExpression__Group_3__2__Impl"
    // InternalSCH.g:978:1: rule__TerminalExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:982:1: ( ( ')' ) )
            // InternalSCH.g:983:1: ( ')' )
            {
            // InternalSCH.g:983:1: ( ')' )
            // InternalSCH.g:984:2: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_3__2__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalSCH.g:994:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:998:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalSCH.g:999:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSCH.g:1006:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__OpAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1010:1: ( ( ( rule__Expression__OpAssignment_0 ) ) )
            // InternalSCH.g:1011:1: ( ( rule__Expression__OpAssignment_0 ) )
            {
            // InternalSCH.g:1011:1: ( ( rule__Expression__OpAssignment_0 ) )
            // InternalSCH.g:1012:2: ( rule__Expression__OpAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_0()); 
            // InternalSCH.g:1013:2: ( rule__Expression__OpAssignment_0 )
            // InternalSCH.g:1013:3: rule__Expression__OpAssignment_0
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
    // InternalSCH.g:1021:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1025:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalSCH.g:1026:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSCH.g:1033:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__LeftAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1037:1: ( ( ( rule__Expression__LeftAssignment_1 ) ) )
            // InternalSCH.g:1038:1: ( ( rule__Expression__LeftAssignment_1 ) )
            {
            // InternalSCH.g:1038:1: ( ( rule__Expression__LeftAssignment_1 ) )
            // InternalSCH.g:1039:2: ( rule__Expression__LeftAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_1()); 
            // InternalSCH.g:1040:2: ( rule__Expression__LeftAssignment_1 )
            // InternalSCH.g:1040:3: rule__Expression__LeftAssignment_1
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
    // InternalSCH.g:1048:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1052:1: ( rule__Expression__Group__2__Impl )
            // InternalSCH.g:1053:2: rule__Expression__Group__2__Impl
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
    // InternalSCH.g:1059:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__RightAssignment_2 )* ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1063:1: ( ( ( rule__Expression__RightAssignment_2 )* ) )
            // InternalSCH.g:1064:1: ( ( rule__Expression__RightAssignment_2 )* )
            {
            // InternalSCH.g:1064:1: ( ( rule__Expression__RightAssignment_2 )* )
            // InternalSCH.g:1065:2: ( rule__Expression__RightAssignment_2 )*
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_2()); 
            // InternalSCH.g:1066:2: ( rule__Expression__RightAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_STRING)||(LA8_0>=12 && LA8_0<=14)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSCH.g:1066:3: rule__Expression__RightAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Expression__RightAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSCH.g:1075:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1079:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // InternalSCH.g:1080:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSCH.g:1087:1: rule__Define__Group__0__Impl : ( 'define' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1091:1: ( ( 'define' ) )
            // InternalSCH.g:1092:1: ( 'define' )
            {
            // InternalSCH.g:1092:1: ( 'define' )
            // InternalSCH.g:1093:2: 'define'
            {
             before(grammarAccess.getDefineAccess().getDefineKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSCH.g:1102:1: rule__Define__Group__1 : rule__Define__Group__1__Impl rule__Define__Group__2 ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1106:1: ( rule__Define__Group__1__Impl rule__Define__Group__2 )
            // InternalSCH.g:1107:2: rule__Define__Group__1__Impl rule__Define__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSCH.g:1114:1: rule__Define__Group__1__Impl : ( ( rule__Define__IdAssignment_1 ) ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1118:1: ( ( ( rule__Define__IdAssignment_1 ) ) )
            // InternalSCH.g:1119:1: ( ( rule__Define__IdAssignment_1 ) )
            {
            // InternalSCH.g:1119:1: ( ( rule__Define__IdAssignment_1 ) )
            // InternalSCH.g:1120:2: ( rule__Define__IdAssignment_1 )
            {
             before(grammarAccess.getDefineAccess().getIdAssignment_1()); 
            // InternalSCH.g:1121:2: ( rule__Define__IdAssignment_1 )
            // InternalSCH.g:1121:3: rule__Define__IdAssignment_1
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
    // InternalSCH.g:1129:1: rule__Define__Group__2 : rule__Define__Group__2__Impl ;
    public final void rule__Define__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1133:1: ( rule__Define__Group__2__Impl )
            // InternalSCH.g:1134:2: rule__Define__Group__2__Impl
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
    // InternalSCH.g:1140:1: rule__Define__Group__2__Impl : ( ( rule__Define__ExAssignment_2 )* ) ;
    public final void rule__Define__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1144:1: ( ( ( rule__Define__ExAssignment_2 )* ) )
            // InternalSCH.g:1145:1: ( ( rule__Define__ExAssignment_2 )* )
            {
            // InternalSCH.g:1145:1: ( ( rule__Define__ExAssignment_2 )* )
            // InternalSCH.g:1146:2: ( rule__Define__ExAssignment_2 )*
            {
             before(grammarAccess.getDefineAccess().getExAssignment_2()); 
            // InternalSCH.g:1147:2: ( rule__Define__ExAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)||(LA9_0>=12 && LA9_0<=14)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSCH.g:1147:3: rule__Define__ExAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Define__ExAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "rule__Lambda__Group__0"
    // InternalSCH.g:1156:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1160:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalSCH.g:1161:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Lambda__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__1();

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
    // $ANTLR end "rule__Lambda__Group__0"


    // $ANTLR start "rule__Lambda__Group__0__Impl"
    // InternalSCH.g:1168:1: rule__Lambda__Group__0__Impl : ( 'lambda' ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1172:1: ( ( 'lambda' ) )
            // InternalSCH.g:1173:1: ( 'lambda' )
            {
            // InternalSCH.g:1173:1: ( 'lambda' )
            // InternalSCH.g:1174:2: 'lambda'
            {
             before(grammarAccess.getLambdaAccess().getLambdaKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLambdaKeyword_0()); 

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
    // $ANTLR end "rule__Lambda__Group__0__Impl"


    // $ANTLR start "rule__Lambda__Group__1"
    // InternalSCH.g:1183:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1187:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalSCH.g:1188:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Lambda__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__2();

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
    // $ANTLR end "rule__Lambda__Group__1"


    // $ANTLR start "rule__Lambda__Group__1__Impl"
    // InternalSCH.g:1195:1: rule__Lambda__Group__1__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1199:1: ( ( '(' ) )
            // InternalSCH.g:1200:1: ( '(' )
            {
            // InternalSCH.g:1200:1: ( '(' )
            // InternalSCH.g:1201:2: '('
            {
             before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Lambda__Group__1__Impl"


    // $ANTLR start "rule__Lambda__Group__2"
    // InternalSCH.g:1210:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1214:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalSCH.g:1215:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Lambda__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__3();

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
    // $ANTLR end "rule__Lambda__Group__2"


    // $ANTLR start "rule__Lambda__Group__2__Impl"
    // InternalSCH.g:1222:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__OuputAssignment_2 )* ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1226:1: ( ( ( rule__Lambda__OuputAssignment_2 )* ) )
            // InternalSCH.g:1227:1: ( ( rule__Lambda__OuputAssignment_2 )* )
            {
            // InternalSCH.g:1227:1: ( ( rule__Lambda__OuputAssignment_2 )* )
            // InternalSCH.g:1228:2: ( rule__Lambda__OuputAssignment_2 )*
            {
             before(grammarAccess.getLambdaAccess().getOuputAssignment_2()); 
            // InternalSCH.g:1229:2: ( rule__Lambda__OuputAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSCH.g:1229:3: rule__Lambda__OuputAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Lambda__OuputAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLambdaAccess().getOuputAssignment_2()); 

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
    // $ANTLR end "rule__Lambda__Group__2__Impl"


    // $ANTLR start "rule__Lambda__Group__3"
    // InternalSCH.g:1237:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1241:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalSCH.g:1242:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Lambda__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__4();

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
    // $ANTLR end "rule__Lambda__Group__3"


    // $ANTLR start "rule__Lambda__Group__3__Impl"
    // InternalSCH.g:1249:1: rule__Lambda__Group__3__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1253:1: ( ( ')' ) )
            // InternalSCH.g:1254:1: ( ')' )
            {
            // InternalSCH.g:1254:1: ( ')' )
            // InternalSCH.g:1255:2: ')'
            {
             before(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Lambda__Group__3__Impl"


    // $ANTLR start "rule__Lambda__Group__4"
    // InternalSCH.g:1264:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1268:1: ( rule__Lambda__Group__4__Impl )
            // InternalSCH.g:1269:2: rule__Lambda__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__4__Impl();

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
    // $ANTLR end "rule__Lambda__Group__4"


    // $ANTLR start "rule__Lambda__Group__4__Impl"
    // InternalSCH.g:1275:1: rule__Lambda__Group__4__Impl : ( ( rule__Lambda__ExAssignment_4 ) ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1279:1: ( ( ( rule__Lambda__ExAssignment_4 ) ) )
            // InternalSCH.g:1280:1: ( ( rule__Lambda__ExAssignment_4 ) )
            {
            // InternalSCH.g:1280:1: ( ( rule__Lambda__ExAssignment_4 ) )
            // InternalSCH.g:1281:2: ( rule__Lambda__ExAssignment_4 )
            {
             before(grammarAccess.getLambdaAccess().getExAssignment_4()); 
            // InternalSCH.g:1282:2: ( rule__Lambda__ExAssignment_4 )
            // InternalSCH.g:1282:3: rule__Lambda__ExAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__ExAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getExAssignment_4()); 

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
    // $ANTLR end "rule__Lambda__Group__4__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalSCH.g:1291:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1295:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalSCH.g:1296:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__1();

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
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalSCH.g:1303:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1307:1: ( ( 'if' ) )
            // InternalSCH.g:1308:1: ( 'if' )
            {
            // InternalSCH.g:1308:1: ( 'if' )
            // InternalSCH.g:1309:2: 'if'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalSCH.g:1318:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1322:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalSCH.g:1323:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__2();

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
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalSCH.g:1330:1: rule__If__Group__1__Impl : ( ( rule__If__LogicExAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1334:1: ( ( ( rule__If__LogicExAssignment_1 ) ) )
            // InternalSCH.g:1335:1: ( ( rule__If__LogicExAssignment_1 ) )
            {
            // InternalSCH.g:1335:1: ( ( rule__If__LogicExAssignment_1 ) )
            // InternalSCH.g:1336:2: ( rule__If__LogicExAssignment_1 )
            {
             before(grammarAccess.getIfAccess().getLogicExAssignment_1()); 
            // InternalSCH.g:1337:2: ( rule__If__LogicExAssignment_1 )
            // InternalSCH.g:1337:3: rule__If__LogicExAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__If__LogicExAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getLogicExAssignment_1()); 

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
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalSCH.g:1345:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1349:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalSCH.g:1350:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__3();

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
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalSCH.g:1357:1: rule__If__Group__2__Impl : ( ( rule__If__TrueExAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1361:1: ( ( ( rule__If__TrueExAssignment_2 ) ) )
            // InternalSCH.g:1362:1: ( ( rule__If__TrueExAssignment_2 ) )
            {
            // InternalSCH.g:1362:1: ( ( rule__If__TrueExAssignment_2 ) )
            // InternalSCH.g:1363:2: ( rule__If__TrueExAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getTrueExAssignment_2()); 
            // InternalSCH.g:1364:2: ( rule__If__TrueExAssignment_2 )
            // InternalSCH.g:1364:3: rule__If__TrueExAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__TrueExAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getTrueExAssignment_2()); 

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
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalSCH.g:1372:1: rule__If__Group__3 : rule__If__Group__3__Impl ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1376:1: ( rule__If__Group__3__Impl )
            // InternalSCH.g:1377:2: rule__If__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__3__Impl();

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
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalSCH.g:1383:1: rule__If__Group__3__Impl : ( ( rule__If__FalseExAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1387:1: ( ( ( rule__If__FalseExAssignment_3 ) ) )
            // InternalSCH.g:1388:1: ( ( rule__If__FalseExAssignment_3 ) )
            {
            // InternalSCH.g:1388:1: ( ( rule__If__FalseExAssignment_3 ) )
            // InternalSCH.g:1389:2: ( rule__If__FalseExAssignment_3 )
            {
             before(grammarAccess.getIfAccess().getFalseExAssignment_3()); 
            // InternalSCH.g:1390:2: ( rule__If__FalseExAssignment_3 )
            // InternalSCH.g:1390:3: rule__If__FalseExAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__If__FalseExAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getFalseExAssignment_3()); 

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
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__Model__ExpressionsAssignment"
    // InternalSCH.g:1399:1: rule__Model__ExpressionsAssignment : ( ruleTerminalExpression ) ;
    public final void rule__Model__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1403:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:1404:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:1404:2: ( ruleTerminalExpression )
            // InternalSCH.g:1405:3: ruleTerminalExpression
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


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_4"
    // InternalSCH.g:1414:1: rule__TerminalExpression__ValueAssignment_4 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1418:1: ( ( RULE_INT ) )
            // InternalSCH.g:1419:2: ( RULE_INT )
            {
            // InternalSCH.g:1419:2: ( RULE_INT )
            // InternalSCH.g:1420:3: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_4"


    // $ANTLR start "rule__TerminalExpression__IdentifierAssignment_5"
    // InternalSCH.g:1429:1: rule__TerminalExpression__IdentifierAssignment_5 : ( RULE_ID ) ;
    public final void rule__TerminalExpression__IdentifierAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1433:1: ( ( RULE_ID ) )
            // InternalSCH.g:1434:2: ( RULE_ID )
            {
            // InternalSCH.g:1434:2: ( RULE_ID )
            // InternalSCH.g:1435:3: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getIdentifierIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getIdentifierIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__TerminalExpression__IdentifierAssignment_5"


    // $ANTLR start "rule__TerminalExpression__BoolAssignment_6"
    // InternalSCH.g:1444:1: rule__TerminalExpression__BoolAssignment_6 : ( ruleBool ) ;
    public final void rule__TerminalExpression__BoolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1448:1: ( ( ruleBool ) )
            // InternalSCH.g:1449:2: ( ruleBool )
            {
            // InternalSCH.g:1449:2: ( ruleBool )
            // InternalSCH.g:1450:3: ruleBool
            {
             before(grammarAccess.getTerminalExpressionAccess().getBoolBoolParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getBoolBoolParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__TerminalExpression__BoolAssignment_6"


    // $ANTLR start "rule__TerminalExpression__StrAssignment_7"
    // InternalSCH.g:1459:1: rule__TerminalExpression__StrAssignment_7 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__StrAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1463:1: ( ( RULE_STRING ) )
            // InternalSCH.g:1464:2: ( RULE_STRING )
            {
            // InternalSCH.g:1464:2: ( RULE_STRING )
            // InternalSCH.g:1465:3: RULE_STRING
            {
             before(grammarAccess.getTerminalExpressionAccess().getStrSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getStrSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__TerminalExpression__StrAssignment_7"


    // $ANTLR start "rule__Expression__OpAssignment_0"
    // InternalSCH.g:1474:1: rule__Expression__OpAssignment_0 : ( ruleOperator ) ;
    public final void rule__Expression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1478:1: ( ( ruleOperator ) )
            // InternalSCH.g:1479:2: ( ruleOperator )
            {
            // InternalSCH.g:1479:2: ( ruleOperator )
            // InternalSCH.g:1480:3: ruleOperator
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
    // InternalSCH.g:1489:1: rule__Expression__LeftAssignment_1 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1493:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:1494:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:1494:2: ( ruleTerminalExpression )
            // InternalSCH.g:1495:3: ruleTerminalExpression
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
    // InternalSCH.g:1504:1: rule__Expression__RightAssignment_2 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1508:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:1509:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:1509:2: ( ruleTerminalExpression )
            // InternalSCH.g:1510:3: ruleTerminalExpression
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
    // InternalSCH.g:1519:1: rule__Define__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Define__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1523:1: ( ( RULE_ID ) )
            // InternalSCH.g:1524:2: ( RULE_ID )
            {
            // InternalSCH.g:1524:2: ( RULE_ID )
            // InternalSCH.g:1525:3: RULE_ID
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
    // InternalSCH.g:1534:1: rule__Define__ExAssignment_2 : ( ruleTerminalExpression ) ;
    public final void rule__Define__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1538:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:1539:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:1539:2: ( ruleTerminalExpression )
            // InternalSCH.g:1540:3: ruleTerminalExpression
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


    // $ANTLR start "rule__Lambda__OuputAssignment_2"
    // InternalSCH.g:1549:1: rule__Lambda__OuputAssignment_2 : ( RULE_ID ) ;
    public final void rule__Lambda__OuputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1553:1: ( ( RULE_ID ) )
            // InternalSCH.g:1554:2: ( RULE_ID )
            {
            // InternalSCH.g:1554:2: ( RULE_ID )
            // InternalSCH.g:1555:3: RULE_ID
            {
             before(grammarAccess.getLambdaAccess().getOuputIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getOuputIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Lambda__OuputAssignment_2"


    // $ANTLR start "rule__Lambda__ExAssignment_4"
    // InternalSCH.g:1564:1: rule__Lambda__ExAssignment_4 : ( ruleTerminalExpression ) ;
    public final void rule__Lambda__ExAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1568:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:1569:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:1569:2: ( ruleTerminalExpression )
            // InternalSCH.g:1570:3: ruleTerminalExpression
            {
             before(grammarAccess.getLambdaAccess().getExTerminalExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getExTerminalExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Lambda__ExAssignment_4"


    // $ANTLR start "rule__If__LogicExAssignment_1"
    // InternalSCH.g:1579:1: rule__If__LogicExAssignment_1 : ( ruleTerminalExpression ) ;
    public final void rule__If__LogicExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1583:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:1584:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:1584:2: ( ruleTerminalExpression )
            // InternalSCH.g:1585:3: ruleTerminalExpression
            {
             before(grammarAccess.getIfAccess().getLogicExTerminalExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getLogicExTerminalExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__If__LogicExAssignment_1"


    // $ANTLR start "rule__If__TrueExAssignment_2"
    // InternalSCH.g:1594:1: rule__If__TrueExAssignment_2 : ( ruleTerminalExpression ) ;
    public final void rule__If__TrueExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1598:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:1599:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:1599:2: ( ruleTerminalExpression )
            // InternalSCH.g:1600:3: ruleTerminalExpression
            {
             before(grammarAccess.getIfAccess().getTrueExTerminalExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getTrueExTerminalExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__If__TrueExAssignment_2"


    // $ANTLR start "rule__If__FalseExAssignment_3"
    // InternalSCH.g:1609:1: rule__If__FalseExAssignment_3 : ( ruleTerminalExpression ) ;
    public final void rule__If__FalseExAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1613:1: ( ( ruleTerminalExpression ) )
            // InternalSCH.g:1614:2: ( ruleTerminalExpression )
            {
            // InternalSCH.g:1614:2: ( ruleTerminalExpression )
            // InternalSCH.g:1615:3: ruleTerminalExpression
            {
             before(grammarAccess.getIfAccess().getFalseExTerminalExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getFalseExTerminalExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__If__FalseExAssignment_3"


    // $ANTLR start "rule__Equal__EqualAssignment"
    // InternalSCH.g:1624:1: rule__Equal__EqualAssignment : ( ( '=' ) ) ;
    public final void rule__Equal__EqualAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1628:1: ( ( ( '=' ) ) )
            // InternalSCH.g:1629:2: ( ( '=' ) )
            {
            // InternalSCH.g:1629:2: ( ( '=' ) )
            // InternalSCH.g:1630:3: ( '=' )
            {
             before(grammarAccess.getEqualAccess().getEqualEqualsSignKeyword_0()); 
            // InternalSCH.g:1631:3: ( '=' )
            // InternalSCH.g:1632:4: '='
            {
             before(grammarAccess.getEqualAccess().getEqualEqualsSignKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getEqualEqualsSignKeyword_0()); 

            }

             after(grammarAccess.getEqualAccess().getEqualEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__Equal__EqualAssignment"


    // $ANTLR start "rule__MoreOrEqual__MoreOrEqualAssignment"
    // InternalSCH.g:1643:1: rule__MoreOrEqual__MoreOrEqualAssignment : ( ( '>=' ) ) ;
    public final void rule__MoreOrEqual__MoreOrEqualAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1647:1: ( ( ( '>=' ) ) )
            // InternalSCH.g:1648:2: ( ( '>=' ) )
            {
            // InternalSCH.g:1648:2: ( ( '>=' ) )
            // InternalSCH.g:1649:3: ( '>=' )
            {
             before(grammarAccess.getMoreOrEqualAccess().getMoreOrEqualGreaterThanSignEqualsSignKeyword_0()); 
            // InternalSCH.g:1650:3: ( '>=' )
            // InternalSCH.g:1651:4: '>='
            {
             before(grammarAccess.getMoreOrEqualAccess().getMoreOrEqualGreaterThanSignEqualsSignKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMoreOrEqualAccess().getMoreOrEqualGreaterThanSignEqualsSignKeyword_0()); 

            }

             after(grammarAccess.getMoreOrEqualAccess().getMoreOrEqualGreaterThanSignEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__MoreOrEqual__MoreOrEqualAssignment"


    // $ANTLR start "rule__LessOrEqual__LessOrEqualAssignment"
    // InternalSCH.g:1662:1: rule__LessOrEqual__LessOrEqualAssignment : ( ( '<=' ) ) ;
    public final void rule__LessOrEqual__LessOrEqualAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1666:1: ( ( ( '<=' ) ) )
            // InternalSCH.g:1667:2: ( ( '<=' ) )
            {
            // InternalSCH.g:1667:2: ( ( '<=' ) )
            // InternalSCH.g:1668:3: ( '<=' )
            {
             before(grammarAccess.getLessOrEqualAccess().getLessOrEqualLessThanSignEqualsSignKeyword_0()); 
            // InternalSCH.g:1669:3: ( '<=' )
            // InternalSCH.g:1670:4: '<='
            {
             before(grammarAccess.getLessOrEqualAccess().getLessOrEqualLessThanSignEqualsSignKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLessOrEqualAccess().getLessOrEqualLessThanSignEqualsSignKeyword_0()); 

            }

             after(grammarAccess.getLessOrEqualAccess().getLessOrEqualLessThanSignEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__LessOrEqual__LessOrEqualAssignment"


    // $ANTLR start "rule__Different__DifferentAssignment"
    // InternalSCH.g:1681:1: rule__Different__DifferentAssignment : ( ( '!=' ) ) ;
    public final void rule__Different__DifferentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1685:1: ( ( ( '!=' ) ) )
            // InternalSCH.g:1686:2: ( ( '!=' ) )
            {
            // InternalSCH.g:1686:2: ( ( '!=' ) )
            // InternalSCH.g:1687:3: ( '!=' )
            {
             before(grammarAccess.getDifferentAccess().getDifferentExclamationMarkEqualsSignKeyword_0()); 
            // InternalSCH.g:1688:3: ( '!=' )
            // InternalSCH.g:1689:4: '!='
            {
             before(grammarAccess.getDifferentAccess().getDifferentExclamationMarkEqualsSignKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDifferentAccess().getDifferentExclamationMarkEqualsSignKeyword_0()); 

            }

             after(grammarAccess.getDifferentAccess().getDifferentExclamationMarkEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__Different__DifferentAssignment"


    // $ANTLR start "rule__More__MoreAssignment"
    // InternalSCH.g:1700:1: rule__More__MoreAssignment : ( ( '>' ) ) ;
    public final void rule__More__MoreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1704:1: ( ( ( '>' ) ) )
            // InternalSCH.g:1705:2: ( ( '>' ) )
            {
            // InternalSCH.g:1705:2: ( ( '>' ) )
            // InternalSCH.g:1706:3: ( '>' )
            {
             before(grammarAccess.getMoreAccess().getMoreGreaterThanSignKeyword_0()); 
            // InternalSCH.g:1707:3: ( '>' )
            // InternalSCH.g:1708:4: '>'
            {
             before(grammarAccess.getMoreAccess().getMoreGreaterThanSignKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMoreAccess().getMoreGreaterThanSignKeyword_0()); 

            }

             after(grammarAccess.getMoreAccess().getMoreGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__More__MoreAssignment"


    // $ANTLR start "rule__Less__LessAssignment"
    // InternalSCH.g:1719:1: rule__Less__LessAssignment : ( ( '<' ) ) ;
    public final void rule__Less__LessAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1723:1: ( ( ( '<' ) ) )
            // InternalSCH.g:1724:2: ( ( '<' ) )
            {
            // InternalSCH.g:1724:2: ( ( '<' ) )
            // InternalSCH.g:1725:3: ( '<' )
            {
             before(grammarAccess.getLessAccess().getLessLessThanSignKeyword_0()); 
            // InternalSCH.g:1726:3: ( '<' )
            // InternalSCH.g:1727:4: '<'
            {
             before(grammarAccess.getLessAccess().getLessLessThanSignKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLessAccess().getLessLessThanSignKeyword_0()); 

            }

             after(grammarAccess.getLessAccess().getLessLessThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Less__LessAssignment"


    // $ANTLR start "rule__Subtract__MinusAssignment"
    // InternalSCH.g:1738:1: rule__Subtract__MinusAssignment : ( ( '-' ) ) ;
    public final void rule__Subtract__MinusAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1742:1: ( ( ( '-' ) ) )
            // InternalSCH.g:1743:2: ( ( '-' ) )
            {
            // InternalSCH.g:1743:2: ( ( '-' ) )
            // InternalSCH.g:1744:3: ( '-' )
            {
             before(grammarAccess.getSubtractAccess().getMinusHyphenMinusKeyword_0()); 
            // InternalSCH.g:1745:3: ( '-' )
            // InternalSCH.g:1746:4: '-'
            {
             before(grammarAccess.getSubtractAccess().getMinusHyphenMinusKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSCH.g:1757:1: rule__Add__PlusAssignment : ( ( '+' ) ) ;
    public final void rule__Add__PlusAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1761:1: ( ( ( '+' ) ) )
            // InternalSCH.g:1762:2: ( ( '+' ) )
            {
            // InternalSCH.g:1762:2: ( ( '+' ) )
            // InternalSCH.g:1763:3: ( '+' )
            {
             before(grammarAccess.getAddAccess().getPlusPlusSignKeyword_0()); 
            // InternalSCH.g:1764:3: ( '+' )
            // InternalSCH.g:1765:4: '+'
            {
             before(grammarAccess.getAddAccess().getPlusPlusSignKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSCH.g:1776:1: rule__Multiply__TimesAssignment : ( ( '*' ) ) ;
    public final void rule__Multiply__TimesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1780:1: ( ( ( '*' ) ) )
            // InternalSCH.g:1781:2: ( ( '*' ) )
            {
            // InternalSCH.g:1781:2: ( ( '*' ) )
            // InternalSCH.g:1782:3: ( '*' )
            {
             before(grammarAccess.getMultiplyAccess().getTimesAsteriskKeyword_0()); 
            // InternalSCH.g:1783:3: ( '*' )
            // InternalSCH.g:1784:4: '*'
            {
             before(grammarAccess.getMultiplyAccess().getTimesAsteriskKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSCH.g:1795:1: rule__Divide__DivededAssignment : ( ( '/' ) ) ;
    public final void rule__Divide__DivededAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:1799:1: ( ( ( '/' ) ) )
            // InternalSCH.g:1800:2: ( ( '/' ) )
            {
            // InternalSCH.g:1800:2: ( ( '/' ) )
            // InternalSCH.g:1801:3: ( '/' )
            {
             before(grammarAccess.getDivideAccess().getDivededSolidusKeyword_0()); 
            // InternalSCH.g:1802:3: ( '/' )
            // InternalSCH.g:1803:4: '/'
            {
             before(grammarAccess.getDivideAccess().getDivededSolidusKeyword_0()); 
            match(input,28,FOLLOW_2); 
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


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\20\10\uffff";
    static final String dfa_3s = "\1\16\1\34\10\uffff";
    static final String dfa_4s = "\2\uffff\1\5\1\6\1\7\1\10\1\2\1\3\1\4\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\5\5\uffff\2\4\1\1",
            "\1\6\1\7\1\10\12\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "502:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( ( rule__TerminalExpression__ValueAssignment_4 ) ) ( ( rule__TerminalExpression__ValueAssignment_4 )* ) ) | ( ( ( rule__TerminalExpression__IdentifierAssignment_5 ) ) ( ( rule__TerminalExpression__IdentifierAssignment_5 )* ) ) | ( ( ( rule__TerminalExpression__BoolAssignment_6 ) ) ( ( rule__TerminalExpression__BoolAssignment_6 )* ) ) | ( ( rule__TerminalExpression__StrAssignment_7 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000007072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001FF80000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008020L});

}