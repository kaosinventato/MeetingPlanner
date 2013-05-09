package it.univaq.ingw.meetingplanner.model;

import java.util.List;

/**
 * Interfaccia per interagire con il concetto di Gruppo.
 * 
 * @author Daniele
 */
public interface Gruppo {
   //<editor-fold desc="Metodi GET" defaultstate="collapsed">
   
   /**
    * Restituisce l'identificativo del gruppo.
    * 
    * @return idGruppo - identificativo del gruppo
    */
   public int getIdGruppo();
   
   /**
    * Restituisce il nome del gruppo.
    * 
    * @return  nome - nome del gruppo
    */
   public String getNome();
   
   /**
    * Restituisce la descrizione del gruppo.
    * 
    * @return descrizione - descrizione del gruppo
    */
   public String getDescrizione();
   
   /**
    * Restituisce la lista dei servizi associati al gruppo.
    * 
    * @return servizi - i servizi associati al gruppo
    */   
   public List<Servizio> getServizi();
   
   //</editor-fold>
   
   //<editor-fold desc="Metodi GET" defaultstate="collapsed">
   
   /**
    * Assegna l'identificativo del gruppo.
    * 
    * @param idGruppo - identificativo del gruppo
    */
   public void setIdGruppo(int idGruppo);
   
   /**
    * Assegna il nome del gruppo.
    * 
    * @param nome - nome del gruppo
    */
   public void setNome(String nome);
   
   /**
    * Assegna la descrizione del gruppo.
    * 
    * @param descrizione - descrizione del gruppo
    */
   public void setDescrizione(String descrizione);
   
   /**
    * Assegna la lista dei servizi del gruppo.
    * 
    * @param servizi - lista dei servizi associati al gruppo
    */
   public void setServizi(List<Servizio> servizi);
    
   //</editor-fold>
}
