package it.univaq.ingw.meetingplanner.model.imp;

import it.univaq.ingw.meetingplanner.model.Servizio;
import it.univaq.ingw.meetingplanner.model.ServizioDataLayer;
import java.sql.ResultSet;

/**
 * Implementazione dell'interfaccia di Servizio per poter 
 * interagire con il database.
 *
 * @author Daniele
 */
public class ServizioImpl implements Servizio{
   //<editor-fold desc="Variabili di istanza" defaultstate="collapsed">
   
   /** Identificativo del Servizio */
   private int idServizio;
   /** Nome del servizio */
   private String nome;
   /** Descrizione del servizio */
   private String descrizione;
   
   /** Datalayer associato a servizio */
   private ServizioDataLayer datalayer;
   
   //</editor-fold>
   
   //<editor-fold desc="Costruttori" defaultstate="collapsed">
   
   /**
    * Costruttore per una nuova istanza di Servizio.
    * 
    * @param datalayer - datalayer associato a gruppo
    */
   public ServizioImpl(ServizioDataLayer datalayer) {
      this.idServizio = 0;
      this.nome = "";
      this.descrizione = "";
      
      this.datalayer = datalayer;
   }
   
   /**
    * Costruttore per una nuova istanza di Servizio, 
    * associando i valori da un risultato di un ResultSet
    * 
    * @param datalayer - datalyer associato al servizio
    * @param data - risultato del datalayer
    */
   public ServizioImpl(ServizioDataLayer datalayer, ResultSet data) {
      this.datalayer = datalayer;
   }
   
   //</editor-fold>
   
   //<editor-fold desc="Metodi GET" defaultstate="collapsed">
   
   @Override
   public int getIdServizio() {
      return idServizio;
   }
   
   @Override
   public String getNome() {
      return nome;
   }
   
   @Override
   public String getDescrizione() {
      return descrizione;
   }
   //</editor-fold>
   
   //<editor-fold desc="Metodi SET" defaultstate="collapsed">
   
   @Override
   public void setIdServizio(int idServizio) {
      this.idServizio = idServizio;
   }
   
   @Override
   public void setNome(String nome) {
      this.nome = nome;
   }
   
   @Override
   public void setDescrizione(String descrizione) {
      this.descrizione = descrizione;
   }
   
   //</editor-fold>
   
}
