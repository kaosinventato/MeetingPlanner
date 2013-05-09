/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.ingw.meetingplanner.model;

import it.univaq.ingw.meetingplanner.model.imp.UtenteImp;
import java.util.List;

/**
 *
 * @author Daniele
 */
public interface UtenteDataLayer {

   public List<Gruppo> getGruppoByUtente(UtenteImp aThis);
   
}
