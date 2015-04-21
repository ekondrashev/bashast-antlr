import org.antlr.v4.runtime.misc.NotNull;

public class GenerateSourceListener extends BashastBaseListener {

	@Override
	public void enterFirst_line_comment(
			@NotNull BashastParser.First_line_commentContext ctx) {
		System.out.println("Enter first line comment");
	}

	@Override
	public void enterFor_expr(@NotNull BashastParser.For_exprContext ctx) {
		System.out.println("Enter for expr");
	}

	@Override
	public void enterCommand(@NotNull BashastParser.CommandContext ctx) {
		System.out.println(String.format("Enter command: %s", ctx.getText()));
	}

}
