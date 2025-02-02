package org.apache.spark.sql.execution.exchange;
/**
 * A {@link BroadcastExchangeExec} collects, transforms and finally broadcasts the result of
 * a transformed SparkPlan.
 */
public  class BroadcastExchangeExec extends org.apache.spark.sql.execution.exchange.Exchange implements scala.Product, scala.Serializable {
  static   scala.concurrent.ExecutionContextExecutorService executionContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.BroadcastMode mode ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   BroadcastExchangeExec (org.apache.spark.sql.catalyst.plans.physical.BroadcastMode mode, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
    java.util.UUID runId ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan doCanonicalize ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.concurrent.Future<org.apache.spark.broadcast.Broadcast<java.lang.Object>> completionFuture ()  { throw new RuntimeException(); }
  // not preceding
    java.util.concurrent.Future<org.apache.spark.broadcast.Broadcast<java.lang.Object>> relationFuture ()  { throw new RuntimeException(); }
  protected  void doPrepare ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> doExecuteBroadcast ()  { throw new RuntimeException(); }
}
