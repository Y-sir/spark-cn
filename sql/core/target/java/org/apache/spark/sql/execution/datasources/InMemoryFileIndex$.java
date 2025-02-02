package org.apache.spark.sql.execution.datasources;
public  class InMemoryFileIndex$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InMemoryFileIndex$ MODULE$ = null;
  public   InMemoryFileIndex$ ()  { throw new RuntimeException(); }
  /**
   * Lists a collection of paths recursively. Picks the listing strategy adaptively depending
   * on the number of paths to list.
   * <p>
   * This may only be called on the driver.
   * <p>
   * @return for each input path, the set of discovered files for the path
   * @param paths (undocumented)
   * @param hadoopConf (undocumented)
   * @param filter (undocumented)
   * @param sparkSession (undocumented)
   * @param areRootPaths (undocumented)
   */
    scala.collection.Seq<scala.Tuple2<org.apache.hadoop.fs.Path, scala.collection.Seq<org.apache.hadoop.fs.FileStatus>>> bulkListLeafFiles (scala.collection.Seq<org.apache.hadoop.fs.Path> paths, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.fs.PathFilter filter, org.apache.spark.sql.SparkSession sparkSession, boolean areRootPaths)  { throw new RuntimeException(); }
  /** Checks if we should filter out this path name. */
  public  boolean shouldFilterOut (java.lang.String pathName)  { throw new RuntimeException(); }
}
