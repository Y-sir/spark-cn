package org.apache.spark.sql.kafka010;
public  class KafkaContinuousReaderFactory {
  static public  org.apache.spark.sql.connector.read.streaming.ContinuousPartitionReader<org.apache.spark.sql.catalyst.InternalRow> createReader (org.apache.spark.sql.connector.read.InputPartition partition)  { throw new RuntimeException(); }
  static public  boolean supportColumnarReads (org.apache.spark.sql.connector.read.InputPartition x$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.read.streaming.ContinuousPartitionReader<org.apache.spark.sql.vectorized.ColumnarBatch> createColumnarReader (org.apache.spark.sql.connector.read.InputPartition x$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.read.PartitionReader<?> createColumnarReader (org.apache.spark.sql.connector.read.InputPartition x$1)  { throw new RuntimeException(); }
}
