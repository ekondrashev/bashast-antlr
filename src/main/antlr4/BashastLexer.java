// Generated from src/main/antlr4/Bashast.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BashastLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, BANG=2, CASE=3, DO=4, DONE=5, ELIF=6, ELSE=7, ESAC=8, FI=9, 
		FOR=10, IF=11, IN=12, SELECT=13, THEN=14, UNTIL=15, WHILE=16, LBRACE=17, 
		RBRACE=18, TIME=19, RPAREN=20, LPAREN=21, LLPAREN=22, LSQUARE=23, RSQUARE=24, 
		TICK=25, DOLLAR=26, AT=27, DOT=28, DOTDOT=29, TIMES=30, EQUALS=31, MINUS=32, 
		PLUS=33, EXP=34, AMP=35, CARET=36, LESS_THAN=37, GREATER_THAN=38, LSHIFT=39, 
		RSHIFT=40, AMP_LESS_THAN=41, AMP_GREATER_THAN=42, AMP_RSHIFT=43, SEMIC=44, 
		DOUBLE_SEMIC=45, PIPE=46, ESC_DQUOTE=47, ESC_SQUOTE=48, DQUOTE=49, SQUOTE=50, 
		SINGLE_QUOTED_STRING_TOKEN=51, COMMA=52, BLANK=53, EOL=54, DIGIT=55, NUMBER=56, 
		LETTER=57, TILDE=58, HERE_STRING_OP=59, POUND=60, PCT=61, PCTPCT=62, SLASH=63, 
		COLON=64, QMARK=65, LOCAL=66, EXPORT=67, DECLARE=68, LOGICAND=69, LOGICOR=70, 
		CONTINUE_LINE=71, ESC_RPAREN=72, ESC_LPAREN=73, ESC_RSQUARE=74, ESC_LSQUARE=75, 
		ESC_DOLLAR=76, ESC_TICK=77, COMMAND_SUBSTITUTION_PAREN=78, COMMAND_SUBSTITUTION_TICK=79, 
		ESC_LT=80, ESC_GT=81, ESC=82, UNDERSCORE=83, NAME=84, OTHER=85;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", 
		"'P'", "'Q'", "'R'", "'S'", "'T'", "'U'"
	};
	public static final String[] ruleNames = {
		"COMMENT", "BANG", "CASE", "DO", "DONE", "ELIF", "ELSE", "ESAC", "FI", 
		"FOR", "IF", "IN", "SELECT", "THEN", "UNTIL", "WHILE", "LBRACE", "RBRACE", 
		"TIME", "RPAREN", "LPAREN", "LLPAREN", "LSQUARE", "RSQUARE", "TICK", "DOLLAR", 
		"AT", "DOT", "DOTDOT", "TIMES", "EQUALS", "MINUS", "PLUS", "EXP", "AMP", 
		"CARET", "LESS_THAN", "GREATER_THAN", "LSHIFT", "RSHIFT", "AMP_LESS_THAN", 
		"AMP_GREATER_THAN", "AMP_RSHIFT", "SEMIC", "DOUBLE_SEMIC", "PIPE", "ESC_DQUOTE", 
		"ESC_SQUOTE", "DQUOTE", "SQUOTE", "SINGLE_QUOTED_STRING_TOKEN", "COMMA", 
		"BLANK", "EOL", "DIGIT", "NUMBER", "LETTER", "ALPHANUM", "TILDE", "HERE_STRING_OP", 
		"POUND", "PCT", "PCTPCT", "SLASH", "COLON", "QMARK", "LOCAL", "EXPORT", 
		"DECLARE", "LOGICAND", "LOGICOR", "CONTINUE_LINE", "ESC_RPAREN", "ESC_LPAREN", 
		"ESC_RSQUARE", "ESC_LSQUARE", "ESC_DOLLAR", "ESC_TICK", "COMMAND_SUBSTITUTION_PAREN", 
		"COMMAND_SUBSTITUTION_TICK", "ESC_LT", "ESC_GT", "ESC", "UNDERSCORE", 
		"NAME", "OTHER"
	};



		boolean double_quoted = false;
		int paren_level = 0;
		int LA(int index) {
			return _input.LA(index);
		}


	public BashastLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bashast.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 48: DQUOTE_action((RuleContext)_localctx, actionIndex); break;
		case 78: COMMAND_SUBSTITUTION_PAREN_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void DQUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  if(LA(-1) != '\\') double_quoted = double_quoted;  break;
		}
	}
	private void COMMAND_SUBSTITUTION_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  paren_level = 1;  break;
		case 2:  ++paren_level;  break;
		case 3: 
									if(--paren_level == 0)
									{
										System.out.println("Parenlevel is 0");
										// throw new UnsupportedOperationException("Command substitution paren: RPAREN");
										//state.type = _type;
										//state.channel = _channel;

										//return;
									}
								 break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return COMMENT_sempred((RuleContext)_localctx, predIndex);
		case 47: return ESC_SQUOTE_sempred((RuleContext)_localctx, predIndex);
		case 49: return SQUOTE_sempred((RuleContext)_localctx, predIndex);
		case 50: return SINGLE_QUOTED_STRING_TOKEN_sempred((RuleContext)_localctx, predIndex);
		case 78: return COMMAND_SUBSTITUTION_PAREN_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean COMMAND_SUBSTITUTION_PAREN_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return LA(1) == '$' && LA(2) == '(' && LA(3) != '(';
		}
		return true;
	}
	private boolean SQUOTE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return  double_quoted ;
		}
		return true;
	}
	private boolean COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return  double_quoted ;
		}
		return true;
	}
	private boolean SINGLE_QUOTED_STRING_TOKEN_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return  double_quoted ;
		}
		return true;
	}
	private boolean ESC_SQUOTE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return  double_quoted ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2W\u01f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\5\2\u00b3\n\2\3\2\3\2\7\2\u00b7\n\2\f\2"+
		"\16\2\u00ba\13\2\3\2\3\2\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3"+
		"*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u0158\n\64"+
		"\f\64\16\64\u015b\13\64\3\64\3\64\3\65\3\65\3\66\6\66\u0162\n\66\r\66"+
		"\16\66\u0163\3\67\5\67\u0167\n\67\3\67\6\67\u016a\n\67\r\67\16\67\u016b"+
		"\38\38\39\39\69\u0172\n9\r9\169\u0173\3:\3:\3;\3;\5;\u017a\n;\3<\3<\3"+
		"=\3=\3=\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3"+
		"E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3"+
		"I\6I\u01ad\nI\rI\16I\u01ae\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3"+
		"N\3N\3N\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\6P\u01d3\n"+
		"P\rP\16P\u01d4\3Q\3Q\6Q\u01d9\nQ\rQ\16Q\u01da\3Q\3Q\3Q\3R\3R\3R\3S\3S"+
		"\3S\3T\3T\3U\3U\3V\3V\5V\u01ec\nV\3V\3V\6V\u01f0\nV\rV\16V\u01f1\3W\3"+
		"W\2\2X\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q:s;u\2w<y={>}?\177@\u0081A\u0083B\u0085C\u0087D\u0089E\u008b"+
		"F\u008dG\u008fH\u0091I\u0093J\u0095K\u0097L\u0099M\u009bN\u009dO\u009f"+
		"P\u00a1Q\u00a3R\u00a5S\u00a7T\u00a9U\u00abV\u00adW\3\2\6\4\2\f\f\17\17"+
		"\4\2\13\13\"\"\4\2C\\c|\3\2^^\u0204\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\3\u00af\3\2\2\2\5\u00bd\3\2\2\2\7\u00be\3\2\2\2\t\u00c3\3\2\2\2\13"+
		"\u00c6\3\2\2\2\r\u00cb\3\2\2\2\17\u00d0\3\2\2\2\21\u00d5\3\2\2\2\23\u00da"+
		"\3\2\2\2\25\u00dd\3\2\2\2\27\u00e1\3\2\2\2\31\u00e4\3\2\2\2\33\u00e7\3"+
		"\2\2\2\35\u00ee\3\2\2\2\37\u00f3\3\2\2\2!\u00f9\3\2\2\2#\u00ff\3\2\2\2"+
		"%\u0101\3\2\2\2\'\u0103\3\2\2\2)\u0108\3\2\2\2+\u010a\3\2\2\2-\u010c\3"+
		"\2\2\2/\u010f\3\2\2\2\61\u0111\3\2\2\2\63\u0113\3\2\2\2\65\u0115\3\2\2"+
		"\2\67\u0117\3\2\2\29\u0119\3\2\2\2;\u011b\3\2\2\2=\u011e\3\2\2\2?\u0120"+
		"\3\2\2\2A\u0122\3\2\2\2C\u0124\3\2\2\2E\u0126\3\2\2\2G\u0129\3\2\2\2I"+
		"\u012b\3\2\2\2K\u012c\3\2\2\2M\u012e\3\2\2\2O\u0130\3\2\2\2Q\u0133\3\2"+
		"\2\2S\u0136\3\2\2\2U\u0139\3\2\2\2W\u013c\3\2\2\2Y\u0140\3\2\2\2[\u0142"+
		"\3\2\2\2]\u0145\3\2\2\2_\u0147\3\2\2\2a\u014a\3\2\2\2c\u014e\3\2\2\2e"+
		"\u0151\3\2\2\2g\u0154\3\2\2\2i\u015e\3\2\2\2k\u0161\3\2\2\2m\u0169\3\2"+
		"\2\2o\u016d\3\2\2\2q\u016f\3\2\2\2s\u0175\3\2\2\2u\u0179\3\2\2\2w\u017b"+
		"\3\2\2\2y\u017d\3\2\2\2{\u0181\3\2\2\2}\u0183\3\2\2\2\177\u0185\3\2\2"+
		"\2\u0081\u0188\3\2\2\2\u0083\u018a\3\2\2\2\u0085\u018c\3\2\2\2\u0087\u018e"+
		"\3\2\2\2\u0089\u0194\3\2\2\2\u008b\u019b\3\2\2\2\u008d\u01a3\3\2\2\2\u008f"+
		"\u01a6\3\2\2\2\u0091\u01ac\3\2\2\2\u0093\u01b2\3\2\2\2\u0095\u01b5\3\2"+
		"\2\2\u0097\u01b8\3\2\2\2\u0099\u01bb\3\2\2\2\u009b\u01be\3\2\2\2\u009d"+
		"\u01c1\3\2\2\2\u009f\u01c4\3\2\2\2\u00a1\u01d6\3\2\2\2\u00a3\u01df\3\2"+
		"\2\2\u00a5\u01e2\3\2\2\2\u00a7\u01e5\3\2\2\2\u00a9\u01e7\3\2\2\2\u00ab"+
		"\u01eb\3\2\2\2\u00ad\u01f3\3\2\2\2\u00af\u00b2\6\2\2\2\u00b0\u00b3\5k"+
		"\66\2\u00b1\u00b3\5m\67\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b8\7%\2\2\u00b5\u00b7\n\2\2\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\b\2\2\2\u00bc\4\3\2\2\2"+
		"\u00be\u00bf\7e\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\b\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7q\2\2\u00c5\n"+
		"\3\2\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\f\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7n\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cf\16\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2\2\u00d4\20\3\2\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7e\2\2"+
		"\u00d9\22\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7k\2\2\u00dc\24\3\2\2"+
		"\2\u00dd\u00de\7h\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\26\3"+
		"\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7h\2\2\u00e3\30\3\2\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\32\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7e\2\2\u00ec"+
		"\u00ed\7v\2\2\u00ed\34\3\2\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7j\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7p\2\2\u00f2\36\3\2\2\2\u00f3\u00f4\7w\2\2\u00f4"+
		"\u00f5\7p\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7n\2\2"+
		"\u00f8 \3\2\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc\7k\2"+
		"\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7g\2\2\u00fe\"\3\2\2\2\u00ff\u0100\7"+
		"}\2\2\u0100$\3\2\2\2\u0101\u0102\7\177\2\2\u0102&\3\2\2\2\u0103\u0104"+
		"\7v\2\2\u0104\u0105\7k\2\2\u0105\u0106\7o\2\2\u0106\u0107\7g\2\2\u0107"+
		"(\3\2\2\2\u0108\u0109\7+\2\2\u0109*\3\2\2\2\u010a\u010b\7*\2\2\u010b,"+
		"\3\2\2\2\u010c\u010d\7*\2\2\u010d\u010e\7*\2\2\u010e.\3\2\2\2\u010f\u0110"+
		"\7]\2\2\u0110\60\3\2\2\2\u0111\u0112\7_\2\2\u0112\62\3\2\2\2\u0113\u0114"+
		"\7b\2\2\u0114\64\3\2\2\2\u0115\u0116\7&\2\2\u0116\66\3\2\2\2\u0117\u0118"+
		"\7B\2\2\u01188\3\2\2\2\u0119\u011a\7\60\2\2\u011a:\3\2\2\2\u011b\u011c"+
		"\7\60\2\2\u011c\u011d\7\60\2\2\u011d<\3\2\2\2\u011e\u011f\7,\2\2\u011f"+
		">\3\2\2\2\u0120\u0121\7?\2\2\u0121@\3\2\2\2\u0122\u0123\7/\2\2\u0123B"+
		"\3\2\2\2\u0124\u0125\7-\2\2\u0125D\3\2\2\2\u0126\u0127\7,\2\2\u0127\u0128"+
		"\7,\2\2\u0128F\3\2\2\2\u0129\u012a\7(\2\2\u012aH\3\2\2\2\u012c\u012d\7"+
		">\2\2\u012dL\3\2\2\2\u012e\u012f\7@\2\2\u012fN\3\2\2\2\u0130\u0131\7>"+
		"\2\2\u0131\u0132\7>\2\2\u0132P\3\2\2\2\u0133\u0134\7@\2\2\u0134\u0135"+
		"\7@\2\2\u0135R\3\2\2\2\u0136\u0137\7(\2\2\u0137\u0138\7>\2\2\u0138T\3"+
		"\2\2\2\u0139\u013a\7(\2\2\u013a\u013b\7@\2\2\u013bV\3\2\2\2\u013c\u013d"+
		"\7(\2\2\u013d\u013e\7@\2\2\u013e\u013f\7@\2\2\u013fX\3\2\2\2\u0140\u0141"+
		"\7=\2\2\u0141Z\3\2\2\2\u0142\u0143\7=\2\2\u0143\u0144\7=\2\2\u0144\\\3"+
		"\2\2\2\u0145\u0146\7~\2\2\u0146^\3\2\2\2\u0147\u0148\7^\2\2\u0148\u0149"+
		"\7$\2\2\u0149`\3\2\2\2\u014a\u014b\6\61\3\2\u014b\u014c\7^\2\2\u014c\u014d"+
		"\7)\2\2\u014db\3\2\2\2\u014e\u014f\7$\2\2\u014f\u0150\b\62\3\2\u0150d"+
		"\3\2\2\2\u0151\u0152\6\63\4\2\u0152\u0153\7)\2\2\u0153f\3\2\2\2\u0154"+
		"\u0155\6\64\5\2\u0155\u0159\7)\2\2\u0156\u0158\13\2\2\2\u0157\u0156\3"+
		"\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7)\2\2\u015dh\3\2\2\2\u015e"+
		"\u015f\7.\2\2\u015fj\3\2\2\2\u0160\u0162\t\3\2\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164l\3\2\2\2"+
		"\u0165\u0167\7\17\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u016a\7\f\2\2\u0169\u0166\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016cn\3\2\2\2\u016d\u016e\4\62;\2"+
		"\u016ep\3\2\2\2\u016f\u0171\5o8\2\u0170\u0172\5o8\2\u0171\u0170\3\2\2"+
		"\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174r"+
		"\3\2\2\2\u0175\u0176\t\4\2\2\u0176t\3\2\2\2\u0177\u017a\5o8\2\u0178\u017a"+
		"\5s:\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017av\3\2\2\2\u017b\u017c"+
		"\7\u0080\2\2\u017cx\3\2\2\2\u017d\u017e\7>\2\2\u017e\u017f\7>\2\2\u017f"+
		"\u0180\7>\2\2\u0180z\3\2\2\2\u0181\u0182\7%\2\2\u0182|\3\2\2\2\u0183\u0184"+
		"\7\'\2\2\u0184~\3\2\2\2\u0185\u0186\7\'\2\2\u0186\u0187\7\'\2\2\u0187"+
		"\u0080\3\2\2\2\u0188\u0189\7\61\2\2\u0189\u0082\3\2\2\2\u018a\u018b\7"+
		"<\2\2\u018b\u0084\3\2\2\2\u018c\u018d\7A\2\2\u018d\u0086\3\2\2\2\u018e"+
		"\u018f\7n\2\2\u018f\u0190\7q\2\2\u0190\u0191\7e\2\2\u0191\u0192\7c\2\2"+
		"\u0192\u0193\7n\2\2\u0193\u0088\3\2\2\2\u0194\u0195\7g\2\2\u0195\u0196"+
		"\7z\2\2\u0196\u0197\7r\2\2\u0197\u0198\7q\2\2\u0198\u0199\7t\2\2\u0199"+
		"\u019a\7v\2\2\u019a\u008a\3\2\2\2\u019b\u019c\7f\2\2\u019c\u019d\7g\2"+
		"\2\u019d\u019e\7e\2\2\u019e\u019f\7n\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1"+
		"\7t\2\2\u01a1\u01a2\7g\2\2\u01a2\u008c\3\2\2\2\u01a3\u01a4\7(\2\2\u01a4"+
		"\u01a5\7(\2\2\u01a5\u008e\3\2\2\2\u01a6\u01a7\7~\2\2\u01a7\u01a8\7~\2"+
		"\2\u01a8\u0090\3\2\2\2\u01a9\u01aa\5\u00a7T\2\u01aa\u01ab\5m\67\2\u01ab"+
		"\u01ad\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\bI\2\2\u01b1"+
		"\u0092\3\2\2\2\u01b2\u01b3\5\u00a7T\2\u01b3\u01b4\5)\25\2\u01b4\u0094"+
		"\3\2\2\2\u01b5\u01b6\5\u00a7T\2\u01b6\u01b7\5+\26\2\u01b7\u0096\3\2\2"+
		"\2\u01b8\u01b9\5\u00a7T\2\u01b9\u01ba\5\61\31\2\u01ba\u0098\3\2\2\2\u01bb"+
		"\u01bc\5\u00a7T\2\u01bc\u01bd\5/\30\2\u01bd\u009a\3\2\2\2\u01be\u01bf"+
		"\5\u00a7T\2\u01bf\u01c0\5\65\33\2\u01c0\u009c\3\2\2\2\u01c1\u01c2\5\u00a7"+
		"T\2\u01c2\u01c3\5\63\32\2\u01c3\u009e\3\2\2\2\u01c4\u01c5\6P\6\2\u01c5"+
		"\u01c6\5\65\33\2\u01c6\u01c7\5+\26\2\u01c7\u01d2\bP\4\2\u01c8\u01d3\5"+
		"\u0095K\2\u01c9\u01d3\5\u0093J\2\u01ca\u01cb\5+\26\2\u01cb\u01cc\bP\5"+
		"\2\u01cc\u01d3\3\2\2\2\u01cd\u01ce\5)\25\2\u01ce\u01cf\bP\6\2\u01cf\u01d3"+
		"\3\2\2\2\u01d0\u01d3\5g\64\2\u01d1\u01d3\13\2\2\2\u01d2\u01c8\3\2\2\2"+
		"\u01d2\u01c9\3\2\2\2\u01d2\u01ca\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u00a0\3\2\2\2\u01d6\u01d8\5\63\32\2\u01d7\u01d9\13"+
		"\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\n\5\2\2\u01dd\u01de\5\63"+
		"\32\2\u01de\u00a2\3\2\2\2\u01df\u01e0\5\u00a7T\2\u01e0\u01e1\7>\2\2\u01e1"+
		"\u00a4\3\2\2\2\u01e2\u01e3\5\u00a7T\2\u01e3\u01e4\7@\2\2\u01e4\u00a6\3"+
		"\2\2\2\u01e5\u01e6\7^\2\2\u01e6\u00a8\3\2\2\2\u01e7\u01e8\7a\2\2\u01e8"+
		"\u00aa\3\2\2\2\u01e9\u01ec\5s:\2\u01ea\u01ec\5\u00a9U\2\u01eb\u01e9\3"+
		"\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01f0\5u;\2\u01ee"+
		"\u01f0\5\u00a9U\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u00ac\3\2\2\2\u01f3"+
		"\u01f4\13\2\2\2\u01f4\u00ae\3\2\2\2\22\2\u00b2\u00b8\u0159\u0163\u0166"+
		"\u016b\u0173\u0179\u01ae\u01d2\u01d4\u01da\u01eb\u01ef\u01f1\7\2\3\2\3"+
		"\62\2\3P\3\3P\4\3P\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}