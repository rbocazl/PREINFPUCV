package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import org.dom4j.Document;
import org.pentaho.platform.engine.core.system.PentahoSystem;
import org.pentaho.platform.engine.core.system.PentahoSessionHolder;
import org.pentaho.platform.api.engine.IPentahoSession;
import org.pentaho.platform.util.xml.XmlHelper;
import org.pentaho.platform.engine.services.SolutionURIResolver;
import org.pentaho.platform.web.jsp.messages.Messages;
import org.pentaho.platform.api.engine.IUITemplater;
import org.pentaho.platform.web.http.WebTemplateHelper;
import org.pentaho.platform.util.messages.LocaleHelper;
import org.pentaho.platform.util.VersionHelper;
import org.pentaho.platform.web.http.PentahoHttpSessionHelper;

public final class Publish_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write('\n');
      out.write('\n');


/*
 * Copyright 2006 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 *
 * @created Jul 23, 2005 
 * @author Gretchen Moran
 * 
 */
 
	response.setCharacterEncoding(LocaleHelper.getSystemEncoding());
 	String baseUrl = PentahoSystem.getApplicationContext().getBaseUrl();
 
	String path = request.getContextPath();

	IPentahoSession userSession = PentahoHttpSessionHelper.getPentahoSession( request );
	//PPP-2148, BISERVER-3521: have to set the session back to the thread local since J2EE filters may have prematurely cleared it
	PentahoSessionHolder.setSession(userSession);

	String publish = request.getParameter( "publish" ); //$NON-NLS-1$	
	String style = request.getParameter( "style" ); //$NON-NLS-1$	
	String className = request.getParameter( "class" ); //$NON-NLS-1$	
	String message = ""; //$NON-NLS-1$
	String content = ""; //$NON-NLS-1$
	if( "now".equals( publish ) ) { //$NON-NLS-1$
		message = PentahoSystem.publish(userSession, className);
	}
	String templateName="template-dialog.html";
	if( "popup".equals( style ) ) {
		content = message;
	} else {
		Document publishersDocument = PentahoSystem.getPublishersDocument();
		if( publishersDocument != null ) {
			HashMap parameters = new HashMap();
			parameters.put( "message", message ); //$NON-NLS-1$
			StringBuffer sb = XmlHelper.transformXml( "publishers.xsl", null, publishersDocument.asXML(), parameters, new SolutionURIResolver(userSession) ); //$NON-NLS-1$
			if( sb != null ) {
				content = sb.toString();
			} else {
				content = Messages.getErrorString( "PUBLISHERS.ERROR_0001_PUBLISHERS_ERROR" ); //$NON-NLS-1$
			}
		}
	}
	
	String intro = "";
	String footer = "";
	IUITemplater templater = PentahoSystem.get(IUITemplater.class, userSession );
	if( templater != null ) {
		String sections[] = templater.breakTemplate( templateName, Messages.getString("UI.USER_PUBLISHER_TITLE"), userSession ); //$NON-NLS-1$ //$NON-NLS-2$
		if( sections != null && sections.length > 0 ) {
			intro = sections[0];
		}
		if( sections != null && sections.length > 1 ) {
			footer = sections[1];
		}
	} else {
		intro = Messages.getString( "UI.ERROR_0002_BAD_TEMPLATE_OBJECT" );
	}


      out.write('\r');
      out.write('\n');
      out.print( intro );
      out.write('\r');
      out.write('\n');
      out.print( content );
      out.write('\r');
      out.write('\n');
      out.print( footer );
      out.write('\r');
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
}
