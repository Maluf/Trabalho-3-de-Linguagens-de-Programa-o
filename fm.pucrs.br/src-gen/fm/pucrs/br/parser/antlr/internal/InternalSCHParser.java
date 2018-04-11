package fm.pucrs.br.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fm.pucrs.br.services.SCHGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSCHParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'-'", "'+'", "'*'", "'/'"
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

        public InternalSCHParser(TokenStream input, SCHGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SCHGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSCH.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSCH.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSCH.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSCH.g:71:1: ruleModel returns [EObject current=null] : ( (lv_expressions_0_0= ruleTerminalExpression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:77:2: ( ( (lv_expressions_0_0= ruleTerminalExpression ) )* )
            // InternalSCH.g:78:2: ( (lv_expressions_0_0= ruleTerminalExpression ) )*
            {
            // InternalSCH.g:78:2: ( (lv_expressions_0_0= ruleTerminalExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSCH.g:79:3: (lv_expressions_0_0= ruleTerminalExpression )
            	    {
            	    // InternalSCH.g:79:3: (lv_expressions_0_0= ruleTerminalExpression )
            	    // InternalSCH.g:80:4: lv_expressions_0_0= ruleTerminalExpression
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getExpressionsTerminalExpressionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_expressions_0_0=ruleTerminalExpression();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"expressions",
            	    					lv_expressions_0_0,
            	    					"fm.pucrs.br.SCH.TerminalExpression");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // InternalSCH.g:100:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSCH.g:100:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSCH.g:101:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSCH.g:107:1: ruleExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_terminalExpression_1_0= ruleTerminalExpression ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_op_0_0 = null;

        EObject lv_terminalExpression_1_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:113:2: ( ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_terminalExpression_1_0= ruleTerminalExpression ) ) ) )
            // InternalSCH.g:114:2: ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_terminalExpression_1_0= ruleTerminalExpression ) ) )
            {
            // InternalSCH.g:114:2: ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_terminalExpression_1_0= ruleTerminalExpression ) ) )
            // InternalSCH.g:115:3: ( (lv_op_0_0= ruleOperator ) ) ( (lv_terminalExpression_1_0= ruleTerminalExpression ) )
            {
            // InternalSCH.g:115:3: ( (lv_op_0_0= ruleOperator ) )
            // InternalSCH.g:116:4: (lv_op_0_0= ruleOperator )
            {
            // InternalSCH.g:116:4: (lv_op_0_0= ruleOperator )
            // InternalSCH.g:117:5: lv_op_0_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_op_0_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_0_0,
            						"fm.pucrs.br.SCH.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSCH.g:134:3: ( (lv_terminalExpression_1_0= ruleTerminalExpression ) )
            // InternalSCH.g:135:4: (lv_terminalExpression_1_0= ruleTerminalExpression )
            {
            // InternalSCH.g:135:4: (lv_terminalExpression_1_0= ruleTerminalExpression )
            // InternalSCH.g:136:5: lv_terminalExpression_1_0= ruleTerminalExpression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionTerminalExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_terminalExpression_1_0=ruleTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"terminalExpression",
            						lv_terminalExpression_1_0,
            						"fm.pucrs.br.SCH.TerminalExpression");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalSCH.g:157:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalSCH.g:157:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalSCH.g:158:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalSCH.g:164:1: ruleTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= RULE_INT ) )+ ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalSCH.g:170:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= RULE_INT ) )+ ) )
            // InternalSCH.g:171:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= RULE_INT ) )+ )
            {
            // InternalSCH.g:171:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( (lv_value_3_0= RULE_INT ) )+ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSCH.g:172:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalSCH.g:172:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalSCH.g:173:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:191:3: ( (lv_value_3_0= RULE_INT ) )+
                    {
                    // InternalSCH.g:191:3: ( (lv_value_3_0= RULE_INT ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_INT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSCH.g:192:4: (lv_value_3_0= RULE_INT )
                    	    {
                    	    // InternalSCH.g:192:4: (lv_value_3_0= RULE_INT )
                    	    // InternalSCH.g:193:5: lv_value_3_0= RULE_INT
                    	    {
                    	    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                    	    					newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_0());
                    	    				

                    	    					if (current==null) {
                    	    						current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    	    					}
                    	    					addWithLastConsumed(
                    	    						current,
                    	    						"value",
                    	    						lv_value_3_0,
                    	    						"fm.pucrs.br.SCH.INT");
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleOperator"
    // InternalSCH.g:213:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalSCH.g:213:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalSCH.g:214:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalSCH.g:220:1: ruleOperator returns [EObject current=null] : (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_Divide_0 = null;

        EObject this_Multiply_1 = null;

        EObject this_Add_2 = null;

        EObject this_Subtract_3 = null;



        	enterRule();

        try {
            // InternalSCH.g:226:2: ( (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract ) )
            // InternalSCH.g:227:2: (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract )
            {
            // InternalSCH.g:227:2: (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 14:
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
                    // InternalSCH.g:228:3: this_Divide_0= ruleDivide
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getDivideParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Divide_0=ruleDivide();

                    state._fsp--;


                    			current = this_Divide_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSCH.g:237:3: this_Multiply_1= ruleMultiply
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getMultiplyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Multiply_1=ruleMultiply();

                    state._fsp--;


                    			current = this_Multiply_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSCH.g:246:3: this_Add_2= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getAddParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_2=ruleAdd();

                    state._fsp--;


                    			current = this_Add_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSCH.g:255:3: this_Subtract_3= ruleSubtract
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getSubtractParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subtract_3=ruleSubtract();

                    state._fsp--;


                    			current = this_Subtract_3;
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleSubtract"
    // InternalSCH.g:267:1: entryRuleSubtract returns [EObject current=null] : iv_ruleSubtract= ruleSubtract EOF ;
    public final EObject entryRuleSubtract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtract = null;


        try {
            // InternalSCH.g:267:49: (iv_ruleSubtract= ruleSubtract EOF )
            // InternalSCH.g:268:2: iv_ruleSubtract= ruleSubtract EOF
            {
             newCompositeNode(grammarAccess.getSubtractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtract=ruleSubtract();

            state._fsp--;

             current =iv_ruleSubtract; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubtract"


    // $ANTLR start "ruleSubtract"
    // InternalSCH.g:274:1: ruleSubtract returns [EObject current=null] : ( (lv_minus_0_0= '-' ) ) ;
    public final EObject ruleSubtract() throws RecognitionException {
        EObject current = null;

        Token lv_minus_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:280:2: ( ( (lv_minus_0_0= '-' ) ) )
            // InternalSCH.g:281:2: ( (lv_minus_0_0= '-' ) )
            {
            // InternalSCH.g:281:2: ( (lv_minus_0_0= '-' ) )
            // InternalSCH.g:282:3: (lv_minus_0_0= '-' )
            {
            // InternalSCH.g:282:3: (lv_minus_0_0= '-' )
            // InternalSCH.g:283:4: lv_minus_0_0= '-'
            {
            lv_minus_0_0=(Token)match(input,14,FOLLOW_2); 

            				newLeafNode(lv_minus_0_0, grammarAccess.getSubtractAccess().getMinusHyphenMinusKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSubtractRule());
            				}
            				setWithLastConsumed(current, "minus", lv_minus_0_0, "-");
            			

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
    // $ANTLR end "ruleSubtract"


    // $ANTLR start "entryRuleAdd"
    // InternalSCH.g:298:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalSCH.g:298:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalSCH.g:299:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalSCH.g:305:1: ruleAdd returns [EObject current=null] : ( (lv_plus_0_0= '+' ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token lv_plus_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:311:2: ( ( (lv_plus_0_0= '+' ) ) )
            // InternalSCH.g:312:2: ( (lv_plus_0_0= '+' ) )
            {
            // InternalSCH.g:312:2: ( (lv_plus_0_0= '+' ) )
            // InternalSCH.g:313:3: (lv_plus_0_0= '+' )
            {
            // InternalSCH.g:313:3: (lv_plus_0_0= '+' )
            // InternalSCH.g:314:4: lv_plus_0_0= '+'
            {
            lv_plus_0_0=(Token)match(input,15,FOLLOW_2); 

            				newLeafNode(lv_plus_0_0, grammarAccess.getAddAccess().getPlusPlusSignKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAddRule());
            				}
            				setWithLastConsumed(current, "plus", lv_plus_0_0, "+");
            			

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleMultiply"
    // InternalSCH.g:329:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalSCH.g:329:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalSCH.g:330:2: iv_ruleMultiply= ruleMultiply EOF
            {
             newCompositeNode(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiply=ruleMultiply();

            state._fsp--;

             current =iv_ruleMultiply; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalSCH.g:336:1: ruleMultiply returns [EObject current=null] : ( (lv_times_0_0= '*' ) ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token lv_times_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:342:2: ( ( (lv_times_0_0= '*' ) ) )
            // InternalSCH.g:343:2: ( (lv_times_0_0= '*' ) )
            {
            // InternalSCH.g:343:2: ( (lv_times_0_0= '*' ) )
            // InternalSCH.g:344:3: (lv_times_0_0= '*' )
            {
            // InternalSCH.g:344:3: (lv_times_0_0= '*' )
            // InternalSCH.g:345:4: lv_times_0_0= '*'
            {
            lv_times_0_0=(Token)match(input,16,FOLLOW_2); 

            				newLeafNode(lv_times_0_0, grammarAccess.getMultiplyAccess().getTimesAsteriskKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMultiplyRule());
            				}
            				setWithLastConsumed(current, "times", lv_times_0_0, "*");
            			

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
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleDivide"
    // InternalSCH.g:360:1: entryRuleDivide returns [EObject current=null] : iv_ruleDivide= ruleDivide EOF ;
    public final EObject entryRuleDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivide = null;


        try {
            // InternalSCH.g:360:47: (iv_ruleDivide= ruleDivide EOF )
            // InternalSCH.g:361:2: iv_ruleDivide= ruleDivide EOF
            {
             newCompositeNode(grammarAccess.getDivideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivide=ruleDivide();

            state._fsp--;

             current =iv_ruleDivide; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDivide"


    // $ANTLR start "ruleDivide"
    // InternalSCH.g:367:1: ruleDivide returns [EObject current=null] : ( (lv_diveded_0_0= '/' ) ) ;
    public final EObject ruleDivide() throws RecognitionException {
        EObject current = null;

        Token lv_diveded_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:373:2: ( ( (lv_diveded_0_0= '/' ) ) )
            // InternalSCH.g:374:2: ( (lv_diveded_0_0= '/' ) )
            {
            // InternalSCH.g:374:2: ( (lv_diveded_0_0= '/' ) )
            // InternalSCH.g:375:3: (lv_diveded_0_0= '/' )
            {
            // InternalSCH.g:375:3: (lv_diveded_0_0= '/' )
            // InternalSCH.g:376:4: lv_diveded_0_0= '/'
            {
            lv_diveded_0_0=(Token)match(input,17,FOLLOW_2); 

            				newLeafNode(lv_diveded_0_0, grammarAccess.getDivideAccess().getDivededSolidusKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDivideRule());
            				}
            				setWithLastConsumed(current, "diveded", lv_diveded_0_0, "/");
            			

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
    // $ANTLR end "ruleDivide"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});

}