/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.ingw.meetingplanner.model.imp;

import it.univaq.ingw.meetingplanner.connection.ConnectionPool;
import it.univaq.ingw.meetingplanner.connection.ConnectionPoolException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniele
 */
class DataLayerImp {
   protected Connection connection = null;

   @SuppressWarnings("OverridableMethodCallInConstructor")
   public DataLayerImp() {
      this.connection = getConnection();
   }
   
   /**
    * Restituisce la connessione con il database.
    * 
    * @return connection - connessione con il database
    */
   protected Connection getConnection(){
        if(connection == null){
	   //Connessione non inizializzata
	   try {
	      ConnectionPool cp = null;
	      cp = ConnectionPool.getConnectionPool();
	      connection = cp.getConnection();
	   } catch (ConnectionPoolException ex) {
	      Logger.getLogger(DataLayerImp.class.getName()).log(Level.SEVERE, null, ex);
	   }
	}
	
	//Viene restituita la connessione 
	return connection;
    }
    
}
