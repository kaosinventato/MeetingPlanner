/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.ingw.meetingplanner.model.imp;

import it.univaq.ingw.meetingplanner.model.Gruppo;
import it.univaq.ingw.meetingplanner.model.Utente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alessandro
 */
public class UtenteImp implements Utente {
    private int idUtente;
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private List<Gruppo> gruppo = null;
    private UtenteDataLayerImp datalayer;
    
    UtenteImp(UtenteDataLayerImp datalayer){
        idUtente = -1;
        nome = "";
        cognome = "";
        username = "";
        password = "";
        this.datalayer = datalayer;
    }
    
    UtenteImp(UtenteDataLayerImp datalayer, ResultSet data) throws SQLException {
    this.datalayer = datalayer;
    idUtente = data.getInt("idUtente");
    nome = data.getString("nome");
    cognome = data.getString("cognome");
    username = data.getString("username");
    password = data.getString("password");
    }

    public int getIdUtente() {
	return idUtente;
    }

    public void setIdUtente(int idUtente) {
	this.idUtente = idUtente;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getCognome() {
	return cognome;
    }

    public void setCognome(String cognome) {
	this.cognome = cognome;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }   
    
    public List<Gruppo> getGruppo(){
	    if (gruppo == null){
		gruppo =  datalayer.getGruppoByUtente(this);
	    }
	    return gruppo;
    }
    
    public void setGruppo(List<Gruppo> gruppo){
	this.gruppo = gruppo;
    }
    
}
