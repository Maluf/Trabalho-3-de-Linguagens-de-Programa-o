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
    // InternalSCH.g:71:1: ruleModel returns [EObject current=null] : ( (lv_expressions_0_0= ruleExpression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expressions_0_0 = null;



        	enterRule();

        try {
            // InternalSCH.g:77:2: ( ( (lv_expressions_0_0= ruleExpression ) )* )
            // InternalSCH.g:78:2: ( (lv_expressions_0_0= ruleExpression ) )*
            {
            // InternalSCH.g:78:2: ( (lv_expressions_0_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_DOUBLE)||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSCH.g:79:3: (lv_expressions_0_0= ruleExpression )
            	    {
            	    // InternalSCH.g:79:3: (lv_expressions_0_0= ruleExpression )
            	    // InternalSCH.g:80:4: lv_expressions_0_0= ruleExpression
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_expressions_0_0=ruleExpression();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
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
    // InternalSCH.g:100:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalSCH.g:100:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalSCH.g:101:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
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
    // InternalSCH.g:107:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_Operator_1= ruleOperator this_Expression_2= ruleExpression this_Expression_3= ruleExpression kw= ')' ) | (kw= '(' this_Expression_6= ruleExpression kw= ')' ) | this_Value_8= ruleValue ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Operator_1 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_Expression_6 = null;

        AntlrDatatypeRuleToken this_Value_8 = null;



        	enterRule();

        try {
            // InternalSCH.g:113:2: ( ( (kw= '(' this_Operator_1= ruleOperator this_Expression_2= ruleExpression this_Expression_3= ruleExpression kw= ')' ) | (kw= '(' this_Expression_6= ruleExpression kw= ')' ) | this_Value_8= ruleValue ) )
            // InternalSCH.g:114:2: ( (kw= '(' this_Operator_1= ruleOperator this_Expression_2= ruleExpression this_Expression_3= ruleExpression kw= ')' ) | (kw= '(' this_Expression_6= ruleExpression kw= ')' ) | this_Value_8= ruleValue )
            {
            // InternalSCH.g:114:2: ( (kw= '(' this_Operator_1= ruleOperator this_Expression_2= ruleExpression this_Expression_3= ruleExpression kw= ')' ) | (kw= '(' this_Expression_6= ruleExpression kw= ')' ) | this_Value_8= ruleValue )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=14 && LA2_1<=17)) ) {
                    alt2=1;
                }
                else if ( ((LA2_1>=RULE_INT && LA2_1<=RULE_DOUBLE)||LA2_1==12) ) {
                    alt2=2;
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
                    // InternalSCH.g:115:3: (kw= '(' this_Operator_1= ruleOperator this_Expression_2= ruleExpression this_Expression_3= ruleExpression kw= ')' )
                    {
                    // InternalSCH.g:115:3: (kw= '(' this_Operator_1= ruleOperator this_Expression_2= ruleExpression this_Expression_3= ruleExpression kw= ')' )
                    // InternalSCH.g:116:4: kw= '(' this_Operator_1= ruleOperator this_Expression_2= ruleExpression this_Expression_3= ruleExpression kw= ')'
                    {
                    kw=(Token)match(input,12,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getExpressionAccess().getOperatorParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_Operator_1=ruleOperator();

                    state._fsp--;


                    				current.merge(this_Operator_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_5);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current.merge(this_Expression_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_6);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current.merge(this_Expression_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSCH.g:158:3: (kw= '(' this_Expression_6= ruleExpression kw= ')' )
                    {
                    // InternalSCH.g:158:3: (kw= '(' this_Expression_6= ruleExpression kw= ')' )
                    // InternalSCH.g:159:4: kw= '(' this_Expression_6= ruleExpression kw= ')'
                    {
                    kw=(Token)match(input,12,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_Expression_6=ruleExpression();

                    state._fsp--;


                    				current.merge(this_Expression_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSCH.g:181:3: this_Value_8= ruleValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Value_8=ruleValue();

                    state._fsp--;


                    			current.merge(this_Value_8);
                    		

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


    // $ANTLR start "entryRuleValue"
    // InternalSCH.g:195:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalSCH.g:195:45: (iv_ruleValue= ruleValue EOF )
            // InternalSCH.g:196:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSCH.g:202:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalSCH.g:208:2: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalSCH.g:209:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalSCH.g:209:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
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
                    // InternalSCH.g:210:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSCH.g:218:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_1);
                    		

                    			newLeafNode(this_DOUBLE_1, grammarAccess.getValueAccess().getDOUBLETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleOperator"
    // InternalSCH.g:229:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalSCH.g:229:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalSCH.g:230:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
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
    // InternalSCH.g:236:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Divide_0 = null;

        AntlrDatatypeRuleToken this_Multiply_1 = null;

        AntlrDatatypeRuleToken this_Add_2 = null;

        AntlrDatatypeRuleToken this_Subtract_3 = null;



        	enterRule();

        try {
            // InternalSCH.g:242:2: ( (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract ) )
            // InternalSCH.g:243:2: (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract )
            {
            // InternalSCH.g:243:2: (this_Divide_0= ruleDivide | this_Multiply_1= ruleMultiply | this_Add_2= ruleAdd | this_Subtract_3= ruleSubtract )
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
                    // InternalSCH.g:244:3: this_Divide_0= ruleDivide
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getDivideParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Divide_0=ruleDivide();

                    state._fsp--;


                    			current.merge(this_Divide_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSCH.g:255:3: this_Multiply_1= ruleMultiply
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getMultiplyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Multiply_1=ruleMultiply();

                    state._fsp--;


                    			current.merge(this_Multiply_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSCH.g:266:3: this_Add_2= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getAddParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_2=ruleAdd();

                    state._fsp--;


                    			current.merge(this_Add_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSCH.g:277:3: this_Subtract_3= ruleSubtract
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getSubtractParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subtract_3=ruleSubtract();

                    state._fsp--;


                    			current.merge(this_Subtract_3);
                    		

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
    // InternalSCH.g:291:1: entryRuleSubtract returns [String current=null] : iv_ruleSubtract= ruleSubtract EOF ;
    public final String entryRuleSubtract() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubtract = null;


        try {
            // InternalSCH.g:291:48: (iv_ruleSubtract= ruleSubtract EOF )
            // InternalSCH.g:292:2: iv_ruleSubtract= ruleSubtract EOF
            {
             newCompositeNode(grammarAccess.getSubtractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtract=ruleSubtract();

            state._fsp--;

             current =iv_ruleSubtract.getText(); 
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
    // InternalSCH.g:298:1: ruleSubtract returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleSubtract() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSCH.g:304:2: (kw= '-' )
            // InternalSCH.g:305:2: kw= '-'
            {
            kw=(Token)match(input,14,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSubtractAccess().getHyphenMinusKeyword());
            	

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
    // InternalSCH.g:313:1: entryRuleAdd returns [String current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final String entryRuleAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdd = null;


        try {
            // InternalSCH.g:313:43: (iv_ruleAdd= ruleAdd EOF )
            // InternalSCH.g:314:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd.getText(); 
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
    // InternalSCH.g:320:1: ruleAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken ruleAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSCH.g:326:2: (kw= '+' )
            // InternalSCH.g:327:2: kw= '+'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAddAccess().getPlusSignKeyword());
            	

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
    // InternalSCH.g:335:1: entryRuleMultiply returns [String current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final String entryRuleMultiply() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiply = null;


        try {
            // InternalSCH.g:335:48: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalSCH.g:336:2: iv_ruleMultiply= ruleMultiply EOF
            {
             newCompositeNode(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiply=ruleMultiply();

            state._fsp--;

             current =iv_ruleMultiply.getText(); 
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
    // InternalSCH.g:342:1: ruleMultiply returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleMultiply() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSCH.g:348:2: (kw= '*' )
            // InternalSCH.g:349:2: kw= '*'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMultiplyAccess().getAsteriskKeyword());
            	

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
    // InternalSCH.g:357:1: entryRuleDivide returns [String current=null] : iv_ruleDivide= ruleDivide EOF ;
    public final String entryRuleDivide() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDivide = null;


        try {
            // InternalSCH.g:357:46: (iv_ruleDivide= ruleDivide EOF )
            // InternalSCH.g:358:2: iv_ruleDivide= ruleDivide EOF
            {
             newCompositeNode(grammarAccess.getDivideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivide=ruleDivide();

            state._fsp--;

             current =iv_ruleDivide.getText(); 
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
    // InternalSCH.g:364:1: ruleDivide returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken ruleDivide() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSCH.g:370:2: (kw= '/' )
            // InternalSCH.g:371:2: kw= '/'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDivideAccess().getSolidusKeyword());
            	

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}