package org.apache.spark.sql.catalyst.expressions;
/**
 * Encodes the first argument into a BINARY using the provided character set
 * (one of 'US-ASCII', 'ISO-8859-1', 'UTF-8', 'UTF-16BE', 'UTF-16LE', 'UTF-16').
 * If either argument is null, the result will also be null.
 */
public  class Encode extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression value ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression charset ()  { throw new RuntimeException(); }
  // not preceding
  public   Encode (org.apache.spark.sql.catalyst.expressions.Expression value, org.apache.spark.sql.catalyst.expressions.Expression charset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes ()  { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input1, Object input2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
