package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fsm'", "'state'", "'init'", "'entry'", "'transition'", "'->'", "'['", "']'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalMyDsl.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
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
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyDsl.g:71:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'fsm' ( (lv_name_1_0= ruleEString ) ) ( (lv_transitions_2_0= ruleTransition ) )* ( (lv_states_3_0= ruleState ) ) ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_transitions_2_0 = null;

        EObject lv_states_3_0 = null;

        EObject lv_states_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'fsm' ( (lv_name_1_0= ruleEString ) ) ( (lv_transitions_2_0= ruleTransition ) )* ( (lv_states_3_0= ruleState ) ) ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'fsm' ( (lv_name_1_0= ruleEString ) ) ( (lv_transitions_2_0= ruleTransition ) )* ( (lv_states_3_0= ruleState ) ) ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'fsm' ( (lv_name_1_0= ruleEString ) ) ( (lv_transitions_2_0= ruleTransition ) )* ( (lv_states_3_0= ruleState ) ) ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'fsm' ( (lv_name_1_0= ruleEString ) ) ( (lv_transitions_2_0= ruleTransition ) )* ( (lv_states_3_0= ruleState ) ) ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFsmKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:102:3: ( (lv_transitions_2_0= ruleTransition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:103:4: (lv_transitions_2_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:103:4: (lv_transitions_2_0= ruleTransition )
            	    // InternalMyDsl.g:104:5: lv_transitions_2_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getFSMAccess().getTransitionsTransitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_transitions_2_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFSMRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:121:3: ( (lv_states_3_0= ruleState ) )
            // InternalMyDsl.g:122:4: (lv_states_3_0= ruleState )
            {
            // InternalMyDsl.g:122:4: (lv_states_3_0= ruleState )
            // InternalMyDsl.g:123:5: lv_states_3_0= ruleState
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStatesStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_states_3_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_3_0,
            						"org.xtext.example.mydsl.MyDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:140:3: ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }
                else if ( (LA2_0==15) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:141:4: ( (lv_states_4_0= ruleState ) )
            	    {
            	    // InternalMyDsl.g:141:4: ( (lv_states_4_0= ruleState ) )
            	    // InternalMyDsl.g:142:5: (lv_states_4_0= ruleState )
            	    {
            	    // InternalMyDsl.g:142:5: (lv_states_4_0= ruleState )
            	    // InternalMyDsl.g:143:6: lv_states_4_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getFSMAccess().getStatesStateParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_states_4_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFSMRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:161:4: ( (lv_transitions_5_0= ruleTransition ) )
            	    {
            	    // InternalMyDsl.g:161:4: ( (lv_transitions_5_0= ruleTransition ) )
            	    // InternalMyDsl.g:162:5: (lv_transitions_5_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:162:5: (lv_transitions_5_0= ruleTransition )
            	    // InternalMyDsl.g:163:6: lv_transitions_5_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getFSMAccess().getTransitionsTransitionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_transitions_5_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFSMRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:185:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:185:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:186:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:192:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:198:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:199:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:199:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:200:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:208:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:219:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:219:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:220:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:226:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_init_state_1_0= 'init' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'entry' ( (lv_output_text_4_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_init_state_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_output_text_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:232:2: ( (otherlv_0= 'state' ( (lv_init_state_1_0= 'init' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'entry' ( (lv_output_text_4_0= ruleEString ) ) ) )
            // InternalMyDsl.g:233:2: (otherlv_0= 'state' ( (lv_init_state_1_0= 'init' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'entry' ( (lv_output_text_4_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:233:2: (otherlv_0= 'state' ( (lv_init_state_1_0= 'init' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'entry' ( (lv_output_text_4_0= ruleEString ) ) )
            // InternalMyDsl.g:234:3: otherlv_0= 'state' ( (lv_init_state_1_0= 'init' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'entry' ( (lv_output_text_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalMyDsl.g:238:3: ( (lv_init_state_1_0= 'init' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:239:4: (lv_init_state_1_0= 'init' )
                    {
                    // InternalMyDsl.g:239:4: (lv_init_state_1_0= 'init' )
                    // InternalMyDsl.g:240:5: lv_init_state_1_0= 'init'
                    {
                    lv_init_state_1_0=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(lv_init_state_1_0, grammarAccess.getStateAccess().getInit_stateInitKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "init_state", lv_init_state_1_0 != null, "init");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:252:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:253:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:253:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:254:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getEntryKeyword_3());
            		
            // InternalMyDsl.g:275:3: ( (lv_output_text_4_0= ruleEString ) )
            // InternalMyDsl.g:276:4: (lv_output_text_4_0= ruleEString )
            {
            // InternalMyDsl.g:276:4: (lv_output_text_4_0= ruleEString )
            // InternalMyDsl.g:277:5: lv_output_text_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getOutput_textEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_output_text_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"output_text",
            						lv_output_text_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:298:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:298:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:299:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:305:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_input_text_6_0= ruleEString ) ) otherlv_7= ']' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_input_text_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:311:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_input_text_6_0= ruleEString ) ) otherlv_7= ']' ) )
            // InternalMyDsl.g:312:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_input_text_6_0= ruleEString ) ) otherlv_7= ']' )
            {
            // InternalMyDsl.g:312:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_input_text_6_0= ruleEString ) ) otherlv_7= ']' )
            // InternalMyDsl.g:313:3: otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_input_text_6_0= ruleEString ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalMyDsl.g:317:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:318:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:318:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:319:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:336:3: ( ( ruleEString ) )
            // InternalMyDsl.g:337:4: ( ruleEString )
            {
            // InternalMyDsl.g:337:4: ( ruleEString )
            // InternalMyDsl.g:338:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getStart_stateStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalMyDsl.g:356:3: ( ( ruleEString ) )
            // InternalMyDsl.g:357:4: ( ruleEString )
            {
            // InternalMyDsl.g:357:4: ( ruleEString )
            // InternalMyDsl.g:358:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getEnd_stateStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalMyDsl.g:376:3: ( (lv_input_text_6_0= ruleEString ) )
            // InternalMyDsl.g:377:4: (lv_input_text_6_0= ruleEString )
            {
            // InternalMyDsl.g:377:4: (lv_input_text_6_0= ruleEString )
            // InternalMyDsl.g:378:5: lv_input_text_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getInput_textEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_input_text_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"input_text",
            						lv_input_text_6_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}