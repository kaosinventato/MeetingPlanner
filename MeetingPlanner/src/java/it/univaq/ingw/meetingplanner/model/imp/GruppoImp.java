package it.univaq.ingw.meetingplanner.model.imp;

import it.univaq.ingw.meetingplanner.model.GruppoDataLayer;
import it.univaq.ingw.meetingplanner.model.Gruppo;
import it.univaq.ingw.meetingplanner.model.Servizio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementazione della interfaccia Gruppo per l'interazione con il database.
 * 
 * @author Alessandro
 * @author Daniele
 */
public class GruppoImp implements Gruppo {
   //<editor-fold desc="Variabili di istanza" defaultstate="collapsed">
   
   /** Identificativo del Gruppo */
   private int idGruppo;
   /** Il nome del gruppo */
   private String nome;
   /** Descrizione del gruppo */
   private String descrizione;
   /** Lista dei servizi associati al gruppo */
   private List<Servizio> servizi = null;
   
   /** Datalayer associato al gruppo */
   private GruppoDataLayer datalayer;
   
   //</editor-fold>
   
   //<editor-fold desc="Costruttori" defaultstate="collapsed">
   
   /**
    * Costruttore per la creazione di una nuova istanza di Gruppo.
    * 
    * @param datalayer - datalayer associato al gruppo
    */
   GruppoImp(GruppoDataLayer datalayer){
      idGruppo = -1;
      nome = "";
      descrizione = "";
      this.datalayer = datalayer;
   }
   
   /**
    * Costruttore di un gruppo, associando i valori al risultato di un resultset.
    * 
    * @param datalayer - datalayer associato al gruppo
    * @param data - resultset dove vengono recuperati i valori
    */
    GruppoImp(GruppoDataLayer datalayer, ResultSet data) {
       this.datalayer = datalayer;
       
       try {
	  idGruppo = data.getInt("idGruppo");
	  nome = data.getString("nome");
	  descrizione = data.getString("descrizione");
       } catch (SQLException ex) {
	  Logger.getLogger(GruppoImp.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    //</editor-fold>

   //<editor-fold desc="Metodi GET" defaultstate="collapsed">
    @Override
    public int getIdGruppo() {
       return idGruppo;
    }
    
    @Override
    public String getNome() {
       return nome;
    }
    
    @Override
    public String getDescrizione() {
       return descrizione;
    }
    
    @Override
    public List<Servizio> getServizi(){
       if (servizi == null){
	  servizi = datalayer.getUtentiByIdGruppo(this.idGruppo);
       }
       return servizi;
   }
   //</editor-fold>
    
   //<editor-fold desc="Metodi SET" defaultstate="collapsed">
   @Override
    public void setIdGruppo(int idGruppo) {
       this.idGruppo = idGruppo;
    }
    
   @Override
    public void setNome(String nome) {
       this.nome = nome;
    }
    
   @Override
    public void setDescrizione(String descrizione) {
       this.descrizione = descrizione;
    }
    
   @Override
    public void setServizi(List<Servizio> servizi){
       this.servizi = servizi;
    }
   //</editor-fold>
}
