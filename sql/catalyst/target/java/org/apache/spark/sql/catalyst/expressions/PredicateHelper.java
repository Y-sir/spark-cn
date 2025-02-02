package org.apache.spark.sql.catalyst.expressions;
public  interface PredicateHelper {
  /**
   * Returns true if <code>expr</code> can be evaluated using only the output of <code>plan</code>.  This method
   * can be used to determine when it is acceptable to move expression evaluation within a query
   * plan.
   * <p>
   * For example consider a join between two relations R(a, b) and S(c, d).
   * <p>
   * - <code>canEvaluate(EqualTo(a,b), R)</code> returns <code>true</code>
   * - <code>canEvaluate(EqualTo(a,c), R)</code> returns <code>false</code>
   * - <code>canEvaluate(Literal(1), R)</code> returns <code>true</code> as literals CAN be evaluated on any plan
   * @param expr (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  /**
   * Returns true iff <code>expr</code> could be evaluated as a condition within join.
   * @param expr (undocumented)
   * @return (undocumented)
   */
  public  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  ;
  /**
   * Find the origin of where the input references of expression exp were scanned in the tree of
   * plan, and if they originate from a single leaf node.
   * Returns optional tuple with Expression, undoing any projections and aliasing that has been done
   * along the way from plan to origin, and the origin LeafNode plan from which all the exp
   * @param exp (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  ;
}
