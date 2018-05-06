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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'"
    };
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
        	return "Program";
       	}

       	@Override
       	protected SCHGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalSCH.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalSCH.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalSCH.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSCH.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_expressions_0_0= ruleExpression ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:77:2: ( ( (lv_expressions_0_0= ruleExpression ) )+ )
            // InternalSCH.g:78:2: ( (lv_expressions_0_0= ruleExpression ) )+
            {
            // InternalSCH.g:78:2: ( (lv_expressions_0_0= ruleExpression ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSCH.g:79:3: (lv_expressions_0_0= ruleExpression )
            	    {
            	    // InternalSCH.g:79:3: (lv_expressions_0_0= ruleExpression )
            	    // InternalSCH.g:80:4: lv_expressions_0_0= ruleExpression
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_expressions_0_0=ruleExpression();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"expressions",
            	    					lv_expressions_0_0,
            	    					"fm.pucrs.br.SCH.Expression");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleProgram"


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
    // InternalSCH.g:107:1: ruleExpression returns [EObject current=null] : (this_Atom_0= ruleAtom | this_List_1= ruleList ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_List_1 = null;



        	enterRule();

        try {
            // InternalSCH.g:113:2: ( (this_Atom_0= ruleAtom | this_List_1= ruleList ) )
            // InternalSCH.g:114:2: (this_Atom_0= ruleAtom | this_List_1= ruleList )
            {
            // InternalSCH.g:114:2: (this_Atom_0= ruleAtom | this_List_1= ruleList )
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
                    // InternalSCH.g:115:3: this_Atom_0= ruleAtom
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAtomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atom_0=ruleAtom();

                    state._fsp--;


                    			current = this_Atom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSCH.g:124:3: this_List_1= ruleList
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_1=ruleList();

                    state._fsp--;


                    			current = this_List_1;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAtom"
    // InternalSCH.g:136:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSCH.g:136:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSCH.g:137:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSCH.g:143:1: ruleAtom returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_ivalue_1_0= RULE_INT ) ) | ( (lv_bvalue_2_0= RULE_BOOLEAN ) ) | ( (lv_dvalue_3_0= RULE_DOUBLE ) ) | ( (lv_svalue_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_ivalue_1_0=null;
        Token lv_bvalue_2_0=null;
        Token lv_dvalue_3_0=null;
        Token lv_svalue_4_0=null;


        	enterRule();

        try {
            // InternalSCH.g:149:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_ivalue_1_0= RULE_INT ) ) | ( (lv_bvalue_2_0= RULE_BOOLEAN ) ) | ( (lv_dvalue_3_0= RULE_DOUBLE ) ) | ( (lv_svalue_4_0= RULE_STRING ) ) ) )
            // InternalSCH.g:150:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_ivalue_1_0= RULE_INT ) ) | ( (lv_bvalue_2_0= RULE_BOOLEAN ) ) | ( (lv_dvalue_3_0= RULE_DOUBLE ) ) | ( (lv_svalue_4_0= RULE_STRING ) ) )
            {
            // InternalSCH.g:150:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_ivalue_1_0= RULE_INT ) ) | ( (lv_bvalue_2_0= RULE_BOOLEAN ) ) | ( (lv_dvalue_3_0= RULE_DOUBLE ) ) | ( (lv_svalue_4_0= RULE_STRING ) ) )
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
                    // InternalSCH.g:151:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalSCH.g:151:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalSCH.g:152:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalSCH.g:152:4: (lv_name_0_0= RULE_ID )
                    // InternalSCH.g:153:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"fm.pucrs.br.SCH.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:170:3: ( (lv_ivalue_1_0= RULE_INT ) )
                    {
                    // InternalSCH.g:170:3: ( (lv_ivalue_1_0= RULE_INT ) )
                    // InternalSCH.g:171:4: (lv_ivalue_1_0= RULE_INT )
                    {
                    // InternalSCH.g:171:4: (lv_ivalue_1_0= RULE_INT )
                    // InternalSCH.g:172:5: lv_ivalue_1_0= RULE_INT
                    {
                    lv_ivalue_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_ivalue_1_0, grammarAccess.getAtomAccess().getIvalueINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"ivalue",
                    						lv_ivalue_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSCH.g:189:3: ( (lv_bvalue_2_0= RULE_BOOLEAN ) )
                    {
                    // InternalSCH.g:189:3: ( (lv_bvalue_2_0= RULE_BOOLEAN ) )
                    // InternalSCH.g:190:4: (lv_bvalue_2_0= RULE_BOOLEAN )
                    {
                    // InternalSCH.g:190:4: (lv_bvalue_2_0= RULE_BOOLEAN )
                    // InternalSCH.g:191:5: lv_bvalue_2_0= RULE_BOOLEAN
                    {
                    lv_bvalue_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_bvalue_2_0, grammarAccess.getAtomAccess().getBvalueBOOLEANTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"bvalue",
                    						lv_bvalue_2_0,
                    						"fm.pucrs.br.SCH.BOOLEAN");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSCH.g:208:3: ( (lv_dvalue_3_0= RULE_DOUBLE ) )
                    {
                    // InternalSCH.g:208:3: ( (lv_dvalue_3_0= RULE_DOUBLE ) )
                    // InternalSCH.g:209:4: (lv_dvalue_3_0= RULE_DOUBLE )
                    {
                    // InternalSCH.g:209:4: (lv_dvalue_3_0= RULE_DOUBLE )
                    // InternalSCH.g:210:5: lv_dvalue_3_0= RULE_DOUBLE
                    {
                    lv_dvalue_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_dvalue_3_0, grammarAccess.getAtomAccess().getDvalueDOUBLETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"dvalue",
                    						lv_dvalue_3_0,
                    						"fm.pucrs.br.SCH.DOUBLE");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSCH.g:227:3: ( (lv_svalue_4_0= RULE_STRING ) )
                    {
                    // InternalSCH.g:227:3: ( (lv_svalue_4_0= RULE_STRING ) )
                    // InternalSCH.g:228:4: (lv_svalue_4_0= RULE_STRING )
                    {
                    // InternalSCH.g:228:4: (lv_svalue_4_0= RULE_STRING )
                    // InternalSCH.g:229:5: lv_svalue_4_0= RULE_STRING
                    {
                    lv_svalue_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_svalue_4_0, grammarAccess.getAtomAccess().getSvalueSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"svalue",
                    						lv_svalue_4_0,
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleList"
    // InternalSCH.g:249:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalSCH.g:249:45: (iv_ruleList= ruleList EOF )
            // InternalSCH.g:250:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalSCH.g:256:1: ruleList returns [EObject current=null] : (otherlv_0= '(' ( (lv_called_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleExpression ) )* otherlv_3= ')' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_called_1_0=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:262:2: ( (otherlv_0= '(' ( (lv_called_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleExpression ) )* otherlv_3= ')' ) )
            // InternalSCH.g:263:2: (otherlv_0= '(' ( (lv_called_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleExpression ) )* otherlv_3= ')' )
            {
            // InternalSCH.g:263:2: (otherlv_0= '(' ( (lv_called_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleExpression ) )* otherlv_3= ')' )
            // InternalSCH.g:264:3: otherlv_0= '(' ( (lv_called_1_0= RULE_ID ) ) ( (lv_params_2_0= ruleExpression ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSCH.g:268:3: ( (lv_called_1_0= RULE_ID ) )
            // InternalSCH.g:269:4: (lv_called_1_0= RULE_ID )
            {
            // InternalSCH.g:269:4: (lv_called_1_0= RULE_ID )
            // InternalSCH.g:270:5: lv_called_1_0= RULE_ID
            {
            lv_called_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_called_1_0, grammarAccess.getListAccess().getCalledIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"called",
            						lv_called_1_0,
            						"fm.pucrs.br.SCH.ID");
            				

            }


            }

            // InternalSCH.g:286:3: ( (lv_params_2_0= ruleExpression ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)||LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSCH.g:287:4: (lv_params_2_0= ruleExpression )
            	    {
            	    // InternalSCH.g:287:4: (lv_params_2_0= ruleExpression )
            	    // InternalSCH.g:288:5: lv_params_2_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getListAccess().getParamsExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_params_2_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_2_0,
            	    						"fm.pucrs.br.SCH.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleList"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000021F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000061F0L});

}