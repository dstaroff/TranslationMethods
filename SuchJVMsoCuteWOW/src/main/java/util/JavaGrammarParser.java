package util;
// Generated from JavaGrammar.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BOOLCONST=18, NUMBER=19, DIGIT=20, BOOLOPERATION=21, OPERATION=22, INT=23, 
		FOR=24, WHILE=25, IF=26, ELSE=27, PRINT=28, READ=29, VARIABLE=30, WS=31;
	public static final int
		RULE_code = 0, RULE_number = 1, RULE_atom = 2, RULE_unary = 3, RULE_expression = 4, 
		RULE_multiplication = 5, RULE_boolNumber = 6, RULE_boolAtom = 7, RULE_boolUnary = 8, 
		RULE_boolExpression = 9, RULE_boolMultiplication = 10, RULE_boolComparison = 11, 
		RULE_line = 12, RULE_assign = 13, RULE_expressionAssign = 14, RULE_operationAssign = 15, 
		RULE_leftIncrement = 16, RULE_rightIncrement = 17, RULE_declaration = 18, 
		RULE_forLoop = 19, RULE_forAssign = 20, RULE_whileLoop = 21, RULE_condition = 22, 
		RULE_body = 23, RULE_iff = 24, RULE_ifTrue = 25, RULE_ifFalse = 26, RULE_print = 27, 
		RULE_read = 28;
	public static final String[] ruleNames = {
		"code", "number", "atom", "unary", "expression", "multiplication", "boolNumber", 
		"boolAtom", "boolUnary", "boolExpression", "boolMultiplication", "boolComparison", 
		"line", "assign", "expressionAssign", "operationAssign", "leftIncrement", 
		"rightIncrement", "declaration", "forLoop", "forAssign", "whileLoop", 
		"condition", "body", "iff", "ifTrue", "ifFalse", "print", "read"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'%'", "'!'", "'||'", 
		"'^'", "'&&'", "';'", "'='", "'++'", "'--'", "'{'", "'}'", null, null, 
		null, null, null, "'int'", "'for'", "'while'", "'if'", "'else'", "'print'", 
		"'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BOOLCONST", "NUMBER", "DIGIT", "BOOLOPERATION", 
		"OPERATION", "INT", "FOR", "WHILE", "IF", "ELSE", "PRINT", "READ", "VARIABLE", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodeContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << INT) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(58);
				line();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public Token num;
		public Token var;
		public TerminalNode NUMBER() { return getToken(JavaGrammarParser.NUMBER, 0); }
		public TerminalNode VARIABLE() { return getToken(JavaGrammarParser.VARIABLE, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_number);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((NumberContext)_localctx).num = match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				((NumberContext)_localctx).var = match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				number();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__0);
				setState(70);
				expression(0);
				setState(71);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(75);
				match(T__2);
				}
			}

			setState(78);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(81);
			multiplication(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(83);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(84);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(85);
					multiplication(0);
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicationContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMultiplication(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		return multiplication(0);
	}

	private MultiplicationContext multiplication(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, _parentState);
		MultiplicationContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_multiplication, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(92);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplication);
					setState(94);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(95);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(96);
					unary();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolNumberContext extends ParserRuleContext {
		public Token boolConst;
		public Token boolVar;
		public TerminalNode BOOLCONST() { return getToken(JavaGrammarParser.BOOLCONST, 0); }
		public TerminalNode VARIABLE() { return getToken(JavaGrammarParser.VARIABLE, 0); }
		public BoolNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBoolNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBoolNumber(this);
		}
	}

	public final BoolNumberContext boolNumber() throws RecognitionException {
		BoolNumberContext _localctx = new BoolNumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_boolNumber);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLCONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				((BoolNumberContext)_localctx).boolConst = match(BOOLCONST);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				((BoolNumberContext)_localctx).boolVar = match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolAtomContext extends ParserRuleContext {
		public BoolNumberContext boolNumber() {
			return getRuleContext(BoolNumberContext.class,0);
		}
		public BoolComparisonContext boolComparison() {
			return getRuleContext(BoolComparisonContext.class,0);
		}
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public BoolAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBoolAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBoolAtom(this);
		}
	}

	public final BoolAtomContext boolAtom() throws RecognitionException {
		BoolAtomContext _localctx = new BoolAtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolAtom);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				boolNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				boolComparison();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__0);
				setState(109);
				boolExpression(0);
				setState(110);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolUnaryContext extends ParserRuleContext {
		public BoolAtomContext boolAtom() {
			return getRuleContext(BoolAtomContext.class,0);
		}
		public BoolUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBoolUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBoolUnary(this);
		}
	}

	public final BoolUnaryContext boolUnary() throws RecognitionException {
		BoolUnaryContext _localctx = new BoolUnaryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(114);
				match(T__7);
				}
			}

			setState(117);
			boolAtom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExpressionContext extends ParserRuleContext {
		public BoolMultiplicationContext boolMultiplication() {
			return getRuleContext(BoolMultiplicationContext.class,0);
		}
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBoolExpression(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		return boolExpression(0);
	}

	private BoolExpressionContext boolExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, _parentState);
		BoolExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_boolExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			boolMultiplication(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
					setState(122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(123);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(124);
					boolMultiplication(0);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolMultiplicationContext extends ParserRuleContext {
		public BoolUnaryContext boolUnary() {
			return getRuleContext(BoolUnaryContext.class,0);
		}
		public BoolMultiplicationContext boolMultiplication() {
			return getRuleContext(BoolMultiplicationContext.class,0);
		}
		public BoolMultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolMultiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBoolMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBoolMultiplication(this);
		}
	}

	public final BoolMultiplicationContext boolMultiplication() throws RecognitionException {
		return boolMultiplication(0);
	}

	private BoolMultiplicationContext boolMultiplication(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolMultiplicationContext _localctx = new BoolMultiplicationContext(_ctx, _parentState);
		BoolMultiplicationContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_boolMultiplication, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			boolUnary();
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolMultiplicationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolMultiplication);
					setState(133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(134);
					match(T__10);
					}
					setState(135);
					boolUnary();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolComparisonContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BOOLOPERATION() { return getToken(JavaGrammarParser.BOOLOPERATION, 0); }
		public BoolComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBoolComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBoolComparison(this);
		}
	}

	public final BoolComparisonContext boolComparison() throws RecognitionException {
		BoolComparisonContext _localctx = new BoolComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolComparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			expression(0);
			setState(142);
			match(BOOLOPERATION);
			setState(143);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public IffContext iff() {
			return getRuleContext(IffContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_line);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				assign();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				declaration();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				iff();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				whileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				forLoop();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				print();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				read();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public ExpressionAssignContext expressionAssign() {
			return getRuleContext(ExpressionAssignContext.class,0);
		}
		public RightIncrementContext rightIncrement() {
			return getRuleContext(RightIncrementContext.class,0);
		}
		public LeftIncrementContext leftIncrement() {
			return getRuleContext(LeftIncrementContext.class,0);
		}
		public OperationAssignContext operationAssign() {
			return getRuleContext(OperationAssignContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				expressionAssign();
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(155);
					match(T__11);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				rightIncrement();
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(159);
					match(T__11);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				leftIncrement();
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(163);
					match(T__11);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				operationAssign();
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(167);
					match(T__11);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAssignContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(JavaGrammarParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterExpressionAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitExpressionAssign(this);
		}
	}

	public final ExpressionAssignContext expressionAssign() throws RecognitionException {
		ExpressionAssignContext _localctx = new ExpressionAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(VARIABLE);
			setState(173);
			match(T__12);
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(174);
				expression(0);
				}
				break;
			case 2:
				{
				setState(175);
				assign();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationAssignContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(JavaGrammarParser.VARIABLE, 0); }
		public TerminalNode OPERATION() { return getToken(JavaGrammarParser.OPERATION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public OperationAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterOperationAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitOperationAssign(this);
		}
	}

	public final OperationAssignContext operationAssign() throws RecognitionException {
		OperationAssignContext _localctx = new OperationAssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operationAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(VARIABLE);
			setState(179);
			match(OPERATION);
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(180);
				expression(0);
				}
				break;
			case 2:
				{
				setState(181);
				assign();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftIncrementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(JavaGrammarParser.VARIABLE, 0); }
		public LeftIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLeftIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLeftIncrement(this);
		}
	}

	public final LeftIncrementContext leftIncrement() throws RecognitionException {
		LeftIncrementContext _localctx = new LeftIncrementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_leftIncrement);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__13);
				setState(185);
				match(VARIABLE);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(T__14);
				setState(187);
				match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightIncrementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(JavaGrammarParser.VARIABLE, 0); }
		public RightIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterRightIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitRightIncrement(this);
		}
	}

	public final RightIncrementContext rightIncrement() throws RecognitionException {
		RightIncrementContext _localctx = new RightIncrementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rightIncrement);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(VARIABLE);
				setState(191);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(VARIABLE);
				setState(193);
				match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaGrammarParser.INT, 0); }
		public TerminalNode VARIABLE() { return getToken(JavaGrammarParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(INT);
				setState(197);
				match(VARIABLE);
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(198);
					match(T__11);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(INT);
				setState(202);
				match(VARIABLE);
				setState(203);
				match(T__12);
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(204);
					expression(0);
					}
					break;
				case 2:
					{
					setState(205);
					assign();
					}
					break;
				}
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(208);
					match(T__11);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaGrammarParser.FOR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForAssignContext forAssign() {
			return getRuleContext(ForAssignContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(FOR);
			setState(214);
			match(T__0);
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case VARIABLE:
				{
				setState(215);
				assign();
				}
				break;
			case INT:
				{
				setState(216);
				declaration();
				}
				break;
			case T__11:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			match(T__11);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << BOOLCONST) | (1L << NUMBER) | (1L << VARIABLE))) != 0)) {
				{
				setState(220);
				condition();
				}
			}

			setState(223);
			match(T__11);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << VARIABLE))) != 0)) {
				{
				setState(224);
				forAssign();
				}
			}

			setState(227);
			match(T__1);
			setState(228);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForAssignContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ForAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterForAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitForAssign(this);
		}
	}

	public final ForAssignContext forAssign() throws RecognitionException {
		ForAssignContext _localctx = new ForAssignContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			assign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaGrammarParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(WHILE);
			setState(233);
			match(T__0);
			setState(234);
			condition();
			setState(235);
			match(T__1);
			setState(236);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			boolExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__15);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << INT) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(241);
				line();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IffContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaGrammarParser.IF, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public IfTrueContext ifTrue() {
			return getRuleContext(IfTrueContext.class,0);
		}
		public IfFalseContext ifFalse() {
			return getRuleContext(IfFalseContext.class,0);
		}
		public IffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterIff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitIff(this);
		}
	}

	public final IffContext iff() throws RecognitionException {
		IffContext _localctx = new IffContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_iff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IF);
			setState(250);
			match(T__0);
			setState(251);
			boolExpression(0);
			setState(252);
			match(T__1);
			setState(253);
			ifTrue();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(254);
				ifFalse();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfTrueContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public IfTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterIfTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitIfTrue(this);
		}
	}

	public final IfTrueContext ifTrue() throws RecognitionException {
		IfTrueContext _localctx = new IfTrueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifTrue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__15);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << INT) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(258);
				line();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfFalseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(JavaGrammarParser.ELSE, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public IfFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterIfFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitIfFalse(this);
		}
	}

	public final IfFalseContext ifFalse() throws RecognitionException {
		IfFalseContext _localctx = new IfFalseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifFalse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(266);
			match(ELSE);
			setState(267);
			match(T__15);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << INT) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(268);
				line();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(T__16);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(JavaGrammarParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(PRINT);
			setState(277);
			match(T__0);
			setState(278);
			expression(0);
			setState(279);
			match(T__1);
			setState(280);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(JavaGrammarParser.READ, 0); }
		public TerminalNode VARIABLE() { return getToken(JavaGrammarParser.VARIABLE, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(READ);
			setState(283);
			match(T__0);
			setState(284);
			match(VARIABLE);
			setState(285);
			match(T__1);
			setState(286);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 5:
			return multiplication_sempred((MultiplicationContext)_localctx, predIndex);
		case 9:
			return boolExpression_sempred((BoolExpressionContext)_localctx, predIndex);
		case 10:
			return boolMultiplication_sempred((BoolMultiplicationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplication_sempred(MultiplicationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolExpression_sempred(BoolExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolMultiplication_sempred(BoolMultiplicationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0123\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\5\5O\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7d\n\7\f\7\16\7g\13\7\3\b\3\b\5\bk\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\ts\n\t\3\n\5\nv\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0080\n\13\f\13\16\13\u0083\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008b\n"+
		"\f\f\f\16\f\u008e\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u009b\n\16\3\17\3\17\5\17\u009f\n\17\3\17\3\17\5\17\u00a3\n\17"+
		"\3\17\3\17\5\17\u00a7\n\17\3\17\3\17\5\17\u00ab\n\17\5\17\u00ad\n\17\3"+
		"\20\3\20\3\20\3\20\5\20\u00b3\n\20\3\21\3\21\3\21\3\21\5\21\u00b9\n\21"+
		"\3\22\3\22\3\22\3\22\5\22\u00bf\n\22\3\23\3\23\3\23\3\23\5\23\u00c5\n"+
		"\23\3\24\3\24\3\24\5\24\u00ca\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d1"+
		"\n\24\3\24\5\24\u00d4\n\24\5\24\u00d6\n\24\3\25\3\25\3\25\3\25\5\25\u00dc"+
		"\n\25\3\25\3\25\5\25\u00e0\n\25\3\25\3\25\5\25\u00e4\n\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\7\31\u00f5"+
		"\n\31\f\31\16\31\u00f8\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0102\n\32\3\33\3\33\7\33\u0106\n\33\f\33\16\33\u0109\13\33\3\33\3"+
		"\33\3\34\3\34\3\34\7\34\u0110\n\34\f\34\16\34\u0113\13\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\2\6\n"+
		"\f\24\26\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:\2\5\3\2\5\6\3\2\7\t\3\2\13\f\u012e\2?\3\2\2\2\4D\3\2\2\2\6K\3\2\2\2"+
		"\bN\3\2\2\2\nR\3\2\2\2\f]\3\2\2\2\16j\3\2\2\2\20r\3\2\2\2\22u\3\2\2\2"+
		"\24y\3\2\2\2\26\u0084\3\2\2\2\30\u008f\3\2\2\2\32\u009a\3\2\2\2\34\u00ac"+
		"\3\2\2\2\36\u00ae\3\2\2\2 \u00b4\3\2\2\2\"\u00be\3\2\2\2$\u00c4\3\2\2"+
		"\2&\u00d5\3\2\2\2(\u00d7\3\2\2\2*\u00e8\3\2\2\2,\u00ea\3\2\2\2.\u00f0"+
		"\3\2\2\2\60\u00f2\3\2\2\2\62\u00fb\3\2\2\2\64\u0103\3\2\2\2\66\u010c\3"+
		"\2\2\28\u0116\3\2\2\2:\u011c\3\2\2\2<>\5\32\16\2=<\3\2\2\2>A\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BE\7\25\2\2CE\7 \2\2DB\3\2\2\2"+
		"DC\3\2\2\2E\5\3\2\2\2FL\5\4\3\2GH\7\3\2\2HI\5\n\6\2IJ\7\4\2\2JL\3\2\2"+
		"\2KF\3\2\2\2KG\3\2\2\2L\7\3\2\2\2MO\7\5\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2"+
		"\2\2PQ\5\6\4\2Q\t\3\2\2\2RS\b\6\1\2ST\5\f\7\2TZ\3\2\2\2UV\f\3\2\2VW\t"+
		"\2\2\2WY\5\f\7\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2"+
		"\\Z\3\2\2\2]^\b\7\1\2^_\5\b\5\2_e\3\2\2\2`a\f\3\2\2ab\t\3\2\2bd\5\b\5"+
		"\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3\2\2\2ge\3\2\2\2hk\7\24"+
		"\2\2ik\7 \2\2jh\3\2\2\2ji\3\2\2\2k\17\3\2\2\2ls\5\16\b\2ms\5\30\r\2no"+
		"\7\3\2\2op\5\24\13\2pq\7\4\2\2qs\3\2\2\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2"+
		"s\21\3\2\2\2tv\7\n\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\20\t\2x\23\3"+
		"\2\2\2yz\b\13\1\2z{\5\26\f\2{\u0081\3\2\2\2|}\f\3\2\2}~\t\4\2\2~\u0080"+
		"\5\26\f\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\25\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\b\f\1\2\u0085"+
		"\u0086\5\22\n\2\u0086\u008c\3\2\2\2\u0087\u0088\f\3\2\2\u0088\u0089\7"+
		"\r\2\2\u0089\u008b\5\22\n\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e\u008c\3\2\2"+
		"\2\u008f\u0090\5\n\6\2\u0090\u0091\7\27\2\2\u0091\u0092\5\n\6\2\u0092"+
		"\31\3\2\2\2\u0093\u009b\5\34\17\2\u0094\u009b\5&\24\2\u0095\u009b\5\62"+
		"\32\2\u0096\u009b\5,\27\2\u0097\u009b\5(\25\2\u0098\u009b\58\35\2\u0099"+
		"\u009b\5:\36\2\u009a\u0093\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0095\3\2"+
		"\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\33\3\2\2\2\u009c\u009e\5\36\20\2\u009d\u009f\7\16"+
		"\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00ad\3\2\2\2\u00a0"+
		"\u00a2\5$\23\2\u00a1\u00a3\7\16\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3"+
		"\2\2\2\u00a3\u00ad\3\2\2\2\u00a4\u00a6\5\"\22\2\u00a5\u00a7\7\16\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ad\3\2\2\2\u00a8\u00aa\5 "+
		"\21\2\u00a9\u00ab\7\16\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u009c\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a4\3\2"+
		"\2\2\u00ac\u00a8\3\2\2\2\u00ad\35\3\2\2\2\u00ae\u00af\7 \2\2\u00af\u00b2"+
		"\7\17\2\2\u00b0\u00b3\5\n\6\2\u00b1\u00b3\5\34\17\2\u00b2\u00b0\3\2\2"+
		"\2\u00b2\u00b1\3\2\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\7 \2\2\u00b5\u00b8"+
		"\7\30\2\2\u00b6\u00b9\5\n\6\2\u00b7\u00b9\5\34\17\2\u00b8\u00b6\3\2\2"+
		"\2\u00b8\u00b7\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00bb\7\20\2\2\u00bb\u00bf"+
		"\7 \2\2\u00bc\u00bd\7\21\2\2\u00bd\u00bf\7 \2\2\u00be\u00ba\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf#\3\2\2\2\u00c0\u00c1\7 \2\2\u00c1\u00c5\7\20\2\2"+
		"\u00c2\u00c3\7 \2\2\u00c3\u00c5\7\21\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5%\3\2\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00c9\7 \2\2\u00c8"+
		"\u00ca\7\16\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d6\3"+
		"\2\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\7 \2\2\u00cd\u00d0\7\17\2\2\u00ce"+
		"\u00d1\5\n\6\2\u00cf\u00d1\5\34\17\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\7\16\2\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00c6\3\2\2\2\u00d5\u00cb\3\2"+
		"\2\2\u00d6\'\3\2\2\2\u00d7\u00d8\7\32\2\2\u00d8\u00db\7\3\2\2\u00d9\u00dc"+
		"\5\34\17\2\u00da\u00dc\5&\24\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\7\16\2\2\u00de\u00e0"+
		"\5.\30\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\7\16\2\2\u00e2\u00e4\5*\26\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\4\2\2\u00e6\u00e7\5\60\31\2\u00e7"+
		")\3\2\2\2\u00e8\u00e9\5\34\17\2\u00e9+\3\2\2\2\u00ea\u00eb\7\33\2\2\u00eb"+
		"\u00ec\7\3\2\2\u00ec\u00ed\5.\30\2\u00ed\u00ee\7\4\2\2\u00ee\u00ef\5\60"+
		"\31\2\u00ef-\3\2\2\2\u00f0\u00f1\5\24\13\2\u00f1/\3\2\2\2\u00f2\u00f6"+
		"\7\22\2\2\u00f3\u00f5\5\32\16\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2"+
		"\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\u00fa\7\23\2\2\u00fa\61\3\2\2\2\u00fb\u00fc\7\34\2\2\u00fc"+
		"\u00fd\7\3\2\2\u00fd\u00fe\5\24\13\2\u00fe\u00ff\7\4\2\2\u00ff\u0101\5"+
		"\64\33\2\u0100\u0102\5\66\34\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0102\63\3\2\2\2\u0103\u0107\7\22\2\2\u0104\u0106\5\32\16\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\23\2\2\u010b\65\3\2\2"+
		"\2\u010c\u010d\7\35\2\2\u010d\u0111\7\22\2\2\u010e\u0110\5\32\16\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\23\2\2\u0115"+
		"\67\3\2\2\2\u0116\u0117\7\36\2\2\u0117\u0118\7\3\2\2\u0118\u0119\5\n\6"+
		"\2\u0119\u011a\7\4\2\2\u011a\u011b\7\16\2\2\u011b9\3\2\2\2\u011c\u011d"+
		"\7\37\2\2\u011d\u011e\7\3\2\2\u011e\u011f\7 \2\2\u011f\u0120\7\4\2\2\u0120"+
		"\u0121\7\16\2\2\u0121;\3\2\2\2\"?DKNZejru\u0081\u008c\u009a\u009e\u00a2"+
		"\u00a6\u00aa\u00ac\u00b2\u00b8\u00be\u00c4\u00c9\u00d0\u00d3\u00d5\u00db"+
		"\u00df\u00e3\u00f6\u0101\u0107\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}