package org.apache.spark.sql.sources;
/**
 * A filter that evaluates to <code>true</code> iff the attribute evaluates to
 * a string that ends with <code>value</code>.
 * <p>
 * @since 1.3.1
 */
public  class StringEndsWith extends org.apache.spark.sql.sources.Filter implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String attribute ()  { throw new RuntimeException(); }
  public  java.lang.String value ()  { throw new RuntimeException(); }
  // not preceding
  public   StringEndsWith (java.lang.String attribute, java.lang.String value)  { throw new RuntimeException(); }
  public  java.lang.String[] references ()  { throw new RuntimeException(); }
}
