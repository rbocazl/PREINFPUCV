package org.apache.jsp.mantle.launch;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.InputStream;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import org.pentaho.platform.util.messages.LocaleHelper;
import org.pentaho.platform.api.engine.IPentahoSession;
import org.pentaho.platform.api.engine.IPluginManager;
import org.pentaho.platform.api.repository.ISolutionRepository;
import org.pentaho.platform.engine.core.system.PentahoSystem;
import org.pentaho.platform.engine.core.system.StandaloneSession;
import org.pentaho.platform.util.logging.Logger;
import org.pentaho.platform.web.jsp.messages.Messages;
import org.pentaho.platform.web.http.PentahoHttpSessionHelper;
import org.apache.commons.lang.StringEscapeUtils;
import org.pentaho.ui.xul.XulOverlay;
import org.pentaho.platform.api.engine.IPluginManager;

public final class launch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static ResourceBundle getBundle(String messageUri) {
    Locale locale = LocaleHelper.getLocale();
    IPentahoSession session = new StandaloneSession( "dashboards messages" ); //$NON-NLS-1$
    try {
        if (messageUri.startsWith("content/")) {
          messageUri = "system/" + messageUri.substring(8); //$NON-NLS-1$
        }
      InputStream in = PentahoSystem.get(ISolutionRepository.class, session).getResourceInputStream(messageUri, true, ISolutionRepository.ACTION_EXECUTE);
      return new PropertyResourceBundle( in );
    } catch (Exception e) {
      Logger.error( Messages.class.getName(), "Could not get localization bundle", e ); //$NON-NLS-1$
    }
    return null;
  }

  static class ButtonInfo {
    String buttonLabel;
    String buttonImage;
    String buttonCommand;
  }

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

      out.write('\r');
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
   * @author James Dixon
   *
   */

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>");
      out.print(Messages.getString("UI.PUC.LAUNCH.TITLE"));
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("  color: #000000;\r\n");
      out.write("  background-color: #FFFFFF;\r\n");
      out.write("  margin: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("  margin: 0px;\r\n");
      out.write("  padding: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A:link,A:visited,A:hover {\r\n");
      out.write("  color: #7e932f;\r\n");
      out.write("  text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A:hover {\r\n");
      out.write("  color: #ca6333;\r\n");
      out.write("  text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".launchPanel {\r\n");
      out.write("  background-color: white;\r\n");
      out.write("  background-image: url(images/quicklaunch_bg.png);\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  background-position: center;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_container {\r\n");
      out.write("  width: 620px;\r\n");
      out.write("  margin-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_icon_bar_left {\r\n");
      out.write("  width: 41px;\r\n");
      out.write("  height: 147px;\r\n");
      out.write("  vertical-align: top;\r\n");
      out.write("  padding-top: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_icon_bar_middle {\r\n");
      out.write("  background-image:\r\n");
      out.write("    url(images/ql_icon_bar_middle.png);\r\n");
      out.write("  background-repeat: repeat-x;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 199px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_icon_bar_right {\r\n");
      out.write("  width: 41px;\r\n");
      out.write("  height: 147px;\r\n");
      out.write("  vertical-align: top;\r\n");
      out.write("  padding-top: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_spacer {\r\n");
      out.write("  width: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_btn {\r\n");
      out.write("  width: 167px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_btn_left {\r\n");
      out.write("  width: 41px;\r\n");
      out.write("  height: 56px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_btn_middle {\r\n");
      out.write("  background-image: url(images/ql_btn_middle.png);\r\n");
      out.write("  background-repeat: repeat-x;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("  font-size: 1.25em;\r\n");
      out.write("  line-height: 20px;\r\n");
      out.write("  font-weight: 300;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  vertical-align: top;\r\n");
      out.write("  white-space: nowrap;\r\n");
      out.write("  padding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_btn_right {\r\n");
      out.write("  width: 41px;\r\n");
      out.write("  height: 56px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_btn_left_hover {\r\n");
      out.write("  width: 41px;\r\n");
      out.write("  height: 56px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_btn_middle_hover {\r\n");
      out.write("  background-image:\r\n");
      out.write("    url(images/ql_btn_middle_hover.png);\r\n");
      out.write("  background-repeat: repeat-x;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("  font-size: 1.25em;\r\n");
      out.write("  line-height: 20px;\r\n");
      out.write("  font-weight: 300;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  vertical-align: top;\r\n");
      out.write("  white-space: nowrap;\r\n");
      out.write("  padding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_btn_right_hover {\r\n");
      out.write("  width: 41px;\r\n");
      out.write("  height: 56px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_btn_cntr {\r\n");
      out.write("  width: 120px;\r\n");
      out.write("  height: 130px;\r\n");
      out.write("  padding-bottom: 13px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ql_logo {\r\n");
      out.write("  width: 290px;\r\n");
      out.write("  height: 91px;\r\n");
      out.write("  padding-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  width: 167px;\r\n");
      out.write("  padding: 0px;\r\n");
      out.write("  spacing: 0px;\r\n");
      out.write("  height: 56px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_left {\r\n");
      out.write("  background-image: url(\"images/ql_btn_left.png\");\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  height: 56px;\r\n");
      out.write("  width: 22px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_right {\r\n");
      out.write("  background-image: url(\"images/ql_btn_right.png\");\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  height: 56px;\r\n");
      out.write("  width: 22px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_center {\r\n");
      out.write("  background-image: url(images/ql_btn_middle.png);\r\n");
      out.write("  background-repeat: repeat-x;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("  font-size: 1.25em;\r\n");
      out.write("  line-height: 20px;\r\n");
      out.write("  font-weight: 300;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  vertical-align: top;\r\n");
      out.write("  white-space: nowrap;\r\n");
      out.write("  padding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_left_hover {\r\n");
      out.write("  background-image:\r\n");
      out.write("    url(\"images/ql_btn_left_hover.png\");\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  height: 56px;\r\n");
      out.write("  width: 22px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_right_hover {\r\n");
      out.write("  background-image:\r\n");
      out.write("    url(\"images/ql_btn_right_hover.png\");\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  height: 56px;\r\n");
      out.write("  width: 22px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn_center_hover {\r\n");
      out.write("  background-image:\r\n");
      out.write("    url(images/ql_btn_middle_hover.png);\r\n");
      out.write("  background-repeat: repeat-x;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("  font-size: 1.25em;\r\n");
      out.write("  line-height: 20px;\r\n");
      out.write("  font-weight: 300;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  vertical-align: top;\r\n");
      out.write("  white-space: nowrap;\r\n");
      out.write("  padding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language='javascript' src='../../content/data-access/resources/gwt/DatasourceEditor.nocache.js'></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var hadDatasourceAccess = false;\r\n");
      out.write("Button = function(label, command, container, lastBtn, src){\r\n");
      out.write("\t\r\n");
      out.write("\tvar tableRow1 =document.getElementById(\"buttonRow1\");\r\n");
      out.write("\tvar tableRow2 =document.getElementById(\"buttonRow2\");\r\n");
      out.write("\r\n");
      out.write("\tvar newTd = document.createElement(\"td\");\r\n");
      out.write("\tnewTd.setAttribute(\"align\", \"center\");\r\n");
      out.write("\tnewTd.setAttribute(\"valign\", \"top\");\r\n");
      out.write("\tnewTd.setAttribute(\"onclick\", \"window.parent.\"+command);\r\n");
      out.write("\tnewTd.setAttribute(\"class\", \"ql_btn_cntr\");\r\n");
      out.write("\t\r\n");
      out.write("\tvar launchImg = document.createElement(\"img\");\r\n");
      out.write("\tlaunchImg.setAttribute(\"src\", src);\r\n");
      out.write("\tlaunchImg.setAttribute(\"class\",\"ql_btn_cntr\");\r\n");
      out.write("\tnewTd.appendChild(launchImg);\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\ttableRow1.appendChild(newTd);\r\n");
      out.write("\t\r\n");
      out.write("\tvar newTd2 = document.createElement(\"td\");\r\n");
      out.write("\t\r\n");
      out.write("\ttableRow1.appendChild(newTd2);\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("  \r\n");
      out.write("   \tnewTd = document.createElement(\"td\");\r\n");
      out.write("\tnewTd.setAttribute(\"height\", \"100%\");\r\n");
      out.write("\ttableRow2.appendChild(newTd);\r\n");
      out.write("\t\r\n");
      out.write("\tnewTd2 = document.createElement(\"td\");\r\n");
      out.write("\tvar img = document.createElement(\"img\");\r\n");
      out.write("\timg.setAttribute(\"src\",\"images/ql_spacer.png\");\r\n");
      out.write("\timg.setAttribute(\"class\", \"ql_spacer\");\r\n");
      out.write("\tnewTd2.appendChild(img);\r\n");
      out.write("\tif (lastBtn == \"false\") {\r\n");
      out.write("\t\ttableRow2.appendChild(newTd2);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("    var btn = document.createElement(\"input\");\r\n");
      out.write("    btn.setAttribute(\"type\",\"button\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    table = document.createElement(\"table\");\r\n");
      out.write("    newTd.appendChild(table);\r\n");
      out.write("    \r\n");
      out.write("    table.setAttribute(\"cellpadding\",\"0\");\r\n");
      out.write("    table.setAttribute(\"cellspacing\",\"0\");\r\n");
      out.write("    table.setAttribute(\"border\",\"0\");\r\n");
      out.write("    table.className=\"button\";\r\n");
      out.write("    table.setAttribute(\"height\",\"56\");\r\n");
      out.write("    table.setAttribute(\"width\",\"167\");\r\n");
      out.write("    table.cellSpacing = \"0px\";\r\n");
      out.write("    table.cellPadding = \"0px\";\r\n");
      out.write("\r\n");
      out.write("    var tbody = document.createElement(\"tbody\");\r\n");
      out.write("    \r\n");
      out.write("    var tr = document.createElement(\"tr\");\r\n");
      out.write("\r\n");
      out.write("    var left_td = document.createElement(\"td\");\r\n");
      out.write("    left_td.className=\"btn_left\";\r\n");
      out.write("    left_td.innerHTML = \"<img src='images/ql_spacer.png'/ width='22' height='1'/><br/>\";\r\n");
      out.write("    tr.appendChild(left_td);\r\n");
      out.write("\r\n");
      out.write("    var center_td = document.createElement(\"td\");\r\n");
      out.write("    center_td.setAttribute(\"width\",\"100%\");\r\n");
      out.write("    center_td.className=\"btn_center\";\r\n");
      out.write("    center_td.onselectstart=function(){return false;}\r\n");
      out.write("    center_td.style.MozUserSelect='none';\r\n");
      out.write("    center_td.innerHTML = label;\r\n");
      out.write("    tr.appendChild(center_td);\r\n");
      out.write("\r\n");
      out.write("    var right_td = document.createElement(\"td\");\r\n");
      out.write("    right_td.innerHTML = \"<img src='images/ql_spacer.png'/ width='22' height='1'/><br/>\";\r\n");
      out.write("    right_td.className=\"btn_right\";\r\n");
      out.write("    tr.appendChild(right_td);\r\n");
      out.write("    tbody.appendChild(tr);\r\n");
      out.write("    \r\n");
      out.write("    table.appendChild(tbody);\r\n");
      out.write("\r\n");
      out.write("    table.onmouseover=function(){\r\n");
      out.write("      window.selectedButton = this;\r\n");
      out.write("      left_td.className=\"btn_left_hover\";\r\n");
      out.write("      right_td.className=\"btn_right_hover\";\r\n");
      out.write("      center_td.className=\"btn_center_hover\";\r\n");
      out.write("    };\r\n");
      out.write("    this.reset = function(){\r\n");
      out.write("      left_td.className=\"btn_left\";\r\n");
      out.write("      right_td.className=\"btn_right\";\r\n");
      out.write("      center_td.className=\"btn_center\";\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    table.onmouseout = this.reset;\r\n");
      out.write("    \r\n");
      out.write("    this.onClick=function(onClick){\r\n");
      out.write("      if(window.parent && window.parent.mantle_initialized){\r\n");
      out.write("        table.onclick = function(){eval(\"window.parent.\" + onClick)};\r\n");
      out.write("      }\r\n");
      out.write("    };\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("window.onresize = function(){\r\n");
      out.write("  if(window.selectedButton){\r\n");
      out.write("     window.selectedButton.onmouseout();\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("  // IE_6_FIX: When resized by PUC, IE will display rendering issues. This is accounted for by the code below. \r\n");
      out.write("  if(window.isIE6){\r\n");
      out.write("    \r\n");
      out.write("    // IE6 has a rate limit on the number of resize events that it will fire. This means we cannot rely on the\r\n");
      out.write("    // resize event alone to determine when the reisize is complete. The timer ensures that the layout is\r\n");
      out.write("    // recomputed after PUC is done resizing the iframe.\r\n");
      out.write("    setTimeout(function(){\r\n");
      out.write("      window.tableWrapperDiv.style.top = \"1px\";\r\n");
      out.write("      window.tableWrapperDiv.style.top = \"0px\";\r\n");
      out.write("    }, 350);\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function loader() {\r\n");
      out.write("  initDataAccess(hadDatasourceAccess);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function initDataAccess(hasAccess) {\r\n");
      out.write("  hadDatasourceAccess = hasAccess;\r\n");
      out.write("  \r\n");
      out.write("  // Clear any existing buttons (buttonRow1 = icons,  buttonRow2 = labels)\r\n");
      out.write("  var aButtonRow = document.getElementById(\"buttonRow1\");\r\n");
      out.write("  while (aButtonRow.firstChild) {\r\n");
      out.write("  \taButtonRow.removeChild(aButtonRow.firstChild);\r\n");
      out.write("  }\r\n");
      out.write("  aButtonRow = document.getElementById(\"buttonRow2\");\r\n");
      out.write("  while (aButtonRow.firstChild) {\r\n");
      out.write("  \taButtonRow.removeChild(aButtonRow.firstChild);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  // IE_6_FIX: We're using a CSS filter to enable transparany in IE 6. This has the side-effect of trapping mouse events in the\r\n");
      out.write("  // filtered area. The standard workaround is to wrap that area in two divs, one absolutely positioned inside a relative one.\r\n");
      out.write("\r\n");
      out.write("  var navAgent = window.navigator.userAgent;\r\n");
      out.write("  window.isIE6 = false;\r\n");
      out.write("  var reg = new RegExp(\"MSIE ([0-9]{1,}[\\.0-9]{0,})\").exec(navAgent)\r\n");
      out.write("  if (reg != null) {\r\n");
      out.write("    var version = parseFloat( RegExp.$1 );\r\n");
      out.write("    window.isIE6 = version >= 6.0 && version < 7.0;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  // The following wrapps the button table with two DIVs, one positioned relative and the other absolute.\r\n");
      out.write("  if(window.isIE6){\r\n");
      out.write("    var buttonTable = document.getElementById(\"buttonTable\");\r\n");
      out.write("    var parent = buttonTable.parentNode;\r\n");
      out.write("    window.tableWrapperDiv = document.createElement(\"div\");\r\n");
      out.write("    var absDiv = document.createElement(\"div\");\r\n");
      out.write("    \r\n");
      out.write("    with(tableWrapperDiv.style){\r\n");
      out.write("      position = \"relative\";\r\n");
      out.write("      width = \"100%\";\r\n");
      out.write("      height = \"100%\";\r\n");
      out.write("    }\r\n");
      out.write("    with(absDiv.style){\r\n");
      out.write("      position = \"absolute\";\r\n");
      out.write("      top = \"0px\";\r\n");
      out.write("      left = \"0px\";\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    parent.removeChild(buttonTable);\r\n");
      out.write("    parent.appendChild(tableWrapperDiv);\r\n");
      out.write("    tableWrapperDiv.appendChild(absDiv);\r\n");
      out.write("    absDiv.appendChild(buttonTable);\r\n");
      out.write("    tableWrapperDiv.id = \"buttonWrapperDiv\";\r\n");
      out.write("  }\r\n");
      out.write("  // End IE_6_FIX\r\n");
 
  Map<String, ButtonInfo> buttonOverlays = new HashMap<String, ButtonInfo>();

  List<String> buttonIds = new ArrayList<String>();
  buttonIds.add("launch_new_analysis"); //$NON-NLS-1$
  buttonIds.add("launch_new_report"); //$NON-NLS-1$
  buttonIds.add("manage_content"); //$NON-NLS-1$

  ButtonInfo newAnalysisButton = new ButtonInfo();
  newAnalysisButton.buttonCommand = "openAnalysis()"; //$NON-NLS-1$
  newAnalysisButton.buttonLabel = Messages.getString( "UI.PUC.LAUNCH.NEW_ANALYSIS" ); //$NON-NLS-1$
  newAnalysisButton.buttonImage = "images/btn_ql_newanalysis.png"; //$NON-NLS-1$
  buttonOverlays.put(buttonIds.get(0), newAnalysisButton);
	
  ButtonInfo newReportButton = new ButtonInfo();
  newReportButton.buttonCommand = "openWAQR()"; //$NON-NLS-1$
  newReportButton.buttonLabel = Messages.getString( "UI.PUC.LAUNCH.NEW_REPORT" ); //$NON-NLS-1$
  newReportButton.buttonImage = "images/btn_ql_newreport.png"; //$NON-NLS-1$
  buttonOverlays.put(buttonIds.get(1), newReportButton);
	
  ButtonInfo launchContentButton = new ButtonInfo();
  launchContentButton.buttonCommand = "openManage()"; //$NON-NLS-1$
  launchContentButton.buttonLabel = Messages.getString( "UI.PUC.LAUNCH.MANAGE_CONTENT" ); //$NON-NLS-1$
  launchContentButton.buttonImage = "images/btn_ql_manage.png"; //$NON-NLS-1$
  buttonOverlays.put(buttonIds.get(2), launchContentButton);

  buttonIds.add("data-access"); //$NON-NLS-1$
  ButtonInfo datasourceButton = new ButtonInfo();
  datasourceButton.buttonCommand = "newDatasource()"; //$NON-NLS-1$
  datasourceButton.buttonLabel = Messages.getString( "UI.PUC.LAUNCH.DATA_ACCESS" ); //$NON-NLS-1$
  datasourceButton.buttonImage = "images/quicklaunch_button_datasource.png"; //$NON-NLS-1$
  buttonOverlays.put(buttonIds.get(3), datasourceButton);

  IPluginManager pluginManager = PentahoSystem.get(IPluginManager.class, PentahoHttpSessionHelper.getPentahoSession(request)); 
  if (pluginManager != null) {
    for(XulOverlay overlayObj : pluginManager.getOverlays()) {
      if (overlayObj.getId() != null && overlayObj.getId().equals("launch")) { //$NON-NLS-1$
        ResourceBundle bundle = getBundle(overlayObj.getResourceBundleUri());
        // replace I18N parameters
        Pattern p = Pattern.compile("\\$\\{([^\\}]*)\\}"); //$NON-NLS-1$
        Matcher m = p.matcher(overlayObj.getOverlayXml());
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
          String param = m.group(1);
          m.appendReplacement(sb, bundle.getString(param));
        }
        m.appendTail(sb);
        String overlay = sb.toString();
        
        String button = null;
        int id = overlay.indexOf("id=\""); //$NON-NLS-1$
        if (id >= 0) {
          button = overlay.substring(id + 4, overlay.indexOf("\"", id + 4)); //$NON-NLS-1$
        }
        if (button != null) {
          ButtonInfo buttonInfo = new ButtonInfo();
          int startButtonLabel = overlay.indexOf("label=\""); //$NON-NLS-1$
          int endButtonLabel = overlay.indexOf("\"", startButtonLabel + 7); //$NON-NLS-1$
          buttonInfo.buttonLabel = overlay.substring(startButtonLabel + 7, endButtonLabel);
	        
          int startButtonImage = overlay.indexOf("image=\""); //$NON-NLS-1$
          int endButtonImage = overlay.indexOf("\"", startButtonImage + 7); //$NON-NLS-1$
          // relative path change is to handle images from plugins
          buttonInfo.buttonImage = "../../" + overlay.substring(startButtonImage + 7, endButtonImage); //$NON-NLS-1$
	  
          int startButtonCommand = overlay.indexOf("command=\""); //$NON-NLS-1$
          int endButtonCommand = overlay.indexOf("\"", startButtonCommand + 9); //$NON-NLS-1$
          buttonInfo.buttonCommand = overlay.substring(startButtonCommand + 9, endButtonCommand);
          if (!buttonOverlays.containsKey(button)) {
            buttonIds.add(button);
          }
          buttonOverlays.put(button, buttonInfo);
        }
      }
    }
  }
  // button javascript 
  int y=1;
  int buttonCount = buttonIds.size();
  for (String buttonId : buttonIds) {
  	boolean lastBtn = !(y < buttonIds.size());
  	if (buttonId.equals("data-access")) {

      out.write("\r\n");
      out.write("\t  if (hasAccess) {\r\n");

		ButtonInfo info = buttonOverlays.get(buttonId);

      out.write("      new Button(\"");
      out.print(info.buttonLabel);
      out.write("\", \"");
      out.print(info.buttonCommand);
      out.write('"');
      out.write(',');
      out.write('"');
      out.print(buttonId);
      out.write("\", \"");
      out.print(lastBtn);
      out.write("\", \"");
      out.print(info.buttonImage );
      out.write("\").onClick(\"");
      out.print( info.buttonCommand);
      out.write("\");\r\n");
      out.write("  \t  }\r\n");

  	} else {
      ButtonInfo info = buttonOverlays.get(buttonId);

      out.write("    new Button(\"");
      out.print(info.buttonLabel);
      out.write("\", \"");
      out.print(info.buttonCommand);
      out.write('"');
      out.write(',');
      out.write('"');
      out.print(buttonId);
      out.write("\", \"");
      out.print(lastBtn);
      out.write("\", \"");
      out.print(info.buttonImage );
      out.write("\").onClick(\"");
      out.print( info.buttonCommand);
      out.write("\");\r\n");

    }
    y++;
  }

      out.write("\r\n");
      out.write("  fixPNGs();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"../pngfix.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("      PngFix.spacerURL = \"images/ql_spacer.png\";\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onLoad=\"loader()\">\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin: 0px; padding: 0px; width: 100%; height: 100%;\">\r\n");
      out.write("<table style=\"width: 100%; height: 100%;\" class=\"launchPanel\" id=\"launchPanel\"\r\n");
      out.write("  cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td style=\"vertical-align: middle;\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    <table width=\"");
      out.print( 188 * buttonIds.size() );
      out.write("\" border=\"0\" align=\"center\" cellpadding=\"0\"\r\n");
      out.write("      cellspacing=\"0\" class=\"ql_container\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"");
      out.print( buttonIds.size() );
      out.write("\" align=\"center\"><img\r\n");
      out.write("          src=\"images/ql_logo.png\" alt=\"Pentaho.com\"\r\n");
      out.write("          class=\"ql_logo\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"ql_icon_bar_left\"><img\r\n");
      out.write("          src=\"images/ql_icon_bar_left.png\" width=\"41\"\r\n");
      out.write("          height=\"147\" /></td>\r\n");
      out.write("        <td class=\"ql_icon_bar_middle\" >\r\n");
      out.write("\r\n");
      out.write("            <table id=\"buttonTable\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("              height=\"100%\">\r\n");
      out.write("              <tr id=\"buttonRow1\">\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr id=\"buttonRow2\">\r\n");
      out.write("              </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"ql_icon_bar_right\"><img\r\n");
      out.write("          src=\"images/ql_icon_bar_right.png\"\r\n");
      out.write("          width=\"41\" height=\"147\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
}
