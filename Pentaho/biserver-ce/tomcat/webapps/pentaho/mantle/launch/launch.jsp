<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core'%><%@
    page
  language="java"
  import="java.io.InputStream,
      java.util.Map,
      java.util.HashMap,
      java.util.List,
      java.util.ArrayList,
      java.util.Locale,
      java.util.PropertyResourceBundle,
      java.util.ResourceBundle,
      java.util.regex.Pattern,
      java.util.regex.Matcher,
      org.pentaho.platform.util.messages.LocaleHelper,
      org.pentaho.platform.api.engine.IPentahoSession,
      org.pentaho.platform.api.engine.IPluginManager,
      org.pentaho.platform.api.repository.ISolutionRepository,
      org.pentaho.platform.engine.core.system.PentahoSystem,
      org.pentaho.platform.engine.core.system.StandaloneSession,
      org.pentaho.platform.util.logging.Logger,
      org.pentaho.platform.web.jsp.messages.Messages,
      org.pentaho.platform.web.http.PentahoHttpSessionHelper,
      org.apache.commons.lang.StringEscapeUtils"%>
<%
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
%>

<%@page import="org.pentaho.ui.xul.XulOverlay"%>
<%@page import="org.pentaho.platform.api.engine.IPluginManager"%><html>
<head>
<meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">


<title><%=Messages.getString("UI.PUC.LAUNCH.TITLE")%></title>

<style type="text/css">
<!--
body {
  color: #000000;
  background-color: #FFFFFF;
  margin: 0px;
}

p {
  margin: 0px;
  padding: 0px;
}

A:link,A:visited,A:hover {
  color: #7e932f;
  text-decoration: underline;
}

A:hover {
  color: #ca6333;
  text-decoration: underline;
}

.launchPanel {
  background-color: white;
  background-image: url(images/quicklaunch_bg.png);
  background-repeat: no-repeat;
  background-position: center;
  height: 100%;
}

.ql_container {
  width: 620px;
  margin-bottom: 50px;
}

.ql_icon_bar_left {
  width: 41px;
  height: 147px;
  vertical-align: top;
  padding-top: 25px;
}

.ql_icon_bar_middle {
  background-image:
    url(images/ql_icon_bar_middle.png);
  background-repeat: repeat-x;
  width: 100%;
  height: 199px;
}

.ql_icon_bar_right {
  width: 41px;
  height: 147px;
  vertical-align: top;
  padding-top: 25px;
}

.ql_spacer {
  width: 20px;
}

.ql_btn {
  width: 167px;
}

.ql_btn_left {
  width: 41px;
  height: 56px;
}

.ql_btn_middle {
  background-image: url(images/ql_btn_middle.png);
  background-repeat: repeat-x;
  width: 100%;
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  font-size: 1.25em;
  line-height: 20px;
  font-weight: 300;
  text-align: center;
  vertical-align: top;
  white-space: nowrap;
  padding-top: 5px;
}

.ql_btn_right {
  width: 41px;
  height: 56px;
}

.ql_btn_left_hover {
  width: 41px;
  height: 56px;
}

.ql_btn_middle_hover {
  background-image:
    url(images/ql_btn_middle_hover.png);
  background-repeat: repeat-x;
  width: 100%;
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  font-size: 1.25em;
  line-height: 20px;
  font-weight: 300;
  text-align: center;
  vertical-align: top;
  white-space: nowrap;
  padding-top: 5px;
}

.ql_btn_right_hover {
  width: 41px;
  height: 56px;
}

.ql_btn_cntr {
  width: 120px;
  height: 130px;
  padding-bottom: 13px;
  cursor: pointer;
}

.ql_logo {
  width: 290px;
  height: 91px;
  padding-bottom: 30px;
}

.button {
  cursor: pointer;
  width: 167px;
  padding: 0px;
  spacing: 0px;
  height: 56px;
}

.btn_left {
  background-image: url("images/ql_btn_left.png");
  background-repeat: no-repeat;
  height: 56px;
  width: 22px;
}

.btn_right {
  background-image: url("images/ql_btn_right.png");
  background-repeat: no-repeat;
  height: 56px;
  width: 22px;
}

.btn_center {
  background-image: url(images/ql_btn_middle.png);
  background-repeat: repeat-x;
  width: 100%;
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  font-size: 1.25em;
  line-height: 20px;
  font-weight: 300;
  text-align: center;
  vertical-align: top;
  white-space: nowrap;
  padding-top: 5px;
}

.btn_left_hover {
  background-image:
    url("images/ql_btn_left_hover.png");
  background-repeat: no-repeat;
  height: 56px;
  width: 22px;
}

.btn_right_hover {
  background-image:
    url("images/ql_btn_right_hover.png");
  background-repeat: no-repeat;
  height: 56px;
  width: 22px;
}

.btn_center_hover {
  background-image:
    url(images/ql_btn_middle_hover.png);
  background-repeat: repeat-x;
  width: 100%;
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  font-size: 1.25em;
  line-height: 20px;
  font-weight: 300;
  text-align: center;
  vertical-align: top;
  white-space: nowrap;
  padding-top: 5px;
}
-->
</style>
<script language='javascript' src='../../content/data-access/resources/gwt/DatasourceEditor.nocache.js'></script>

<script type="text/javascript">
var hadDatasourceAccess = false;
Button = function(label, command, container, lastBtn, src){
	
	var tableRow1 =document.getElementById("buttonRow1");
	var tableRow2 =document.getElementById("buttonRow2");

	var newTd = document.createElement("td");
	newTd.setAttribute("align", "center");
	newTd.setAttribute("valign", "top");
	newTd.setAttribute("onclick", "window.parent."+command);
	newTd.setAttribute("class", "ql_btn_cntr");
	
	var launchImg = document.createElement("img");
	launchImg.setAttribute("src", src);
	launchImg.setAttribute("class","ql_btn_cntr");
	newTd.appendChild(launchImg);
	
	
	tableRow1.appendChild(newTd);
	
	var newTd2 = document.createElement("td");
	
	tableRow1.appendChild(newTd2);
	
	
  
   	newTd = document.createElement("td");
	newTd.setAttribute("height", "100%");
	tableRow2.appendChild(newTd);
	
	newTd2 = document.createElement("td");
	var img = document.createElement("img");
	img.setAttribute("src","images/ql_spacer.png");
	img.setAttribute("class", "ql_spacer");
	newTd2.appendChild(img);
	if (lastBtn == "false") {
		tableRow2.appendChild(newTd2);
	}
	
    var btn = document.createElement("input");
    btn.setAttribute("type","button");


    table = document.createElement("table");
    newTd.appendChild(table);
    
    table.setAttribute("cellpadding","0");
    table.setAttribute("cellspacing","0");
    table.setAttribute("border","0");
    table.className="button";
    table.setAttribute("height","56");
    table.setAttribute("width","167");
    table.cellSpacing = "0px";
    table.cellPadding = "0px";

    var tbody = document.createElement("tbody");
    
    var tr = document.createElement("tr");

    var left_td = document.createElement("td");
    left_td.className="btn_left";
    left_td.innerHTML = "<img src='images/ql_spacer.png'/ width='22' height='1'/><br/>";
    tr.appendChild(left_td);

    var center_td = document.createElement("td");
    center_td.setAttribute("width","100%");
    center_td.className="btn_center";
    center_td.onselectstart=function(){return false;}
    center_td.style.MozUserSelect='none';
    center_td.innerHTML = label;
    tr.appendChild(center_td);

    var right_td = document.createElement("td");
    right_td.innerHTML = "<img src='images/ql_spacer.png'/ width='22' height='1'/><br/>";
    right_td.className="btn_right";
    tr.appendChild(right_td);
    tbody.appendChild(tr);
    
    table.appendChild(tbody);

    table.onmouseover=function(){
      window.selectedButton = this;
      left_td.className="btn_left_hover";
      right_td.className="btn_right_hover";
      center_td.className="btn_center_hover";
    };
    this.reset = function(){
      left_td.className="btn_left";
      right_td.className="btn_right";
      center_td.className="btn_center";
    }
    
    table.onmouseout = this.reset;
    
    this.onClick=function(onClick){
      if(window.parent && window.parent.mantle_initialized){
        table.onclick = function(){eval("window.parent." + onClick)};
      }
    };
}

window.onresize = function(){
  if(window.selectedButton){
     window.selectedButton.onmouseout();
  }
  
    
  // IE_6_FIX: When resized by PUC, IE will display rendering issues. This is accounted for by the code below. 
  if(window.isIE6){
    
    // IE6 has a rate limit on the number of resize events that it will fire. This means we cannot rely on the
    // resize event alone to determine when the reisize is complete. The timer ensures that the layout is
    // recomputed after PUC is done resizing the iframe.
    setTimeout(function(){
      window.tableWrapperDiv.style.top = "1px";
      window.tableWrapperDiv.style.top = "0px";
    }, 350);
    
  }

}

function loader() {
  initDataAccess(hadDatasourceAccess);
}

function initDataAccess(hasAccess) {
  hadDatasourceAccess = hasAccess;
  
  // Clear any existing buttons (buttonRow1 = icons,  buttonRow2 = labels)
  var aButtonRow = document.getElementById("buttonRow1");
  while (aButtonRow.firstChild) {
  	aButtonRow.removeChild(aButtonRow.firstChild);
  }
  aButtonRow = document.getElementById("buttonRow2");
  while (aButtonRow.firstChild) {
  	aButtonRow.removeChild(aButtonRow.firstChild);
  }
  
  
  // IE_6_FIX: We're using a CSS filter to enable transparany in IE 6. This has the side-effect of trapping mouse events in the
  // filtered area. The standard workaround is to wrap that area in two divs, one absolutely positioned inside a relative one.

  var navAgent = window.navigator.userAgent;
  window.isIE6 = false;
  var reg = new RegExp("MSIE ([0-9]{1,}[\.0-9]{0,})").exec(navAgent)
  if (reg != null) {
    var version = parseFloat( RegExp.$1 );
    window.isIE6 = version >= 6.0 && version < 7.0;
  }

  // The following wrapps the button table with two DIVs, one positioned relative and the other absolute.
  if(window.isIE6){
    var buttonTable = document.getElementById("buttonTable");
    var parent = buttonTable.parentNode;
    window.tableWrapperDiv = document.createElement("div");
    var absDiv = document.createElement("div");
    
    with(tableWrapperDiv.style){
      position = "relative";
      width = "100%";
      height = "100%";
    }
    with(absDiv.style){
      position = "absolute";
      top = "0px";
      left = "0px";
    }
    
    parent.removeChild(buttonTable);
    parent.appendChild(tableWrapperDiv);
    tableWrapperDiv.appendChild(absDiv);
    absDiv.appendChild(buttonTable);
    tableWrapperDiv.id = "buttonWrapperDiv";
  }
  // End IE_6_FIX
<%!
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
%><% 
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
%>
	  if (hasAccess) {
<%
		ButtonInfo info = buttonOverlays.get(buttonId);
%>      new Button("<%=info.buttonLabel%>", "<%=info.buttonCommand%>","<%=buttonId%>", "<%=lastBtn%>", "<%=info.buttonImage %>").onClick("<%= info.buttonCommand%>");
  	  }
<%
  	} else {
      ButtonInfo info = buttonOverlays.get(buttonId);
%>    new Button("<%=info.buttonLabel%>", "<%=info.buttonCommand%>","<%=buttonId%>", "<%=lastBtn%>", "<%=info.buttonImage %>").onClick("<%= info.buttonCommand%>");
<%
    }
    y++;
  }
%>
  fixPNGs();
}

</script>
  <script type="text/javascript" src="../pngfix.js"></script>
  <script type="text/javascript">
      PngFix.spacerURL = "images/ql_spacer.png";
  </script>
</head>

<body onLoad="loader()">

<div style="margin: 0px; padding: 0px; width: 100%; height: 100%;">
<table style="width: 100%; height: 100%;" class="launchPanel" id="launchPanel"
  cellpadding="0" cellspacing="0">
  <tr>
    <td style="vertical-align: middle;" align="center">

    <table width="<%= 188 * buttonIds.size() %>" border="0" align="center" cellpadding="0"
      cellspacing="0" class="ql_container">
      <tr>
        <td colspan="<%= buttonIds.size() %>" align="center"><img
          src="images/ql_logo.png" alt="Pentaho.com"
          class="ql_logo" /></td>
      </tr>
      <tr>
        <td class="ql_icon_bar_left"><img
          src="images/ql_icon_bar_left.png" width="41"
          height="147" /></td>
        <td class="ql_icon_bar_middle" >

            <table id="buttonTable" width="100%" border="0" cellspacing="0" cellpadding="0"
              height="100%">
              <tr id="buttonRow1">
              </tr>
              <tr id="buttonRow2">
              </tr>
          </table>
        </td>
        <td class="ql_icon_bar_right"><img
          src="images/ql_icon_bar_right.png"
          width="41" height="147" /></td>
      </tr>
    </table>
    </td>
  </tr>
</table>
</div>

</body>
</html>
