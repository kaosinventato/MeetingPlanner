/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.ingw.meetingplanner.model.imp;

import it.univaq.ingw.meetingplanner.model.Gruppo;
import it.univaq.ingw.meetingplanner.model.Utente;
import it.univaq.ingw.meetingplanner.model.UtenteDataLayer;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniele
 */
public class UtenteDataLayerImp extends DataLayerImp implements UtenteDataLayer {
   private PreparedStatement readUserId;
   private PreparedStatement readUserUsername;

   public UtenteDataLayerImp() {
      super();
      
      //Inizializzazione delle query parametriche
      
      //Query per la lettura
      try {
	 readUserId = connection.prepareStatement("SELECT * FROM Utente WHERE idUtente=?");
	 readUserUsername = connection.prepareStatement("SELECT * FROM Utente WHERE username=?");
      } catch (SQLException ex) {
	 Logger.getLogger(UtenteDataLayerImp.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
   @Override
   public Utente createUtente() {
      Utente utente = new UtenteImp(this);
      
      return utente;
   }
   
   @Override
   public List<Gruppo> getGruppoByUtente(UtenteImp aThis) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public Utente readUtente(int idUtente) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public Utente readUtenteFromUsername(String username) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public int deleteUtente(int idUtente) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public int deleteUtente(Utente utente) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public boolean autenticaUtente(String username, String password) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
   
}
