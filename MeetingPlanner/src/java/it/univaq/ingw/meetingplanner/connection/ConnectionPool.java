/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.ingw.meetingplanner.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Alessandro
 */
public class ConnectionPool {
	private static ConnectionPool pool = null;
	private Vector<Connection> free;
	private String url;
	private String driver;
	private String user;
	private String pass;
	
	private ConnectionPool () throws ConnectionPoolException {
		free = new Vector<Connection>();
		loadParameters();
		loadDriver();
	}
	
	private void loadParameters() {
		url = "jdbc:mysql://localhost/testing";
		driver = "com.mysql.jdbc.Driver";
		user = "root";
		pass = "%D1jkstr4%";
	}
	
	private void loadDriver(){
		try {
			Class.forName(this.driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public synchronized Connection getConnection() throws ConnectionPoolException {
			Connection con;
			if (this.free.size()>0){
				con = (Connection) free.firstElement();
				free.removeElementAt(0);
				try {
					if (con.isClosed()){
						con = getConnection();
					}
				} catch (SQLException e) {
					con = getConnection();
				}
			} else {
				con = newConnection();
			}
			return con;
	}
		
		private Connection newConnection() throws ConnectionPoolException {
			Connection con = null;
			try {
				con = DriverManager.getConnection(this.url,this.user,this.pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
	
	public static synchronized ConnectionPool getConnectionPool() throws ConnectionPoolException {
		if (pool == null){
			pool = new ConnectionPool();
		}
		return pool;
	}
	
	public synchronized void relaseConnection(Connection con){
		free.add(con);
	}

}