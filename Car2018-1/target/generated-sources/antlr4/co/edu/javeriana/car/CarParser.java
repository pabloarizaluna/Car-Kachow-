// Generated from co\edu\javeriana\car\Car.g4 by ANTLR 4.5.1
package co.edu.javeriana.car;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PROGRAM=3, VAR=4, FUNCTION=5, IF=6, ELSE=7, WHILE=8, RF=9, 
		RB=10, TF=11, TR=12, SET_COLOR=13, WRITELN=14, PLUS=15, MINUS=16, MULT=17, 
		DIV=18, GT=19, LT=20, GEQ=21, LEQ=22, EQ=23, NEQ=24, ASSIGN=25, AND=26, 
		OR=27, NOT=28, BRACKET_OPEN=29, BRACKET_CLOSE=30, PAR_OPEN=31, PAR_CLOSE=32, 
		COMMA=33, TRUE=34, FALSE=35, STRING=36, ID=37, NUMBER=38, WS=39;
	public static final int
		RULE_start = 0;
	public static final String[] ruleNames = {
		"start"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", "'world'", "'program'", "'var'", "'procedure'", "'if'", 
		"'else'", "'while'", "'run_foward'", "'run_backwards'", "'turn_left'", 
		"'turn_right'", "'set_color'", "'writeln'", "'+'", "'-'", "'*'", "'/'", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'<>'", "'='", "'&&'", "'||'", "'!'", 
		"'{'", "'}'", "'('", "')'", "','", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "PROGRAM", "VAR", "FUNCTION", "IF", "ELSE", "WHILE", 
		"RF", "RB", "TF", "TR", "SET_COLOR", "WRITELN", "PLUS", "MINUS", "MULT", 
		"DIV", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "AND", "OR", "NOT", 
		"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "COMMA", "TRUE", 
		"FALSE", "STRING", "ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Car.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	private Car car;

	public CarParser(TokenStream input, Car car) {
	    this(input);
	    this.car = car;
	}

	public CarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CarVisitor ) return ((CarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T__0);
			setState(3);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\b\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\2\2\3\2\2\2\6\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\4\2\2\6\3\3\2\2"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}