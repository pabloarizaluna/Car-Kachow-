// Generated from co\edu\javeriana\car\Car.g4 by ANTLR 4.5.1
package co.edu.javeriana.car;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CarParser.StartContext ctx);
}