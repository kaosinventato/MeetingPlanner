/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.ingw.meetingplanner.model.impl;

import it.univaq.ingw.meetingplanner.model.Gruppo;
import it.univaq.ingw.meetingplanner.model.Utente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alessandro
 */
public class GruppoImp implements Gruppo {
    private int idGruppo;
    private String nome;
    private String descrizione;
    private List<Servizio> servizi = null;
    private GruppoDataLayerImp datalayer;
    
    GruppoImp(GruppoDataLayerImp datalayer){
	idGruppo = -1;
	nome = "";
	descrizione = "";
	this.datalayer = datalayer;
    }
    
    GruppoImp(GruppoDataLayerImp datalayer, ResultSet data) throws SQLException{
	this.datalayer = datalayer;
	idGruppo = data.getInt("idGruppo");
	nome = data.getString("nome");
	descrizione = data.getString("descrizione");
    }

    public int getIdGruppo() {
	return idGruppo;
    }

    public void setIdGruppo(int idGruppo) {
	this.idGruppo = idGruppo;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getDescrizione() {
	return descrizione;
    }

    public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
    }

    public GruppoDataLayerImp getDatalayer() {
	return datalayer;
    }

    public void setDatalayer(GruppoDataLayerImp datalayer) {
	this.datalayer = datalayer;
    }
    
   public List<Servizio> getServizi(){
       if (servizi == null){
	   servizi = datalayer.getUtentiByGruppo(this);
       }
       return servizi;
   } 
   
   public void setServizi(List<Servizio> servizi){
       this.servizi = servizi;
   }
}
