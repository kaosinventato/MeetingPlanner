package it.univaq.ingw.meetingplanner.model;

import java.util.List;

/**
 * Interfaccia del datalyer associato a 'Servizio'.
 *
 * @author Daniele
 */
public interface ServizioDataLayer {
   
   /**
    * Restituisce una nuova istanza di Servizio.
    * 
    * @return servizio
    */
   public Servizio createServizio();
   
   /**
    * Restituisce il servizio associato all'identificatore.
    * 
    * @param idServizio - identificatore del servizio
    * @return servizio
    */
   public Servizio readServizio(int idServizio);
   
   /**
    * Restituisce la lista dei servizi associati ad un certo gruppo.
    * 
    * @param idGruppo - identificatore del gruppo
    * @return servizi - lista dei servizi associati al gruppo
    */
   public List<Servizio> readServizi(int idGruppo);
   
   /**
    * Inserisce i valori di servizio sul database.<br />
    * Restituisce il numero di record scriti.
    * 
    * @param servizio - servizio da memorizzare
    * @return  numero di record scritti
    */
   public int insertServizio(Servizio servizio);
   
   /**
    * Aggiorna servizio sul database.
    * 
    * @param servizio - il servizio da aggionare
    * @return numero di record aggiornati
    */
   public int updateServizio(Servizio servizio);
   
   /**
    * Cancella un servizio dal database. <br/>
    * Restituisce il numero di record cancellati.
    *     
    * @param servizio - servizio da cancellare
    * @return record cancellati
    */
   public int deleteServizio(Servizio servizio);
   
   /**
    * Cancella il servizio associato all'identificatore dal database.<br />
    * Restituisce il numero di record cancellati.
    * 
    * @param idServizio - identificatore del servizio
    * @return record eliminati
    */
   public int deleteServizio(int idServizio);
   
}
