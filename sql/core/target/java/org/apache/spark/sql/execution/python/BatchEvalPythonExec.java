package org.apache.spark.sql.execution.python;
/**
 * A physical plan that evaluates a {@link PythonUDF}
 */
public  class BatchEvalPythonExec extends org.apache.spark.sql.execution.python.EvalPythonExec implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.PythonUDF> udfs ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> resultAttrs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   BatchEvalPythonExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.PythonUDF> udfs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> resultAttrs, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  protected  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> evaluate (scala.collection.Seq<org.apache.spark.api.python.ChainedPythonFunctions> funcs, int[][] argOffsets, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iter, org.apache.spark.sql.types.StructType schema, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
