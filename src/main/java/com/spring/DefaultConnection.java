package com.spring;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DefaultConnection {
	
	public DefaultConnection() {
		try{
			Context initContext = (Context) new InitialContext();
			Context webContext = (Context) initContext.lookup("java:/comp/env");
		
			DataSource ds = (DataSource) webContext.lookup("jdbc/ATPLQuizz");
			Connection dbCon = ds.getConnection();
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
