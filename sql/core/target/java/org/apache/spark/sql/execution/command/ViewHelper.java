package org.apache.spark.sql.execution.command;
public  class ViewHelper {
  /**
   * Generate the view properties in CatalogTable, including:
   * 1. view default database that is used to provide the default database name on view resolution.
   * 2. the output column names of the query that creates a view, this is used to map the output of
   *    the view child to the view output during view resolution.
   * <p>
   * @param properties the <code>properties</code> in CatalogTable.
   * @param session the spark session.
   * @param analyzedPlan the analyzed logical plan that represents the child of a view.
   * @return new view properties including view default database and query column names properties.
   * @param fieldNames (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> generateViewProperties (scala.collection.immutable.Map<java.lang.String, java.lang.String> properties, org.apache.spark.sql.SparkSession session, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzedPlan, java.lang.String[] fieldNames)  { throw new RuntimeException(); }
  /**
   * Recursively search the logical plan to detect cyclic view references, throw an
   * AnalysisException if cycle detected.
   * <p>
   * A cyclic view reference is a cycle of reference dependencies, for example, if the following
   * statements are executed:
   * CREATE VIEW testView AS SELECT id FROM tbl
   * CREATE VIEW testView2 AS SELECT id FROM testView
   * ALTER VIEW testView AS SELECT * FROM testView2
   * The view <code>testView</code> references <code>testView2</code>, and <code>testView2</code> also references <code>testView</code>,
   * therefore a reference cycle (testView -> testView2 -> testView) exists.
   * <p>
   * @param plan the logical plan we detect cyclic view references from.
   * @param path the path between the altered view and current node.
   * @param viewIdent the table identifier of the altered view, we compare two views by the
   *                  <code>desc.identifier</code>.
   */
  static public  void checkCyclicViewReference (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<org.apache.spark.sql.catalyst.TableIdentifier> path, org.apache.spark.sql.catalyst.TableIdentifier viewIdent)  { throw new RuntimeException(); }
}
