package org.apache.jsp.WEB_002dINF.queries;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mondrian_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jpivot/jpivot-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjp_005fmondrianQuery_0026_005fjdbcUser_005fjdbcUrl_005fjdbcPassword_005fjdbcDriver_005fid_005fconnectionPooling_005fcatalogUri;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fjp_005fmondrianQuery_0026_005fjdbcUser_005fjdbcUrl_005fjdbcPassword_005fjdbcDriver_005fid_005fconnectionPooling_005fcatalogUri = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fjp_005fmondrianQuery_0026_005fjdbcUser_005fjdbcUrl_005fjdbcPassword_005fjdbcDriver_005fid_005fconnectionPooling_005fcatalogUri.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_jp_005fmondrianQuery_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_jp_005fmondrianQuery_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jp:mondrianQuery
    com.tonbeller.jpivot.tags.MondrianOlapModelTag _jspx_th_jp_005fmondrianQuery_005f0 = (com.tonbeller.jpivot.tags.MondrianOlapModelTag) _005fjspx_005ftagPool_005fjp_005fmondrianQuery_0026_005fjdbcUser_005fjdbcUrl_005fjdbcPassword_005fjdbcDriver_005fid_005fconnectionPooling_005fcatalogUri.get(com.tonbeller.jpivot.tags.MondrianOlapModelTag.class);
    _jspx_th_jp_005fmondrianQuery_005f0.setPageContext(_jspx_page_context);
    _jspx_th_jp_005fmondrianQuery_005f0.setParent(null);
    // /WEB-INF/queries/mondrian.jsp(5,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fmondrianQuery_005f0.setId("query01");
    // /WEB-INF/queries/mondrian.jsp(5,0) name = jdbcDriver type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fmondrianQuery_005f0.setJdbcDriver("org.apache.derby.jdbc.EmbeddedDriver");
    // /WEB-INF/queries/mondrian.jsp(5,0) name = jdbcUrl type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fmondrianQuery_005f0.setJdbcUrl("jdbc:derby:classpath:/foodmart");
    // /WEB-INF/queries/mondrian.jsp(5,0) name = catalogUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fmondrianQuery_005f0.setCatalogUri("/WEB-INF/queries/FoodMart.xml");
    // /WEB-INF/queries/mondrian.jsp(5,0) name = jdbcUser type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fmondrianQuery_005f0.setJdbcUser("sa");
    // /WEB-INF/queries/mondrian.jsp(5,0) name = jdbcPassword type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fmondrianQuery_005f0.setJdbcPassword("sa");
    // /WEB-INF/queries/mondrian.jsp(5,0) name = connectionPooling type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fmondrianQuery_005f0.setConnectionPooling("false");
    int _jspx_eval_jp_005fmondrianQuery_005f0 = _jspx_th_jp_005fmondrianQuery_005f0.doStartTag();
    if (_jspx_eval_jp_005fmondrianQuery_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_jp_005fmondrianQuery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_jp_005fmondrianQuery_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_jp_005fmondrianQuery_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("select\n");
        out.write("  {[Measures].[Unit Sales], [Measures].[Store Cost], [Measures].[Store Sales]} on columns,\n");
        out.write("  {([Promotion Media].[All Media], [Product].[All Products])} ON rows\n");
        out.write("from Sales\n");
        out.write("where ([Time].[1997])\n");
        int evalDoAfterBody = _jspx_th_jp_005fmondrianQuery_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_jp_005fmondrianQuery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_jp_005fmondrianQuery_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjp_005fmondrianQuery_0026_005fjdbcUser_005fjdbcUrl_005fjdbcPassword_005fjdbcDriver_005fid_005fconnectionPooling_005fcatalogUri.reuse(_jspx_th_jp_005fmondrianQuery_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjp_005fmondrianQuery_0026_005fjdbcUser_005fjdbcUrl_005fjdbcPassword_005fjdbcDriver_005fid_005fconnectionPooling_005fcatalogUri.reuse(_jspx_th_jp_005fmondrianQuery_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.el.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/queries/mondrian.jsp(18,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("title01");
    // /WEB-INF/queries/mondrian.jsp(18,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("session");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_005fset_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005fset_005f0.doInitBody();
      }
      do {
        out.write("Test Query uses Mondrian OLAP");
        int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
