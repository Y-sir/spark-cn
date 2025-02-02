package org.apache.spark.sql.execution.columnar;
/**
 * CachedBatch is a cached batch of rows.
 * <p>
 * param:  numRows The total number of rows in this batch
 * param:  buffers The buffers for serialized columns
 * param:  stats The stat of columns
 */
  class CachedBatch implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int numRows ()  { throw new RuntimeException(); }
  public  byte[][] buffers ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow stats ()  { throw new RuntimeException(); }
  // not preceding
  public   CachedBatch (int numRows, byte[][] buffers, org.apache.spark.sql.catalyst.InternalRow stats)  { throw new RuntimeException(); }
}
