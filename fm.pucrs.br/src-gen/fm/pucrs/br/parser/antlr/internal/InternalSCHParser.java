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
    // InternalSCH.g:107:1: ruleTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' ) | ( (lv_value_6_0= RULE_INT ) )+ ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        EObject this_Expression_1 = null;

        EObject this_Define_4 = null;



        	enterRule();

        try {
            // InternalSCH.g:113:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' ) | ( (lv_value_6_0= RULE_INT ) )+ ) )
            // InternalSCH.g:114:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' ) | ( (lv_value_6_0= RULE_INT ) )+ )
            {
            // InternalSCH.g:114:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | (otherlv_3= '(' this_Define_4= ruleDefine otherlv_5= ')' ) | ( (lv_value_6_0= RULE_INT ) )+ )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=15 && LA3_1<=18)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==14) ) {
                    alt3=2;
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
                    // InternalSCH.g:153:3: ( (lv_value_6_0= RULE_INT ) )+
                    {
                    // InternalSCH.g:153:3: ( (lv_value_6_0= RULE_INT ) )+
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
                    	    // InternalSCH.g:154:4: (lv_value_6_0= RULE_INT )
                    	    {
                    	    // InternalSCH.g:154:4: (lv_value_6_0= RULE_INT )
                    	    // InternalSCH.g:155:5: lv_value_6_0= RULE_INT
                    	    {
                    	    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                    	    					newLeafNode(lv_value_6_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_2_0());
                    	    				

                    	    					if (current==null) {
                    	    						current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    	    					}
                    	    					addWithLastConsumed(
                    	    						current,
                    	    						"value",
                    	    						lv_value_6_0,
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


    // $ANTLR start "entryRuleExpression"
    // InternalSCH.g:175:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSCH.g:175:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSCH.g:176:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSCH.g:182:1: ruleExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_left_1_0= ruleTerminalExpression ) ) ( (lv_right_2_0= ruleTerminalExpression ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_op_0_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:188:2: ( ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_left_1_0= ruleTerminalExpression ) ) ( (lv_right_2_0= ruleTerminalExpression ) )* ) )
            // InternalSCH.g:189:2: ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_left_1_0= ruleTerminalExpression ) ) ( (lv_right_2_0= ruleTerminalExpression ) )* )
            {
            // InternalSCH.g:189:2: ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_left_1_0= ruleTerminalExpression ) ) ( (lv_right_2_0= ruleTerminalExpression ) )* )
            // InternalSCH.g:190:3: ( (lv_op_0_0= ruleOperator ) ) ( (lv_left_1_0= ruleTerminalExpression ) ) ( (lv_right_2_0= ruleTerminalExpression ) )*
            {
            // InternalSCH.g:190:3: ( (lv_op_0_0= ruleOperator ) )
            // InternalSCH.g:191:4: (lv_op_0_0= ruleOperator )
            {
            // InternalSCH.g:191:4: (lv_op_0_0= ruleOperator )
            // InternalSCH.g:192:5: lv_op_0_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalSCH.g:209:3: ( (lv_left_1_0= ruleTerminalExpression ) )
            // InternalSCH.g:210:4: (lv_left_1_0= ruleTerminalExpression )
            {
            // InternalSCH.g:210:4: (lv_left_1_0= ruleTerminalExpression )
            // InternalSCH.g:211:5: lv_left_1_0= ruleTerminalExpression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftTerminalExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalSCH.g:228:3: ( (lv_right_2_0= ruleTerminalExpression ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT||LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSCH.g:229:4: (lv_right_2_0= ruleTerminalExpression )
            	    {
            	    // InternalSCH.g:229:4: (lv_right_2_0= ruleTerminalExpression )
            	    // InternalSCH.g:230:5: lv_right_2_0= ruleTerminalExpression
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
            	    break loop4;
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
    // InternalSCH.g:251:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalSCH.g:251:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalSCH.g:252:2: iv_ruleDefine= ruleDefine EOF
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
    // InternalSCH.g:258:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_ex_2_0= ruleTerminalExpression ) )* ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        EObject lv_ex_2_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:264:2: ( (otherlv_0= 'define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_ex_2_0= ruleTerminalExpression ) )* ) )
            // InternalSCH.g:265:2: (otherlv_0= 'define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_ex_2_0= ruleTerminalExpression ) )* )
            {
            // InternalSCH.g:265:2: (otherlv_0= 'define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_ex_2_0= ruleTerminalExpression ) )* )
            // InternalSCH.g:266:3: otherlv_0= 'define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_ex_2_0= ruleTerminalExpression ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDefineKeyword_0());
            		
            // InternalSCH.g:270:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalSCH.g:271:4: (lv_id_1_0= RULE_ID )
            {
            // InternalSCH.g:271:4: (lv_id_1_0= RULE_ID )
            // InternalSCH.g:272:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSCH.g:288:3: ( (lv_ex_2_0= ruleTerminalExpression ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT||LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSCH.g:289:4: (lv_ex_2_0= ruleTerminalExpression )
            	    {
            	    // InternalSCH.g:289:4: (lv_ex_2_0= ruleTerminalExpression )
            	    // InternalSCH.g:290:5: lv_ex_2_0= ruleTerminalExpression
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
            	    break loop5;
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


    // $ANTLR start "entryRuleOperator"
    // InternalSCH.g:311:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalSCH.g:311:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalSCH.g:312:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalSCH.g:318:1: ruleOperator returns [EObject current=null] : (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_Divide_0 = null;

        EObject this_Multiply_1 = null;

        EObject this_Add_2 = null;

        EObject this_Subtract_3 = null;



        	enterRule();

        try {
            // InternalSCH.g:324:2: ( (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract ) )
            // InternalSCH.g:325:2: (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract )
            {
            // InternalSCH.g:325:2: (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSCH.g:326:3: this_Divide_0= ruleDivide
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
                    // InternalSCH.g:335:3: this_Multiply_1= ruleMultiply
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
                    // InternalSCH.g:344:3: this_Add_2= ruleAdd
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
                    // InternalSCH.g:353:3: this_Subtract_3= ruleSubtract
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
    // InternalSCH.g:365:1: entryRuleSubtract returns [EObject current=null] : iv_ruleSubtract= ruleSubtract EOF ;
    public final EObject entryRuleSubtract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtract = null;


        try {
            // InternalSCH.g:365:49: (iv_ruleSubtract= ruleSubtract EOF )
            // InternalSCH.g:366:2: iv_ruleSubtract= ruleSubtract EOF
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
    // InternalSCH.g:372:1: ruleSubtract returns [EObject current=null] : ( (lv_minus_0_0= '-' ) ) ;
    public final EObject ruleSubtract() throws RecognitionException {
        EObject current = null;

        Token lv_minus_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:378:2: ( ( (lv_minus_0_0= '-' ) ) )
            // InternalSCH.g:379:2: ( (lv_minus_0_0= '-' ) )
            {
            // InternalSCH.g:379:2: ( (lv_minus_0_0= '-' ) )
            // InternalSCH.g:380:3: (lv_minus_0_0= '-' )
            {
            // InternalSCH.g:380:3: (lv_minus_0_0= '-' )
            // InternalSCH.g:381:4: lv_minus_0_0= '-'
            {
            lv_minus_0_0=(Token)match(input,15,FOLLOW_2); 

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
    // InternalSCH.g:396:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalSCH.g:396:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalSCH.g:397:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalSCH.g:403:1: ruleAdd returns [EObject current=null] : ( (lv_plus_0_0= '+' ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token lv_plus_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:409:2: ( ( (lv_plus_0_0= '+' ) ) )
            // InternalSCH.g:410:2: ( (lv_plus_0_0= '+' ) )
            {
            // InternalSCH.g:410:2: ( (lv_plus_0_0= '+' ) )
            // InternalSCH.g:411:3: (lv_plus_0_0= '+' )
            {
            // InternalSCH.g:411:3: (lv_plus_0_0= '+' )
            // InternalSCH.g:412:4: lv_plus_0_0= '+'
            {
            lv_plus_0_0=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSCH.g:427:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalSCH.g:427:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalSCH.g:428:2: iv_ruleMultiply= ruleMultiply EOF
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
    // InternalSCH.g:434:1: ruleMultiply returns [EObject current=null] : ( (lv_times_0_0= '*' ) ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token lv_times_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:440:2: ( ( (lv_times_0_0= '*' ) ) )
            // InternalSCH.g:441:2: ( (lv_times_0_0= '*' ) )
            {
            // InternalSCH.g:441:2: ( (lv_times_0_0= '*' ) )
            // InternalSCH.g:442:3: (lv_times_0_0= '*' )
            {
            // InternalSCH.g:442:3: (lv_times_0_0= '*' )
            // InternalSCH.g:443:4: lv_times_0_0= '*'
            {
            lv_times_0_0=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSCH.g:458:1: entryRuleDivide returns [EObject current=null] : iv_ruleDivide= ruleDivide EOF ;
    public final EObject entryRuleDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivide = null;


        try {
            // InternalSCH.g:458:47: (iv_ruleDivide= ruleDivide EOF )
            // InternalSCH.g:459:2: iv_ruleDivide= ruleDivide EOF
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
    // InternalSCH.g:465:1: ruleDivide returns [EObject current=null] : ( (lv_diveded_0_0= '/' ) ) ;
    public final EObject ruleDivide() throws RecognitionException {
        EObject current = null;

        Token lv_diveded_0_0=null;


        	enterRule();

        try {
            // InternalSCH.g:471:2: ( ( (lv_diveded_0_0= '/' ) ) )
            // InternalSCH.g:472:2: ( (lv_diveded_0_0= '/' ) )
            {
            // InternalSCH.g:472:2: ( (lv_diveded_0_0= '/' ) )
            // InternalSCH.g:473:3: (lv_diveded_0_0= '/' )
            {
            // InternalSCH.g:473:3: (lv_diveded_0_0= '/' )
            // InternalSCH.g:474:4: lv_diveded_0_0= '/'
            {
            lv_diveded_0_0=(Token)match(input,18,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});

}