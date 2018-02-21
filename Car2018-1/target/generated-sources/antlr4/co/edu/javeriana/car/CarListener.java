// Generated from co\edu\javeriana\car\Car.g4 by ANTLR 4.5.1
package co.edu.javeriana.car;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CarParser}.
 */
public interface CarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CarParser.StartContext ctx);
}