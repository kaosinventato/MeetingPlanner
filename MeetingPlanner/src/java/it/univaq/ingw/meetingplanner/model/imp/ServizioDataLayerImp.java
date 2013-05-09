package it.univaq.ingw.meetingplanner.model.imp;

import it.univaq.ingw.meetingplanner.model.Servizio;
import it.univaq.ingw.meetingplanner.model.ServizioDataLayer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementazione del datalayer associato al servizio.
 *
 * @author Daniele
 */
public class ServizioDataLayerImp extends DataLayerImp 
      implements ServizioDataLayer{
   private PreparedStatement readServizio;
   private PreparedStatement readServizi;
   
   public ServizioDataLayerImp(){
      super();
      
      //Inizializzazione delle query parametriche
      try {
	 readServizio = connection.prepareStatement("SELECT * FROM Servizio WHERE idServizio = ?");
	 readServizi = connection.prepareStatement("SELECT Servizio_idServizio FROM Gruppo_has_Servizio WHERE Gruppo_idServizio = ?");
      } catch (SQLException ex) {
	 Logger.getLogger(ServizioDataLayerImp.class.getName()).log(Level.SEVERE, null, ex);
      }
   }

   @Override
   public Servizio createServizio() {
      Servizio servizio;
      
      servizio = new ServizioImpl(this);
      
      return servizio;      
   }

   @Override
   public Servizio readServizio(int idServizio) {
      //Si assegna il valore alla query parametrica
      //SELECT * FROM Servizio WHERE idServizio = ?
      try {
	 readServizio.setInt(1, idServizio);
      } catch (SQLException ex) {
	 Logger.getLogger(ServizioDataLayerImp.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      //Si esegue la query
      ResultSet rs = null;
      try {
	 rs = readServizio.executeQuery();
      } catch (SQLException ex) {
	 Logger.getLogger(ServizioDataLayerImp.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      //Si genera un nuovo Servizio
      Servizio servizio = null;
      if(rs != null){
	 servizio = new ServizioImpl(this, rs);
      }
      
      return servizio;
   }

   @Override
   public List<Servizio> readServizi(int idGruppo) {
      //Si assegna il valore della variabile della query parametrica
      //SELECT Servizio_idServizio FROM Gruppo_has_Servizio WHERE Gruppo_idServizio = ?
      try {	 
	 readServizi.setInt(1, idGruppo);
      } catch (SQLException ex) {
	 Logger.getLogger(ServizioDataLayerImp.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      //Si esegue la query
      ResultSet rs = null;
      try {
	 rs = readServizi.executeQuery();
      } catch (SQLException ex) {
	 Logger.getLogger(ServizioDataLayerImp.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      //Si recuperano gli idServizi per poi recuperare i servizi
      List<Servizio> servizi = null;
      try {
	 while(rs.next()){
	    int idServizio = 0;
	    Servizio servizio = null;
	    
	    //Recupero dell'idServizio	    
	    idServizio = rs.getInt("Servizio_idServizio");
	    
	    //Recupero del Servizio
	    servizio = this.readServizio(idServizio);
	    
	    //Aggiunta del servizio alla lista
	    servizi.add(servizio);
	 }
      } catch (SQLException ex) {
	 Logger.getLogger(ServizioDataLayerImp.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return servizi;
   }

   @Override
   public int insertServizio(Servizio servizio) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public int updateServizio(Servizio servizio) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public int deleteServizio(Servizio servizio) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public int deleteServizio(int idServizio) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
   
}
