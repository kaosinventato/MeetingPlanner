package it.univaq.ingw.meetingplanner.model;

/**
 * Interfaccia per gestire con il concetto di Servizio.
 * 
 * @author Daniele
 */
public interface Servizio {
   //<editor-fold desc="Metodi GET" defaultstate="collapsed">
   
   /**
    * Resituisce l'identificativo del servizio.
    * 
    * @return idServizio - identificativo del servizio
    */
   public int getIdServizio();
   
   /**
    * Restituisce il nome del servizio.
    * 
    * @return nome - nome del servizio
    */   
   public String getNome();
   
   /**
    * Restituisce la descrizione del servizio.
    * 
    * @return descrizione - descrizione del servizio
    */   
   public String getDescrizione();
   
   //</editor-fold>
   
   //<editor-fold desc="Metodi SET" defaultstate="collapsed">
   
   /**
    * Assegna l'identificativo del servizio.
    * 
    * @param idServizio - identificativo del servizio
    */
   public void setIdServizio(int idServizio);
   
   /**
    * Assegna il nome del servizio.
    * 
    * @param nome - nome del servizio
    */
   public void setNome(String nome);
   
   /**
    * Assegna la descrizione al servizio.
    * 
    * @param descrizione - descrizione del servizio
    */
   public void setDescrizione(String descrizione);
    
}
