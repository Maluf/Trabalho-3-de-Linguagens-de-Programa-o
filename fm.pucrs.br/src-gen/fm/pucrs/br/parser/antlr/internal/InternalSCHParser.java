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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'define'", "'lambda'", "'if'", "'#t'", "'#f'", "'='", "'>='", "'<='", "'!='", "'>'", "'<'", "'-'", "'+'", "'*'", "'/'"
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

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_STRING)||LA1_0==12||(LA1_0>=17 && LA1_0<=18)) ) {
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


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalSCH.g:100:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalSCH.g:100:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalSCH.g:101:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalSCH.g:107:1: ruleTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' ) | (otherlv_6= '(' this_Lambda_7= ruleLambda otherlv_8= ')' ) | (otherlv_9= '(' this_If_10= ruleIf otherlv_11= ')' ) | ( (lv_value_12_0= RULE_INT ) )+ | ( (lv_identifier_13_0= RULE_ID ) )+ | ( (lv_bool_14_0= ruleBool ) )+ | ( (lv_str_15_0= RULE_STRING ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_value_12_0=null;
        Token lv_identifier_13_0=null;
        Token lv_str_15_0=null;
        EObject this_Expression_1 = null;

        EObject this_Define_4 = null;

        EObject this_Lambda_7 = null;

        EObject this_If_10 = null;

        AntlrDatatypeRuleToken lv_bool_14_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:113:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' ) | (otherlv_6= '(' this_Lambda_7= ruleLambda otherlv_8= ')' ) | (otherlv_9= '(' this_If_10= ruleIf otherlv_11= ')' ) | ( (lv_value_12_0= RULE_INT ) )+ | ( (lv_identifier_13_0= RULE_ID ) )+ | ( (lv_bool_14_0= ruleBool ) )+ | ( (lv_str_15_0= RULE_STRING ) ) ) )
            // InternalSCH.g:114:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' ) | (otherlv_6= '(' this_Lambda_7= ruleLambda otherlv_8= ')' ) | (otherlv_9= '(' this_If_10= ruleIf otherlv_11= ')' ) | ( (lv_value_12_0= RULE_INT ) )+ | ( (lv_identifier_13_0= RULE_ID ) )+ | ( (lv_bool_14_0= ruleBool ) )+ | ( (lv_str_15_0= RULE_STRING ) ) )
            {
            // InternalSCH.g:114:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' ) | (otherlv_6= '(' this_Lambda_7= ruleLambda otherlv_8= ')' ) | (otherlv_9= '(' this_If_10= ruleIf otherlv_11= ')' ) | ( (lv_value_12_0= RULE_INT ) )+ | ( (lv_identifier_13_0= RULE_ID ) )+ | ( (lv_bool_14_0= ruleBool ) )+ | ( (lv_str_15_0= RULE_STRING ) ) )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalSCH.g:115:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalSCH.g:115:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalSCH.g:116:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_5);
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
                    // InternalSCH.g:134:3: (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' )
                    {
                    // InternalSCH.g:134:3: (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' )
                    // InternalSCH.g:135:4: otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDefineParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_Define_4=ruleDefine();

                    state._fsp--;


                    				current = this_Define_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSCH.g:153:3: (otherlv_6= '(' this_Lambda_7= ruleLambda otherlv_8= ')' )
                    {
                    // InternalSCH.g:153:3: (otherlv_6= '(' this_Lambda_7= ruleLambda otherlv_8= ')' )
                    // InternalSCH.g:154:4: otherlv_6= '(' this_Lambda_7= ruleLambda otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getLambdaParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_Lambda_7=ruleLambda();

                    state._fsp--;


                    				current = this_Lambda_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSCH.g:172:3: (otherlv_9= '(' this_If_10= ruleIf otherlv_11= ')' )
                    {
                    // InternalSCH.g:172:3: (otherlv_9= '(' this_If_10= ruleIf otherlv_11= ')' )
                    // InternalSCH.g:173:4: otherlv_9= '(' this_If_10= ruleIf otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getIfParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_If_10=ruleIf();

                    state._fsp--;


                    				current = this_If_10;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_11=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSCH.g:191:3: ( (lv_value_12_0= RULE_INT ) )+
                    {
                    // InternalSCH.g:191:3: ( (lv_value_12_0= RULE_INT ) )+
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
                    	    // InternalSCH.g:192:4: (lv_value_12_0= RULE_INT )
                    	    {
                    	    // InternalSCH.g:192:4: (lv_value_12_0= RULE_INT )
                    	    // InternalSCH.g:193:5: lv_value_12_0= RULE_INT
                    	    {
                    	    lv_value_12_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                    	    					newLeafNode(lv_value_12_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_4_0());
                    	    				

                    	    					if (current==null) {
                    	    						current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    	    					}
                    	    					addWithLastConsumed(
                    	    						current,
                    	    						"value",
                    	    						lv_value_12_0,
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
                case 6 :
                    // InternalSCH.g:210:3: ( (lv_identifier_13_0= RULE_ID ) )+
                    {
                    // InternalSCH.g:210:3: ( (lv_identifier_13_0= RULE_ID ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSCH.g:211:4: (lv_identifier_13_0= RULE_ID )
                    	    {
                    	    // InternalSCH.g:211:4: (lv_identifier_13_0= RULE_ID )
                    	    // InternalSCH.g:212:5: lv_identifier_13_0= RULE_ID
                    	    {
                    	    lv_identifier_13_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    					newLeafNode(lv_identifier_13_0, grammarAccess.getTerminalExpressionAccess().getIdentifierIDTerminalRuleCall_5_0());
                    	    				

                    	    					if (current==null) {
                    	    						current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    	    					}
                    	    					addWithLastConsumed(
                    	    						current,
                    	    						"identifier",
                    	    						lv_identifier_13_0,
                    	    						"org.eclipse.xtext.common.Terminals.ID");
                    	    				

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


                    }
                    break;
                case 7 :
                    // InternalSCH.g:229:3: ( (lv_bool_14_0= ruleBool ) )+
                    {
                    // InternalSCH.g:229:3: ( (lv_bool_14_0= ruleBool ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }
                        else if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSCH.g:230:4: (lv_bool_14_0= ruleBool )
                    	    {
                    	    // InternalSCH.g:230:4: (lv_bool_14_0= ruleBool )
                    	    // InternalSCH.g:231:5: lv_bool_14_0= ruleBool
                    	    {

                    	    					newCompositeNode(grammarAccess.getTerminalExpressionAccess().getBoolBoolParserRuleCall_6_0());
                    	    				
                    	    pushFollow(FOLLOW_11);
                    	    lv_bool_14_0=ruleBool();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"bool",
                    	    						lv_bool_14_0,
                    	    						"fm.pucrs.br.SCH.Bool");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 8 :
                    // InternalSCH.g:249:3: ( (lv_str_15_0= RULE_STRING ) )
                    {
                    // InternalSCH.g:249:3: ( (lv_str_15_0= RULE_STRING ) )
                    // InternalSCH.g:250:4: (lv_str_15_0= RULE_STRING )
                    {
                    // InternalSCH.g:250:4: (lv_str_15_0= RULE_STRING )
                    // InternalSCH.g:251:5: lv_str_15_0= RULE_STRING
                    {
                    lv_str_15_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_str_15_0, grammarAccess.getTerminalExpressionAccess().getStrSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"str",
                    						lv_str_15_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


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


    // $ANTLR start "entryRuleExpression"
    // InternalSCH.g:271:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSCH.g:271:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSCH.g:272:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSCH.g:278:1: ruleExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_left_1_0= ruleTerminalExpression ) ) ( (lv_right_2_0= ruleTerminalExpression ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_op_0_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:284:2: ( ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_left_1_0= ruleTerminalExpression ) ) ( (lv_right_2_0= ruleTerminalExpression ) )* ) )
            // InternalSCH.g:285:2: ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_left_1_0= ruleTerminalExpression ) ) ( (lv_right_2_0= ruleTerminalExpression ) )* )
            {
            // InternalSCH.g:285:2: ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_left_1_0= ruleTerminalExpression ) ) ( (lv_right_2_0= ruleTerminalExpression ) )* )
            // InternalSCH.g:286:3: ( (lv_op_0_0= ruleOperator ) ) ( (lv_left_1_0= ruleTerminalExpression ) ) ( (lv_right_2_0= ruleTerminalExpression ) )*
            {
            // InternalSCH.g:286:3: ( (lv_op_0_0= ruleOperator ) )
            // InternalSCH.g:287:4: (lv_op_0_0= ruleOperator )
            {
            // InternalSCH.g:287:4: (lv_op_0_0= ruleOperator )
            // InternalSCH.g:288:5: lv_op_0_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalSCH.g:305:3: ( (lv_left_1_0= ruleTerminalExpression ) )
            // InternalSCH.g:306:4: (lv_left_1_0= ruleTerminalExpression )
            {
            // InternalSCH.g:306:4: (lv_left_1_0= ruleTerminalExpression )
            // InternalSCH.g:307:5: lv_left_1_0= ruleTerminalExpression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftTerminalExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_left_1_0=ruleTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"fm.pucrs.br.SCH.TerminalExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSCH.g:324:3: ( (lv_right_2_0= ruleTerminalExpression ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||LA6_0==12||(LA6_0>=17 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSCH.g:325:4: (lv_right_2_0= ruleTerminalExpression )
            	    {
            	    // InternalSCH.g:325:4: (lv_right_2_0= ruleTerminalExpression )
            	    // InternalSCH.g:326:5: lv_right_2_0= ruleTerminalExpression
            	    {

            	    					newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_right_2_0=ruleTerminalExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"right",
            	    						lv_right_2_0,
            	    						"fm.pucrs.br.SCH.TerminalExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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


    // $ANTLR start "entryRuleDefine"
    // InternalSCH.g:347:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalSCH.g:347:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalSCH.g:348:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalSCH.g:354:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_ex_2_0= ruleTerminalExpression ) )* ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        EObject lv_ex_2_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:360:2: ( (otherlv_0= 'define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_ex_2_0= ruleTerminalExpression ) )* ) )
            // InternalSCH.g:361:2: (otherlv_0= 'define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_ex_2_0= ruleTerminalExpression ) )* )
            {
            // InternalSCH.g:361:2: (otherlv_0= 'define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_ex_2_0= ruleTerminalExpression ) )* )
            // InternalSCH.g:362:3: otherlv_0= 'define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_ex_2_0= ruleTerminalExpression ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDefineKeyword_0());
            		
            // InternalSCH.g:366:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalSCH.g:367:4: (lv_id_1_0= RULE_ID )
            {
            // InternalSCH.g:367:4: (lv_id_1_0= RULE_ID )
            // InternalSCH.g:368:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_id_1_0, grammarAccess.getDefineAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSCH.g:384:3: ( (lv_ex_2_0= ruleTerminalExpression ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)||LA7_0==12||(LA7_0>=17 && LA7_0<=18)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSCH.g:385:4: (lv_ex_2_0= ruleTerminalExpression )
            	    {
            	    // InternalSCH.g:385:4: (lv_ex_2_0= ruleTerminalExpression )
            	    // InternalSCH.g:386:5: lv_ex_2_0= ruleTerminalExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDefineAccess().getExTerminalExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_ex_2_0=ruleTerminalExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDefineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ex",
            	    						lv_ex_2_0,
            	    						"fm.pucrs.br.SCH.TerminalExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleLambda"
    // InternalSCH.g:407:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalSCH.g:407:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalSCH.g:408:2: iv_ruleLambda= ruleLambda EOF
            {
             newCompositeNode(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLambda=ruleLambda();

            state._fsp--;

             current =iv_ruleLambda; 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalSCH.g:414:1: ruleLambda returns [EObject current=null] : (otherlv_0= 'lambda' otherlv_1= '(' ( (lv_ouput_2_0= RULE_ID ) )* otherlv_3= ')' ( (lv_ex_4_0= ruleTerminalExpression ) ) ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ouput_2_0=null;
        Token otherlv_3=null;
        EObject lv_ex_4_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:420:2: ( (otherlv_0= 'lambda' otherlv_1= '(' ( (lv_ouput_2_0= RULE_ID ) )* otherlv_3= ')' ( (lv_ex_4_0= ruleTerminalExpression ) ) ) )
            // InternalSCH.g:421:2: (otherlv_0= 'lambda' otherlv_1= '(' ( (lv_ouput_2_0= RULE_ID ) )* otherlv_3= ')' ( (lv_ex_4_0= ruleTerminalExpression ) ) )
            {
            // InternalSCH.g:421:2: (otherlv_0= 'lambda' otherlv_1= '(' ( (lv_ouput_2_0= RULE_ID ) )* otherlv_3= ')' ( (lv_ex_4_0= ruleTerminalExpression ) ) )
            // InternalSCH.g:422:3: otherlv_0= 'lambda' otherlv_1= '(' ( (lv_ouput_2_0= RULE_ID ) )* otherlv_3= ')' ( (lv_ex_4_0= ruleTerminalExpression ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getLambdaAccess().getLambdaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSCH.g:430:3: ( (lv_ouput_2_0= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSCH.g:431:4: (lv_ouput_2_0= RULE_ID )
            	    {
            	    // InternalSCH.g:431:4: (lv_ouput_2_0= RULE_ID )
            	    // InternalSCH.g:432:5: lv_ouput_2_0= RULE_ID
            	    {
            	    lv_ouput_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    					newLeafNode(lv_ouput_2_0, grammarAccess.getLambdaAccess().getOuputIDTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLambdaRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"ouput",
            	    						lv_ouput_2_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getLambdaAccess().getRightParenthesisKeyword_3());
            		
            // InternalSCH.g:452:3: ( (lv_ex_4_0= ruleTerminalExpression ) )
            // InternalSCH.g:453:4: (lv_ex_4_0= ruleTerminalExpression )
            {
            // InternalSCH.g:453:4: (lv_ex_4_0= ruleTerminalExpression )
            // InternalSCH.g:454:5: lv_ex_4_0= ruleTerminalExpression
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getExTerminalExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_ex_4_0=ruleTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"ex",
            						lv_ex_4_0,
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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleIf"
    // InternalSCH.g:475:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalSCH.g:475:43: (iv_ruleIf= ruleIf EOF )
            // InternalSCH.g:476:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalSCH.g:482:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_logicEx_1_0= ruleTerminalExpression ) ) ( (lv_trueEx_2_0= ruleTerminalExpression ) ) ( (lv_falseEx_3_0= ruleTerminalExpression ) ) ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_logicEx_1_0 = null;

        EObject lv_trueEx_2_0 = null;

        EObject lv_falseEx_3_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:488:2: ( (otherlv_0= 'if' ( (lv_logicEx_1_0= ruleTerminalExpression ) ) ( (lv_trueEx_2_0= ruleTerminalExpression ) ) ( (lv_falseEx_3_0= ruleTerminalExpression ) ) ) )
            // InternalSCH.g:489:2: (otherlv_0= 'if' ( (lv_logicEx_1_0= ruleTerminalExpression ) ) ( (lv_trueEx_2_0= ruleTerminalExpression ) ) ( (lv_falseEx_3_0= ruleTerminalExpression ) ) )
            {
            // InternalSCH.g:489:2: (otherlv_0= 'if' ( (lv_logicEx_1_0= ruleTerminalExpression ) ) ( (lv_trueEx_2_0= ruleTerminalExpression ) ) ( (lv_falseEx_3_0= ruleTerminalExpression ) ) )
            // InternalSCH.g:490:3: otherlv_0= 'if' ( (lv_logicEx_1_0= ruleTerminalExpression ) ) ( (lv_trueEx_2_0= ruleTerminalExpression ) ) ( (lv_falseEx_3_0= ruleTerminalExpression ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            // InternalSCH.g:494:3: ( (lv_logicEx_1_0= ruleTerminalExpression ) )
            // InternalSCH.g:495:4: (lv_logicEx_1_0= ruleTerminalExpression )
            {
            // InternalSCH.g:495:4: (lv_logicEx_1_0= ruleTerminalExpression )
            // InternalSCH.g:496:5: lv_logicEx_1_0= ruleTerminalExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getLogicExTerminalExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_logicEx_1_0=ruleTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"logicEx",
            						lv_logicEx_1_0,
            						"fm.pucrs.br.SCH.TerminalExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSCH.g:513:3: ( (lv_trueEx_2_0= ruleTerminalExpression ) )
            // InternalSCH.g:514:4: (lv_trueEx_2_0= ruleTerminalExpression )
            {
            // InternalSCH.g:514:4: (lv_trueEx_2_0= ruleTerminalExpression )
            // InternalSCH.g:515:5: lv_trueEx_2_0= ruleTerminalExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getTrueExTerminalExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_trueEx_2_0=ruleTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"trueEx",
            						lv_trueEx_2_0,
            						"fm.pucrs.br.SCH.TerminalExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSCH.g:532:3: ( (lv_falseEx_3_0= ruleTerminalExpression ) )
            // InternalSCH.g:533:4: (lv_falseEx_3_0= ruleTerminalExpression )
            {
            // InternalSCH.g:533:4: (lv_falseEx_3_0= ruleTerminalExpression )
            // InternalSCH.g:534:5: lv_falseEx_3_0= ruleTerminalExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getFalseExTerminalExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_falseEx_3_0=ruleTerminalExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"falseEx",
            						lv_falseEx_3_0,
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleBool"
    // InternalSCH.g:555:1: entryRuleBool returns [String current=null] : iv_ruleBool= ruleBool EOF ;
    public final String entryRuleBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool = null;


        try {
            // InternalSCH.g:555:44: (iv_ruleBool= ruleBool EOF )
            // InternalSCH.g:556:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool.getText(); 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalSCH.g:562:1: ruleBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#t' | kw= '#f' ) ;
    public final AntlrDatatypeRuleToken ruleBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSCH.g:568:2: ( (kw= '#t' | kw= '#f' ) )
            // InternalSCH.g:569:2: (kw= '#t' | kw= '#f' )
            {
            // InternalSCH.g:569:2: (kw= '#t' | kw= '#f' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSCH.g:570:3: kw= '#t'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolAccess().getTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSCH.g:576:3: kw= '#f'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolAccess().getFKeyword_1());
                    		

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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleEqual"
    // InternalSCH.g:585:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalSCH.g:585:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalSCH.g:586:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalSCH.g:592:1: ruleEqual returns [EObject current=null] : ( (lv_equal_0_0= '=' ) ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token lv_equal_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:598:2: ( ( (lv_equal_0_0= '=' ) ) )
            // InternalSCH.g:599:2: ( (lv_equal_0_0= '=' ) )
            {
            // InternalSCH.g:599:2: ( (lv_equal_0_0= '=' ) )
            // InternalSCH.g:600:3: (lv_equal_0_0= '=' )
            {
            // InternalSCH.g:600:3: (lv_equal_0_0= '=' )
            // InternalSCH.g:601:4: lv_equal_0_0= '='
            {
            lv_equal_0_0=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(lv_equal_0_0, grammarAccess.getEqualAccess().getEqualEqualsSignKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEqualRule());
            				}
            				setWithLastConsumed(current, "equal", lv_equal_0_0, "=");
            			

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
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleMoreOrEqual"
    // InternalSCH.g:616:1: entryRuleMoreOrEqual returns [EObject current=null] : iv_ruleMoreOrEqual= ruleMoreOrEqual EOF ;
    public final EObject entryRuleMoreOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoreOrEqual = null;


        try {
            // InternalSCH.g:616:52: (iv_ruleMoreOrEqual= ruleMoreOrEqual EOF )
            // InternalSCH.g:617:2: iv_ruleMoreOrEqual= ruleMoreOrEqual EOF
            {
             newCompositeNode(grammarAccess.getMoreOrEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoreOrEqual=ruleMoreOrEqual();

            state._fsp--;

             current =iv_ruleMoreOrEqual; 
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
    // $ANTLR end "entryRuleMoreOrEqual"


    // $ANTLR start "ruleMoreOrEqual"
    // InternalSCH.g:623:1: ruleMoreOrEqual returns [EObject current=null] : ( (lv_moreOrEqual_0_0= '>=' ) ) ;
    public final EObject ruleMoreOrEqual() throws RecognitionException {
        EObject current = null;

        Token lv_moreOrEqual_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:629:2: ( ( (lv_moreOrEqual_0_0= '>=' ) ) )
            // InternalSCH.g:630:2: ( (lv_moreOrEqual_0_0= '>=' ) )
            {
            // InternalSCH.g:630:2: ( (lv_moreOrEqual_0_0= '>=' ) )
            // InternalSCH.g:631:3: (lv_moreOrEqual_0_0= '>=' )
            {
            // InternalSCH.g:631:3: (lv_moreOrEqual_0_0= '>=' )
            // InternalSCH.g:632:4: lv_moreOrEqual_0_0= '>='
            {
            lv_moreOrEqual_0_0=(Token)match(input,20,FOLLOW_2); 

            				newLeafNode(lv_moreOrEqual_0_0, grammarAccess.getMoreOrEqualAccess().getMoreOrEqualGreaterThanSignEqualsSignKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMoreOrEqualRule());
            				}
            				setWithLastConsumed(current, "moreOrEqual", lv_moreOrEqual_0_0, ">=");
            			

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
    // $ANTLR end "ruleMoreOrEqual"


    // $ANTLR start "entryRuleLessOrEqual"
    // InternalSCH.g:647:1: entryRuleLessOrEqual returns [EObject current=null] : iv_ruleLessOrEqual= ruleLessOrEqual EOF ;
    public final EObject entryRuleLessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqual = null;


        try {
            // InternalSCH.g:647:52: (iv_ruleLessOrEqual= ruleLessOrEqual EOF )
            // InternalSCH.g:648:2: iv_ruleLessOrEqual= ruleLessOrEqual EOF
            {
             newCompositeNode(grammarAccess.getLessOrEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLessOrEqual=ruleLessOrEqual();

            state._fsp--;

             current =iv_ruleLessOrEqual; 
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
    // $ANTLR end "entryRuleLessOrEqual"


    // $ANTLR start "ruleLessOrEqual"
    // InternalSCH.g:654:1: ruleLessOrEqual returns [EObject current=null] : ( (lv_lessOrEqual_0_0= '<=' ) ) ;
    public final EObject ruleLessOrEqual() throws RecognitionException {
        EObject current = null;

        Token lv_lessOrEqual_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:660:2: ( ( (lv_lessOrEqual_0_0= '<=' ) ) )
            // InternalSCH.g:661:2: ( (lv_lessOrEqual_0_0= '<=' ) )
            {
            // InternalSCH.g:661:2: ( (lv_lessOrEqual_0_0= '<=' ) )
            // InternalSCH.g:662:3: (lv_lessOrEqual_0_0= '<=' )
            {
            // InternalSCH.g:662:3: (lv_lessOrEqual_0_0= '<=' )
            // InternalSCH.g:663:4: lv_lessOrEqual_0_0= '<='
            {
            lv_lessOrEqual_0_0=(Token)match(input,21,FOLLOW_2); 

            				newLeafNode(lv_lessOrEqual_0_0, grammarAccess.getLessOrEqualAccess().getLessOrEqualLessThanSignEqualsSignKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLessOrEqualRule());
            				}
            				setWithLastConsumed(current, "lessOrEqual", lv_lessOrEqual_0_0, "<=");
            			

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
    // $ANTLR end "ruleLessOrEqual"


    // $ANTLR start "entryRuleDifferent"
    // InternalSCH.g:678:1: entryRuleDifferent returns [EObject current=null] : iv_ruleDifferent= ruleDifferent EOF ;
    public final EObject entryRuleDifferent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifferent = null;


        try {
            // InternalSCH.g:678:50: (iv_ruleDifferent= ruleDifferent EOF )
            // InternalSCH.g:679:2: iv_ruleDifferent= ruleDifferent EOF
            {
             newCompositeNode(grammarAccess.getDifferentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDifferent=ruleDifferent();

            state._fsp--;

             current =iv_ruleDifferent; 
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
    // $ANTLR end "entryRuleDifferent"


    // $ANTLR start "ruleDifferent"
    // InternalSCH.g:685:1: ruleDifferent returns [EObject current=null] : ( (lv_different_0_0= '!=' ) ) ;
    public final EObject ruleDifferent() throws RecognitionException {
        EObject current = null;

        Token lv_different_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:691:2: ( ( (lv_different_0_0= '!=' ) ) )
            // InternalSCH.g:692:2: ( (lv_different_0_0= '!=' ) )
            {
            // InternalSCH.g:692:2: ( (lv_different_0_0= '!=' ) )
            // InternalSCH.g:693:3: (lv_different_0_0= '!=' )
            {
            // InternalSCH.g:693:3: (lv_different_0_0= '!=' )
            // InternalSCH.g:694:4: lv_different_0_0= '!='
            {
            lv_different_0_0=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(lv_different_0_0, grammarAccess.getDifferentAccess().getDifferentExclamationMarkEqualsSignKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDifferentRule());
            				}
            				setWithLastConsumed(current, "different", lv_different_0_0, "!=");
            			

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
    // $ANTLR end "ruleDifferent"


    // $ANTLR start "entryRuleMore"
    // InternalSCH.g:709:1: entryRuleMore returns [EObject current=null] : iv_ruleMore= ruleMore EOF ;
    public final EObject entryRuleMore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMore = null;


        try {
            // InternalSCH.g:709:45: (iv_ruleMore= ruleMore EOF )
            // InternalSCH.g:710:2: iv_ruleMore= ruleMore EOF
            {
             newCompositeNode(grammarAccess.getMoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMore=ruleMore();

            state._fsp--;

             current =iv_ruleMore; 
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
    // $ANTLR end "entryRuleMore"


    // $ANTLR start "ruleMore"
    // InternalSCH.g:716:1: ruleMore returns [EObject current=null] : ( (lv_more_0_0= '>' ) ) ;
    public final EObject ruleMore() throws RecognitionException {
        EObject current = null;

        Token lv_more_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:722:2: ( ( (lv_more_0_0= '>' ) ) )
            // InternalSCH.g:723:2: ( (lv_more_0_0= '>' ) )
            {
            // InternalSCH.g:723:2: ( (lv_more_0_0= '>' ) )
            // InternalSCH.g:724:3: (lv_more_0_0= '>' )
            {
            // InternalSCH.g:724:3: (lv_more_0_0= '>' )
            // InternalSCH.g:725:4: lv_more_0_0= '>'
            {
            lv_more_0_0=(Token)match(input,23,FOLLOW_2); 

            				newLeafNode(lv_more_0_0, grammarAccess.getMoreAccess().getMoreGreaterThanSignKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMoreRule());
            				}
            				setWithLastConsumed(current, "more", lv_more_0_0, ">");
            			

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
    // $ANTLR end "ruleMore"


    // $ANTLR start "entryRuleLess"
    // InternalSCH.g:740:1: entryRuleLess returns [EObject current=null] : iv_ruleLess= ruleLess EOF ;
    public final EObject entryRuleLess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLess = null;


        try {
            // InternalSCH.g:740:45: (iv_ruleLess= ruleLess EOF )
            // InternalSCH.g:741:2: iv_ruleLess= ruleLess EOF
            {
             newCompositeNode(grammarAccess.getLessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLess=ruleLess();

            state._fsp--;

             current =iv_ruleLess; 
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
    // $ANTLR end "entryRuleLess"


    // $ANTLR start "ruleLess"
    // InternalSCH.g:747:1: ruleLess returns [EObject current=null] : ( (lv_less_0_0= '<' ) ) ;
    public final EObject ruleLess() throws RecognitionException {
        EObject current = null;

        Token lv_less_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:753:2: ( ( (lv_less_0_0= '<' ) ) )
            // InternalSCH.g:754:2: ( (lv_less_0_0= '<' ) )
            {
            // InternalSCH.g:754:2: ( (lv_less_0_0= '<' ) )
            // InternalSCH.g:755:3: (lv_less_0_0= '<' )
            {
            // InternalSCH.g:755:3: (lv_less_0_0= '<' )
            // InternalSCH.g:756:4: lv_less_0_0= '<'
            {
            lv_less_0_0=(Token)match(input,24,FOLLOW_2); 

            				newLeafNode(lv_less_0_0, grammarAccess.getLessAccess().getLessLessThanSignKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLessRule());
            				}
            				setWithLastConsumed(current, "less", lv_less_0_0, "<");
            			

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
    // $ANTLR end "ruleLess"


    // $ANTLR start "entryRuleOperator"
    // InternalSCH.g:771:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalSCH.g:771:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalSCH.g:772:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalSCH.g:778:1: ruleOperator returns [EObject current=null] : (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract | this_Equal_4= ruleEqual | this_MoreOrEqual_5= ruleMoreOrEqual | this_LessOrEqual_6= ruleLessOrEqual | this_Different_7= ruleDifferent | this_More_8= ruleMore | this_Less_9= ruleLess ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_Divide_0 = null;

        EObject this_Multiply_1 = null;

        EObject this_Add_2 = null;

        EObject this_Subtract_3 = null;

        EObject this_Equal_4 = null;

        EObject this_MoreOrEqual_5 = null;

        EObject this_LessOrEqual_6 = null;

        EObject this_Different_7 = null;

        EObject this_More_8 = null;

        EObject this_Less_9 = null;



        	enterRule();

        try {
            // InternalSCH.g:784:2: ( (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract | this_Equal_4= ruleEqual | this_MoreOrEqual_5= ruleMoreOrEqual | this_LessOrEqual_6= ruleLessOrEqual | this_Different_7= ruleDifferent | this_More_8= ruleMore | this_Less_9= ruleLess ) )
            // InternalSCH.g:785:2: (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract | this_Equal_4= ruleEqual | this_MoreOrEqual_5= ruleMoreOrEqual | this_LessOrEqual_6= ruleLessOrEqual | this_Different_7= ruleDifferent | this_More_8= ruleMore | this_Less_9= ruleLess )
            {
            // InternalSCH.g:785:2: (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract | this_Equal_4= ruleEqual | this_MoreOrEqual_5= ruleMoreOrEqual | this_LessOrEqual_6= ruleLessOrEqual | this_Different_7= ruleDifferent | this_More_8= ruleMore | this_Less_9= ruleLess )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 25:
                {
                alt10=4;
                }
                break;
            case 19:
                {
                alt10=5;
                }
                break;
            case 20:
                {
                alt10=6;
                }
                break;
            case 21:
                {
                alt10=7;
                }
                break;
            case 22:
                {
                alt10=8;
                }
                break;
            case 23:
                {
                alt10=9;
                }
                break;
            case 24:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSCH.g:786:3: this_Divide_0= ruleDivide
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
                    // InternalSCH.g:795:3: this_Multiply_1= ruleMultiply
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
                    // InternalSCH.g:804:3: this_Add_2= ruleAdd
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
                    // InternalSCH.g:813:3: this_Subtract_3= ruleSubtract
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getSubtractParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subtract_3=ruleSubtract();

                    state._fsp--;


                    			current = this_Subtract_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSCH.g:822:3: this_Equal_4= ruleEqual
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getEqualParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equal_4=ruleEqual();

                    state._fsp--;


                    			current = this_Equal_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSCH.g:831:3: this_MoreOrEqual_5= ruleMoreOrEqual
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getMoreOrEqualParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoreOrEqual_5=ruleMoreOrEqual();

                    state._fsp--;


                    			current = this_MoreOrEqual_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSCH.g:840:3: this_LessOrEqual_6= ruleLessOrEqual
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getLessOrEqualParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LessOrEqual_6=ruleLessOrEqual();

                    state._fsp--;


                    			current = this_LessOrEqual_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSCH.g:849:3: this_Different_7= ruleDifferent
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getDifferentParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Different_7=ruleDifferent();

                    state._fsp--;


                    			current = this_Different_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSCH.g:858:3: this_More_8= ruleMore
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getMoreParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_More_8=ruleMore();

                    state._fsp--;


                    			current = this_More_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSCH.g:867:3: this_Less_9= ruleLess
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getLessParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Less_9=ruleLess();

                    state._fsp--;


                    			current = this_Less_9;
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
    // InternalSCH.g:879:1: entryRuleSubtract returns [EObject current=null] : iv_ruleSubtract= ruleSubtract EOF ;
    public final EObject entryRuleSubtract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtract = null;


        try {
            // InternalSCH.g:879:49: (iv_ruleSubtract= ruleSubtract EOF )
            // InternalSCH.g:880:2: iv_ruleSubtract= ruleSubtract EOF
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
    // InternalSCH.g:886:1: ruleSubtract returns [EObject current=null] : ( (lv_minus_0_0= '-' ) ) ;
    public final EObject ruleSubtract() throws RecognitionException {
        EObject current = null;

        Token lv_minus_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:892:2: ( ( (lv_minus_0_0= '-' ) ) )
            // InternalSCH.g:893:2: ( (lv_minus_0_0= '-' ) )
            {
            // InternalSCH.g:893:2: ( (lv_minus_0_0= '-' ) )
            // InternalSCH.g:894:3: (lv_minus_0_0= '-' )
            {
            // InternalSCH.g:894:3: (lv_minus_0_0= '-' )
            // InternalSCH.g:895:4: lv_minus_0_0= '-'
            {
            lv_minus_0_0=(Token)match(input,25,FOLLOW_2); 

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
    // InternalSCH.g:910:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalSCH.g:910:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalSCH.g:911:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalSCH.g:917:1: ruleAdd returns [EObject current=null] : ( (lv_plus_0_0= '+' ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token lv_plus_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:923:2: ( ( (lv_plus_0_0= '+' ) ) )
            // InternalSCH.g:924:2: ( (lv_plus_0_0= '+' ) )
            {
            // InternalSCH.g:924:2: ( (lv_plus_0_0= '+' ) )
            // InternalSCH.g:925:3: (lv_plus_0_0= '+' )
            {
            // InternalSCH.g:925:3: (lv_plus_0_0= '+' )
            // InternalSCH.g:926:4: lv_plus_0_0= '+'
            {
            lv_plus_0_0=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSCH.g:941:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalSCH.g:941:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalSCH.g:942:2: iv_ruleMultiply= ruleMultiply EOF
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
    // InternalSCH.g:948:1: ruleMultiply returns [EObject current=null] : ( (lv_times_0_0= '*' ) ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token lv_times_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:954:2: ( ( (lv_times_0_0= '*' ) ) )
            // InternalSCH.g:955:2: ( (lv_times_0_0= '*' ) )
            {
            // InternalSCH.g:955:2: ( (lv_times_0_0= '*' ) )
            // InternalSCH.g:956:3: (lv_times_0_0= '*' )
            {
            // InternalSCH.g:956:3: (lv_times_0_0= '*' )
            // InternalSCH.g:957:4: lv_times_0_0= '*'
            {
            lv_times_0_0=(Token)match(input,27,FOLLOW_2); 

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
    // InternalSCH.g:972:1: entryRuleDivide returns [EObject current=null] : iv_ruleDivide= ruleDivide EOF ;
    public final EObject entryRuleDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivide = null;


        try {
            // InternalSCH.g:972:47: (iv_ruleDivide= ruleDivide EOF )
            // InternalSCH.g:973:2: iv_ruleDivide= ruleDivide EOF
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
    // InternalSCH.g:979:1: ruleDivide returns [EObject current=null] : ( (lv_diveded_0_0= '/' ) ) ;
    public final EObject ruleDivide() throws RecognitionException {
        EObject current = null;

        Token lv_diveded_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:985:2: ( ( (lv_diveded_0_0= '/' ) ) )
            // InternalSCH.g:986:2: ( (lv_diveded_0_0= '/' ) )
            {
            // InternalSCH.g:986:2: ( (lv_diveded_0_0= '/' ) )
            // InternalSCH.g:987:3: (lv_diveded_0_0= '/' )
            {
            // InternalSCH.g:987:3: (lv_diveded_0_0= '/' )
            // InternalSCH.g:988:4: lv_diveded_0_0= '/'
            {
            lv_diveded_0_0=(Token)match(input,28,FOLLOW_2); 

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


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\16\10\uffff";
    static final String dfa_3s = "\1\22\1\34\10\uffff";
    static final String dfa_4s = "\2\uffff\1\5\1\6\1\7\1\10\1\1\1\2\1\3\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\5\5\uffff\1\1\4\uffff\2\4",
            "\1\7\1\10\1\11\2\uffff\12\6",
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
            return "114:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' ) | (otherlv_6= '(' this_Lambda_7= ruleLambda otherlv_8= ')' ) | (otherlv_9= '(' this_If_10= ruleIf otherlv_11= ')' ) | ( (lv_value_12_0= RULE_INT ) )+ | ( (lv_identifier_13_0= RULE_ID ) )+ | ( (lv_bool_14_0= ruleBool ) )+ | ( (lv_str_15_0= RULE_STRING ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000061072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001FF80000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000061070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002020L});

}