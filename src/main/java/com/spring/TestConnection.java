package com.spring;

import java.sql.Connection;

public class TestConnection {
	
	public static void main(String[] args) {
		
		DefaultConnection defaultConnection = new DefaultConnection();
		
		Connection con = defaultConnection.getJNDIConnection();
		
		if (con == null){
			System.out.println("no connection");
		} else{
			System.out.println("con ok");
		}
	}
}