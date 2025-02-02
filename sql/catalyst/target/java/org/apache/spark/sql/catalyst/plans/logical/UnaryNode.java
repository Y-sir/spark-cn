package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical plan node with single child.
 */
public abstract class UnaryNode extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan {
  public   UnaryNode ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  ;
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  /**
   * Generates all valid constraints including an set of aliased constraints by replacing the
   * original constraint expressions with the corresponding alias
   * @param projectList (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> getAllValidConstraints (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> validConstraints ()  { throw new RuntimeException(); }
}
