package org.apache.spark.ml.regression;
/** A writer for LinearRegression that handles the "pmml" format */
public  class PMMLLinearRegressionModelWriter implements org.apache.spark.ml.util.MLWriterFormat, org.apache.spark.ml.util.MLFormatRegister {
  public   PMMLLinearRegressionModelWriter ()  { throw new RuntimeException(); }
  public  java.lang.String format ()  { throw new RuntimeException(); }
  public  java.lang.String stageName ()  { throw new RuntimeException(); }
  public  void write (java.lang.String path, org.apache.spark.sql.SparkSession sparkSession, scala.collection.mutable.Map<java.lang.String, java.lang.String> optionMap, org.apache.spark.ml.PipelineStage stage)  { throw new RuntimeException(); }
}
