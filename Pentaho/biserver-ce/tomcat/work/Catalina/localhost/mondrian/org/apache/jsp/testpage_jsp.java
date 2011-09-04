package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jpivot/jpivot-tags.tld");
    _jspx_dependants.add("/WEB-INF/wcf/wcf-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fwcf_005finclude_0026_005fsuffix_005fprefix_005fid_005fhttpParam_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjp_005ftable_0026_005fquery_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjp_005fnavigator_0026_005fvisible_005fquery_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjp_005fprint_0026_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjp_005fchart_0026_005fvisible_005fquery_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fwcf_005ftable_0026_005fvisible_005fselmode_005fid_005feditable_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fwcf_005ftoolbar_0026_005fid_005fbundle;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fwcf_005fimgbutton_0026_005ftooltip_005fimg_005fid_005fhref_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fwcf_005finclude_0026_005fsuffix_005fprefix_005fid_005fhttpParam_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjp_005ftable_0026_005fquery_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjp_005fnavigator_0026_005fvisible_005fquery_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjp_005fprint_0026_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjp_005fchart_0026_005fvisible_005fquery_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fwcf_005ftable_0026_005fvisible_005fselmode_005fid_005feditable_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fwcf_005ftoolbar_0026_005fid_005fbundle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fwcf_005fimgbutton_0026_005ftooltip_005fimg_005fid_005fhref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fwcf_005finclude_0026_005fsuffix_005fprefix_005fid_005fhttpParam_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fjp_005ftable_0026_005fquery_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fjp_005fnavigator_0026_005fvisible_005fquery_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fjp_005fprint_0026_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fjp_005fchart_0026_005fvisible_005fquery_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fwcf_005ftable_0026_005fvisible_005fselmode_005fid_005feditable_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fwcf_005ftoolbar_0026_005fid_005fbundle.release();
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.release();
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fwcf_005fimgbutton_0026_005ftooltip_005fimg_005fid_005fhref_005fnobody.release();
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Mondrian/JPivot Test Page</title>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"jpivot/table/mdxtable.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"jpivot/navi/mdxnavi.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"wcf/form/xform.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"wcf/table/xtable.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"wcf/tree/xtree.css\">\n");
      out.write("</head>\n");
      out.write("<body bgcolor=white>\n");
      out.write("<form action=\"testpage.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write('\n');
      if (_jspx_meth_wcf_005finclude_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_jp_005ftable_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_jp_005fnavigator_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_wcf_005fform_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_wcf_005fform_005f1(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_jp_005fprint_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_wcf_005fform_005f2(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_jp_005fchart_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_wcf_005fform_005f3(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_wcf_005ftable_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<h2>");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</h2>\n");
      out.write("\n");
      out.write('\n');
      if (_jspx_meth_wcf_005ftoolbar_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_wcf_005frender_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<p>\n");
      out.write("\n");
      out.write('\n');
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_wcf_005frender_005f1(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_wcf_005frender_005f3(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_wcf_005frender_005f4(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_wcf_005frender_005f5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!-- render the table -->\n");
      out.write("<p>\n");
      if (_jspx_meth_wcf_005frender_005f6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<p>\n");
      out.write("Slicer:\n");
      if (_jspx_meth_wcf_005frender_005f7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("<!-- drill through table -->\n");
      if (_jspx_meth_wcf_005frender_005f8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("<!-- render chart -->\n");
      if (_jspx_meth_wcf_005frender_005f9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("<a href=\"index.jsp\">back to index</a>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_wcf_005finclude_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:include
    com.tonbeller.wcf.utils.IncludeTag _jspx_th_wcf_005finclude_005f0 = (com.tonbeller.wcf.utils.IncludeTag) _005fjspx_005ftagPool_005fwcf_005finclude_0026_005fsuffix_005fprefix_005fid_005fhttpParam_005fnobody.get(com.tonbeller.wcf.utils.IncludeTag.class);
    _jspx_th_wcf_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005finclude_005f0.setParent(null);
    // /testpage.jsp(44,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005finclude_005f0.setId("include01");
    // /testpage.jsp(44,0) name = httpParam type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005finclude_005f0.setHttpParam("query");
    // /testpage.jsp(44,0) name = prefix type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005finclude_005f0.setPrefix("/WEB-INF/queries/");
    // /testpage.jsp(44,0) name = suffix type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005finclude_005f0.setSuffix(".jsp");
    int _jspx_eval_wcf_005finclude_005f0 = _jspx_th_wcf_005finclude_005f0.doStartTag();
    if (_jspx_th_wcf_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005finclude_0026_005fsuffix_005fprefix_005fid_005fhttpParam_005fnobody.reuse(_jspx_th_wcf_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005finclude_0026_005fsuffix_005fprefix_005fid_005fhttpParam_005fnobody.reuse(_jspx_th_wcf_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.el.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /testpage.jsp(45,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest("${query01 == null}");
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (true) {
          _jspx_page_context.forward("/index.jsp");
          return true;
        }
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_jp_005ftable_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jp:table
    com.tonbeller.jpivot.table.TableComponentTag _jspx_th_jp_005ftable_005f0 = (com.tonbeller.jpivot.table.TableComponentTag) _005fjspx_005ftagPool_005fjp_005ftable_0026_005fquery_005fid_005fnobody.get(com.tonbeller.jpivot.table.TableComponentTag.class);
    _jspx_th_jp_005ftable_005f0.setPageContext(_jspx_page_context);
    _jspx_th_jp_005ftable_005f0.setParent(null);
    // /testpage.jsp(50,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005ftable_005f0.setId("table01");
    // /testpage.jsp(50,0) name = query type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005ftable_005f0.setQuery("#{query01}");
    int _jspx_eval_jp_005ftable_005f0 = _jspx_th_jp_005ftable_005f0.doStartTag();
    if (_jspx_th_jp_005ftable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjp_005ftable_0026_005fquery_005fid_005fnobody.reuse(_jspx_th_jp_005ftable_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjp_005ftable_0026_005fquery_005fid_005fnobody.reuse(_jspx_th_jp_005ftable_005f0);
    return false;
  }

  private boolean _jspx_meth_jp_005fnavigator_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jp:navigator
    com.tonbeller.jpivot.navigator.NavigatorTag _jspx_th_jp_005fnavigator_005f0 = (com.tonbeller.jpivot.navigator.NavigatorTag) _005fjspx_005ftagPool_005fjp_005fnavigator_0026_005fvisible_005fquery_005fid_005fnobody.get(com.tonbeller.jpivot.navigator.NavigatorTag.class);
    _jspx_th_jp_005fnavigator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_jp_005fnavigator_005f0.setParent(null);
    // /testpage.jsp(51,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fnavigator_005f0.setId("navi01");
    // /testpage.jsp(51,0) name = query type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fnavigator_005f0.setQuery("#{query01}");
    // /testpage.jsp(51,0) name = visible type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fnavigator_005f0.setVisible(false);
    int _jspx_eval_jp_005fnavigator_005f0 = _jspx_th_jp_005fnavigator_005f0.doStartTag();
    if (_jspx_th_jp_005fnavigator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjp_005fnavigator_0026_005fvisible_005fquery_005fid_005fnobody.reuse(_jspx_th_jp_005fnavigator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjp_005fnavigator_0026_005fvisible_005fquery_005fid_005fnobody.reuse(_jspx_th_jp_005fnavigator_005f0);
    return false;
  }

  private boolean _jspx_meth_wcf_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:form
    com.tonbeller.wcf.form.FormComponentTag _jspx_th_wcf_005fform_005f0 = (com.tonbeller.wcf.form.FormComponentTag) _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.get(com.tonbeller.wcf.form.FormComponentTag.class);
    _jspx_th_wcf_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fform_005f0.setParent(null);
    // /testpage.jsp(52,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f0.setId("mdxedit01");
    // /testpage.jsp(52,0) name = xmlUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f0.setXmlUri("/WEB-INF/jpivot/table/mdxedit.xml");
    // /testpage.jsp(52,0) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f0.setModel("#{query01}");
    // /testpage.jsp(52,0) name = visible type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f0.setVisible(false);
    int _jspx_eval_wcf_005fform_005f0 = _jspx_th_wcf_005fform_005f0.doStartTag();
    if (_jspx_th_wcf_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.reuse(_jspx_th_wcf_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.reuse(_jspx_th_wcf_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_wcf_005fform_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:form
    com.tonbeller.wcf.form.FormComponentTag _jspx_th_wcf_005fform_005f1 = (com.tonbeller.wcf.form.FormComponentTag) _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.get(com.tonbeller.wcf.form.FormComponentTag.class);
    _jspx_th_wcf_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fform_005f1.setParent(null);
    // /testpage.jsp(53,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f1.setId("sortform01");
    // /testpage.jsp(53,0) name = xmlUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f1.setXmlUri("/WEB-INF/jpivot/table/sortform.xml");
    // /testpage.jsp(53,0) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f1.setModel("#{table01}");
    // /testpage.jsp(53,0) name = visible type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f1.setVisible(false);
    int _jspx_eval_wcf_005fform_005f1 = _jspx_th_wcf_005fform_005f1.doStartTag();
    if (_jspx_th_wcf_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.reuse(_jspx_th_wcf_005fform_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.reuse(_jspx_th_wcf_005fform_005f1);
    return false;
  }

  private boolean _jspx_meth_jp_005fprint_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jp:print
    com.tonbeller.jpivot.print.PrintComponentTag _jspx_th_jp_005fprint_005f0 = (com.tonbeller.jpivot.print.PrintComponentTag) _005fjspx_005ftagPool_005fjp_005fprint_0026_005fid_005fnobody.get(com.tonbeller.jpivot.print.PrintComponentTag.class);
    _jspx_th_jp_005fprint_005f0.setPageContext(_jspx_page_context);
    _jspx_th_jp_005fprint_005f0.setParent(null);
    // /testpage.jsp(55,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fprint_005f0.setId("print01");
    int _jspx_eval_jp_005fprint_005f0 = _jspx_th_jp_005fprint_005f0.doStartTag();
    if (_jspx_th_jp_005fprint_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjp_005fprint_0026_005fid_005fnobody.reuse(_jspx_th_jp_005fprint_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjp_005fprint_0026_005fid_005fnobody.reuse(_jspx_th_jp_005fprint_005f0);
    return false;
  }

  private boolean _jspx_meth_wcf_005fform_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:form
    com.tonbeller.wcf.form.FormComponentTag _jspx_th_wcf_005fform_005f2 = (com.tonbeller.wcf.form.FormComponentTag) _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.get(com.tonbeller.wcf.form.FormComponentTag.class);
    _jspx_th_wcf_005fform_005f2.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fform_005f2.setParent(null);
    // /testpage.jsp(56,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f2.setId("printform01");
    // /testpage.jsp(56,0) name = xmlUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f2.setXmlUri("/WEB-INF/jpivot/print/printpropertiesform.xml");
    // /testpage.jsp(56,0) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f2.setModel("#{print01}");
    // /testpage.jsp(56,0) name = visible type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f2.setVisible(false);
    int _jspx_eval_wcf_005fform_005f2 = _jspx_th_wcf_005fform_005f2.doStartTag();
    if (_jspx_th_wcf_005fform_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.reuse(_jspx_th_wcf_005fform_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.reuse(_jspx_th_wcf_005fform_005f2);
    return false;
  }

  private boolean _jspx_meth_jp_005fchart_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jp:chart
    com.tonbeller.jpivot.chart.ChartComponentTag _jspx_th_jp_005fchart_005f0 = (com.tonbeller.jpivot.chart.ChartComponentTag) _005fjspx_005ftagPool_005fjp_005fchart_0026_005fvisible_005fquery_005fid_005fnobody.get(com.tonbeller.jpivot.chart.ChartComponentTag.class);
    _jspx_th_jp_005fchart_005f0.setPageContext(_jspx_page_context);
    _jspx_th_jp_005fchart_005f0.setParent(null);
    // /testpage.jsp(58,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fchart_005f0.setId("chart01");
    // /testpage.jsp(58,0) name = query type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fchart_005f0.setQuery("#{query01}");
    // /testpage.jsp(58,0) name = visible type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jp_005fchart_005f0.setVisible(false);
    int _jspx_eval_jp_005fchart_005f0 = _jspx_th_jp_005fchart_005f0.doStartTag();
    if (_jspx_th_jp_005fchart_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjp_005fchart_0026_005fvisible_005fquery_005fid_005fnobody.reuse(_jspx_th_jp_005fchart_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjp_005fchart_0026_005fvisible_005fquery_005fid_005fnobody.reuse(_jspx_th_jp_005fchart_005f0);
    return false;
  }

  private boolean _jspx_meth_wcf_005fform_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:form
    com.tonbeller.wcf.form.FormComponentTag _jspx_th_wcf_005fform_005f3 = (com.tonbeller.wcf.form.FormComponentTag) _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.get(com.tonbeller.wcf.form.FormComponentTag.class);
    _jspx_th_wcf_005fform_005f3.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fform_005f3.setParent(null);
    // /testpage.jsp(59,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f3.setId("chartform01");
    // /testpage.jsp(59,0) name = xmlUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f3.setXmlUri("/WEB-INF/jpivot/chart/chartpropertiesform.xml");
    // /testpage.jsp(59,0) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f3.setModel("#{chart01}");
    // /testpage.jsp(59,0) name = visible type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fform_005f3.setVisible(false);
    int _jspx_eval_wcf_005fform_005f3 = _jspx_th_wcf_005fform_005f3.doStartTag();
    if (_jspx_th_wcf_005fform_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.reuse(_jspx_th_wcf_005fform_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fform_0026_005fxmlUri_005fvisible_005fmodel_005fid_005fnobody.reuse(_jspx_th_wcf_005fform_005f3);
    return false;
  }

  private boolean _jspx_meth_wcf_005ftable_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:table
    com.tonbeller.wcf.table.TableComponentTag _jspx_th_wcf_005ftable_005f0 = (com.tonbeller.wcf.table.TableComponentTag) _005fjspx_005ftagPool_005fwcf_005ftable_0026_005fvisible_005fselmode_005fid_005feditable_005fnobody.get(com.tonbeller.wcf.table.TableComponentTag.class);
    _jspx_th_wcf_005ftable_005f0.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005ftable_005f0.setParent(null);
    // /testpage.jsp(60,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005ftable_005f0.setId("query01.drillthroughtable");
    // /testpage.jsp(60,0) name = visible type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005ftable_005f0.setVisible(false);
    // /testpage.jsp(60,0) name = selmode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005ftable_005f0.setSelmode("none");
    // /testpage.jsp(60,0) name = editable type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005ftable_005f0.setEditable(true);
    int _jspx_eval_wcf_005ftable_005f0 = _jspx_th_wcf_005ftable_005f0.doStartTag();
    if (_jspx_th_wcf_005ftable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005ftable_0026_005fvisible_005fselmode_005fid_005feditable_005fnobody.reuse(_jspx_th_wcf_005ftable_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005ftable_0026_005fvisible_005fselmode_005fid_005feditable_005fnobody.reuse(_jspx_th_wcf_005ftable_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.el.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /testpage.jsp(62,4) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue("${title01}");
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_wcf_005ftoolbar_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:toolbar
    com.tonbeller.wcf.toolbar.ToolBarTag _jspx_th_wcf_005ftoolbar_005f0 = (com.tonbeller.wcf.toolbar.ToolBarTag) _005fjspx_005ftagPool_005fwcf_005ftoolbar_0026_005fid_005fbundle.get(com.tonbeller.wcf.toolbar.ToolBarTag.class);
    _jspx_th_wcf_005ftoolbar_005f0.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005ftoolbar_005f0.setParent(null);
    // /testpage.jsp(65,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005ftoolbar_005f0.setId("toolbar01");
    // /testpage.jsp(65,0) name = bundle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005ftoolbar_005f0.setBundle("com.tonbeller.jpivot.toolbar.resources");
    int _jspx_eval_wcf_005ftoolbar_005f0 = _jspx_th_wcf_005ftoolbar_005f0.doStartTag();
    if (_jspx_eval_wcf_005ftoolbar_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f0(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f1(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f2(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fseparator_005f0(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f3(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f4(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f5(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f6(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f7(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fseparator_005f1(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f8(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f9(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f10(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f11(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fseparator_005f2(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f12(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f13(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fseparator_005f3(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fscriptbutton_005f14(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fimgbutton_005f0(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_wcf_005fimgbutton_005f1(_jspx_th_wcf_005ftoolbar_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_wcf_005ftoolbar_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_wcf_005ftoolbar_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005ftoolbar_0026_005fid_005fbundle.reuse(_jspx_th_wcf_005ftoolbar_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005ftoolbar_0026_005fid_005fbundle.reuse(_jspx_th_wcf_005ftoolbar_005f0);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f0 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(66,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f0.setId("cubeNaviButton");
    // /testpage.jsp(66,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f0.setTooltip("toolb.cube");
    // /testpage.jsp(66,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f0.setImg("cube");
    // /testpage.jsp(66,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f0.setModel("#{navi01.visible}");
    int _jspx_eval_wcf_005fscriptbutton_005f0 = _jspx_th_wcf_005fscriptbutton_005f0.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f1 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(67,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f1.setId("mdxEditButton");
    // /testpage.jsp(67,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f1.setTooltip("toolb.mdx.edit");
    // /testpage.jsp(67,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f1.setImg("mdx-edit");
    // /testpage.jsp(67,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f1.setModel("#{mdxedit01.visible}");
    int _jspx_eval_wcf_005fscriptbutton_005f1 = _jspx_th_wcf_005fscriptbutton_005f1.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f1);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f2 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f2.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(68,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f2.setId("sortConfigButton");
    // /testpage.jsp(68,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f2.setTooltip("toolb.table.config");
    // /testpage.jsp(68,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f2.setImg("sort-asc");
    // /testpage.jsp(68,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f2.setModel("#{sortform01.visible}");
    int _jspx_eval_wcf_005fscriptbutton_005f2 = _jspx_th_wcf_005fscriptbutton_005f2.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f2);
    return false;
  }

  private boolean _jspx_meth_wcf_005fseparator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:separator
    com.tonbeller.wcf.toolbar.ToolSeparatorTag _jspx_th_wcf_005fseparator_005f0 = (com.tonbeller.wcf.toolbar.ToolSeparatorTag) _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.get(com.tonbeller.wcf.toolbar.ToolSeparatorTag.class);
    _jspx_th_wcf_005fseparator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fseparator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    int _jspx_eval_wcf_005fseparator_005f0 = _jspx_th_wcf_005fseparator_005f0.doStartTag();
    if (_jspx_th_wcf_005fseparator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.reuse(_jspx_th_wcf_005fseparator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.reuse(_jspx_th_wcf_005fseparator_005f0);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f3 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f3.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(70,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f3.setId("levelStyle");
    // /testpage.jsp(70,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f3.setTooltip("toolb.level.style");
    // /testpage.jsp(70,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f3.setImg("level-style");
    // /testpage.jsp(70,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f3.setModel("#{table01.extensions.axisStyle.levelStyle}");
    int _jspx_eval_wcf_005fscriptbutton_005f3 = _jspx_th_wcf_005fscriptbutton_005f3.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f3);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f4 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f4.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(71,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f4.setId("hideSpans");
    // /testpage.jsp(71,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f4.setTooltip("toolb.hide.spans");
    // /testpage.jsp(71,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f4.setImg("hide-spans");
    // /testpage.jsp(71,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f4.setModel("#{table01.extensions.axisStyle.hideSpans}");
    int _jspx_eval_wcf_005fscriptbutton_005f4 = _jspx_th_wcf_005fscriptbutton_005f4.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f4);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f5 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f5.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(72,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f5.setId("propertiesButton");
    // /testpage.jsp(72,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f5.setTooltip("toolb.properties");
    // /testpage.jsp(72,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f5.setImg("properties");
    // /testpage.jsp(72,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f5.setModel("#{table01.rowAxisBuilder.axisConfig.propertyConfig.showProperties}");
    int _jspx_eval_wcf_005fscriptbutton_005f5 = _jspx_th_wcf_005fscriptbutton_005f5.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f5);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f6 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f6.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(73,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f6.setId("nonEmpty");
    // /testpage.jsp(73,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f6.setTooltip("toolb.non.empty");
    // /testpage.jsp(73,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f6.setImg("non-empty");
    // /testpage.jsp(73,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f6.setModel("#{table01.extensions.nonEmpty.buttonPressed}");
    int _jspx_eval_wcf_005fscriptbutton_005f6 = _jspx_th_wcf_005fscriptbutton_005f6.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f6);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f7 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f7.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(74,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f7.setId("swapAxes");
    // /testpage.jsp(74,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f7.setTooltip("toolb.swap.axes");
    // /testpage.jsp(74,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f7.setImg("swap-axes");
    // /testpage.jsp(74,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f7.setModel("#{table01.extensions.swapAxes.buttonPressed}");
    int _jspx_eval_wcf_005fscriptbutton_005f7 = _jspx_th_wcf_005fscriptbutton_005f7.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f7);
    return false;
  }

  private boolean _jspx_meth_wcf_005fseparator_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:separator
    com.tonbeller.wcf.toolbar.ToolSeparatorTag _jspx_th_wcf_005fseparator_005f1 = (com.tonbeller.wcf.toolbar.ToolSeparatorTag) _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.get(com.tonbeller.wcf.toolbar.ToolSeparatorTag.class);
    _jspx_th_wcf_005fseparator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fseparator_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    int _jspx_eval_wcf_005fseparator_005f1 = _jspx_th_wcf_005fseparator_005f1.doStartTag();
    if (_jspx_th_wcf_005fseparator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.reuse(_jspx_th_wcf_005fseparator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.reuse(_jspx_th_wcf_005fseparator_005f1);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f8 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f8.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(76,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f8.setModel("#{table01.extensions.drillMember.enabled}");
    // /testpage.jsp(76,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f8.setTooltip("toolb.navi.member");
    // /testpage.jsp(76,2) name = radioGroup type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f8.setRadioGroup("navi");
    // /testpage.jsp(76,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f8.setId("drillMember");
    // /testpage.jsp(76,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f8.setImg("navi-member");
    int _jspx_eval_wcf_005fscriptbutton_005f8 = _jspx_th_wcf_005fscriptbutton_005f8.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f8);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f9 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f9.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(77,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f9.setModel("#{table01.extensions.drillPosition.enabled}");
    // /testpage.jsp(77,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f9.setTooltip("toolb.navi.position");
    // /testpage.jsp(77,2) name = radioGroup type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f9.setRadioGroup("navi");
    // /testpage.jsp(77,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f9.setId("drillPosition");
    // /testpage.jsp(77,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f9.setImg("navi-position");
    int _jspx_eval_wcf_005fscriptbutton_005f9 = _jspx_th_wcf_005fscriptbutton_005f9.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f9);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f10 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f10.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(78,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f10.setModel("#{table01.extensions.drillReplace.enabled}");
    // /testpage.jsp(78,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f10.setTooltip("toolb.navi.replace");
    // /testpage.jsp(78,2) name = radioGroup type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f10.setRadioGroup("navi");
    // /testpage.jsp(78,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f10.setId("drillReplace");
    // /testpage.jsp(78,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f10.setImg("navi-replace");
    int _jspx_eval_wcf_005fscriptbutton_005f10 = _jspx_th_wcf_005fscriptbutton_005f10.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fradioGroup_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f10);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f11 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f11.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(79,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f11.setModel("#{table01.extensions.drillThrough.enabled}");
    // /testpage.jsp(79,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f11.setTooltip("toolb.navi.drillthru");
    // /testpage.jsp(79,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f11.setId("drillThrough01");
    // /testpage.jsp(79,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f11.setImg("navi-through");
    int _jspx_eval_wcf_005fscriptbutton_005f11 = _jspx_th_wcf_005fscriptbutton_005f11.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f11);
    return false;
  }

  private boolean _jspx_meth_wcf_005fseparator_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:separator
    com.tonbeller.wcf.toolbar.ToolSeparatorTag _jspx_th_wcf_005fseparator_005f2 = (com.tonbeller.wcf.toolbar.ToolSeparatorTag) _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.get(com.tonbeller.wcf.toolbar.ToolSeparatorTag.class);
    _jspx_th_wcf_005fseparator_005f2.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fseparator_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    int _jspx_eval_wcf_005fseparator_005f2 = _jspx_th_wcf_005fseparator_005f2.doStartTag();
    if (_jspx_th_wcf_005fseparator_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.reuse(_jspx_th_wcf_005fseparator_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.reuse(_jspx_th_wcf_005fseparator_005f2);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f12 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f12.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(81,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f12.setId("chartButton01");
    // /testpage.jsp(81,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f12.setTooltip("toolb.chart");
    // /testpage.jsp(81,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f12.setImg("chart");
    // /testpage.jsp(81,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f12.setModel("#{chart01.visible}");
    int _jspx_eval_wcf_005fscriptbutton_005f12 = _jspx_th_wcf_005fscriptbutton_005f12.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f12);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f13 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f13.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(82,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f13.setId("chartPropertiesButton01");
    // /testpage.jsp(82,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f13.setTooltip("toolb.chart.config");
    // /testpage.jsp(82,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f13.setImg("chart-config");
    // /testpage.jsp(82,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f13.setModel("#{chartform01.visible}");
    int _jspx_eval_wcf_005fscriptbutton_005f13 = _jspx_th_wcf_005fscriptbutton_005f13.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f13);
    return false;
  }

  private boolean _jspx_meth_wcf_005fseparator_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:separator
    com.tonbeller.wcf.toolbar.ToolSeparatorTag _jspx_th_wcf_005fseparator_005f3 = (com.tonbeller.wcf.toolbar.ToolSeparatorTag) _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.get(com.tonbeller.wcf.toolbar.ToolSeparatorTag.class);
    _jspx_th_wcf_005fseparator_005f3.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fseparator_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    int _jspx_eval_wcf_005fseparator_005f3 = _jspx_th_wcf_005fseparator_005f3.doStartTag();
    if (_jspx_th_wcf_005fseparator_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.reuse(_jspx_th_wcf_005fseparator_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fseparator_005fnobody.reuse(_jspx_th_wcf_005fseparator_005f3);
    return false;
  }

  private boolean _jspx_meth_wcf_005fscriptbutton_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:scriptbutton
    com.tonbeller.wcf.toolbar.ScriptButtonTag _jspx_th_wcf_005fscriptbutton_005f14 = (com.tonbeller.wcf.toolbar.ScriptButtonTag) _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.get(com.tonbeller.wcf.toolbar.ScriptButtonTag.class);
    _jspx_th_wcf_005fscriptbutton_005f14.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fscriptbutton_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(84,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f14.setId("printPropertiesButton01");
    // /testpage.jsp(84,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f14.setTooltip("toolb.print.config");
    // /testpage.jsp(84,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f14.setImg("print-config");
    // /testpage.jsp(84,2) name = model type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fscriptbutton_005f14.setModel("#{printform01.visible}");
    int _jspx_eval_wcf_005fscriptbutton_005f14 = _jspx_th_wcf_005fscriptbutton_005f14.doStartTag();
    if (_jspx_th_wcf_005fscriptbutton_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fscriptbutton_0026_005ftooltip_005fmodel_005fimg_005fid_005fnobody.reuse(_jspx_th_wcf_005fscriptbutton_005f14);
    return false;
  }

  private boolean _jspx_meth_wcf_005fimgbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:imgbutton
    com.tonbeller.wcf.toolbar.ImgButtonTag _jspx_th_wcf_005fimgbutton_005f0 = (com.tonbeller.wcf.toolbar.ImgButtonTag) _005fjspx_005ftagPool_005fwcf_005fimgbutton_0026_005ftooltip_005fimg_005fid_005fhref_005fnobody.get(com.tonbeller.wcf.toolbar.ImgButtonTag.class);
    _jspx_th_wcf_005fimgbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fimgbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(85,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fimgbutton_005f0.setId("printpdf");
    // /testpage.jsp(85,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fimgbutton_005f0.setTooltip("toolb.print");
    // /testpage.jsp(85,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fimgbutton_005f0.setImg("print");
    // /testpage.jsp(85,2) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fimgbutton_005f0.setHref("./Print?cube=01&type=1");
    int _jspx_eval_wcf_005fimgbutton_005f0 = _jspx_th_wcf_005fimgbutton_005f0.doStartTag();
    if (_jspx_th_wcf_005fimgbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fimgbutton_0026_005ftooltip_005fimg_005fid_005fhref_005fnobody.reuse(_jspx_th_wcf_005fimgbutton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fimgbutton_0026_005ftooltip_005fimg_005fid_005fhref_005fnobody.reuse(_jspx_th_wcf_005fimgbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_wcf_005fimgbutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_wcf_005ftoolbar_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:imgbutton
    com.tonbeller.wcf.toolbar.ImgButtonTag _jspx_th_wcf_005fimgbutton_005f1 = (com.tonbeller.wcf.toolbar.ImgButtonTag) _005fjspx_005ftagPool_005fwcf_005fimgbutton_0026_005ftooltip_005fimg_005fid_005fhref_005fnobody.get(com.tonbeller.wcf.toolbar.ImgButtonTag.class);
    _jspx_th_wcf_005fimgbutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005fimgbutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_wcf_005ftoolbar_005f0);
    // /testpage.jsp(86,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fimgbutton_005f1.setId("printxls");
    // /testpage.jsp(86,2) name = tooltip type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fimgbutton_005f1.setTooltip("toolb.excel");
    // /testpage.jsp(86,2) name = img type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fimgbutton_005f1.setImg("excel");
    // /testpage.jsp(86,2) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005fimgbutton_005f1.setHref("./Print?cube=01&type=0");
    int _jspx_eval_wcf_005fimgbutton_005f1 = _jspx_th_wcf_005fimgbutton_005f1.doStartTag();
    if (_jspx_th_wcf_005fimgbutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005fimgbutton_0026_005ftooltip_005fimg_005fid_005fhref_005fnobody.reuse(_jspx_th_wcf_005fimgbutton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005fimgbutton_0026_005ftooltip_005fimg_005fid_005fhref_005fnobody.reuse(_jspx_th_wcf_005fimgbutton_005f1);
    return false;
  }

  private boolean _jspx_meth_wcf_005frender_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:render
    com.tonbeller.wcf.component.RendererTag _jspx_th_wcf_005frender_005f0 = (com.tonbeller.wcf.component.RendererTag) _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.get(com.tonbeller.wcf.component.RendererTag.class);
    _jspx_th_wcf_005frender_005f0.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005frender_005f0.setParent(null);
    // /testpage.jsp(90,0) name = ref type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f0.setRef("toolbar01");
    // /testpage.jsp(90,0) name = xslUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f0.setXslUri("/WEB-INF/jpivot/toolbar/htoolbar.xsl");
    // /testpage.jsp(90,0) name = xslCache type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f0.setXslCache(true);
    int _jspx_eval_wcf_005frender_005f0 = _jspx_th_wcf_005frender_005f0.doStartTag();
    if (_jspx_th_wcf_005frender_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.el.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /testpage.jsp(94,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest("${query01.result.overflowOccured}");
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("  <p>\n");
        out.write("  <strong style=\"color:red\">Resultset overflow occured</strong>\n");
        out.write("  <p>\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_wcf_005frender_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:render
    com.tonbeller.wcf.component.RendererTag _jspx_th_wcf_005frender_005f1 = (com.tonbeller.wcf.component.RendererTag) _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.get(com.tonbeller.wcf.component.RendererTag.class);
    _jspx_th_wcf_005frender_005f1.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005frender_005f1.setParent(null);
    // /testpage.jsp(101,0) name = ref type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f1.setRef("navi01");
    // /testpage.jsp(101,0) name = xslUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f1.setXslUri("/WEB-INF/jpivot/navi/navigator.xsl");
    // /testpage.jsp(101,0) name = xslCache type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f1.setXslCache(true);
    int _jspx_eval_wcf_005frender_005f1 = _jspx_th_wcf_005frender_005f1.doStartTag();
    if (_jspx_th_wcf_005frender_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.el.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.el.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.el.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /testpage.jsp(104,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest("${mdxedit01.visible}");
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("  <h3>MDX Query Editor</h3>\n");
        out.write("  ");
        if (_jspx_meth_wcf_005frender_005f2(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_wcf_005frender_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:render
    com.tonbeller.wcf.component.RendererTag _jspx_th_wcf_005frender_005f2 = (com.tonbeller.wcf.component.RendererTag) _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.get(com.tonbeller.wcf.component.RendererTag.class);
    _jspx_th_wcf_005frender_005f2.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005frender_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /testpage.jsp(106,2) name = ref type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f2.setRef("mdxedit01");
    // /testpage.jsp(106,2) name = xslUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f2.setXslUri("/WEB-INF/wcf/wcf.xsl");
    // /testpage.jsp(106,2) name = xslCache type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f2.setXslCache(true);
    int _jspx_eval_wcf_005frender_005f2 = _jspx_th_wcf_005frender_005f2.doStartTag();
    if (_jspx_th_wcf_005frender_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f2);
    return false;
  }

  private boolean _jspx_meth_wcf_005frender_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:render
    com.tonbeller.wcf.component.RendererTag _jspx_th_wcf_005frender_005f3 = (com.tonbeller.wcf.component.RendererTag) _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.get(com.tonbeller.wcf.component.RendererTag.class);
    _jspx_th_wcf_005frender_005f3.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005frender_005f3.setParent(null);
    // /testpage.jsp(110,0) name = ref type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f3.setRef("sortform01");
    // /testpage.jsp(110,0) name = xslUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f3.setXslUri("/WEB-INF/wcf/wcf.xsl");
    // /testpage.jsp(110,0) name = xslCache type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f3.setXslCache(true);
    int _jspx_eval_wcf_005frender_005f3 = _jspx_th_wcf_005frender_005f3.doStartTag();
    if (_jspx_th_wcf_005frender_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f3);
    return false;
  }

  private boolean _jspx_meth_wcf_005frender_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:render
    com.tonbeller.wcf.component.RendererTag _jspx_th_wcf_005frender_005f4 = (com.tonbeller.wcf.component.RendererTag) _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.get(com.tonbeller.wcf.component.RendererTag.class);
    _jspx_th_wcf_005frender_005f4.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005frender_005f4.setParent(null);
    // /testpage.jsp(113,0) name = ref type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f4.setRef("chartform01");
    // /testpage.jsp(113,0) name = xslUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f4.setXslUri("/WEB-INF/wcf/wcf.xsl");
    // /testpage.jsp(113,0) name = xslCache type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f4.setXslCache(true);
    int _jspx_eval_wcf_005frender_005f4 = _jspx_th_wcf_005frender_005f4.doStartTag();
    if (_jspx_th_wcf_005frender_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f4);
    return false;
  }

  private boolean _jspx_meth_wcf_005frender_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:render
    com.tonbeller.wcf.component.RendererTag _jspx_th_wcf_005frender_005f5 = (com.tonbeller.wcf.component.RendererTag) _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.get(com.tonbeller.wcf.component.RendererTag.class);
    _jspx_th_wcf_005frender_005f5.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005frender_005f5.setParent(null);
    // /testpage.jsp(116,0) name = ref type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f5.setRef("printform01");
    // /testpage.jsp(116,0) name = xslUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f5.setXslUri("/WEB-INF/wcf/wcf.xsl");
    // /testpage.jsp(116,0) name = xslCache type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f5.setXslCache(true);
    int _jspx_eval_wcf_005frender_005f5 = _jspx_th_wcf_005frender_005f5.doStartTag();
    if (_jspx_th_wcf_005frender_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f5);
    return false;
  }

  private boolean _jspx_meth_wcf_005frender_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:render
    com.tonbeller.wcf.component.RendererTag _jspx_th_wcf_005frender_005f6 = (com.tonbeller.wcf.component.RendererTag) _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.get(com.tonbeller.wcf.component.RendererTag.class);
    _jspx_th_wcf_005frender_005f6.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005frender_005f6.setParent(null);
    // /testpage.jsp(120,0) name = ref type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f6.setRef("table01");
    // /testpage.jsp(120,0) name = xslUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f6.setXslUri("/WEB-INF/jpivot/table/mdxtable.xsl");
    // /testpage.jsp(120,0) name = xslCache type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f6.setXslCache(true);
    int _jspx_eval_wcf_005frender_005f6 = _jspx_th_wcf_005frender_005f6.doStartTag();
    if (_jspx_th_wcf_005frender_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f6);
    return false;
  }

  private boolean _jspx_meth_wcf_005frender_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:render
    com.tonbeller.wcf.component.RendererTag _jspx_th_wcf_005frender_005f7 = (com.tonbeller.wcf.component.RendererTag) _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.get(com.tonbeller.wcf.component.RendererTag.class);
    _jspx_th_wcf_005frender_005f7.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005frender_005f7.setParent(null);
    // /testpage.jsp(123,0) name = ref type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f7.setRef("table01");
    // /testpage.jsp(123,0) name = xslUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f7.setXslUri("/WEB-INF/jpivot/table/mdxslicer.xsl");
    // /testpage.jsp(123,0) name = xslCache type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f7.setXslCache(true);
    int _jspx_eval_wcf_005frender_005f7 = _jspx_th_wcf_005frender_005f7.doStartTag();
    if (_jspx_th_wcf_005frender_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f7);
    return false;
  }

  private boolean _jspx_meth_wcf_005frender_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:render
    com.tonbeller.wcf.component.RendererTag _jspx_th_wcf_005frender_005f8 = (com.tonbeller.wcf.component.RendererTag) _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.get(com.tonbeller.wcf.component.RendererTag.class);
    _jspx_th_wcf_005frender_005f8.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005frender_005f8.setParent(null);
    // /testpage.jsp(127,0) name = ref type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f8.setRef("query01.drillthroughtable");
    // /testpage.jsp(127,0) name = xslUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f8.setXslUri("/WEB-INF/wcf/wcf.xsl");
    // /testpage.jsp(127,0) name = xslCache type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f8.setXslCache(true);
    int _jspx_eval_wcf_005frender_005f8 = _jspx_th_wcf_005frender_005f8.doStartTag();
    if (_jspx_th_wcf_005frender_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f8);
    return false;
  }

  private boolean _jspx_meth_wcf_005frender_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  wcf:render
    com.tonbeller.wcf.component.RendererTag _jspx_th_wcf_005frender_005f9 = (com.tonbeller.wcf.component.RendererTag) _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.get(com.tonbeller.wcf.component.RendererTag.class);
    _jspx_th_wcf_005frender_005f9.setPageContext(_jspx_page_context);
    _jspx_th_wcf_005frender_005f9.setParent(null);
    // /testpage.jsp(131,0) name = ref type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f9.setRef("chart01");
    // /testpage.jsp(131,0) name = xslUri type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f9.setXslUri("/WEB-INF/jpivot/chart/chart.xsl");
    // /testpage.jsp(131,0) name = xslCache type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_wcf_005frender_005f9.setXslCache(true);
    int _jspx_eval_wcf_005frender_005f9 = _jspx_th_wcf_005frender_005f9.doStartTag();
    if (_jspx_th_wcf_005frender_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fwcf_005frender_0026_005fxslUri_005fxslCache_005fref_005fnobody.reuse(_jspx_th_wcf_005frender_005f9);
    return false;
  }
}
