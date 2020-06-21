package com.gslab.spring.dao;

public class DatabaseServer {

	private String connectionURL;
	
	public DatabaseServer(final String connectionURL) {
		this.connectionURL = connectionURL;
	}

	@Override
	public String toString() {
		return "DatabaseServer [connectionURL=" + connectionURL + "]";
	}
	
}
