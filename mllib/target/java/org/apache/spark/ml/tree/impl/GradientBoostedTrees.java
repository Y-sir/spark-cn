package org.apache.spark.ml.tree.impl;
public  class GradientBoostedTrees {
  /**
   * Method to train a gradient boosting model
   * @param input Training dataset: RDD of <code>Instance</code>.
   * @param seed Random seed.
   * @return tuple of ensemble models and weights:
   *         (array of decision tree models, array of model weights)
   * @param boostingStrategy (undocumented)
   * @param featureSubsetStrategy (undocumented)
   */
  static public  scala.Tuple2<org.apache.spark.ml.regression.DecisionTreeRegressionModel[], double[]> run (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> input, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy, long seed, java.lang.String featureSubsetStrategy)  { throw new RuntimeException(); }
  /**
   * Method to validate a gradient boosting model
   * @param input Training dataset: RDD of <code>Instance</code>.
   * @param validationInput Validation dataset.
   *                        This dataset should be different from the training dataset,
   *                        but it should follow the same distribution.
   *                        E.g., these two datasets could be created from an original dataset
   *                        by using <code>org.apache.spark.rdd.RDD.randomSplit()</code>
   * @param seed Random seed.
   * @return tuple of ensemble models and weights:
   *         (array of decision tree models, array of model weights)
   * @param boostingStrategy (undocumented)
   * @param featureSubsetStrategy (undocumented)
   */
  static public  scala.Tuple2<org.apache.spark.ml.regression.DecisionTreeRegressionModel[], double[]> runWithValidation (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> input, org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> validationInput, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy, long seed, java.lang.String featureSubsetStrategy)  { throw new RuntimeException(); }
  /**
   * Compute the initial predictions and errors for a dataset for the first
   * iteration of gradient boosting.
   * @param data: training data.
   * @param initTreeWeight: learning rate assigned to the first tree.
   * @param initTree: first DecisionTreeModel.
   * @param loss: evaluation metric.
   * @return an RDD with each element being a zip of the prediction and error
   *         corresponding to every sample.
   */
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> computeInitialPredictionAndError (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> data, double initTreeWeight, org.apache.spark.ml.regression.DecisionTreeRegressionModel initTree, org.apache.spark.mllib.tree.loss.Loss loss)  { throw new RuntimeException(); }
  /**
   * Update a zipped predictionError RDD
   * (as obtained with computeInitialPredictionAndError)
   * @param data: training data.
   * @param predictionAndError: predictionError RDD
   * @param treeWeight: Learning rate.
   * @param tree: Tree using which the prediction and error should be updated.
   * @param loss: evaluation metric.
   * @return an RDD with each element being a zip of the prediction and error
   *         corresponding to each sample.
   */
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> updatePredictionError (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> data, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> predictionAndError, double treeWeight, org.apache.spark.ml.regression.DecisionTreeRegressionModel tree, org.apache.spark.mllib.tree.loss.Loss loss)  { throw new RuntimeException(); }
  /**
   * Add prediction from a new boosting iteration to an existing prediction.
   * <p>
   * @param features Vector of features representing a single data point.
   * @param prediction The existing prediction.
   * @param tree New Decision Tree model.
   * @param weight Tree weight.
   * @return Updated prediction.
   */
  static public  double updatePrediction (org.apache.spark.ml.linalg.Vector features, double prediction, org.apache.spark.ml.regression.DecisionTreeRegressionModel tree, double weight)  { throw new RuntimeException(); }
  /**
   * Method to calculate error of the base learner for the gradient boosting calculation.
   * Note: This method is not used by the gradient boosting algorithm but is useful for debugging
   * purposes.
   * @param data Training dataset: RDD of <code>Instance</code>.
   * @param trees Boosted Decision Tree models
   * @param treeWeights Learning rates at each boosting iteration.
   * @param loss evaluation metric.
   * @return Measure of model error on data
   */
  static public  double computeWeightedError (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> data, org.apache.spark.ml.regression.DecisionTreeRegressionModel[] trees, double[] treeWeights, org.apache.spark.mllib.tree.loss.Loss loss)  { throw new RuntimeException(); }
  /**
   * Method to calculate error of the base learner for the gradient boosting calculation.
   * @param data Training dataset: RDD of <code>Instance</code>.
   * @param predError Prediction and error.
   * @return Measure of model error on data
   */
  static public  double computeWeightedError (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> data, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> predError)  { throw new RuntimeException(); }
  /**
   * Method to compute error or loss for every iteration of gradient boosting.
   * <p>
   * @param data RDD of <code>Instance</code>
   * @param trees Boosted Decision Tree models
   * @param treeWeights Learning rates at each boosting iteration.
   * @param loss evaluation metric.
   * @param algo algorithm for the ensemble, either Classification or Regression
   * @return an array with index i having the losses or errors for the ensemble
   *         containing the first i+1 trees
   */
  static public  double[] evaluateEachIteration (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> data, org.apache.spark.ml.regression.DecisionTreeRegressionModel[] trees, double[] treeWeights, org.apache.spark.mllib.tree.loss.Loss loss, scala.Enumeration.Value algo)  { throw new RuntimeException(); }
  /**
   * Internal method for performing regression using trees as base learners.
   * @param input training dataset
   * @param validationInput validation dataset, ignored if validate is set to false.
   * @param boostingStrategy boosting parameters
   * @param validate whether or not to use the validation dataset.
   * @param seed Random seed.
   * @return tuple of ensemble models and weights:
   *         (array of decision tree models, array of model weights)
   * @param featureSubsetStrategy (undocumented)
   */
  static public  scala.Tuple2<org.apache.spark.ml.regression.DecisionTreeRegressionModel[], double[]> boost (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> input, org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> validationInput, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy, boolean validate, long seed, java.lang.String featureSubsetStrategy)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
}
