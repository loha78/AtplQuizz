package com.spring;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;

import com.application.Application;

public class DefaultConnection {
	
	private static Log log = LogFactory.getLog(Application.class);


	/** Uses JNDI and Datasource (preferred style).   */
	public Connection getJNDIConnection(){
	    String DATASOURCE_CONTEXT = "java:comp/env/jdbc/dataSource";
	
	Connection result = null;
	try {
	  Context initialContext = new InitialContext();
	  if ( initialContext == null){
	    log.info("JNDI problem. Cannot get InitialContext.");
	  }
	  DataSource datasource = (DataSource)initialContext.lookup(DATASOURCE_CONTEXT);
	  if (datasource != null) {
	    result = datasource.getConnection();
	  }
	  else {
	    log.info("Failed to lookup datasource.");
	  }
	}
	catch ( NamingException ex ) {
	  log.info("Cannot get connection: " + ex);
	}
	catch(SQLException ex){
	  log.info("Cannot get connection: " + ex);
	}
	return result;
	}
}
