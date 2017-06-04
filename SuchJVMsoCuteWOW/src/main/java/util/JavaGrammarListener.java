package util;
// Generated from JavaGrammar.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammarParser}.
 */
public interface JavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(JavaGrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(JavaGrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JavaGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JavaGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(JavaGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(JavaGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(JavaGrammarParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(JavaGrammarParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(JavaGrammarParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(JavaGrammarParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#boolNumber}.
	 * @param ctx the parse tree
	 */
	void enterBoolNumber(JavaGrammarParser.BoolNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#boolNumber}.
	 * @param ctx the parse tree
	 */
	void exitBoolNumber(JavaGrammarParser.BoolNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#boolAtom}.
	 * @param ctx the parse tree
	 */
	void enterBoolAtom(JavaGrammarParser.BoolAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#boolAtom}.
	 * @param ctx the parse tree
	 */
	void exitBoolAtom(JavaGrammarParser.BoolAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#boolUnary}.
	 * @param ctx the parse tree
	 */
	void enterBoolUnary(JavaGrammarParser.BoolUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#boolUnary}.
	 * @param ctx the parse tree
	 */
	void exitBoolUnary(JavaGrammarParser.BoolUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(JavaGrammarParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(JavaGrammarParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#boolMultiplication}.
	 * @param ctx the parse tree
	 */
	void enterBoolMultiplication(JavaGrammarParser.BoolMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#boolMultiplication}.
	 * @param ctx the parse tree
	 */
	void exitBoolMultiplication(JavaGrammarParser.BoolMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#boolComparison}.
	 * @param ctx the parse tree
	 */
	void enterBoolComparison(JavaGrammarParser.BoolComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#boolComparison}.
	 * @param ctx the parse tree
	 */
	void exitBoolComparison(JavaGrammarParser.BoolComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(JavaGrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(JavaGrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JavaGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JavaGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionAssign}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssign(JavaGrammarParser.ExpressionAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionAssign}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssign(JavaGrammarParser.ExpressionAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#operationAssign}.
	 * @param ctx the parse tree
	 */
	void enterOperationAssign(JavaGrammarParser.OperationAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#operationAssign}.
	 * @param ctx the parse tree
	 */
	void exitOperationAssign(JavaGrammarParser.OperationAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#leftIncrement}.
	 * @param ctx the parse tree
	 */
	void enterLeftIncrement(JavaGrammarParser.LeftIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#leftIncrement}.
	 * @param ctx the parse tree
	 */
	void exitLeftIncrement(JavaGrammarParser.LeftIncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#rightIncrement}.
	 * @param ctx the parse tree
	 */
	void enterRightIncrement(JavaGrammarParser.RightIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#rightIncrement}.
	 * @param ctx the parse tree
	 */
	void exitRightIncrement(JavaGrammarParser.RightIncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JavaGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JavaGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(JavaGrammarParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(JavaGrammarParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forAssign}.
	 * @param ctx the parse tree
	 */
	void enterForAssign(JavaGrammarParser.ForAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forAssign}.
	 * @param ctx the parse tree
	 */
	void exitForAssign(JavaGrammarParser.ForAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(JavaGrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(JavaGrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(JavaGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(JavaGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(JavaGrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(JavaGrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#iff}.
	 * @param ctx the parse tree
	 */
	void enterIff(JavaGrammarParser.IffContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#iff}.
	 * @param ctx the parse tree
	 */
	void exitIff(JavaGrammarParser.IffContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ifTrue}.
	 * @param ctx the parse tree
	 */
	void enterIfTrue(JavaGrammarParser.IfTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ifTrue}.
	 * @param ctx the parse tree
	 */
	void exitIfTrue(JavaGrammarParser.IfTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ifFalse}.
	 * @param ctx the parse tree
	 */
	void enterIfFalse(JavaGrammarParser.IfFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ifFalse}.
	 * @param ctx the parse tree
	 */
	void exitIfFalse(JavaGrammarParser.IfFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(JavaGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(JavaGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(JavaGrammarParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(JavaGrammarParser.ReadContext ctx);
}