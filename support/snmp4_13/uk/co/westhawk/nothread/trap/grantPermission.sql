rem
rem NAME
rem      $RCSfile: grantPermission.sql,v $
rem DESCRIPTION
rem      [given below]
rem DELTA
rem      $Revision: 1.1 $
rem      $Author: birgit $
rem CREATED
rem      $Date: 2002/10/15 13:37:02 $
rem COPYRIGHT
rem      Westhawk Ltd
rem TO DO
rem

rem
rem Run this as the Oracle system or dba user.
rem Only they are allowed to grant these permissions to SCOTT.
rem

CALL dbms_java.grant_permission(
  'SCOTT',
  'java.net.SocketPermission',
  '*',
  'accept,listen,connect,resolve');

show errors;

quit;

