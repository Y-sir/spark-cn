package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * Collect a set of unique elements.
 */
public  class CollectSet extends org.apache.spark.sql.catalyst.expressions.aggregate.Collect<scala.collection.mutable.HashSet<java.lang.Object>> implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  int mutableAggBufferOffset ()  { throw new RuntimeException(); }
  public  int inputAggBufferOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   CollectSet (org.apache.spark.sql.catalyst.expressions.Expression child, int mutableAggBufferOffset, int inputAggBufferOffset)  { throw new RuntimeException(); }
  public   CollectSet (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewMutableAggBufferOffset (int newMutableAggBufferOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewInputAggBufferOffset (int newInputAggBufferOffset)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.Object> createAggregationBuffer ()  { throw new RuntimeException(); }
}
