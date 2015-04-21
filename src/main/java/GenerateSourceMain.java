

import java.lang.Exception;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class GenerateSourceMain {

    public static void main(String[] args) throws Exception {

        ParserRuleContext  start = new BashastParser.StartContext(null, -1);
        BashastParser.First_line_commentContext firstlineComment = new BashastParser.First_line_commentContext((ParserRuleContext) start, -1);
        start.addChild(firstlineComment);
        System.out.println(start.getChildCount());
        GenerateSourceListener listener = new GenerateSourceListener();
        
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, start);
        
    }
}
