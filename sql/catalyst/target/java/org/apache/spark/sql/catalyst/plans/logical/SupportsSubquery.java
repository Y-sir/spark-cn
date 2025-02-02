package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A trait to represent the commands that support subqueries.
 * This is used to whitelist such commands in the subquery-related checks.
 */
public  interface SupportsSubquery {
}
