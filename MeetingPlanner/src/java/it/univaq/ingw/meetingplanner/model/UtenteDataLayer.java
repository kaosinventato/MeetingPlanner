package it.univaq.ingw.meetingplanner.model;

import it.univaq.ingw.meetingplanner.model.imp.UtenteImp;
import java.util.List;

/**
 * Interfaccia del datalayer associato all'utente.
 * 
 * @author Daniele
 */
public interface UtenteDataLayer {
   /**
    * Restituisce un nuovo Utente.
    * 
    * @return utente - nuovo utente
    */
   public Utente createUtente();
   
   /**
    * Restituisce l'utente associato ad un identificatore.
    * 
    * @param idUtente - identificatore dell'utente
    * @return utente
    */
   public Utente readUtente(int idUtente);
   
   /**
    * Restituisce l'utente associato ad un determinato username.
    * 
    * @param username - username dell'utente
    * @return utente
    */
   public Utente readUtenteFromUsername(String username);
   
   /**
    * Cancella l'utente associato ad un identificatore.<br />
    * Viene restituito il numero di record eliminati.
    * 
    * @param idUtente - identificatore dell'utente
    * @return record eliminati
    */
   public int deleteUtente(int idUtente);
   
   /**
    * Cancella l'utente associato all'utente passato come parametro.<br />
    * Viene restituito il numero di record eliminati.
    * 
    * @param utente - l'utente che si desidera eliminare
    * @return record eliminati
    */
   public int deleteUtente(Utente utente);
   
   /**
    * Autentica l'accesso di un utente. <br />
    * Viene restituito true se la combinazione username/password corrisponde.
    * 
    * @param username - nome utente
    * @param password -password di autenticazione
    * @return true | false
    */
   public boolean autenticaUtente(String username, String password);
   
   public List<Gruppo> getGruppoByUtente(UtenteImp aThis);
   
}
