package org.apache.spark.sql.jdbc;
public  class DerbyDialect {
  static public  boolean canHandle (java.lang.String url)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.DataType> getCatalystType (int sqlType, java.lang.String typeName, int size, org.apache.spark.sql.types.MetadataBuilder md)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.Object> isCascadingTruncateTable ()  { throw new RuntimeException(); }
  static public  java.lang.String quoteIdentifier (java.lang.String colName)  { throw new RuntimeException(); }
  static public  java.lang.String getTableExistsQuery (java.lang.String table)  { throw new RuntimeException(); }
  static public  java.lang.String getSchemaQuery (java.lang.String table)  { throw new RuntimeException(); }
  static public  java.lang.String getTruncateQuery (java.lang.String table)  { throw new RuntimeException(); }
  static public  java.lang.String getTruncateQuery (java.lang.String table, scala.Option<java.lang.Object> cascade)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.Object> getTruncateQuery$default$2 ()  { throw new RuntimeException(); }
  static public  void beforeFetch (java.sql.Connection connection, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  static protected  java.lang.String escapeSql (java.lang.String value)  { throw new RuntimeException(); }
  static public  Object compileValue (Object value)  { throw new RuntimeException(); }
}
