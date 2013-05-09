package it.univaq.ingw.meetingplanner.model.imp;

import it.univaq.ingw.meetingplanner.model.Gruppo;
import it.univaq.ingw.meetingplanner.model.Utente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementazione della interfaccia Utente per la interazione con il database.
 *
 * @author Alessandro
 * @author Daniele
 */
public class UtenteImp implements Utente {
   //<editor-fold desc="Variabili di istanza" defaultstate="collapsed">
   
   /** Identificativo dell'utente. */
   private int idUtente;   
   /** Il nome dell'utente. */
   private String nome;   
   /** Il cognome dell'utente. */
   private String cognome;   
   /** L'username dell'utente. */
   private String username;   
   /** I gruppi a cui è associato l'utente. */
   private List<Gruppo> gruppi = null;   
   
   /** Il datalayer associato all'utente. */
   private UtenteDataLayerImp datalayer;
   
   //</editor-fold>
   
   //<editor-fold desc="Costruttori" defaultstate="collapsed">
   
   /**
    * Costruttore di un nuovo Utente.
    * 
    * @param datalayer - datalayer associato all'utente
    */
   UtenteImp(UtenteDataLayerImp datalayer){
      idUtente = -1;
      nome = "";
      cognome = "";
      username = "";
      this.datalayer = datalayer;
   }
   
   /**
    * Costruttore di un utente, caricando i valori da un resultset.
    * 
    * @param datalayer - datalyer associato all'utente
    * @param data - resultset dove si recuperano i valori
    */
   UtenteImp(UtenteDataLayerImp datalayer, ResultSet data) {
      this.datalayer = datalayer;
      
      try {	 
	 idUtente = data.getInt("idUtente");
	 nome = data.getString("nome");
	 cognome = data.getString("cognome");
	 username = data.getString("username");
      } catch (SQLException ex) {
	 Logger.getLogger(UtenteImp.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodi GET">
    
    @Override
    public int getIdUtente() {
	return idUtente;
    }
    
    @Override
    public String getNome() {
	return nome;
    }
    
    @Override
    public String getCognome() {
       return cognome;
    }
    
    @Override
    public String getUsername() {
       return username;
    }
    
    @Override
    public List<Gruppo> getGruppo(){
       if (gruppi == null){
	  gruppi =  datalayer.getGruppoByUtente(this);
       }
       return gruppi;
    }
    
    //</editor-fold>

    //<editor-fold desc="Metodi SET" defaultstate="collapsed">
    
    @Override
    public void setIdUtente(int idUtente) {
	this.idUtente = idUtente;
    }
    
    @Override
    public void setNome(String nome) {
       this.nome = nome;
    }
    
    @Override
    public void setCognome(String cognome) {
       this.cognome = cognome;
    }
    
    @Override
    public void setUsername(String username) {
       this.username = username;
    }
    
    @Override
    public void setGruppo(List<Gruppo> gruppi){
       this.gruppi = gruppi;
    }
    
    //</editor-fold>
}
