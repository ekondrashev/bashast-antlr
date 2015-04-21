

import java.lang.Exception;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/bash/test.sh"};
        }

        System.out.println("parsing: " + args[0]);

        BashastLexer lexer = new BashastLexer(new ANTLRFileStream(args[0]));
        BashastParser parser = new BashastParser(new CommonTokenStream(lexer));
        parser.setTrace(true);
        
        ParseTree tree = parser.start();
        
        System.out.println(tree.getChildCount());
        GenerateSourceListener listener = new GenerateSourceListener();
        
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        
    }
}
