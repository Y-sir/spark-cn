package org.apache.spark.sql.kafka010;
  class KafkaOffsetRange implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  long fromOffset ()  { throw new RuntimeException(); }
  public  long untilOffset ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> preferredLoc ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaOffsetRange (org.apache.kafka.common.TopicPartition topicPartition, long fromOffset, long untilOffset, scala.Option<java.lang.String> preferredLoc)  { throw new RuntimeException(); }
  // not preceding
  public  long size ()  { throw new RuntimeException(); }
}
