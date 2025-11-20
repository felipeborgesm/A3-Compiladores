// Generated from Rex.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, ID=29, NUM_INT=30, NUM_REAL=31, 
		STRING=32, WS=33, COMENTARIO_LINHA=34, COMENTARIO_BLOCO=35;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_bloco = 2, RULE_declaracao = 3, 
		RULE_tipo = 4, RULE_atribuicao = 5, RULE_estruturaIf = 6, RULE_estruturaWhile = 7, 
		RULE_comandoIO = 8, RULE_expressao = 9, RULE_atom = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "bloco", "declaracao", "tipo", "atribuicao", "estruturaIf", 
			"estruturaWhile", "comandoIO", "expressao", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'inteiro'", "'real'", "'booleano'", "'texto'", 
			"'='", "'se'", "'('", "')'", "'senao'", "'enquanto'", "'escreva'", "'leia'", 
			"'ou'", "'e'", "'>'", "'<'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", 
			"'!'", "'verdadeiro'", "'falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "NUM_INT", "NUM_REAL", "STRING", 
			"WS", "COMENTARIO_LINHA", "COMENTARIO_BLOCO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Rex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RexParser.EOF, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536929010L) != 0)) {
				{
				{
				setState(22);
				comando();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public EstruturaIfContext estruturaIf() {
			return getRuleContext(EstruturaIfContext.class,0);
		}
		public EstruturaWhileContext estruturaWhile() {
			return getRuleContext(EstruturaWhileContext.class,0);
		}
		public ComandoIOContext comandoIO() {
			return getRuleContext(ComandoIOContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				declaracao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				atribuicao();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				estruturaIf();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				estruturaWhile();
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				comandoIO();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536929010L) != 0)) {
				{
				{
				setState(39);
				comando();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(RexParser.ID, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			tipo();
			setState(48);
			match(ID);
			setState(49);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RexParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ID);
			setState(54);
			match(T__7);
			setState(55);
			expressao(0);
			setState(56);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EstruturaIfContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public EstruturaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaIf; }
	}

	public final EstruturaIfContext estruturaIf() throws RecognitionException {
		EstruturaIfContext _localctx = new EstruturaIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_estruturaIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__8);
			setState(59);
			match(T__9);
			setState(60);
			expressao(0);
			setState(61);
			match(T__10);
			setState(62);
			bloco();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(63);
				match(T__11);
				setState(64);
				bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EstruturaWhileContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public EstruturaWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaWhile; }
	}

	public final EstruturaWhileContext estruturaWhile() throws RecognitionException {
		EstruturaWhileContext _localctx = new EstruturaWhileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_estruturaWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__12);
			setState(68);
			match(T__9);
			setState(69);
			expressao(0);
			setState(70);
			match(T__10);
			setState(71);
			bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoIOContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ID() { return getToken(RexParser.ID, 0); }
		public ComandoIOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoIO; }
	}

	public final ComandoIOContext comandoIO() throws RecognitionException {
		ComandoIOContext _localctx = new ComandoIOContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandoIO);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__13);
				setState(74);
				match(T__9);
				setState(75);
				expressao(0);
				setState(76);
				match(T__10);
				setState(77);
				match(T__2);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__14);
				setState(80);
				match(T__9);
				setState(81);
				match(ID);
				setState(82);
				match(T__10);
				setState(83);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAtomContext extends ExpressaoContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprAtomContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicaEContext extends ExpressaoContext {
		public Token op;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ExprLogicaEContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAditivaContext extends ExpressaoContext {
		public Token op;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ExprAditivaContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicaOuContext extends ExpressaoContext {
		public Token op;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ExprLogicaOuContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelacionalContext extends ExpressaoContext {
		public Token op;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ExprRelacionalContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNegacaoContext extends ExpressaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExprNegacaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultiplicativaContext extends ExpressaoContext {
		public Token op;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ExprMultiplicativaContext(ExpressaoContext ctx) { copyFrom(ctx); }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				{
				_localctx = new ExprNegacaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(87);
				match(T__25);
				setState(88);
				expressao(2);
				}
				break;
			case T__9:
			case T__26:
			case T__27:
			case ID:
			case NUM_INT:
			case NUM_REAL:
			case STRING:
				{
				_localctx = new ExprAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprLogicaOuContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(92);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(93);
						((ExprLogicaOuContext)_localctx).op = match(T__15);
						setState(94);
						expressao(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprLogicaEContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(95);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(96);
						((ExprLogicaEContext)_localctx).op = match(T__16);
						setState(97);
						expressao(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelacionalContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(98);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(99);
						((ExprRelacionalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
							((ExprRelacionalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						expressao(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprAditivaContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						((ExprAditivaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((ExprAditivaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						expressao(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprMultiplicativaContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(105);
						((ExprMultiplicativaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((ExprMultiplicativaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						expressao(4);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomIdContext extends AtomContext {
		public TerminalNode ID() { return getToken(RexParser.ID, 0); }
		public AtomIdContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomIntContext extends AtomContext {
		public TerminalNode NUM_INT() { return getToken(RexParser.NUM_INT, 0); }
		public AtomIntContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParentesesContext extends AtomContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExprParentesesContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomBooleanoFalseContext extends AtomContext {
		public AtomBooleanoFalseContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomBooleanoTrueContext extends AtomContext {
		public AtomBooleanoTrueContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomStringContext extends AtomContext {
		public TerminalNode STRING() { return getToken(RexParser.STRING, 0); }
		public AtomStringContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomRealContext extends AtomContext {
		public TerminalNode NUM_REAL() { return getToken(RexParser.NUM_REAL, 0); }
		public AtomRealContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new ExprParentesesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__9);
				setState(113);
				expressao(0);
				setState(114);
				match(T__10);
				}
				break;
			case NUM_INT:
				_localctx = new AtomIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(NUM_INT);
				}
				break;
			case NUM_REAL:
				_localctx = new AtomRealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(NUM_REAL);
				}
				break;
			case T__26:
				_localctx = new AtomBooleanoTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new AtomBooleanoFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				match(T__27);
				}
				break;
			case ID:
				_localctx = new AtomIdContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new AtomStringContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				match(STRING);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#}\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018\b\u0000"+
		"\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001%\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002\n\u0002\f\u0002,\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006B\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bU\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t[\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tl\b\t\n\t\f\to\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n{\b\n\u0001\n\u0000\u0001\u0012\u000b\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0000\u0004\u0001\u0000\u0004\u0007\u0001\u0000"+
		"\u0012\u0015\u0001\u0000\u0016\u0017\u0001\u0000\u0018\u0019\u0086\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004&\u0001"+
		"\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000"+
		"\u0000\n5\u0001\u0000\u0000\u0000\f:\u0001\u0000\u0000\u0000\u000eC\u0001"+
		"\u0000\u0000\u0000\u0010T\u0001\u0000\u0000\u0000\u0012Z\u0001\u0000\u0000"+
		"\u0000\u0014z\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000"+
		"\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0005\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000\u0000"+
		"\u001e%\u0003\u0006\u0003\u0000\u001f%\u0003\n\u0005\u0000 %\u0003\f\u0006"+
		"\u0000!%\u0003\u000e\u0007\u0000\"%\u0003\u0010\b\u0000#%\u0003\u0004"+
		"\u0002\u0000$\u001e\u0001\u0000\u0000\u0000$\u001f\u0001\u0000\u0000\u0000"+
		"$ \u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&*\u0005"+
		"\u0001\u0000\u0000\')\u0003\u0002\u0001\u0000(\'\u0001\u0000\u0000\u0000"+
		"),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0002"+
		"\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0003\b\u0004\u000001\u0005"+
		"\u001d\u0000\u000012\u0005\u0003\u0000\u00002\u0007\u0001\u0000\u0000"+
		"\u000034\u0007\u0000\u0000\u00004\t\u0001\u0000\u0000\u000056\u0005\u001d"+
		"\u0000\u000067\u0005\b\u0000\u000078\u0003\u0012\t\u000089\u0005\u0003"+
		"\u0000\u00009\u000b\u0001\u0000\u0000\u0000:;\u0005\t\u0000\u0000;<\u0005"+
		"\n\u0000\u0000<=\u0003\u0012\t\u0000=>\u0005\u000b\u0000\u0000>A\u0003"+
		"\u0004\u0002\u0000?@\u0005\f\u0000\u0000@B\u0003\u0004\u0002\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\r\u0001\u0000\u0000\u0000"+
		"CD\u0005\r\u0000\u0000DE\u0005\n\u0000\u0000EF\u0003\u0012\t\u0000FG\u0005"+
		"\u000b\u0000\u0000GH\u0003\u0004\u0002\u0000H\u000f\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u000e\u0000\u0000JK\u0005\n\u0000\u0000KL\u0003\u0012\t"+
		"\u0000LM\u0005\u000b\u0000\u0000MN\u0005\u0003\u0000\u0000NU\u0001\u0000"+
		"\u0000\u0000OP\u0005\u000f\u0000\u0000PQ\u0005\n\u0000\u0000QR\u0005\u001d"+
		"\u0000\u0000RS\u0005\u000b\u0000\u0000SU\u0005\u0003\u0000\u0000TI\u0001"+
		"\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000U\u0011\u0001\u0000\u0000"+
		"\u0000VW\u0006\t\uffff\uffff\u0000WX\u0005\u001a\u0000\u0000X[\u0003\u0012"+
		"\t\u0002Y[\u0003\u0014\n\u0000ZV\u0001\u0000\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000[m\u0001\u0000\u0000\u0000\\]\n\u0007\u0000\u0000]^\u0005"+
		"\u0010\u0000\u0000^l\u0003\u0012\t\b_`\n\u0006\u0000\u0000`a\u0005\u0011"+
		"\u0000\u0000al\u0003\u0012\t\u0007bc\n\u0005\u0000\u0000cd\u0007\u0001"+
		"\u0000\u0000dl\u0003\u0012\t\u0006ef\n\u0004\u0000\u0000fg\u0007\u0002"+
		"\u0000\u0000gl\u0003\u0012\t\u0005hi\n\u0003\u0000\u0000ij\u0007\u0003"+
		"\u0000\u0000jl\u0003\u0012\t\u0004k\\\u0001\u0000\u0000\u0000k_\u0001"+
		"\u0000\u0000\u0000kb\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000"+
		"kh\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000n\u0013\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pq\u0005\n\u0000\u0000qr\u0003\u0012\t\u0000rs\u0005"+
		"\u000b\u0000\u0000s{\u0001\u0000\u0000\u0000t{\u0005\u001e\u0000\u0000"+
		"u{\u0005\u001f\u0000\u0000v{\u0005\u001b\u0000\u0000w{\u0005\u001c\u0000"+
		"\u0000x{\u0005\u001d\u0000\u0000y{\u0005 \u0000\u0000zp\u0001\u0000\u0000"+
		"\u0000zt\u0001\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000zv\u0001\u0000"+
		"\u0000\u0000zw\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{\u0015\u0001\u0000\u0000\u0000\t\u0019$*ATZkmz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}