package it.univaq.ingw.meetingplanner.model;

import java.util.List;

/**
 *
 * @author Daniele
 */
public interface Utente { 
   //<editor-fold desc="Metodi GET" defaultstate="collapsed">
   
   /**
    * Restiuisce l'identificativo dell'utente.
    * 
    * @return idUtente - identificativo dell'utente
    */
   public int getIdUtente();
   
   /**
    * Restituisce il nome dell'utente.
    * 
    * @return nome - nome dell'utente
    */
   public String getNome();
   
   /**
    * Restituisce il cognome dell'utente.
    * 
    * @return cognome - cognome dell'utente
    */ 
   public String getCognome();
   
   /**
    * Restituisce l'username dell'utente.
    * 
    * @return username - username dell'utente
    */
   public String getUsername();
   
   /**
    * Restituisce la lista dei gruppi a cui è associato l'utente.
    * 
    * @return gruppi - lista dei gruppi
    */
   public List<Gruppo> getGruppo();
   
   //</editor-fold>
   
   //<editor-fold desc="Metodi SET" defaultstate="collapsed">
   
   /**
    * Assegna l'identificativo dell'utente.
    * 
    * @param idUtente - identificativo dell'utente
    */
   public void setIdUtente(int idUtente);
   
   /**
    * Assegna il nome dell'utente.
    * 
    * @param nome - nome dell'utente
    */
   public void setNome(String nome);
   
   /**
    * Assegna il cognome dell'utente.
    * 
    * @param cognome - cognome dell'utente
    */
   public void setCognome(String cognome);
   
   /**
    * Assegna il nome utente dell'utente.
    * 
    * @param username - username dell'utente
    */
   public void setUsername(String username);
   
   /**
    * Assegna la lista dei gruppi a cui è associato l'utente.
    * 
    * @param gruppi - gruppi a cui è associato l'utente
    */
   public void setGruppo(List<Gruppo> gruppi);  
   
   //</editor-fold>
}
