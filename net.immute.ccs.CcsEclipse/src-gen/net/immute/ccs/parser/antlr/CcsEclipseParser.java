/*
* generated by Xtext
*/
package net.immute.ccs.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import net.immute.ccs.services.CcsEclipseGrammarAccess;

public class CcsEclipseParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CcsEclipseGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected net.immute.ccs.parser.antlr.internal.InternalCcsEclipseParser createParser(XtextTokenStream stream) {
		return new net.immute.ccs.parser.antlr.internal.InternalCcsEclipseParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "RuleSet";
	}
	
	public CcsEclipseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CcsEclipseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}