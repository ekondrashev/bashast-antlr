// Generated from src/main/antlr4/Bashast.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BashastParser}.
 */
public interface BashastListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BashastParser#command_substitution}.
	 * @param ctx the parse tree
	 */
	void enterCommand_substitution(@NotNull BashastParser.Command_substitutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#command_substitution}.
	 * @param ctx the parse tree
	 */
	void exitCommand_substitution(@NotNull BashastParser.Command_substitutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#redirection_atom}.
	 * @param ctx the parse tree
	 */
	void enterRedirection_atom(@NotNull BashastParser.Redirection_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#redirection_atom}.
	 * @param ctx the parse tree
	 */
	void exitRedirection_atom(@NotNull BashastParser.Redirection_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bash_command_arguments}.
	 * @param ctx the parse tree
	 */
	void enterBash_command_arguments(@NotNull BashastParser.Bash_command_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bash_command_arguments}.
	 * @param ctx the parse tree
	 */
	void exitBash_command_arguments(@NotNull BashastParser.Bash_command_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#non_dquote}.
	 * @param ctx the parse tree
	 */
	void enterNon_dquote(@NotNull BashastParser.Non_dquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#non_dquote}.
	 * @param ctx the parse tree
	 */
	void exitNon_dquote(@NotNull BashastParser.Non_dquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#keyword_negation_primary}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_negation_primary(@NotNull BashastParser.Keyword_negation_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#keyword_negation_primary}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_negation_primary(@NotNull BashastParser.Keyword_negation_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#parameter_delete_pattern}.
	 * @param ctx the parse tree
	 */
	void enterParameter_delete_pattern(@NotNull BashastParser.Parameter_delete_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#parameter_delete_pattern}.
	 * @param ctx the parse tree
	 */
	void exitParameter_delete_pattern(@NotNull BashastParser.Parameter_delete_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#parameter_replace_pattern}.
	 * @param ctx the parse tree
	 */
	void enterParameter_replace_pattern(@NotNull BashastParser.Parameter_replace_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#parameter_replace_pattern}.
	 * @param ctx the parse tree
	 */
	void exitParameter_replace_pattern(@NotNull BashastParser.Parameter_replace_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#command_separator}.
	 * @param ctx the parse tree
	 */
	void enterCommand_separator(@NotNull BashastParser.Command_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#command_separator}.
	 * @param ctx the parse tree
	 */
	void exitCommand_separator(@NotNull BashastParser.Command_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#compound_command}.
	 * @param ctx the parse tree
	 */
	void enterCompound_command(@NotNull BashastParser.Compound_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#compound_command}.
	 * @param ctx the parse tree
	 */
	void exitCompound_command(@NotNull BashastParser.Compound_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#pattern_class_match}.
	 * @param ctx the parse tree
	 */
	void enterPattern_class_match(@NotNull BashastParser.Pattern_class_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#pattern_class_match}.
	 * @param ctx the parse tree
	 */
	void exitPattern_class_match(@NotNull BashastParser.Pattern_class_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#times_division_modulus}.
	 * @param ctx the parse tree
	 */
	void enterTimes_division_modulus(@NotNull BashastParser.Times_division_modulusContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#times_division_modulus}.
	 * @param ctx the parse tree
	 */
	void exitTimes_division_modulus(@NotNull BashastParser.Times_division_modulusContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(@NotNull BashastParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(@NotNull BashastParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(@NotNull BashastParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(@NotNull BashastParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_negation_primary}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_negation_primary(@NotNull BashastParser.Builtin_negation_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_negation_primary}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_negation_primary(@NotNull BashastParser.Builtin_negation_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#explicit_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_arithmetic(@NotNull BashastParser.Explicit_arithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#explicit_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_arithmetic(@NotNull BashastParser.Explicit_arithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#semiel}.
	 * @param ctx the parse tree
	 */
	void enterSemiel(@NotNull BashastParser.SemielContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#semiel}.
	 * @param ctx the parse tree
	 */
	void exitSemiel(@NotNull BashastParser.SemielContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#redirection_operator}.
	 * @param ctx the parse tree
	 */
	void enterRedirection_operator(@NotNull BashastParser.Redirection_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#redirection_operator}.
	 * @param ctx the parse tree
	 */
	void exitRedirection_operator(@NotNull BashastParser.Redirection_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#arithmetic_assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_assignment_operator(@NotNull BashastParser.Arithmetic_assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#arithmetic_assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_assignment_operator(@NotNull BashastParser.Arithmetic_assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#keyword_condition_binary}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_condition_binary(@NotNull BashastParser.Keyword_condition_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#keyword_condition_binary}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_condition_binary(@NotNull BashastParser.Keyword_condition_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#parameter_expansion_value}.
	 * @param ctx the parse tree
	 */
	void enterParameter_expansion_value(@NotNull BashastParser.Parameter_expansion_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#parameter_expansion_value}.
	 * @param ctx the parse tree
	 */
	void exitParameter_expansion_value(@NotNull BashastParser.Parameter_expansion_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_condition_and}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_condition_and(@NotNull BashastParser.Builtin_condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_condition_and}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_condition_and(@NotNull BashastParser.Builtin_condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#preserved_tokens}.
	 * @param ctx the parse tree
	 */
	void enterPreserved_tokens(@NotNull BashastParser.Preserved_tokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#preserved_tokens}.
	 * @param ctx the parse tree
	 */
	void exitPreserved_tokens(@NotNull BashastParser.Preserved_tokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(@NotNull BashastParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(@NotNull BashastParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(@NotNull BashastParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(@NotNull BashastParser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull BashastParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull BashastParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_condition_binary}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_condition_binary(@NotNull BashastParser.Builtin_condition_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_condition_binary}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_condition_binary(@NotNull BashastParser.Builtin_condition_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#keyword_condition_unary}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_condition_unary(@NotNull BashastParser.Keyword_condition_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#keyword_condition_unary}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_condition_unary(@NotNull BashastParser.Keyword_condition_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bitwiseand}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseand(@NotNull BashastParser.BitwiseandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bitwiseand}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseand(@NotNull BashastParser.BitwiseandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(@NotNull BashastParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(@NotNull BashastParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#array_size_index}.
	 * @param ctx the parse tree
	 */
	void enterArray_size_index(@NotNull BashastParser.Array_size_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#array_size_index}.
	 * @param ctx the parse tree
	 */
	void exitArray_size_index(@NotNull BashastParser.Array_size_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#parameter_replace_operator}.
	 * @param ctx the parse tree
	 */
	void enterParameter_replace_operator(@NotNull BashastParser.Parameter_replace_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#parameter_replace_operator}.
	 * @param ctx the parse tree
	 */
	void exitParameter_replace_operator(@NotNull BashastParser.Parameter_replace_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull BashastParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull BashastParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#brace_expansion_inside}.
	 * @param ctx the parse tree
	 */
	void enterBrace_expansion_inside(@NotNull BashastParser.Brace_expansion_insideContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#brace_expansion_inside}.
	 * @param ctx the parse tree
	 */
	void exitBrace_expansion_inside(@NotNull BashastParser.Brace_expansion_insideContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#variable_size_ref}.
	 * @param ctx the parse tree
	 */
	void enterVariable_size_ref(@NotNull BashastParser.Variable_size_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#variable_size_ref}.
	 * @param ctx the parse tree
	 */
	void exitVariable_size_ref(@NotNull BashastParser.Variable_size_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#command_name}.
	 * @param ctx the parse tree
	 */
	void enterCommand_name(@NotNull BashastParser.Command_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#command_name}.
	 * @param ctx the parse tree
	 */
	void exitCommand_name(@NotNull BashastParser.Command_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#parameter_pattern_part}.
	 * @param ctx the parse tree
	 */
	void enterParameter_pattern_part(@NotNull BashastParser.Parameter_pattern_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#parameter_pattern_part}.
	 * @param ctx the parse tree
	 */
	void exitParameter_pattern_part(@NotNull BashastParser.Parameter_pattern_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_condition_primary}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_condition_primary(@NotNull BashastParser.Builtin_condition_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_condition_primary}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_condition_primary(@NotNull BashastParser.Builtin_condition_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#reserved_word}.
	 * @param ctx the parse tree
	 */
	void enterReserved_word(@NotNull BashastParser.Reserved_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#reserved_word}.
	 * @param ctx the parse tree
	 */
	void exitReserved_word(@NotNull BashastParser.Reserved_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull BashastParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull BashastParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#arithmetics_test}.
	 * @param ctx the parse tree
	 */
	void enterArithmetics_test(@NotNull BashastParser.Arithmetics_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#arithmetics_test}.
	 * @param ctx the parse tree
	 */
	void exitArithmetics_test(@NotNull BashastParser.Arithmetics_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bash_command}.
	 * @param ctx the parse tree
	 */
	void enterBash_command(@NotNull BashastParser.Bash_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bash_command}.
	 * @param ctx the parse tree
	 */
	void exitBash_command(@NotNull BashastParser.Bash_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_variable_definition_item}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_variable_definition_item(@NotNull BashastParser.Builtin_variable_definition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_variable_definition_item}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_variable_definition_item(@NotNull BashastParser.Builtin_variable_definition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#here_document}.
	 * @param ctx the parse tree
	 */
	void enterHere_document(@NotNull BashastParser.Here_documentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#here_document}.
	 * @param ctx the parse tree
	 */
	void exitHere_document(@NotNull BashastParser.Here_documentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#string_expr}.
	 * @param ctx the parse tree
	 */
	void enterString_expr(@NotNull BashastParser.String_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#string_expr}.
	 * @param ctx the parse tree
	 */
	void exitString_expr(@NotNull BashastParser.String_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull BashastParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull BashastParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#keyword_binary_string_operator}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_binary_string_operator(@NotNull BashastParser.Keyword_binary_string_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#keyword_binary_string_operator}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_binary_string_operator(@NotNull BashastParser.Keyword_binary_string_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#parameter_expansion_value_atom}.
	 * @param ctx the parse tree
	 */
	void enterParameter_expansion_value_atom(@NotNull BashastParser.Parameter_expansion_value_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#parameter_expansion_value_atom}.
	 * @param ctx the parse tree
	 */
	void exitParameter_expansion_value_atom(@NotNull BashastParser.Parameter_expansion_value_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#here_document_operator}.
	 * @param ctx the parse tree
	 */
	void enterHere_document_operator(@NotNull BashastParser.Here_document_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#here_document_operator}.
	 * @param ctx the parse tree
	 */
	void exitHere_document_operator(@NotNull BashastParser.Here_document_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(@NotNull BashastParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(@NotNull BashastParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_logic_or}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_logic_or(@NotNull BashastParser.Builtin_logic_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_logic_or}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_logic_or(@NotNull BashastParser.Builtin_logic_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#pattern_char}.
	 * @param ctx the parse tree
	 */
	void enterPattern_char(@NotNull BashastParser.Pattern_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#pattern_char}.
	 * @param ctx the parse tree
	 */
	void exitPattern_char(@NotNull BashastParser.Pattern_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#command_atom}.
	 * @param ctx the parse tree
	 */
	void enterCommand_atom(@NotNull BashastParser.Command_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#command_atom}.
	 * @param ctx the parse tree
	 */
	void exitCommand_atom(@NotNull BashastParser.Command_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_condition_unary}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_condition_unary(@NotNull BashastParser.Builtin_condition_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_condition_unary}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_condition_unary(@NotNull BashastParser.Builtin_condition_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#wspace}.
	 * @param ctx the parse tree
	 */
	void enterWspace(@NotNull BashastParser.WspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#wspace}.
	 * @param ctx the parse tree
	 */
	void exitWspace(@NotNull BashastParser.WspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#variable_definition_atom}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition_atom(@NotNull BashastParser.Variable_definition_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#variable_definition_atom}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition_atom(@NotNull BashastParser.Variable_definition_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#ns_string_part}.
	 * @param ctx the parse tree
	 */
	void enterNs_string_part(@NotNull BashastParser.Ns_string_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#ns_string_part}.
	 * @param ctx the parse tree
	 */
	void exitNs_string_part(@NotNull BashastParser.Ns_string_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#compare_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompare_operator(@NotNull BashastParser.Compare_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#compare_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompare_operator(@NotNull BashastParser.Compare_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#pre_post_primary}.
	 * @param ctx the parse tree
	 */
	void enterPre_post_primary(@NotNull BashastParser.Pre_post_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#pre_post_primary}.
	 * @param ctx the parse tree
	 */
	void exitPre_post_primary(@NotNull BashastParser.Pre_post_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#array_atom}.
	 * @param ctx the parse tree
	 */
	void enterArray_atom(@NotNull BashastParser.Array_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#array_atom}.
	 * @param ctx the parse tree
	 */
	void exitArray_atom(@NotNull BashastParser.Array_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#string_expr_no_reserved_word}.
	 * @param ctx the parse tree
	 */
	void enterString_expr_no_reserved_word(@NotNull BashastParser.String_expr_no_reserved_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#string_expr_no_reserved_word}.
	 * @param ctx the parse tree
	 */
	void exitString_expr_no_reserved_word(@NotNull BashastParser.String_expr_no_reserved_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#first_line_comment}.
	 * @param ctx the parse tree
	 */
	void enterFirst_line_comment(@NotNull BashastParser.First_line_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#first_line_comment}.
	 * @param ctx the parse tree
	 */
	void exitFirst_line_comment(@NotNull BashastParser.First_line_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#expansion_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpansion_atom(@NotNull BashastParser.Expansion_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#expansion_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpansion_atom(@NotNull BashastParser.Expansion_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#non_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterNon_quoted_string(@NotNull BashastParser.Non_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#non_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitNon_quoted_string(@NotNull BashastParser.Non_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#addsub}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(@NotNull BashastParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#addsub}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(@NotNull BashastParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull BashastParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull BashastParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#expansion_base}.
	 * @param ctx the parse tree
	 */
	void enterExpansion_base(@NotNull BashastParser.Expansion_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#expansion_base}.
	 * @param ctx the parse tree
	 */
	void exitExpansion_base(@NotNull BashastParser.Expansion_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#commasep}.
	 * @param ctx the parse tree
	 */
	void enterCommasep(@NotNull BashastParser.CommasepContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#commasep}.
	 * @param ctx the parse tree
	 */
	void exitCommasep(@NotNull BashastParser.CommasepContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#string_expr_part}.
	 * @param ctx the parse tree
	 */
	void enterString_expr_part(@NotNull BashastParser.String_expr_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#string_expr_part}.
	 * @param ctx the parse tree
	 */
	void exitString_expr_part(@NotNull BashastParser.String_expr_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bitwisexor}.
	 * @param ctx the parse tree
	 */
	void enterBitwisexor(@NotNull BashastParser.BitwisexorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bitwisexor}.
	 * @param ctx the parse tree
	 */
	void exitBitwisexor(@NotNull BashastParser.BitwisexorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#string_part}.
	 * @param ctx the parse tree
	 */
	void enterString_part(@NotNull BashastParser.String_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#string_part}.
	 * @param ctx the parse tree
	 */
	void exitString_part(@NotNull BashastParser.String_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#extended_pattern}.
	 * @param ctx the parse tree
	 */
	void enterExtended_pattern(@NotNull BashastParser.Extended_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#extended_pattern}.
	 * @param ctx the parse tree
	 */
	void exitExtended_pattern(@NotNull BashastParser.Extended_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile_expr(@NotNull BashastParser.While_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile_expr(@NotNull BashastParser.While_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#arithmetic_part}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_part(@NotNull BashastParser.Arithmetic_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#arithmetic_part}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_part(@NotNull BashastParser.Arithmetic_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#keyword_condition}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_condition(@NotNull BashastParser.Keyword_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#keyword_condition}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_condition(@NotNull BashastParser.Keyword_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bracket_pattern_part}.
	 * @param ctx the parse tree
	 */
	void enterBracket_pattern_part(@NotNull BashastParser.Bracket_pattern_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bracket_pattern_part}.
	 * @param ctx the parse tree
	 */
	void exitBracket_pattern_part(@NotNull BashastParser.Bracket_pattern_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bash_pattern_part}.
	 * @param ctx the parse tree
	 */
	void enterBash_pattern_part(@NotNull BashastParser.Bash_pattern_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bash_pattern_part}.
	 * @param ctx the parse tree
	 */
	void exitBash_pattern_part(@NotNull BashastParser.Bash_pattern_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull BashastParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull BashastParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#list_level_2}.
	 * @param ctx the parse tree
	 */
	void enterList_level_2(@NotNull BashastParser.List_level_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#list_level_2}.
	 * @param ctx the parse tree
	 */
	void exitList_level_2(@NotNull BashastParser.List_level_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#command_list}.
	 * @param ctx the parse tree
	 */
	void enterCommand_list(@NotNull BashastParser.Command_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#command_list}.
	 * @param ctx the parse tree
	 */
	void exitCommand_list(@NotNull BashastParser.Command_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(@NotNull BashastParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(@NotNull BashastParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#variable_name_for_bang}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name_for_bang(@NotNull BashastParser.Variable_name_for_bangContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#variable_name_for_bang}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name_for_bang(@NotNull BashastParser.Variable_name_for_bangContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#list_level_1}.
	 * @param ctx the parse tree
	 */
	void enterList_level_1(@NotNull BashastParser.List_level_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#list_level_1}.
	 * @param ctx the parse tree
	 */
	void exitList_level_1(@NotNull BashastParser.List_level_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull BashastParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull BashastParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull BashastParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull BashastParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(@NotNull BashastParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(@NotNull BashastParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_binary_string_operator}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_binary_string_operator(@NotNull BashastParser.Builtin_binary_string_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_binary_string_operator}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_binary_string_operator(@NotNull BashastParser.Builtin_binary_string_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expr(@NotNull BashastParser.Select_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expr(@NotNull BashastParser.Select_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#post_inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterPost_inc_dec(@NotNull BashastParser.Post_inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#post_inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitPost_inc_dec(@NotNull BashastParser.Post_inc_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#shifts}.
	 * @param ctx the parse tree
	 */
	void enterShifts(@NotNull BashastParser.ShiftsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#shifts}.
	 * @param ctx the parse tree
	 */
	void exitShifts(@NotNull BashastParser.ShiftsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#parameter_delete_operator}.
	 * @param ctx the parse tree
	 */
	void enterParameter_delete_operator(@NotNull BashastParser.Parameter_delete_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#parameter_delete_operator}.
	 * @param ctx the parse tree
	 */
	void exitParameter_delete_operator(@NotNull BashastParser.Parameter_delete_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(@NotNull BashastParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(@NotNull BashastParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#exponential}.
	 * @param ctx the parse tree
	 */
	void enterExponential(@NotNull BashastParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#exponential}.
	 * @param ctx the parse tree
	 */
	void exitExponential(@NotNull BashastParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#keyword_condition_primary}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_condition_primary(@NotNull BashastParser.Keyword_condition_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#keyword_condition_primary}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_condition_primary(@NotNull BashastParser.Keyword_condition_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#pre_inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterPre_inc_dec(@NotNull BashastParser.Pre_inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#pre_inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitPre_inc_dec(@NotNull BashastParser.Pre_inc_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bracket_pattern_match_operator}.
	 * @param ctx the parse tree
	 */
	void enterBracket_pattern_match_operator(@NotNull BashastParser.Bracket_pattern_match_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bracket_pattern_match_operator}.
	 * @param ctx the parse tree
	 */
	void exitBracket_pattern_match_operator(@NotNull BashastParser.Bracket_pattern_match_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#here_document_end}.
	 * @param ctx the parse tree
	 */
	void enterHere_document_end(@NotNull BashastParser.Here_document_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#here_document_end}.
	 * @param ctx the parse tree
	 */
	void exitHere_document_end(@NotNull BashastParser.Here_document_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#until_expr}.
	 * @param ctx the parse tree
	 */
	void enterUntil_expr(@NotNull BashastParser.Until_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#until_expr}.
	 * @param ctx the parse tree
	 */
	void exitUntil_expr(@NotNull BashastParser.Until_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_variable_definition_atom}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_variable_definition_atom(@NotNull BashastParser.Builtin_variable_definition_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_variable_definition_atom}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_variable_definition_atom(@NotNull BashastParser.Builtin_variable_definition_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#arithmetics}.
	 * @param ctx the parse tree
	 */
	void enterArithmetics(@NotNull BashastParser.ArithmeticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#arithmetics}.
	 * @param ctx the parse tree
	 */
	void exitArithmetics(@NotNull BashastParser.ArithmeticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#here_document_content}.
	 * @param ctx the parse tree
	 */
	void enterHere_document_content(@NotNull BashastParser.Here_document_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#here_document_content}.
	 * @param ctx the parse tree
	 */
	void exitHere_document_content(@NotNull BashastParser.Here_document_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull BashastParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull BashastParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#brace_expansion}.
	 * @param ctx the parse tree
	 */
	void enterBrace_expansion(@NotNull BashastParser.Brace_expansionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#brace_expansion}.
	 * @param ctx the parse tree
	 */
	void exitBrace_expansion(@NotNull BashastParser.Brace_expansionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void enterVariable_reference(@NotNull BashastParser.Variable_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void exitVariable_reference(@NotNull BashastParser.Variable_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expr(@NotNull BashastParser.Condition_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expr(@NotNull BashastParser.Condition_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#arithmetic_variable_reference}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_variable_reference(@NotNull BashastParser.Arithmetic_variable_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#arithmetic_variable_reference}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_variable_reference(@NotNull BashastParser.Arithmetic_variable_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#brace_expansion_part}.
	 * @param ctx the parse tree
	 */
	void enterBrace_expansion_part(@NotNull BashastParser.Brace_expansion_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#brace_expansion_part}.
	 * @param ctx the parse tree
	 */
	void exitBrace_expansion_part(@NotNull BashastParser.Brace_expansion_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void enterFor_expr(@NotNull BashastParser.For_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void exitFor_expr(@NotNull BashastParser.For_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#extended_pattern_match}.
	 * @param ctx the parse tree
	 */
	void enterExtended_pattern_match(@NotNull BashastParser.Extended_pattern_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#extended_pattern_match}.
	 * @param ctx the parse tree
	 */
	void exitExtended_pattern_match(@NotNull BashastParser.Extended_pattern_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bitwiseor}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseor(@NotNull BashastParser.BitwiseorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bitwiseor}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseor(@NotNull BashastParser.BitwiseorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#case_body}.
	 * @param ctx the parse tree
	 */
	void enterCase_body(@NotNull BashastParser.Case_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#case_body}.
	 * @param ctx the parse tree
	 */
	void exitCase_body(@NotNull BashastParser.Case_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#here_document_begin}.
	 * @param ctx the parse tree
	 */
	void enterHere_document_begin(@NotNull BashastParser.Here_document_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#here_document_begin}.
	 * @param ctx the parse tree
	 */
	void exitHere_document_begin(@NotNull BashastParser.Here_document_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bracket_pattern_match}.
	 * @param ctx the parse tree
	 */
	void enterBracket_pattern_match(@NotNull BashastParser.Bracket_pattern_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bracket_pattern_match}.
	 * @param ctx the parse tree
	 */
	void exitBracket_pattern_match(@NotNull BashastParser.Bracket_pattern_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#current_shell}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_shell(@NotNull BashastParser.Current_shellContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#current_shell}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_shell(@NotNull BashastParser.Current_shellContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#keyword_condition_and}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_condition_and(@NotNull BashastParser.Keyword_condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#keyword_condition_and}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_condition_and(@NotNull BashastParser.Keyword_condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#here_string}.
	 * @param ctx the parse tree
	 */
	void enterHere_string(@NotNull BashastParser.Here_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#here_string}.
	 * @param ctx the parse tree
	 */
	void exitHere_string(@NotNull BashastParser.Here_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_condition}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_condition(@NotNull BashastParser.Builtin_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_condition}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_condition(@NotNull BashastParser.Builtin_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#subshell}.
	 * @param ctx the parse tree
	 */
	void enterSubshell(@NotNull BashastParser.SubshellContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#subshell}.
	 * @param ctx the parse tree
	 */
	void exitSubshell(@NotNull BashastParser.SubshellContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#elif_expr}.
	 * @param ctx the parse tree
	 */
	void enterElif_expr(@NotNull BashastParser.Elif_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#elif_expr}.
	 * @param ctx the parse tree
	 */
	void exitElif_expr(@NotNull BashastParser.Elif_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bracket_pattern}.
	 * @param ctx the parse tree
	 */
	void enterBracket_pattern(@NotNull BashastParser.Bracket_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bracket_pattern}.
	 * @param ctx the parse tree
	 */
	void exitBracket_pattern(@NotNull BashastParser.Bracket_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#bash_command_argument_atom}.
	 * @param ctx the parse tree
	 */
	void enterBash_command_argument_atom(@NotNull BashastParser.Bash_command_argument_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#bash_command_argument_atom}.
	 * @param ctx the parse tree
	 */
	void exitBash_command_argument_atom(@NotNull BashastParser.Bash_command_argument_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#parameter_value_operator}.
	 * @param ctx the parse tree
	 */
	void enterParameter_value_operator(@NotNull BashastParser.Parameter_value_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#parameter_value_operator}.
	 * @param ctx the parse tree
	 */
	void exitParameter_value_operator(@NotNull BashastParser.Parameter_value_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#redirection_destination}.
	 * @param ctx the parse tree
	 */
	void enterRedirection_destination(@NotNull BashastParser.Redirection_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#redirection_destination}.
	 * @param ctx the parse tree
	 */
	void exitRedirection_destination(@NotNull BashastParser.Redirection_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#escaped_character}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_character(@NotNull BashastParser.Escaped_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#escaped_character}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_character(@NotNull BashastParser.Escaped_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#parameter_expansion}.
	 * @param ctx the parse tree
	 */
	void enterParameter_expansion(@NotNull BashastParser.Parameter_expansionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#parameter_expansion}.
	 * @param ctx the parse tree
	 */
	void exitParameter_expansion(@NotNull BashastParser.Parameter_expansionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull BashastParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull BashastParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(@NotNull BashastParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(@NotNull BashastParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_logic_and}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_logic_and(@NotNull BashastParser.Builtin_logic_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_logic_and}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_logic_and(@NotNull BashastParser.Builtin_logic_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#condition_part}.
	 * @param ctx the parse tree
	 */
	void enterCondition_part(@NotNull BashastParser.Condition_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#condition_part}.
	 * @param ctx the parse tree
	 */
	void exitCondition_part(@NotNull BashastParser.Condition_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#double_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quoted_string(@NotNull BashastParser.Double_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#double_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quoted_string(@NotNull BashastParser.Double_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#array_value}.
	 * @param ctx the parse tree
	 */
	void enterArray_value(@NotNull BashastParser.Array_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#array_value}.
	 * @param ctx the parse tree
	 */
	void exitArray_value(@NotNull BashastParser.Array_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#process_substitution}.
	 * @param ctx the parse tree
	 */
	void enterProcess_substitution(@NotNull BashastParser.Process_substitutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#process_substitution}.
	 * @param ctx the parse tree
	 */
	void exitProcess_substitution(@NotNull BashastParser.Process_substitutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#file_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterFile_descriptor(@NotNull BashastParser.File_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#file_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitFile_descriptor(@NotNull BashastParser.File_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#logicor}.
	 * @param ctx the parse tree
	 */
	void enterLogicor(@NotNull BashastParser.LogicorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#logicor}.
	 * @param ctx the parse tree
	 */
	void exitLogicor(@NotNull BashastParser.LogicorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#redirection}.
	 * @param ctx the parse tree
	 */
	void enterRedirection(@NotNull BashastParser.RedirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#redirection}.
	 * @param ctx the parse tree
	 */
	void exitRedirection(@NotNull BashastParser.RedirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#time_posix}.
	 * @param ctx the parse tree
	 */
	void enterTime_posix(@NotNull BashastParser.Time_posixContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#time_posix}.
	 * @param ctx the parse tree
	 */
	void exitTime_posix(@NotNull BashastParser.Time_posixContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#builtin_variable_definitions}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_variable_definitions(@NotNull BashastParser.Builtin_variable_definitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#builtin_variable_definitions}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_variable_definitions(@NotNull BashastParser.Builtin_variable_definitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#for_each_value}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_value(@NotNull BashastParser.For_each_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#for_each_value}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_value(@NotNull BashastParser.For_each_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#unary_with_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_with_operator(@NotNull BashastParser.Unary_with_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#unary_with_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_with_operator(@NotNull BashastParser.Unary_with_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#all_expansions}.
	 * @param ctx the parse tree
	 */
	void enterAll_expansions(@NotNull BashastParser.All_expansionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#all_expansions}.
	 * @param ctx the parse tree
	 */
	void exitAll_expansions(@NotNull BashastParser.All_expansionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#condition_comparison}.
	 * @param ctx the parse tree
	 */
	void enterCondition_comparison(@NotNull BashastParser.Condition_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#condition_comparison}.
	 * @param ctx the parse tree
	 */
	void exitCondition_comparison(@NotNull BashastParser.Condition_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#logicand}.
	 * @param ctx the parse tree
	 */
	void enterLogicand(@NotNull BashastParser.LogicandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#logicand}.
	 * @param ctx the parse tree
	 */
	void exitLogicand(@NotNull BashastParser.LogicandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#variable_name_no_digit}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name_no_digit(@NotNull BashastParser.Variable_name_no_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#variable_name_no_digit}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name_no_digit(@NotNull BashastParser.Variable_name_no_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void enterPipeline(@NotNull BashastParser.PipelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void exitPipeline(@NotNull BashastParser.PipelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#arithmetic_expansion}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expansion(@NotNull BashastParser.Arithmetic_expansionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#arithmetic_expansion}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expansion(@NotNull BashastParser.Arithmetic_expansionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashastParser#variable_definitions}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definitions(@NotNull BashastParser.Variable_definitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashastParser#variable_definitions}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definitions(@NotNull BashastParser.Variable_definitionsContext ctx);
}