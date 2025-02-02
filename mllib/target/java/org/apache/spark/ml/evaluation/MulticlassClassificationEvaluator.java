package org.apache.spark.ml.evaluation;
/**
 * Evaluator for multiclass classification, which expects input columns: prediction, label,
 * weight (optional) and probability (only for logLoss).
 */
public  class MulticlassClassificationEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasLabelCol, org.apache.spark.ml.param.shared.HasWeightCol, org.apache.spark.ml.param.shared.HasProbabilityCol, org.apache.spark.ml.util.DefaultParamsWritable {
  static public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   MulticlassClassificationEvaluator (java.lang.String uid)  { throw new RuntimeException(); }
  public   MulticlassClassificationEvaluator ()  { throw new RuntimeException(); }
  /**
   * param for metric name in evaluation (supports <code>"f1"</code> (default), <code>"accuracy"</code>,
   * <code>"weightedPrecision"</code>, <code>"weightedRecall"</code>, <code>"weightedTruePositiveRate"</code>,
   * <code>"weightedFalsePositiveRate"</code>, <code>"weightedFMeasure"</code>, <code>"truePositiveRateByLabel"</code>,
   * <code>"falsePositiveRateByLabel"</code>, <code>"precisionByLabel"</code>, <code>"recallByLabel"</code>,
   * <code>"fMeasureByLabel"</code>, <code>"logLoss"</code>)
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> metricName ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setMetricName (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam metricLabel ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  double getMetricLabel ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setMetricLabel (double value)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam beta ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  double getBeta ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setBeta (double value)  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam eps ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  double getEps ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator setEps (double value)  { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  boolean isLargerBetter ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
