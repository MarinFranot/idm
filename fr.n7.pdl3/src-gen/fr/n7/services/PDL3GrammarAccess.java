/*
 * generated by Xtext 2.28.0
 */
package fr.n7.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PDL3GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProcessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.Process");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcessKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cProcessElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cProcessElementsProcessElementParserRuleCall_3_0 = (RuleCall)cProcessElementsAssignment_3.eContents().get(0);
		
		//Process :
		//    'process' ':' name=ID
		//    processElements+=ProcessElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//'process' ':' name=ID
		//processElements+=ProcessElement*
		public Group getGroup() { return cGroup; }
		
		//'process'
		public Keyword getProcessKeyword_0() { return cProcessKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//processElements+=ProcessElement*
		public Assignment getProcessElementsAssignment_3() { return cProcessElementsAssignment_3; }
		
		//ProcessElement
		public RuleCall getProcessElementsProcessElementParserRuleCall_3_0() { return cProcessElementsProcessElementParserRuleCall_3_0; }
	}
	public class ProcessElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.ProcessElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cWorkdefinitionsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cWorkDefinitionParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cWorksequenceKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cWorkSequenceParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//ProcessElement :
		//     '
		//workdefinitions : 'WorkDefinition | 'worksequence : 'WorkSequence ;
		@Override public ParserRule getRule() { return rule; }
		
		//     '
		//workdefinitions : 'WorkDefinition | 'worksequence : 'WorkSequence
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//     '
		//workdefinitions : 'WorkDefinition
		public Group getGroup_0() { return cGroup_0; }
		
		//     '
		//workdefinitions : '
		public Keyword getWorkdefinitionsKeyword_0_0() { return cWorkdefinitionsKeyword_0_0; }
		
		//WorkDefinition
		public RuleCall getWorkDefinitionParserRuleCall_0_1() { return cWorkDefinitionParserRuleCall_0_1; }
		
		//'worksequence : 'WorkSequence
		public Group getGroup_1() { return cGroup_1; }
		
		//'worksequence : '
		public Keyword getWorksequenceKeyword_1_0() { return cWorksequenceKeyword_1_0; }
		
		//WorkSequence
		public RuleCall getWorkSequenceParserRuleCall_1_1() { return cWorkSequenceParserRuleCall_1_1; }
	}
	public class WorkDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.WorkDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//WorkDefinition :
		//    name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class WorkSequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.WorkSequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPredecessorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPredecessorWorkDefinitionCrossReference_0_0 = (CrossReference)cPredecessorAssignment_0.eContents().get(0);
		private final RuleCall cPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1 = (RuleCall)cPredecessorWorkDefinitionCrossReference_0_0.eContents().get(1);
		private final Assignment cLinkTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLinkTypeWorkSequenceTypeEnumRuleCall_1_0 = (RuleCall)cLinkTypeAssignment_1.eContents().get(0);
		private final Assignment cSuccessorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSuccessorWorkDefinitionCrossReference_2_0 = (CrossReference)cSuccessorAssignment_2.eContents().get(0);
		private final RuleCall cSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1 = (RuleCall)cSuccessorWorkDefinitionCrossReference_2_0.eContents().get(1);
		
		//WorkSequence :
		//    predecessor=[WorkDefinition]
		//    linkType=WorkSequenceType
		//    successor=[WorkDefinition]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//predecessor=[WorkDefinition]
		//linkType=WorkSequenceType
		//successor=[WorkDefinition]
		public Group getGroup() { return cGroup; }
		
		//predecessor=[WorkDefinition]
		public Assignment getPredecessorAssignment_0() { return cPredecessorAssignment_0; }
		
		//[WorkDefinition]
		public CrossReference getPredecessorWorkDefinitionCrossReference_0_0() { return cPredecessorWorkDefinitionCrossReference_0_0; }
		
		//ID
		public RuleCall getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1() { return cPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1; }
		
		//linkType=WorkSequenceType
		public Assignment getLinkTypeAssignment_1() { return cLinkTypeAssignment_1; }
		
		//WorkSequenceType
		public RuleCall getLinkTypeWorkSequenceTypeEnumRuleCall_1_0() { return cLinkTypeWorkSequenceTypeEnumRuleCall_1_0; }
		
		//successor=[WorkDefinition]
		public Assignment getSuccessorAssignment_2() { return cSuccessorAssignment_2; }
		
		//[WorkDefinition]
		public CrossReference getSuccessorWorkDefinitionCrossReference_2_0() { return cSuccessorWorkDefinitionCrossReference_2_0; }
		
		//ID
		public RuleCall getSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1() { return cSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1; }
	}
	
	public class WorkSequenceTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.WorkSequenceType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStart2startEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStart2startS2sKeyword_0_0 = (Keyword)cStart2startEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFinish2startEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFinish2startF2sKeyword_1_0 = (Keyword)cFinish2startEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cStart2finishEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cStart2finishS2fKeyword_2_0 = (Keyword)cStart2finishEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cFinish2finishEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cFinish2finishF2fKeyword_3_0 = (Keyword)cFinish2finishEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum WorkSequenceType :
		//    start2start = 's2s'
		//    | finish2start = 'f2s'
		//    | start2finish = 's2f'
		//    | finish2finish = 'f2f'
		//    ;
		public EnumRule getRule() { return rule; }
		
		//start2start = 's2s'
		//| finish2start = 'f2s'
		//| start2finish = 's2f'
		//| finish2finish = 'f2f'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//start2start = 's2s'
		public EnumLiteralDeclaration getStart2startEnumLiteralDeclaration_0() { return cStart2startEnumLiteralDeclaration_0; }
		
		//'s2s'
		public Keyword getStart2startS2sKeyword_0_0() { return cStart2startS2sKeyword_0_0; }
		
		//finish2start = 'f2s'
		public EnumLiteralDeclaration getFinish2startEnumLiteralDeclaration_1() { return cFinish2startEnumLiteralDeclaration_1; }
		
		//'f2s'
		public Keyword getFinish2startF2sKeyword_1_0() { return cFinish2startF2sKeyword_1_0; }
		
		//start2finish = 's2f'
		public EnumLiteralDeclaration getStart2finishEnumLiteralDeclaration_2() { return cStart2finishEnumLiteralDeclaration_2; }
		
		//'s2f'
		public Keyword getStart2finishS2fKeyword_2_0() { return cStart2finishS2fKeyword_2_0; }
		
		//finish2finish = 'f2f'
		public EnumLiteralDeclaration getFinish2finishEnumLiteralDeclaration_3() { return cFinish2finishEnumLiteralDeclaration_3; }
		
		//'f2f'
		public Keyword getFinish2finishF2fKeyword_3_0() { return cFinish2finishF2fKeyword_3_0; }
	}
	
	private final ProcessElements pProcess;
	private final ProcessElementElements pProcessElement;
	private final WorkDefinitionElements pWorkDefinition;
	private final WorkSequenceElements pWorkSequence;
	private final WorkSequenceTypeElements eWorkSequenceType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PDL3GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProcess = new ProcessElements();
		this.pProcessElement = new ProcessElementElements();
		this.pWorkDefinition = new WorkDefinitionElements();
		this.pWorkSequence = new WorkSequenceElements();
		this.eWorkSequenceType = new WorkSequenceTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.n7.PDL3".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Process :
	//    'process' ':' name=ID
	//    processElements+=ProcessElement*;
	public ProcessElements getProcessAccess() {
		return pProcess;
	}
	
	public ParserRule getProcessRule() {
		return getProcessAccess().getRule();
	}
	
	//ProcessElement :
	//     '
	//workdefinitions : 'WorkDefinition | 'worksequence : 'WorkSequence ;
	public ProcessElementElements getProcessElementAccess() {
		return pProcessElement;
	}
	
	public ParserRule getProcessElementRule() {
		return getProcessElementAccess().getRule();
	}
	
	//WorkDefinition :
	//    name=ID ';';
	public WorkDefinitionElements getWorkDefinitionAccess() {
		return pWorkDefinition;
	}
	
	public ParserRule getWorkDefinitionRule() {
		return getWorkDefinitionAccess().getRule();
	}
	
	//WorkSequence :
	//    predecessor=[WorkDefinition]
	//    linkType=WorkSequenceType
	//    successor=[WorkDefinition]
	//;
	public WorkSequenceElements getWorkSequenceAccess() {
		return pWorkSequence;
	}
	
	public ParserRule getWorkSequenceRule() {
		return getWorkSequenceAccess().getRule();
	}
	
	//enum WorkSequenceType :
	//    start2start = 's2s'
	//    | finish2start = 'f2s'
	//    | start2finish = 's2f'
	//    | finish2finish = 'f2f'
	//    ;
	public WorkSequenceTypeElements getWorkSequenceTypeAccess() {
		return eWorkSequenceType;
	}
	
	public EnumRule getWorkSequenceTypeRule() {
		return getWorkSequenceTypeAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
