package org.apache.spark.ml.tuning;
/**
 * Params for {@link CrossValidator} and {@link CrossValidatorModel}.
 */
public  interface CrossValidatorParams extends org.apache.spark.ml.tuning.ValidatorParams {
  /** @group getParam */
  public  int getNumFolds ()  ;
  /**
   * Param for number of folds for cross validation.  Must be &amp;gt;= 2.
   * Default: 3
   * <p>
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numFolds ()  ;
}
