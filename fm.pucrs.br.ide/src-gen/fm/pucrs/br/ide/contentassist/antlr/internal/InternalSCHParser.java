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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_DOUBLE=6;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=9;
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



    // $ANTLR start "entryRuleProgram"
    // InternalSCH.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalSCH.g:54:1: ( ruleProgram EOF )
            // InternalSCH.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSCH.g:62:1: ruleProgram : ( ( ( rule__Program__ExpressionsAssignment ) ) ( ( rule__Program__ExpressionsAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:66:2: ( ( ( ( rule__Program__ExpressionsAssignment ) ) ( ( rule__Program__ExpressionsAssignment )* ) ) )
            // InternalSCH.g:67:2: ( ( ( rule__Program__ExpressionsAssignment ) ) ( ( rule__Program__ExpressionsAssignment )* ) )
            {
            // InternalSCH.g:67:2: ( ( ( rule__Program__ExpressionsAssignment ) ) ( ( rule__Program__ExpressionsAssignment )* ) )
            // InternalSCH.g:68:3: ( ( rule__Program__ExpressionsAssignment ) ) ( ( rule__Program__ExpressionsAssignment )* )
            {
            // InternalSCH.g:68:3: ( ( rule__Program__ExpressionsAssignment ) )
            // InternalSCH.g:69:4: ( rule__Program__ExpressionsAssignment )
            {
             before(grammarAccess.getProgramAccess().getExpressionsAssignment()); 
            // InternalSCH.g:70:4: ( rule__Program__ExpressionsAssignment )
            // InternalSCH.g:70:5: rule__Program__ExpressionsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__ExpressionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getExpressionsAssignment()); 

            }

            // InternalSCH.g:73:3: ( ( rule__Program__ExpressionsAssignment )* )
            // InternalSCH.g:74:4: ( rule__Program__ExpressionsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getExpressionsAssignment()); 
            // InternalSCH.g:75:4: ( rule__Program__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSCH.g:75:5: rule__Program__ExpressionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__ExpressionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getExpressionsAssignment()); 

            }


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExpression"
    // InternalSCH.g:85:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSCH.g:86:1: ( ruleExpression EOF )
            // InternalSCH.g:87:1: ruleExpression EOF
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
    // InternalSCH.g:94:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:98:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalSCH.g:99:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalSCH.g:99:2: ( ( rule__Expression__Alternatives ) )
            // InternalSCH.g:100:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalSCH.g:101:3: ( rule__Expression__Alternatives )
            // InternalSCH.g:101:4: rule__Expression__Alternatives
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


    // $ANTLR start "entryRuleAtom"
    // InternalSCH.g:110:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalSCH.g:111:1: ( ruleAtom EOF )
            // InternalSCH.g:112:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSCH.g:119:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:123:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalSCH.g:124:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalSCH.g:124:2: ( ( rule__Atom__Alternatives ) )
            // InternalSCH.g:125:3: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // InternalSCH.g:126:3: ( rule__Atom__Alternatives )
            // InternalSCH.g:126:4: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleIDexp"
    // InternalSCH.g:135:1: entryRuleIDexp : ruleIDexp EOF ;
    public final void entryRuleIDexp() throws RecognitionException {
        try {
            // InternalSCH.g:136:1: ( ruleIDexp EOF )
            // InternalSCH.g:137:1: ruleIDexp EOF
            {
             before(grammarAccess.getIDexpRule()); 
            pushFollow(FOLLOW_1);
            ruleIDexp();

            state._fsp--;

             after(grammarAccess.getIDexpRule()); 
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
    // $ANTLR end "entryRuleIDexp"


    // $ANTLR start "ruleIDexp"
    // InternalSCH.g:144:1: ruleIDexp : ( ( rule__IDexp__NameAssignment ) ) ;
    public final void ruleIDexp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:148:2: ( ( ( rule__IDexp__NameAssignment ) ) )
            // InternalSCH.g:149:2: ( ( rule__IDexp__NameAssignment ) )
            {
            // InternalSCH.g:149:2: ( ( rule__IDexp__NameAssignment ) )
            // InternalSCH.g:150:3: ( rule__IDexp__NameAssignment )
            {
             before(grammarAccess.getIDexpAccess().getNameAssignment()); 
            // InternalSCH.g:151:3: ( rule__IDexp__NameAssignment )
            // InternalSCH.g:151:4: rule__IDexp__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IDexp__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIDexpAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleIDexp"


    // $ANTLR start "entryRuleINTexp"
    // InternalSCH.g:160:1: entryRuleINTexp : ruleINTexp EOF ;
    public final void entryRuleINTexp() throws RecognitionException {
        try {
            // InternalSCH.g:161:1: ( ruleINTexp EOF )
            // InternalSCH.g:162:1: ruleINTexp EOF
            {
             before(grammarAccess.getINTexpRule()); 
            pushFollow(FOLLOW_1);
            ruleINTexp();

            state._fsp--;

             after(grammarAccess.getINTexpRule()); 
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
    // $ANTLR end "entryRuleINTexp"


    // $ANTLR start "ruleINTexp"
    // InternalSCH.g:169:1: ruleINTexp : ( ( rule__INTexp__IvalueAssignment ) ) ;
    public final void ruleINTexp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:173:2: ( ( ( rule__INTexp__IvalueAssignment ) ) )
            // InternalSCH.g:174:2: ( ( rule__INTexp__IvalueAssignment ) )
            {
            // InternalSCH.g:174:2: ( ( rule__INTexp__IvalueAssignment ) )
            // InternalSCH.g:175:3: ( rule__INTexp__IvalueAssignment )
            {
             before(grammarAccess.getINTexpAccess().getIvalueAssignment()); 
            // InternalSCH.g:176:3: ( rule__INTexp__IvalueAssignment )
            // InternalSCH.g:176:4: rule__INTexp__IvalueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__INTexp__IvalueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getINTexpAccess().getIvalueAssignment()); 

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
    // $ANTLR end "ruleINTexp"


    // $ANTLR start "entryRuleDOUBLEexp"
    // InternalSCH.g:185:1: entryRuleDOUBLEexp : ruleDOUBLEexp EOF ;
    public final void entryRuleDOUBLEexp() throws RecognitionException {
        try {
            // InternalSCH.g:186:1: ( ruleDOUBLEexp EOF )
            // InternalSCH.g:187:1: ruleDOUBLEexp EOF
            {
             before(grammarAccess.getDOUBLEexpRule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLEexp();

            state._fsp--;

             after(grammarAccess.getDOUBLEexpRule()); 
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
    // $ANTLR end "entryRuleDOUBLEexp"


    // $ANTLR start "ruleDOUBLEexp"
    // InternalSCH.g:194:1: ruleDOUBLEexp : ( ( rule__DOUBLEexp__DvalueAssignment ) ) ;
    public final void ruleDOUBLEexp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:198:2: ( ( ( rule__DOUBLEexp__DvalueAssignment ) ) )
            // InternalSCH.g:199:2: ( ( rule__DOUBLEexp__DvalueAssignment ) )
            {
            // InternalSCH.g:199:2: ( ( rule__DOUBLEexp__DvalueAssignment ) )
            // InternalSCH.g:200:3: ( rule__DOUBLEexp__DvalueAssignment )
            {
             before(grammarAccess.getDOUBLEexpAccess().getDvalueAssignment()); 
            // InternalSCH.g:201:3: ( rule__DOUBLEexp__DvalueAssignment )
            // InternalSCH.g:201:4: rule__DOUBLEexp__DvalueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLEexp__DvalueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEexpAccess().getDvalueAssignment()); 

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
    // $ANTLR end "ruleDOUBLEexp"


    // $ANTLR start "entryRuleBOOLexp"
    // InternalSCH.g:210:1: entryRuleBOOLexp : ruleBOOLexp EOF ;
    public final void entryRuleBOOLexp() throws RecognitionException {
        try {
            // InternalSCH.g:211:1: ( ruleBOOLexp EOF )
            // InternalSCH.g:212:1: ruleBOOLexp EOF
            {
             before(grammarAccess.getBOOLexpRule()); 
            pushFollow(FOLLOW_1);
            ruleBOOLexp();

            state._fsp--;

             after(grammarAccess.getBOOLexpRule()); 
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
    // $ANTLR end "entryRuleBOOLexp"


    // $ANTLR start "ruleBOOLexp"
    // InternalSCH.g:219:1: ruleBOOLexp : ( ( rule__BOOLexp__BvalueAssignment ) ) ;
    public final void ruleBOOLexp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:223:2: ( ( ( rule__BOOLexp__BvalueAssignment ) ) )
            // InternalSCH.g:224:2: ( ( rule__BOOLexp__BvalueAssignment ) )
            {
            // InternalSCH.g:224:2: ( ( rule__BOOLexp__BvalueAssignment ) )
            // InternalSCH.g:225:3: ( rule__BOOLexp__BvalueAssignment )
            {
             before(grammarAccess.getBOOLexpAccess().getBvalueAssignment()); 
            // InternalSCH.g:226:3: ( rule__BOOLexp__BvalueAssignment )
            // InternalSCH.g:226:4: rule__BOOLexp__BvalueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BOOLexp__BvalueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBOOLexpAccess().getBvalueAssignment()); 

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
    // $ANTLR end "ruleBOOLexp"


    // $ANTLR start "entryRuleSTRexp"
    // InternalSCH.g:235:1: entryRuleSTRexp : ruleSTRexp EOF ;
    public final void entryRuleSTRexp() throws RecognitionException {
        try {
            // InternalSCH.g:236:1: ( ruleSTRexp EOF )
            // InternalSCH.g:237:1: ruleSTRexp EOF
            {
             before(grammarAccess.getSTRexpRule()); 
            pushFollow(FOLLOW_1);
            ruleSTRexp();

            state._fsp--;

             after(grammarAccess.getSTRexpRule()); 
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
    // $ANTLR end "entryRuleSTRexp"


    // $ANTLR start "ruleSTRexp"
    // InternalSCH.g:244:1: ruleSTRexp : ( ( rule__STRexp__SvalueAssignment ) ) ;
    public final void ruleSTRexp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:248:2: ( ( ( rule__STRexp__SvalueAssignment ) ) )
            // InternalSCH.g:249:2: ( ( rule__STRexp__SvalueAssignment ) )
            {
            // InternalSCH.g:249:2: ( ( rule__STRexp__SvalueAssignment ) )
            // InternalSCH.g:250:3: ( rule__STRexp__SvalueAssignment )
            {
             before(grammarAccess.getSTRexpAccess().getSvalueAssignment()); 
            // InternalSCH.g:251:3: ( rule__STRexp__SvalueAssignment )
            // InternalSCH.g:251:4: rule__STRexp__SvalueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__STRexp__SvalueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSTRexpAccess().getSvalueAssignment()); 

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
    // $ANTLR end "ruleSTRexp"


    // $ANTLR start "entryRuleList"
    // InternalSCH.g:260:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalSCH.g:261:1: ( ruleList EOF )
            // InternalSCH.g:262:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalSCH.g:269:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:273:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalSCH.g:274:2: ( ( rule__List__Group__0 ) )
            {
            // InternalSCH.g:274:2: ( ( rule__List__Group__0 ) )
            // InternalSCH.g:275:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalSCH.g:276:3: ( rule__List__Group__0 )
            // InternalSCH.g:276:4: rule__List__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

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
    // $ANTLR end "ruleList"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalSCH.g:284:1: rule__Expression__Alternatives : ( ( ruleAtom ) | ( ruleList ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:288:1: ( ( ruleAtom ) | ( ruleList ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSCH.g:289:2: ( ruleAtom )
                    {
                    // InternalSCH.g:289:2: ( ruleAtom )
                    // InternalSCH.g:290:3: ruleAtom
                    {
                     before(grammarAccess.getExpressionAccess().getAtomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAtomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:295:2: ( ruleList )
                    {
                    // InternalSCH.g:295:2: ( ruleList )
                    // InternalSCH.g:296:3: ruleList
                    {
                     before(grammarAccess.getExpressionAccess().getListParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getListParserRuleCall_1()); 

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


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalSCH.g:305:1: rule__Atom__Alternatives : ( ( ruleIDexp ) | ( ruleINTexp ) | ( ruleBOOLexp ) | ( ruleDOUBLEexp ) | ( ruleSTRexp ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:309:1: ( ( ruleIDexp ) | ( ruleINTexp ) | ( ruleBOOLexp ) | ( ruleDOUBLEexp ) | ( ruleSTRexp ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt3=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt3=4;
                }
                break;
            case RULE_STRING:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSCH.g:310:2: ( ruleIDexp )
                    {
                    // InternalSCH.g:310:2: ( ruleIDexp )
                    // InternalSCH.g:311:3: ruleIDexp
                    {
                     before(grammarAccess.getAtomAccess().getIDexpParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIDexp();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getIDexpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:316:2: ( ruleINTexp )
                    {
                    // InternalSCH.g:316:2: ( ruleINTexp )
                    // InternalSCH.g:317:3: ruleINTexp
                    {
                     before(grammarAccess.getAtomAccess().getINTexpParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleINTexp();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getINTexpParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSCH.g:322:2: ( ruleBOOLexp )
                    {
                    // InternalSCH.g:322:2: ( ruleBOOLexp )
                    // InternalSCH.g:323:3: ruleBOOLexp
                    {
                     before(grammarAccess.getAtomAccess().getBOOLexpParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBOOLexp();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getBOOLexpParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSCH.g:328:2: ( ruleDOUBLEexp )
                    {
                    // InternalSCH.g:328:2: ( ruleDOUBLEexp )
                    // InternalSCH.g:329:3: ruleDOUBLEexp
                    {
                     before(grammarAccess.getAtomAccess().getDOUBLEexpParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDOUBLEexp();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getDOUBLEexpParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSCH.g:334:2: ( ruleSTRexp )
                    {
                    // InternalSCH.g:334:2: ( ruleSTRexp )
                    // InternalSCH.g:335:3: ruleSTRexp
                    {
                     before(grammarAccess.getAtomAccess().getSTRexpParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSTRexp();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getSTRexpParserRuleCall_4()); 

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
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__List__Group__0"
    // InternalSCH.g:344:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:348:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalSCH.g:349:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__1();

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
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // InternalSCH.g:356:1: rule__List__Group__0__Impl : ( '(' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:360:1: ( ( '(' ) )
            // InternalSCH.g:361:1: ( '(' )
            {
            // InternalSCH.g:361:1: ( '(' )
            // InternalSCH.g:362:2: '('
            {
             before(grammarAccess.getListAccess().getLeftParenthesisKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getListAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // InternalSCH.g:371:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:375:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalSCH.g:376:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__List__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__2();

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
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // InternalSCH.g:383:1: rule__List__Group__1__Impl : ( ( rule__List__CalledAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:387:1: ( ( ( rule__List__CalledAssignment_1 ) ) )
            // InternalSCH.g:388:1: ( ( rule__List__CalledAssignment_1 ) )
            {
            // InternalSCH.g:388:1: ( ( rule__List__CalledAssignment_1 ) )
            // InternalSCH.g:389:2: ( rule__List__CalledAssignment_1 )
            {
             before(grammarAccess.getListAccess().getCalledAssignment_1()); 
            // InternalSCH.g:390:2: ( rule__List__CalledAssignment_1 )
            // InternalSCH.g:390:3: rule__List__CalledAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__List__CalledAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getCalledAssignment_1()); 

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
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // InternalSCH.g:398:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:402:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // InternalSCH.g:403:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__List__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__3();

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
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // InternalSCH.g:410:1: rule__List__Group__2__Impl : ( ( rule__List__ParamsAssignment_2 )* ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:414:1: ( ( ( rule__List__ParamsAssignment_2 )* ) )
            // InternalSCH.g:415:1: ( ( rule__List__ParamsAssignment_2 )* )
            {
            // InternalSCH.g:415:1: ( ( rule__List__ParamsAssignment_2 )* )
            // InternalSCH.g:416:2: ( rule__List__ParamsAssignment_2 )*
            {
             before(grammarAccess.getListAccess().getParamsAssignment_2()); 
            // InternalSCH.g:417:2: ( rule__List__ParamsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)||LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSCH.g:417:3: rule__List__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__List__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getListAccess().getParamsAssignment_2()); 

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
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__List__Group__3"
    // InternalSCH.g:425:1: rule__List__Group__3 : rule__List__Group__3__Impl ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:429:1: ( rule__List__Group__3__Impl )
            // InternalSCH.g:430:2: rule__List__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__3__Impl();

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
    // $ANTLR end "rule__List__Group__3"


    // $ANTLR start "rule__List__Group__3__Impl"
    // InternalSCH.g:436:1: rule__List__Group__3__Impl : ( ')' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:440:1: ( ( ')' ) )
            // InternalSCH.g:441:1: ( ')' )
            {
            // InternalSCH.g:441:1: ( ')' )
            // InternalSCH.g:442:2: ')'
            {
             before(grammarAccess.getListAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getListAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__List__Group__3__Impl"


    // $ANTLR start "rule__Program__ExpressionsAssignment"
    // InternalSCH.g:452:1: rule__Program__ExpressionsAssignment : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:456:1: ( ( ruleExpression ) )
            // InternalSCH.g:457:2: ( ruleExpression )
            {
            // InternalSCH.g:457:2: ( ruleExpression )
            // InternalSCH.g:458:3: ruleExpression
            {
             before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__ExpressionsAssignment"


    // $ANTLR start "rule__IDexp__NameAssignment"
    // InternalSCH.g:467:1: rule__IDexp__NameAssignment : ( RULE_ID ) ;
    public final void rule__IDexp__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:471:1: ( ( RULE_ID ) )
            // InternalSCH.g:472:2: ( RULE_ID )
            {
            // InternalSCH.g:472:2: ( RULE_ID )
            // InternalSCH.g:473:3: RULE_ID
            {
             before(grammarAccess.getIDexpAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIDexpAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IDexp__NameAssignment"


    // $ANTLR start "rule__INTexp__IvalueAssignment"
    // InternalSCH.g:482:1: rule__INTexp__IvalueAssignment : ( RULE_INT ) ;
    public final void rule__INTexp__IvalueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:486:1: ( ( RULE_INT ) )
            // InternalSCH.g:487:2: ( RULE_INT )
            {
            // InternalSCH.g:487:2: ( RULE_INT )
            // InternalSCH.g:488:3: RULE_INT
            {
             before(grammarAccess.getINTexpAccess().getIvalueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getINTexpAccess().getIvalueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__INTexp__IvalueAssignment"


    // $ANTLR start "rule__DOUBLEexp__DvalueAssignment"
    // InternalSCH.g:497:1: rule__DOUBLEexp__DvalueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__DOUBLEexp__DvalueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:501:1: ( ( RULE_DOUBLE ) )
            // InternalSCH.g:502:2: ( RULE_DOUBLE )
            {
            // InternalSCH.g:502:2: ( RULE_DOUBLE )
            // InternalSCH.g:503:3: RULE_DOUBLE
            {
             before(grammarAccess.getDOUBLEexpAccess().getDvalueDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDOUBLEexpAccess().getDvalueDOUBLETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DOUBLEexp__DvalueAssignment"


    // $ANTLR start "rule__BOOLexp__BvalueAssignment"
    // InternalSCH.g:512:1: rule__BOOLexp__BvalueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BOOLexp__BvalueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:516:1: ( ( RULE_BOOLEAN ) )
            // InternalSCH.g:517:2: ( RULE_BOOLEAN )
            {
            // InternalSCH.g:517:2: ( RULE_BOOLEAN )
            // InternalSCH.g:518:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBOOLexpAccess().getBvalueBOOLEANTerminalRuleCall_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBOOLexpAccess().getBvalueBOOLEANTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__BOOLexp__BvalueAssignment"


    // $ANTLR start "rule__STRexp__SvalueAssignment"
    // InternalSCH.g:527:1: rule__STRexp__SvalueAssignment : ( RULE_STRING ) ;
    public final void rule__STRexp__SvalueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:531:1: ( ( RULE_STRING ) )
            // InternalSCH.g:532:2: ( RULE_STRING )
            {
            // InternalSCH.g:532:2: ( RULE_STRING )
            // InternalSCH.g:533:3: RULE_STRING
            {
             before(grammarAccess.getSTRexpAccess().getSvalueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSTRexpAccess().getSvalueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__STRexp__SvalueAssignment"


    // $ANTLR start "rule__List__CalledAssignment_1"
    // InternalSCH.g:542:1: rule__List__CalledAssignment_1 : ( RULE_ID ) ;
    public final void rule__List__CalledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:546:1: ( ( RULE_ID ) )
            // InternalSCH.g:547:2: ( RULE_ID )
            {
            // InternalSCH.g:547:2: ( RULE_ID )
            // InternalSCH.g:548:3: RULE_ID
            {
             before(grammarAccess.getListAccess().getCalledIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListAccess().getCalledIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__List__CalledAssignment_1"


    // $ANTLR start "rule__List__ParamsAssignment_2"
    // InternalSCH.g:557:1: rule__List__ParamsAssignment_2 : ( ruleExpression ) ;
    public final void rule__List__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSCH.g:561:1: ( ( ruleExpression ) )
            // InternalSCH.g:562:2: ( ruleExpression )
            {
            // InternalSCH.g:562:2: ( ruleExpression )
            // InternalSCH.g:563:3: ruleExpression
            {
             before(grammarAccess.getListAccess().getParamsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getListAccess().getParamsExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__List__ParamsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000021F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000061F0L});

}