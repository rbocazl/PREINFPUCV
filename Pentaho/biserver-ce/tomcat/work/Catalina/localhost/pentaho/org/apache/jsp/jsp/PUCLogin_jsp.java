package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.security.ui.AbstractProcessingFilter;
import org.springframework.security.ui.webapp.AuthenticationProcessingFilter;
import org.springframework.security.ui.savedrequest.SavedRequest;
import org.springframework.security.AuthenticationException;
import org.pentaho.platform.uifoundation.component.HtmlComponent;
import org.pentaho.platform.engine.core.system.PentahoSystem;
import org.pentaho.platform.util.messages.LocaleHelper;
import org.pentaho.platform.api.engine.IPentahoSession;
import org.pentaho.platform.web.http.WebTemplateHelper;
import org.pentaho.platform.api.engine.IUITemplater;
import org.pentaho.platform.web.jsp.messages.Messages;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.apache.commons.lang.StringEscapeUtils;
import org.pentaho.platform.web.http.PentahoHttpSessionHelper;

public final class PUCLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

// List of request URL strings to look for to send 401

	private List<String> send401RequestList;

	public void jspInit() {
		// super.jspInit(); 
		send401RequestList = new ArrayList<String>();
		String unauthList = getServletConfig().getInitParameter("send401List"); //$NON-NLS-1$
		if (unauthList == null) {
			send401RequestList.add("AdhocWebService"); //$NON-NLS-1$
		} else {
			StringTokenizer st = new StringTokenizer(unauthList, ","); //$NON-NLS-1$
			String requestStr;
			while (st.hasMoreElements()) {
				requestStr = st.nextToken();
				send401RequestList.add(requestStr.trim());
			}
		}
	}
// reads the exception stored by AbstractProcessingFilter
	private String getUserMessage(final AuthenticationException e) {
		String userMessage = Messages
				.getString("UI.USER_LOGIN_FAILED_DEFAULT_REASON");
		if (null != e) {
			String errorClassName = e.getClass().getName();
			errorClassName = errorClassName.replace('.', '_');
			errorClassName = errorClassName.toUpperCase();
			String key = "UI.USER_LOGIN_FAILED_REASON_" + errorClassName;
			String tmp = Messages.getString(key);
			if (null != tmp && 0 != tmp.length() && !tmp.startsWith("!")) {
				userMessage = tmp;
			}
		}
		return userMessage;
	}
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	response.setCharacterEncoding(LocaleHelper.getSystemEncoding());
	String path = request.getContextPath();

	IPentahoSession userSession = PentahoHttpSessionHelper
			.getPentahoSession(request);
	// SPRING_SECURITY_SAVED_REQUEST_KEY contains the URL the user originally wanted before being redirected to the login page
	// if the requested url is in the list of URLs specified in the web.xml's init-param send401List,
	// then return a 401 status now and don't show a login page (401 means not authenticated)
	Object reqObj = request.getSession().getAttribute(AbstractProcessingFilter.SPRING_SECURITY_SAVED_REQUEST_KEY);
	String requestedURL = "";
	if (reqObj != null) {
		requestedURL = ((SavedRequest) reqObj).getFullRequestUrl();

		String lookFor;
		for (int i = 0; i < send401RequestList.size(); i++) {
			lookFor = send401RequestList.get(i);
			if (requestedURL.indexOf(lookFor) >= 0) {
				response.sendError(401);
				return;
			}
		}
	}

	boolean loggedIn;
	String remoteUser = request.getRemoteUser();
	if (remoteUser != null && remoteUser != "") {
		loggedIn = true;
	}
	
	int year = (new java.util.Date()).getYear() + 1900;
	

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Pentaho User Console - Login</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body,td,th {\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A:link,A:visited,A:active {\r\n");
      out.write("\tcolor: #7e932f;\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A:hover {\r\n");
      out.write("\tcolor: #ca6333;\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-banner {\r\n");
      out.write("\tbackground-image: url(/pentaho-style/images/login/start_banner.png);\r\n");
      out.write("\tbackground-repeat: repeat-x;\r\n");
      out.write("\tpadding: 90px 0px 0px 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".lrg_box_top {\r\n");
      out.write("\tbackground-image: url(/pentaho-style/images/login/start_lrg_box_top.png)\r\n");
      out.write("\t\t;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\theight: 85px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tvertical-align: bottom;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".lrg_box_bottom {\r\n");
      out.write("\tbackground-image:\r\n");
      out.write("\t\turl(/pentaho-style/images/login/start_lrg_box_bottom.png);\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-position: bottom;\r\n");
      out.write("\tpadding: 0px 0px 25px 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sm_box_top {\r\n");
      out.write("\tbackground-image: url(/pentaho-style/images/login/start_sm_box_top.png);\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tvertical-align: bottom;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 1.2em;\r\n");
      out.write("\tcolor: #7e932f;\r\n");
      out.write("\tfont-weight: 300;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tpadding: 10px 0px 0px 18px;\r\n");
      out.write("\twidth: 270px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sm_box_bottom {\r\n");
      out.write("\tbackground-image:\r\n");
      out.write("\t\turl(/pentaho-style/images/login/start_sm_box_bottom.png);\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-position: bottom left;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: .85em;\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("\tpadding: 10px 12px 14px 18px;\r\n");
      out.write("\twidth: 270px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".start_login_title {\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 1.2em;\r\n");
      out.write("\tcolor: #7e932f;\r\n");
      out.write("\tfont-weight: 300;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tpadding: 18px 0px 0px 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".start_content {\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: .85em;\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tvertical-align: bottom;\r\n");
      out.write("\tpadding: 10px 0px 0px 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_login_box {\r\n");
      out.write("\tbackground-image: url(/pentaho-style/images/login/start_btn_login.png);\r\n");
      out.write("\twidth: 204px;\r\n");
      out.write("\theight: 69px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tmargin: 18px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_login_box-hover {\r\n");
      out.write("\tbackground-image:\r\n");
      out.write("\t\turl(/pentaho-style/images/login/start_btn_login_hover.png);\r\n");
      out.write("\twidth: 204px;\r\n");
      out.write("\theight: 69px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tmargin: 18px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_login_title {\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 1em;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tvertical-align: bottom;\r\n");
      out.write("\theight: 28px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_login_text {\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 1.5em;\r\n");
      out.write("\tfont-weight: 300;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("\theight: 41px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".start_footer {\r\n");
      out.write("\tbackground-image: url(/pentaho-style/images/login/start_footer_bg.png);\r\n");
      out.write("\tbackground-repeat: repeat-x;\r\n");
      out.write("\tbackground-position: top;\r\n");
      out.write("\tpadding: 20px 0px 0px 0px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tvertical-align: bottom;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer_txt {\r\n");
      out.write("\twidth: 564px;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: .7em;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: .85em;\r\n");
      out.write("\tfont-weight: 300;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button .button_left {\r\n");
      out.write("\tbackground-image: url('/pentaho-style/images/login/button_left.png');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button .button_middle {\r\n");
      out.write("\tbackground-image: url('/pentaho-style/images/login/button_middle.png');\r\n");
      out.write("\tbackground-repeat: repeat-x;\r\n");
      out.write("\twhite-space: nowrap;\r\n");
      out.write("\tline-height: 24px;\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button .button_right {\r\n");
      out.write("\tbackground-image: url('/pentaho-style/images/login/button_right.png');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button_over {\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: .85em;\r\n");
      out.write("\tfont-weight: 300;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button_over .button_left {\r\n");
      out.write("\tbackground-image:\r\n");
      out.write("\t\turl('/pentaho-style/images/login/button_left_over.png');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button_over .button_middle {\r\n");
      out.write("\tbackground-image:\r\n");
      out.write("\t\turl('/pentaho-style/images/login/button_middle_over.png');\r\n");
      out.write("\tbackground-repeat: repeat-x;\r\n");
      out.write("\twhite-space: nowrap;\r\n");
      out.write("\tline-height: 24px;\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button_over .button_right {\r\n");
      out.write("\tbackground-image:\r\n");
      out.write("\t\turl('/pentaho-style/images/login/button_right_over.png');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text {\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: .85em;\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<meta name=\"gwt:property\" content=\"locale=");
      out.print(request.getLocale());
      out.write("\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/pentaho-style/favicon.ico\" />\r\n");
      out.write("<link href=\"/pentaho-style/styles-new.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction logout(){\r\n");
      out.write("\t\t\tvar req = null;\r\n");
      out.write("\t\t\tif (window.XMLHttpRequest){\r\n");
      out.write("\t\t\t  req = new XMLHttpRequest();\r\n");
      out.write("\t\t\t} else if(windw.ActiveXObject){\r\n");
      out.write("\t\t\t  req = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar responseHandler = function(){\r\n");
      out.write("\t\t\t if(req.readyState == 4){\r\n");
      out.write("\t\t\t   if(req.status == 200){\r\n");
      out.write("\t\t\t     openLoginDialog('");
      out.print(requestedURL);
      out.write("');\r\n");
      out.write("\t\t\t    } else {\r\n");
      out.write("\t\t\t      window.location.href = window.location.href; \r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(req == null){\r\n");
      out.write("\t\t\t  document.location=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t    req.onreadystatechange = responseHandler;\r\n");
      out.write("\t\t    req.open(\"GET\",\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\",true);\r\n");
      out.write("\t\t    req.send(\"\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\tclass=\"login-banner\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" bordercolor=\"0\"><!--Begin First Box Row -->\r\n");
      out.write("\t\t<table width=\"564\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\t\tstyle=\"margin-bottom: 22px;\" align=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"lrg_box_top\"><a href=\"http://www.pentaho.com\"\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\tsrc=\"/pentaho-style/images/login/start_logo.png\"\r\n");
      out.write("\t\t\t\t\talt=\"Pentaho Corporation\" width=\"210\" height=\"62\" border=\"0\" /></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"lrg_box_bottom\">\r\n");
      out.write("\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" class=\"start_login_title\">Welcome to the\r\n");
      out.write("\t\t\t\t\t\tPentaho User Console</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"start_content\">\r\n");
      out.write("\t\t\t\t\t\t<p>The Pentaho User Console provides access to powerful\r\n");
      out.write("\t\t\t\t\t\tBusiness Intelligence (BI) capabilities found in the Pentaho BI\r\n");
      out.write("\t\t\t\t\t\tSuite. Login or use the links below to learn more about Pentaho's\r\n");
      out.write("\t\t\t\t\t\treporting, analysis, dashboards, data mining and data integration.</p>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><!--Begin Login Button -->\r\n");
      out.write("\t\t\t\t\t\t<table class=\"btn_login_box\" border=\"0\" cellspacing=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\tcellpadding=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\tonMouseOver=\"this.className='btn_login_box-hover'\"\r\n");
      out.write("\t\t\t\t\t\t\tonMouseOut=\"this.className='btn_login_box'\"\r\n");
      out.write("\t\t\t\t\t\t\tonBlur=\"this.className='btn_login_box'\"\r\n");
      out.write("\t\t\t\t\t\t\tonClick=\"this.className='btn_login_box';");
if (null != remoteUser && remoteUser.length() > 0) {
      out.write("logout()");
} else {
      out.write("openLoginDialog('");
      out.print(requestedURL);
      out.write('\'');
      out.write(')');
}
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								if (null != remoteUser && remoteUser.length() > 0) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"btn_login_title\">Logged In</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"btn_login_text\">Restart Session</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"btn_login_title\">Pentaho User Console</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"btn_login_text\">");
      out.print(Messages.getString("UI.USER_LOGIN"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<!--End Login Button --></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<!--End First Box Row --> <!--Begin Second Box Row --> <!--Begin Enterprise Boxes -->\r\n");
      out.write("\t\t<table width=\"564\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\t\tstyle=\"margin-bottom: 22px;\" align=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"sm_box_top\">Achieve BI Success</td>\r\n");
      out.write("\t\t\t\t<td><img src=\"/pentaho-style/images/login/spacer.png\"\r\n");
      out.write("\t\t\t\t\twidth=\"20\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"sm_box_top\">Getting Started</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"sm_box_bottom\" height=\"100%\">\r\n");
      out.write("\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" height=\"100%\" width=\"100%\"\r\n");
      out.write("\t\t\t\t\tborder=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"100%\" valign=\"top\" class=\"text\">Deploy the\r\n");
      out.write("\t\t\t\t\t\tworld's most popular open source BI suite with confidence,\r\n");
      out.write("\t\t\t\t\t\tsecurity, and far lower total cost of ownership than proprietary\r\n");
      out.write("\t\t\t\t\t\talternatives with the Pentaho Enterprise Edition products.<br />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><!-- GUI Button -->\r\n");
      out.write("\t\t\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\twidth=\"50\" onMouseOver=\"this.className='button_over'\"\r\n");
      out.write("\t\t\t\t\t\t\tonMouseOut=\"this.className='button'\" align=\"right\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"margin-top: 6px;\"\r\n");
      out.write("\t\t\t\t\t\t\tonClick=\"window.open('http://www.pentaho.com/products/enterprise', '_blank');\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"7\" height=\"27\" class=\"button_left\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/pentaho-style/images/login/spacer.png\" width=\"7\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"27\" /><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"button_middle\" width=\"100%\">Learn More</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"7\" height=\"27\" class=\"button_right\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/pentaho-style/images/login/spacer.png\" width=\"7\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"27\" /><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<!-- End button --></td>\r\n");
      out.write("\t\t\t\t<td><img src=\"/pentaho-style/images/login/spacer.png\"\r\n");
      out.write("\t\t\t\t\twidth=\"20\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"sm_box_bottom\" height=\"100%\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" height=\"100%\" width=\"100%\"\r\n");
      out.write("\t\t\t\t\tborder=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"100%\" valign=\"top\" class=\"text\">The Pentaho BI\r\n");
      out.write("\t\t\t\t\t\tSuite provides a full spectrum of BI capabilities. Get a quick\r\n");
      out.write("\t\t\t\t\t\toverview of how to create and share reports and analytics with the\r\n");
      out.write("\t\t\t\t\t\t<span style=\"font-style: italic;\">Evaluating Pentaho\r\n");
      out.write("\t\t\t\t\t\tReporting</span> guide. <br />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><!-- GUI Button -->\r\n");
      out.write("\t\t\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\twidth=\"50\" onMouseOver=\"this.className='button_over'\"\r\n");
      out.write("\t\t\t\t\t\t\tonMouseOut=\"this.className='button'\" align=\"right\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"margin-top: 6px;\"\r\n");
      out.write("\t\t\t\t\t\t\tonClick=\"window.open(window.location.href.replace('Login', '");
      out.print(PentahoSystem.getSystemSetting("documentation-url",
							"docs/community_user_guide.pdf"));
      out.write("'), '_blank');\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"7\" height=\"27\" class=\"button_left\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/pentaho-style/images/login/spacer.png\" width=\"7\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"27\" /><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"button_middle\" width=\"100%\">Download PDF</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"7\" height=\"27\" class=\"button_right\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/pentaho-style/images/login/spacer.png\" width=\"7\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"27\" /><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<!-- End button --></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<!--End Enterprise Boxes --> <!--End Second Box Row --></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<!--Begin Footer -->\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" class=\"start_footer\">\r\n");
      out.write("\t\t<table width=\"563\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\t\tstyle=\"margin-bottom: 22px;\" align=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"footer_txt\">Supplied free of charge with no support,\r\n");
      out.write("\t\t\t\tno certification, no maintenance, no warranty and no indemnity by\r\n");
      out.write("\t\t\t\tPentaho or its Certified Partners. <a\r\n");
      out.write("\t\t\t\t\thref=\"http://www.pentaho.com/products/enterprise\" target=\"_blank\">Consider\r\n");
      out.write("\t\t\t\tthe Pentaho Enterprise Edition</a>: Save time, resources, money and\r\n");
      out.write("\t\t\t\tmitigate risk. <br />\r\n");
      out.write("\t\t\t\t&#169; 2005-");
      out.print( year );
      out.write(" Pentaho Corporation. All rights reserved.</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language='javascript' src='mantleLogin/mantleLogin.nocache.js'></script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.el.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.el.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.el.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /jsp/PUCLogin.jsp(296,24) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("Logout");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.el.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.el.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.el.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /jsp/PUCLogin.jsp(299,22) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("Logout");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }
}
