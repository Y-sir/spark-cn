package org.apache.spark.sql.execution;
public  class SQLExecution$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SQLExecution$ MODULE$ = null;
  public   SQLExecution$ ()  { throw new RuntimeException(); }
  public  java.lang.String EXECUTION_ID_KEY ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.QueryExecution getQueryExecution (long executionId)  { throw new RuntimeException(); }
    void checkSQLExecutionId (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * Wrap an action that will execute "queryExecution" to track all Spark jobs in the body so that
   * we can connect them with an execution.
   * @param sparkSession (undocumented)
   * @param queryExecution (undocumented)
   * @param name (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withNewExecutionId (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.QueryExecution queryExecution, scala.Option<java.lang.String> name, scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Wrap an action with a known executionId. When running a different action in a different
   * thread from the original one, this method can be used to connect the Spark jobs in this action
   * with the known executionId, e.g., <code>BroadcastExchangeExec.relationFuture</code>.
   * @param sparkSession (undocumented)
   * @param executionId (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withExecutionId (org.apache.spark.sql.SparkSession sparkSession, java.lang.String executionId, scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Wrap an action with specified SQL configs. These configs will be propagated to the executor
   * side via job local properties.
   * @param sparkSession (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withSQLConfPropagated (org.apache.spark.sql.SparkSession sparkSession, scala.Function0<T> body)  { throw new RuntimeException(); }
}
