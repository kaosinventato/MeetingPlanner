package it.univaq.ingw.meetingplanner.model;

import it.univaq.ingw.meetingplanner.model.imp.GruppoImp;
import java.util.List;

/**
 *
 * @author Daniele
 */
public interface GruppoDataLayer {

   public List<Servizio> getUtentiByIdGruppo(int idGruppo);
   
}
