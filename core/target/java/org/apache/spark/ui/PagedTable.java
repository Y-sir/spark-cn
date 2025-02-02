package org.apache.spark.ui;
/**
 * A paged table that will generate a HTML table for a specified page and also the page navigation.
 */
public  interface PagedTable<T extends java.lang.Object> {
  public  org.apache.spark.ui.PagedDataSource<T> dataSource ()  ;
  /**
   * Returns the submission path for the "go to page #" form.
   * @return (undocumented)
   */
  public  java.lang.String goButtonFormPath ()  ;
  public  scala.collection.Seq<scala.xml.Node> headers ()  ;
  /**
   * Return a link to jump to a page.
   * @param page (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String pageLink (int page)  ;
  /**
   * Return a page navigation.
   * <p>
   * It will create a page navigation including a group of page numbers and a form
   * to submit the page number.
   * <p>
   * Here are some examples of the page navigation:
   * <pre><code>
   * &lt;&lt; &lt; 11 12 13* 14 15 16 17 18 19 20 &gt; &gt;&gt;
   *
   * This is the first group, so "&lt;&lt;" is hidden.
   * &lt; 1 2* 3 4 5 6 7 8 9 10 &gt; &gt;&gt;
   *
   * This is the first group and the first page, so "&lt;&lt;" and "&lt;" are hidden.
   * 1* 2 3 4 5 6 7 8 9 10 &gt; &gt;&gt;
   *
   * Assume totalPages is 19. This is the last group, so "&gt;&gt;" is hidden.
   * &lt;&lt; &lt; 11 12 13* 14 15 16 17 18 19 &gt;
   *
   * Assume totalPages is 19. This is the last group and the last page, so "&gt;&gt;" and "&gt;" are hidden.
   * &lt;&lt; &lt; 11 12 13 14 15 16 17 18 19*
   *
   * * means the current page number
   * &lt;&lt; means jumping to the first page of the previous group.
   * &lt; means jumping to the previous page.
   * &gt;&gt; means jumping to the first page of the next group.
   * &gt; means jumping to the next page.
   * </code></pre>
   * @param page (undocumented)
   * @param pageSize (undocumented)
   * @param totalPages (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<scala.xml.Node> pageNavigation (int page, int pageSize, int totalPages)  ;
  public  java.lang.String pageNumberFormField ()  ;
  public  java.lang.String pageSizeFormField ()  ;
  public  scala.collection.Seq<scala.xml.Node> row (T t)  ;
  public  scala.collection.Seq<scala.xml.Node> table (int page)  ;
  public  java.lang.String tableCssClass ()  ;
  public  java.lang.String tableId ()  ;
}
