/*
 * generated by Xtext 2.28.0
 */
package fr.n7.ui.quickfix;

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
public class PDL2QuickfixProvider extends DefaultQuickfixProvider {

//	@Fix(PDL2Validator.INVALID_NAME)
//	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
//			public void apply(IModificationContext context) throws BadLocationException {
//				IXtextDocument xtextDocument = context.getXtextDocument();
//				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
//				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
//			}
//		});
//	}

}
