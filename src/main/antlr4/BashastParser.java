// Generated from src/main/antlr4/Bashast.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BashastParser extends Parser {
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
		ESC_LT=80, ESC_GT=81, ESC=82, UNDERSCORE=83, NAME=84, OTHER=85, ANSI_C_QUOTING=86, 
		ARG=87, ARRAY=88, ARRAY_SIZE=89, BRACE_EXP=90, COMMAND_SUB=91, CASE_PATTERN=92, 
		CASE_COMMAND=93, SUBSHELL=94, CURRENT_SHELL=95, COMPOUND_COND=96, CFOR=97, 
		FOR_INIT=98, FOR_COND=99, FOR_MOD=100, IF_STATEMENT=101, OP=102, PRE_INCR=103, 
		PRE_DECR=104, POST_INCR=105, POST_DECR=106, PROCESS_SUBSTITUTION=107, 
		VAR_REF=108, NEGATION=109, LIST=110, STRING=111, COMMAND=112, FILE_DESCRIPTOR=113, 
		FILE_DESCRIPTOR_MOVE=114, REDIR=115, ARITHMETIC_CONDITION=116, ARITHMETIC_EXPRESSION=117, 
		ARITHMETIC=118, KEYWORD_TEST=119, BUILTIN_TEST=120, MATCH_ANY_EXCEPT=121, 
		EXTENDED_MATCH_EXACTLY_ONE=122, EXTENDED_MATCH_AT_MOST_ONE=123, EXTENDED_MATCH_NONE=124, 
		EXTENDED_MATCH_ANY=125, EXTENDED_MATCH_AT_LEAST_ONE=126, BRANCH=127, MATCH_PATTERN=128, 
		MATCH_REGULAR_EXPRESSION=129, ESCAPED_CHAR=130, NOT_MATCH_PATTERN=131, 
		MATCH_ANY=132, MATCH_ALL=133, MATCH_ONE=134, CHARACTER_CLASS=135, EQUIVALENCE_CLASS=136, 
		COLLATING_SYMBOL=137, DOUBLE_QUOTED_STRING=138, SINGLE_QUOTED_STRING=139, 
		VARIABLE_DEFINITIONS=140, USE_DEFAULT_WHEN_UNSET=141, USE_ALTERNATE_WHEN_UNSET=142, 
		DISPLAY_ERROR_WHEN_UNSET=143, ASSIGN_DEFAULT_WHEN_UNSET=144, USE_DEFAULT_WHEN_UNSET_OR_NULL=145, 
		USE_ALTERNATE_WHEN_UNSET_OR_NULL=146, DISPLAY_ERROR_WHEN_UNSET_OR_NULL=147, 
		ASSIGN_DEFAULT_WHEN_UNSET_OR_NULL=148, OFFSET=149, LIST_EXPAND=150, REPLACE_FIRST=151, 
		REPLACE_ALL=152, REPLACE_AT_START=153, REPLACE_AT_END=154, LAZY_REMOVE_AT_START=155, 
		LAZY_REMOVE_AT_END=156, EMPTY_EXPANSION_VALUE=157, PLUS_SIGN=158, MINUS_SIGN=159, 
		PLUS_ASSIGN=160, MINUS_ASSIGN=161, DIVIDE_ASSIGN=162, MUL_ASSIGN=163, 
		MOD_ASSIGN=164, LSHIFT_ASSIGN=165, RSHIFT_ASSIGN=166, AND_ASSIGN=167, 
		XOR_ASSIGN=168, OR_ASSIGN=169, LEQ=170, GEQ=171, NOT_EQUALS=172, EQUALS_TO=173, 
		BUILTIN_LOGIC_AND=174, BUILTIN_LOGIC_OR=175, FUNCTION=176, ALPHANUM=177;
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENT", "BANG", "'case'", "'do'", "'done'", "'elif'", 
		"'else'", "'esac'", "'fi'", "'for'", "'if'", "'in'", "'select'", "'then'", 
		"'until'", "'while'", "'{'", "'}'", "'time'", "')'", "'('", "'(('", "'['", 
		"']'", "'`'", "'$'", "'@'", "'.'", "'..'", "'*'", "'='", "'-'", "'+'", 
		"'**'", "'&'", "CARET", "'<'", "'>'", "'<<'", "'>>'", "'&<'", "'&>'", 
		"'&>>'", "';'", "';;'", "'|'", "'\\\"'", "ESC_SQUOTE", "'\"'", "SQUOTE", 
		"SINGLE_QUOTED_STRING_TOKEN", "','", "BLANK", "EOL", "DIGIT", "NUMBER", 
		"LETTER", "'~'", "'<<<'", "'#'", "'%'", "'%%'", "'/'", "':'", "'?'", "'local'", 
		"'export'", "'declare'", "'&&'", "'||'", "CONTINUE_LINE", "ESC_RPAREN", 
		"ESC_LPAREN", "ESC_RSQUARE", "ESC_LSQUARE", "ESC_DOLLAR", "ESC_TICK", 
		"COMMAND_SUBSTITUTION_PAREN", "COMMAND_SUBSTITUTION_TICK", "ESC_LT", "ESC_GT", 
		"'\\'", "'_'", "NAME", "OTHER", "ANSI_C_QUOTING", "ARG", "ARRAY", "ARRAY_SIZE", 
		"BRACE_EXP", "COMMAND_SUB", "CASE_PATTERN", "CASE_COMMAND", "SUBSHELL", 
		"CURRENT_SHELL", "COMPOUND_COND", "CFOR", "FOR_INIT", "FOR_COND", "FOR_MOD", 
		"IF_STATEMENT", "OP", "PRE_INCR", "PRE_DECR", "POST_INCR", "POST_DECR", 
		"PROCESS_SUBSTITUTION", "VAR_REF", "NEGATION", "LIST", "STRING", "COMMAND", 
		"FILE_DESCRIPTOR", "FILE_DESCRIPTOR_MOVE", "REDIR", "ARITHMETIC_CONDITION", 
		"ARITHMETIC_EXPRESSION", "ARITHMETIC", "KEYWORD_TEST", "BUILTIN_TEST", 
		"MATCH_ANY_EXCEPT", "EXTENDED_MATCH_EXACTLY_ONE", "EXTENDED_MATCH_AT_MOST_ONE", 
		"EXTENDED_MATCH_NONE", "EXTENDED_MATCH_ANY", "EXTENDED_MATCH_AT_LEAST_ONE", 
		"BRANCH", "MATCH_PATTERN", "MATCH_REGULAR_EXPRESSION", "ESCAPED_CHAR", 
		"NOT_MATCH_PATTERN", "MATCH_ANY", "MATCH_ALL", "MATCH_ONE", "CHARACTER_CLASS", 
		"EQUIVALENCE_CLASS", "COLLATING_SYMBOL", "DOUBLE_QUOTED_STRING", "SINGLE_QUOTED_STRING", 
		"VARIABLE_DEFINITIONS", "USE_DEFAULT_WHEN_UNSET", "USE_ALTERNATE_WHEN_UNSET", 
		"DISPLAY_ERROR_WHEN_UNSET", "ASSIGN_DEFAULT_WHEN_UNSET", "USE_DEFAULT_WHEN_UNSET_OR_NULL", 
		"USE_ALTERNATE_WHEN_UNSET_OR_NULL", "DISPLAY_ERROR_WHEN_UNSET_OR_NULL", 
		"ASSIGN_DEFAULT_WHEN_UNSET_OR_NULL", "OFFSET", "LIST_EXPAND", "REPLACE_FIRST", 
		"REPLACE_ALL", "REPLACE_AT_START", "REPLACE_AT_END", "LAZY_REMOVE_AT_START", 
		"LAZY_REMOVE_AT_END", "EMPTY_EXPANSION_VALUE", "PLUS_SIGN", "MINUS_SIGN", 
		"PLUS_ASSIGN", "MINUS_ASSIGN", "DIVIDE_ASSIGN", "MUL_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", 
		"LEQ", "GEQ", "NOT_EQUALS", "EQUALS_TO", "BUILTIN_LOGIC_AND", "BUILTIN_LOGIC_OR", 
		"FUNCTION", "ALPHANUM"
	};
	public static final int
		RULE_start = 0, RULE_first_line_comment = 1, RULE_command_list = 2, RULE_list_level_1 = 3, 
		RULE_list_level_2 = 4, RULE_command_separator = 5, RULE_pipeline = 6, 
		RULE_time = 7, RULE_time_posix = 8, RULE_redirection = 9, RULE_redirection_atom = 10, 
		RULE_process_substitution = 11, RULE_redirection_destination = 12, RULE_file_descriptor = 13, 
		RULE_here_string = 14, RULE_here_document = 15, RULE_here_document_operator = 16, 
		RULE_here_document_begin = 17, RULE_here_document_end = 18, RULE_here_document_content = 19, 
		RULE_redirection_operator = 20, RULE_command = 21, RULE_command_atom = 22, 
		RULE_command_name = 23, RULE_variable_definitions = 24, RULE_variable_definition_atom = 25, 
		RULE_value = 26, RULE_array_value = 27, RULE_array_atom = 28, RULE_builtin_variable_definition_item = 29, 
		RULE_builtin_variable_definitions = 30, RULE_builtin_variable_definition_atom = 31, 
		RULE_bash_command = 32, RULE_bash_command_arguments = 33, RULE_bash_command_argument_atom = 34, 
		RULE_parens = 35, RULE_compound_command = 36, RULE_semiel = 37, RULE_for_expr = 38, 
		RULE_for_each_value = 39, RULE_select_expr = 40, RULE_if_expr = 41, RULE_elif_expr = 42, 
		RULE_while_expr = 43, RULE_until_expr = 44, RULE_case_expr = 45, RULE_case_body = 46, 
		RULE_case_statement = 47, RULE_subshell = 48, RULE_current_shell = 49, 
		RULE_arithmetic_expression = 50, RULE_condition_comparison = 51, RULE_condition_expr = 52, 
		RULE_keyword_condition_and = 53, RULE_keyword_condition = 54, RULE_keyword_negation_primary = 55, 
		RULE_keyword_condition_primary = 56, RULE_keyword_condition_unary = 57, 
		RULE_keyword_condition_binary = 58, RULE_bash_pattern_part = 59, RULE_preserved_tokens = 60, 
		RULE_non_dquote = 61, RULE_keyword_binary_string_operator = 62, RULE_builtin_condition_and = 63, 
		RULE_builtin_condition = 64, RULE_builtin_negation_primary = 65, RULE_builtin_condition_primary = 66, 
		RULE_builtin_condition_unary = 67, RULE_builtin_condition_binary = 68, 
		RULE_builtin_binary_string_operator = 69, RULE_builtin_logic_and = 70, 
		RULE_builtin_logic_or = 71, RULE_binary_operator = 72, RULE_unary_operator = 73, 
		RULE_condition_part = 74, RULE_name = 75, RULE_num = 76, RULE_string_expr = 77, 
		RULE_string_expr_part = 78, RULE_string_expr_no_reserved_word = 79, RULE_reserved_word = 80, 
		RULE_non_quoted_string = 81, RULE_quoted_string = 82, RULE_double_quoted_string = 83, 
		RULE_expansion_base = 84, RULE_all_expansions = 85, RULE_expansion_atom = 86, 
		RULE_string_part = 87, RULE_ns_string_part = 88, RULE_escaped_character = 89, 
		RULE_extended_pattern_match = 90, RULE_extended_pattern = 91, RULE_bracket_pattern_match = 92, 
		RULE_bracket_pattern_match_operator = 93, RULE_bracket_pattern_part = 94, 
		RULE_bracket_pattern = 95, RULE_pattern_class_match = 96, RULE_pattern_char = 97, 
		RULE_variable_reference = 98, RULE_parameter_expansion = 99, RULE_parameter_delete_operator = 100, 
		RULE_parameter_value_operator = 101, RULE_parameter_replace_pattern = 102, 
		RULE_parameter_delete_pattern = 103, RULE_parameter_pattern_part = 104, 
		RULE_parameter_expansion_value = 105, RULE_parameter_expansion_value_atom = 106, 
		RULE_parameter_replace_operator = 107, RULE_variable_name = 108, RULE_variable_name_no_digit = 109, 
		RULE_variable_name_for_bang = 110, RULE_variable_size_ref = 111, RULE_array_size_index = 112, 
		RULE_wspace = 113, RULE_command_substitution = 114, RULE_brace_expansion = 115, 
		RULE_brace_expansion_inside = 116, RULE_range = 117, RULE_brace_expansion_part = 118, 
		RULE_commasep = 119, RULE_explicit_arithmetic = 120, RULE_arithmetic_expansion = 121, 
		RULE_arithmetic_part = 122, RULE_arithmetics = 123, RULE_arithmetics_test = 124, 
		RULE_arithmetic = 125, RULE_arithmetic_assignment_operator = 126, RULE_arithmetic_variable_reference = 127, 
		RULE_primary = 128, RULE_pre_post_primary = 129, RULE_post_inc_dec = 130, 
		RULE_pre_inc_dec = 131, RULE_unary_with_operator = 132, RULE_unary = 133, 
		RULE_exponential = 134, RULE_times_division_modulus = 135, RULE_addsub = 136, 
		RULE_shifts = 137, RULE_compare = 138, RULE_compare_operator = 139, RULE_bitwiseand = 140, 
		RULE_bitwisexor = 141, RULE_bitwiseor = 142, RULE_logicand = 143, RULE_logicor = 144;
	public static final String[] ruleNames = {
		"start", "first_line_comment", "command_list", "list_level_1", "list_level_2", 
		"command_separator", "pipeline", "time", "time_posix", "redirection", 
		"redirection_atom", "process_substitution", "redirection_destination", 
		"file_descriptor", "here_string", "here_document", "here_document_operator", 
		"here_document_begin", "here_document_end", "here_document_content", "redirection_operator", 
		"command", "command_atom", "command_name", "variable_definitions", "variable_definition_atom", 
		"value", "array_value", "array_atom", "builtin_variable_definition_item", 
		"builtin_variable_definitions", "builtin_variable_definition_atom", "bash_command", 
		"bash_command_arguments", "bash_command_argument_atom", "parens", "compound_command", 
		"semiel", "for_expr", "for_each_value", "select_expr", "if_expr", "elif_expr", 
		"while_expr", "until_expr", "case_expr", "case_body", "case_statement", 
		"subshell", "current_shell", "arithmetic_expression", "condition_comparison", 
		"condition_expr", "keyword_condition_and", "keyword_condition", "keyword_negation_primary", 
		"keyword_condition_primary", "keyword_condition_unary", "keyword_condition_binary", 
		"bash_pattern_part", "preserved_tokens", "non_dquote", "keyword_binary_string_operator", 
		"builtin_condition_and", "builtin_condition", "builtin_negation_primary", 
		"builtin_condition_primary", "builtin_condition_unary", "builtin_condition_binary", 
		"builtin_binary_string_operator", "builtin_logic_and", "builtin_logic_or", 
		"binary_operator", "unary_operator", "condition_part", "name", "num", 
		"string_expr", "string_expr_part", "string_expr_no_reserved_word", "reserved_word", 
		"non_quoted_string", "quoted_string", "double_quoted_string", "expansion_base", 
		"all_expansions", "expansion_atom", "string_part", "ns_string_part", "escaped_character", 
		"extended_pattern_match", "extended_pattern", "bracket_pattern_match", 
		"bracket_pattern_match_operator", "bracket_pattern_part", "bracket_pattern", 
		"pattern_class_match", "pattern_char", "variable_reference", "parameter_expansion", 
		"parameter_delete_operator", "parameter_value_operator", "parameter_replace_pattern", 
		"parameter_delete_pattern", "parameter_pattern_part", "parameter_expansion_value", 
		"parameter_expansion_value_atom", "parameter_replace_operator", "variable_name", 
		"variable_name_no_digit", "variable_name_for_bang", "variable_size_ref", 
		"array_size_index", "wspace", "command_substitution", "brace_expansion", 
		"brace_expansion_inside", "range", "brace_expansion_part", "commasep", 
		"explicit_arithmetic", "arithmetic_expansion", "arithmetic_part", "arithmetics", 
		"arithmetics_test", "arithmetic", "arithmetic_assignment_operator", "arithmetic_variable_reference", 
		"primary", "pre_post_primary", "post_inc_dec", "pre_inc_dec", "unary_with_operator", 
		"unary", "exponential", "times_division_modulus", "addsub", "shifts", 
		"compare", "compare_operator", "bitwiseand", "bitwisexor", "bitwiseor", 
		"logicand", "logicor"
	};

	@Override
	public String getGrammarFileName() { return "Bashast.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		boolean is_here_end(String here_document_word, int number_of_tokens) {
			String word = "";
			for(int i = 1; i <= number_of_tokens; ++i)
				word += _input.LT(i).getText();
			return (word.equals(here_document_word));
		}

		String get_string(Token token) {
			return token.getText();
		}

		Token LT(int index) {
			return _input.LT(index);
		}

		int LA(int index) {
			return _input.LA(index);
		}


		boolean is_special_token(int token)

		{
			return token == AMP
			||token == BLANK
			// for bash redirection
			||token == LESS_THAN
			||token == GREATER_THAN
			||token == RSHIFT
			||token == AMP_LESS_THAN
			||token == AMP_GREATER_THAN
			||token == AMP_RSHIFT
			// for end of command
			||token == SEMIC
			||token == EOL
			// for sub shell
			||token == LPAREN
			||token == RPAREN
			// for case statement
			||token == DOUBLE_SEMIC
			// for logical operator
			||token == LOGICAND
			||token == LOGICOR
			// for pipeline
			||token == PIPE
			// for document and here string
			||token == HERE_STRING_OP
			||token == LSHIFT;
		}

	public BashastParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode SEMIC() { return getToken(BashastParser.SEMIC, 0); }
		public TerminalNode EOF() { return getToken(BashastParser.EOF, 0); }
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(BashastParser.EOL); }
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public TerminalNode AMP() { return getToken(BashastParser.AMP, 0); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode EOL(int i) {
			return getToken(BashastParser.EOL, i);
		}
		public First_line_commentContext first_line_comment() {
			return getRuleContext(First_line_commentContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(290); first_line_comment();
				}
				break;
			}
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(293); match(EOL);
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(299); match(BLANK);
				}
				break;
			}
			setState(302); command_list();
			setState(304);
			_la = _input.LA(1);
			if (_la==BLANK) {
				{
				setState(303); match(BLANK);
				}
			}

			setState(307);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AMP) | (1L << SEMIC) | (1L << EOL))) != 0)) {
				{
				setState(306);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AMP) | (1L << SEMIC) | (1L << EOL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(309); match(EOF);
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

	public static class First_line_commentContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(BashastParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(BashastParser.EOL, i);
		}
		public TerminalNode POUND() { return getToken(BashastParser.POUND, 0); }
		public First_line_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_line_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterFirst_line_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitFirst_line_comment(this);
		}
	}

	public final First_line_commentContext first_line_comment() throws RecognitionException {
		First_line_commentContext _localctx = new First_line_commentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_first_line_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(POUND);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BANG) | (1L << CASE) | (1L << DO) | (1L << DONE) | (1L << ELIF) | (1L << ELSE) | (1L << ESAC) | (1L << FI) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << SELECT) | (1L << THEN) | (1L << UNTIL) | (1L << WHILE) | (1L << LBRACE) | (1L << RBRACE) | (1L << TIME) | (1L << RPAREN) | (1L << LPAREN) | (1L << LLPAREN) | (1L << LSQUARE) | (1L << RSQUARE) | (1L << TICK) | (1L << DOLLAR) | (1L << AT) | (1L << DOT) | (1L << DOTDOT) | (1L << TIMES) | (1L << EQUALS) | (1L << MINUS) | (1L << PLUS) | (1L << EXP) | (1L << AMP) | (1L << CARET) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << AMP_LESS_THAN) | (1L << AMP_GREATER_THAN) | (1L << AMP_RSHIFT) | (1L << SEMIC) | (1L << DOUBLE_SEMIC) | (1L << PIPE) | (1L << ESC_DQUOTE) | (1L << ESC_SQUOTE) | (1L << DQUOTE) | (1L << SQUOTE) | (1L << SINGLE_QUOTED_STRING_TOKEN) | (1L << COMMA) | (1L << BLANK) | (1L << DIGIT) | (1L << NUMBER) | (1L << LETTER) | (1L << TILDE) | (1L << HERE_STRING_OP) | (1L << POUND) | (1L << PCT) | (1L << PCTPCT) | (1L << SLASH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLON - 64)) | (1L << (QMARK - 64)) | (1L << (LOCAL - 64)) | (1L << (EXPORT - 64)) | (1L << (DECLARE - 64)) | (1L << (LOGICAND - 64)) | (1L << (LOGICOR - 64)) | (1L << (CONTINUE_LINE - 64)) | (1L << (ESC_RPAREN - 64)) | (1L << (ESC_LPAREN - 64)) | (1L << (ESC_RSQUARE - 64)) | (1L << (ESC_LSQUARE - 64)) | (1L << (ESC_DOLLAR - 64)) | (1L << (ESC_TICK - 64)) | (1L << (COMMAND_SUBSTITUTION_PAREN - 64)) | (1L << (COMMAND_SUBSTITUTION_TICK - 64)) | (1L << (ESC_LT - 64)) | (1L << (ESC_GT - 64)) | (1L << (ESC - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (NAME - 64)) | (1L << (OTHER - 64)) | (1L << (ANSI_C_QUOTING - 64)) | (1L << (ARG - 64)) | (1L << (ARRAY - 64)) | (1L << (ARRAY_SIZE - 64)) | (1L << (BRACE_EXP - 64)) | (1L << (COMMAND_SUB - 64)) | (1L << (CASE_PATTERN - 64)) | (1L << (CASE_COMMAND - 64)) | (1L << (SUBSHELL - 64)) | (1L << (CURRENT_SHELL - 64)) | (1L << (COMPOUND_COND - 64)) | (1L << (CFOR - 64)) | (1L << (FOR_INIT - 64)) | (1L << (FOR_COND - 64)) | (1L << (FOR_MOD - 64)) | (1L << (IF_STATEMENT - 64)) | (1L << (OP - 64)) | (1L << (PRE_INCR - 64)) | (1L << (PRE_DECR - 64)) | (1L << (POST_INCR - 64)) | (1L << (POST_DECR - 64)) | (1L << (PROCESS_SUBSTITUTION - 64)) | (1L << (VAR_REF - 64)) | (1L << (NEGATION - 64)) | (1L << (LIST - 64)) | (1L << (STRING - 64)) | (1L << (COMMAND - 64)) | (1L << (FILE_DESCRIPTOR - 64)) | (1L << (FILE_DESCRIPTOR_MOVE - 64)) | (1L << (REDIR - 64)) | (1L << (ARITHMETIC_CONDITION - 64)) | (1L << (ARITHMETIC_EXPRESSION - 64)) | (1L << (ARITHMETIC - 64)) | (1L << (KEYWORD_TEST - 64)) | (1L << (BUILTIN_TEST - 64)) | (1L << (MATCH_ANY_EXCEPT - 64)) | (1L << (EXTENDED_MATCH_EXACTLY_ONE - 64)) | (1L << (EXTENDED_MATCH_AT_MOST_ONE - 64)) | (1L << (EXTENDED_MATCH_NONE - 64)) | (1L << (EXTENDED_MATCH_ANY - 64)) | (1L << (EXTENDED_MATCH_AT_LEAST_ONE - 64)) | (1L << (BRANCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCH_PATTERN - 128)) | (1L << (MATCH_REGULAR_EXPRESSION - 128)) | (1L << (ESCAPED_CHAR - 128)) | (1L << (NOT_MATCH_PATTERN - 128)) | (1L << (MATCH_ANY - 128)) | (1L << (MATCH_ALL - 128)) | (1L << (MATCH_ONE - 128)) | (1L << (CHARACTER_CLASS - 128)) | (1L << (EQUIVALENCE_CLASS - 128)) | (1L << (COLLATING_SYMBOL - 128)) | (1L << (DOUBLE_QUOTED_STRING - 128)) | (1L << (SINGLE_QUOTED_STRING - 128)) | (1L << (VARIABLE_DEFINITIONS - 128)) | (1L << (USE_DEFAULT_WHEN_UNSET - 128)) | (1L << (USE_ALTERNATE_WHEN_UNSET - 128)) | (1L << (DISPLAY_ERROR_WHEN_UNSET - 128)) | (1L << (ASSIGN_DEFAULT_WHEN_UNSET - 128)) | (1L << (USE_DEFAULT_WHEN_UNSET_OR_NULL - 128)) | (1L << (USE_ALTERNATE_WHEN_UNSET_OR_NULL - 128)) | (1L << (DISPLAY_ERROR_WHEN_UNSET_OR_NULL - 128)) | (1L << (ASSIGN_DEFAULT_WHEN_UNSET_OR_NULL - 128)) | (1L << (OFFSET - 128)) | (1L << (LIST_EXPAND - 128)) | (1L << (REPLACE_FIRST - 128)) | (1L << (REPLACE_ALL - 128)) | (1L << (REPLACE_AT_START - 128)) | (1L << (REPLACE_AT_END - 128)) | (1L << (LAZY_REMOVE_AT_START - 128)) | (1L << (LAZY_REMOVE_AT_END - 128)) | (1L << (EMPTY_EXPANSION_VALUE - 128)) | (1L << (PLUS_SIGN - 128)) | (1L << (MINUS_SIGN - 128)) | (1L << (PLUS_ASSIGN - 128)) | (1L << (MINUS_ASSIGN - 128)) | (1L << (DIVIDE_ASSIGN - 128)) | (1L << (MUL_ASSIGN - 128)) | (1L << (MOD_ASSIGN - 128)) | (1L << (LSHIFT_ASSIGN - 128)) | (1L << (RSHIFT_ASSIGN - 128)) | (1L << (AND_ASSIGN - 128)) | (1L << (XOR_ASSIGN - 128)) | (1L << (OR_ASSIGN - 128)) | (1L << (LEQ - 128)) | (1L << (GEQ - 128)) | (1L << (NOT_EQUALS - 128)) | (1L << (EQUALS_TO - 128)) | (1L << (BUILTIN_LOGIC_AND - 128)) | (1L << (BUILTIN_LOGIC_OR - 128)) | (1L << (FUNCTION - 128)) | (1L << (ALPHANUM - 128)))) != 0)) {
				{
				{
				setState(312);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==EOL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318); match(EOL);
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

	public static class Command_listContext extends ParserRuleContext {
		public List_level_2Context list_level_2() {
			return getRuleContext(List_level_2Context.class,0);
		}
		public Command_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCommand_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCommand_list(this);
		}
	}

	public final Command_listContext command_list() throws RecognitionException {
		Command_listContext _localctx = new Command_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); list_level_2();
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

	public static class List_level_1Context extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(BashastParser.EOL); }
		public List<TerminalNode> LOGICAND() { return getTokens(BashastParser.LOGICAND); }
		public PipelineContext pipeline(int i) {
			return getRuleContext(PipelineContext.class,i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<TerminalNode> LOGICOR() { return getTokens(BashastParser.LOGICOR); }
		public TerminalNode EOL(int i) {
			return getToken(BashastParser.EOL, i);
		}
		public List<PipelineContext> pipeline() {
			return getRuleContexts(PipelineContext.class);
		}
		public TerminalNode LOGICAND(int i) {
			return getToken(BashastParser.LOGICAND, i);
		}
		public TerminalNode LOGICOR(int i) {
			return getToken(BashastParser.LOGICOR, i);
		}
		public List_level_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_level_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterList_level_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitList_level_1(this);
		}
	}

	public final List_level_1Context list_level_1() throws RecognitionException {
		List_level_1Context _localctx = new List_level_1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_level_1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322); pipeline();
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(324);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(323); match(BLANK);
						}
					}

					setState(326);
					_la = _input.LA(1);
					if ( !(_la==LOGICAND || _la==LOGICOR) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(327);
							_la = _input.LA(1);
							if ( !(_la==BLANK || _la==EOL) ) {
							_errHandler.recoverInline(this);
							}
							consume();
							}
							} 
						}
						setState(332);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					setState(333); pipeline();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class List_level_2Context extends ParserRuleContext {
		public List_level_1Context list_level_1(int i) {
			return getRuleContext(List_level_1Context.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(BashastParser.EOL); }
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode EOL(int i) {
			return getToken(BashastParser.EOL, i);
		}
		public Command_separatorContext command_separator(int i) {
			return getRuleContext(Command_separatorContext.class,i);
		}
		public List<Command_separatorContext> command_separator() {
			return getRuleContexts(Command_separatorContext.class);
		}
		public List<List_level_1Context> list_level_1() {
			return getRuleContexts(List_level_1Context.class);
		}
		public List_level_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_level_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterList_level_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitList_level_2(this);
		}
	}

	public final List_level_2Context list_level_2() throws RecognitionException {
		List_level_2Context _localctx = new List_level_2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_level_2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339); list_level_1();
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(340); match(BLANK);
						}
					}

					setState(343); command_separator();
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(345);
							_la = _input.LA(1);
							if (_la==BLANK) {
								{
								setState(344); match(BLANK);
								}
							}

							setState(347); match(EOL);
							}
							} 
						}
						setState(352);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					setState(354);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(353); match(BLANK);
						}
						break;
					}
					setState(356); list_level_1();
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Command_separatorContext extends ParserRuleContext {
		public TerminalNode SEMIC() { return getToken(BashastParser.SEMIC, 0); }
		public TerminalNode EOL() { return getToken(BashastParser.EOL, 0); }
		public TerminalNode AMP() { return getToken(BashastParser.AMP, 0); }
		public Command_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCommand_separator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCommand_separator(this);
		}
	}

	public final Command_separatorContext command_separator() throws RecognitionException {
		Command_separatorContext _localctx = new Command_separatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AMP) | (1L << SEMIC) | (1L << EOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PipelineContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(BashastParser.PIPE); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode PIPE(int i) {
			return getToken(BashastParser.PIPE, i);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitPipeline(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pipeline);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(365); time();
				}
				break;
			}
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(368); match(BANG);
				setState(369); match(BLANK);
				}
				}
				break;
			}
			setState(372); command();
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(373); match(BLANK);
						}
					}

					setState(376); match(PIPE);
					setState(378);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(377); wspace();
						}
						break;
					}
					setState(380); command();
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class TimeContext extends ParserRuleContext {
		public Time_posixContext time_posix() {
			return getRuleContext(Time_posixContext.class,0);
		}
		public TerminalNode TIME() { return getToken(BashastParser.TIME, 0); }
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(TIME);
			setState(387); match(BLANK);
			setState(389);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(388); time_posix();
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

	public static class Time_posixContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(BashastParser.LETTER, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public Time_posixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_posix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterTime_posix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitTime_posix(this);
		}
	}

	public final Time_posixContext time_posix() throws RecognitionException {
		Time_posixContext _localctx = new Time_posixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_time_posix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(MINUS);
			setState(392); match(LETTER);
			setState(393); match(BLANK);
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

	public static class RedirectionContext extends ParserRuleContext {
		public List<Redirection_atomContext> redirection_atom() {
			return getRuleContexts(Redirection_atomContext.class);
		}
		public Redirection_atomContext redirection_atom(int i) {
			return getRuleContext(Redirection_atomContext.class,i);
		}
		public RedirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterRedirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitRedirection(this);
		}
	}

	public final RedirectionContext redirection() throws RecognitionException {
		RedirectionContext _localctx = new RedirectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_redirection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(395); redirection_atom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(398); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Redirection_atomContext extends ParserRuleContext {
		public Redirection_operatorContext redirection_operator() {
			return getRuleContext(Redirection_operatorContext.class,0);
		}
		public Process_substitutionContext process_substitution() {
			return getRuleContext(Process_substitutionContext.class,0);
		}
		public Here_stringContext here_string() {
			return getRuleContext(Here_stringContext.class,0);
		}
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public Redirection_destinationContext redirection_destination() {
			return getRuleContext(Redirection_destinationContext.class,0);
		}
		public Redirection_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterRedirection_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitRedirection_atom(this);
		}
	}

	public final Redirection_atomContext redirection_atom() throws RecognitionException {
		Redirection_atomContext _localctx = new Redirection_atomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_redirection_atom);
		try {
			setState(406);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400); redirection_operator();
				setState(401); redirection_destination();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403); match(BLANK);
				setState(404); process_substitution();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405); here_string();
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

	public static class Process_substitutionContext extends ParserRuleContext {
		public Token dir;
		public TerminalNode LESS_THAN() { return getToken(BashastParser.LESS_THAN, 0); }
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode GREATER_THAN() { return getToken(BashastParser.GREATER_THAN, 0); }
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(BashastParser.LPAREN, 0); }
		public Process_substitutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_substitution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterProcess_substitution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitProcess_substitution(this);
		}
	}

	public final Process_substitutionContext process_substitution() throws RecognitionException {
		Process_substitutionContext _localctx = new Process_substitutionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_process_substitution);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			switch (_input.LA(1)) {
			case LESS_THAN:
				{
				setState(408); ((Process_substitutionContext)_localctx).dir = match(LESS_THAN);
				}
				break;
			case GREATER_THAN:
				{
				setState(409); ((Process_substitutionContext)_localctx).dir = match(GREATER_THAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(412); match(LPAREN);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413); match(BLANK);
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(419); command_list();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(420); match(BLANK);
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426); match(RPAREN);
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

	public static class Redirection_destinationContext extends ParserRuleContext {
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public Process_substitutionContext process_substitution() {
			return getRuleContext(Process_substitutionContext.class,0);
		}
		public File_descriptorContext file_descriptor() {
			return getRuleContext(File_descriptorContext.class,0);
		}
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public Redirection_destinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection_destination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterRedirection_destination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitRedirection_destination(this);
		}
	}

	public final Redirection_destinationContext redirection_destination() throws RecognitionException {
		Redirection_destinationContext _localctx = new Redirection_destinationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_redirection_destination);
		int _la;
		try {
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(428); match(BLANK);
					}
				}

				setState(431); file_descriptor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432); match(BLANK);
				setState(433); process_substitution();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(434); match(BLANK);
					}
				}

				setState(437); string_expr();
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

	public static class File_descriptorContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(BashastParser.DIGIT, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public File_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterFile_descriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitFile_descriptor(this);
		}
	}

	public final File_descriptorContext file_descriptor() throws RecognitionException {
		File_descriptorContext _localctx = new File_descriptorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_file_descriptor);
		try {
			setState(443);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440); match(DIGIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441); match(DIGIT);
				setState(442); match(MINUS);
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

	public static class Here_stringContext extends ParserRuleContext {
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public TerminalNode HERE_STRING_OP() { return getToken(BashastParser.HERE_STRING_OP, 0); }
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Here_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_here_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterHere_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitHere_string(this);
		}
	}

	public final Here_stringContext here_string() throws RecognitionException {
		Here_stringContext _localctx = new Here_stringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_here_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_la = _input.LA(1);
			if (_la==BLANK) {
				{
				setState(445); match(BLANK);
				}
			}

			setState(448); match(HERE_STRING_OP);
			setState(450);
			_la = _input.LA(1);
			if (_la==BLANK) {
				{
				setState(449); match(BLANK);
				}
			}

			setState(452); string_expr();
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

	public static class Here_documentContext extends ParserRuleContext {
		public String here_document_word;
		public int number_of_tokens;
		public RedirectionContext redirection() {
			return getRuleContext(RedirectionContext.class,0);
		}
		public Here_document_endContext here_document_end() {
			return getRuleContext(Here_document_endContext.class,0);
		}
		public TerminalNode EOL() { return getToken(BashastParser.EOL, 0); }
		public Here_document_operatorContext here_document_operator() {
			return getRuleContext(Here_document_operatorContext.class,0);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Here_document_contentContext here_document_content() {
			return getRuleContext(Here_document_contentContext.class,0);
		}
		public Here_document_beginContext here_document_begin() {
			return getRuleContext(Here_document_beginContext.class,0);
		}
		public Here_documentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_here_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterHere_document(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitHere_document(this);
		}
	}

	public final Here_documentContext here_document() throws RecognitionException {
		Here_documentContext _localctx = new Here_documentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_here_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if (_la==BLANK) {
				{
				setState(454); match(BLANK);
				}
			}

			setState(457); here_document_operator();
			setState(459);
			_la = _input.LA(1);
			if (_la==BLANK) {
				{
				setState(458); match(BLANK);
				}
			}

			setState(461); here_document_begin();
			setState(463);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << RSHIFT) | (1L << AMP_LESS_THAN) | (1L << AMP_GREATER_THAN) | (1L << AMP_RSHIFT) | (1L << BLANK) | (1L << HERE_STRING_OP))) != 0)) {
				{
				setState(462); redirection();
				}
			}

			setState(465); match(EOL);
			setState(467);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(466); here_document_content();
				}
				break;
			}
			setState(469); here_document_end();
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

	public static class Here_document_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode LSHIFT() { return getToken(BashastParser.LSHIFT, 0); }
		public Here_document_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_here_document_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterHere_document_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitHere_document_operator(this);
		}
	}

	public final Here_document_operatorContext here_document_operator() throws RecognitionException {
		Here_document_operatorContext _localctx = new Here_document_operatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_here_document_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471); match(LSHIFT);
			setState(474);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(472); match(MINUS);
				}
				break;
			case 2:
				{
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

	public static class Here_document_beginContext extends ParserRuleContext {
		public Token token;
		public TerminalNode AMP_RSHIFT(int i) {
			return getToken(BashastParser.AMP_RSHIFT, i);
		}
		public List<TerminalNode> EOL() { return getTokens(BashastParser.EOL); }
		public TerminalNode AMP_LESS_THAN(int i) {
			return getToken(BashastParser.AMP_LESS_THAN, i);
		}
		public List<TerminalNode> AMP_LESS_THAN() { return getTokens(BashastParser.AMP_LESS_THAN); }
		public TerminalNode HERE_STRING_OP(int i) {
			return getToken(BashastParser.HERE_STRING_OP, i);
		}
		public TerminalNode AMP_GREATER_THAN(int i) {
			return getToken(BashastParser.AMP_GREATER_THAN, i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(BashastParser.GREATER_THAN); }
		public TerminalNode EOL(int i) {
			return getToken(BashastParser.EOL, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(BashastParser.LESS_THAN); }
		public List<TerminalNode> AMP_RSHIFT() { return getTokens(BashastParser.AMP_RSHIFT); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(BashastParser.LESS_THAN, i);
		}
		public TerminalNode GREATER_THAN(int i) {
			return getToken(BashastParser.GREATER_THAN, i);
		}
		public List<TerminalNode> HERE_STRING_OP() { return getTokens(BashastParser.HERE_STRING_OP); }
		public List<TerminalNode> AMP_GREATER_THAN() { return getTokens(BashastParser.AMP_GREATER_THAN); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<TerminalNode> RSHIFT() { return getTokens(BashastParser.RSHIFT); }
		public TerminalNode RSHIFT(int i) {
			return getToken(BashastParser.RSHIFT, i);
		}
		public Here_document_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_here_document_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterHere_document_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitHere_document_begin(this);
		}
	}

	public final Here_document_beginContext here_document_begin() throws RecognitionException {
		Here_document_beginContext _localctx = new Here_document_beginContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_here_document_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(476);
				((Here_document_beginContext)_localctx).token = _input.LT(1);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << RSHIFT) | (1L << AMP_LESS_THAN) | (1L << AMP_GREATER_THAN) | (1L << AMP_RSHIFT) | (1L << BLANK) | (1L << EOL) | (1L << HERE_STRING_OP))) != 0)) ) {
					((Here_document_beginContext)_localctx).token = (Token)_errHandler.recoverInline(this);
				}
				consume();

								if(LA(-1) != DQUOTE && LA(-1) != ESC)
								{
									((Here_documentContext)getInvokingContext(15)).here_document_word += get_string(((Here_document_beginContext)_localctx).token);
									((Here_documentContext)getInvokingContext(15)).number_of_tokens++;
								}
							
				}
				}
				setState(480); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BANG) | (1L << CASE) | (1L << DO) | (1L << DONE) | (1L << ELIF) | (1L << ELSE) | (1L << ESAC) | (1L << FI) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << SELECT) | (1L << THEN) | (1L << UNTIL) | (1L << WHILE) | (1L << LBRACE) | (1L << RBRACE) | (1L << TIME) | (1L << RPAREN) | (1L << LPAREN) | (1L << LLPAREN) | (1L << LSQUARE) | (1L << RSQUARE) | (1L << TICK) | (1L << DOLLAR) | (1L << AT) | (1L << DOT) | (1L << DOTDOT) | (1L << TIMES) | (1L << EQUALS) | (1L << MINUS) | (1L << PLUS) | (1L << EXP) | (1L << AMP) | (1L << CARET) | (1L << LSHIFT) | (1L << SEMIC) | (1L << DOUBLE_SEMIC) | (1L << PIPE) | (1L << ESC_DQUOTE) | (1L << ESC_SQUOTE) | (1L << DQUOTE) | (1L << SQUOTE) | (1L << SINGLE_QUOTED_STRING_TOKEN) | (1L << COMMA) | (1L << DIGIT) | (1L << NUMBER) | (1L << LETTER) | (1L << TILDE) | (1L << POUND) | (1L << PCT) | (1L << PCTPCT) | (1L << SLASH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLON - 64)) | (1L << (QMARK - 64)) | (1L << (LOCAL - 64)) | (1L << (EXPORT - 64)) | (1L << (DECLARE - 64)) | (1L << (LOGICAND - 64)) | (1L << (LOGICOR - 64)) | (1L << (CONTINUE_LINE - 64)) | (1L << (ESC_RPAREN - 64)) | (1L << (ESC_LPAREN - 64)) | (1L << (ESC_RSQUARE - 64)) | (1L << (ESC_LSQUARE - 64)) | (1L << (ESC_DOLLAR - 64)) | (1L << (ESC_TICK - 64)) | (1L << (COMMAND_SUBSTITUTION_PAREN - 64)) | (1L << (COMMAND_SUBSTITUTION_TICK - 64)) | (1L << (ESC_LT - 64)) | (1L << (ESC_GT - 64)) | (1L << (ESC - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (NAME - 64)) | (1L << (OTHER - 64)) | (1L << (ANSI_C_QUOTING - 64)) | (1L << (ARG - 64)) | (1L << (ARRAY - 64)) | (1L << (ARRAY_SIZE - 64)) | (1L << (BRACE_EXP - 64)) | (1L << (COMMAND_SUB - 64)) | (1L << (CASE_PATTERN - 64)) | (1L << (CASE_COMMAND - 64)) | (1L << (SUBSHELL - 64)) | (1L << (CURRENT_SHELL - 64)) | (1L << (COMPOUND_COND - 64)) | (1L << (CFOR - 64)) | (1L << (FOR_INIT - 64)) | (1L << (FOR_COND - 64)) | (1L << (FOR_MOD - 64)) | (1L << (IF_STATEMENT - 64)) | (1L << (OP - 64)) | (1L << (PRE_INCR - 64)) | (1L << (PRE_DECR - 64)) | (1L << (POST_INCR - 64)) | (1L << (POST_DECR - 64)) | (1L << (PROCESS_SUBSTITUTION - 64)) | (1L << (VAR_REF - 64)) | (1L << (NEGATION - 64)) | (1L << (LIST - 64)) | (1L << (STRING - 64)) | (1L << (COMMAND - 64)) | (1L << (FILE_DESCRIPTOR - 64)) | (1L << (FILE_DESCRIPTOR_MOVE - 64)) | (1L << (REDIR - 64)) | (1L << (ARITHMETIC_CONDITION - 64)) | (1L << (ARITHMETIC_EXPRESSION - 64)) | (1L << (ARITHMETIC - 64)) | (1L << (KEYWORD_TEST - 64)) | (1L << (BUILTIN_TEST - 64)) | (1L << (MATCH_ANY_EXCEPT - 64)) | (1L << (EXTENDED_MATCH_EXACTLY_ONE - 64)) | (1L << (EXTENDED_MATCH_AT_MOST_ONE - 64)) | (1L << (EXTENDED_MATCH_NONE - 64)) | (1L << (EXTENDED_MATCH_ANY - 64)) | (1L << (EXTENDED_MATCH_AT_LEAST_ONE - 64)) | (1L << (BRANCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCH_PATTERN - 128)) | (1L << (MATCH_REGULAR_EXPRESSION - 128)) | (1L << (ESCAPED_CHAR - 128)) | (1L << (NOT_MATCH_PATTERN - 128)) | (1L << (MATCH_ANY - 128)) | (1L << (MATCH_ALL - 128)) | (1L << (MATCH_ONE - 128)) | (1L << (CHARACTER_CLASS - 128)) | (1L << (EQUIVALENCE_CLASS - 128)) | (1L << (COLLATING_SYMBOL - 128)) | (1L << (DOUBLE_QUOTED_STRING - 128)) | (1L << (SINGLE_QUOTED_STRING - 128)) | (1L << (VARIABLE_DEFINITIONS - 128)) | (1L << (USE_DEFAULT_WHEN_UNSET - 128)) | (1L << (USE_ALTERNATE_WHEN_UNSET - 128)) | (1L << (DISPLAY_ERROR_WHEN_UNSET - 128)) | (1L << (ASSIGN_DEFAULT_WHEN_UNSET - 128)) | (1L << (USE_DEFAULT_WHEN_UNSET_OR_NULL - 128)) | (1L << (USE_ALTERNATE_WHEN_UNSET_OR_NULL - 128)) | (1L << (DISPLAY_ERROR_WHEN_UNSET_OR_NULL - 128)) | (1L << (ASSIGN_DEFAULT_WHEN_UNSET_OR_NULL - 128)) | (1L << (OFFSET - 128)) | (1L << (LIST_EXPAND - 128)) | (1L << (REPLACE_FIRST - 128)) | (1L << (REPLACE_ALL - 128)) | (1L << (REPLACE_AT_START - 128)) | (1L << (REPLACE_AT_END - 128)) | (1L << (LAZY_REMOVE_AT_START - 128)) | (1L << (LAZY_REMOVE_AT_END - 128)) | (1L << (EMPTY_EXPANSION_VALUE - 128)) | (1L << (PLUS_SIGN - 128)) | (1L << (MINUS_SIGN - 128)) | (1L << (PLUS_ASSIGN - 128)) | (1L << (MINUS_ASSIGN - 128)) | (1L << (DIVIDE_ASSIGN - 128)) | (1L << (MUL_ASSIGN - 128)) | (1L << (MOD_ASSIGN - 128)) | (1L << (LSHIFT_ASSIGN - 128)) | (1L << (RSHIFT_ASSIGN - 128)) | (1L << (AND_ASSIGN - 128)) | (1L << (XOR_ASSIGN - 128)) | (1L << (OR_ASSIGN - 128)) | (1L << (LEQ - 128)) | (1L << (GEQ - 128)) | (1L << (NOT_EQUALS - 128)) | (1L << (EQUALS_TO - 128)) | (1L << (BUILTIN_LOGIC_AND - 128)) | (1L << (BUILTIN_LOGIC_OR - 128)) | (1L << (FUNCTION - 128)) | (1L << (ALPHANUM - 128)))) != 0) );
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

	public static class Here_document_endContext extends ParserRuleContext {
		public Here_document_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_here_document_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterHere_document_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitHere_document_end(this);
		}
	}

	public final Here_document_endContext here_document_end() throws RecognitionException {
		Here_document_endContext _localctx = new Here_document_endContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_here_document_end);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(482);
					if (!( ((Here_documentContext)getInvokingContext(15)).number_of_tokens != 0 )) throw new FailedPredicateException(this, "{ $here_document::number_of_tokens != 0 }? =>");
					setState(483);
					matchWildcard();
					 ((Here_documentContext)getInvokingContext(15)).number_of_tokens--; 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(487); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Here_document_contentContext extends ParserRuleContext {
		public Here_document_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_here_document_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterHere_document_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitHere_document_content(this);
		}
	}

	public final Here_document_contentContext here_document_content() throws RecognitionException {
		Here_document_contentContext _localctx = new Here_document_contentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_here_document_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(489);
					if (!( is_here_end(((Here_documentContext)getInvokingContext(15)).here_document_word, ((Here_documentContext)getInvokingContext(15)).number_of_tokens))) throw new FailedPredicateException(this, "{ is_here_end($here_document::here_document_word, $here_document::number_of_tokens)}? =>");
					setState(490);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(493); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Redirection_operatorContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(BashastParser.LESS_THAN, 0); }
		public TerminalNode AMP_RSHIFT() { return getToken(BashastParser.AMP_RSHIFT, 0); }
		public Redirection_operatorContext redirection_operator() {
			return getRuleContext(Redirection_operatorContext.class,0);
		}
		public TerminalNode AMP_LESS_THAN() { return getToken(BashastParser.AMP_LESS_THAN, 0); }
		public TerminalNode DIGIT() { return getToken(BashastParser.DIGIT, 0); }
		public TerminalNode AMP_GREATER_THAN() { return getToken(BashastParser.AMP_GREATER_THAN, 0); }
		public TerminalNode AMP() { return getToken(BashastParser.AMP, 0); }
		public TerminalNode GREATER_THAN() { return getToken(BashastParser.GREATER_THAN, 0); }
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public TerminalNode RSHIFT() { return getToken(BashastParser.RSHIFT, 0); }
		public Redirection_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterRedirection_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitRedirection_operator(this);
		}
	}

	public final Redirection_operatorContext redirection_operator() throws RecognitionException {
		Redirection_operatorContext _localctx = new Redirection_operatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_redirection_operator);
		int _la;
		try {
			setState(515);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495); match(BLANK);
				setState(496); match(DIGIT);
				setState(497); redirection_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(498); match(BLANK);
					}
				}

				setState(513);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(501); match(AMP_LESS_THAN);
					}
					break;
				case 2:
					{
					setState(502); match(GREATER_THAN);
					setState(503); match(AMP);
					}
					break;
				case 3:
					{
					setState(504); match(LESS_THAN);
					setState(505); match(AMP);
					}
					break;
				case 4:
					{
					setState(506); match(LESS_THAN);
					setState(507); match(GREATER_THAN);
					}
					break;
				case 5:
					{
					setState(508); match(RSHIFT);
					}
					break;
				case 6:
					{
					setState(509); match(AMP_GREATER_THAN);
					}
					break;
				case 7:
					{
					setState(510); match(AMP_RSHIFT);
					}
					break;
				case 8:
					{
					setState(511); match(LESS_THAN);
					}
					break;
				case 9:
					{
					setState(512); match(GREATER_THAN);
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

	public static class CommandContext extends ParserRuleContext {
		public Command_atomContext command_atom() {
			return getRuleContext(Command_atomContext.class,0);
		}
		public RedirectionContext redirection() {
			return getRuleContext(RedirectionContext.class,0);
		}
		public Here_documentContext here_document() {
			return getRuleContext(Here_documentContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); command_atom();
			setState(524);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(518); redirection();
				setState(520);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(519); here_document();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(522); here_document();
				}
				break;
			case 3:
				{
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

	public static class Command_atomContext extends ParserRuleContext {
		public Bash_command_argumentsContext bash_command_arguments(int i) {
			return getRuleContext(Bash_command_argumentsContext.class,i);
		}
		public TerminalNode DECLARE() { return getToken(BashastParser.DECLARE, 0); }
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public WspaceContext wspace() {
			return getRuleContext(WspaceContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(BashastParser.EXPORT, 0); }
		public Command_nameContext command_name() {
			return getRuleContext(Command_nameContext.class,0);
		}
		public List<Bash_command_argumentsContext> bash_command_arguments() {
			return getRuleContexts(Bash_command_argumentsContext.class);
		}
		public ParensContext parens() {
			return getRuleContext(ParensContext.class,0);
		}
		public Variable_definitionsContext variable_definitions() {
			return getRuleContext(Variable_definitionsContext.class,0);
		}
		public Builtin_variable_definition_itemContext builtin_variable_definition_item() {
			return getRuleContext(Builtin_variable_definition_itemContext.class,0);
		}
		public String_expr_no_reserved_wordContext string_expr_no_reserved_word() {
			return getRuleContext(String_expr_no_reserved_wordContext.class,0);
		}
		public Bash_commandContext bash_command() {
			return getRuleContext(Bash_commandContext.class,0);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Compound_commandContext compound_command() {
			return getRuleContext(Compound_commandContext.class,0);
		}
		public TerminalNode NAME() { return getToken(BashastParser.NAME, 0); }
		public TerminalNode LOCAL() { return getToken(BashastParser.LOCAL, 0); }
		public Command_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCommand_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCommand_atom(this);
		}
	}

	public final Command_atomContext command_atom() throws RecognitionException {
		Command_atomContext _localctx = new Command_atomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_command_atom);
		int _la;
		try {
			int _alt;
			setState(579);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				if (!(LA(1) == FOR|| LA(1) == SELECT|| LA(1) == IF|| LA(1) == WHILE|| LA(1) == UNTIL||
						 LA(1) == CASE|| LA(1) == LPAREN|| LA(1) == LBRACE|| LA(1) == LLPAREN|| LA(1) == LSQUARE||

						(LA(1) == NAME && LA(2) == BLANK && "test".equals(get_string(LT(1)))))) throw new FailedPredicateException(this, "{LA(1) == FOR|| LA(1) == SELECT|| LA(1) == IF|| LA(1) == WHILE|| LA(1) == UNTIL||\n\t\t LA(1) == CASE|| LA(1) == LPAREN|| LA(1) == LBRACE|| LA(1) == LLPAREN|| LA(1) == LSQUARE||\n\n\t\t(LA(1) == NAME && LA(2) == BLANK && \"test\".equals(get_string(LT(1))))}? =>");
				setState(527); compound_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				if (!(LA(1) == NAME && LA(2) == BLANK && "function".equals(get_string(LT(1))))) throw new FailedPredicateException(this, "{LA(1) == NAME && LA(2) == BLANK && \"function\".equals(get_string(LT(1)))}? =>");
				setState(529); match(NAME);
				setState(530); match(BLANK);
				setState(531); string_expr_no_reserved_word();
				setState(540);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					{
					setState(533);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(532); match(BLANK);
						}
					}

					setState(535); parens();
					setState(537);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(536); wspace();
						}
						break;
					}
					}
					}
					break;
				case 2:
					{
					setState(539); wspace();
					}
					break;
				}
				setState(542); compound_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544); variable_definitions();
				setState(548);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(545); match(BLANK);
					setState(546); bash_command();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(550); match(EXPORT);
				setState(551); match(BLANK);
				setState(552); builtin_variable_definition_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(553); match(LOCAL);
				setState(554); match(BLANK);
				setState(555); builtin_variable_definition_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(556); match(DECLARE);
				setState(557); match(BLANK);
				setState(558); builtin_variable_definition_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(559); command_name();
				setState(577);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(561);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(560); match(BLANK);
						}
					}

					setState(563); parens();
					setState(565);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(564); wspace();
						}
						break;
					}
					setState(567); compound_command();
					}
					break;
				case 2:
					{
					setState(574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(569);
							if (!(LA(1) == BLANK &&
												(
													is_special_token(LA(2))
													// redirection
													&&(LA(2) != DIGIT || (LA(3) != AMP_LESS_THAN &&
																		  LA(3) != AMP_GREATER_THAN &&
																		  LA(3) != AMP_RSHIFT &&
																		  LA(3) != GREATER_THAN &&
																		  LA(3) != LESS_THAN &&
																		  LA(3) != RSHIFT))
												))) throw new FailedPredicateException(this, "{LA(1) == BLANK &&\n\t\t\t\t\t(\n\t\t\t\t\t\tis_special_token(LA(2))\n\t\t\t\t\t\t// redirection\n\t\t\t\t\t\t&&(LA(2) != DIGIT || (LA(3) != AMP_LESS_THAN &&\n\t\t\t\t\t\t\t\t\t\t\t  LA(3) != AMP_GREATER_THAN &&\n\t\t\t\t\t\t\t\t\t\t\t  LA(3) != AMP_RSHIFT &&\n\t\t\t\t\t\t\t\t\t\t\t  LA(3) != GREATER_THAN &&\n\t\t\t\t\t\t\t\t\t\t\t  LA(3) != LESS_THAN &&\n\t\t\t\t\t\t\t\t\t\t\t  LA(3) != RSHIFT))\n\t\t\t\t\t)}? =>");
							setState(570); match(BLANK);
							setState(571); bash_command_arguments();
							}
							} 
						}
						setState(576);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
					}
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

	public static class Command_nameContext extends ParserRuleContext {
		public Redirection_atomContext redirection_atom() {
			return getRuleContext(Redirection_atomContext.class,0);
		}
		public String_expr_no_reserved_wordContext string_expr_no_reserved_word() {
			return getRuleContext(String_expr_no_reserved_wordContext.class,0);
		}
		public Command_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCommand_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCommand_name(this);
		}
	}

	public final Command_nameContext command_name() throws RecognitionException {
		Command_nameContext _localctx = new Command_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_command_name);
		try {
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581); string_expr_no_reserved_word();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				if (!(LA(1) == GREATER_THAN)) throw new FailedPredicateException(this, "{LA(1) == GREATER_THAN}? =>");
				setState(583); redirection_atom();
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

	public static class Variable_definitionsContext extends ParserRuleContext {
		public Variable_definition_atomContext variable_definition_atom(int i) {
			return getRuleContext(Variable_definition_atomContext.class,i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<Variable_definition_atomContext> variable_definition_atom() {
			return getRuleContexts(Variable_definition_atomContext.class);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Variable_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterVariable_definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitVariable_definitions(this);
		}
	}

	public final Variable_definitionsContext variable_definitions() throws RecognitionException {
		Variable_definitionsContext _localctx = new Variable_definitionsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variable_definitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586); variable_definition_atom();
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(587); match(BLANK);
					setState(588); variable_definition_atom();
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class Variable_definition_atomContext extends ParserRuleContext {
		public Explicit_arithmeticContext explicit_arithmetic() {
			return getRuleContext(Explicit_arithmeticContext.class,0);
		}
		public List<String_expr_partContext> string_expr_part() {
			return getRuleContexts(String_expr_partContext.class);
		}
		public Array_valueContext array_value() {
			return getRuleContext(Array_valueContext.class,0);
		}
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(BashastParser.EQUALS, 0); }
		public String_expr_partContext string_expr_part(int i) {
			return getRuleContext(String_expr_partContext.class,i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public TerminalNode PLUS() { return getToken(BashastParser.PLUS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Variable_definition_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterVariable_definition_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitVariable_definition_atom(this);
		}
	}

	public final Variable_definition_atomContext variable_definition_atom() throws RecognitionException {
		Variable_definition_atomContext _localctx = new Variable_definition_atomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable_definition_atom);
		int _la;
		try {
			setState(627);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594); name();
				setState(595); match(LSQUARE);
				setState(597);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(596); match(BLANK);
					}
				}

				setState(599); explicit_arithmetic();
				setState(601);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(600); match(BLANK);
					}
				}

				setState(603); match(RSQUARE);
				setState(604); match(EQUALS);
				setState(606);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << CASE) | (1L << DO) | (1L << DONE) | (1L << ELIF) | (1L << ELSE) | (1L << ESAC) | (1L << FI) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << SELECT) | (1L << THEN) | (1L << UNTIL) | (1L << WHILE) | (1L << LBRACE) | (1L << TIME) | (1L << LSQUARE) | (1L << RSQUARE) | (1L << DOLLAR) | (1L << AT) | (1L << DOT) | (1L << DOTDOT) | (1L << TIMES) | (1L << EQUALS) | (1L << MINUS) | (1L << PLUS) | (1L << CARET) | (1L << ESC_DQUOTE) | (1L << ESC_SQUOTE) | (1L << DQUOTE) | (1L << SINGLE_QUOTED_STRING_TOKEN) | (1L << COMMA) | (1L << DIGIT) | (1L << NUMBER) | (1L << LETTER) | (1L << TILDE) | (1L << POUND) | (1L << PCT) | (1L << PCTPCT) | (1L << SLASH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLON - 64)) | (1L << (QMARK - 64)) | (1L << (LOCAL - 64)) | (1L << (EXPORT - 64)) | (1L << (DECLARE - 64)) | (1L << (ESC_RPAREN - 64)) | (1L << (ESC_LPAREN - 64)) | (1L << (ESC_RSQUARE - 64)) | (1L << (ESC_LSQUARE - 64)) | (1L << (ESC_DOLLAR - 64)) | (1L << (ESC_TICK - 64)) | (1L << (COMMAND_SUBSTITUTION_PAREN - 64)) | (1L << (COMMAND_SUBSTITUTION_TICK - 64)) | (1L << (ESC_LT - 64)) | (1L << (ESC_GT - 64)) | (1L << (ESC - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (NAME - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					setState(605); string_expr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608); name();
				setState(609); match(EQUALS);
				setState(611);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << CASE) | (1L << DO) | (1L << DONE) | (1L << ELIF) | (1L << ELSE) | (1L << ESAC) | (1L << FI) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << SELECT) | (1L << THEN) | (1L << UNTIL) | (1L << WHILE) | (1L << LBRACE) | (1L << TIME) | (1L << LPAREN) | (1L << LSQUARE) | (1L << RSQUARE) | (1L << DOLLAR) | (1L << AT) | (1L << DOT) | (1L << DOTDOT) | (1L << TIMES) | (1L << EQUALS) | (1L << MINUS) | (1L << PLUS) | (1L << CARET) | (1L << ESC_DQUOTE) | (1L << ESC_SQUOTE) | (1L << DQUOTE) | (1L << SINGLE_QUOTED_STRING_TOKEN) | (1L << COMMA) | (1L << DIGIT) | (1L << NUMBER) | (1L << LETTER) | (1L << TILDE) | (1L << POUND) | (1L << PCT) | (1L << PCTPCT) | (1L << SLASH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLON - 64)) | (1L << (QMARK - 64)) | (1L << (LOCAL - 64)) | (1L << (EXPORT - 64)) | (1L << (DECLARE - 64)) | (1L << (ESC_RPAREN - 64)) | (1L << (ESC_LPAREN - 64)) | (1L << (ESC_RSQUARE - 64)) | (1L << (ESC_LSQUARE - 64)) | (1L << (ESC_DOLLAR - 64)) | (1L << (ESC_TICK - 64)) | (1L << (COMMAND_SUBSTITUTION_PAREN - 64)) | (1L << (COMMAND_SUBSTITUTION_TICK - 64)) | (1L << (ESC_LT - 64)) | (1L << (ESC_GT - 64)) | (1L << (ESC - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (NAME - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					setState(610); value();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(613); name();
				setState(614); match(PLUS);
				setState(615); match(EQUALS);
				setState(616); array_value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(618); name();
				setState(619); match(PLUS);
				setState(620); match(EQUALS);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << CASE) | (1L << DO) | (1L << DONE) | (1L << ELIF) | (1L << ELSE) | (1L << ESAC) | (1L << FI) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << SELECT) | (1L << THEN) | (1L << UNTIL) | (1L << WHILE) | (1L << LBRACE) | (1L << TIME) | (1L << LSQUARE) | (1L << RSQUARE) | (1L << DOLLAR) | (1L << AT) | (1L << DOT) | (1L << DOTDOT) | (1L << TIMES) | (1L << EQUALS) | (1L << MINUS) | (1L << PLUS) | (1L << CARET) | (1L << ESC_DQUOTE) | (1L << ESC_SQUOTE) | (1L << DQUOTE) | (1L << SINGLE_QUOTED_STRING_TOKEN) | (1L << COMMA) | (1L << DIGIT) | (1L << NUMBER) | (1L << LETTER) | (1L << TILDE) | (1L << POUND) | (1L << PCT) | (1L << PCTPCT) | (1L << SLASH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLON - 64)) | (1L << (QMARK - 64)) | (1L << (LOCAL - 64)) | (1L << (EXPORT - 64)) | (1L << (DECLARE - 64)) | (1L << (ESC_RPAREN - 64)) | (1L << (ESC_LPAREN - 64)) | (1L << (ESC_RSQUARE - 64)) | (1L << (ESC_LSQUARE - 64)) | (1L << (ESC_DOLLAR - 64)) | (1L << (ESC_TICK - 64)) | (1L << (COMMAND_SUBSTITUTION_PAREN - 64)) | (1L << (COMMAND_SUBSTITUTION_TICK - 64)) | (1L << (ESC_LT - 64)) | (1L << (ESC_GT - 64)) | (1L << (ESC - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (NAME - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(621); string_expr_part();
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ValueContext extends ParserRuleContext {
		public Array_valueContext array_value() {
			return getRuleContext(Array_valueContext.class,0);
		}
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value);
		try {
			setState(631);
			switch (_input.LA(1)) {
			case BANG:
			case CASE:
			case DO:
			case DONE:
			case ELIF:
			case ELSE:
			case ESAC:
			case FI:
			case FOR:
			case IF:
			case IN:
			case SELECT:
			case THEN:
			case UNTIL:
			case WHILE:
			case LBRACE:
			case TIME:
			case LSQUARE:
			case RSQUARE:
			case DOLLAR:
			case AT:
			case DOT:
			case DOTDOT:
			case TIMES:
			case EQUALS:
			case MINUS:
			case PLUS:
			case CARET:
			case ESC_DQUOTE:
			case ESC_SQUOTE:
			case DQUOTE:
			case SINGLE_QUOTED_STRING_TOKEN:
			case COMMA:
			case DIGIT:
			case NUMBER:
			case LETTER:
			case TILDE:
			case POUND:
			case PCT:
			case PCTPCT:
			case SLASH:
			case COLON:
			case QMARK:
			case LOCAL:
			case EXPORT:
			case DECLARE:
			case ESC_RPAREN:
			case ESC_LPAREN:
			case ESC_RSQUARE:
			case ESC_LSQUARE:
			case ESC_DOLLAR:
			case ESC_TICK:
			case COMMAND_SUBSTITUTION_PAREN:
			case COMMAND_SUBSTITUTION_TICK:
			case ESC_LT:
			case ESC_GT:
			case ESC:
			case UNDERSCORE:
			case NAME:
			case OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(629); string_expr();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(630); array_value();
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

	public static class Array_valueContext extends ParserRuleContext {
		public boolean array_value_end;
		public List<Array_atomContext> array_atom() {
			return getRuleContexts(Array_atomContext.class);
		}
		public Array_atomContext array_atom(int i) {
			return getRuleContext(Array_atomContext.class,i);
		}
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(BashastParser.LPAREN, 0); }
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public Array_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArray_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArray_value(this);
		}
	}

	public final Array_valueContext array_value() throws RecognitionException {
		Array_valueContext _localctx = new Array_valueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633); match(LPAREN);
			setState(635);
			_la = _input.LA(1);
			if (_la==BLANK || _la==EOL) {
				{
				setState(634); wspace();
				}
			}

			setState(649);
			switch (_input.LA(1)) {
			case RPAREN:
				{
				setState(637); match(RPAREN);
				}
				break;
			case BANG:
			case CASE:
			case DO:
			case DONE:
			case ELIF:
			case ELSE:
			case ESAC:
			case FI:
			case FOR:
			case IF:
			case IN:
			case SELECT:
			case THEN:
			case UNTIL:
			case WHILE:
			case LBRACE:
			case TIME:
			case LSQUARE:
			case RSQUARE:
			case DOLLAR:
			case AT:
			case DOT:
			case DOTDOT:
			case TIMES:
			case EQUALS:
			case MINUS:
			case PLUS:
			case CARET:
			case ESC_DQUOTE:
			case ESC_SQUOTE:
			case DQUOTE:
			case SINGLE_QUOTED_STRING_TOKEN:
			case COMMA:
			case DIGIT:
			case NUMBER:
			case LETTER:
			case TILDE:
			case POUND:
			case PCT:
			case PCTPCT:
			case SLASH:
			case COLON:
			case QMARK:
			case LOCAL:
			case EXPORT:
			case DECLARE:
			case ESC_RPAREN:
			case ESC_LPAREN:
			case ESC_RSQUARE:
			case ESC_LSQUARE:
			case ESC_DOLLAR:
			case ESC_TICK:
			case COMMAND_SUBSTITUTION_PAREN:
			case COMMAND_SUBSTITUTION_TICK:
			case ESC_LT:
			case ESC_GT:
			case ESC:
			case UNDERSCORE:
			case NAME:
			case OTHER:
				{
				((Array_valueContext)getInvokingContext(27)).array_value_end =  false; 
				setState(639); array_atom();
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(640);
						if (!(((Array_valueContext)getInvokingContext(27)).array_value_end)) throw new FailedPredicateException(this, "{$array_value::array_value_end}? =>");
						setState(641); wspace();
						setState(642); array_atom();
						}
						} 
					}
					setState(648);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Array_atomContext extends ParserRuleContext {
		public Explicit_arithmeticContext explicit_arithmetic() {
			return getRuleContext(Explicit_arithmeticContext.class,0);
		}
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(BashastParser.EQUALS, 0); }
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public WspaceContext wspace() {
			return getRuleContext(WspaceContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public Array_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArray_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArray_atom(this);
		}
	}

	public final Array_atomContext array_atom() throws RecognitionException {
		Array_atomContext _localctx = new Array_atomContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(651); match(LSQUARE);
				setState(653);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(652); match(BLANK);
					}
				}

				setState(655); explicit_arithmetic();
				setState(657);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(656); match(BLANK);
					}
				}

				setState(659); match(RSQUARE);
				setState(660); match(EQUALS);
				setState(661); string_expr();
				}
				break;
			case 2:
				{
				setState(663); string_expr();
				}
				break;
			}
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(666); wspace();
				setState(667); match(RPAREN);
				((Array_valueContext)getInvokingContext(27)).array_value_end =  true; 
				}
				break;
			case 2:
				{
				setState(670); match(RPAREN);
				((Array_valueContext)getInvokingContext(27)).array_value_end =  true; 
				}
				break;
			case 3:
				{
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

	public static class Builtin_variable_definition_itemContext extends ParserRuleContext {
		public int _parens;
		public boolean dquotes;
		public List<TerminalNode> SEMIC() { return getTokens(BashastParser.SEMIC); }
		public TerminalNode LPAREN(int i) {
			return getToken(BashastParser.LPAREN, i);
		}
		public List<TerminalNode> EOL() { return getTokens(BashastParser.EOL); }
		public TerminalNode DQUOTE(int i) {
			return getToken(BashastParser.DQUOTE, i);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(BashastParser.RPAREN, i);
		}
		public List<TerminalNode> DQUOTE() { return getTokens(BashastParser.DQUOTE); }
		public TerminalNode SEMIC(int i) {
			return getToken(BashastParser.SEMIC, i);
		}
		public Expansion_baseContext expansion_base(int i) {
			return getRuleContext(Expansion_baseContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(BashastParser.RPAREN); }
		public TerminalNode EOL(int i) {
			return getToken(BashastParser.EOL, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(BashastParser.LPAREN); }
		public List<Expansion_baseContext> expansion_base() {
			return getRuleContexts(Expansion_baseContext.class);
		}
		public Builtin_variable_definition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_variable_definition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_variable_definition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_variable_definition_item(this);
		}
	}

	public final Builtin_variable_definition_itemContext builtin_variable_definition_item() throws RecognitionException {
		Builtin_variable_definition_itemContext _localctx = new Builtin_variable_definition_itemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_builtin_variable_definition_item);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(686); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(686);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(675); match(LPAREN);
						 ++((Builtin_variable_definition_itemContext)getInvokingContext(29))._parens; 
						}
						break;
					case 2:
						{
						setState(677); match(RPAREN);
						 --((Builtin_variable_definition_itemContext)getInvokingContext(29))._parens; 
						}
						break;
					case 3:
						{
						setState(679); match(DQUOTE);
						 ((Builtin_variable_definition_itemContext)getInvokingContext(29)).dquotes =   ((Builtin_variable_definition_itemContext)getInvokingContext(29)).dquotes; 
						}
						break;
					case 4:
						{
						setState(681); expansion_base();
						}
						break;
					case 5:
						{
						setState(682);
						if (!(LA(1) == SEMIC && ((Builtin_variable_definition_itemContext)getInvokingContext(29)).dquotes)) throw new FailedPredicateException(this, "{LA(1) == SEMIC && $builtin_variable_definition_item::dquotes}? =>");
						setState(683); match(SEMIC);
						}
						break;
					case 6:
						{
						setState(684);
						if (!(LA(1) == EOL && ((Builtin_variable_definition_itemContext)getInvokingContext(29))._parens > 0 || ((Builtin_variable_definition_itemContext)getInvokingContext(29)).dquotes)) throw new FailedPredicateException(this, "{LA(1) == EOL && $builtin_variable_definition_item::_parens > 0 || $builtin_variable_definition_item::dquotes}? =>");
						setState(685); match(EOL);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(688); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Builtin_variable_definitionsContext extends ParserRuleContext {
		public Builtin_variable_definition_atomContext builtin_variable_definition_atom(int i) {
			return getRuleContext(Builtin_variable_definition_atomContext.class,i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<Builtin_variable_definition_atomContext> builtin_variable_definition_atom() {
			return getRuleContexts(Builtin_variable_definition_atomContext.class);
		}
		public Builtin_variable_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_variable_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_variable_definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_variable_definitions(this);
		}
	}

	public final Builtin_variable_definitionsContext builtin_variable_definitions() throws RecognitionException {
		Builtin_variable_definitionsContext _localctx = new Builtin_variable_definitionsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_builtin_variable_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(690); builtin_variable_definition_atom();
			}
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(691); match(BLANK);
				setState(692); builtin_variable_definition_atom();
				}
				}
				setState(697);
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

	public static class Builtin_variable_definition_atomContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(BashastParser.LETTER, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public Variable_definition_atomContext variable_definition_atom() {
			return getRuleContext(Variable_definition_atomContext.class,0);
		}
		public Builtin_variable_definition_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_variable_definition_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_variable_definition_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_variable_definition_atom(this);
		}
	}

	public final Builtin_variable_definition_atomContext builtin_variable_definition_atom() throws RecognitionException {
		Builtin_variable_definition_atomContext _localctx = new Builtin_variable_definition_atomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_builtin_variable_definition_atom);
		try {
			setState(701);
			switch (_input.LA(1)) {
			case LETTER:
			case UNDERSCORE:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(698); variable_definition_atom();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(699); match(MINUS);
				setState(700); match(LETTER);
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

	public static class Bash_commandContext extends ParserRuleContext {
		public Bash_command_argumentsContext bash_command_arguments(int i) {
			return getRuleContext(Bash_command_argumentsContext.class,i);
		}
		public List<Bash_command_argumentsContext> bash_command_arguments() {
			return getRuleContexts(Bash_command_argumentsContext.class);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public String_expr_no_reserved_wordContext string_expr_no_reserved_word() {
			return getRuleContext(String_expr_no_reserved_wordContext.class,0);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Bash_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bash_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBash_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBash_command(this);
		}
	}

	public final Bash_commandContext bash_command() throws RecognitionException {
		Bash_commandContext _localctx = new Bash_commandContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bash_command);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703); string_expr_no_reserved_word();
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(704); match(BLANK);
					setState(705); bash_command_arguments();
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class Bash_command_argumentsContext extends ParserRuleContext {
		public List<Bash_command_argument_atomContext> bash_command_argument_atom() {
			return getRuleContexts(Bash_command_argument_atomContext.class);
		}
		public Bash_command_argument_atomContext bash_command_argument_atom(int i) {
			return getRuleContext(Bash_command_argument_atomContext.class,i);
		}
		public Bash_command_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bash_command_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBash_command_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBash_command_arguments(this);
		}
	}

	public final Bash_command_argumentsContext bash_command_arguments() throws RecognitionException {
		Bash_command_argumentsContext _localctx = new Bash_command_argumentsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bash_command_arguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(712); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(711); bash_command_argument_atom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(714); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Bash_command_argument_atomContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BashastParser.LBRACE, 0); }
		public String_expr_partContext string_expr_part() {
			return getRuleContext(String_expr_partContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BashastParser.RBRACE, 0); }
		public Brace_expansionContext brace_expansion() {
			return getRuleContext(Brace_expansionContext.class,0);
		}
		public Bash_command_argument_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bash_command_argument_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBash_command_argument_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBash_command_argument_atom(this);
		}
	}

	public final Bash_command_argument_atomContext bash_command_argument_atom() throws RecognitionException {
		Bash_command_argument_atomContext _localctx = new Bash_command_argument_atomContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bash_command_argument_atom);
		try {
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(716); brace_expansion();
					}
					break;
				case 2:
					{
					setState(717); match(LBRACE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720); match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(721); string_expr_part();
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

	public static class ParensContext extends ParserRuleContext {
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(BashastParser.LPAREN, 0); }
		public ParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitParens(this);
		}
	}

	public final ParensContext parens() throws RecognitionException {
		ParensContext _localctx = new ParensContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724); match(LPAREN);
			setState(726);
			_la = _input.LA(1);
			if (_la==BLANK) {
				{
				setState(725); match(BLANK);
				}
			}

			setState(728); match(RPAREN);
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

	public static class Compound_commandContext extends ParserRuleContext {
		public Case_exprContext case_expr() {
			return getRuleContext(Case_exprContext.class,0);
		}
		public SubshellContext subshell() {
			return getRuleContext(SubshellContext.class,0);
		}
		public Select_exprContext select_expr() {
			return getRuleContext(Select_exprContext.class,0);
		}
		public For_exprContext for_expr() {
			return getRuleContext(For_exprContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Until_exprContext until_expr() {
			return getRuleContext(Until_exprContext.class,0);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Current_shellContext current_shell() {
			return getRuleContext(Current_shellContext.class,0);
		}
		public While_exprContext while_expr() {
			return getRuleContext(While_exprContext.class,0);
		}
		public Condition_comparisonContext condition_comparison() {
			return getRuleContext(Condition_comparisonContext.class,0);
		}
		public Compound_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCompound_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCompound_command(this);
		}
	}

	public final Compound_commandContext compound_command() throws RecognitionException {
		Compound_commandContext _localctx = new Compound_commandContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_compound_command);
		try {
			setState(740);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730); for_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731); select_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(732); if_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(733); while_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(734); until_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(735); case_expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(736); subshell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(737); current_shell();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(738); arithmetic_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(739); condition_comparison();
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

	public static class SemielContext extends ParserRuleContext {
		public TerminalNode SEMIC() { return getToken(BashastParser.SEMIC, 0); }
		public TerminalNode EOL() { return getToken(BashastParser.EOL, 0); }
		public WspaceContext wspace() {
			return getRuleContext(WspaceContext.class,0);
		}
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public SemielContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semiel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterSemiel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitSemiel(this);
		}
	}

	public final SemielContext semiel() throws RecognitionException {
		SemielContext _localctx = new SemielContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_semiel);
		int _la;
		try {
			setState(756);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(742); match(BLANK);
					}
				}

				setState(745); match(SEMIC);
				setState(747);
				_la = _input.LA(1);
				if (_la==BLANK || _la==EOL) {
					{
					setState(746); wspace();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(749); match(BLANK);
					}
				}

				setState(752); match(EOL);
				setState(754);
				_la = _input.LA(1);
				if (_la==BLANK || _la==EOL) {
					{
					setState(753); wspace();
					}
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

	public static class For_exprContext extends ParserRuleContext {
		public ArithmeticsContext init;
		public ArithmeticsContext fcond;
		public ArithmeticsContext mod;
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public TerminalNode EOL() { return getToken(BashastParser.EOL, 0); }
		public List<SemielContext> semiel() {
			return getRuleContexts(SemielContext.class);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(BashastParser.RPAREN, i);
		}
		public TerminalNode SEMIC(int i) {
			return getToken(BashastParser.SEMIC, i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public TerminalNode DONE() { return getToken(BashastParser.DONE, 0); }
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public List<ArithmeticsContext> arithmetics() {
			return getRuleContexts(ArithmeticsContext.class);
		}
		public For_each_valueContext for_each_value(int i) {
			return getRuleContext(For_each_valueContext.class,i);
		}
		public TerminalNode DOUBLE_SEMIC() { return getToken(BashastParser.DOUBLE_SEMIC, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> SEMIC() { return getTokens(BashastParser.SEMIC); }
		public TerminalNode IN() { return getToken(BashastParser.IN, 0); }
		public TerminalNode LLPAREN() { return getToken(BashastParser.LLPAREN, 0); }
		public TerminalNode DO() { return getToken(BashastParser.DO, 0); }
		public TerminalNode FOR() { return getToken(BashastParser.FOR, 0); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<TerminalNode> RPAREN() { return getTokens(BashastParser.RPAREN); }
		public SemielContext semiel(int i) {
			return getRuleContext(SemielContext.class,i);
		}
		public List<For_each_valueContext> for_each_value() {
			return getRuleContexts(For_each_valueContext.class);
		}
		public ArithmeticsContext arithmetics(int i) {
			return getRuleContext(ArithmeticsContext.class,i);
		}
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public For_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterFor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitFor_expr(this);
		}
	}

	public final For_exprContext for_expr() throws RecognitionException {
		For_exprContext _localctx = new For_exprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_for_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758); match(FOR);
			setState(760);
			_la = _input.LA(1);
			if (_la==BLANK) {
				{
				setState(759); match(BLANK);
				}
			}

			setState(841);
			switch (_input.LA(1)) {
			case LETTER:
			case UNDERSCORE:
			case NAME:
				{
				setState(762); name();
				setState(786);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(763); wspace();
					setState(764); match(IN);
					setState(768);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(765); for_each_value();
							}
							} 
						}
						setState(770);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
					}
					setState(772);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(771); match(BLANK);
						}
					}

					setState(774);
					_la = _input.LA(1);
					if ( !(_la==SEMIC || _la==EOL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(776);
					_la = _input.LA(1);
					if (_la==BLANK || _la==EOL) {
						{
						setState(775); wspace();
						}
					}

					}
					break;
				case 2:
					{
					setState(779);
					_la = _input.LA(1);
					if (_la==BLANK || _la==EOL) {
						{
						setState(778); wspace();
						}
					}

					setState(781); match(SEMIC);
					setState(783);
					_la = _input.LA(1);
					if (_la==BLANK || _la==EOL) {
						{
						setState(782); wspace();
						}
					}

					}
					break;
				case 3:
					{
					setState(785); wspace();
					}
					break;
				}
				setState(788); match(DO);
				setState(789); wspace();
				setState(790); command_list();
				setState(791); semiel();
				setState(792); match(DONE);
				}
				break;
			case LLPAREN:
				{
				setState(794); match(LLPAREN);
				setState(796);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(795); match(EOL);
					}
				}

				setState(806);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(799);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(798); match(BLANK);
						}
					}

					setState(801); ((For_exprContext)_localctx).init = arithmetics();
					setState(803);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(802); match(BLANK);
						}
					}

					}
					break;
				case 2:
					{
					setState(805); match(BLANK);
					}
					break;
				}
				setState(821);
				switch (_input.LA(1)) {
				case SEMIC:
					{
					setState(808); match(SEMIC);
					setState(817);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						setState(810);
						_la = _input.LA(1);
						if (_la==BLANK) {
							{
							setState(809); match(BLANK);
							}
						}

						setState(812); ((For_exprContext)_localctx).fcond = arithmetics();
						setState(814);
						_la = _input.LA(1);
						if (_la==BLANK) {
							{
							setState(813); match(BLANK);
							}
						}

						}
						break;
					case 2:
						{
						setState(816); match(BLANK);
						}
						break;
					}
					setState(819); match(SEMIC);
					}
					break;
				case DOUBLE_SEMIC:
					{
					setState(820); match(DOUBLE_SEMIC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(827);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(824);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(823); match(BLANK);
						}
					}

					setState(826); ((For_exprContext)_localctx).mod = arithmetics();
					}
					break;
				}
				setState(830);
				_la = _input.LA(1);
				if (_la==BLANK || _la==EOL) {
					{
					setState(829); wspace();
					}
				}

				setState(832); match(RPAREN);
				setState(833); match(RPAREN);
				setState(834); semiel();
				setState(835); match(DO);
				setState(836); wspace();
				setState(837); command_list();
				setState(838); semiel();
				setState(839); match(DONE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class For_each_valueContext extends ParserRuleContext {
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public For_each_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterFor_each_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitFor_each_value(this);
		}
	}

	public final For_each_valueContext for_each_value() throws RecognitionException {
		For_each_valueContext _localctx = new For_each_valueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_for_each_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			if (!(LA(1) == BLANK && LA(2) != EOL && LA(2) != SEMIC && LA(2) != DO)) throw new FailedPredicateException(this, "{LA(1) == BLANK && LA(2) != EOL && LA(2) != SEMIC && LA(2) != DO}?\n\t\t\t=>");
			{
			setState(844); match(BLANK);
			setState(845); string_expr();
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

	public static class Select_exprContext extends ParserRuleContext {
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public List<SemielContext> semiel() {
			return getRuleContexts(SemielContext.class);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public TerminalNode DONE() { return getToken(BashastParser.DONE, 0); }
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public TerminalNode SELECT() { return getToken(BashastParser.SELECT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode IN() { return getToken(BashastParser.IN, 0); }
		public TerminalNode DO() { return getToken(BashastParser.DO, 0); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public SemielContext semiel(int i) {
			return getRuleContext(SemielContext.class,i);
		}
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public Select_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterSelect_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitSelect_expr(this);
		}
	}

	public final Select_exprContext select_expr() throws RecognitionException {
		Select_exprContext _localctx = new Select_exprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_select_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847); match(SELECT);
			setState(848); match(BLANK);
			setState(849); name();
			setState(855);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(850); wspace();
				setState(851); match(IN);
				setState(852); match(BLANK);
				setState(853); string_expr();
				}
				break;
			}
			setState(857); semiel();
			setState(858); match(DO);
			setState(859); wspace();
			setState(860); command_list();
			setState(861); semiel();
			setState(862); match(DONE);
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

	public static class If_exprContext extends ParserRuleContext {
		public Command_listContext ag;
		public Command_listContext iflist;
		public Command_listContext else_list;
		public TerminalNode THEN() { return getToken(BashastParser.THEN, 0); }
		public TerminalNode IF() { return getToken(BashastParser.IF, 0); }
		public List<Command_listContext> command_list() {
			return getRuleContexts(Command_listContext.class);
		}
		public List<Elif_exprContext> elif_expr() {
			return getRuleContexts(Elif_exprContext.class);
		}
		public TerminalNode FI() { return getToken(BashastParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(BashastParser.ELSE, 0); }
		public Command_listContext command_list(int i) {
			return getRuleContext(Command_listContext.class,i);
		}
		public List<SemielContext> semiel() {
			return getRuleContexts(SemielContext.class);
		}
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public SemielContext semiel(int i) {
			return getRuleContext(SemielContext.class,i);
		}
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public Elif_exprContext elif_expr(int i) {
			return getRuleContext(Elif_exprContext.class,i);
		}
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitIf_expr(this);
		}
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864); match(IF);
			setState(865); wspace();
			setState(866); ((If_exprContext)_localctx).ag = command_list();
			setState(867); semiel();
			setState(868); match(THEN);
			setState(869); wspace();
			setState(870); ((If_exprContext)_localctx).iflist = command_list();
			setState(871); semiel();
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(872); elif_expr();
				}
				}
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(883);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(878); match(ELSE);
				setState(879); wspace();
				setState(880); ((If_exprContext)_localctx).else_list = command_list();
				setState(881); semiel();
				}
			}

			setState(885); match(FI);
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

	public static class Elif_exprContext extends ParserRuleContext {
		public Command_listContext ag;
		public Command_listContext iflist;
		public TerminalNode THEN() { return getToken(BashastParser.THEN, 0); }
		public List<Command_listContext> command_list() {
			return getRuleContexts(Command_listContext.class);
		}
		public Command_listContext command_list(int i) {
			return getRuleContext(Command_listContext.class,i);
		}
		public List<SemielContext> semiel() {
			return getRuleContexts(SemielContext.class);
		}
		public WspaceContext wspace() {
			return getRuleContext(WspaceContext.class,0);
		}
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public SemielContext semiel(int i) {
			return getRuleContext(SemielContext.class,i);
		}
		public TerminalNode ELIF() { return getToken(BashastParser.ELIF, 0); }
		public Elif_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterElif_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitElif_expr(this);
		}
	}

	public final Elif_exprContext elif_expr() throws RecognitionException {
		Elif_exprContext _localctx = new Elif_exprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elif_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887); match(ELIF);
			setState(888); match(BLANK);
			setState(889); ((Elif_exprContext)_localctx).ag = command_list();
			setState(890); semiel();
			setState(891); match(THEN);
			setState(892); wspace();
			setState(893); ((Elif_exprContext)_localctx).iflist = command_list();
			setState(894); semiel();
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

	public static class While_exprContext extends ParserRuleContext {
		public Command_listContext istrue;
		public Command_listContext dothis;
		public TerminalNode WHILE() { return getToken(BashastParser.WHILE, 0); }
		public List<Command_listContext> command_list() {
			return getRuleContexts(Command_listContext.class);
		}
		public TerminalNode DO() { return getToken(BashastParser.DO, 0); }
		public Command_listContext command_list(int i) {
			return getRuleContext(Command_listContext.class,i);
		}
		public List<SemielContext> semiel() {
			return getRuleContexts(SemielContext.class);
		}
		public TerminalNode DONE() { return getToken(BashastParser.DONE, 0); }
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public SemielContext semiel(int i) {
			return getRuleContext(SemielContext.class,i);
		}
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public While_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterWhile_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitWhile_expr(this);
		}
	}

	public final While_exprContext while_expr() throws RecognitionException {
		While_exprContext _localctx = new While_exprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896); match(WHILE);
			setState(898);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(897); wspace();
				}
				break;
			}
			setState(900); ((While_exprContext)_localctx).istrue = command_list();
			setState(901); semiel();
			setState(902); match(DO);
			setState(903); wspace();
			setState(904); ((While_exprContext)_localctx).dothis = command_list();
			setState(905); semiel();
			setState(906); match(DONE);
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

	public static class Until_exprContext extends ParserRuleContext {
		public Command_listContext istrue;
		public Command_listContext dothis;
		public List<Command_listContext> command_list() {
			return getRuleContexts(Command_listContext.class);
		}
		public TerminalNode DO() { return getToken(BashastParser.DO, 0); }
		public Command_listContext command_list(int i) {
			return getRuleContext(Command_listContext.class,i);
		}
		public List<SemielContext> semiel() {
			return getRuleContexts(SemielContext.class);
		}
		public TerminalNode DONE() { return getToken(BashastParser.DONE, 0); }
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public SemielContext semiel(int i) {
			return getRuleContext(SemielContext.class,i);
		}
		public TerminalNode UNTIL() { return getToken(BashastParser.UNTIL, 0); }
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public Until_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterUntil_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitUntil_expr(this);
		}
	}

	public final Until_exprContext until_expr() throws RecognitionException {
		Until_exprContext _localctx = new Until_exprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_until_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908); match(UNTIL);
			setState(910);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(909); wspace();
				}
				break;
			}
			setState(912); ((Until_exprContext)_localctx).istrue = command_list();
			setState(913); semiel();
			setState(914); match(DO);
			setState(915); wspace();
			setState(916); ((Until_exprContext)_localctx).dothis = command_list();
			setState(917); semiel();
			setState(918); match(DONE);
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

	public static class Case_exprContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(BashastParser.IN, 0); }
		public Case_bodyContext case_body() {
			return getRuleContext(Case_bodyContext.class,0);
		}
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public WspaceContext wspace() {
			return getRuleContext(WspaceContext.class,0);
		}
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public TerminalNode CASE() { return getToken(BashastParser.CASE, 0); }
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCase_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCase_expr(this);
		}
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_case_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920); match(CASE);
			setState(921); match(BLANK);
			setState(922); string_expr();
			setState(923); wspace();
			setState(924); match(IN);
			setState(925); case_body();
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

	public static class Case_bodyContext extends ParserRuleContext {
		public boolean case_end;
		public Case_statementContext case_statement(int i) {
			return getRuleContext(Case_statementContext.class,i);
		}
		public List<Case_statementContext> case_statement() {
			return getRuleContexts(Case_statementContext.class);
		}
		public WspaceContext wspace() {
			return getRuleContext(WspaceContext.class,0);
		}
		public TerminalNode ESAC() { return getToken(BashastParser.ESAC, 0); }
		public Case_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCase_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCase_body(this);
		}
	}

	public final Case_bodyContext case_body() throws RecognitionException {
		Case_bodyContext _localctx = new Case_bodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_case_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((Case_bodyContext)getInvokingContext(46)).case_end =  false;
			setState(937);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				{
				setState(928); wspace();
				setState(929); match(ESAC);
				}
				}
				break;
			case 2:
				{
				setState(933); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(931);
						if (!(((Case_bodyContext)getInvokingContext(46)).case_end)) throw new FailedPredicateException(this, "{$case_body::case_end}? =>");
						setState(932); case_statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(935); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Case_statementContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(BashastParser.PIPE); }
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public Extended_patternContext extended_pattern(int i) {
			return getRuleContext(Extended_patternContext.class,i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public TerminalNode PIPE(int i) {
			return getToken(BashastParser.PIPE, i);
		}
		public List<Extended_patternContext> extended_pattern() {
			return getRuleContexts(Extended_patternContext.class);
		}
		public TerminalNode LPAREN() { return getToken(BashastParser.LPAREN, 0); }
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public TerminalNode ESAC() { return getToken(BashastParser.ESAC, 0); }
		public TerminalNode DOUBLE_SEMIC() { return getToken(BashastParser.DOUBLE_SEMIC, 0); }
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCase_statement(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_case_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_la = _input.LA(1);
			if (_la==BLANK || _la==EOL) {
				{
				setState(939); wspace();
				}
			}

			setState(946);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(942); match(LPAREN);
				setState(944);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(943); match(BLANK);
					}
				}

				}
			}

			setState(948); extended_pattern();
			setState(959);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(950);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(949); match(BLANK);
						}
					}

					setState(952); match(PIPE);
					setState(954);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(953); match(BLANK);
						}
					}

					setState(956); extended_pattern();
					}
					} 
				}
				setState(961);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(963);
			_la = _input.LA(1);
			if (_la==BLANK) {
				{
				setState(962); match(BLANK);
				}
			}

			setState(965); match(RPAREN);
			setState(969);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(966); wspace();
				setState(967); command_list();
				}
				break;
			}
			setState(985);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(972);
				_la = _input.LA(1);
				if (_la==BLANK || _la==EOL) {
					{
					setState(971); wspace();
					}
				}

				setState(974); match(DOUBLE_SEMIC);
				setState(979);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(975); wspace();
					setState(976); match(ESAC);
					((Case_bodyContext)getInvokingContext(46)).case_end =  true;
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(981); wspace();
				setState(982); match(ESAC);
				((Case_bodyContext)getInvokingContext(46)).case_end =  true;
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

	public static class SubshellContext extends ParserRuleContext {
		public TerminalNode SEMIC() { return getToken(BashastParser.SEMIC, 0); }
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(BashastParser.LPAREN, 0); }
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public SubshellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subshell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterSubshell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitSubshell(this);
		}
	}

	public final SubshellContext subshell() throws RecognitionException {
		SubshellContext _localctx = new SubshellContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_subshell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987); match(LPAREN);
			setState(989);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(988); wspace();
				}
				break;
			}
			setState(991); command_list();
			setState(996);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(993);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(992); match(BLANK);
					}
				}

				setState(995); match(SEMIC);
				}
				break;
			}
			setState(999);
			_la = _input.LA(1);
			if (_la==BLANK || _la==EOL) {
				{
				setState(998); wspace();
				}
			}

			setState(1001); match(RPAREN);
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

	public static class Current_shellContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BashastParser.LBRACE, 0); }
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public SemielContext semiel() {
			return getRuleContext(SemielContext.class,0);
		}
		public WspaceContext wspace() {
			return getRuleContext(WspaceContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BashastParser.RBRACE, 0); }
		public Current_shellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_current_shell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCurrent_shell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCurrent_shell(this);
		}
	}

	public final Current_shellContext current_shell() throws RecognitionException {
		Current_shellContext _localctx = new Current_shellContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_current_shell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003); match(LBRACE);
			setState(1004); wspace();
			setState(1005); command_list();
			setState(1006); semiel();
			setState(1007); match(RBRACE);
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

	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public TerminalNode LLPAREN() { return getToken(BashastParser.LLPAREN, 0); }
		public TerminalNode RPAREN(int i) {
			return getToken(BashastParser.RPAREN, i);
		}
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public List<TerminalNode> RPAREN() { return getTokens(BashastParser.RPAREN); }
		public ArithmeticsContext arithmetics() {
			return getRuleContext(ArithmeticsContext.class,0);
		}
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArithmetic_expression(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arithmetic_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009); match(LLPAREN);
			setState(1011);
			_la = _input.LA(1);
			if (_la==BLANK || _la==EOL) {
				{
				setState(1010); wspace();
				}
			}

			setState(1013); arithmetics();
			setState(1015);
			_la = _input.LA(1);
			if (_la==BLANK || _la==EOL) {
				{
				setState(1014); wspace();
				}
			}

			setState(1017); match(RPAREN);
			setState(1018); match(RPAREN);
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

	public static class Condition_comparisonContext extends ParserRuleContext {
		public Condition_exprContext condition_expr() {
			return getRuleContext(Condition_exprContext.class,0);
		}
		public Condition_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCondition_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCondition_comparison(this);
		}
	}

	public final Condition_comparisonContext condition_comparison() throws RecognitionException {
		Condition_comparisonContext _localctx = new Condition_comparisonContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_condition_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020); condition_expr();
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

	public static class Condition_exprContext extends ParserRuleContext {
		public TerminalNode LSQUARE(int i) {
			return getToken(BashastParser.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(BashastParser.RSQUARE); }
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public List<TerminalNode> LSQUARE() { return getTokens(BashastParser.LSQUARE); }
		public Keyword_conditionContext keyword_condition() {
			return getRuleContext(Keyword_conditionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(BashastParser.NAME, 0); }
		public Builtin_conditionContext builtin_condition() {
			return getRuleContext(Builtin_conditionContext.class,0);
		}
		public TerminalNode RSQUARE(int i) {
			return getToken(BashastParser.RSQUARE, i);
		}
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public Condition_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCondition_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCondition_expr(this);
		}
	}

	public final Condition_exprContext condition_expr() throws RecognitionException {
		Condition_exprContext _localctx = new Condition_exprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_condition_expr);
		int _la;
		try {
			setState(1042);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022); match(LSQUARE);
				setState(1023); match(LSQUARE);
				setState(1024); wspace();
				setState(1025); keyword_condition();
				setState(1026); wspace();
				setState(1027); match(RSQUARE);
				setState(1028); match(RSQUARE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1030); match(LSQUARE);
				setState(1031); wspace();
				setState(1032); builtin_condition();
				setState(1033); wspace();
				setState(1034); match(RSQUARE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1036);
				if (!(LA(1) == NAME && LA(2) == BLANK && "test".equals(get_string(LT(1))))) throw new FailedPredicateException(this, "{LA(1) == NAME && LA(2) == BLANK && \"test\".equals(get_string(LT(1)))}? =>");
				setState(1037); match(NAME);
				setState(1039);
				_la = _input.LA(1);
				if (_la==BLANK || _la==EOL) {
					{
					setState(1038); wspace();
					}
				}

				setState(1041); builtin_condition();
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

	public static class Keyword_condition_andContext extends ParserRuleContext {
		public List<Keyword_condition_primaryContext> keyword_condition_primary() {
			return getRuleContexts(Keyword_condition_primaryContext.class);
		}
		public List<TerminalNode> LOGICAND() { return getTokens(BashastParser.LOGICAND); }
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public Keyword_condition_primaryContext keyword_condition_primary(int i) {
			return getRuleContext(Keyword_condition_primaryContext.class,i);
		}
		public TerminalNode LOGICAND(int i) {
			return getToken(BashastParser.LOGICAND, i);
		}
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public Keyword_condition_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_condition_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterKeyword_condition_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitKeyword_condition_and(this);
		}
	}

	public final Keyword_condition_andContext keyword_condition_and() throws RecognitionException {
		Keyword_condition_andContext _localctx = new Keyword_condition_andContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_keyword_condition_and);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1044); keyword_condition_primary();
			setState(1055);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1046);
					_la = _input.LA(1);
					if (_la==BLANK || _la==EOL) {
						{
						setState(1045); wspace();
						}
					}

					setState(1048); match(LOGICAND);
					setState(1050);
					_la = _input.LA(1);
					if (_la==BLANK || _la==EOL) {
						{
						setState(1049); wspace();
						}
					}

					setState(1052); keyword_condition_primary();
					}
					} 
				}
				setState(1057);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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

	public static class Keyword_conditionContext extends ParserRuleContext {
		public List<WspaceContext> wspace() {
			return getRuleContexts(WspaceContext.class);
		}
		public List<TerminalNode> LOGICOR() { return getTokens(BashastParser.LOGICOR); }
		public List<Keyword_condition_andContext> keyword_condition_and() {
			return getRuleContexts(Keyword_condition_andContext.class);
		}
		public WspaceContext wspace(int i) {
			return getRuleContext(WspaceContext.class,i);
		}
		public Keyword_condition_andContext keyword_condition_and(int i) {
			return getRuleContext(Keyword_condition_andContext.class,i);
		}
		public TerminalNode LOGICOR(int i) {
			return getToken(BashastParser.LOGICOR, i);
		}
		public Keyword_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterKeyword_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitKeyword_condition(this);
		}
	}

	public final Keyword_conditionContext keyword_condition() throws RecognitionException {
		Keyword_conditionContext _localctx = new Keyword_conditionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_keyword_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); keyword_condition_and();
			setState(1069);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1060);
					_la = _input.LA(1);
					if (_la==BLANK || _la==EOL) {
						{
						setState(1059); wspace();
						}
					}

					setState(1062); match(LOGICOR);
					setState(1064);
					_la = _input.LA(1);
					if (_la==BLANK || _la==EOL) {
						{
						setState(1063); wspace();
						}
					}

					setState(1066); keyword_condition_and();
					}
					} 
				}
				setState(1071);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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

	public static class Keyword_negation_primaryContext extends ParserRuleContext {
		public Keyword_condition_primaryContext keyword_condition_primary() {
			return getRuleContext(Keyword_condition_primaryContext.class,0);
		}
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public Keyword_negation_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_negation_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterKeyword_negation_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitKeyword_negation_primary(this);
		}
	}

	public final Keyword_negation_primaryContext keyword_negation_primary() throws RecognitionException {
		Keyword_negation_primaryContext _localctx = new Keyword_negation_primaryContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_keyword_negation_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072); match(BANG);
			setState(1073); match(BLANK);
			setState(1074); keyword_condition_primary();
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

	public static class Keyword_condition_primaryContext extends ParserRuleContext {
		public Keyword_negation_primaryContext keyword_negation_primary() {
			return getRuleContext(Keyword_negation_primaryContext.class,0);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public Keyword_condition_binaryContext keyword_condition_binary() {
			return getRuleContext(Keyword_condition_binaryContext.class,0);
		}
		public Keyword_conditionContext keyword_condition() {
			return getRuleContext(Keyword_conditionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BashastParser.LPAREN, 0); }
		public Keyword_condition_unaryContext keyword_condition_unary() {
			return getRuleContext(Keyword_condition_unaryContext.class,0);
		}
		public Keyword_condition_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_condition_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterKeyword_condition_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitKeyword_condition_primary(this);
		}
	}

	public final Keyword_condition_primaryContext keyword_condition_primary() throws RecognitionException {
		Keyword_condition_primaryContext _localctx = new Keyword_condition_primaryContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_keyword_condition_primary);
		int _la;
		try {
			setState(1089);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076); match(LPAREN);
				setState(1078);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1077); match(BLANK);
					}
				}

				setState(1080); keyword_condition();
				setState(1082);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1081); match(BLANK);
					}
				}

				setState(1084); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086); keyword_negation_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1087); keyword_condition_unary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1088); keyword_condition_binary();
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

	public static class Keyword_condition_unaryContext extends ParserRuleContext {
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Condition_partContext condition_part() {
			return getRuleContext(Condition_partContext.class,0);
		}
		public Keyword_condition_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_condition_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterKeyword_condition_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitKeyword_condition_unary(this);
		}
	}

	public final Keyword_condition_unaryContext keyword_condition_unary() throws RecognitionException {
		Keyword_condition_unaryContext _localctx = new Keyword_condition_unaryContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_keyword_condition_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091); unary_operator();
			setState(1092); match(BLANK);
			setState(1093); condition_part();
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

	public static class Keyword_condition_binaryContext extends ParserRuleContext {
		public Condition_partContext right;
		public Bash_pattern_partContext bash_pattern_part() {
			return getRuleContext(Bash_pattern_partContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(BashastParser.TILDE, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(BashastParser.EQUALS); }
		public List<Extended_pattern_matchContext> extended_pattern_match() {
			return getRuleContexts(Extended_pattern_matchContext.class);
		}
		public Extended_pattern_matchContext extended_pattern_match(int i) {
			return getRuleContext(Extended_pattern_matchContext.class,i);
		}
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public Keyword_binary_string_operatorContext keyword_binary_string_operator() {
			return getRuleContext(Keyword_binary_string_operatorContext.class,0);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<Condition_partContext> condition_part() {
			return getRuleContexts(Condition_partContext.class);
		}
		public TerminalNode EQUALS(int i) {
			return getToken(BashastParser.EQUALS, i);
		}
		public Condition_partContext condition_part(int i) {
			return getRuleContext(Condition_partContext.class,i);
		}
		public Keyword_condition_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_condition_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterKeyword_condition_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitKeyword_condition_binary(this);
		}
	}

	public final Keyword_condition_binaryContext keyword_condition_binary() throws RecognitionException {
		Keyword_condition_binaryContext _localctx = new Keyword_condition_binaryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_keyword_condition_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095); condition_part();
			setState(1125);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1096); match(BLANK);
				setState(1097); match(EQUALS);
				setState(1098); match(TILDE);
				setState(1099); match(BLANK);
				setState(1100); bash_pattern_part();
				}
				break;
			case 2:
				{
				setState(1101); keyword_binary_string_operator();
				setState(1102); ((Keyword_condition_binaryContext)_localctx).right = condition_part();
				}
				break;
			case 3:
				{
				setState(1104); match(BLANK);
				{
				setState(1105); match(BANG);
				setState(1106); match(EQUALS);
				}
				setState(1108); match(BLANK);
				setState(1110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1109); extended_pattern_match();
					}
					}
					setState(1112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << CASE) | (1L << DO) | (1L << DONE) | (1L << ELIF) | (1L << ELSE) | (1L << ESAC) | (1L << FI) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << SELECT) | (1L << THEN) | (1L << UNTIL) | (1L << WHILE) | (1L << LBRACE) | (1L << TIME) | (1L << LSQUARE) | (1L << RSQUARE) | (1L << DOLLAR) | (1L << AT) | (1L << DOT) | (1L << DOTDOT) | (1L << TIMES) | (1L << EQUALS) | (1L << MINUS) | (1L << PLUS) | (1L << CARET) | (1L << ESC_DQUOTE) | (1L << ESC_SQUOTE) | (1L << DQUOTE) | (1L << SINGLE_QUOTED_STRING_TOKEN) | (1L << COMMA) | (1L << DIGIT) | (1L << NUMBER) | (1L << LETTER) | (1L << TILDE) | (1L << POUND) | (1L << PCT) | (1L << PCTPCT) | (1L << SLASH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLON - 64)) | (1L << (QMARK - 64)) | (1L << (LOCAL - 64)) | (1L << (EXPORT - 64)) | (1L << (DECLARE - 64)) | (1L << (ESC_RPAREN - 64)) | (1L << (ESC_LPAREN - 64)) | (1L << (ESC_RSQUARE - 64)) | (1L << (ESC_LSQUARE - 64)) | (1L << (ESC_DOLLAR - 64)) | (1L << (ESC_TICK - 64)) | (1L << (COMMAND_SUBSTITUTION_PAREN - 64)) | (1L << (COMMAND_SUBSTITUTION_TICK - 64)) | (1L << (ESC_LT - 64)) | (1L << (ESC_GT - 64)) | (1L << (ESC - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (NAME - 64)) | (1L << (OTHER - 64)))) != 0) );
				}
				break;
			case 4:
				{
				setState(1114); match(BLANK);
				{
				setState(1115); match(EQUALS);
				setState(1116); match(EQUALS);
				}
				setState(1118); match(BLANK);
				setState(1120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1119); extended_pattern_match();
					}
					}
					setState(1122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << CASE) | (1L << DO) | (1L << DONE) | (1L << ELIF) | (1L << ELSE) | (1L << ESAC) | (1L << FI) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << SELECT) | (1L << THEN) | (1L << UNTIL) | (1L << WHILE) | (1L << LBRACE) | (1L << TIME) | (1L << LSQUARE) | (1L << RSQUARE) | (1L << DOLLAR) | (1L << AT) | (1L << DOT) | (1L << DOTDOT) | (1L << TIMES) | (1L << EQUALS) | (1L << MINUS) | (1L << PLUS) | (1L << CARET) | (1L << ESC_DQUOTE) | (1L << ESC_SQUOTE) | (1L << DQUOTE) | (1L << SINGLE_QUOTED_STRING_TOKEN) | (1L << COMMA) | (1L << DIGIT) | (1L << NUMBER) | (1L << LETTER) | (1L << TILDE) | (1L << POUND) | (1L << PCT) | (1L << PCTPCT) | (1L << SLASH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLON - 64)) | (1L << (QMARK - 64)) | (1L << (LOCAL - 64)) | (1L << (EXPORT - 64)) | (1L << (DECLARE - 64)) | (1L << (ESC_RPAREN - 64)) | (1L << (ESC_LPAREN - 64)) | (1L << (ESC_RSQUARE - 64)) | (1L << (ESC_LSQUARE - 64)) | (1L << (ESC_DOLLAR - 64)) | (1L << (ESC_TICK - 64)) | (1L << (COMMAND_SUBSTITUTION_PAREN - 64)) | (1L << (COMMAND_SUBSTITUTION_TICK - 64)) | (1L << (ESC_LT - 64)) | (1L << (ESC_GT - 64)) | (1L << (ESC - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (NAME - 64)) | (1L << (OTHER - 64)))) != 0) );
				}
				break;
			case 5:
				{
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

	public static class Bash_pattern_partContext extends ParserRuleContext {
		public int _parens;
		public boolean quoted;
		public TerminalNode ESC(int i) {
			return getToken(BashastParser.ESC, i);
		}
		public List<TerminalNode> EOL() { return getTokens(BashastParser.EOL); }
		public TerminalNode LLPAREN(int i) {
			return getToken(BashastParser.LLPAREN, i);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(BashastParser.RPAREN, i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public Preserved_tokensContext preserved_tokens(int i) {
			return getRuleContext(Preserved_tokensContext.class,i);
		}
		public TerminalNode EOL(int i) {
			return getToken(BashastParser.EOL, i);
		}
		public TerminalNode LOGICAND(int i) {
			return getToken(BashastParser.LOGICAND, i);
		}
		public List<TerminalNode> ESC() { return getTokens(BashastParser.ESC); }
		public List<TerminalNode> LPAREN() { return getTokens(BashastParser.LPAREN); }
		public TerminalNode LOGICOR(int i) {
			return getToken(BashastParser.LOGICOR, i);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(BashastParser.LPAREN, i);
		}
		public List<TerminalNode> LLPAREN() { return getTokens(BashastParser.LLPAREN); }
		public List<Preserved_tokensContext> preserved_tokens() {
			return getRuleContexts(Preserved_tokensContext.class);
		}
		public List<TerminalNode> LOGICAND() { return getTokens(BashastParser.LOGICAND); }
		public TerminalNode DQUOTE(int i) {
			return getToken(BashastParser.DQUOTE, i);
		}
		public List<TerminalNode> DQUOTE() { return getTokens(BashastParser.DQUOTE); }
		public List<TerminalNode> LOGICOR() { return getTokens(BashastParser.LOGICOR); }
		public List<TerminalNode> RPAREN() { return getTokens(BashastParser.RPAREN); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Bash_pattern_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bash_pattern_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBash_pattern_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBash_pattern_part(this);
		}
	}

	public final Bash_pattern_partContext bash_pattern_part() throws RecognitionException {
		Bash_pattern_partContext _localctx = new Bash_pattern_partContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_bash_pattern_part);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1141); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1141);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						setState(1127); match(DQUOTE);
						 ((Bash_pattern_partContext)getInvokingContext(59)).quoted =  ((Bash_pattern_partContext)getInvokingContext(59)).quoted; 
						}
						break;
					case 2:
						{
						setState(1129);
						if (!(((Bash_pattern_partContext)getInvokingContext(59)).quoted)) throw new FailedPredicateException(this, "{$bash_pattern_part::quoted}? =>");
						setState(1130); preserved_tokens();
						}
						break;
					case 3:
						{
						setState(1131); match(ESC);
						setState(1132); match(BLANK);
						}
						break;
					case 4:
						{
						setState(1133); match(LPAREN);
						 if(LA(-2) != ESC) ((Bash_pattern_partContext)getInvokingContext(59))._parens++; 
						}
						break;
					case 5:
						{
						setState(1135); match(LLPAREN);
						 if(LA(-2) != ESC) ((Bash_pattern_partContext)getInvokingContext(59))._parens += 2; 
						}
						break;
					case 6:
						{
						setState(1137);
						if (!(((Bash_pattern_partContext)getInvokingContext(59))._parens != 0)) throw new FailedPredicateException(this, "{$bash_pattern_part::_parens != 0}? =>");
						setState(1138); match(RPAREN);
						 if(LA(-2) != ESC) ((Bash_pattern_partContext)getInvokingContext(59))._parens--; 
						}
						break;
					case 7:
						{
						setState(1140);
						_la = _input.LA(1);
						if ( _la <= 0 || (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (RPAREN - 20)) | (1L << (LPAREN - 20)) | (1L << (LLPAREN - 20)) | (1L << (DQUOTE - 20)) | (1L << (BLANK - 20)) | (1L << (EOL - 20)) | (1L << (LOGICAND - 20)) | (1L << (LOGICOR - 20)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1143); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Preserved_tokensContext extends ParserRuleContext {
		public Non_dquoteContext non_dquote() {
			return getRuleContext(Non_dquoteContext.class,0);
		}
		public Preserved_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preserved_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterPreserved_tokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitPreserved_tokens(this);
		}
	}

	public final Preserved_tokensContext preserved_tokens() throws RecognitionException {
		Preserved_tokensContext _localctx = new Preserved_tokensContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_preserved_tokens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145); non_dquote();
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

	public static class Non_dquoteContext extends ParserRuleContext {
		public TerminalNode DQUOTE() { return getToken(BashastParser.DQUOTE, 0); }
		public Non_dquoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_dquote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterNon_dquote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitNon_dquote(this);
		}
	}

	public final Non_dquoteContext non_dquote() throws RecognitionException {
		Non_dquoteContext _localctx = new Non_dquoteContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_non_dquote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==DQUOTE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Keyword_binary_string_operatorContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(BashastParser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(BashastParser.EQUALS, 0); }
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public TerminalNode GREATER_THAN() { return getToken(BashastParser.GREATER_THAN, 0); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Keyword_binary_string_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_binary_string_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterKeyword_binary_string_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitKeyword_binary_string_operator(this);
		}
	}

	public final Keyword_binary_string_operatorContext keyword_binary_string_operator() throws RecognitionException {
		Keyword_binary_string_operatorContext _localctx = new Keyword_binary_string_operatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_keyword_binary_string_operator);
		int _la;
		try {
			setState(1170);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149); match(BLANK);
				setState(1150); binary_operator();
				setState(1151); match(BLANK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153); match(BLANK);
				setState(1154); match(EQUALS);
				setState(1155); match(BLANK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1157);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1156); match(BLANK);
					}
				}

				setState(1159); match(LESS_THAN);
				setState(1161);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1160); match(BLANK);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1164);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1163); match(BLANK);
					}
				}

				setState(1166); match(GREATER_THAN);
				setState(1168);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1167); match(BLANK);
					}
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

	public static class Builtin_condition_andContext extends ParserRuleContext {
		public List<Builtin_logic_andContext> builtin_logic_and() {
			return getRuleContexts(Builtin_logic_andContext.class);
		}
		public List<Builtin_condition_primaryContext> builtin_condition_primary() {
			return getRuleContexts(Builtin_condition_primaryContext.class);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Builtin_logic_andContext builtin_logic_and(int i) {
			return getRuleContext(Builtin_logic_andContext.class,i);
		}
		public Builtin_condition_primaryContext builtin_condition_primary(int i) {
			return getRuleContext(Builtin_condition_primaryContext.class,i);
		}
		public Builtin_condition_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_condition_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_condition_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_condition_and(this);
		}
	}

	public final Builtin_condition_andContext builtin_condition_and() throws RecognitionException {
		Builtin_condition_andContext _localctx = new Builtin_condition_andContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_builtin_condition_and);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1172); builtin_condition_primary();
			setState(1179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1173); builtin_logic_and();
					setState(1174); match(BLANK);
					setState(1175); builtin_condition_primary();
					}
					} 
				}
				setState(1181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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

	public static class Builtin_conditionContext extends ParserRuleContext {
		public List<Builtin_condition_andContext> builtin_condition_and() {
			return getRuleContexts(Builtin_condition_andContext.class);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<Builtin_logic_orContext> builtin_logic_or() {
			return getRuleContexts(Builtin_logic_orContext.class);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Builtin_logic_orContext builtin_logic_or(int i) {
			return getRuleContext(Builtin_logic_orContext.class,i);
		}
		public Builtin_condition_andContext builtin_condition_and(int i) {
			return getRuleContext(Builtin_condition_andContext.class,i);
		}
		public Builtin_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_condition(this);
		}
	}

	public final Builtin_conditionContext builtin_condition() throws RecognitionException {
		Builtin_conditionContext _localctx = new Builtin_conditionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_builtin_condition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1182); builtin_condition_and();
			setState(1189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1183); builtin_logic_or();
					setState(1184); match(BLANK);
					setState(1185); builtin_condition_and();
					}
					} 
				}
				setState(1191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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

	public static class Builtin_negation_primaryContext extends ParserRuleContext {
		public Builtin_condition_primaryContext builtin_condition_primary() {
			return getRuleContext(Builtin_condition_primaryContext.class,0);
		}
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public Builtin_negation_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_negation_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_negation_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_negation_primary(this);
		}
	}

	public final Builtin_negation_primaryContext builtin_negation_primary() throws RecognitionException {
		Builtin_negation_primaryContext _localctx = new Builtin_negation_primaryContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_builtin_negation_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192); match(BANG);
			setState(1193); match(BLANK);
			setState(1194); builtin_condition_primary();
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

	public static class Builtin_condition_primaryContext extends ParserRuleContext {
		public Builtin_condition_unaryContext builtin_condition_unary() {
			return getRuleContext(Builtin_condition_unaryContext.class,0);
		}
		public Builtin_condition_binaryContext builtin_condition_binary() {
			return getRuleContext(Builtin_condition_binaryContext.class,0);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public Builtin_conditionContext builtin_condition() {
			return getRuleContext(Builtin_conditionContext.class,0);
		}
		public Builtin_negation_primaryContext builtin_negation_primary() {
			return getRuleContext(Builtin_negation_primaryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BashastParser.LPAREN, 0); }
		public Builtin_condition_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_condition_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_condition_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_condition_primary(this);
		}
	}

	public final Builtin_condition_primaryContext builtin_condition_primary() throws RecognitionException {
		Builtin_condition_primaryContext _localctx = new Builtin_condition_primaryContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_builtin_condition_primary);
		int _la;
		try {
			setState(1209);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196); match(LPAREN);
				setState(1198);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1197); match(BLANK);
					}
				}

				setState(1200); builtin_condition();
				setState(1202);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1201); match(BLANK);
					}
				}

				setState(1204); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206); builtin_negation_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1207); builtin_condition_unary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1208); builtin_condition_binary();
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

	public static class Builtin_condition_unaryContext extends ParserRuleContext {
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Condition_partContext condition_part() {
			return getRuleContext(Condition_partContext.class,0);
		}
		public Builtin_condition_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_condition_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_condition_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_condition_unary(this);
		}
	}

	public final Builtin_condition_unaryContext builtin_condition_unary() throws RecognitionException {
		Builtin_condition_unaryContext _localctx = new Builtin_condition_unaryContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_builtin_condition_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211); unary_operator();
			setState(1212); match(BLANK);
			setState(1213); condition_part();
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

	public static class Builtin_condition_binaryContext extends ParserRuleContext {
		public Builtin_binary_string_operatorContext builtin_binary_string_operator() {
			return getRuleContext(Builtin_binary_string_operatorContext.class,0);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<Condition_partContext> condition_part() {
			return getRuleContexts(Condition_partContext.class);
		}
		public Condition_partContext condition_part(int i) {
			return getRuleContext(Condition_partContext.class,i);
		}
		public Builtin_condition_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_condition_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_condition_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_condition_binary(this);
		}
	}

	public final Builtin_condition_binaryContext builtin_condition_binary() throws RecognitionException {
		Builtin_condition_binaryContext _localctx = new Builtin_condition_binaryContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_builtin_condition_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215); condition_part();
			setState(1221);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1216); match(BLANK);
				setState(1217); builtin_binary_string_operator();
				setState(1218); match(BLANK);
				setState(1219); condition_part();
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

	public static class Builtin_binary_string_operatorContext extends ParserRuleContext {
		public List<TerminalNode> EQUALS() { return getTokens(BashastParser.EQUALS); }
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public TerminalNode ESC_LT() { return getToken(BashastParser.ESC_LT, 0); }
		public TerminalNode ESC_GT() { return getToken(BashastParser.ESC_GT, 0); }
		public TerminalNode EQUALS(int i) {
			return getToken(BashastParser.EQUALS, i);
		}
		public Builtin_binary_string_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_binary_string_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_binary_string_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_binary_string_operator(this);
		}
	}

	public final Builtin_binary_string_operatorContext builtin_binary_string_operator() throws RecognitionException {
		Builtin_binary_string_operatorContext _localctx = new Builtin_binary_string_operatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_builtin_binary_string_operator);
		try {
			setState(1231);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223); binary_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224); match(EQUALS);
				setState(1225); match(EQUALS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1226); match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1227); match(BANG);
				setState(1228); match(EQUALS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1229); match(ESC_LT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1230); match(ESC_GT);
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

	public static class Builtin_logic_andContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(BashastParser.LETTER, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public Builtin_logic_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_logic_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_logic_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_logic_and(this);
		}
	}

	public final Builtin_logic_andContext builtin_logic_and() throws RecognitionException {
		Builtin_logic_andContext _localctx = new Builtin_logic_andContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_builtin_logic_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			if (!(LA(1) == BLANK && LA(2) == MINUS && LA(3) == LETTER && "a".equals(get_string(LT(3))))) throw new FailedPredicateException(this, "{LA(1) == BLANK && LA(2) == MINUS && LA(3) == LETTER && \"a\".equals(get_string(LT(3)))}?=>");
			setState(1234); match(BLANK);
			setState(1235); match(MINUS);
			setState(1236); match(LETTER);
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

	public static class Builtin_logic_orContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(BashastParser.LETTER, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public Builtin_logic_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_logic_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBuiltin_logic_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBuiltin_logic_or(this);
		}
	}

	public final Builtin_logic_orContext builtin_logic_or() throws RecognitionException {
		Builtin_logic_orContext _localctx = new Builtin_logic_orContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_builtin_logic_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			if (!(LA(1) == BLANK && LA(2) == MINUS && LA(3) == LETTER && "o".equals(get_string(LT(3))))) throw new FailedPredicateException(this, "{LA(1) == BLANK && LA(2) == MINUS && LA(3) == LETTER && \"o\".equals(get_string(LT(3)))}?=>");
			setState(1239); match(BLANK);
			setState(1240); match(MINUS);
			setState(1241); match(LETTER);
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

	public static class Binary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode NAME() { return getToken(BashastParser.NAME, 0); }
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBinary_operator(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243); match(MINUS);
			setState(1244); match(NAME);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(BashastParser.LETTER, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_unary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246); match(MINUS);
			setState(1247); match(LETTER);
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

	public static class Condition_partContext extends ParserRuleContext {
		public String_exprContext string_expr() {
			return getRuleContext(String_exprContext.class,0);
		}
		public Condition_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCondition_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCondition_part(this);
		}
	}

	public final Condition_partContext condition_part() throws RecognitionException {
		Condition_partContext _localctx = new Condition_partContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_condition_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249); string_expr();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(BashastParser.UNDERSCORE, 0); }
		public TerminalNode LETTER() { return getToken(BashastParser.LETTER, 0); }
		public TerminalNode NAME() { return getToken(BashastParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LETTER - 57)) | (1L << (UNDERSCORE - 57)) | (1L << (NAME - 57)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(BashastParser.DIGIT, 0); }
		public TerminalNode NUMBER() { return getToken(BashastParser.NUMBER, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class String_exprContext extends ParserRuleContext {
		public List<String_expr_partContext> string_expr_part() {
			return getRuleContexts(String_expr_partContext.class);
		}
		public String_expr_partContext string_expr_part(int i) {
			return getRuleContext(String_expr_partContext.class,i);
		}
		public String_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterString_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitString_expr(this);
		}
	}

	public final String_exprContext string_expr() throws RecognitionException {
		String_exprContext _localctx = new String_exprContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_string_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1255); string_expr_part();
			setState(1259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1256); string_expr_part();
					}
					} 
				}
				setState(1261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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

	public static class String_expr_partContext extends ParserRuleContext {
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public Reserved_wordContext reserved_word() {
			return getRuleContext(Reserved_wordContext.class,0);
		}
		public Non_quoted_stringContext non_quoted_string() {
			return getRuleContext(Non_quoted_stringContext.class,0);
		}
		public String_expr_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expr_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterString_expr_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitString_expr_part(this);
		}
	}

	public final String_expr_partContext string_expr_part() throws RecognitionException {
		String_expr_partContext _localctx = new String_expr_partContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_string_expr_part);
		try {
			setState(1265);
			switch (_input.LA(1)) {
			case DQUOTE:
			case SINGLE_QUOTED_STRING_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1262); quoted_string();
				}
				break;
			case BANG:
			case LBRACE:
			case LSQUARE:
			case RSQUARE:
			case DOLLAR:
			case AT:
			case DOT:
			case DOTDOT:
			case TIMES:
			case EQUALS:
			case MINUS:
			case PLUS:
			case CARET:
			case ESC_DQUOTE:
			case ESC_SQUOTE:
			case COMMA:
			case DIGIT:
			case NUMBER:
			case LETTER:
			case TILDE:
			case POUND:
			case PCT:
			case PCTPCT:
			case SLASH:
			case COLON:
			case QMARK:
			case LOCAL:
			case EXPORT:
			case DECLARE:
			case ESC_RPAREN:
			case ESC_LPAREN:
			case ESC_RSQUARE:
			case ESC_LSQUARE:
			case ESC_DOLLAR:
			case ESC_TICK:
			case COMMAND_SUBSTITUTION_PAREN:
			case COMMAND_SUBSTITUTION_TICK:
			case ESC_LT:
			case ESC_GT:
			case ESC:
			case UNDERSCORE:
			case NAME:
			case OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263); non_quoted_string();
				}
				break;
			case CASE:
			case DO:
			case DONE:
			case ELIF:
			case ELSE:
			case ESAC:
			case FI:
			case FOR:
			case IF:
			case IN:
			case SELECT:
			case THEN:
			case UNTIL:
			case WHILE:
			case TIME:
				enterOuterAlt(_localctx, 3);
				{
				setState(1264); reserved_word();
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

	public static class String_expr_no_reserved_wordContext extends ParserRuleContext {
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public List<String_expr_partContext> string_expr_part() {
			return getRuleContexts(String_expr_partContext.class);
		}
		public String_expr_partContext string_expr_part(int i) {
			return getRuleContext(String_expr_partContext.class,i);
		}
		public WspaceContext wspace() {
			return getRuleContext(WspaceContext.class,0);
		}
		public Non_quoted_stringContext non_quoted_string() {
			return getRuleContext(Non_quoted_stringContext.class,0);
		}
		public String_expr_no_reserved_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expr_no_reserved_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterString_expr_no_reserved_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitString_expr_no_reserved_word(this);
		}
	}

	public final String_expr_no_reserved_wordContext string_expr_no_reserved_word() throws RecognitionException {
		String_expr_no_reserved_wordContext _localctx = new String_expr_no_reserved_wordContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_string_expr_no_reserved_word);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			switch (_input.LA(1)) {
			case BANG:
			case LBRACE:
			case LSQUARE:
			case RSQUARE:
			case DOLLAR:
			case AT:
			case DOT:
			case DOTDOT:
			case TIMES:
			case EQUALS:
			case MINUS:
			case PLUS:
			case CARET:
			case ESC_DQUOTE:
			case ESC_SQUOTE:
			case COMMA:
			case DIGIT:
			case NUMBER:
			case LETTER:
			case TILDE:
			case POUND:
			case PCT:
			case PCTPCT:
			case SLASH:
			case COLON:
			case QMARK:
			case LOCAL:
			case EXPORT:
			case DECLARE:
			case ESC_RPAREN:
			case ESC_LPAREN:
			case ESC_RSQUARE:
			case ESC_LSQUARE:
			case ESC_DOLLAR:
			case ESC_TICK:
			case COMMAND_SUBSTITUTION_PAREN:
			case COMMAND_SUBSTITUTION_TICK:
			case ESC_LT:
			case ESC_GT:
			case ESC:
			case UNDERSCORE:
			case NAME:
			case OTHER:
				{
				setState(1267); non_quoted_string();
				setState(1269);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1268); wspace();
					}
					break;
				}
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1271); string_expr_part();
						}
						} 
					}
					setState(1276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				}
				}
				break;
			case DQUOTE:
			case SINGLE_QUOTED_STRING_TOKEN:
				{
				setState(1277); quoted_string();
				setState(1279);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1278); wspace();
					}
					break;
				}
				setState(1284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1281); string_expr_part();
						}
						} 
					}
					setState(1286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Reserved_wordContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(BashastParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(BashastParser.TIME, 0); }
		public TerminalNode FI() { return getToken(BashastParser.FI, 0); }
		public TerminalNode DONE() { return getToken(BashastParser.DONE, 0); }
		public TerminalNode SELECT() { return getToken(BashastParser.SELECT, 0); }
		public TerminalNode WHILE() { return getToken(BashastParser.WHILE, 0); }
		public TerminalNode IN() { return getToken(BashastParser.IN, 0); }
		public TerminalNode IF() { return getToken(BashastParser.IF, 0); }
		public TerminalNode DO() { return getToken(BashastParser.DO, 0); }
		public TerminalNode ELSE() { return getToken(BashastParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(BashastParser.FOR, 0); }
		public TerminalNode CASE() { return getToken(BashastParser.CASE, 0); }
		public TerminalNode UNTIL() { return getToken(BashastParser.UNTIL, 0); }
		public TerminalNode ELIF() { return getToken(BashastParser.ELIF, 0); }
		public TerminalNode ESAC() { return getToken(BashastParser.ESAC, 0); }
		public Reserved_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterReserved_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitReserved_word(this);
		}
	}

	public final Reserved_wordContext reserved_word() throws RecognitionException {
		Reserved_wordContext _localctx = new Reserved_wordContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_reserved_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << DO) | (1L << DONE) | (1L << ELIF) | (1L << ELSE) | (1L << ESAC) | (1L << FI) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << SELECT) | (1L << THEN) | (1L << UNTIL) | (1L << WHILE) | (1L << TIME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Non_quoted_stringContext extends ParserRuleContext {
		public Variable_referenceContext variable_reference() {
			return getRuleContext(Variable_referenceContext.class,0);
		}
		public String_partContext string_part() {
			return getRuleContext(String_partContext.class,0);
		}
		public Arithmetic_expansionContext arithmetic_expansion() {
			return getRuleContext(Arithmetic_expansionContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING_TOKEN() { return getToken(BashastParser.SINGLE_QUOTED_STRING_TOKEN, 0); }
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TerminalNode DOLLAR() { return getToken(BashastParser.DOLLAR, 0); }
		public Brace_expansionContext brace_expansion() {
			return getRuleContext(Brace_expansionContext.class,0);
		}
		public Command_substitutionContext command_substitution() {
			return getRuleContext(Command_substitutionContext.class,0);
		}
		public Non_quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterNon_quoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitNon_quoted_string(this);
		}
	}

	public final Non_quoted_stringContext non_quoted_string() throws RecognitionException {
		Non_quoted_stringContext _localctx = new Non_quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_non_quoted_string);
		try {
			setState(1299);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291); string_part();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1292); variable_reference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1293); command_substitution();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1294); arithmetic_expansion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1295); brace_expansion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1296); match(BANG);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1297); match(DOLLAR);
				setState(1298); match(SINGLE_QUOTED_STRING_TOKEN);
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

	public static class Quoted_stringContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTED_STRING_TOKEN() { return getToken(BashastParser.SINGLE_QUOTED_STRING_TOKEN, 0); }
		public Double_quoted_stringContext double_quoted_string() {
			return getRuleContext(Double_quoted_stringContext.class,0);
		}
		public Quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterQuoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitQuoted_string(this);
		}
	}

	public final Quoted_stringContext quoted_string() throws RecognitionException {
		Quoted_stringContext _localctx = new Quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_quoted_string);
		try {
			setState(1303);
			switch (_input.LA(1)) {
			case DQUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301); double_quoted_string();
				}
				break;
			case SINGLE_QUOTED_STRING_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302); match(SINGLE_QUOTED_STRING_TOKEN);
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

	public static class Double_quoted_stringContext extends ParserRuleContext {
		public TerminalNode DQUOTE(int i) {
			return getToken(BashastParser.DQUOTE, i);
		}
		public List<TerminalNode> DQUOTE() { return getTokens(BashastParser.DQUOTE); }
		public Expansion_baseContext expansion_base(int i) {
			return getRuleContext(Expansion_baseContext.class,i);
		}
		public List<Expansion_baseContext> expansion_base() {
			return getRuleContexts(Expansion_baseContext.class);
		}
		public Double_quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterDouble_quoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitDouble_quoted_string(this);
		}
	}

	public final Double_quoted_stringContext double_quoted_string() throws RecognitionException {
		Double_quoted_stringContext _localctx = new Double_quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_double_quoted_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1305); match(DQUOTE);
			setState(1309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1306); expansion_base();
					}
					} 
				}
				setState(1311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1312); match(DQUOTE);
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

	public static class Expansion_baseContext extends ParserRuleContext {
		public Variable_referenceContext variable_reference() {
			return getRuleContext(Variable_referenceContext.class,0);
		}
		public TerminalNode DQUOTE() { return getToken(BashastParser.DQUOTE, 0); }
		public Arithmetic_expansionContext arithmetic_expansion() {
			return getRuleContext(Arithmetic_expansionContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING_TOKEN() { return getToken(BashastParser.SINGLE_QUOTED_STRING_TOKEN, 0); }
		public TerminalNode TICK() { return getToken(BashastParser.TICK, 0); }
		public TerminalNode DOLLAR() { return getToken(BashastParser.DOLLAR, 0); }
		public Brace_expansionContext brace_expansion() {
			return getRuleContext(Brace_expansionContext.class,0);
		}
		public TerminalNode ESC() { return getToken(BashastParser.ESC, 0); }
		public Command_substitutionContext command_substitution() {
			return getRuleContext(Command_substitutionContext.class,0);
		}
		public Expansion_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expansion_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterExpansion_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitExpansion_base(this);
		}
	}

	public final Expansion_baseContext expansion_base() throws RecognitionException {
		Expansion_baseContext _localctx = new Expansion_baseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_expansion_base);
		try {
			setState(1327);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314); variable_reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315); command_substitution();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1316); arithmetic_expansion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1317); match(ESC);
				setState(1318); match(DQUOTE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1319); match(ESC);
				setState(1320); match(TICK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1321); match(ESC);
				setState(1322); match(DOLLAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1323); brace_expansion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1324); match(DOLLAR);
				setState(1325); match(SINGLE_QUOTED_STRING_TOKEN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1326);
				matchWildcard();
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

	public static class All_expansionsContext extends ParserRuleContext {
		public List<Expansion_atomContext> expansion_atom() {
			return getRuleContexts(Expansion_atomContext.class);
		}
		public Expansion_atomContext expansion_atom(int i) {
			return getRuleContext(Expansion_atomContext.class,i);
		}
		public All_expansionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_expansions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterAll_expansions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitAll_expansions(this);
		}
	}

	public final All_expansionsContext all_expansions() throws RecognitionException {
		All_expansionsContext _localctx = new All_expansionsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_all_expansions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1329); expansion_atom();
				}
				}
				setState(1332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BANG) | (1L << CASE) | (1L << DO) | (1L << DONE) | (1L << ELIF) | (1L << ELSE) | (1L << ESAC) | (1L << FI) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << SELECT) | (1L << THEN) | (1L << UNTIL) | (1L << WHILE) | (1L << LBRACE) | (1L << RBRACE) | (1L << TIME) | (1L << RPAREN) | (1L << LPAREN) | (1L << LLPAREN) | (1L << LSQUARE) | (1L << RSQUARE) | (1L << TICK) | (1L << DOLLAR) | (1L << AT) | (1L << DOT) | (1L << DOTDOT) | (1L << TIMES) | (1L << EQUALS) | (1L << MINUS) | (1L << PLUS) | (1L << EXP) | (1L << AMP) | (1L << CARET) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << AMP_LESS_THAN) | (1L << AMP_GREATER_THAN) | (1L << AMP_RSHIFT) | (1L << SEMIC) | (1L << DOUBLE_SEMIC) | (1L << PIPE) | (1L << ESC_DQUOTE) | (1L << ESC_SQUOTE) | (1L << DQUOTE) | (1L << SQUOTE) | (1L << SINGLE_QUOTED_STRING_TOKEN) | (1L << COMMA) | (1L << BLANK) | (1L << EOL) | (1L << DIGIT) | (1L << NUMBER) | (1L << LETTER) | (1L << TILDE) | (1L << HERE_STRING_OP) | (1L << POUND) | (1L << PCT) | (1L << PCTPCT) | (1L << SLASH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLON - 64)) | (1L << (QMARK - 64)) | (1L << (LOCAL - 64)) | (1L << (EXPORT - 64)) | (1L << (DECLARE - 64)) | (1L << (LOGICAND - 64)) | (1L << (LOGICOR - 64)) | (1L << (CONTINUE_LINE - 64)) | (1L << (ESC_RPAREN - 64)) | (1L << (ESC_LPAREN - 64)) | (1L << (ESC_RSQUARE - 64)) | (1L << (ESC_LSQUARE - 64)) | (1L << (ESC_DOLLAR - 64)) | (1L << (ESC_TICK - 64)) | (1L << (COMMAND_SUBSTITUTION_PAREN - 64)) | (1L << (COMMAND_SUBSTITUTION_TICK - 64)) | (1L << (ESC_LT - 64)) | (1L << (ESC_GT - 64)) | (1L << (ESC - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (NAME - 64)) | (1L << (OTHER - 64)) | (1L << (ANSI_C_QUOTING - 64)) | (1L << (ARG - 64)) | (1L << (ARRAY - 64)) | (1L << (ARRAY_SIZE - 64)) | (1L << (BRACE_EXP - 64)) | (1L << (COMMAND_SUB - 64)) | (1L << (CASE_PATTERN - 64)) | (1L << (CASE_COMMAND - 64)) | (1L << (SUBSHELL - 64)) | (1L << (CURRENT_SHELL - 64)) | (1L << (COMPOUND_COND - 64)) | (1L << (CFOR - 64)) | (1L << (FOR_INIT - 64)) | (1L << (FOR_COND - 64)) | (1L << (FOR_MOD - 64)) | (1L << (IF_STATEMENT - 64)) | (1L << (OP - 64)) | (1L << (PRE_INCR - 64)) | (1L << (PRE_DECR - 64)) | (1L << (POST_INCR - 64)) | (1L << (POST_DECR - 64)) | (1L << (PROCESS_SUBSTITUTION - 64)) | (1L << (VAR_REF - 64)) | (1L << (NEGATION - 64)) | (1L << (LIST - 64)) | (1L << (STRING - 64)) | (1L << (COMMAND - 64)) | (1L << (FILE_DESCRIPTOR - 64)) | (1L << (FILE_DESCRIPTOR_MOVE - 64)) | (1L << (REDIR - 64)) | (1L << (ARITHMETIC_CONDITION - 64)) | (1L << (ARITHMETIC_EXPRESSION - 64)) | (1L << (ARITHMETIC - 64)) | (1L << (KEYWORD_TEST - 64)) | (1L << (BUILTIN_TEST - 64)) | (1L << (MATCH_ANY_EXCEPT - 64)) | (1L << (EXTENDED_MATCH_EXACTLY_ONE - 64)) | (1L << (EXTENDED_MATCH_AT_MOST_ONE - 64)) | (1L << (EXTENDED_MATCH_NONE - 64)) | (1L << (EXTENDED_MATCH_ANY - 64)) | (1L << (EXTENDED_MATCH_AT_LEAST_ONE - 64)) | (1L << (BRANCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCH_PATTERN - 128)) | (1L << (MATCH_REGULAR_EXPRESSION - 128)) | (1L << (ESCAPED_CHAR - 128)) | (1L << (NOT_MATCH_PATTERN - 128)) | (1L << (MATCH_ANY - 128)) | (1L << (MATCH_ALL - 128)) | (1L << (MATCH_ONE - 128)) | (1L << (CHARACTER_CLASS - 128)) | (1L << (EQUIVALENCE_CLASS - 128)) | (1L << (COLLATING_SYMBOL - 128)) | (1L << (DOUBLE_QUOTED_STRING - 128)) | (1L << (SINGLE_QUOTED_STRING - 128)) | (1L << (VARIABLE_DEFINITIONS - 128)) | (1L << (USE_DEFAULT_WHEN_UNSET - 128)) | (1L << (USE_ALTERNATE_WHEN_UNSET - 128)) | (1L << (DISPLAY_ERROR_WHEN_UNSET - 128)) | (1L << (ASSIGN_DEFAULT_WHEN_UNSET - 128)) | (1L << (USE_DEFAULT_WHEN_UNSET_OR_NULL - 128)) | (1L << (USE_ALTERNATE_WHEN_UNSET_OR_NULL - 128)) | (1L << (DISPLAY_ERROR_WHEN_UNSET_OR_NULL - 128)) | (1L << (ASSIGN_DEFAULT_WHEN_UNSET_OR_NULL - 128)) | (1L << (OFFSET - 128)) | (1L << (LIST_EXPAND - 128)) | (1L << (REPLACE_FIRST - 128)) | (1L << (REPLACE_ALL - 128)) | (1L << (REPLACE_AT_START - 128)) | (1L << (REPLACE_AT_END - 128)) | (1L << (LAZY_REMOVE_AT_START - 128)) | (1L << (LAZY_REMOVE_AT_END - 128)) | (1L << (EMPTY_EXPANSION_VALUE - 128)) | (1L << (PLUS_SIGN - 128)) | (1L << (MINUS_SIGN - 128)) | (1L << (PLUS_ASSIGN - 128)) | (1L << (MINUS_ASSIGN - 128)) | (1L << (DIVIDE_ASSIGN - 128)) | (1L << (MUL_ASSIGN - 128)) | (1L << (MOD_ASSIGN - 128)) | (1L << (LSHIFT_ASSIGN - 128)) | (1L << (RSHIFT_ASSIGN - 128)) | (1L << (AND_ASSIGN - 128)) | (1L << (XOR_ASSIGN - 128)) | (1L << (OR_ASSIGN - 128)) | (1L << (LEQ - 128)) | (1L << (GEQ - 128)) | (1L << (NOT_EQUALS - 128)) | (1L << (EQUALS_TO - 128)) | (1L << (BUILTIN_LOGIC_AND - 128)) | (1L << (BUILTIN_LOGIC_OR - 128)) | (1L << (FUNCTION - 128)) | (1L << (ALPHANUM - 128)))) != 0) );
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

	public static class Expansion_atomContext extends ParserRuleContext {
		public Expansion_baseContext expansion_base() {
			return getRuleContext(Expansion_baseContext.class,0);
		}
		public Double_quoted_stringContext double_quoted_string() {
			return getRuleContext(Double_quoted_stringContext.class,0);
		}
		public Expansion_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expansion_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterExpansion_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitExpansion_atom(this);
		}
	}

	public final Expansion_atomContext expansion_atom() throws RecognitionException {
		Expansion_atomContext _localctx = new Expansion_atomContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_expansion_atom);
		try {
			setState(1336);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1334); double_quoted_string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335); expansion_base();
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

	public static class String_partContext extends ParserRuleContext {
		public Ns_string_partContext ns_string_part() {
			return getRuleContext(Ns_string_partContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(BashastParser.SLASH, 0); }
		public String_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterString_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitString_part(this);
		}
	}

	public final String_partContext string_part() throws RecognitionException {
		String_partContext _localctx = new String_partContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_string_part);
		try {
			setState(1340);
			switch (_input.LA(1)) {
			case LSQUARE:
			case RSQUARE:
			case AT:
			case DOT:
			case DOTDOT:
			case TIMES:
			case EQUALS:
			case MINUS:
			case PLUS:
			case CARET:
			case ESC_DQUOTE:
			case ESC_SQUOTE:
			case COMMA:
			case DIGIT:
			case NUMBER:
			case LETTER:
			case TILDE:
			case POUND:
			case PCT:
			case PCTPCT:
			case COLON:
			case QMARK:
			case LOCAL:
			case EXPORT:
			case DECLARE:
			case ESC_RPAREN:
			case ESC_LPAREN:
			case ESC_RSQUARE:
			case ESC_LSQUARE:
			case ESC_DOLLAR:
			case ESC_TICK:
			case ESC_LT:
			case ESC_GT:
			case ESC:
			case UNDERSCORE:
			case NAME:
			case OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338); ns_string_part();
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1339); match(SLASH);
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

	public static class Ns_string_partContext extends ParserRuleContext {
		public TerminalNode OTHER() { return getToken(BashastParser.OTHER, 0); }
		public TerminalNode DOTDOT() { return getToken(BashastParser.DOTDOT, 0); }
		public TerminalNode DECLARE() { return getToken(BashastParser.DECLARE, 0); }
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public TerminalNode POUND() { return getToken(BashastParser.POUND, 0); }
		public TerminalNode ESC_RSQUARE() { return getToken(BashastParser.ESC_RSQUARE, 0); }
		public TerminalNode ESC_LPAREN() { return getToken(BashastParser.ESC_LPAREN, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode ESC_LSQUARE() { return getToken(BashastParser.ESC_LSQUARE, 0); }
		public TerminalNode PCTPCT() { return getToken(BashastParser.PCTPCT, 0); }
		public TerminalNode ESC_LT() { return getToken(BashastParser.ESC_LT, 0); }
		public Escaped_characterContext escaped_character() {
			return getRuleContext(Escaped_characterContext.class,0);
		}
		public TerminalNode CARET() { return getToken(BashastParser.CARET, 0); }
		public TerminalNode ESC_DOLLAR() { return getToken(BashastParser.ESC_DOLLAR, 0); }
		public TerminalNode PLUS() { return getToken(BashastParser.PLUS, 0); }
		public TerminalNode TIMES() { return getToken(BashastParser.TIMES, 0); }
		public TerminalNode ESC_RPAREN() { return getToken(BashastParser.ESC_RPAREN, 0); }
		public TerminalNode EQUALS() { return getToken(BashastParser.EQUALS, 0); }
		public TerminalNode QMARK() { return getToken(BashastParser.QMARK, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public TerminalNode ESC_DQUOTE() { return getToken(BashastParser.ESC_DQUOTE, 0); }
		public TerminalNode EXPORT() { return getToken(BashastParser.EXPORT, 0); }
		public TerminalNode AT() { return getToken(BashastParser.AT, 0); }
		public TerminalNode PCT() { return getToken(BashastParser.PCT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(BashastParser.TILDE, 0); }
		public TerminalNode ESC_SQUOTE() { return getToken(BashastParser.ESC_SQUOTE, 0); }
		public TerminalNode DOT() { return getToken(BashastParser.DOT, 0); }
		public TerminalNode ESC_TICK() { return getToken(BashastParser.ESC_TICK, 0); }
		public TerminalNode COMMA() { return getToken(BashastParser.COMMA, 0); }
		public TerminalNode ESC_GT() { return getToken(BashastParser.ESC_GT, 0); }
		public TerminalNode LOCAL() { return getToken(BashastParser.LOCAL, 0); }
		public TerminalNode COLON() { return getToken(BashastParser.COLON, 0); }
		public Ns_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ns_string_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterNs_string_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitNs_string_part(this);
		}
	}

	public final Ns_string_partContext ns_string_part() throws RecognitionException {
		Ns_string_partContext _localctx = new Ns_string_partContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_ns_string_part);
		try {
			setState(1376);
			switch (_input.LA(1)) {
			case DIGIT:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342); num();
				}
				break;
			case LETTER:
			case UNDERSCORE:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343); name();
				}
				break;
			case ESC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1344); escaped_character();
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1345); match(OTHER);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1346); match(EQUALS);
				}
				break;
			case PCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1347); match(PCT);
				}
				break;
			case PCTPCT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1348); match(PCTPCT);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 8);
				{
				setState(1349); match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 9);
				{
				setState(1350); match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 10);
				{
				setState(1351); match(DOT);
				}
				break;
			case DOTDOT:
				enterOuterAlt(_localctx, 11);
				{
				setState(1352); match(DOTDOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(1353); match(COLON);
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 13);
				{
				setState(1354); match(TILDE);
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 14);
				{
				setState(1355); match(LSQUARE);
				}
				break;
			case RSQUARE:
				enterOuterAlt(_localctx, 15);
				{
				setState(1356); match(RSQUARE);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 16);
				{
				setState(1357); match(CARET);
				}
				break;
			case POUND:
				enterOuterAlt(_localctx, 17);
				{
				setState(1358); match(POUND);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 18);
				{
				setState(1359); match(COMMA);
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 19);
				{
				setState(1360); match(EXPORT);
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 20);
				{
				setState(1361); match(LOCAL);
				}
				break;
			case DECLARE:
				enterOuterAlt(_localctx, 21);
				{
				setState(1362); match(DECLARE);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 22);
				{
				setState(1363); match(AT);
				}
				break;
			case ESC_RPAREN:
				enterOuterAlt(_localctx, 23);
				{
				setState(1364); match(ESC_RPAREN);
				}
				break;
			case ESC_LPAREN:
				enterOuterAlt(_localctx, 24);
				{
				setState(1365); match(ESC_LPAREN);
				}
				break;
			case ESC_RSQUARE:
				enterOuterAlt(_localctx, 25);
				{
				setState(1366); match(ESC_RSQUARE);
				}
				break;
			case ESC_LSQUARE:
				enterOuterAlt(_localctx, 26);
				{
				setState(1367); match(ESC_LSQUARE);
				}
				break;
			case ESC_DOLLAR:
				enterOuterAlt(_localctx, 27);
				{
				setState(1368); match(ESC_DOLLAR);
				}
				break;
			case ESC_GT:
				enterOuterAlt(_localctx, 28);
				{
				setState(1369); match(ESC_GT);
				}
				break;
			case ESC_LT:
				enterOuterAlt(_localctx, 29);
				{
				setState(1370); match(ESC_LT);
				}
				break;
			case ESC_TICK:
				enterOuterAlt(_localctx, 30);
				{
				setState(1371); match(ESC_TICK);
				}
				break;
			case ESC_DQUOTE:
				enterOuterAlt(_localctx, 31);
				{
				setState(1372); match(ESC_DQUOTE);
				}
				break;
			case ESC_SQUOTE:
				enterOuterAlt(_localctx, 32);
				{
				setState(1373); match(ESC_SQUOTE);
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 33);
				{
				setState(1374); match(TIMES);
				}
				break;
			case QMARK:
				enterOuterAlt(_localctx, 34);
				{
				setState(1375); match(QMARK);
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

	public static class Escaped_characterContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(BashastParser.DIGIT, i);
		}
		public TerminalNode LETTER() { return getToken(BashastParser.LETTER, 0); }
		public List<TerminalNode> ALPHANUM() { return getTokens(BashastParser.ALPHANUM); }
		public List<TerminalNode> DIGIT() { return getTokens(BashastParser.DIGIT); }
		public TerminalNode ALPHANUM(int i) {
			return getToken(BashastParser.ALPHANUM, i);
		}
		public TerminalNode ESC() { return getToken(BashastParser.ESC, 0); }
		public Escaped_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escaped_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterEscaped_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitEscaped_character(this);
		}
	}

	public final Escaped_characterContext escaped_character() throws RecognitionException {
		Escaped_characterContext _localctx = new Escaped_characterContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_escaped_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378); match(ESC);
			setState(1391);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1379); match(DIGIT);
				}
				break;
			case 2:
				{
				setState(1380); match(DIGIT);
				setState(1381); match(DIGIT);
				}
				break;
			case 3:
				{
				setState(1382); match(DIGIT);
				setState(1383); match(DIGIT);
				setState(1384); match(DIGIT);
				}
				break;
			case 4:
				{
				setState(1385); match(LETTER);
				setState(1386); match(ALPHANUM);
				setState(1388);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1387); match(ALPHANUM);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1390);
				matchWildcard();
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

	public static class Extended_pattern_matchContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(BashastParser.PIPE); }
		public TerminalNode TIMES() { return getToken(BashastParser.TIMES, 0); }
		public String_expr_partContext string_expr_part() {
			return getRuleContext(String_expr_partContext.class,0);
		}
		public Bracket_pattern_matchContext bracket_pattern_match() {
			return getRuleContext(Bracket_pattern_matchContext.class,0);
		}
		public Extended_patternContext extended_pattern(int i) {
			return getRuleContext(Extended_patternContext.class,i);
		}
		public TerminalNode QMARK() { return getToken(BashastParser.QMARK, 0); }
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public Pattern_class_matchContext pattern_class_match() {
			return getRuleContext(Pattern_class_matchContext.class,0);
		}
		public TerminalNode PIPE(int i) {
			return getToken(BashastParser.PIPE, i);
		}
		public TerminalNode PLUS() { return getToken(BashastParser.PLUS, 0); }
		public List<Extended_patternContext> extended_pattern() {
			return getRuleContexts(Extended_patternContext.class);
		}
		public TerminalNode AT() { return getToken(BashastParser.AT, 0); }
		public TerminalNode LPAREN() { return getToken(BashastParser.LPAREN, 0); }
		public Extended_pattern_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_pattern_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterExtended_pattern_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitExtended_pattern_match(this);
		}
	}

	public final Extended_pattern_matchContext extended_pattern_match() throws RecognitionException {
		Extended_pattern_matchContext _localctx = new Extended_pattern_matchContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_extended_pattern_match);
		int _la;
		try {
			setState(1456);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393); match(QMARK);
				setState(1394); match(LPAREN);
				setState(1395); extended_pattern();
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(1396); match(PIPE);
					setState(1397); extended_pattern();
					}
					}
					setState(1402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1403); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1405); match(TIMES);
				setState(1406); match(LPAREN);
				setState(1407); extended_pattern();
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(1408); match(PIPE);
					setState(1409); extended_pattern();
					}
					}
					setState(1414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1415); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1417); match(PLUS);
				setState(1418); match(LPAREN);
				setState(1419); extended_pattern();
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(1420); match(PIPE);
					setState(1421); extended_pattern();
					}
					}
					setState(1426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1427); match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1429); match(AT);
				setState(1430); match(LPAREN);
				setState(1431); extended_pattern();
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(1432); match(PIPE);
					setState(1433); extended_pattern();
					}
					}
					setState(1438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1439); match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1441); match(BANG);
				setState(1442); match(LPAREN);
				setState(1443); extended_pattern();
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(1444); match(PIPE);
					setState(1445); extended_pattern();
					}
					}
					setState(1450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1451); match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1453); bracket_pattern_match();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1454); pattern_class_match();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1455); string_expr_part();
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

	public static class Extended_patternContext extends ParserRuleContext {
		public List<Extended_pattern_matchContext> extended_pattern_match() {
			return getRuleContexts(Extended_pattern_matchContext.class);
		}
		public Extended_pattern_matchContext extended_pattern_match(int i) {
			return getRuleContext(Extended_pattern_matchContext.class,i);
		}
		public Extended_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterExtended_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitExtended_pattern(this);
		}
	}

	public final Extended_patternContext extended_pattern() throws RecognitionException {
		Extended_patternContext _localctx = new Extended_patternContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_extended_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1458); extended_pattern_match();
				}
				}
				setState(1461); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << CASE) | (1L << DO) | (1L << DONE) | (1L << ELIF) | (1L << ELSE) | (1L << ESAC) | (1L << FI) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << SELECT) | (1L << THEN) | (1L << UNTIL) | (1L << WHILE) | (1L << LBRACE) | (1L << TIME) | (1L << LSQUARE) | (1L << RSQUARE) | (1L << DOLLAR) | (1L << AT) | (1L << DOT) | (1L << DOTDOT) | (1L << TIMES) | (1L << EQUALS) | (1L << MINUS) | (1L << PLUS) | (1L << CARET) | (1L << ESC_DQUOTE) | (1L << ESC_SQUOTE) | (1L << DQUOTE) | (1L << SINGLE_QUOTED_STRING_TOKEN) | (1L << COMMA) | (1L << DIGIT) | (1L << NUMBER) | (1L << LETTER) | (1L << TILDE) | (1L << POUND) | (1L << PCT) | (1L << PCTPCT) | (1L << SLASH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLON - 64)) | (1L << (QMARK - 64)) | (1L << (LOCAL - 64)) | (1L << (EXPORT - 64)) | (1L << (DECLARE - 64)) | (1L << (ESC_RPAREN - 64)) | (1L << (ESC_LPAREN - 64)) | (1L << (ESC_RSQUARE - 64)) | (1L << (ESC_LSQUARE - 64)) | (1L << (ESC_DOLLAR - 64)) | (1L << (ESC_TICK - 64)) | (1L << (COMMAND_SUBSTITUTION_PAREN - 64)) | (1L << (COMMAND_SUBSTITUTION_TICK - 64)) | (1L << (ESC_LT - 64)) | (1L << (ESC_GT - 64)) | (1L << (ESC - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (NAME - 64)) | (1L << (OTHER - 64)))) != 0) );
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

	public static class Bracket_pattern_matchContext extends ParserRuleContext {
		public Bracket_patternContext bracket_pattern() {
			return getRuleContext(Bracket_patternContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(BashastParser.TIMES, 0); }
		public TerminalNode QMARK() { return getToken(BashastParser.QMARK, 0); }
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public Bracket_pattern_match_operatorContext bracket_pattern_match_operator() {
			return getRuleContext(Bracket_pattern_match_operatorContext.class,0);
		}
		public Bracket_pattern_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_pattern_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBracket_pattern_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBracket_pattern_match(this);
		}
	}

	public final Bracket_pattern_matchContext bracket_pattern_match() throws RecognitionException {
		Bracket_pattern_matchContext _localctx = new Bracket_pattern_matchContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_bracket_pattern_match);
		try {
			setState(1470);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463); match(LSQUARE);
				setState(1464); bracket_pattern_match_operator();
				setState(1465); bracket_pattern();
				setState(1466); match(RSQUARE);
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1468); match(TIMES);
				}
				break;
			case QMARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1469); match(QMARK);
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

	public static class Bracket_pattern_match_operatorContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TerminalNode CARET() { return getToken(BashastParser.CARET, 0); }
		public Bracket_pattern_match_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_pattern_match_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBracket_pattern_match_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBracket_pattern_match_operator(this);
		}
	}

	public final Bracket_pattern_match_operatorContext bracket_pattern_match_operator() throws RecognitionException {
		Bracket_pattern_match_operatorContext _localctx = new Bracket_pattern_match_operatorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_bracket_pattern_match_operator);
		try {
			setState(1475);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472); match(BANG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473); match(CARET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Bracket_pattern_partContext extends ParserRuleContext {
		public String_expr_partContext string_expr_part() {
			return getRuleContext(String_expr_partContext.class,0);
		}
		public Pattern_class_matchContext pattern_class_match() {
			return getRuleContext(Pattern_class_matchContext.class,0);
		}
		public Bracket_pattern_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_pattern_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBracket_pattern_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBracket_pattern_part(this);
		}
	}

	public final Bracket_pattern_partContext bracket_pattern_part() throws RecognitionException {
		Bracket_pattern_partContext _localctx = new Bracket_pattern_partContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_bracket_pattern_part);
		try {
			setState(1479);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477); pattern_class_match();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1478); string_expr_part();
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

	public static class Bracket_patternContext extends ParserRuleContext {
		public Bracket_pattern_partContext bracket_pattern_part(int i) {
			return getRuleContext(Bracket_pattern_partContext.class,i);
		}
		public List<Bracket_pattern_partContext> bracket_pattern_part() {
			return getRuleContexts(Bracket_pattern_partContext.class);
		}
		public Bracket_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBracket_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBracket_pattern(this);
		}
	}

	public final Bracket_patternContext bracket_pattern() throws RecognitionException {
		Bracket_patternContext _localctx = new Bracket_patternContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_bracket_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1482); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1481); bracket_pattern_part();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1484); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Pattern_class_matchContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(BashastParser.DOT); }
		public List<TerminalNode> EQUALS() { return getTokens(BashastParser.EQUALS); }
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public Pattern_charContext pattern_char() {
			return getRuleContext(Pattern_charContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public TerminalNode COLON(int i) {
			return getToken(BashastParser.COLON, i);
		}
		public TerminalNode NAME() { return getToken(BashastParser.NAME, 0); }
		public List<TerminalNode> COLON() { return getTokens(BashastParser.COLON); }
		public TerminalNode DOT(int i) {
			return getToken(BashastParser.DOT, i);
		}
		public TerminalNode EQUALS(int i) {
			return getToken(BashastParser.EQUALS, i);
		}
		public Pattern_class_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_class_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterPattern_class_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitPattern_class_match(this);
		}
	}

	public final Pattern_class_matchContext pattern_class_match() throws RecognitionException {
		Pattern_class_matchContext _localctx = new Pattern_class_matchContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_pattern_class_match);
		try {
			setState(1502);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486); match(LSQUARE);
				setState(1487); match(COLON);
				setState(1488); match(NAME);
				setState(1489); match(COLON);
				setState(1490); match(RSQUARE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491); match(LSQUARE);
				setState(1492); match(EQUALS);
				setState(1493); pattern_char();
				setState(1494); match(EQUALS);
				setState(1495); match(RSQUARE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1497); match(LSQUARE);
				setState(1498); match(DOT);
				setState(1499); match(NAME);
				setState(1500); match(DOT);
				setState(1501); match(RSQUARE);
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

	public static class Pattern_charContext extends ParserRuleContext {
		public TerminalNode OTHER() { return getToken(BashastParser.OTHER, 0); }
		public TerminalNode LBRACE() { return getToken(BashastParser.LBRACE, 0); }
		public TerminalNode LETTER() { return getToken(BashastParser.LETTER, 0); }
		public TerminalNode SQUOTE() { return getToken(BashastParser.SQUOTE, 0); }
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public TerminalNode POUND() { return getToken(BashastParser.POUND, 0); }
		public TerminalNode TICK() { return getToken(BashastParser.TICK, 0); }
		public TerminalNode DOLLAR() { return getToken(BashastParser.DOLLAR, 0); }
		public TerminalNode AMP_RSHIFT() { return getToken(BashastParser.AMP_RSHIFT, 0); }
		public TerminalNode DIGIT() { return getToken(BashastParser.DIGIT, 0); }
		public TerminalNode AMP_GREATER_THAN() { return getToken(BashastParser.AMP_GREATER_THAN, 0); }
		public TerminalNode AMP() { return getToken(BashastParser.AMP, 0); }
		public TerminalNode PLUS() { return getToken(BashastParser.PLUS, 0); }
		public TerminalNode PIPE() { return getToken(BashastParser.PIPE, 0); }
		public TerminalNode TIMES() { return getToken(BashastParser.TIMES, 0); }
		public TerminalNode AMP_LESS_THAN() { return getToken(BashastParser.AMP_LESS_THAN, 0); }
		public TerminalNode QMARK() { return getToken(BashastParser.QMARK, 0); }
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(BashastParser.GREATER_THAN, 0); }
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public TerminalNode AT() { return getToken(BashastParser.AT, 0); }
		public TerminalNode LPAREN() { return getToken(BashastParser.LPAREN, 0); }
		public TerminalNode RBRACE() { return getToken(BashastParser.RBRACE, 0); }
		public TerminalNode PCT() { return getToken(BashastParser.PCT, 0); }
		public TerminalNode SEMIC() { return getToken(BashastParser.SEMIC, 0); }
		public TerminalNode LESS_THAN() { return getToken(BashastParser.LESS_THAN, 0); }
		public TerminalNode DOT() { return getToken(BashastParser.DOT, 0); }
		public TerminalNode DQUOTE() { return getToken(BashastParser.DQUOTE, 0); }
		public TerminalNode COMMA() { return getToken(BashastParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(BashastParser.COLON, 0); }
		public TerminalNode SLASH() { return getToken(BashastParser.SLASH, 0); }
		public Pattern_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterPattern_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitPattern_char(this);
		}
	}

	public final Pattern_charContext pattern_char() throws RecognitionException {
		Pattern_charContext _localctx = new Pattern_charContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_pattern_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << LBRACE) | (1L << RBRACE) | (1L << RPAREN) | (1L << LPAREN) | (1L << LSQUARE) | (1L << RSQUARE) | (1L << TICK) | (1L << DOLLAR) | (1L << AT) | (1L << DOT) | (1L << TIMES) | (1L << MINUS) | (1L << PLUS) | (1L << AMP) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << AMP_LESS_THAN) | (1L << AMP_GREATER_THAN) | (1L << AMP_RSHIFT) | (1L << SEMIC) | (1L << PIPE) | (1L << DQUOTE) | (1L << SQUOTE) | (1L << COMMA) | (1L << DIGIT) | (1L << LETTER) | (1L << POUND) | (1L << PCT) | (1L << SLASH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COLON - 64)) | (1L << (QMARK - 64)) | (1L << (OTHER - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Variable_referenceContext extends ParserRuleContext {
		public TerminalNode DOLLAR(int i) {
			return getToken(BashastParser.DOLLAR, i);
		}
		public TerminalNode LBRACE() { return getToken(BashastParser.LBRACE, 0); }
		public TerminalNode TIMES() { return getToken(BashastParser.TIMES, 0); }
		public TerminalNode QMARK() { return getToken(BashastParser.QMARK, 0); }
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode POUND() { return getToken(BashastParser.POUND, 0); }
		public List<TerminalNode> DOLLAR() { return getTokens(BashastParser.DOLLAR); }
		public Parameter_expansionContext parameter_expansion() {
			return getRuleContext(Parameter_expansionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BashastParser.RBRACE, 0); }
		public TerminalNode AT() { return getToken(BashastParser.AT, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Variable_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterVariable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitVariable_reference(this);
		}
	}

	public final Variable_referenceContext variable_reference() throws RecognitionException {
		Variable_referenceContext _localctx = new Variable_referenceContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_variable_reference);
		try {
			setState(1529);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506); match(DOLLAR);
				setState(1507); match(LBRACE);
				setState(1508); parameter_expansion();
				setState(1509); match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511); match(DOLLAR);
				setState(1512); name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1513); match(DOLLAR);
				setState(1514); num();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1515); match(DOLLAR);
				setState(1516); match(TIMES);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1517); match(DOLLAR);
				setState(1518); match(AT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1519); match(DOLLAR);
				setState(1520); match(POUND);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1521); match(DOLLAR);
				setState(1522); match(QMARK);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1523); match(DOLLAR);
				setState(1524); match(MINUS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1525); match(DOLLAR);
				setState(1526); match(DOLLAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1527); match(DOLLAR);
				setState(1528); match(BANG);
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

	public static class Parameter_expansionContext extends ParserRuleContext {
		public Explicit_arithmeticContext os;
		public Explicit_arithmeticContext len;
		public Token op;
		public TerminalNode TIMES() { return getToken(BashastParser.TIMES, 0); }
		public Parameter_replace_patternContext parameter_replace_pattern() {
			return getRuleContext(Parameter_replace_patternContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public Parameter_delete_patternContext parameter_delete_pattern() {
			return getRuleContext(Parameter_delete_patternContext.class,0);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public Variable_name_for_bangContext variable_name_for_bang() {
			return getRuleContext(Variable_name_for_bangContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Variable_size_refContext variable_size_ref() {
			return getRuleContext(Variable_size_refContext.class,0);
		}
		public TerminalNode AT() { return getToken(BashastParser.AT, 0); }
		public Explicit_arithmeticContext explicit_arithmetic(int i) {
			return getRuleContext(Explicit_arithmeticContext.class,i);
		}
		public Parameter_delete_operatorContext parameter_delete_operator() {
			return getRuleContext(Parameter_delete_operatorContext.class,0);
		}
		public List<Explicit_arithmeticContext> explicit_arithmetic() {
			return getRuleContexts(Explicit_arithmeticContext.class);
		}
		public Parameter_replace_operatorContext parameter_replace_operator() {
			return getRuleContext(Parameter_replace_operatorContext.class,0);
		}
		public Parameter_value_operatorContext parameter_value_operator() {
			return getRuleContext(Parameter_value_operatorContext.class,0);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Parameter_expansion_valueContext parameter_expansion_value() {
			return getRuleContext(Parameter_expansion_valueContext.class,0);
		}
		public TerminalNode COLON(int i) {
			return getToken(BashastParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(BashastParser.COLON); }
		public TerminalNode SLASH() { return getToken(BashastParser.SLASH, 0); }
		public Parameter_expansionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_expansion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterParameter_expansion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitParameter_expansion(this);
		}
	}

	public final Parameter_expansionContext parameter_expansion() throws RecognitionException {
		Parameter_expansionContext _localctx = new Parameter_expansionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_parameter_expansion);
		int _la;
		try {
			setState(1582);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531); variable_name();
				setState(1566);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1532); parameter_value_operator();
					setState(1533); parameter_expansion_value();
					}
					break;
				case 2:
					{
					setState(1535); match(COLON);
					setState(1537);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(1536); match(BLANK);
						}
					}

					setState(1552);
					switch (_input.LA(1)) {
					case BANG:
					case LPAREN:
					case DOLLAR:
					case MINUS:
					case PLUS:
					case DQUOTE:
					case DIGIT:
					case NUMBER:
					case LETTER:
					case TILDE:
					case COMMAND_SUBSTITUTION_PAREN:
					case COMMAND_SUBSTITUTION_TICK:
					case UNDERSCORE:
					case NAME:
						{
						setState(1539); ((Parameter_expansionContext)_localctx).os = explicit_arithmetic();
						setState(1545);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(1540); match(COLON);
							setState(1542);
							_la = _input.LA(1);
							if (_la==BLANK) {
								{
								setState(1541); match(BLANK);
								}
							}

							setState(1544); ((Parameter_expansionContext)_localctx).len = explicit_arithmetic();
							}
						}

						}
						break;
					case COLON:
						{
						setState(1547); match(COLON);
						setState(1549);
						_la = _input.LA(1);
						if (_la==BLANK) {
							{
							setState(1548); match(BLANK);
							}
						}

						setState(1551); ((Parameter_expansionContext)_localctx).len = explicit_arithmetic();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 3:
					{
					setState(1554); parameter_delete_operator();
					setState(1555); parameter_delete_pattern();
					}
					break;
				case 4:
					{
					setState(1557); parameter_replace_operator();
					setState(1558); parameter_replace_pattern();
					setState(1561);
					_la = _input.LA(1);
					if (_la==SLASH) {
						{
						setState(1559); match(SLASH);
						setState(1560); parameter_expansion_value();
						}
					}

					}
					break;
				case 5:
					{
					setState(1564);
					_la = _input.LA(1);
					if (_la==BLANK) {
						{
						setState(1563); match(BLANK);
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1568); match(BANG);
				setState(1569); variable_name_for_bang();
				setState(1578);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(1570); match(TIMES);
					}
					break;
				case AT:
					{
					setState(1571); match(AT);
					}
					break;
				case LSQUARE:
					{
					setState(1572); match(LSQUARE);
					setState(1575);
					switch (_input.LA(1)) {
					case TIMES:
						{
						setState(1573); ((Parameter_expansionContext)_localctx).op = match(TIMES);
						}
						break;
					case AT:
						{
						setState(1574); ((Parameter_expansionContext)_localctx).op = match(AT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1577); match(RSQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1580);
				if (!(LA(1) == POUND && LA(2) != RBRACE )) throw new FailedPredicateException(this, "{LA(1) == POUND && LA(2) != RBRACE }? =>");
				setState(1581); variable_size_ref();
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

	public static class Parameter_delete_operatorContext extends ParserRuleContext {
		public TerminalNode PCTPCT() { return getToken(BashastParser.PCTPCT, 0); }
		public TerminalNode POUND(int i) {
			return getToken(BashastParser.POUND, i);
		}
		public List<TerminalNode> POUND() { return getTokens(BashastParser.POUND); }
		public TerminalNode PCT() { return getToken(BashastParser.PCT, 0); }
		public Parameter_delete_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_delete_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterParameter_delete_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitParameter_delete_operator(this);
		}
	}

	public final Parameter_delete_operatorContext parameter_delete_operator() throws RecognitionException {
		Parameter_delete_operatorContext _localctx = new Parameter_delete_operatorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_parameter_delete_operator);
		try {
			setState(1589);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1584); match(POUND);
				setState(1585); match(POUND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1586); match(POUND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1587); match(PCT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1588); match(PCTPCT);
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

	public static class Parameter_value_operatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(BashastParser.EQUALS, 0); }
		public TerminalNode QMARK() { return getToken(BashastParser.QMARK, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(BashastParser.PLUS, 0); }
		public TerminalNode COLON() { return getToken(BashastParser.COLON, 0); }
		public Parameter_value_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_value_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterParameter_value_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitParameter_value_operator(this);
		}
	}

	public final Parameter_value_operatorContext parameter_value_operator() throws RecognitionException {
		Parameter_value_operatorContext _localctx = new Parameter_value_operatorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_parameter_value_operator);
		try {
			setState(1603);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1591); match(COLON);
				setState(1592); match(MINUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593); match(COLON);
				setState(1594); match(EQUALS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1595); match(COLON);
				setState(1596); match(QMARK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1597); match(COLON);
				setState(1598); match(PLUS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1599); match(MINUS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1600); match(EQUALS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1601); match(QMARK);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1602); match(PLUS);
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

	public static class Parameter_replace_patternContext extends ParserRuleContext {
		public List<Parameter_pattern_partContext> parameter_pattern_part() {
			return getRuleContexts(Parameter_pattern_partContext.class);
		}
		public Parameter_pattern_partContext parameter_pattern_part(int i) {
			return getRuleContext(Parameter_pattern_partContext.class,i);
		}
		public Parameter_replace_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_replace_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterParameter_replace_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitParameter_replace_pattern(this);
		}
	}

	public final Parameter_replace_patternContext parameter_replace_pattern() throws RecognitionException {
		Parameter_replace_patternContext _localctx = new Parameter_replace_patternContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_parameter_replace_pattern);
		try {
			int _alt;
			setState(1611);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1606); parameter_pattern_part();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1609); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Parameter_delete_patternContext extends ParserRuleContext {
		public List<Parameter_pattern_partContext> parameter_pattern_part() {
			return getRuleContexts(Parameter_pattern_partContext.class);
		}
		public Parameter_pattern_partContext parameter_pattern_part(int i) {
			return getRuleContext(Parameter_pattern_partContext.class,i);
		}
		public Parameter_delete_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_delete_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterParameter_delete_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitParameter_delete_pattern(this);
		}
	}

	public final Parameter_delete_patternContext parameter_delete_pattern() throws RecognitionException {
		Parameter_delete_patternContext _localctx = new Parameter_delete_patternContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_parameter_delete_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1614); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1613); parameter_pattern_part();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1616); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Parameter_pattern_partContext extends ParserRuleContext {
		public Extended_pattern_matchContext extended_pattern_match() {
			return getRuleContext(Extended_pattern_matchContext.class,0);
		}
		public Parameter_pattern_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_pattern_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterParameter_pattern_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitParameter_pattern_part(this);
		}
	}

	public final Parameter_pattern_partContext parameter_pattern_part() throws RecognitionException {
		Parameter_pattern_partContext _localctx = new Parameter_pattern_partContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_parameter_pattern_part);
		try {
			setState(1621);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1618); extended_pattern_match();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1619);
				if (!(is_special_token(LA(1)))) throw new FailedPredicateException(this, "{is_special_token(LA(1))}? =>");
				setState(1620);
				matchWildcard();
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

	public static class Parameter_expansion_valueContext extends ParserRuleContext {
		public int num_of_braces;
		public Parameter_expansion_value_atomContext parameter_expansion_value_atom() {
			return getRuleContext(Parameter_expansion_value_atomContext.class,0);
		}
		public Parameter_expansion_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_expansion_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterParameter_expansion_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitParameter_expansion_value(this);
		}
	}

	public final Parameter_expansion_valueContext parameter_expansion_value() throws RecognitionException {
		Parameter_expansion_valueContext _localctx = new Parameter_expansion_valueContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_parameter_expansion_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623); parameter_expansion_value_atom();
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

	public static class Parameter_expansion_value_atomContext extends ParserRuleContext {
		public Parameter_expansion_value_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_expansion_value_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterParameter_expansion_value_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitParameter_expansion_value_atom(this);
		}
	}

	public final Parameter_expansion_value_atomContext parameter_expansion_value_atom() throws RecognitionException {
		Parameter_expansion_value_atomContext _localctx = new Parameter_expansion_value_atomContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_parameter_expansion_value_atom);
		try {
			int _alt;
			setState(1634);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((Parameter_expansion_valueContext)getInvokingContext(105)).num_of_braces =  1;
				setState(1629); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1626);
						if (!(((Parameter_expansion_valueContext)getInvokingContext(105)).num_of_braces != 0)) throw new FailedPredicateException(this, "{$parameter_expansion_value::num_of_braces != 0}? =>");
						setState(1627);
						matchWildcard();

											if(LA(1) == LBRACE && LA(-1) != ESC)
												++((Parameter_expansion_valueContext)getInvokingContext(105)).num_of_braces;
											else if(LA(1) == RBRACE && LA(-1) != ESC)
												--((Parameter_expansion_valueContext)getInvokingContext(105)).num_of_braces;
										
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1631); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Parameter_replace_operatorContext extends ParserRuleContext {
		public TerminalNode SLASH(int i) {
			return getToken(BashastParser.SLASH, i);
		}
		public TerminalNode POUND() { return getToken(BashastParser.POUND, 0); }
		public TerminalNode PCT() { return getToken(BashastParser.PCT, 0); }
		public List<TerminalNode> SLASH() { return getTokens(BashastParser.SLASH); }
		public Parameter_replace_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_replace_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterParameter_replace_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitParameter_replace_operator(this);
		}
	}

	public final Parameter_replace_operatorContext parameter_replace_operator() throws RecognitionException {
		Parameter_replace_operatorContext _localctx = new Parameter_replace_operatorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_parameter_replace_operator);
		try {
			setState(1643);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1636); match(SLASH);
				setState(1637); match(SLASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1638); match(SLASH);
				setState(1639); match(PCT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1640); match(SLASH);
				setState(1641); match(POUND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1642); match(SLASH);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(BashastParser.TIMES, 0); }
		public TerminalNode QMARK() { return getToken(BashastParser.QMARK, 0); }
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public Variable_name_for_bangContext variable_name_for_bang() {
			return getRuleContext(Variable_name_for_bangContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public TerminalNode POUND() { return getToken(BashastParser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(BashastParser.DOLLAR, 0); }
		public TerminalNode AT() { return getToken(BashastParser.AT, 0); }
		public Variable_name_no_digitContext variable_name_no_digit() {
			return getRuleContext(Variable_name_no_digitContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitVariable_name(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_variable_name);
		try {
			setState(1664);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1645); num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1646); name();
				setState(1647); match(LSQUARE);
				setState(1648); match(AT);
				setState(1649); match(RSQUARE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1651); name();
				setState(1652); match(LSQUARE);
				setState(1653); match(TIMES);
				setState(1654); match(RSQUARE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1656); match(BANG);
				setState(1657); variable_name_for_bang();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1658); variable_name_no_digit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1659); match(DOLLAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1660); match(TIMES);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1661); match(AT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1662); match(QMARK);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1663); match(POUND);
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

	public static class Variable_name_no_digitContext extends ParserRuleContext {
		public Explicit_arithmeticContext explicit_arithmetic() {
			return getRuleContext(Explicit_arithmeticContext.class,0);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Variable_name_no_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name_no_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterVariable_name_no_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitVariable_name_no_digit(this);
		}
	}

	public final Variable_name_no_digitContext variable_name_no_digit() throws RecognitionException {
		Variable_name_no_digitContext _localctx = new Variable_name_no_digitContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_variable_name_no_digit);
		int _la;
		try {
			setState(1678);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666); name();
				setState(1667); match(LSQUARE);
				setState(1669);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1668); match(BLANK);
					}
				}

				setState(1671); explicit_arithmetic();
				setState(1673);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1672); match(BLANK);
					}
				}

				setState(1675); match(RSQUARE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1677); name();
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

	public static class Variable_name_for_bangContext extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(BashastParser.POUND, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Variable_name_for_bangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name_for_bang; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterVariable_name_for_bang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitVariable_name_for_bang(this);
		}
	}

	public final Variable_name_for_bangContext variable_name_for_bang() throws RecognitionException {
		Variable_name_for_bangContext _localctx = new Variable_name_for_bangContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_variable_name_for_bang);
		try {
			setState(1683);
			switch (_input.LA(1)) {
			case DIGIT:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680); num();
				}
				break;
			case LETTER:
			case UNDERSCORE:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681); name();
				}
				break;
			case POUND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1682); match(POUND);
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

	public static class Variable_size_refContext extends ParserRuleContext {
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode POUND() { return getToken(BashastParser.POUND, 0); }
		public Array_size_indexContext array_size_index() {
			return getRuleContext(Array_size_indexContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Variable_size_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_size_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterVariable_size_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitVariable_size_ref(this);
		}
	}

	public final Variable_size_refContext variable_size_ref() throws RecognitionException {
		Variable_size_refContext _localctx = new Variable_size_refContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_variable_size_ref);
		try {
			setState(1693);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1685); match(POUND);
				setState(1686); name();
				setState(1687); match(LSQUARE);
				setState(1688); array_size_index();
				setState(1689); match(RSQUARE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1691); match(POUND);
				setState(1692); variable_name();
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

	public static class Array_size_indexContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(BashastParser.DIGIT, i);
		}
		public TerminalNode TIMES() { return getToken(BashastParser.TIMES, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(BashastParser.DIGIT); }
		public TerminalNode AT() { return getToken(BashastParser.AT, 0); }
		public Array_size_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_size_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArray_size_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArray_size_index(this);
		}
	}

	public final Array_size_indexContext array_size_index() throws RecognitionException {
		Array_size_indexContext _localctx = new Array_size_indexContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_array_size_index);
		int _la;
		try {
			setState(1701);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1696); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1695); match(DIGIT);
					}
					}
					setState(1698); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case AT:
			case TIMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1700);
				_la = _input.LA(1);
				if ( !(_la==AT || _la==TIMES) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class WspaceContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(BashastParser.EOL); }
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode EOL(int i) {
			return getToken(BashastParser.EOL, i);
		}
		public WspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterWspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitWspace(this);
		}
	}

	public final WspaceContext wspace() throws RecognitionException {
		WspaceContext _localctx = new WspaceContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_wspace);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1704); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1703);
					_la = _input.LA(1);
					if ( !(_la==BLANK || _la==EOL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1706); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Command_substitutionContext extends ParserRuleContext {
		public TerminalNode COMMAND_SUBSTITUTION_TICK() { return getToken(BashastParser.COMMAND_SUBSTITUTION_TICK, 0); }
		public TerminalNode COMMAND_SUBSTITUTION_PAREN() { return getToken(BashastParser.COMMAND_SUBSTITUTION_PAREN, 0); }
		public Command_substitutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_substitution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCommand_substitution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCommand_substitution(this);
		}
	}

	public final Command_substitutionContext command_substitution() throws RecognitionException {
		Command_substitutionContext _localctx = new Command_substitutionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_command_substitution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			_la = _input.LA(1);
			if ( !(_la==COMMAND_SUBSTITUTION_PAREN || _la==COMMAND_SUBSTITUTION_TICK) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Brace_expansionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BashastParser.LBRACE, 0); }
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public Brace_expansion_insideContext brace_expansion_inside() {
			return getRuleContext(Brace_expansion_insideContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BashastParser.RBRACE, 0); }
		public Brace_expansionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brace_expansion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBrace_expansion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBrace_expansion(this);
		}
	}

	public final Brace_expansionContext brace_expansion() throws RecognitionException {
		Brace_expansionContext _localctx = new Brace_expansionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_brace_expansion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710); match(LBRACE);
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(1711); match(BLANK);
				}
				}
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1717); brace_expansion_inside();
			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(1718); match(BLANK);
				}
				}
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1724); match(RBRACE);
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

	public static class Brace_expansion_insideContext extends ParserRuleContext {
		public CommasepContext commasep() {
			return getRuleContext(CommasepContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Brace_expansion_insideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brace_expansion_inside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBrace_expansion_inside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBrace_expansion_inside(this);
		}
	}

	public final Brace_expansion_insideContext brace_expansion_inside() throws RecognitionException {
		Brace_expansion_insideContext _localctx = new Brace_expansion_insideContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_brace_expansion_inside);
		try {
			setState(1728);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1726); commasep();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1727); range();
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

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LETTER(int i) {
			return getToken(BashastParser.LETTER, i);
		}
		public TerminalNode DIGIT(int i) {
			return getToken(BashastParser.DIGIT, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(BashastParser.LETTER); }
		public TerminalNode DOTDOT() { return getToken(BashastParser.DOTDOT, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(BashastParser.DIGIT); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_range);
		try {
			setState(1736);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1730); match(DIGIT);
				setState(1731); match(DOTDOT);
				setState(1732); match(DIGIT);
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733); match(LETTER);
				setState(1734); match(DOTDOT);
				setState(1735); match(LETTER);
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

	public static class Brace_expansion_partContext extends ParserRuleContext {
		public List<String_expr_partContext> string_expr_part() {
			return getRuleContexts(String_expr_partContext.class);
		}
		public String_expr_partContext string_expr_part(int i) {
			return getRuleContext(String_expr_partContext.class,i);
		}
		public Brace_expansion_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brace_expansion_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBrace_expansion_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBrace_expansion_part(this);
		}
	}

	public final Brace_expansion_partContext brace_expansion_part() throws RecognitionException {
		Brace_expansion_partContext _localctx = new Brace_expansion_partContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_brace_expansion_part);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1738); string_expr_part();
					}
					} 
				}
				setState(1743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
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

	public static class CommasepContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(BashastParser.COMMA); }
		public Brace_expansion_partContext brace_expansion_part(int i) {
			return getRuleContext(Brace_expansion_partContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BashastParser.COMMA, i);
		}
		public List<Brace_expansion_partContext> brace_expansion_part() {
			return getRuleContexts(Brace_expansion_partContext.class);
		}
		public CommasepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commasep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCommasep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCommasep(this);
		}
	}

	public final CommasepContext commasep() throws RecognitionException {
		CommasepContext _localctx = new CommasepContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_commasep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744); brace_expansion_part();
			setState(1747); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1745); match(COMMA);
				setState(1746); brace_expansion_part();
				}
				}
				setState(1749); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
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

	public static class Explicit_arithmeticContext extends ParserRuleContext {
		public Arithmetic_partContext arithmetic_part() {
			return getRuleContext(Arithmetic_partContext.class,0);
		}
		public ArithmeticsContext arithmetics() {
			return getRuleContext(ArithmeticsContext.class,0);
		}
		public Explicit_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterExplicit_arithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitExplicit_arithmetic(this);
		}
	}

	public final Explicit_arithmeticContext explicit_arithmetic() throws RecognitionException {
		Explicit_arithmeticContext _localctx = new Explicit_arithmeticContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_explicit_arithmetic);
		try {
			setState(1753);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1751); arithmetic_part();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1752); arithmetics();
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

	public static class Arithmetic_expansionContext extends ParserRuleContext {
		public Arithmetic_partContext arithmetic_part() {
			return getRuleContext(Arithmetic_partContext.class,0);
		}
		public Arithmetic_expansionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expansion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArithmetic_expansion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArithmetic_expansion(this);
		}
	}

	public final Arithmetic_expansionContext arithmetic_expansion() throws RecognitionException {
		Arithmetic_expansionContext _localctx = new Arithmetic_expansionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_arithmetic_expansion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755); arithmetic_part();
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

	public static class Arithmetic_partContext extends ParserRuleContext {
		public TerminalNode LLPAREN() { return getToken(BashastParser.LLPAREN, 0); }
		public TerminalNode RPAREN(int i) {
			return getToken(BashastParser.RPAREN, i);
		}
		public TerminalNode RSQUARE() { return getToken(BashastParser.RSQUARE, 0); }
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public TerminalNode LSQUARE() { return getToken(BashastParser.LSQUARE, 0); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<TerminalNode> RPAREN() { return getTokens(BashastParser.RPAREN); }
		public TerminalNode DOLLAR() { return getToken(BashastParser.DOLLAR, 0); }
		public ArithmeticsContext arithmetics() {
			return getRuleContext(ArithmeticsContext.class,0);
		}
		public Arithmetic_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArithmetic_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArithmetic_part(this);
		}
	}

	public final Arithmetic_partContext arithmetic_part() throws RecognitionException {
		Arithmetic_partContext _localctx = new Arithmetic_partContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_arithmetic_part);
		int _la;
		try {
			setState(1780);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1757); match(DOLLAR);
				setState(1758); match(LLPAREN);
				setState(1760);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1759); match(BLANK);
					}
				}

				setState(1762); arithmetics();
				setState(1764);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1763); match(BLANK);
					}
				}

				setState(1766); match(RPAREN);
				setState(1767); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1769); match(DOLLAR);
				setState(1770); match(LSQUARE);
				setState(1772);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1771); match(BLANK);
					}
				}

				setState(1774); arithmetics();
				setState(1776);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1775); match(BLANK);
					}
				}

				setState(1778); match(RSQUARE);
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

	public static class ArithmeticsContext extends ParserRuleContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BashastParser.COMMA); }
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode COMMA(int i) {
			return getToken(BashastParser.COMMA, i);
		}
		public ArithmeticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArithmetics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArithmetics(this);
		}
	}

	public final ArithmeticsContext arithmetics() throws RecognitionException {
		ArithmeticsContext _localctx = new ArithmeticsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_arithmetics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782); arithmetic();
			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1783); match(COMMA);
				setState(1785);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1784); match(BLANK);
					}
				}

				setState(1787); arithmetic();
				}
				}
				setState(1792);
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

	public static class Arithmetics_testContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BashastParser.EOF, 0); }
		public ArithmeticsContext arithmetics() {
			return getRuleContext(ArithmeticsContext.class,0);
		}
		public Arithmetics_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetics_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArithmetics_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArithmetics_test(this);
		}
	}

	public final Arithmetics_testContext arithmetics_test() throws RecognitionException {
		Arithmetics_testContext _localctx = new Arithmetics_testContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arithmetics_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793); arithmetics();
			setState(1794); match(EOF);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public LogicorContext cnd;
		public LogicorContext t;
		public LogicorContext f;
		public Arithmetic_assignment_operatorContext arithmetic_assignment_operator() {
			return getRuleContext(Arithmetic_assignment_operatorContext.class,0);
		}
		public List<LogicorContext> logicor() {
			return getRuleContexts(LogicorContext.class);
		}
		public TerminalNode QMARK() { return getToken(BashastParser.QMARK, 0); }
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode COLON() { return getToken(BashastParser.COLON, 0); }
		public Arithmetic_variable_referenceContext arithmetic_variable_reference() {
			return getRuleContext(Arithmetic_variable_referenceContext.class,0);
		}
		public LogicorContext logicor(int i) {
			return getRuleContext(LogicorContext.class,i);
		}
		public Variable_name_no_digitContext variable_name_no_digit() {
			return getRuleContext(Variable_name_no_digitContext.class,0);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArithmetic(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_arithmetic);
		int _la;
		try {
			setState(1825);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1796); variable_name_no_digit();
				setState(1798);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1797); match(BLANK);
					}
					break;
				}
				setState(1800); arithmetic_assignment_operator();
				setState(1802);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1801); match(BLANK);
					}
				}

				setState(1804); logicor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1806); arithmetic_variable_reference();
				setState(1808);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1807); match(BLANK);
					}
					break;
				}
				setState(1810); arithmetic_assignment_operator();
				setState(1812);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1811); match(BLANK);
					}
				}

				setState(1814); logicor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1816); ((ArithmeticContext)_localctx).cnd = logicor();
				setState(1823);
				switch (_input.LA(1)) {
				case QMARK:
					{
					setState(1817); match(QMARK);
					setState(1818); ((ArithmeticContext)_localctx).t = logicor();
					setState(1819); match(COLON);
					setState(1820); ((ArithmeticContext)_localctx).f = logicor();
					}
					break;
				case EOF:
				case RBRACE:
				case RPAREN:
				case RSQUARE:
				case SEMIC:
				case DOUBLE_SEMIC:
				case COMMA:
				case BLANK:
				case EOL:
				case COLON:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Arithmetic_assignment_operatorContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(BashastParser.PIPE, 0); }
		public TerminalNode TIMES() { return getToken(BashastParser.TIMES, 0); }
		public TerminalNode EQUALS() { return getToken(BashastParser.EQUALS, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode AMP() { return getToken(BashastParser.AMP, 0); }
		public TerminalNode CARET() { return getToken(BashastParser.CARET, 0); }
		public TerminalNode PLUS() { return getToken(BashastParser.PLUS, 0); }
		public TerminalNode PCT() { return getToken(BashastParser.PCT, 0); }
		public TerminalNode SLASH() { return getToken(BashastParser.SLASH, 0); }
		public TerminalNode RSHIFT() { return getToken(BashastParser.RSHIFT, 0); }
		public TerminalNode LSHIFT() { return getToken(BashastParser.LSHIFT, 0); }
		public Arithmetic_assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArithmetic_assignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArithmetic_assignment_operator(this);
		}
	}

	public final Arithmetic_assignment_operatorContext arithmetic_assignment_operator() throws RecognitionException {
		Arithmetic_assignment_operatorContext _localctx = new Arithmetic_assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_arithmetic_assignment_operator);
		try {
			setState(1849);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1827);
				if (!(LA(1) == EQUALS && LA(2) != EQUALS)) throw new FailedPredicateException(this, "{LA(1) == EQUALS && LA(2) != EQUALS}? =>");
				setState(1828); match(EQUALS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1829); match(TIMES);
				setState(1830); match(EQUALS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1831); match(SLASH);
				setState(1832); match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1833); match(PCT);
				setState(1834); match(EQUALS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1835); match(PLUS);
				setState(1836); match(EQUALS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1837); match(MINUS);
				setState(1838); match(EQUALS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1839); match(LSHIFT);
				setState(1840); match(EQUALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1841); match(RSHIFT);
				setState(1842); match(EQUALS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1843); match(AMP);
				setState(1844); match(EQUALS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1845); match(CARET);
				setState(1846); match(EQUALS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1847); match(PIPE);
				setState(1848); match(EQUALS);
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

	public static class Arithmetic_variable_referenceContext extends ParserRuleContext {
		public Variable_referenceContext variable_reference() {
			return getRuleContext(Variable_referenceContext.class,0);
		}
		public Arithmetic_variable_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_variable_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterArithmetic_variable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitArithmetic_variable_reference(this);
		}
	}

	public final Arithmetic_variable_referenceContext arithmetic_variable_reference() throws RecognitionException {
		Arithmetic_variable_referenceContext _localctx = new Arithmetic_variable_referenceContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_arithmetic_variable_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851); variable_reference();
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

	public static class PrimaryContext extends ParserRuleContext {
		public Variable_referenceContext variable_reference() {
			return getRuleContext(Variable_referenceContext.class,0);
		}
		public Arithmetic_expansionContext arithmetic_expansion() {
			return getRuleContext(Arithmetic_expansionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BashastParser.RPAREN, 0); }
		public ArithmeticsContext arithmetics() {
			return getRuleContext(ArithmeticsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BashastParser.LPAREN, 0); }
		public Variable_name_no_digitContext variable_name_no_digit() {
			return getRuleContext(Variable_name_no_digitContext.class,0);
		}
		public Command_substitutionContext command_substitution() {
			return getRuleContext(Command_substitutionContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_primary);
		try {
			setState(1862);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1853); num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1854); command_substitution();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1855); variable_name_no_digit();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1856); variable_reference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1857); arithmetic_expansion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1858); match(LPAREN);
				{
				setState(1859); arithmetics();
				}
				setState(1860); match(RPAREN);
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

	public static class Pre_post_primaryContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DQUOTE(int i) {
			return getToken(BashastParser.DQUOTE, i);
		}
		public List<TerminalNode> DQUOTE() { return getTokens(BashastParser.DQUOTE); }
		public Pre_post_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_post_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterPre_post_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitPre_post_primary(this);
		}
	}

	public final Pre_post_primaryContext pre_post_primary() throws RecognitionException {
		Pre_post_primaryContext _localctx = new Pre_post_primaryContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_pre_post_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			_la = _input.LA(1);
			if (_la==DQUOTE) {
				{
				setState(1864); match(DQUOTE);
				}
			}

			setState(1867); primary();
			setState(1869);
			_la = _input.LA(1);
			if (_la==DQUOTE) {
				{
				setState(1868); match(DQUOTE);
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

	public static class Post_inc_decContext extends ParserRuleContext {
		public TerminalNode MINUS(int i) {
			return getToken(BashastParser.MINUS, i);
		}
		public Pre_post_primaryContext pre_post_primary() {
			return getRuleContext(Pre_post_primaryContext.class,0);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(BashastParser.MINUS); }
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<TerminalNode> PLUS() { return getTokens(BashastParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BashastParser.PLUS, i);
		}
		public Post_inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterPost_inc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitPost_inc_dec(this);
		}
	}

	public final Post_inc_decContext post_inc_dec() throws RecognitionException {
		Post_inc_decContext _localctx = new Post_inc_decContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_post_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871); pre_post_primary();
			setState(1873);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1872); match(BLANK);
				}
				break;
			}
			setState(1886);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1876);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1875); match(BLANK);
					}
				}

				setState(1878); match(PLUS);
				setState(1879); match(PLUS);
				}
				break;
			case 2:
				{
				setState(1881);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1880); match(BLANK);
					}
				}

				setState(1883); match(MINUS);
				setState(1884); match(MINUS);
				}
				break;
			case 3:
				{
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

	public static class Pre_inc_decContext extends ParserRuleContext {
		public TerminalNode MINUS(int i) {
			return getToken(BashastParser.MINUS, i);
		}
		public Pre_post_primaryContext pre_post_primary() {
			return getRuleContext(Pre_post_primaryContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(BashastParser.MINUS); }
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public List<TerminalNode> PLUS() { return getTokens(BashastParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BashastParser.PLUS, i);
		}
		public Pre_inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterPre_inc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitPre_inc_dec(this);
		}
	}

	public final Pre_inc_decContext pre_inc_dec() throws RecognitionException {
		Pre_inc_decContext _localctx = new Pre_inc_decContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_pre_inc_dec);
		int _la;
		try {
			setState(1900);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1888); match(PLUS);
				setState(1889); match(PLUS);
				setState(1891);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1890); match(BLANK);
					}
				}

				setState(1893); pre_post_primary();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1894); match(MINUS);
				setState(1895); match(MINUS);
				setState(1897);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1896); match(BLANK);
					}
				}

				setState(1899); pre_post_primary();
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

	public static class Unary_with_operatorContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(BashastParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TerminalNode MINUS() { return getToken(BashastParser.MINUS, 0); }
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BashastParser.PLUS, 0); }
		public Unary_with_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_with_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterUnary_with_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitUnary_with_operator(this);
		}
	}

	public final Unary_with_operatorContext unary_with_operator() throws RecognitionException {
		Unary_with_operatorContext _localctx = new Unary_with_operatorContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_unary_with_operator);
		int _la;
		try {
			setState(1922);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1902); match(PLUS);
				setState(1904);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1903); match(BLANK);
					}
				}

				setState(1906); unary();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1907); match(MINUS);
				setState(1909);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1908); match(BLANK);
					}
				}

				setState(1911); unary();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1912); match(TILDE);
				setState(1914);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1913); match(BLANK);
					}
				}

				setState(1916); unary();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 4);
				{
				setState(1917); match(BANG);
				setState(1919);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1918); match(BLANK);
					}
				}

				setState(1921); unary();
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
		public Unary_with_operatorContext unary_with_operator() {
			return getRuleContext(Unary_with_operatorContext.class,0);
		}
		public Post_inc_decContext post_inc_dec() {
			return getRuleContext(Post_inc_decContext.class,0);
		}
		public Pre_inc_decContext pre_inc_dec() {
			return getRuleContext(Pre_inc_decContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_unary);
		try {
			setState(1927);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924); post_inc_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1925); pre_inc_dec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1926); unary_with_operator();
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

	public static class ExponentialContext extends ParserRuleContext {
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<TerminalNode> EXP() { return getTokens(BashastParser.EXP); }
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public TerminalNode EXP(int i) {
			return getToken(BashastParser.EXP, i);
		}
		public ExponentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponential; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterExponential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitExponential(this);
		}
	}

	public final ExponentialContext exponential() throws RecognitionException {
		ExponentialContext _localctx = new ExponentialContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929); unary();
			setState(1937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXP) {
				{
				{
				setState(1930); match(EXP);
				setState(1932);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1931); match(BLANK);
					}
				}

				setState(1934); unary();
				}
				}
				setState(1939);
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

	public static class Times_division_modulusContext extends ParserRuleContext {
		public TerminalNode TIMES(int i) {
			return getToken(BashastParser.TIMES, i);
		}
		public TerminalNode SLASH(int i) {
			return getToken(BashastParser.SLASH, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(BashastParser.TIMES); }
		public ExponentialContext exponential(int i) {
			return getRuleContext(ExponentialContext.class,i);
		}
		public TerminalNode PCT(int i) {
			return getToken(BashastParser.PCT, i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<ExponentialContext> exponential() {
			return getRuleContexts(ExponentialContext.class);
		}
		public List<TerminalNode> PCT() { return getTokens(BashastParser.PCT); }
		public List<TerminalNode> SLASH() { return getTokens(BashastParser.SLASH); }
		public Times_division_modulusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times_division_modulus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterTimes_division_modulus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitTimes_division_modulus(this);
		}
	}

	public final Times_division_modulusContext times_division_modulus() throws RecognitionException {
		Times_division_modulusContext _localctx = new Times_division_modulusContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_times_division_modulus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940); exponential();
			setState(1948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << PCT) | (1L << SLASH))) != 0)) {
				{
				{
				setState(1941);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << PCT) | (1L << SLASH))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1943);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1942); match(BLANK);
					}
				}

				setState(1945); exponential();
				}
				}
				setState(1950);
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

	public static class AddsubContext extends ParserRuleContext {
		public TerminalNode MINUS(int i) {
			return getToken(BashastParser.MINUS, i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(BashastParser.MINUS); }
		public List<Times_division_modulusContext> times_division_modulus() {
			return getRuleContexts(Times_division_modulusContext.class);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<TerminalNode> PLUS() { return getTokens(BashastParser.PLUS); }
		public Times_division_modulusContext times_division_modulus(int i) {
			return getRuleContext(Times_division_modulusContext.class,i);
		}
		public TerminalNode PLUS(int i) {
			return getToken(BashastParser.PLUS, i);
		}
		public AddsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addsub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterAddsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitAddsub(this);
		}
	}

	public final AddsubContext addsub() throws RecognitionException {
		AddsubContext _localctx = new AddsubContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_addsub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951); times_division_modulus();
			setState(1959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(1952);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1954);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1953); match(BLANK);
					}
				}

				setState(1956); times_division_modulus();
				}
				}
				setState(1961);
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

	public static class ShiftsContext extends ParserRuleContext {
		public List<AddsubContext> addsub() {
			return getRuleContexts(AddsubContext.class);
		}
		public TerminalNode LSHIFT(int i) {
			return getToken(BashastParser.LSHIFT, i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public AddsubContext addsub(int i) {
			return getRuleContext(AddsubContext.class,i);
		}
		public TerminalNode RSHIFT(int i) {
			return getToken(BashastParser.RSHIFT, i);
		}
		public List<TerminalNode> RSHIFT() { return getTokens(BashastParser.RSHIFT); }
		public List<TerminalNode> LSHIFT() { return getTokens(BashastParser.LSHIFT); }
		public ShiftsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shifts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterShifts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitShifts(this);
		}
	}

	public final ShiftsContext shifts() throws RecognitionException {
		ShiftsContext _localctx = new ShiftsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_shifts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962); addsub();
			setState(1970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSHIFT || _la==RSHIFT) {
				{
				{
				setState(1963);
				_la = _input.LA(1);
				if ( !(_la==LSHIFT || _la==RSHIFT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1965);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1964); match(BLANK);
					}
				}

				setState(1967); addsub();
				}
				}
				setState(1972);
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

	public static class CompareContext extends ParserRuleContext {
		public List<ShiftsContext> shifts() {
			return getRuleContexts(ShiftsContext.class);
		}
		public TerminalNode BLANK() { return getToken(BashastParser.BLANK, 0); }
		public ShiftsContext shifts(int i) {
			return getRuleContext(ShiftsContext.class,i);
		}
		public Compare_operatorContext compare_operator() {
			return getRuleContext(Compare_operatorContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCompare(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973); shifts();
			setState(1980);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << EQUALS) | (1L << LESS_THAN) | (1L << GREATER_THAN))) != 0)) {
				{
				setState(1974); compare_operator();
				setState(1976);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1975); match(BLANK);
					}
				}

				setState(1978); shifts();
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

	public static class Compare_operatorContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(BashastParser.LESS_THAN, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(BashastParser.EQUALS); }
		public TerminalNode BANG() { return getToken(BashastParser.BANG, 0); }
		public TerminalNode GREATER_THAN() { return getToken(BashastParser.GREATER_THAN, 0); }
		public TerminalNode EQUALS(int i) {
			return getToken(BashastParser.EQUALS, i);
		}
		public Compare_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterCompare_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitCompare_operator(this);
		}
	}

	public final Compare_operatorContext compare_operator() throws RecognitionException {
		Compare_operatorContext _localctx = new Compare_operatorContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_compare_operator);
		try {
			setState(1992);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1982); match(LESS_THAN);
				setState(1983); match(EQUALS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1984); match(GREATER_THAN);
				setState(1985); match(EQUALS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1986); match(LESS_THAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1987); match(GREATER_THAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1988); match(EQUALS);
				setState(1989); match(EQUALS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1990); match(BANG);
				setState(1991); match(EQUALS);
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

	public static class BitwiseandContext extends ParserRuleContext {
		public List<CompareContext> compare() {
			return getRuleContexts(CompareContext.class);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode AMP(int i) {
			return getToken(BashastParser.AMP, i);
		}
		public List<TerminalNode> AMP() { return getTokens(BashastParser.AMP); }
		public CompareContext compare(int i) {
			return getRuleContext(CompareContext.class,i);
		}
		public BitwiseandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBitwiseand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBitwiseand(this);
		}
	}

	public final BitwiseandContext bitwiseand() throws RecognitionException {
		BitwiseandContext _localctx = new BitwiseandContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_bitwiseand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994); compare();
			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(1995); match(AMP);
				setState(1997);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(1996); match(BLANK);
					}
				}

				setState(1999); compare();
				}
				}
				setState(2004);
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

	public static class BitwisexorContext extends ParserRuleContext {
		public List<BitwiseandContext> bitwiseand() {
			return getRuleContexts(BitwiseandContext.class);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode CARET(int i) {
			return getToken(BashastParser.CARET, i);
		}
		public BitwiseandContext bitwiseand(int i) {
			return getRuleContext(BitwiseandContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(BashastParser.CARET); }
		public BitwisexorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwisexor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBitwisexor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBitwisexor(this);
		}
	}

	public final BitwisexorContext bitwisexor() throws RecognitionException {
		BitwisexorContext _localctx = new BitwisexorContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_bitwisexor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005); bitwiseand();
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(2006); match(CARET);
				setState(2008);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(2007); match(BLANK);
					}
				}

				setState(2010); bitwiseand();
				}
				}
				setState(2015);
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

	public static class BitwiseorContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(BashastParser.PIPE); }
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode PIPE(int i) {
			return getToken(BashastParser.PIPE, i);
		}
		public List<BitwisexorContext> bitwisexor() {
			return getRuleContexts(BitwisexorContext.class);
		}
		public BitwisexorContext bitwisexor(int i) {
			return getRuleContext(BitwisexorContext.class,i);
		}
		public BitwiseorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterBitwiseor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitBitwiseor(this);
		}
	}

	public final BitwiseorContext bitwiseor() throws RecognitionException {
		BitwiseorContext _localctx = new BitwiseorContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_bitwiseor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016); bitwisexor();
			setState(2024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(2017); match(PIPE);
				setState(2019);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(2018); match(BLANK);
					}
				}

				setState(2021); bitwisexor();
				}
				}
				setState(2026);
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

	public static class LogicandContext extends ParserRuleContext {
		public List<TerminalNode> LOGICAND() { return getTokens(BashastParser.LOGICAND); }
		public List<BitwiseorContext> bitwiseor() {
			return getRuleContexts(BitwiseorContext.class);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public TerminalNode LOGICAND(int i) {
			return getToken(BashastParser.LOGICAND, i);
		}
		public BitwiseorContext bitwiseor(int i) {
			return getRuleContext(BitwiseorContext.class,i);
		}
		public LogicandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterLogicand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitLogicand(this);
		}
	}

	public final LogicandContext logicand() throws RecognitionException {
		LogicandContext _localctx = new LogicandContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_logicand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027); bitwiseor();
			setState(2035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAND) {
				{
				{
				setState(2028); match(LOGICAND);
				setState(2030);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(2029); match(BLANK);
					}
				}

				setState(2032); bitwiseor();
				}
				}
				setState(2037);
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

	public static class LogicorContext extends ParserRuleContext {
		public LogicandContext logicand(int i) {
			return getRuleContext(LogicandContext.class,i);
		}
		public TerminalNode BLANK(int i) {
			return getToken(BashastParser.BLANK, i);
		}
		public List<LogicandContext> logicand() {
			return getRuleContexts(LogicandContext.class);
		}
		public List<TerminalNode> BLANK() { return getTokens(BashastParser.BLANK); }
		public List<TerminalNode> LOGICOR() { return getTokens(BashastParser.LOGICOR); }
		public TerminalNode LOGICOR(int i) {
			return getToken(BashastParser.LOGICOR, i);
		}
		public LogicorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).enterLogicor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashastListener ) ((BashastListener)listener).exitLogicor(this);
		}
	}

	public final LogicorContext logicor() throws RecognitionException {
		LogicorContext _localctx = new LogicorContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_logicor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038); logicand();
			setState(2046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICOR) {
				{
				{
				setState(2039); match(LOGICOR);
				setState(2041);
				_la = _input.LA(1);
				if (_la==BLANK) {
					{
					setState(2040); match(BLANK);
					}
				}

				setState(2043); logicand();
				}
				}
				setState(2048);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18: return here_document_end_sempred((Here_document_endContext)_localctx, predIndex);
		case 19: return here_document_content_sempred((Here_document_contentContext)_localctx, predIndex);
		case 22: return command_atom_sempred((Command_atomContext)_localctx, predIndex);
		case 23: return command_name_sempred((Command_nameContext)_localctx, predIndex);
		case 27: return array_value_sempred((Array_valueContext)_localctx, predIndex);
		case 29: return builtin_variable_definition_item_sempred((Builtin_variable_definition_itemContext)_localctx, predIndex);
		case 39: return for_each_value_sempred((For_each_valueContext)_localctx, predIndex);
		case 46: return case_body_sempred((Case_bodyContext)_localctx, predIndex);
		case 52: return condition_expr_sempred((Condition_exprContext)_localctx, predIndex);
		case 59: return bash_pattern_part_sempred((Bash_pattern_partContext)_localctx, predIndex);
		case 70: return builtin_logic_and_sempred((Builtin_logic_andContext)_localctx, predIndex);
		case 71: return builtin_logic_or_sempred((Builtin_logic_orContext)_localctx, predIndex);
		case 99: return parameter_expansion_sempred((Parameter_expansionContext)_localctx, predIndex);
		case 104: return parameter_pattern_part_sempred((Parameter_pattern_partContext)_localctx, predIndex);
		case 106: return parameter_expansion_value_atom_sempred((Parameter_expansion_value_atomContext)_localctx, predIndex);
		case 126: return arithmetic_assignment_operator_sempred((Arithmetic_assignment_operatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean builtin_logic_or_sempred(Builtin_logic_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15: return LA(1) == BLANK && LA(2) == MINUS && LA(3) == LETTER && "o".equals(get_string(LT(3)));
		}
		return true;
	}
	private boolean command_name_sempred(Command_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return LA(1) == GREATER_THAN;
		}
		return true;
	}
	private boolean parameter_pattern_part_sempred(Parameter_pattern_partContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return is_special_token(LA(1));
		}
		return true;
	}
	private boolean command_atom_sempred(Command_atomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return LA(1) == FOR|| LA(1) == SELECT|| LA(1) == IF|| LA(1) == WHILE|| LA(1) == UNTIL||
				 LA(1) == CASE|| LA(1) == LPAREN|| LA(1) == LBRACE|| LA(1) == LLPAREN|| LA(1) == LSQUARE||

				(LA(1) == NAME && LA(2) == BLANK && "test".equals(get_string(LT(1))));
		case 3: return LA(1) == NAME && LA(2) == BLANK && "function".equals(get_string(LT(1)));
		case 4: return LA(1) == BLANK &&
							(
								is_special_token(LA(2))
								// redirection
								&&(LA(2) != DIGIT || (LA(3) != AMP_LESS_THAN &&
													  LA(3) != AMP_GREATER_THAN &&
													  LA(3) != AMP_RSHIFT &&
													  LA(3) != GREATER_THAN &&
													  LA(3) != LESS_THAN &&
													  LA(3) != RSHIFT))
							);
		}
		return true;
	}
	private boolean case_body_sempred(Case_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return ((Case_bodyContext)getInvokingContext(46)).case_end;
		}
		return true;
	}
	private boolean builtin_variable_definition_item_sempred(Builtin_variable_definition_itemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return LA(1) == SEMIC && ((Builtin_variable_definition_itemContext)getInvokingContext(29)).dquotes;
		case 8: return LA(1) == EOL && ((Builtin_variable_definition_itemContext)getInvokingContext(29))._parens > 0 || ((Builtin_variable_definition_itemContext)getInvokingContext(29)).dquotes;
		}
		return true;
	}
	private boolean for_each_value_sempred(For_each_valueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return LA(1) == BLANK && LA(2) != EOL && LA(2) != SEMIC && LA(2) != DO;
		}
		return true;
	}
	private boolean bash_pattern_part_sempred(Bash_pattern_partContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return ((Bash_pattern_partContext)getInvokingContext(59)).quoted;
		case 13: return ((Bash_pattern_partContext)getInvokingContext(59))._parens != 0;
		}
		return true;
	}
	private boolean here_document_end_sempred(Here_document_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return  ((Here_documentContext)getInvokingContext(15)).number_of_tokens != 0 ;
		}
		return true;
	}
	private boolean here_document_content_sempred(Here_document_contentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return  is_here_end(((Here_documentContext)getInvokingContext(15)).here_document_word, ((Here_documentContext)getInvokingContext(15)).number_of_tokens);
		}
		return true;
	}
	private boolean parameter_expansion_sempred(Parameter_expansionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return LA(1) == POUND && LA(2) != RBRACE ;
		}
		return true;
	}
	private boolean condition_expr_sempred(Condition_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return LA(1) == NAME && LA(2) == BLANK && "test".equals(get_string(LT(1)));
		}
		return true;
	}
	private boolean parameter_expansion_value_atom_sempred(Parameter_expansion_value_atomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18: return ((Parameter_expansion_valueContext)getInvokingContext(105)).num_of_braces != 0;
		}
		return true;
	}
	private boolean builtin_logic_and_sempred(Builtin_logic_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14: return LA(1) == BLANK && LA(2) == MINUS && LA(3) == LETTER && "a".equals(get_string(LT(3)));
		}
		return true;
	}
	private boolean array_value_sempred(Array_valueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return ((Array_valueContext)getInvokingContext(27)).array_value_end;
		}
		return true;
	}
	private boolean arithmetic_assignment_operator_sempred(Arithmetic_assignment_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19: return LA(1) == EQUALS && LA(2) != EQUALS;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00b3\u0804\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\3\2\5\2\u0126\n\2\3\2\7\2\u0129\n\2\f\2\16\2\u012c\13\2\3\2\5\2\u012f"+
		"\n\2\3\2\3\2\5\2\u0133\n\2\3\2\5\2\u0136\n\2\3\2\3\2\3\3\3\3\7\3\u013c"+
		"\n\3\f\3\16\3\u013f\13\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u0147\n\5\3\5\3\5"+
		"\7\5\u014b\n\5\f\5\16\5\u014e\13\5\3\5\7\5\u0151\n\5\f\5\16\5\u0154\13"+
		"\5\3\6\3\6\5\6\u0158\n\6\3\6\3\6\5\6\u015c\n\6\3\6\7\6\u015f\n\6\f\6\16"+
		"\6\u0162\13\6\3\6\5\6\u0165\n\6\3\6\3\6\7\6\u0169\n\6\f\6\16\6\u016c\13"+
		"\6\3\7\3\7\3\b\5\b\u0171\n\b\3\b\3\b\5\b\u0175\n\b\3\b\3\b\5\b\u0179\n"+
		"\b\3\b\3\b\5\b\u017d\n\b\3\b\7\b\u0180\n\b\f\b\16\b\u0183\13\b\3\t\3\t"+
		"\3\t\5\t\u0188\n\t\3\n\3\n\3\n\3\n\3\13\6\13\u018f\n\13\r\13\16\13\u0190"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0199\n\f\3\r\3\r\5\r\u019d\n\r\3\r\3\r\7"+
		"\r\u01a1\n\r\f\r\16\r\u01a4\13\r\3\r\3\r\7\r\u01a8\n\r\f\r\16\r\u01ab"+
		"\13\r\3\r\3\r\3\16\5\16\u01b0\n\16\3\16\3\16\3\16\3\16\5\16\u01b6\n\16"+
		"\3\16\5\16\u01b9\n\16\3\17\3\17\3\17\5\17\u01be\n\17\3\20\5\20\u01c1\n"+
		"\20\3\20\3\20\5\20\u01c5\n\20\3\20\3\20\3\21\5\21\u01ca\n\21\3\21\3\21"+
		"\5\21\u01ce\n\21\3\21\3\21\5\21\u01d2\n\21\3\21\3\21\5\21\u01d6\n\21\3"+
		"\21\3\21\3\22\3\22\3\22\5\22\u01dd\n\22\3\23\3\23\6\23\u01e1\n\23\r\23"+
		"\16\23\u01e2\3\24\3\24\3\24\6\24\u01e8\n\24\r\24\16\24\u01e9\3\25\3\25"+
		"\6\25\u01ee\n\25\r\25\16\25\u01ef\3\26\3\26\3\26\3\26\5\26\u01f6\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0204"+
		"\n\26\5\26\u0206\n\26\3\27\3\27\3\27\5\27\u020b\n\27\3\27\3\27\5\27\u020f"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0218\n\30\3\30\3\30\5\30"+
		"\u021c\n\30\3\30\5\30\u021f\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0227"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0234"+
		"\n\30\3\30\3\30\5\30\u0238\n\30\3\30\3\30\3\30\3\30\3\30\7\30\u023f\n"+
		"\30\f\30\16\30\u0242\13\30\5\30\u0244\n\30\5\30\u0246\n\30\3\31\3\31\3"+
		"\31\5\31\u024b\n\31\3\32\3\32\3\32\7\32\u0250\n\32\f\32\16\32\u0253\13"+
		"\32\3\33\3\33\3\33\5\33\u0258\n\33\3\33\3\33\5\33\u025c\n\33\3\33\3\33"+
		"\3\33\5\33\u0261\n\33\3\33\3\33\3\33\5\33\u0266\n\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\7\33\u0271\n\33\f\33\16\33\u0274\13\33\5"+
		"\33\u0276\n\33\3\34\3\34\5\34\u027a\n\34\3\35\3\35\5\35\u027e\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0287\n\35\f\35\16\35\u028a\13\35"+
		"\5\35\u028c\n\35\3\36\3\36\5\36\u0290\n\36\3\36\3\36\5\36\u0294\n\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u029b\n\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u02a4\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\6\37\u02b1\n\37\r\37\16\37\u02b2\3 \3 \3 \7 \u02b8\n \f \16 \u02bb"+
		"\13 \3!\3!\3!\5!\u02c0\n!\3\"\3\"\3\"\7\"\u02c5\n\"\f\"\16\"\u02c8\13"+
		"\"\3#\6#\u02cb\n#\r#\16#\u02cc\3$\3$\5$\u02d1\n$\3$\3$\5$\u02d5\n$\3%"+
		"\3%\5%\u02d9\n%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02e7\n&\3\'\5"+
		"\'\u02ea\n\'\3\'\3\'\5\'\u02ee\n\'\3\'\5\'\u02f1\n\'\3\'\3\'\5\'\u02f5"+
		"\n\'\5\'\u02f7\n\'\3(\3(\5(\u02fb\n(\3(\3(\3(\3(\7(\u0301\n(\f(\16(\u0304"+
		"\13(\3(\5(\u0307\n(\3(\3(\5(\u030b\n(\3(\5(\u030e\n(\3(\3(\5(\u0312\n"+
		"(\3(\5(\u0315\n(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u031f\n(\3(\5(\u0322\n(\3"+
		"(\3(\5(\u0326\n(\3(\5(\u0329\n(\3(\3(\5(\u032d\n(\3(\3(\5(\u0331\n(\3"+
		"(\5(\u0334\n(\3(\3(\5(\u0338\n(\3(\5(\u033b\n(\3(\5(\u033e\n(\3(\5(\u0341"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u034c\n(\3)\3)\3)\3)\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\5*\u035a\n*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\7+\u036c\n+\f+\16+\u036f\13+\3+\3+\3+\3+\3+\5+\u0376\n+\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3-\3-\5-\u0385\n-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\5"+
		".\u0391\n.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\6\60\u03a8\n\60\r\60\16\60\u03a9\5\60\u03ac\n\60\3\61"+
		"\5\61\u03af\n\61\3\61\3\61\5\61\u03b3\n\61\5\61\u03b5\n\61\3\61\3\61\5"+
		"\61\u03b9\n\61\3\61\3\61\5\61\u03bd\n\61\3\61\7\61\u03c0\n\61\f\61\16"+
		"\61\u03c3\13\61\3\61\5\61\u03c6\n\61\3\61\3\61\3\61\3\61\5\61\u03cc\n"+
		"\61\3\61\5\61\u03cf\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u03d6\n\61\3\61"+
		"\3\61\3\61\3\61\5\61\u03dc\n\61\3\62\3\62\5\62\u03e0\n\62\3\62\3\62\5"+
		"\62\u03e4\n\62\3\62\5\62\u03e7\n\62\3\62\5\62\u03ea\n\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u03f6\n\64\3\64\3\64\5\64\u03fa"+
		"\n\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0412\n\66\3\66\5\66"+
		"\u0415\n\66\3\67\3\67\5\67\u0419\n\67\3\67\3\67\5\67\u041d\n\67\3\67\7"+
		"\67\u0420\n\67\f\67\16\67\u0423\13\67\38\38\58\u0427\n8\38\38\58\u042b"+
		"\n8\38\78\u042e\n8\f8\168\u0431\138\39\39\39\39\3:\3:\5:\u0439\n:\3:\3"+
		":\5:\u043d\n:\3:\3:\3:\3:\3:\5:\u0444\n:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\6<\u0459\n<\r<\16<\u045a\3<\3<\3<\3<\3<\3"+
		"<\6<\u0463\n<\r<\16<\u0464\3<\5<\u0468\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\6=\u0478\n=\r=\16=\u0479\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\5@\u0488\n@\3@\3@\5@\u048c\n@\3@\5@\u048f\n@\3@\3@\5@\u0493\n@\5"+
		"@\u0495\n@\3A\3A\3A\3A\3A\7A\u049c\nA\fA\16A\u049f\13A\3B\3B\3B\3B\3B"+
		"\7B\u04a6\nB\fB\16B\u04a9\13B\3C\3C\3C\3C\3D\3D\5D\u04b1\nD\3D\3D\5D\u04b5"+
		"\nD\3D\3D\3D\3D\3D\5D\u04bc\nD\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\5F\u04c8"+
		"\nF\3G\3G\3G\3G\3G\3G\3G\3G\5G\u04d2\nG\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I"+
		"\3J\3J\3J\3K\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\7O\u04ec\nO\fO\16O\u04ef\13"+
		"O\3P\3P\3P\5P\u04f4\nP\3Q\3Q\5Q\u04f8\nQ\3Q\7Q\u04fb\nQ\fQ\16Q\u04fe\13"+
		"Q\3Q\3Q\5Q\u0502\nQ\3Q\7Q\u0505\nQ\fQ\16Q\u0508\13Q\5Q\u050a\nQ\3R\3R"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0516\nS\3T\3T\5T\u051a\nT\3U\3U\7U\u051e"+
		"\nU\fU\16U\u0521\13U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0532"+
		"\nV\3W\6W\u0535\nW\rW\16W\u0536\3X\3X\5X\u053b\nX\3Y\3Y\5Y\u053f\nY\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0563\nZ\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\5[\u056f\n[\3[\5[\u0572\n[\3\\\3\\\3\\\3\\\3\\\7\\\u0579\n\\\f\\"+
		"\16\\\u057c\13\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u0585\n\\\f\\\16\\\u0588"+
		"\13\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u0591\n\\\f\\\16\\\u0594\13\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u059d\n\\\f\\\16\\\u05a0\13\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\7\\\u05a9\n\\\f\\\16\\\u05ac\13\\\3\\\3\\\3\\\3\\\3"+
		"\\\5\\\u05b3\n\\\3]\6]\u05b6\n]\r]\16]\u05b7\3^\3^\3^\3^\3^\3^\3^\5^\u05c1"+
		"\n^\3_\3_\3_\5_\u05c6\n_\3`\3`\5`\u05ca\n`\3a\6a\u05cd\na\ra\16a\u05ce"+
		"\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u05e1\nb\3c\3c\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d"+
		"\u05fc\nd\3e\3e\3e\3e\3e\3e\5e\u0604\ne\3e\3e\3e\5e\u0609\ne\3e\5e\u060c"+
		"\ne\3e\3e\5e\u0610\ne\3e\5e\u0613\ne\3e\3e\3e\3e\3e\3e\3e\5e\u061c\ne"+
		"\3e\5e\u061f\ne\5e\u0621\ne\3e\3e\3e\3e\3e\3e\3e\5e\u062a\ne\3e\5e\u062d"+
		"\ne\3e\3e\5e\u0631\ne\3f\3f\3f\3f\3f\5f\u0638\nf\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\5g\u0646\ng\3h\3h\6h\u064a\nh\rh\16h\u064b\5h\u064e\n"+
		"h\3i\6i\u0651\ni\ri\16i\u0652\3j\3j\3j\5j\u0658\nj\3k\3k\3l\3l\3l\3l\6"+
		"l\u0660\nl\rl\16l\u0661\3l\5l\u0665\nl\3m\3m\3m\3m\3m\3m\3m\5m\u066e\n"+
		"m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0683\n"+
		"n\3o\3o\3o\5o\u0688\no\3o\3o\5o\u068c\no\3o\3o\3o\5o\u0691\no\3p\3p\3"+
		"p\5p\u0696\np\3q\3q\3q\3q\3q\3q\3q\3q\5q\u06a0\nq\3r\6r\u06a3\nr\rr\16"+
		"r\u06a4\3r\5r\u06a8\nr\3s\6s\u06ab\ns\rs\16s\u06ac\3t\3t\3u\3u\7u\u06b3"+
		"\nu\fu\16u\u06b6\13u\3u\3u\7u\u06ba\nu\fu\16u\u06bd\13u\3u\3u\3v\3v\5"+
		"v\u06c3\nv\3w\3w\3w\3w\3w\3w\5w\u06cb\nw\3x\7x\u06ce\nx\fx\16x\u06d1\13"+
		"x\3y\3y\3y\6y\u06d6\ny\ry\16y\u06d7\3z\3z\5z\u06dc\nz\3{\3{\3|\3|\3|\5"+
		"|\u06e3\n|\3|\3|\5|\u06e7\n|\3|\3|\3|\3|\3|\3|\5|\u06ef\n|\3|\3|\5|\u06f3"+
		"\n|\3|\3|\5|\u06f7\n|\3}\3}\3}\5}\u06fc\n}\3}\7}\u06ff\n}\f}\16}\u0702"+
		"\13}\3~\3~\3~\3\177\3\177\5\177\u0709\n\177\3\177\3\177\5\177\u070d\n"+
		"\177\3\177\3\177\3\177\3\177\5\177\u0713\n\177\3\177\3\177\5\177\u0717"+
		"\n\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0722"+
		"\n\177\5\177\u0724\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u073c"+
		"\n\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u0749\n\u0082\3\u0083\5\u0083\u074c\n"+
		"\u0083\3\u0083\3\u0083\5\u0083\u0750\n\u0083\3\u0084\3\u0084\5\u0084\u0754"+
		"\n\u0084\3\u0084\5\u0084\u0757\n\u0084\3\u0084\3\u0084\3\u0084\5\u0084"+
		"\u075c\n\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0761\n\u0084\3\u0085\3"+
		"\u0085\3\u0085\5\u0085\u0766\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5"+
		"\u0085\u076c\n\u0085\3\u0085\5\u0085\u076f\n\u0085\3\u0086\3\u0086\5\u0086"+
		"\u0773\n\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0778\n\u0086\3\u0086\3"+
		"\u0086\3\u0086\5\u0086\u077d\n\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0782"+
		"\n\u0086\3\u0086\5\u0086\u0785\n\u0086\3\u0087\3\u0087\3\u0087\5\u0087"+
		"\u078a\n\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u078f\n\u0088\3\u0088\7"+
		"\u0088\u0792\n\u0088\f\u0088\16\u0088\u0795\13\u0088\3\u0089\3\u0089\3"+
		"\u0089\5\u0089\u079a\n\u0089\3\u0089\7\u0089\u079d\n\u0089\f\u0089\16"+
		"\u0089\u07a0\13\u0089\3\u008a\3\u008a\3\u008a\5\u008a\u07a5\n\u008a\3"+
		"\u008a\7\u008a\u07a8\n\u008a\f\u008a\16\u008a\u07ab\13\u008a\3\u008b\3"+
		"\u008b\3\u008b\5\u008b\u07b0\n\u008b\3\u008b\7\u008b\u07b3\n\u008b\f\u008b"+
		"\16\u008b\u07b6\13\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u07bb\n\u008c"+
		"\3\u008c\3\u008c\5\u008c\u07bf\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u07cb\n\u008d"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u07d0\n\u008e\3\u008e\7\u008e\u07d3\n"+
		"\u008e\f\u008e\16\u008e\u07d6\13\u008e\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u07db\n\u008f\3\u008f\7\u008f\u07de\n\u008f\f\u008f\16\u008f\u07e1\13"+
		"\u008f\3\u0090\3\u0090\3\u0090\5\u0090\u07e6\n\u0090\3\u0090\7\u0090\u07e9"+
		"\n\u0090\f\u0090\16\u0090\u07ec\13\u0090\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u07f1\n\u0091\3\u0091\7\u0091\u07f4\n\u0091\f\u0091\16\u0091\u07f7\13"+
		"\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u07fc\n\u0092\3\u0092\7\u0092\u07ff"+
		"\n\u0092\f\u0092\16\u0092\u0802\13\u0092\3\u0092\2\2\u0093\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\2\23\5\2%%..88\3\288\3\2GH\3\2\678\6\2\'(*-\678==\4\2..88\6\2\26"+
		"\30\63\63\678GH\3\2\63\63\4\2;;UV\3\29:\4\2\5\22\25\25\23\2\4\4\23\24"+
		"\26\27\31\36  \"#%%\'(+.\60\60\63\64\66\6699;;>?ACWW\4\2\35\35  \3\2P"+
		"Q\5\2  ??AA\3\2\"#\3\2)*\u0926\2\u0125\3\2\2\2\4\u0139\3\2\2\2\6\u0142"+
		"\3\2\2\2\b\u0144\3\2\2\2\n\u0155\3\2\2\2\f\u016d\3\2\2\2\16\u0170\3\2"+
		"\2\2\20\u0184\3\2\2\2\22\u0189\3\2\2\2\24\u018e\3\2\2\2\26\u0198\3\2\2"+
		"\2\30\u019c\3\2\2\2\32\u01b8\3\2\2\2\34\u01bd\3\2\2\2\36\u01c0\3\2\2\2"+
		" \u01c9\3\2\2\2\"\u01d9\3\2\2\2$\u01e0\3\2\2\2&\u01e7\3\2\2\2(\u01ed\3"+
		"\2\2\2*\u0205\3\2\2\2,\u0207\3\2\2\2.\u0245\3\2\2\2\60\u024a\3\2\2\2\62"+
		"\u024c\3\2\2\2\64\u0275\3\2\2\2\66\u0279\3\2\2\28\u027b\3\2\2\2:\u029a"+
		"\3\2\2\2<\u02b0\3\2\2\2>\u02b4\3\2\2\2@\u02bf\3\2\2\2B\u02c1\3\2\2\2D"+
		"\u02ca\3\2\2\2F\u02d4\3\2\2\2H\u02d6\3\2\2\2J\u02e6\3\2\2\2L\u02f6\3\2"+
		"\2\2N\u02f8\3\2\2\2P\u034d\3\2\2\2R\u0351\3\2\2\2T\u0362\3\2\2\2V\u0379"+
		"\3\2\2\2X\u0382\3\2\2\2Z\u038e\3\2\2\2\\\u039a\3\2\2\2^\u03a1\3\2\2\2"+
		"`\u03ae\3\2\2\2b\u03dd\3\2\2\2d\u03ed\3\2\2\2f\u03f3\3\2\2\2h\u03fe\3"+
		"\2\2\2j\u0414\3\2\2\2l\u0416\3\2\2\2n\u0424\3\2\2\2p\u0432\3\2\2\2r\u0443"+
		"\3\2\2\2t\u0445\3\2\2\2v\u0449\3\2\2\2x\u0477\3\2\2\2z\u047b\3\2\2\2|"+
		"\u047d\3\2\2\2~\u0494\3\2\2\2\u0080\u0496\3\2\2\2\u0082\u04a0\3\2\2\2"+
		"\u0084\u04aa\3\2\2\2\u0086\u04bb\3\2\2\2\u0088\u04bd\3\2\2\2\u008a\u04c1"+
		"\3\2\2\2\u008c\u04d1\3\2\2\2\u008e\u04d3\3\2\2\2\u0090\u04d8\3\2\2\2\u0092"+
		"\u04dd\3\2\2\2\u0094\u04e0\3\2\2\2\u0096\u04e3\3\2\2\2\u0098\u04e5\3\2"+
		"\2\2\u009a\u04e7\3\2\2\2\u009c\u04e9\3\2\2\2\u009e\u04f3\3\2\2\2\u00a0"+
		"\u0509\3\2\2\2\u00a2\u050b\3\2\2\2\u00a4\u0515\3\2\2\2\u00a6\u0519\3\2"+
		"\2\2\u00a8\u051b\3\2\2\2\u00aa\u0531\3\2\2\2\u00ac\u0534\3\2\2\2\u00ae"+
		"\u053a\3\2\2\2\u00b0\u053e\3\2\2\2\u00b2\u0562\3\2\2\2\u00b4\u0564\3\2"+
		"\2\2\u00b6\u05b2\3\2\2\2\u00b8\u05b5\3\2\2\2\u00ba\u05c0\3\2\2\2\u00bc"+
		"\u05c5\3\2\2\2\u00be\u05c9\3\2\2\2\u00c0\u05cc\3\2\2\2\u00c2\u05e0\3\2"+
		"\2\2\u00c4\u05e2\3\2\2\2\u00c6\u05fb\3\2\2\2\u00c8\u0630\3\2\2\2\u00ca"+
		"\u0637\3\2\2\2\u00cc\u0645\3\2\2\2\u00ce\u064d\3\2\2\2\u00d0\u0650\3\2"+
		"\2\2\u00d2\u0657\3\2\2\2\u00d4\u0659\3\2\2\2\u00d6\u0664\3\2\2\2\u00d8"+
		"\u066d\3\2\2\2\u00da\u0682\3\2\2\2\u00dc\u0690\3\2\2\2\u00de\u0695\3\2"+
		"\2\2\u00e0\u069f\3\2\2\2\u00e2\u06a7\3\2\2\2\u00e4\u06aa\3\2\2\2\u00e6"+
		"\u06ae\3\2\2\2\u00e8\u06b0\3\2\2\2\u00ea\u06c2\3\2\2\2\u00ec\u06ca\3\2"+
		"\2\2\u00ee\u06cf\3\2\2\2\u00f0\u06d2\3\2\2\2\u00f2\u06db\3\2\2\2\u00f4"+
		"\u06dd\3\2\2\2\u00f6\u06f6\3\2\2\2\u00f8\u06f8\3\2\2\2\u00fa\u0703\3\2"+
		"\2\2\u00fc\u0723\3\2\2\2\u00fe\u073b\3\2\2\2\u0100\u073d\3\2\2\2\u0102"+
		"\u0748\3\2\2\2\u0104\u074b\3\2\2\2\u0106\u0751\3\2\2\2\u0108\u076e\3\2"+
		"\2\2\u010a\u0784\3\2\2\2\u010c\u0789\3\2\2\2\u010e\u078b\3\2\2\2\u0110"+
		"\u0796\3\2\2\2\u0112\u07a1\3\2\2\2\u0114\u07ac\3\2\2\2\u0116\u07b7\3\2"+
		"\2\2\u0118\u07ca\3\2\2\2\u011a\u07cc\3\2\2\2\u011c\u07d7\3\2\2\2\u011e"+
		"\u07e2\3\2\2\2\u0120\u07ed\3\2\2\2\u0122\u07f8\3\2\2\2\u0124\u0126\5\4"+
		"\3\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012a\3\2\2\2\u0127"+
		"\u0129\78\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u012f\7\67\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u0132\5\6\4\2\u0131\u0133\7\67\2\2\u0132\u0131\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0136\t\2\2\2\u0135\u0134\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\2\2\3\u0138"+
		"\3\3\2\2\2\u0139\u013d\7>\2\2\u013a\u013c\n\3\2\2\u013b\u013a\3\2\2\2"+
		"\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\78\2\2\u0141\5\3\2\2\2\u0142"+
		"\u0143\5\n\6\2\u0143\7\3\2\2\2\u0144\u0152\5\16\b\2\u0145\u0147\7\67\2"+
		"\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014c"+
		"\t\4\2\2\u0149\u014b\t\5\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014f\u0151\5\16\b\2\u0150\u0146\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\t\3\2\2\2\u0154\u0152\3\2\2\2"+
		"\u0155\u016a\5\b\5\2\u0156\u0158\7\67\2\2\u0157\u0156\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0160\5\f\7\2\u015a\u015c\7\67\2\2"+
		"\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f"+
		"\78\2\2\u015e\u015b\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0165\7\67"+
		"\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\5\b\5\2\u0167\u0169\3\2\2\2\u0168\u0157\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\13\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u016e\t\2\2\2\u016e\r\3\2\2\2\u016f\u0171\5\20\t\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0173\7\4"+
		"\2\2\u0173\u0175\7\67\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0181\5,\27\2\u0177\u0179\7\67\2\2\u0178\u0177\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\7\60\2\2\u017b"+
		"\u017d\5\u00e4s\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u0180\5,\27\2\u017f\u0178\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\17\3\2\2\2\u0183\u0181\3\2\2"+
		"\2\u0184\u0185\7\25\2\2\u0185\u0187\7\67\2\2\u0186\u0188\5\22\n\2\u0187"+
		"\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\21\3\2\2\2\u0189\u018a\7\"\2"+
		"\2\u018a\u018b\7;\2\2\u018b\u018c\7\67\2\2\u018c\23\3\2\2\2\u018d\u018f"+
		"\5\26\f\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2"+
		"\u0190\u0191\3\2\2\2\u0191\25\3\2\2\2\u0192\u0193\5*\26\2\u0193\u0194"+
		"\5\32\16\2\u0194\u0199\3\2\2\2\u0195\u0196\7\67\2\2\u0196\u0199\5\30\r"+
		"\2\u0197\u0199\5\36\20\2\u0198\u0192\3\2\2\2\u0198\u0195\3\2\2\2\u0198"+
		"\u0197\3\2\2\2\u0199\27\3\2\2\2\u019a\u019d\7\'\2\2\u019b\u019d\7(\2\2"+
		"\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a2"+
		"\7\27\2\2\u019f\u01a1\7\67\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2"+
		"\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2"+
		"\3\2\2\2\u01a5\u01a9\5\6\4\2\u01a6\u01a8\7\67\2\2\u01a7\u01a6\3\2\2\2"+
		"\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\26\2\2\u01ad\31\3\2\2\2\u01ae"+
		"\u01b0\7\67\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3"+
		"\2\2\2\u01b1\u01b9\5\34\17\2\u01b2\u01b3\7\67\2\2\u01b3\u01b9\5\30\r\2"+
		"\u01b4\u01b6\7\67\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b9\5\u009cO\2\u01b8\u01af\3\2\2\2\u01b8\u01b2\3\2\2"+
		"\2\u01b8\u01b5\3\2\2\2\u01b9\33\3\2\2\2\u01ba\u01be\79\2\2\u01bb\u01bc"+
		"\79\2\2\u01bc\u01be\7\"\2\2\u01bd\u01ba\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\35\3\2\2\2\u01bf\u01c1\7\67\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2"+
		"\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\7=\2\2\u01c3\u01c5\7\67\2\2\u01c4\u01c3"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\5\u009cO"+
		"\2\u01c7\37\3\2\2\2\u01c8\u01ca\7\67\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\5\"\22\2\u01cc\u01ce\7\67\2\2"+
		"\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1"+
		"\5$\23\2\u01d0\u01d2\5\24\13\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2"+
		"\u01d2\u01d3\3\2\2\2\u01d3\u01d5\78\2\2\u01d4\u01d6\5(\25\2\u01d5\u01d4"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\5&\24\2\u01d8"+
		"!\3\2\2\2\u01d9\u01dc\7)\2\2\u01da\u01dd\7\"\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd#\3\2\2\2\u01de\u01df\n\6\2\2"+
		"\u01df\u01e1\b\23\1\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3%\3\2\2\2\u01e4\u01e5\6\24\2\3\u01e5"+
		"\u01e6\13\2\2\2\u01e6\u01e8\b\24\1\2\u01e7\u01e4\3\2\2\2\u01e8\u01e9\3"+
		"\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\'\3\2\2\2\u01eb\u01ec"+
		"\6\25\3\3\u01ec\u01ee\13\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\3\2\2\2"+
		"\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0)\3\2\2\2\u01f1\u01f2\7"+
		"\67\2\2\u01f2\u01f3\79\2\2\u01f3\u0206\5*\26\2\u01f4\u01f6\7\67\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0203\3\2\2\2\u01f7\u0204\7+"+
		"\2\2\u01f8\u01f9\7(\2\2\u01f9\u0204\7%\2\2\u01fa\u01fb\7\'\2\2\u01fb\u0204"+
		"\7%\2\2\u01fc\u01fd\7\'\2\2\u01fd\u0204\7(\2\2\u01fe\u0204\7*\2\2\u01ff"+
		"\u0204\7,\2\2\u0200\u0204\7-\2\2\u0201\u0204\7\'\2\2\u0202\u0204\7(\2"+
		"\2\u0203\u01f7\3\2\2\2\u0203\u01f8\3\2\2\2\u0203\u01fa\3\2\2\2\u0203\u01fc"+
		"\3\2\2\2\u0203\u01fe\3\2\2\2\u0203\u01ff\3\2\2\2\u0203\u0200\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u01f1\3\2"+
		"\2\2\u0205\u01f5\3\2\2\2\u0206+\3\2\2\2\u0207\u020e\5.\30\2\u0208\u020a"+
		"\5\24\13\2\u0209\u020b\5 \21\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2"+
		"\u020b\u020f\3\2\2\2\u020c\u020f\5 \21\2\u020d\u020f\3\2\2\2\u020e\u0208"+
		"\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f-\3\2\2\2\u0210"+
		"\u0211\6\30\4\2\u0211\u0246\5J&\2\u0212\u0213\6\30\5\2\u0213\u0214\7V"+
		"\2\2\u0214\u0215\7\67\2\2\u0215\u021e\5\u00a0Q\2\u0216\u0218\7\67\2\2"+
		"\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b"+
		"\5H%\2\u021a\u021c\5\u00e4s\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2"+
		"\u021c\u021f\3\2\2\2\u021d\u021f\5\u00e4s\2\u021e\u0217\3\2\2\2\u021e"+
		"\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\5J&\2\u0221\u0246\3\2\2"+
		"\2\u0222\u0226\5\62\32\2\u0223\u0224\7\67\2\2\u0224\u0227\5B\"\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0223\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u0246\3\2"+
		"\2\2\u0228\u0229\7E\2\2\u0229\u022a\7\67\2\2\u022a\u0246\5<\37\2\u022b"+
		"\u022c\7D\2\2\u022c\u022d\7\67\2\2\u022d\u0246\5<\37\2\u022e\u022f\7F"+
		"\2\2\u022f\u0230\7\67\2\2\u0230\u0246\5<\37\2\u0231\u0243\5\60\31\2\u0232"+
		"\u0234\7\67\2\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3"+
		"\2\2\2\u0235\u0237\5H%\2\u0236\u0238\5\u00e4s\2\u0237\u0236\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\5J&\2\u023a\u0244\3\2\2"+
		"\2\u023b\u023c\6\30\6\2\u023c\u023d\7\67\2\2\u023d\u023f\5D#\2\u023e\u023b"+
		"\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0233\3\2\2\2\u0243\u0240\3\2"+
		"\2\2\u0244\u0246\3\2\2\2\u0245\u0210\3\2\2\2\u0245\u0212\3\2\2\2\u0245"+
		"\u0222\3\2\2\2\u0245\u0228\3\2\2\2\u0245\u022b\3\2\2\2\u0245\u022e\3\2"+
		"\2\2\u0245\u0231\3\2\2\2\u0246/\3\2\2\2\u0247\u024b\5\u00a0Q\2\u0248\u0249"+
		"\6\31\7\2\u0249\u024b\5\26\f\2\u024a\u0247\3\2\2\2\u024a\u0248\3\2\2\2"+
		"\u024b\61\3\2\2\2\u024c\u0251\5\64\33\2\u024d\u024e\7\67\2\2\u024e\u0250"+
		"\5\64\33\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2"+
		"\u0251\u0252\3\2\2\2\u0252\63\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0255"+
		"\5\u0098M\2\u0255\u0257\7\31\2\2\u0256\u0258\7\67\2\2\u0257\u0256\3\2"+
		"\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\5\u00f2z\2\u025a"+
		"\u025c\7\67\2\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3"+
		"\2\2\2\u025d\u025e\7\32\2\2\u025e\u0260\7!\2\2\u025f\u0261\5\u009cO\2"+
		"\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0276\3\2\2\2\u0262\u0263"+
		"\5\u0098M\2\u0263\u0265\7!\2\2\u0264\u0266\5\66\34\2\u0265\u0264\3\2\2"+
		"\2\u0265\u0266\3\2\2\2\u0266\u0276\3\2\2\2\u0267\u0268\5\u0098M\2\u0268"+
		"\u0269\7#\2\2\u0269\u026a\7!\2\2\u026a\u026b\58\35\2\u026b\u0276\3\2\2"+
		"\2\u026c\u026d\5\u0098M\2\u026d\u026e\7#\2\2\u026e\u0272\7!\2\2\u026f"+
		"\u0271\5\u009eP\2\u0270\u026f\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0254\3\2\2\2\u0275\u0262\3\2\2\2\u0275\u0267\3\2\2\2\u0275\u026c\3\2"+
		"\2\2\u0276\65\3\2\2\2\u0277\u027a\5\u009cO\2\u0278\u027a\58\35\2\u0279"+
		"\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027a\67\3\2\2\2\u027b\u027d\7\27\2"+
		"\2\u027c\u027e\5\u00e4s\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u028b\3\2\2\2\u027f\u028c\7\26\2\2\u0280\u0281\b\35\1\2\u0281\u0288\5"+
		":\36\2\u0282\u0283\6\35\b\3\u0283\u0284\5\u00e4s\2\u0284\u0285\5:\36\2"+
		"\u0285\u0287\3\2\2\2\u0286\u0282\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286"+
		"\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028b"+
		"\u027f\3\2\2\2\u028b\u0280\3\2\2\2\u028c9\3\2\2\2\u028d\u028f\7\31\2\2"+
		"\u028e\u0290\7\67\2\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291"+
		"\3\2\2\2\u0291\u0293\5\u00f2z\2\u0292\u0294\7\67\2\2\u0293\u0292\3\2\2"+
		"\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7\32\2\2\u0296"+
		"\u0297\7!\2\2\u0297\u0298\5\u009cO\2\u0298\u029b\3\2\2\2\u0299\u029b\5"+
		"\u009cO\2\u029a\u028d\3\2\2\2\u029a\u0299\3\2\2\2\u029b\u02a3\3\2\2\2"+
		"\u029c\u029d\5\u00e4s\2\u029d\u029e\7\26\2\2\u029e\u029f\b\36\1\2\u029f"+
		"\u02a4\3\2\2\2\u02a0\u02a1\7\26\2\2\u02a1\u02a4\b\36\1\2\u02a2\u02a4\3"+
		"\2\2\2\u02a3\u029c\3\2\2\2\u02a3\u02a0\3\2\2\2\u02a3\u02a2\3\2\2\2\u02a4"+
		";\3\2\2\2\u02a5\u02a6\7\27\2\2\u02a6\u02b1\b\37\1\2\u02a7\u02a8\7\26\2"+
		"\2\u02a8\u02b1\b\37\1\2\u02a9\u02aa\7\63\2\2\u02aa\u02b1\b\37\1\2\u02ab"+
		"\u02b1\5\u00aaV\2\u02ac\u02ad\6\37\t\3\u02ad\u02b1\7.\2\2\u02ae\u02af"+
		"\6\37\n\3\u02af\u02b1\78\2\2\u02b0\u02a5\3\2\2\2\u02b0\u02a7\3\2\2\2\u02b0"+
		"\u02a9\3\2\2\2\u02b0\u02ab\3\2\2\2\u02b0\u02ac\3\2\2\2\u02b0\u02ae\3\2"+
		"\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"=\3\2\2\2\u02b4\u02b9\5@!\2\u02b5\u02b6\7\67\2\2\u02b6\u02b8\5@!\2\u02b7"+
		"\u02b5\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba?\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02c0\5\64\33\2\u02bd\u02be"+
		"\7\"\2\2\u02be\u02c0\7;\2\2\u02bf\u02bc\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0"+
		"A\3\2\2\2\u02c1\u02c6\5\u00a0Q\2\u02c2\u02c3\7\67\2\2\u02c3\u02c5\5D#"+
		"\2\u02c4\u02c2\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7C\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cb\5F$\2\u02ca\u02c9"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"E\3\2\2\2\u02ce\u02d1\5\u00e8u\2\u02cf\u02d1\7\23\2\2\u02d0\u02ce\3\2"+
		"\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d5\3\2\2\2\u02d2\u02d5\7\24\2\2\u02d3"+
		"\u02d5\5\u009eP\2\u02d4\u02d0\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3"+
		"\3\2\2\2\u02d5G\3\2\2\2\u02d6\u02d8\7\27\2\2\u02d7\u02d9\7\67\2\2\u02d8"+
		"\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\7\26"+
		"\2\2\u02dbI\3\2\2\2\u02dc\u02e7\5N(\2\u02dd\u02e7\5R*\2\u02de\u02e7\5"+
		"T+\2\u02df\u02e7\5X-\2\u02e0\u02e7\5Z.\2\u02e1\u02e7\5\\/\2\u02e2\u02e7"+
		"\5b\62\2\u02e3\u02e7\5d\63\2\u02e4\u02e7\5f\64\2\u02e5\u02e7\5h\65\2\u02e6"+
		"\u02dc\3\2\2\2\u02e6\u02dd\3\2\2\2\u02e6\u02de\3\2\2\2\u02e6\u02df\3\2"+
		"\2\2\u02e6\u02e0\3\2\2\2\u02e6\u02e1\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e6"+
		"\u02e3\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7K\3\2\2\2"+
		"\u02e8\u02ea\7\67\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02eb\u02ed\7.\2\2\u02ec\u02ee\5\u00e4s\2\u02ed\u02ec\3\2\2\2"+
		"\u02ed\u02ee\3\2\2\2\u02ee\u02f7\3\2\2\2\u02ef\u02f1\7\67\2\2\u02f0\u02ef"+
		"\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\78\2\2\u02f3"+
		"\u02f5\5\u00e4s\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7"+
		"\3\2\2\2\u02f6\u02e9\3\2\2\2\u02f6\u02f0\3\2\2\2\u02f7M\3\2\2\2\u02f8"+
		"\u02fa\7\f\2\2\u02f9\u02fb\7\67\2\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3"+
		"\2\2\2\u02fb\u034b\3\2\2\2\u02fc\u0314\5\u0098M\2\u02fd\u02fe\5\u00e4"+
		"s\2\u02fe\u0302\7\16\2\2\u02ff\u0301\5P)\2\u0300\u02ff\3\2\2\2\u0301\u0304"+
		"\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0306\3\2\2\2\u0304"+
		"\u0302\3\2\2\2\u0305\u0307\7\67\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3"+
		"\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a\t\7\2\2\u0309\u030b\5\u00e4s\2"+
		"\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0315\3\2\2\2\u030c\u030e"+
		"\5\u00e4s\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2"+
		"\2\u030f\u0311\7.\2\2\u0310\u0312\5\u00e4s\2\u0311\u0310\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0315\5\u00e4s\2\u0314\u02fd"+
		"\3\2\2\2\u0314\u030d\3\2\2\2\u0314\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0317\7\6\2\2\u0317\u0318\5\u00e4s\2\u0318\u0319\5\6\4\2\u0319\u031a"+
		"\5L\'\2\u031a\u031b\7\7\2\2\u031b\u034c\3\2\2\2\u031c\u031e\7\30\2\2\u031d"+
		"\u031f\78\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0328\3\2"+
		"\2\2\u0320\u0322\7\67\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0325\5\u00f8}\2\u0324\u0326\7\67\2\2\u0325\u0324"+
		"\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0329\7\67\2\2"+
		"\u0328\u0321\3\2\2\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u0337"+
		"\3\2\2\2\u032a\u0333\7.\2\2\u032b\u032d\7\67\2\2\u032c\u032b\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\5\u00f8}\2\u032f\u0331"+
		"\7\67\2\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0334\3\2\2\2"+
		"\u0332\u0334\7\67\2\2\u0333\u032c\3\2\2\2\u0333\u0332\3\2\2\2\u0333\u0334"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0338\7.\2\2\u0336\u0338\7/\2\2\u0337"+
		"\u032a\3\2\2\2\u0337\u0336\3\2\2\2\u0338\u033d\3\2\2\2\u0339\u033b\7\67"+
		"\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u033e\5\u00f8}\2\u033d\u033a\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340"+
		"\3\2\2\2\u033f\u0341\5\u00e4s\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2"+
		"\2\u0341\u0342\3\2\2\2\u0342\u0343\7\26\2\2\u0343\u0344\7\26\2\2\u0344"+
		"\u0345\5L\'\2\u0345\u0346\7\6\2\2\u0346\u0347\5\u00e4s\2\u0347\u0348\5"+
		"\6\4\2\u0348\u0349\5L\'\2\u0349\u034a\7\7\2\2\u034a\u034c\3\2\2\2\u034b"+
		"\u02fc\3\2\2\2\u034b\u031c\3\2\2\2\u034cO\3\2\2\2\u034d\u034e\6)\13\2"+
		"\u034e\u034f\7\67\2\2\u034f\u0350\5\u009cO\2\u0350Q\3\2\2\2\u0351\u0352"+
		"\7\17\2\2\u0352\u0353\7\67\2\2\u0353\u0359\5\u0098M\2\u0354\u0355\5\u00e4"+
		"s\2\u0355\u0356\7\16\2\2\u0356\u0357\7\67\2\2\u0357\u0358\5\u009cO\2\u0358"+
		"\u035a\3\2\2\2\u0359\u0354\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2"+
		"\2\2\u035b\u035c\5L\'\2\u035c\u035d\7\6\2\2\u035d\u035e\5\u00e4s\2\u035e"+
		"\u035f\5\6\4\2\u035f\u0360\5L\'\2\u0360\u0361\7\7\2\2\u0361S\3\2\2\2\u0362"+
		"\u0363\7\r\2\2\u0363\u0364\5\u00e4s\2\u0364\u0365\5\6\4\2\u0365\u0366"+
		"\5L\'\2\u0366\u0367\7\20\2\2\u0367\u0368\5\u00e4s\2\u0368\u0369\5\6\4"+
		"\2\u0369\u036d\5L\'\2\u036a\u036c\5V,\2\u036b\u036a\3\2\2\2\u036c\u036f"+
		"\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0375\3\2\2\2\u036f"+
		"\u036d\3\2\2\2\u0370\u0371\7\t\2\2\u0371\u0372\5\u00e4s\2\u0372\u0373"+
		"\5\6\4\2\u0373\u0374\5L\'\2\u0374\u0376\3\2\2\2\u0375\u0370\3\2\2\2\u0375"+
		"\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\7\13\2\2\u0378U\3\2\2\2"+
		"\u0379\u037a\7\b\2\2\u037a\u037b\7\67\2\2\u037b\u037c\5\6\4\2\u037c\u037d"+
		"\5L\'\2\u037d\u037e\7\20\2\2\u037e\u037f\5\u00e4s\2\u037f\u0380\5\6\4"+
		"\2\u0380\u0381\5L\'\2\u0381W\3\2\2\2\u0382\u0384\7\22\2\2\u0383\u0385"+
		"\5\u00e4s\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\3\2\2"+
		"\2\u0386\u0387\5\6\4\2\u0387\u0388\5L\'\2\u0388\u0389\7\6\2\2\u0389\u038a"+
		"\5\u00e4s\2\u038a\u038b\5\6\4\2\u038b\u038c\5L\'\2\u038c\u038d\7\7\2\2"+
		"\u038dY\3\2\2\2\u038e\u0390\7\21\2\2\u038f\u0391\5\u00e4s\2\u0390\u038f"+
		"\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\5\6\4\2\u0393"+
		"\u0394\5L\'\2\u0394\u0395\7\6\2\2\u0395\u0396\5\u00e4s\2\u0396\u0397\5"+
		"\6\4\2\u0397\u0398\5L\'\2\u0398\u0399\7\7\2\2\u0399[\3\2\2\2\u039a\u039b"+
		"\7\5\2\2\u039b\u039c\7\67\2\2\u039c\u039d\5\u009cO\2\u039d\u039e\5\u00e4"+
		"s\2\u039e\u039f\7\16\2\2\u039f\u03a0\5^\60\2\u03a0]\3\2\2\2\u03a1\u03ab"+
		"\b\60\1\2\u03a2\u03a3\5\u00e4s\2\u03a3\u03a4\7\n\2\2\u03a4\u03ac\3\2\2"+
		"\2\u03a5\u03a6\6\60\f\3\u03a6\u03a8\5`\61\2\u03a7\u03a5\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2"+
		"\2\2\u03ab\u03a2\3\2\2\2\u03ab\u03a7\3\2\2\2\u03ac_\3\2\2\2\u03ad\u03af"+
		"\5\u00e4s\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b4\3\2\2"+
		"\2\u03b0\u03b2\7\27\2\2\u03b1\u03b3\7\67\2\2\u03b2\u03b1\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03b0\3\2\2\2\u03b4\u03b5\3\2"+
		"\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03c1\5\u00b8]\2\u03b7\u03b9\7\67\2\2\u03b8"+
		"\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\7\60"+
		"\2\2\u03bb\u03bd\7\67\2\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u03c0\5\u00b8]\2\u03bf\u03b8\3\2\2\2\u03c0\u03c3"+
		"\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3"+
		"\u03c1\3\2\2\2\u03c4\u03c6\7\67\2\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3"+
		"\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03cb\7\26\2\2\u03c8\u03c9\5\u00e4s\2"+
		"\u03c9\u03ca\5\6\4\2\u03ca\u03cc\3\2\2\2\u03cb\u03c8\3\2\2\2\u03cb\u03cc"+
		"\3\2\2\2\u03cc\u03db\3\2\2\2\u03cd\u03cf\5\u00e4s\2\u03ce\u03cd\3\2\2"+
		"\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d5\7/\2\2\u03d1\u03d2"+
		"\5\u00e4s\2\u03d2\u03d3\7\n\2\2\u03d3\u03d4\b\61\1\2\u03d4\u03d6\3\2\2"+
		"\2\u03d5\u03d1\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03dc\3\2\2\2\u03d7\u03d8"+
		"\5\u00e4s\2\u03d8\u03d9\7\n\2\2\u03d9\u03da\b\61\1\2\u03da\u03dc\3\2\2"+
		"\2\u03db\u03ce\3\2\2\2\u03db\u03d7\3\2\2\2\u03dca\3\2\2\2\u03dd\u03df"+
		"\7\27\2\2\u03de\u03e0\5\u00e4s\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2"+
		"\2\u03e0\u03e1\3\2\2\2\u03e1\u03e6\5\6\4\2\u03e2\u03e4\7\67\2\2\u03e3"+
		"\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\7."+
		"\2\2\u03e6\u03e3\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\3\2\2\2\u03e8"+
		"\u03ea\5\u00e4s\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb"+
		"\3\2\2\2\u03eb\u03ec\7\26\2\2\u03ecc\3\2\2\2\u03ed\u03ee\7\23\2\2\u03ee"+
		"\u03ef\5\u00e4s\2\u03ef\u03f0\5\6\4\2\u03f0\u03f1\5L\'\2\u03f1\u03f2\7"+
		"\24\2\2\u03f2e\3\2\2\2\u03f3\u03f5\7\30\2\2\u03f4\u03f6\5\u00e4s\2\u03f5"+
		"\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\5\u00f8"+
		"}\2\u03f8\u03fa\5\u00e4s\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa"+
		"\u03fb\3\2\2\2\u03fb\u03fc\7\26\2\2\u03fc\u03fd\7\26\2\2\u03fdg\3\2\2"+
		"\2\u03fe\u03ff\5j\66\2\u03ffi\3\2\2\2\u0400\u0401\7\31\2\2\u0401\u0402"+
		"\7\31\2\2\u0402\u0403\5\u00e4s\2\u0403\u0404\5n8\2\u0404\u0405\5\u00e4"+
		"s\2\u0405\u0406\7\32\2\2\u0406\u0407\7\32\2\2\u0407\u0415\3\2\2\2\u0408"+
		"\u0409\7\31\2\2\u0409\u040a\5\u00e4s\2\u040a\u040b\5\u0082B\2\u040b\u040c"+
		"\5\u00e4s\2\u040c\u040d\7\32\2\2\u040d\u0415\3\2\2\2\u040e\u040f\6\66"+
		"\r\2\u040f\u0411\7V\2\2\u0410\u0412\5\u00e4s\2\u0411\u0410\3\2\2\2\u0411"+
		"\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415\5\u0082B\2\u0414\u0400"+
		"\3\2\2\2\u0414\u0408\3\2\2\2\u0414\u040e\3\2\2\2\u0415k\3\2\2\2\u0416"+
		"\u0421\5r:\2\u0417\u0419\5\u00e4s\2\u0418\u0417\3\2\2\2\u0418\u0419\3"+
		"\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\7G\2\2\u041b\u041d\5\u00e4s\2\u041c"+
		"\u041b\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420\5r"+
		":\2\u041f\u0418\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422m\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u042f\5l\67\2"+
		"\u0425\u0427\5\u00e4s\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u042a\7H\2\2\u0429\u042b\5\u00e4s\2\u042a\u0429\3"+
		"\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\5l\67\2\u042d"+
		"\u0426\3\2\2\2\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2"+
		"\2\2\u0430o\3\2\2\2\u0431\u042f\3\2\2\2\u0432\u0433\7\4\2\2\u0433\u0434"+
		"\7\67\2\2\u0434\u0435\5r:\2\u0435q\3\2\2\2\u0436\u0438\7\27\2\2\u0437"+
		"\u0439\7\67\2\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3"+
		"\2\2\2\u043a\u043c\5n8\2\u043b\u043d\7\67\2\2\u043c\u043b\3\2\2\2\u043c"+
		"\u043d\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\7\26\2\2\u043f\u0444\3"+
		"\2\2\2\u0440\u0444\5p9\2\u0441\u0444\5t;\2\u0442\u0444\5v<\2\u0443\u0436"+
		"\3\2\2\2\u0443\u0440\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0442\3\2\2\2\u0444"+
		"s\3\2\2\2\u0445\u0446\5\u0094K\2\u0446\u0447\7\67\2\2\u0447\u0448\5\u0096"+
		"L\2\u0448u\3\2\2\2\u0449\u0467\5\u0096L\2\u044a\u044b\7\67\2\2\u044b\u044c"+
		"\7!\2\2\u044c\u044d\7<\2\2\u044d\u044e\7\67\2\2\u044e\u0468\5x=\2\u044f"+
		"\u0450\5~@\2\u0450\u0451\5\u0096L\2\u0451\u0468\3\2\2\2\u0452\u0453\7"+
		"\67\2\2\u0453\u0454\7\4\2\2\u0454\u0455\7!\2\2\u0455\u0456\3\2\2\2\u0456"+
		"\u0458\7\67\2\2\u0457\u0459\5\u00b6\\\2\u0458\u0457\3\2\2\2\u0459\u045a"+
		"\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0468\3\2\2\2\u045c"+
		"\u045d\7\67\2\2\u045d\u045e\7!\2\2\u045e\u045f\7!\2\2\u045f\u0460\3\2"+
		"\2\2\u0460\u0462\7\67\2\2\u0461\u0463\5\u00b6\\\2\u0462\u0461\3\2\2\2"+
		"\u0463\u0464\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0468"+
		"\3\2\2\2\u0466\u0468\3\2\2\2\u0467\u044a\3\2\2\2\u0467\u044f\3\2\2\2\u0467"+
		"\u0452\3\2\2\2\u0467\u045c\3\2\2\2\u0467\u0466\3\2\2\2\u0468w\3\2\2\2"+
		"\u0469\u046a\7\63\2\2\u046a\u0478\b=\1\2\u046b\u046c\6=\16\3\u046c\u0478"+
		"\5z>\2\u046d\u046e\7T\2\2\u046e\u0478\7\67\2\2\u046f\u0470\7\27\2\2\u0470"+
		"\u0478\b=\1\2\u0471\u0472\7\30\2\2\u0472\u0478\b=\1\2\u0473\u0474\6=\17"+
		"\3\u0474\u0475\7\26\2\2\u0475\u0478\b=\1\2\u0476\u0478\n\b\2\2\u0477\u0469"+
		"\3\2\2\2\u0477\u046b\3\2\2\2\u0477\u046d\3\2\2\2\u0477\u046f\3\2\2\2\u0477"+
		"\u0471\3\2\2\2\u0477\u0473\3\2\2\2\u0477\u0476\3\2\2\2\u0478\u0479\3\2"+
		"\2\2\u0479\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047ay\3\2\2\2\u047b\u047c"+
		"\5|?\2\u047c{\3\2\2\2\u047d\u047e\n\t\2\2\u047e}\3\2\2\2\u047f\u0480\7"+
		"\67\2\2\u0480\u0481\5\u0092J\2\u0481\u0482\7\67\2\2\u0482\u0495\3\2\2"+
		"\2\u0483\u0484\7\67\2\2\u0484\u0485\7!\2\2\u0485\u0495\7\67\2\2\u0486"+
		"\u0488\7\67\2\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\3"+
		"\2\2\2\u0489\u048b\7\'\2\2\u048a\u048c\7\67\2\2\u048b\u048a\3\2\2\2\u048b"+
		"\u048c\3\2\2\2\u048c\u0495\3\2\2\2\u048d\u048f\7\67\2\2\u048e\u048d\3"+
		"\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0492\7(\2\2\u0491"+
		"\u0493\7\67\2\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0495\3"+
		"\2\2\2\u0494\u047f\3\2\2\2\u0494\u0483\3\2\2\2\u0494\u0487\3\2\2\2\u0494"+
		"\u048e\3\2\2\2\u0495\177\3\2\2\2\u0496\u049d\5\u0086D\2\u0497\u0498\5"+
		"\u008eH\2\u0498\u0499\7\67\2\2\u0499\u049a\5\u0086D\2\u049a\u049c\3\2"+
		"\2\2\u049b\u0497\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d"+
		"\u049e\3\2\2\2\u049e\u0081\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04a7\5\u0080"+
		"A\2\u04a1\u04a2\5\u0090I\2\u04a2\u04a3\7\67\2\2\u04a3\u04a4\5\u0080A\2"+
		"\u04a4\u04a6\3\2\2\2\u04a5\u04a1\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5"+
		"\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u0083\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa"+
		"\u04ab\7\4\2\2\u04ab\u04ac\7\67\2\2\u04ac\u04ad\5\u0086D\2\u04ad\u0085"+
		"\3\2\2\2\u04ae\u04b0\7\27\2\2\u04af\u04b1\7\67\2\2\u04b0\u04af\3\2\2\2"+
		"\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b4\5\u0082B\2\u04b3"+
		"\u04b5\7\67\2\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\3"+
		"\2\2\2\u04b6\u04b7\7\26\2\2\u04b7\u04bc\3\2\2\2\u04b8\u04bc\5\u0084C\2"+
		"\u04b9\u04bc\5\u0088E\2\u04ba\u04bc\5\u008aF\2\u04bb\u04ae\3\2\2\2\u04bb"+
		"\u04b8\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04ba\3\2\2\2\u04bc\u0087\3\2"+
		"\2\2\u04bd\u04be\5\u0094K\2\u04be\u04bf\7\67\2\2\u04bf\u04c0\5\u0096L"+
		"\2\u04c0\u0089\3\2\2\2\u04c1\u04c7\5\u0096L\2\u04c2\u04c3\7\67\2\2\u04c3"+
		"\u04c4\5\u008cG\2\u04c4\u04c5\7\67\2\2\u04c5\u04c6\5\u0096L\2\u04c6\u04c8"+
		"\3\2\2\2\u04c7\u04c2\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u008b\3\2\2\2\u04c9"+
		"\u04d2\5\u0092J\2\u04ca\u04cb\7!\2\2\u04cb\u04d2\7!\2\2\u04cc\u04d2\7"+
		"!\2\2\u04cd\u04ce\7\4\2\2\u04ce\u04d2\7!\2\2\u04cf\u04d2\7R\2\2\u04d0"+
		"\u04d2\7S\2\2\u04d1\u04c9\3\2\2\2\u04d1\u04ca\3\2\2\2\u04d1\u04cc\3\2"+
		"\2\2\u04d1\u04cd\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d0\3\2\2\2\u04d2"+
		"\u008d\3\2\2\2\u04d3\u04d4\6H\20\2\u04d4\u04d5\7\67\2\2\u04d5\u04d6\7"+
		"\"\2\2\u04d6\u04d7\7;\2\2\u04d7\u008f\3\2\2\2\u04d8\u04d9\6I\21\2\u04d9"+
		"\u04da\7\67\2\2\u04da\u04db\7\"\2\2\u04db\u04dc\7;\2\2\u04dc\u0091\3\2"+
		"\2\2\u04dd\u04de\7\"\2\2\u04de\u04df\7V\2\2\u04df\u0093\3\2\2\2\u04e0"+
		"\u04e1\7\"\2\2\u04e1\u04e2\7;\2\2\u04e2\u0095\3\2\2\2\u04e3\u04e4\5\u009c"+
		"O\2\u04e4\u0097\3\2\2\2\u04e5\u04e6\t\n\2\2\u04e6\u0099\3\2\2\2\u04e7"+
		"\u04e8\t\13\2\2\u04e8\u009b\3\2\2\2\u04e9\u04ed\5\u009eP\2\u04ea\u04ec"+
		"\5\u009eP\2\u04eb\u04ea\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2"+
		"\2\u04ed\u04ee\3\2\2\2\u04ee\u009d\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f4"+
		"\5\u00a6T\2\u04f1\u04f4\5\u00a4S\2\u04f2\u04f4\5\u00a2R\2\u04f3\u04f0"+
		"\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f3\u04f2\3\2\2\2\u04f4\u009f\3\2\2\2\u04f5"+
		"\u04f7\5\u00a4S\2\u04f6\u04f8\5\u00e4s\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8"+
		"\3\2\2\2\u04f8\u04fc\3\2\2\2\u04f9\u04fb\5\u009eP\2\u04fa\u04f9\3\2\2"+
		"\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u050a"+
		"\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff\u0501\5\u00a6T\2\u0500\u0502\5\u00e4"+
		"s\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0506\3\2\2\2\u0503"+
		"\u0505\5\u009eP\2\u0504\u0503\3\2\2\2\u0505\u0508\3\2\2\2\u0506\u0504"+
		"\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0509"+
		"\u04f5\3\2\2\2\u0509\u04ff\3\2\2\2\u050a\u00a1\3\2\2\2\u050b\u050c\t\f"+
		"\2\2\u050c\u00a3\3\2\2\2\u050d\u0516\5\u00b0Y\2\u050e\u0516\5\u00c6d\2"+
		"\u050f\u0516\5\u00e6t\2\u0510\u0516\5\u00f4{\2\u0511\u0516\5\u00e8u\2"+
		"\u0512\u0516\7\4\2\2\u0513\u0514\7\34\2\2\u0514\u0516\7\65\2\2\u0515\u050d"+
		"\3\2\2\2\u0515\u050e\3\2\2\2\u0515\u050f\3\2\2\2\u0515\u0510\3\2\2\2\u0515"+
		"\u0511\3\2\2\2\u0515\u0512\3\2\2\2\u0515\u0513\3\2\2\2\u0516\u00a5\3\2"+
		"\2\2\u0517\u051a\5\u00a8U\2\u0518\u051a\7\65\2\2\u0519\u0517\3\2\2\2\u0519"+
		"\u0518\3\2\2\2\u051a\u00a7\3\2\2\2\u051b\u051f\7\63\2\2\u051c\u051e\5"+
		"\u00aaV\2\u051d\u051c\3\2\2\2\u051e\u0521\3\2\2\2\u051f\u051d\3\2\2\2"+
		"\u051f\u0520\3\2\2\2\u0520\u0522\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u0523"+
		"\7\63\2\2\u0523\u00a9\3\2\2\2\u0524\u0532\5\u00c6d\2\u0525\u0532\5\u00e6"+
		"t\2\u0526\u0532\5\u00f4{\2\u0527\u0528\7T\2\2\u0528\u0532\7\63\2\2\u0529"+
		"\u052a\7T\2\2\u052a\u0532\7\33\2\2\u052b\u052c\7T\2\2\u052c\u0532\7\34"+
		"\2\2\u052d\u0532\5\u00e8u\2\u052e\u052f\7\34\2\2\u052f\u0532\7\65\2\2"+
		"\u0530\u0532\13\2\2\2\u0531\u0524\3\2\2\2\u0531\u0525\3\2\2\2\u0531\u0526"+
		"\3\2\2\2\u0531\u0527\3\2\2\2\u0531\u0529\3\2\2\2\u0531\u052b\3\2\2\2\u0531"+
		"\u052d\3\2\2\2\u0531\u052e\3\2\2\2\u0531\u0530\3\2\2\2\u0532\u00ab\3\2"+
		"\2\2\u0533\u0535\5\u00aeX\2\u0534\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536"+
		"\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u00ad\3\2\2\2\u0538\u053b\5\u00a8"+
		"U\2\u0539\u053b\5\u00aaV\2\u053a\u0538\3\2\2\2\u053a\u0539\3\2\2\2\u053b"+
		"\u00af\3\2\2\2\u053c\u053f\5\u00b2Z\2\u053d\u053f\7A\2\2\u053e\u053c\3"+
		"\2\2\2\u053e\u053d\3\2\2\2\u053f\u00b1\3\2\2\2\u0540\u0563\5\u009aN\2"+
		"\u0541\u0563\5\u0098M\2\u0542\u0563\5\u00b4[\2\u0543\u0563\7W\2\2\u0544"+
		"\u0563\7!\2\2\u0545\u0563\7?\2\2\u0546\u0563\7@\2\2\u0547\u0563\7#\2\2"+
		"\u0548\u0563\7\"\2\2\u0549\u0563\7\36\2\2\u054a\u0563\7\37\2\2\u054b\u0563"+
		"\7B\2\2\u054c\u0563\7<\2\2\u054d\u0563\7\31\2\2\u054e\u0563\7\32\2\2\u054f"+
		"\u0563\7&\2\2\u0550\u0563\7>\2\2\u0551\u0563\7\66\2\2\u0552\u0563\7E\2"+
		"\2\u0553\u0563\7D\2\2\u0554\u0563\7F\2\2\u0555\u0563\7\35\2\2\u0556\u0563"+
		"\7J\2\2\u0557\u0563\7K\2\2\u0558\u0563\7L\2\2\u0559\u0563\7M\2\2\u055a"+
		"\u0563\7N\2\2\u055b\u0563\7S\2\2\u055c\u0563\7R\2\2\u055d\u0563\7O\2\2"+
		"\u055e\u0563\7\61\2\2\u055f\u0563\7\62\2\2\u0560\u0563\7 \2\2\u0561\u0563"+
		"\7C\2\2\u0562\u0540\3\2\2\2\u0562\u0541\3\2\2\2\u0562\u0542\3\2\2\2\u0562"+
		"\u0543\3\2\2\2\u0562\u0544\3\2\2\2\u0562\u0545\3\2\2\2\u0562\u0546\3\2"+
		"\2\2\u0562\u0547\3\2\2\2\u0562\u0548\3\2\2\2\u0562\u0549\3\2\2\2\u0562"+
		"\u054a\3\2\2\2\u0562\u054b\3\2\2\2\u0562\u054c\3\2\2\2\u0562\u054d\3\2"+
		"\2\2\u0562\u054e\3\2\2\2\u0562\u054f\3\2\2\2\u0562\u0550\3\2\2\2\u0562"+
		"\u0551\3\2\2\2\u0562\u0552\3\2\2\2\u0562\u0553\3\2\2\2\u0562\u0554\3\2"+
		"\2\2\u0562\u0555\3\2\2\2\u0562\u0556\3\2\2\2\u0562\u0557\3\2\2\2\u0562"+
		"\u0558\3\2\2\2\u0562\u0559\3\2\2\2\u0562\u055a\3\2\2\2\u0562\u055b\3\2"+
		"\2\2\u0562\u055c\3\2\2\2\u0562\u055d\3\2\2\2\u0562\u055e\3\2\2\2\u0562"+
		"\u055f\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0561\3\2\2\2\u0563\u00b3\3\2"+
		"\2\2\u0564\u0571\7T\2\2\u0565\u0572\79\2\2\u0566\u0567\79\2\2\u0567\u0572"+
		"\79\2\2\u0568\u0569\79\2\2\u0569\u056a\79\2\2\u056a\u0572\79\2\2\u056b"+
		"\u056c\7;\2\2\u056c\u056e\7\u00b3\2\2\u056d\u056f\7\u00b3\2\2\u056e\u056d"+
		"\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0572\3\2\2\2\u0570\u0572\13\2\2\2"+
		"\u0571\u0565\3\2\2\2\u0571\u0566\3\2\2\2\u0571\u0568\3\2\2\2\u0571\u056b"+
		"\3\2\2\2\u0571\u0570\3\2\2\2\u0572\u00b5\3\2\2\2\u0573\u0574\7C\2\2\u0574"+
		"\u0575\7\27\2\2\u0575\u057a\5\u00b8]\2\u0576\u0577\7\60\2\2\u0577\u0579"+
		"\5\u00b8]\2\u0578\u0576\3\2\2\2\u0579\u057c\3\2\2\2\u057a\u0578\3\2\2"+
		"\2\u057a\u057b\3\2\2\2\u057b\u057d\3\2\2\2\u057c\u057a\3\2\2\2\u057d\u057e"+
		"\7\26\2\2\u057e\u05b3\3\2\2\2\u057f\u0580\7 \2\2\u0580\u0581\7\27\2\2"+
		"\u0581\u0586\5\u00b8]\2\u0582\u0583\7\60\2\2\u0583\u0585\5\u00b8]\2\u0584"+
		"\u0582\3\2\2\2\u0585\u0588\3\2\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2"+
		"\2\2\u0587\u0589\3\2\2\2\u0588\u0586\3\2\2\2\u0589\u058a\7\26\2\2\u058a"+
		"\u05b3\3\2\2\2\u058b\u058c\7#\2\2\u058c\u058d\7\27\2\2\u058d\u0592\5\u00b8"+
		"]\2\u058e\u058f\7\60\2\2\u058f\u0591\5\u00b8]\2\u0590\u058e\3\2\2\2\u0591"+
		"\u0594\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0595\3\2"+
		"\2\2\u0594\u0592\3\2\2\2\u0595\u0596\7\26\2\2\u0596\u05b3\3\2\2\2\u0597"+
		"\u0598\7\35\2\2\u0598\u0599\7\27\2\2\u0599\u059e\5\u00b8]\2\u059a\u059b"+
		"\7\60\2\2\u059b\u059d\5\u00b8]\2\u059c\u059a\3\2\2\2\u059d\u05a0\3\2\2"+
		"\2\u059e\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a1\3\2\2\2\u05a0\u059e"+
		"\3\2\2\2\u05a1\u05a2\7\26\2\2\u05a2\u05b3\3\2\2\2\u05a3\u05a4\7\4\2\2"+
		"\u05a4\u05a5\7\27\2\2\u05a5\u05aa\5\u00b8]\2\u05a6\u05a7\7\60\2\2\u05a7"+
		"\u05a9\5\u00b8]\2\u05a8\u05a6\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa\u05a8"+
		"\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ad"+
		"\u05ae\7\26\2\2\u05ae\u05b3\3\2\2\2\u05af\u05b3\5\u00ba^\2\u05b0\u05b3"+
		"\5\u00c2b\2\u05b1\u05b3\5\u009eP\2\u05b2\u0573\3\2\2\2\u05b2\u057f\3\2"+
		"\2\2\u05b2\u058b\3\2\2\2\u05b2\u0597\3\2\2\2\u05b2\u05a3\3\2\2\2\u05b2"+
		"\u05af\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b1\3\2\2\2\u05b3\u00b7\3\2"+
		"\2\2\u05b4\u05b6\5\u00b6\\\2\u05b5\u05b4\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7"+
		"\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u00b9\3\2\2\2\u05b9\u05ba\7\31"+
		"\2\2\u05ba\u05bb\5\u00bc_\2\u05bb\u05bc\5\u00c0a\2\u05bc\u05bd\7\32\2"+
		"\2\u05bd\u05c1\3\2\2\2\u05be\u05c1\7 \2\2\u05bf\u05c1\7C\2\2\u05c0\u05b9"+
		"\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05bf\3\2\2\2\u05c1\u00bb\3\2\2\2\u05c2"+
		"\u05c6\7\4\2\2\u05c3\u05c6\7&\2\2\u05c4\u05c6\3\2\2\2\u05c5\u05c2\3\2"+
		"\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c4\3\2\2\2\u05c6\u00bd\3\2\2\2\u05c7"+
		"\u05ca\5\u00c2b\2\u05c8\u05ca\5\u009eP\2\u05c9\u05c7\3\2\2\2\u05c9\u05c8"+
		"\3\2\2\2\u05ca\u00bf\3\2\2\2\u05cb\u05cd\5\u00be`\2\u05cc\u05cb\3\2\2"+
		"\2\u05cd\u05ce\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u00c1"+
		"\3\2\2\2\u05d0\u05d1\7\31\2\2\u05d1\u05d2\7B\2\2\u05d2\u05d3\7V\2\2\u05d3"+
		"\u05d4\7B\2\2\u05d4\u05e1\7\32\2\2\u05d5\u05d6\7\31\2\2\u05d6\u05d7\7"+
		"!\2\2\u05d7\u05d8\5\u00c4c\2\u05d8\u05d9\7!\2\2\u05d9\u05da\7\32\2\2\u05da"+
		"\u05e1\3\2\2\2\u05db\u05dc\7\31\2\2\u05dc\u05dd\7\36\2\2\u05dd\u05de\7"+
		"V\2\2\u05de\u05df\7\36\2\2\u05df\u05e1\7\32\2\2\u05e0\u05d0\3\2\2\2\u05e0"+
		"\u05d5\3\2\2\2\u05e0\u05db\3\2\2\2\u05e1\u00c3\3\2\2\2\u05e2\u05e3\t\r"+
		"\2\2\u05e3\u00c5\3\2\2\2\u05e4\u05e5\7\34\2\2\u05e5\u05e6\7\23\2\2\u05e6"+
		"\u05e7\5\u00c8e\2\u05e7\u05e8\7\24\2\2\u05e8\u05fc\3\2\2\2\u05e9\u05ea"+
		"\7\34\2\2\u05ea\u05fc\5\u0098M\2\u05eb\u05ec\7\34\2\2\u05ec\u05fc\5\u009a"+
		"N\2\u05ed\u05ee\7\34\2\2\u05ee\u05fc\7 \2\2\u05ef\u05f0\7\34\2\2\u05f0"+
		"\u05fc\7\35\2\2\u05f1\u05f2\7\34\2\2\u05f2\u05fc\7>\2\2\u05f3\u05f4\7"+
		"\34\2\2\u05f4\u05fc\7C\2\2\u05f5\u05f6\7\34\2\2\u05f6\u05fc\7\"\2\2\u05f7"+
		"\u05f8\7\34\2\2\u05f8\u05fc\7\34\2\2\u05f9\u05fa\7\34\2\2\u05fa\u05fc"+
		"\7\4\2\2\u05fb\u05e4\3\2\2\2\u05fb\u05e9\3\2\2\2\u05fb\u05eb\3\2\2\2\u05fb"+
		"\u05ed\3\2\2\2\u05fb\u05ef\3\2\2\2\u05fb\u05f1\3\2\2\2\u05fb\u05f3\3\2"+
		"\2\2\u05fb\u05f5\3\2\2\2\u05fb\u05f7\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fc"+
		"\u00c7\3\2\2\2\u05fd\u0620\5\u00dan\2\u05fe\u05ff\5\u00ccg\2\u05ff\u0600"+
		"\5\u00d4k\2\u0600\u0621\3\2\2\2\u0601\u0603\7B\2\2\u0602\u0604\7\67\2"+
		"\2\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0612\3\2\2\2\u0605\u060b"+
		"\5\u00f2z\2\u0606\u0608\7B\2\2\u0607\u0609\7\67\2\2\u0608\u0607\3\2\2"+
		"\2\u0608\u0609\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060c\5\u00f2z\2\u060b"+
		"\u0606\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u0613\3\2\2\2\u060d\u060f\7B"+
		"\2\2\u060e\u0610\7\67\2\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610"+
		"\u0611\3\2\2\2\u0611\u0613\5\u00f2z\2\u0612\u0605\3\2\2\2\u0612\u060d"+
		"\3\2\2\2\u0613\u0621\3\2\2\2\u0614\u0615\5\u00caf\2\u0615\u0616\5\u00d0"+
		"i\2\u0616\u0621\3\2\2\2\u0617\u0618\5\u00d8m\2\u0618\u061b\5\u00ceh\2"+
		"\u0619\u061a\7A\2\2\u061a\u061c\5\u00d4k\2\u061b\u0619\3\2\2\2\u061b\u061c"+
		"\3\2\2\2\u061c\u0621\3\2\2\2\u061d\u061f\7\67\2\2\u061e\u061d\3\2\2\2"+
		"\u061e\u061f\3\2\2\2\u061f\u0621\3\2\2\2\u0620\u05fe\3\2\2\2\u0620\u0601"+
		"\3\2\2\2\u0620\u0614\3\2\2\2\u0620\u0617\3\2\2\2\u0620\u061e\3\2\2\2\u0621"+
		"\u0631\3\2\2\2\u0622\u0623\7\4\2\2\u0623\u062c\5\u00dep\2\u0624\u062d"+
		"\7 \2\2\u0625\u062d\7\35\2\2\u0626\u0629\7\31\2\2\u0627\u062a\7 \2\2\u0628"+
		"\u062a\7\35\2\2\u0629\u0627\3\2\2\2\u0629\u0628\3\2\2\2\u062a\u062b\3"+
		"\2\2\2\u062b\u062d\7\32\2\2\u062c\u0624\3\2\2\2\u062c\u0625\3\2\2\2\u062c"+
		"\u0626\3\2\2\2\u062d\u0631\3\2\2\2\u062e\u062f\6e\22\2\u062f\u0631\5\u00e0"+
		"q\2\u0630\u05fd\3\2\2\2\u0630\u0622\3\2\2\2\u0630\u062e\3\2\2\2\u0631"+
		"\u00c9\3\2\2\2\u0632\u0633\7>\2\2\u0633\u0638\7>\2\2\u0634\u0638\7>\2"+
		"\2\u0635\u0638\7?\2\2\u0636\u0638\7@\2\2\u0637\u0632\3\2\2\2\u0637\u0634"+
		"\3\2\2\2\u0637\u0635\3\2\2\2\u0637\u0636\3\2\2\2\u0638\u00cb\3\2\2\2\u0639"+
		"\u063a\7B\2\2\u063a\u0646\7\"\2\2\u063b\u063c\7B\2\2\u063c\u0646\7!\2"+
		"\2\u063d\u063e\7B\2\2\u063e\u0646\7C\2\2\u063f\u0640\7B\2\2\u0640\u0646"+
		"\7#\2\2\u0641\u0646\7\"\2\2\u0642\u0646\7!\2\2\u0643\u0646\7C\2\2\u0644"+
		"\u0646\7#\2\2\u0645\u0639\3\2\2\2\u0645\u063b\3\2\2\2\u0645\u063d\3\2"+
		"\2\2\u0645\u063f\3\2\2\2\u0645\u0641\3\2\2\2\u0645\u0642\3\2\2\2\u0645"+
		"\u0643\3\2\2\2\u0645\u0644\3\2\2\2\u0646\u00cd\3\2\2\2\u0647\u064e\3\2"+
		"\2\2\u0648\u064a\5\u00d2j\2\u0649\u0648\3\2\2\2\u064a\u064b\3\2\2\2\u064b"+
		"\u0649\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064e\3\2\2\2\u064d\u0647\3\2"+
		"\2\2\u064d\u0649\3\2\2\2\u064e\u00cf\3\2\2\2\u064f\u0651\5\u00d2j\2\u0650"+
		"\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0650\3\2\2\2\u0652\u0653\3\2"+
		"\2\2\u0653\u00d1\3\2\2\2\u0654\u0658\5\u00b6\\\2\u0655\u0656\6j\23\2\u0656"+
		"\u0658\13\2\2\2\u0657\u0654\3\2\2\2\u0657\u0655\3\2\2\2\u0658\u00d3\3"+
		"\2\2\2\u0659\u065a\5\u00d6l\2\u065a\u00d5\3\2\2\2\u065b\u065f\bl\1\2\u065c"+
		"\u065d\6l\24\3\u065d\u065e\13\2\2\2\u065e\u0660\bl\1\2\u065f\u065c\3\2"+
		"\2\2\u0660\u0661\3\2\2\2\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662"+
		"\u0665\3\2\2\2\u0663\u0665\3\2\2\2\u0664\u065b\3\2\2\2\u0664\u0663\3\2"+
		"\2\2\u0665\u00d7\3\2\2\2\u0666\u0667\7A\2\2\u0667\u066e\7A\2\2\u0668\u0669"+
		"\7A\2\2\u0669\u066e\7?\2\2\u066a\u066b\7A\2\2\u066b\u066e\7>\2\2\u066c"+
		"\u066e\7A\2\2\u066d\u0666\3\2\2\2\u066d\u0668\3\2\2\2\u066d\u066a\3\2"+
		"\2\2\u066d\u066c\3\2\2\2\u066e\u00d9\3\2\2\2\u066f\u0683\5\u009aN\2\u0670"+
		"\u0671\5\u0098M\2\u0671\u0672\7\31\2\2\u0672\u0673\7\35\2\2\u0673\u0674"+
		"\7\32\2\2\u0674\u0683\3\2\2\2\u0675\u0676\5\u0098M\2\u0676\u0677\7\31"+
		"\2\2\u0677\u0678\7 \2\2\u0678\u0679\7\32\2\2\u0679\u0683\3\2\2\2\u067a"+
		"\u067b\7\4\2\2\u067b\u0683\5\u00dep\2\u067c\u0683\5\u00dco\2\u067d\u0683"+
		"\7\34\2\2\u067e\u0683\7 \2\2\u067f\u0683\7\35\2\2\u0680\u0683\7C\2\2\u0681"+
		"\u0683\7>\2\2\u0682\u066f\3\2\2\2\u0682\u0670\3\2\2\2\u0682\u0675\3\2"+
		"\2\2\u0682\u067a\3\2\2\2\u0682\u067c\3\2\2\2\u0682\u067d\3\2\2\2\u0682"+
		"\u067e\3\2\2\2\u0682\u067f\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0681\3\2"+
		"\2\2\u0683\u00db\3\2\2\2\u0684\u0685\5\u0098M\2\u0685\u0687\7\31\2\2\u0686"+
		"\u0688\7\67\2\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u0689\3"+
		"\2\2\2\u0689\u068b\5\u00f2z\2\u068a\u068c\7\67\2\2\u068b\u068a\3\2\2\2"+
		"\u068b\u068c\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\7\32\2\2\u068e\u0691"+
		"\3\2\2\2\u068f\u0691\5\u0098M\2\u0690\u0684\3\2\2\2\u0690\u068f\3\2\2"+
		"\2\u0691\u00dd\3\2\2\2\u0692\u0696\5\u009aN\2\u0693\u0696\5\u0098M\2\u0694"+
		"\u0696\7>\2\2\u0695\u0692\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0694\3\2"+
		"\2\2\u0696\u00df\3\2\2\2\u0697\u0698\7>\2\2\u0698\u0699\5\u0098M\2\u0699"+
		"\u069a\7\31\2\2\u069a\u069b\5\u00e2r\2\u069b\u069c\7\32\2\2\u069c\u06a0"+
		"\3\2\2\2\u069d\u069e\7>\2\2\u069e\u06a0\5\u00dan\2\u069f\u0697\3\2\2\2"+
		"\u069f\u069d\3\2\2\2\u06a0\u00e1\3\2\2\2\u06a1\u06a3\79\2\2\u06a2\u06a1"+
		"\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5"+
		"\u06a8\3\2\2\2\u06a6\u06a8\t\16\2\2\u06a7\u06a2\3\2\2\2\u06a7\u06a6\3"+
		"\2\2\2\u06a8\u00e3\3\2\2\2\u06a9\u06ab\t\5\2\2\u06aa\u06a9\3\2\2\2\u06ab"+
		"\u06ac\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u00e5\3\2"+
		"\2\2\u06ae\u06af\t\17\2\2\u06af\u00e7\3\2\2\2\u06b0\u06b4\7\23\2\2\u06b1"+
		"\u06b3\7\67\2\2\u06b2\u06b1\3\2\2\2\u06b3\u06b6\3\2\2\2\u06b4\u06b2\3"+
		"\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b7\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b7"+
		"\u06bb\5\u00eav\2\u06b8\u06ba\7\67\2\2\u06b9\u06b8\3\2\2\2\u06ba\u06bd"+
		"\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be\3\2\2\2\u06bd"+
		"\u06bb\3\2\2\2\u06be\u06bf\7\24\2\2\u06bf\u00e9\3\2\2\2\u06c0\u06c3\5"+
		"\u00f0y\2\u06c1\u06c3\5\u00ecw\2\u06c2\u06c0\3\2\2\2\u06c2\u06c1\3\2\2"+
		"\2\u06c3\u00eb\3\2\2\2\u06c4\u06c5\79\2\2\u06c5\u06c6\7\37\2\2\u06c6\u06cb"+
		"\79\2\2\u06c7\u06c8\7;\2\2\u06c8\u06c9\7\37\2\2\u06c9\u06cb\7;\2\2\u06ca"+
		"\u06c4\3\2\2\2\u06ca\u06c7\3\2\2\2\u06cb\u00ed\3\2\2\2\u06cc\u06ce\5\u009e"+
		"P\2\u06cd\u06cc\3\2\2\2\u06ce\u06d1\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf"+
		"\u06d0\3\2\2\2\u06d0\u00ef\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d2\u06d5\5\u00ee"+
		"x\2\u06d3\u06d4\7\66\2\2\u06d4\u06d6\5\u00eex\2\u06d5\u06d3\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7\u06d5\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u00f1\3\2"+
		"\2\2\u06d9\u06dc\5\u00f6|\2\u06da\u06dc\5\u00f8}\2\u06db\u06d9\3\2\2\2"+
		"\u06db\u06da\3\2\2\2\u06dc\u00f3\3\2\2\2\u06dd\u06de\5\u00f6|\2\u06de"+
		"\u00f5\3\2\2\2\u06df\u06e0\7\34\2\2\u06e0\u06e2\7\30\2\2\u06e1\u06e3\7"+
		"\67\2\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4"+
		"\u06e6\5\u00f8}\2\u06e5\u06e7\7\67\2\2\u06e6\u06e5\3\2\2\2\u06e6\u06e7"+
		"\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06e9\7\26\2\2\u06e9\u06ea\7\26\2\2"+
		"\u06ea\u06f7\3\2\2\2\u06eb\u06ec\7\34\2\2\u06ec\u06ee\7\31\2\2\u06ed\u06ef"+
		"\7\67\2\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f0\3\2\2\2"+
		"\u06f0\u06f2\5\u00f8}\2\u06f1\u06f3\7\67\2\2\u06f2\u06f1\3\2\2\2\u06f2"+
		"\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\7\32\2\2\u06f5\u06f7\3"+
		"\2\2\2\u06f6\u06df\3\2\2\2\u06f6\u06eb\3\2\2\2\u06f7\u00f7\3\2\2\2\u06f8"+
		"\u0700\5\u00fc\177\2\u06f9\u06fb\7\66\2\2\u06fa\u06fc\7\67\2\2\u06fb\u06fa"+
		"\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06ff\5\u00fc\177"+
		"\2\u06fe\u06f9\3\2\2\2\u06ff\u0702\3\2\2\2\u0700\u06fe\3\2\2\2\u0700\u0701"+
		"\3\2\2\2\u0701\u00f9\3\2\2\2\u0702\u0700\3\2\2\2\u0703\u0704\5\u00f8}"+
		"\2\u0704\u0705\7\2\2\3\u0705\u00fb\3\2\2\2\u0706\u0708\5\u00dco\2\u0707"+
		"\u0709\7\67\2\2\u0708\u0707\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a\3"+
		"\2\2\2\u070a\u070c\5\u00fe\u0080\2\u070b\u070d\7\67\2\2\u070c\u070b\3"+
		"\2\2\2\u070c\u070d\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\5\u0122\u0092"+
		"\2\u070f\u0724\3\2\2\2\u0710\u0712\5\u0100\u0081\2\u0711\u0713\7\67\2"+
		"\2\u0712\u0711\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0716"+
		"\5\u00fe\u0080\2\u0715\u0717\7\67\2\2\u0716\u0715\3\2\2\2\u0716\u0717"+
		"\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u0719\5\u0122\u0092\2\u0719\u0724\3"+
		"\2\2\2\u071a\u0721\5\u0122\u0092\2\u071b\u071c\7C\2\2\u071c\u071d\5\u0122"+
		"\u0092\2\u071d\u071e\7B\2\2\u071e\u071f\5\u0122\u0092\2\u071f\u0722\3"+
		"\2\2\2\u0720\u0722\3\2\2\2\u0721\u071b\3\2\2\2\u0721\u0720\3\2\2\2\u0722"+
		"\u0724\3\2\2\2\u0723\u0706\3\2\2\2\u0723\u0710\3\2\2\2\u0723\u071a\3\2"+
		"\2\2\u0724\u00fd\3\2\2\2\u0725\u0726\6\u0080\25\2\u0726\u073c\7!\2\2\u0727"+
		"\u0728\7 \2\2\u0728\u073c\7!\2\2\u0729\u072a\7A\2\2\u072a\u073c\7!\2\2"+
		"\u072b\u072c\7?\2\2\u072c\u073c\7!\2\2\u072d\u072e\7#\2\2\u072e\u073c"+
		"\7!\2\2\u072f\u0730\7\"\2\2\u0730\u073c\7!\2\2\u0731\u0732\7)\2\2\u0732"+
		"\u073c\7!\2\2\u0733\u0734\7*\2\2\u0734\u073c\7!\2\2\u0735\u0736\7%\2\2"+
		"\u0736\u073c\7!\2\2\u0737\u0738\7&\2\2\u0738\u073c\7!\2\2\u0739\u073a"+
		"\7\60\2\2\u073a\u073c\7!\2\2\u073b\u0725\3\2\2\2\u073b\u0727\3\2\2\2\u073b"+
		"\u0729\3\2\2\2\u073b\u072b\3\2\2\2\u073b\u072d\3\2\2\2\u073b\u072f\3\2"+
		"\2\2\u073b\u0731\3\2\2\2\u073b\u0733\3\2\2\2\u073b\u0735\3\2\2\2\u073b"+
		"\u0737\3\2\2\2\u073b\u0739\3\2\2\2\u073c\u00ff\3\2\2\2\u073d\u073e\5\u00c6"+
		"d\2\u073e\u0101\3\2\2\2\u073f\u0749\5\u009aN\2\u0740\u0749\5\u00e6t\2"+
		"\u0741\u0749\5\u00dco\2\u0742\u0749\5\u00c6d\2\u0743\u0749\5\u00f4{\2"+
		"\u0744\u0745\7\27\2\2\u0745\u0746\5\u00f8}\2\u0746\u0747\7\26\2\2\u0747"+
		"\u0749\3\2\2\2\u0748\u073f\3\2\2\2\u0748\u0740\3\2\2\2\u0748\u0741\3\2"+
		"\2\2\u0748\u0742\3\2\2\2\u0748\u0743\3\2\2\2\u0748\u0744\3\2\2\2\u0749"+
		"\u0103\3\2\2\2\u074a\u074c\7\63\2\2\u074b\u074a\3\2\2\2\u074b\u074c\3"+
		"\2\2\2\u074c\u074d\3\2\2\2\u074d\u074f\5\u0102\u0082\2\u074e\u0750\7\63"+
		"\2\2\u074f\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0105\3\2\2\2\u0751"+
		"\u0753\5\u0104\u0083\2\u0752\u0754\7\67\2\2\u0753\u0752\3\2\2\2\u0753"+
		"\u0754\3\2\2\2\u0754\u0760\3\2\2\2\u0755\u0757\7\67\2\2\u0756\u0755\3"+
		"\2\2\2\u0756\u0757\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u0759\7#\2\2\u0759"+
		"\u0761\7#\2\2\u075a\u075c\7\67\2\2\u075b\u075a\3\2\2\2\u075b\u075c\3\2"+
		"\2\2\u075c\u075d\3\2\2\2\u075d\u075e\7\"\2\2\u075e\u0761\7\"\2\2\u075f"+
		"\u0761\3\2\2\2\u0760\u0756\3\2\2\2\u0760\u075b\3\2\2\2\u0760\u075f\3\2"+
		"\2\2\u0761\u0107\3\2\2\2\u0762\u0763\7#\2\2\u0763\u0765\7#\2\2\u0764\u0766"+
		"\7\67\2\2\u0765\u0764\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\3\2\2\2"+
		"\u0767\u076f\5\u0104\u0083\2\u0768\u0769\7\"\2\2\u0769\u076b\7\"\2\2\u076a"+
		"\u076c\7\67\2\2\u076b\u076a\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d\3"+
		"\2\2\2\u076d\u076f\5\u0104\u0083\2\u076e\u0762\3\2\2\2\u076e\u0768\3\2"+
		"\2\2\u076f\u0109\3\2\2\2\u0770\u0772\7#\2\2\u0771\u0773\7\67\2\2\u0772"+
		"\u0771\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0785\5\u010c"+
		"\u0087\2\u0775\u0777\7\"\2\2\u0776\u0778\7\67\2\2\u0777\u0776\3\2\2\2"+
		"\u0777\u0778\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u0785\5\u010c\u0087\2\u077a"+
		"\u077c\7<\2\2\u077b\u077d\7\67\2\2\u077c\u077b\3\2\2\2\u077c\u077d\3\2"+
		"\2\2\u077d\u077e\3\2\2\2\u077e\u0785\5\u010c\u0087\2\u077f\u0781\7\4\2"+
		"\2\u0780\u0782\7\67\2\2\u0781\u0780\3\2\2\2\u0781\u0782\3\2\2\2\u0782"+
		"\u0783\3\2\2\2\u0783\u0785\5\u010c\u0087\2\u0784\u0770\3\2\2\2\u0784\u0775"+
		"\3\2\2\2\u0784\u077a\3\2\2\2\u0784\u077f\3\2\2\2\u0785\u010b\3\2\2\2\u0786"+
		"\u078a\5\u0106\u0084\2\u0787\u078a\5\u0108\u0085\2\u0788\u078a\5\u010a"+
		"\u0086\2\u0789\u0786\3\2\2\2\u0789\u0787\3\2\2\2\u0789\u0788\3\2\2\2\u078a"+
		"\u010d\3\2\2\2\u078b\u0793\5\u010c\u0087\2\u078c\u078e\7$\2\2\u078d\u078f"+
		"\7\67\2\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790\3\2\2\2"+
		"\u0790\u0792\5\u010c\u0087\2\u0791\u078c\3\2\2\2\u0792\u0795\3\2\2\2\u0793"+
		"\u0791\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u010f\3\2\2\2\u0795\u0793\3\2"+
		"\2\2\u0796\u079e\5\u010e\u0088\2\u0797\u0799\t\20\2\2\u0798\u079a\7\67"+
		"\2\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079b\3\2\2\2\u079b"+
		"\u079d\5\u010e\u0088\2\u079c\u0797\3\2\2\2\u079d\u07a0\3\2\2\2\u079e\u079c"+
		"\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u0111\3\2\2\2\u07a0\u079e\3\2\2\2\u07a1"+
		"\u07a9\5\u0110\u0089\2\u07a2\u07a4\t\21\2\2\u07a3\u07a5\7\67\2\2\u07a4"+
		"\u07a3\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07a8\5\u0110"+
		"\u0089\2\u07a7\u07a2\3\2\2\2\u07a8\u07ab\3\2\2\2\u07a9\u07a7\3\2\2\2\u07a9"+
		"\u07aa\3\2\2\2\u07aa\u0113\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ac\u07b4\5\u0112"+
		"\u008a\2\u07ad\u07af\t\22\2\2\u07ae\u07b0\7\67\2\2\u07af\u07ae\3\2\2\2"+
		"\u07af\u07b0\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b3\5\u0112\u008a\2\u07b2"+
		"\u07ad\3\2\2\2\u07b3\u07b6\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2"+
		"\2\2\u07b5\u0115\3\2\2\2\u07b6\u07b4\3\2\2\2\u07b7\u07be\5\u0114\u008b"+
		"\2\u07b8\u07ba\5\u0118\u008d\2\u07b9\u07bb\7\67\2\2\u07ba\u07b9\3\2\2"+
		"\2\u07ba\u07bb\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07bd\5\u0114\u008b\2"+
		"\u07bd\u07bf\3\2\2\2\u07be\u07b8\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u0117"+
		"\3\2\2\2\u07c0\u07c1\7\'\2\2\u07c1\u07cb\7!\2\2\u07c2\u07c3\7(\2\2\u07c3"+
		"\u07cb\7!\2\2\u07c4\u07cb\7\'\2\2\u07c5\u07cb\7(\2\2\u07c6\u07c7\7!\2"+
		"\2\u07c7\u07cb\7!\2\2\u07c8\u07c9\7\4\2\2\u07c9\u07cb\7!\2\2\u07ca\u07c0"+
		"\3\2\2\2\u07ca\u07c2\3\2\2\2\u07ca\u07c4\3\2\2\2\u07ca\u07c5\3\2\2\2\u07ca"+
		"\u07c6\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb\u0119\3\2\2\2\u07cc\u07d4\5\u0116"+
		"\u008c\2\u07cd\u07cf\7%\2\2\u07ce\u07d0\7\67\2\2\u07cf\u07ce\3\2\2\2\u07cf"+
		"\u07d0\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d3\5\u0116\u008c\2\u07d2\u07cd"+
		"\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5"+
		"\u011b\3\2\2\2\u07d6\u07d4\3\2\2\2\u07d7\u07df\5\u011a\u008e\2\u07d8\u07da"+
		"\7&\2\2\u07d9\u07db\7\67\2\2\u07da\u07d9\3\2\2\2\u07da\u07db\3\2\2\2\u07db"+
		"\u07dc\3\2\2\2\u07dc\u07de\5\u011a\u008e\2\u07dd\u07d8\3\2\2\2\u07de\u07e1"+
		"\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u011d\3\2\2\2\u07e1"+
		"\u07df\3\2\2\2\u07e2\u07ea\5\u011c\u008f\2\u07e3\u07e5\7\60\2\2\u07e4"+
		"\u07e6\7\67\2\2\u07e5\u07e4\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\3"+
		"\2\2\2\u07e7\u07e9\5\u011c\u008f\2\u07e8\u07e3\3\2\2\2\u07e9\u07ec\3\2"+
		"\2\2\u07ea\u07e8\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u011f\3\2\2\2\u07ec"+
		"\u07ea\3\2\2\2\u07ed\u07f5\5\u011e\u0090\2\u07ee\u07f0\7G\2\2\u07ef\u07f1"+
		"\7\67\2\2\u07f0\u07ef\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\3\2\2\2"+
		"\u07f2\u07f4\5\u011e\u0090\2\u07f3\u07ee\3\2\2\2\u07f4\u07f7\3\2\2\2\u07f5"+
		"\u07f3\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u0121\3\2\2\2\u07f7\u07f5\3\2"+
		"\2\2\u07f8\u0800\5\u0120\u0091\2\u07f9\u07fb\7H\2\2\u07fa\u07fc\7\67\2"+
		"\2\u07fb\u07fa\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07ff"+
		"\5\u0120\u0091\2\u07fe\u07f9\3\2\2\2\u07ff\u0802\3\2\2\2\u0800\u07fe\3"+
		"\2\2\2\u0800\u0801\3\2\2\2\u0801\u0123\3\2\2\2\u0802\u0800\3\2\2\2\u0112"+
		"\u0125\u012a\u012e\u0132\u0135\u013d\u0146\u014c\u0152\u0157\u015b\u0160"+
		"\u0164\u016a\u0170\u0174\u0178\u017c\u0181\u0187\u0190\u0198\u019c\u01a2"+
		"\u01a9\u01af\u01b5\u01b8\u01bd\u01c0\u01c4\u01c9\u01cd\u01d1\u01d5\u01dc"+
		"\u01e2\u01e9\u01ef\u01f5\u0203\u0205\u020a\u020e\u0217\u021b\u021e\u0226"+
		"\u0233\u0237\u0240\u0243\u0245\u024a\u0251\u0257\u025b\u0260\u0265\u0272"+
		"\u0275\u0279\u027d\u0288\u028b\u028f\u0293\u029a\u02a3\u02b0\u02b2\u02b9"+
		"\u02bf\u02c6\u02cc\u02d0\u02d4\u02d8\u02e6\u02e9\u02ed\u02f0\u02f4\u02f6"+
		"\u02fa\u0302\u0306\u030a\u030d\u0311\u0314\u031e\u0321\u0325\u0328\u032c"+
		"\u0330\u0333\u0337\u033a\u033d\u0340\u034b\u0359\u036d\u0375\u0384\u0390"+
		"\u03a9\u03ab\u03ae\u03b2\u03b4\u03b8\u03bc\u03c1\u03c5\u03cb\u03ce\u03d5"+
		"\u03db\u03df\u03e3\u03e6\u03e9\u03f5\u03f9\u0411\u0414\u0418\u041c\u0421"+
		"\u0426\u042a\u042f\u0438\u043c\u0443\u045a\u0464\u0467\u0477\u0479\u0487"+
		"\u048b\u048e\u0492\u0494\u049d\u04a7\u04b0\u04b4\u04bb\u04c7\u04d1\u04ed"+
		"\u04f3\u04f7\u04fc\u0501\u0506\u0509\u0515\u0519\u051f\u0531\u0536\u053a"+
		"\u053e\u0562\u056e\u0571\u057a\u0586\u0592\u059e\u05aa\u05b2\u05b7\u05c0"+
		"\u05c5\u05c9\u05ce\u05e0\u05fb\u0603\u0608\u060b\u060f\u0612\u061b\u061e"+
		"\u0620\u0629\u062c\u0630\u0637\u0645\u064b\u064d\u0652\u0657\u0661\u0664"+
		"\u066d\u0682\u0687\u068b\u0690\u0695\u069f\u06a4\u06a7\u06ac\u06b4\u06bb"+
		"\u06c2\u06ca\u06cf\u06d7\u06db\u06e2\u06e6\u06ee\u06f2\u06f6\u06fb\u0700"+
		"\u0708\u070c\u0712\u0716\u0721\u0723\u073b\u0748\u074b\u074f\u0753\u0756"+
		"\u075b\u0760\u0765\u076b\u076e\u0772\u0777\u077c\u0781\u0784\u0789\u078e"+
		"\u0793\u0799\u079e\u07a4\u07a9\u07af\u07b4\u07ba\u07be\u07ca\u07cf\u07d4"+
		"\u07da\u07df\u07e5\u07ea\u07f0\u07f5\u07fb\u0800";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}