@echo off
setlocal
cd /D %~dp0
call set-pentaho-env.bat "%~dp0jre"

cd tomcat\bin
set CATALINA_HOME=%~dp0tomcat
set JAVA_HOME=%_PENTAHO_JAVA_HOME%
shutdown.bat
endlocal
exit
