package org.apache.spark.ml.classification;
/**
 * Abstraction for multiclass logistic regression training results.
 * Currently, the training summary ignores the training weights except
 * for the objective trace.
 */
public  interface LogisticRegressionTrainingSummary extends org.apache.spark.ml.classification.LogisticRegressionSummary {
  /** objective function (scaled loss + regularization) at each iteration. */
  public  double[] objectiveHistory ()  ;
  /** Number of training iterations. */
  public  int totalIterations ()  ;
}
