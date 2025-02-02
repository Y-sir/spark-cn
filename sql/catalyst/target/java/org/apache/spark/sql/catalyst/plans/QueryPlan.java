package org.apache.spark.sql.catalyst.plans;
public abstract class QueryPlan<PlanType extends org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType>> extends org.apache.spark.sql.catalyst.trees.TreeNode<PlanType> {
  static public  org.apache.spark.sql.catalyst.trees.TreeNodeTag<java.lang.Object> OP_ID_TAG ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.TreeNodeTag<java.lang.Object> CODEGEN_ID_TAG ()  { throw new RuntimeException(); }
  /**
   * Normalize the exprIds in the given expression, by updating the exprId in <code>AttributeReference</code>
   * with its referenced ordinal from input attributes. It's similar to <code>BindReferences</code> but we
   * do not use <code>BindReferences</code> here as the plan may take the expression as a parameter with type
   * <code>Attribute</code>, and replace it with <code>BoundReference</code> will cause error.
   * @param e (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  static public <T extends org.apache.spark.sql.catalyst.expressions.Expression> T normalizeExpressions (T e, org.apache.spark.sql.catalyst.expressions.AttributeSeq input)  { throw new RuntimeException(); }
  /**
   * Composes the given predicates into a conjunctive predicate, which is normalized and reordered.
   * Then returns a new sequence of predicates by splitting the conjunctive predicate.
   * @param predicates (undocumented)
   * @param output (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> normalizePredicates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates, org.apache.spark.sql.catalyst.expressions.AttributeSeq output)  { throw new RuntimeException(); }
  /**
   * Converts the query plan to string and appends it via provided function.
   * @param plan (undocumented)
   * @param append (undocumented)
   * @param verbose (undocumented)
   * @param addSuffix (undocumented)
   * @param maxFields (undocumented)
   * @param printOperatorId (undocumented)
   */
  static public <T extends org.apache.spark.sql.catalyst.plans.QueryPlan<T>> void append (scala.Function0<org.apache.spark.sql.catalyst.plans.QueryPlan<T>> plan, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> append, boolean verbose, boolean addSuffix, int maxFields, boolean printOperatorId)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.sql.catalyst.plans.QueryPlan), List(TypeTree().setOriginal(Ident(TypeName("PlanType"))))))))
  public   QueryPlan ()  { throw new RuntimeException(); }
  /**
   * The active config object within the current scope.
   * See {@link SQLConf.get} for more information.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet outputSet ()  { throw new RuntimeException(); }
  /**
   * The set of all attributes that are input to this operator by its children.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet inputSet ()  { throw new RuntimeException(); }
  /**
   * The set of all attributes that are produced by this node.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  /**
   * Attributes that are referenced by expressions but not provided by this node's children.
   * @return (undocumented)
   */
  public final  org.apache.spark.sql.catalyst.expressions.AttributeSet missingInput ()  { throw new RuntimeException(); }
  /**
   * Runs {@link transformExpressionsDown} with <code>rule</code> on all expressions present
   * in this query operator.
   * Users should not expect a specific directionality. If a specific directionality is needed,
   * transformExpressionsDown or transformExpressionsUp should be used.
   * <p>
   * @param rule the rule to be applied to every expression in this operator.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /**
   * Runs {@link transformDown} with <code>rule</code> on all expressions present in this query operator.
   * <p>
   * @param rule the rule to be applied to every expression in this operator.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsDown (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /**
   * Runs {@link transformUp} with <code>rule</code> on all expressions present in this query operator.
   * <p>
   * @param rule the rule to be applied to every expression in this operator.
   * @return
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsUp (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /**
   * Apply a map function to each expression present in this query operator, and return a new
   * query operator based on the mapped expressions.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> mapExpressions (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> f)  { throw new RuntimeException(); }
  /**
   * Returns the result of running {@link transformExpressions} on this node
   * and all its children.
   * @param rule (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformAllExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /** Returns all of the expressions present in this query plan operator. */
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  /** Returns the output schema in the tree format. */
  public  java.lang.String schemaString ()  { throw new RuntimeException(); }
  /** Prints out the schema in the tree format */
  public  void printSchema ()  { throw new RuntimeException(); }
  /**
   * A prefix string used when printing the plan.
   * <p>
   * We use "!" to indicate an invalid plan, and "'" to indicate an unresolved plan.
   * @return (undocumented)
   */
  protected  java.lang.String statePrefix ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString (int maxFields)  { throw new RuntimeException(); }
  public  java.lang.String verboseString (int maxFields)  { throw new RuntimeException(); }
  public  java.lang.String simpleStringWithNodeId ()  { throw new RuntimeException(); }
  public  java.lang.String verboseStringWithOperatorId ()  { throw new RuntimeException(); }
  /**
   * All the subqueries of current plan.
   * @return (undocumented)
   */
  public  scala.collection.Seq<PlanType> subqueries ()  { throw new RuntimeException(); }
  /**
   * Returns a sequence containing the result of applying a partial function to all elements in this
   * plan, also considering all the plans in its (nested) subqueries
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <B extends java.lang.Object> scala.collection.Seq<B> collectInPlanAndSubqueries (scala.PartialFunction<PlanType, B> f)  { throw new RuntimeException(); }
  /**
   * Returns a sequence containing the subqueries in this plan, also including the (nested)
   * subquries in its children
   * @return (undocumented)
   */
  public  scala.collection.Seq<PlanType> subqueriesAll ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.QueryPlan<?>> innerChildren ()  { throw new RuntimeException(); }
  protected  boolean isCanonicalizedPlan ()  { throw new RuntimeException(); }
  // not preceding
  public final  PlanType canonicalized ()  { throw new RuntimeException(); }
  /**
   * Defines how the canonicalization should work for the current plan.
   * @return (undocumented)
   */
  protected  PlanType doCanonicalize ()  { throw new RuntimeException(); }
  /**
   * Returns true when the given query plan will return the same results as this query plan.
   * <p>
   * Since its likely undecidable to generally determine if two given plans will produce the same
   * results, it is okay for this function to return false, even if the results are actually
   * the same.  Such behavior will not affect correctness, only the application of performance
   * enhancements like caching.  However, it is not acceptable to return true if the results could
   * possibly be different.
   * <p>
   * This function performs a modified version of equality that is tolerant of cosmetic
   * differences like attribute naming and or expression id differences.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public final  boolean sameResult (PlanType other)  { throw new RuntimeException(); }
  /**
   * Returns a <code>hashCode</code> for the calculation performed by this plan. Unlike the standard
   * <code>hashCode</code>, an attempt has been made to eliminate cosmetic differences.
   * @return (undocumented)
   */
  public final  int semanticHash ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeSeq allAttributes ()  { throw new RuntimeException(); }
}
