package org.apache.spark.sql.catalyst.expressions;
/**
 * Case statements of the form "CASE a WHEN b THEN c [WHEN d THEN e]* [ELSE f] END".
 * When a = b, returns c; when a = d, returns e; else returns f.
 */
public  class CaseKeyWhen$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CaseKeyWhen$ MODULE$ = null;
  public   CaseKeyWhen$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.CaseWhen apply (org.apache.spark.sql.catalyst.expressions.Expression key, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> branches)  { throw new RuntimeException(); }
}
