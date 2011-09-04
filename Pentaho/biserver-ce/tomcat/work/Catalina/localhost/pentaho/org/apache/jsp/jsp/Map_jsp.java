package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.pentaho.platform.engine.core.system.PentahoSystem;
import org.pentaho.platform.api.engine.IPentahoSession;
import org.pentaho.platform.api.repository.ISolutionRepository;
import org.pentaho.platform.web.jsp.messages.Messages;
import org.pentaho.platform.web.http.WebTemplateHelper;
import org.pentaho.platform.util.messages.LocaleHelper;
import org.pentaho.platform.util.VersionHelper;
import org.pentaho.platform.api.ui.INavigationComponent;
import org.pentaho.platform.util.web.SimpleUrlFactory;
import org.pentaho.platform.engine.core.solution.SimpleParameterProvider;
import org.pentaho.platform.engine.services.actionsequence.ActionResource;
import org.pentaho.platform.api.engine.IActionSequenceResource;
import org.pentaho.platform.api.engine.IUITemplater;
import org.pentaho.platform.engine.core.output.SimpleOutputHandler;
import org.pentaho.platform.engine.services.BaseRequestHandler;
import org.pentaho.platform.api.engine.IRuntimeContext;
import org.pentaho.commons.connection.IPentahoResultSet;
import org.pentaho.platform.uifoundation.chart.ChartHelper;
import org.pentaho.platform.engine.services.solution.SolutionHelper;
import java.util.ArrayList;
import org.pentaho.platform.web.http.PentahoHttpSessionHelper;

public final class Map_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
 /*
 * This JSP is an example of how to use Pentaho components and AJAX library to build a 
 * Google Maps dashboard.
 * This file loads customer data and displays it using Google Maps.
 * The script for this file is in js/google-demo.js
 * The Pentaho AJAX library is in js/pentaho-ajax.js
 * See the document 'Pentaho AJAX Guide' for more details
 */

	// Set the character encoding e.g. UFT-8
	response.setCharacterEncoding(LocaleHelper.getSystemEncoding());
 
	// Get the current Pentaho session or create a new one if needed
	IPentahoSession userSession = PentahoHttpSessionHelper.getPentahoSession( request );

	// Set the default thresholds
	int topthreshold = 100000;
	int bottomthreshold = 50000;

	// Get the server and port. We use this to check for an invalid Google Maps API key
	boolean defaultKeyInvalid = false;
	String serverName = request.getServerName();
	int serverPort = request.getServerPort();
	
	// Get a templater object
	String intro = "";
	String footer = "";
	IUITemplater templater = PentahoSystem.get(IUITemplater.class, userSession );
	if( templater != null ) {

		// Load a template for this web page
		String template = null;
  		try {
	   		ActionResource resource = new ActionResource( "", IActionSequenceResource.SOLUTION_FILE_RESOURCE, "text/xml", "system/custom/template-document.html" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    			template = PentahoSystem.get(ISolutionRepository.class, userSession).getResourceAsString( resource, ISolutionRepository.ACTION_EXECUTE );
    		} catch (Throwable t) {
                  t.printStackTrace();
    		}

		// Check to see if we are using the default Google Maps API key but not for localhost:8080
		String googleMapsApiKey = PentahoSystem.getSystemSetting("google/googlesettings.xml", "google_maps_api_key", null); 
		if( ( !serverName.equals( "localhost" ) || serverPort != 8080 ) && googleMapsApiKey.equals( "ABQIAAAAoGNlMo4FkTb3mcC5mj5ERRTwM0brOpm-All5BF6PoaKBxRWWERR0378zH4HL9GyjgMMHJmj_viP4PQ" ) ) {
			// the default Google Maps API key is not valid for this server and port
			defaultKeyInvalid = true;
		} else {
			// insert the Pentaho AJAX, Google Maps, and demo script references into the document header
			template = template.replaceAll( "\\{header-content\\}", "	<script language=\"javascript\" src=\"js/pentaho-ajax.js\"></script>\n<script src=\"http://maps.google.com/maps?file=api&amp;v=2&amp;key="+googleMapsApiKey+"\" type=\"text/javascript\"></script>\n<script language=\"javascript\" src=\"js/google-demo.js\"></script>\n" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			template = template.replaceAll( "\\{body-tag\\}", "onload=\"load()\" onunload=\"GUnload()\"" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		// Break the template into header and footer sections
		String sections[] = templater.breakTemplateString( template, "Pentaho Google Maps Dashboard", userSession ); //$NON-NLS-1$ //$NON-NLS-2$
		if( sections != null && sections.length > 0 ) {
			intro = sections[0];
		}
		if( sections != null && sections.length > 1 ) {
			footer = sections[1];
		}
	} else {
		intro = Messages.getString( "UI.ERROR_0002_BAD_TEMPLATE_OBJECT" );
	}

		// Load the customer data. Do this by running an action sequence defined in pentaho-solutions/steel-wheels/google/map1.xaction
		SimpleParameterProvider parameters = new SimpleParameterProvider();
		ArrayList messages = new ArrayList();
		// 'results' will store the customer data
		IPentahoResultSet results = null;
        IRuntimeContext runtime = null;
        try {
			// Run the action sequence
			runtime = SolutionHelper.doAction( "steel-wheels",  "google",  "map1.xaction",  "Map.jsp",  parameters,  userSession,  messages,  null );
			// See if we have a valid result
            if( runtime != null ) {
				if( runtime.getStatus() == IRuntimeContext.RUNTIME_STATUS_SUCCESS ) {
					if( runtime.getOutputNames().contains("data") ) {
						results = runtime.getOutputParameter( "data" ).getValueAsResultSet();
					}
				}
            }
        } finally {
            if (runtime != null) {
            		// Now clean up 
                	runtime.dispose();
            }
        }

		String customerNum = "";
		String customer = "";
		String city = "";
		String state = "";
		String zip = "";
		String value = "";


      out.write('\n');
      out.write('\n');
      out.print( intro );
      out.write('\n');
      out.write('\n');
 
	if( defaultKeyInvalid ) { 
		// The default key is not valid so we put out a nice message about it.

      out.write("\n");
      out.write("\n");
      out.write("The Google Maps API key that ships with the Pentaho Pre-Configured Installation will only work with a server address of 'http://localhost:8080'. \n");
      out.write("<p/> \n");
      out.write("To use Google Maps with this server address ( ");
      out.print( serverName );
      out.write(':');
      out.print( serverPort );
      out.write(" ) you need to apply to Google for a new key.\n");
      out.write("<p/>\n");
      out.write("Once you have the new key you need to add it to the Google settings file in the Pentaho system (.../pentaho-solutions/system/google/googlesettings.xml)\n");
      out.write("<p/>\n");
      out.write("<a target='google-map-api-key' href='http://www.google.com/apis/maps/signup.html'>Click here</a> to get a Google Maps API Key for this server.\n");
      out.write("\n");
 
	} else { 
		// embed the customer data into the web page

      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    //<![CDATA[\n");
      out.write("\n");
      out.write("\tfunction addPoints() {\n");
      out.write("    \t\tif (GBrowserIsCompatible()) {\n");
      out.write("\t\t");

			// Add all of the customer data into the web page
			int n = results.getRowCount();
			for( int row=0; row<n; row++ ) {
				// Get the information about the customer in the current row
				customerNum = results.getValueAt( row, 0 ).toString();
				customer = (String) results.getValueAt( row, 1 );
				city = (String) results.getValueAt( row, 2 );
				state = (String) results.getValueAt( row, 3 );
				value = results.getValueAt( row, 5 ).toString();
				// create a javascript call that passes the customer's details
				
      out.write("\n");
      out.write("\t\t\t\ttry {\n");
      out.write("\t\t\t\t\tshowAddress( \"");
      out.print( city );
      out.write(',');
      out.print( state );
      out.write("\", \"");
      out.print( customer );
      out.write("\", \"");
      out.print( customerNum );
      out.write('"');
      out.write(',');
      out.write(' ');
      out.print( value );
      out.write(", false );\n");
      out.write("\t\t\t\t} catch (e) {\n");
      out.write("\t\t\t\t\te.printStackTrace();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t");

			}
		
      out.write("\n");
      out.write("     \t}\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //]]>\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\t<!-- create the visual elements of the page -->\n");
      out.write("\n");
      out.write("\t<!-- define the thresholds panel -->\n");
      out.write("    <div id=\"selections\" style=\"position:absolute;width: 345px; height: 200px;top:40px; left:5px; border:0px\">\n");
      out.write("    \n");
      out.write("\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" >\n");
      out.write("\t\t\t<tr>\n");
      out.write("    \t\t\t\t<td valign=\"top\">\n");
      out.write("      \t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"margin:0px; padding:0px\">\n");
      out.write("          \t\t\t\t<tr>\n");
      out.write("            \t\t\t\t\t<td style=\"background-image: url(/pentaho-style/images/fly-top-left1.png); height: 25px; width: 25px;\">\n");
      out.write("            \t\t\t\t\t\t&nbsp;\n");
      out.write("            \t\t\t\t\t</td>\n");
      out.write("            \t\t\t\t\t<td style=\"background-image: url(/pentaho-style/images/fly-top1.png); width: 100%; \">\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"font: normal 1.1em Tahoma, 'Trebuchet MS', Arial;\">Select Sales Thresholds</span>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("                                             <!-- Keep this for a backup\n");
      out.write("            \t\t\t\t\t<td width=\"100%\" style=\"background-image: url(/pentaho-style/images/fly-top1.png); background-repeat: repeat-x; height: 25px; width: 100%; margin:0px; padding:0px \">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"a\" style=\"font: normal 1.1em Tahoma, 'Trebuchet MS', Arial;\">Select Sales Thresholds</span>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("                                             -->\n");
      out.write("          \t\t\t\t</tr>\n");
      out.write("          \t\t\t\t<tr>\n");
      out.write("            \t\t\t\t\t<td colspan=\"2\" style=\"background-color: #e5e5e5;\">\n");
      out.write("            \t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" height=\"100%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("                  \t\t\t\t\t\t<td style=\"background-image: url(/pentaho-style/images/fly-left1.png); background-repeat: repeat-y; height: 10px; padding: 0px 5px 0px 0px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img border=\"0\" src=\"/pentaho-style/images/fly-left1.png\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tView: <a href=\"javascript:void\" onclick=\"map.setCenter( new GLatLng(35.55, -119.268 ), 6); return false;\">West Coast</a> | \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:void\" onclick=\"map.setCenter( new GLatLng(41.4263, -73.1799 ), 7); return false;\">East Coast</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("                \t\t\t\t\t\t<tr style=\"background-color: #e5e5e5;\">\n");
      out.write("                  \t\t\t\t\t\t<td style=\"background-image: url(/pentaho-style/images/fly-left1.png); background-repeat: repeat-y; height: 10px; padding: 0px 5px 0px 0px;\">\n");
      out.write("\t\t\t\t\t\t\t\t<img border=\"0\" src=\"/pentaho-style/images/fly-left1.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" style=\"padding: 0px 0px 0px 0px;\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img border=\"0\" src=\"http://labs.google.com/ridefinder/images/mm_20_red.png\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"bottomthreshold\" onchange=\"update(false)\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">0</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"10000\">10000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"20000\">20000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"30000\">30000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"40000\">40000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"50000\" selected>50000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"60000\">60000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"70000\">70000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"80000\">80000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"90000\">90000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"100000\">100000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"110000\">110000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"120000\">120000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"130000\">130000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"140000\">140000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"150000\">150000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"160000\">160000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"170000\">170000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"180000\">180000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"190000\">190000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"200000\">200000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img border=\"0\" src=\"http://labs.google.com/ridefinder/images/mm_20_yellow.png\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"topthreshold\" onchange=\"update(true)\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">0</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"10000\">10000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"20000\">20000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"30000\">30000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"40000\">40000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"50000\">50000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"60000\">60000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"70000\">70000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"80000\">80000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"90000\">90000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"100000\" selected>100000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"110000\">110000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"120000\">120000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"130000\">130000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"140000\">140000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"150000\">150000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"160000\">160000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"170000\">170000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"180000\">180000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"190000\">190000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"200000\">200000</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img border=\"0\" src=\"http://labs.google.com/ridefinder/images/mm_20_green.png\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("                \t\t\t\t\t\t</tr>\n");
      out.write("            \t\t\t\t\t\t</table>\n");
      out.write("            \t\t\t\t\t</td>\n");
      out.write("          \t\t\t\t</tr>\n");
      out.write("          \t\t\t\t<tr>\n");
      out.write("            \t\t\t\t\t<td style=\"height: 25px; width: 25px;\">\n");
      out.write("            \t\t\t\t\t\t<img border=\"0\" src=\"/pentaho-style/images/fly-bot-left1.png\" /><br /> \n");
      out.write("            \t\t\t\t\t</td>\n");
      out.write("\n");
      out.write("            \t\t\t\t\t<td               style=\"background-image: url(/pentaho-style/images/fly-bot1.png); background-repeat: repeat-x\"><img border=\"0\" src=\"/pentaho-style/images/fly-bot1.png\" /><br /></td>\n");
      out.write("          \t\t\t\t</tr>\n");
      out.write("      \t\t\t\t</table>\n");
      out.write("      \t\t\t</td>\n");
      out.write("    \t\t\t\t<td valign=\"top\" style=\"padding: 0px 0px 0px 0px; font-size: .85em;\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("  \t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<br/>\n");
      out.write("\t\t<center>\n");
      out.write("\t\t\t<img border=\"0\" src=\"/pentaho-style/images/pentaho_googlemap_white.png\" style=\"padding-top:5px\"/>\n");
      out.write("\t\t</center>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- define the customer details panel -->\n");
      out.write("    <div id=\"details-div\" style=\"position:absolute;width: 320px; xheight: 500px;top:135px; left:30px; border:0px;display:none;overflow: none;\">\n");
      out.write("\n");
      out.write("\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" xheight=\"470\">\n");
      out.write("  \t\t\t<tr>\n");
      out.write("    \t\t\t\t<td valign=\"top\">\n");
      out.write("      \t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" xheight=\"470\" style=\"margin:0px; padding:0px\">\n");
      out.write("          \t\t\t\t<tr>\n");
      out.write("            \t\t\t\t\t<td colspan=\"2\"  valign=\"top\" style=\"background-color: #e5e5e5;\">\n");
      out.write("            \t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" height=\"100%\">\n");
      out.write("                \t\t\t\t\t\t<tr style=\"background-color: #e5e5e5;\">\n");
      out.write("                  \t\t\t\t\t\t<td style=\"background-image: url(/pentaho-style/images/fly-left1.png); background-repeat: repeat-y; height: 10px; padding: 0px 5px 0px 0px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&nbsp;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" style=\"padding: 0px 0px 0px 0px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"details-cell1\" style=\"padding: 0px 0px 0px 0px;height: 250px; overflow: auto; \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("                \t\t\t\t\t\t</tr>\n");
      out.write("               \t\t\t\t\t\t<tr style=\"background-color: #e5e5e5;\">\n");
      out.write("                  \t\t\t\t\t\t<td style=\"background-image: url(/pentaho-style/images/fly-left1.png); background-repeat: repeat-y; padding: 0px 5px 0px 0px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&nbsp;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" style=\"padding: 10px 0px 0px 0px;height: 113px; overflow: auto; font: normal 1.1em Tahoma, 'Trebuchet MS', Arial;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<center>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tSales History\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</center>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"details-cell2\" style=\"padding: 0px 0px 0px 0px;height: 113px; width: 85%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("                \t\t\t\t\t\t</tr>\n");
      out.write("            \t\t\t\t\t\t</table>\n");
      out.write("            \t\t\t\t\t</td>\n");
      out.write("          \t\t\t\t</tr>\n");
      out.write("          \t\t\t\t<tr>\n");
      out.write("            \t\t\t\t\t<td width=\"25\" style=\"height: 25px; width: 25px;\">\n");
      out.write("\t\t\t\t\t\t\t\t<img border=\"0\" src=\"/pentaho-style/images/fly-bot-left1.png\" /><br /> \n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("            \t\t\t\t\t<td width=\"100%\" style=\"background-image: url(/pentaho-style/images/fly-bot1.png); background-repeat: repeat-x\">\n");
      out.write("            \t\t\t\t\t\t<img border=\"0\" src=\"/pentaho-style/images/fly-bot1.png\" /><br />\n");
      out.write("            \t\t\t\t\t</td>\n");
      out.write("          \t\t\t\t</tr>\n");
      out.write("      \t\t\t\t</table>\n");
      out.write("      \t\t\t</td>\n");
      out.write("    \t\t\t\t<td valign=\"top\" style=\"padding: 0px 0px 0px 0px; font-size: .85em;\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("  \t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<center>\n");
      out.write("\t\t\t<img border=\"0\" src=\"/pentaho-style/images/pentaho_googlemap_white.png\" style=\"padding-top:5px\"/>\n");
      out.write("\t\t</center>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- define the Google Map area -->\n");
      out.write("    <div id=\"map\" style=\"position:absolute;width: 640px; height: 580px;top:40px;left:350px;border:1px solid #808080\"></div>\n");
      out.write("\n");
 } 
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
