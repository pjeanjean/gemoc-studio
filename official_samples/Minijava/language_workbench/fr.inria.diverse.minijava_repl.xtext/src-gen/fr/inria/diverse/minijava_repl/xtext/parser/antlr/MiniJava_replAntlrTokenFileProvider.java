/*
 * generated by Xtext 2.24.0
 */
package fr.inria.diverse.minijava_repl.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MiniJava_replAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/inria/diverse/minijava_repl/xtext/parser/antlr/internal/InternalMiniJava_repl.tokens");
	}
}
