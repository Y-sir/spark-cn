package org.apache.spark.sql.catalyst.expressions;
/**
 * Converts the argument from binary to a base 64 string.
 */
public  class Base64 extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   Base64 (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes ()  { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object bytes)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
